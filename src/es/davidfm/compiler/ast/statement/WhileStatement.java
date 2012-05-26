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
 * This class represents a while loop
 */
public class WhileStatement extends Statement {

	private int counter;

	private Expression condition;

	private Statement instruction;

	private final List<String> validOps = Arrays.asList(">", "<", "==", "!=",
			"<=", ">=");

	/**
	 * Constructor The constructor checks if the expression is valid as a
	 * condition
	 * 
	 * @param condition
	 * @param instruction
	 */
	public WhileStatement(int counter, Expression condition,
			Statement instruction) {

		if (!validOps.contains(condition.getOp())
				&& !condition.getType().equals("int")) {

			System.out
					.println("Error. This type of expression cannot be a condition");
			System.out.println("Analysis terminated");
			System.exit(1);

		}

		this.condition = condition;
		this.instruction = instruction;

	}

	/**
	 * Returns the condition
	 * 
	 * @return condition
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * Returns the instruction that will be done as long as the condition is met
	 * 
	 * @return instruction
	 */
	public Statement getInstruction() {
		return instruction;
	}

	public String toString() {

		return "WHILE(CONDITION(" + condition + ")DO(" + instruction + ")";
	}

	public ArrayList<String> toCode() {

		ArrayList<String> output = new ArrayList<String>();
		int auxAddress = 0;
		
		if (condition.getClass().equals(BinaryExpression.class)){
			
			BinaryExpression aux = (BinaryExpression) condition;
			
			int left = aux.getLeft().getMemoryAddress();
			int right = aux.getRight().getMemoryAddress(); 
			
			output.add("");
			output.addAll(aux.getLeft().toCode());
			output.addAll(aux.getRight().toCode());
			output.add("#left");
			output.add("lw $s0, "+left+"($gp)");
			output.add("#right");
			output.add("lw $s1, "+right+"($gp)");
			
			auxAddress = left;
		}
		
		
		
		output.add("");	
		output.add("LOOP"+this.counter+":");
		
		if (this.condition.getOp().equals(">") || this.condition.getOp().equals("<") || this.condition.getOp().equals("!=")  ){
			
			output.add("beq $s0, $s1, ENDLOOP"+counter);
			
		} else if(this.condition.getOp().equals("<=")) {
			
			output.add("bgq $s0, $s1, ENDLOOP"+counter);
			
		} else if (this.condition.getOp().equals(">=")){
			
			output.add("bit $s0, $s1, ENDLOOP"+counter);
			
		} else{
			
			output.add("bne $s0, $s1, ENDLOOP"+counter);
			
		}
			
		
		output.addAll(this.getInstruction().toCode());
		output.add("lw $s0, "+auxAddress+"($gp)");
		output.add("");
		output.add("j LOOP"+counter);
		output.add("");
		output.add("ENDLOOP"+counter+":");
		output.add("");
		
		return output;
	}

}
