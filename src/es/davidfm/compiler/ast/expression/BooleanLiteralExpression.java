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



/**
 * This class represents a boolean literal
 * 
 */
public class BooleanLiteralExpression extends Expression {
	
	private boolean value;
	
	/**
	 * Constructor with Btring input
	 * @param lexeme
	 */
	public BooleanLiteralExpression(String lexeme){
		super("boolean");
		this.value = Boolean.parseBoolean(lexeme);
	}
	
	/**
	 * Constructor with boolean input
	 * @param value
	 */
	public BooleanLiteralExpression(boolean value){
		
		super("boolean");
		this.value = value;
	}

	/**
	 * Returns true or false
	 * @return
	 */
	public boolean getValue() {
		return value;
	}
	
	public String toString(){
	
		return ""+this.value;
				
	}
	

	/**
	 * Translates to ASM code
	 */
	public ArrayList<String> toCode(){
		
		ArrayList<String> output = new ArrayList<String>();
		
		output.add(""+value);
		
		return output;
		
	}



	
	

	
	

}
