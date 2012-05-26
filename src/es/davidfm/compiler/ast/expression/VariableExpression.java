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



package es.davidfm.compiler.ast.expression;

import java.util.ArrayList;

import es.davidfm.compiler.ast.structure.Variable;


/**
 * This class represents the expression of a variable
 * to be used in operations 
 */
public class VariableExpression extends Expression {
	
	private Variable variable;
	private int memoryAddress;
	
	/**
	 * Constructor
	 * @param var
	 */
	public VariableExpression(Variable var){
		
		super(var.getType());
		//System.out.println(var);
		this.variable = var;
		this.memoryAddress = variable.getMemoryAddress();
	}
	
	/**
	 * 
	 * @return variable
	 */
	public Variable getVariable() {
		return variable;
	}
	

	
	public String toString(){
		
		return variable.toString();
	}
	

	/**
	 * Variable to ASM code. In this case, an empty list is returned.
	 */
	public ArrayList<String> toCode(){
		
		ArrayList<String> output = new ArrayList<String>();
		
		
		return output;
	}
	
	/**
	 * Returns the memory address where the value of the variable will be stored.
	 */
	public int getMemoryAddress(){
		
		return this.memoryAddress;
	}


}
