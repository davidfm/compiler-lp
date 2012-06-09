/**
    Copyright (C) 2012  David Fernández

	LICENSE:	

    This file is part of compiler-lp.

    compiler-lp is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    compiler-lp is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with compiler-lp.  If not, see <http://www.gnu.org/licenses/>.

	@author David Fernández <davidfm[at]linux[dot]com>
	@license http://www.gnu.org/licenses
	@copyright 2012 David Fernández
	
 */

package es.davidfm.compiler.ast.statement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import es.davidfm.compiler.ast.expression.BinaryExpression;
import es.davidfm.compiler.ast.expression.Expression;

/**
 * This class represents an IF-THEN-ELSE instruction
 */
public class IfStatement extends Statement {

	private int counter;
	private Expression condition;
	private Statement thenInstructions;
	private Statement elseInstructions;
	private final List<String> validOps = Arrays.asList(">", "<", "==", "!=",
			"<=", ">=");

	public IfStatement(int counter, Expression condition,
			Statement thenInstructions, Statement elseInstructions) {
		
		if (!validOps.contains(condition.getOp())
				&& !condition.getType().equals("int")) {

			System.out
					.println("Error. This type of expression cannot be a condition");
			System.out.println("Analysis terminated");
			System.exit(1);

		}
		
		this.counter = counter;
		this.condition = condition;
		this.thenInstructions = thenInstructions;
		this.elseInstructions = elseInstructions;
		
	}
	
	

	public int getCounter() {
		return counter;
	}



	public Expression getCondition() {
		return condition;
	}



	public Statement getThenInstructions() {
		return thenInstructions;
	}



	public Statement getElseInstructions() {
		return elseInstructions;
	}
	
	
	public String toString(){
		
		return "IF("+condition+")THEN{"+thenInstructions+"}ELSE{"+elseInstructions+"}";
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see es.davidfm.compiler.ast.statement.Statement#toCode()
	 */
	@Override
	public ArrayList<String> toCode() {
		ArrayList<String> output = new ArrayList<String>();
		
		
		if (condition.getClass().equals(BinaryExpression.class)){
			
			BinaryExpression aux = (BinaryExpression) condition;
			
			int left = aux.getLeft().getMemoryAddress();
			int right = aux.getRight().getMemoryAddress(); 
			
			output.add("");
			output.addAll(aux.getLeft().toCode());
			output.add("#left");
			output.add("lw $s2, "+left+"($gp)");
			output.addAll(aux.getRight().toCode());
			output.add("#right");
			output.add("lw $s3, "+right+"($gp)");
			
			
		}
		
		
		
		output.add("");	
		
		
		if (this.condition.getOp().equals(">")){
			
			output.add("ble $s2, $s3, ELSE"+counter);
			
		} else if(this.condition.getOp().equals("<")) {
			
			output.add("bge $s2, $s3, ELSE"+counter);
			
		} else if (this.condition.getOp().equals(">=")){
			
			output.add("blt $s2, $s3, ELSE"+counter);
			
		} else if (this.condition.getOp().equals("<=")){
			
			output.add("bgt $s2, $s3, ELSE"+counter);
			
		} else if (this.condition.getOp().equals("==")){
		
			output.add("bne $s2, $s3, ELSE"+counter);
			
		} else {
			
			output.add("beq $s2, $s3, ELSE"+counter);
		}
		
			
		
		output.addAll(this.getThenInstructions().toCode());
		
		output.add("");
		output.add("j NEXT"+counter);
		output.add("");
		output.add("ELSE"+counter+":");
		output.addAll(this.getElseInstructions().toCode());
		output.add("");
		output.add("NEXT"+counter+":");
		output.add("");
		
		return output;
	}
		
	

}