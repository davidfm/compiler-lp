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

import es.davidfm.compiler.ast.expression.Expression;
import es.davidfm.compiler.ast.structure.Variable;


/**
 * This class represents an Assign Statement
 */
public class AssignStatement extends Statement {
	
	private Variable left; //Variable to wich an expression is assigned
	private Expression exp; //Expression assigned to the variable
	
	/**
	 * Constructor
	 * @param left
	 * @param exp
	 */
	public AssignStatement(Variable left, Expression exp){
		
		this.sameType(left,exp);
		this.left = left;
		this.exp = exp;
	}

	/**
	 * Returns the variable (lefthand of the assign statement)
	 * @return left
	 */
	public Variable getLeft() {
		return left;
	}
	
	/**
	 * Returns the expression (righthand of the assign statement)
	 * @return
	 */
	public Expression getExp() {
		return exp;
	}
	
	public String toString(){
		
		String output = "=("+left+","+exp+")";
		
		return output;
	}
	
	/**
	 * Checks that the variable and the expression are of the same type
	 * @param l
	 * @param e
	 */
	private void sameType(Variable l, Expression e){
		String t1 = l.getType();
		String t2 = e.getType();
		
		if (!t1.equals(t2)){
			
			System.out.println("ERROR: You cannot assign a(n) " + t2 + " to a " + t1);
			System.out.println("Analysis terminated");
			System.exit(1);
		}
	}
	
	@Override
	public ArrayList<String> toCode(){
		
		ArrayList<String> output = new ArrayList<String>();
		
		if (exp.getType().equals("int")){
			
			output.addAll(exp.toCode());
			output.add("lw $t0, "+exp.getMemoryAddress()+"($gp)");
			output.add("sw $t0, "+left.getMemoryAddress()+"($gp)");
			
			
		} else if (exp.getType().equals("float")){
			
			
			String aux = "swvc1 $f0, "+left.getMemoryAddress()+"($gp)";
			output.addAll(exp.toCode());
			output.add(aux);
			output.add("null");
		}
		
		
		return output;
	}
	

	
	

}
