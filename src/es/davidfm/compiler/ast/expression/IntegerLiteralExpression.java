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
import java.util.Stack;

import es.davidfm.compiler.generator.CodeGenerator;




/**
 * This class represents an integer literal
 */
public class IntegerLiteralExpression extends Expression {
	
	private int value;
	private int memoryAddress;
	
	/**
	 * Constructor with String input
	 * @param lexeme
	 */
	public IntegerLiteralExpression(String lexeme, int memoryAddress){
		
		super("int");
		this.value = Integer.parseInt(lexeme);
		this.memoryAddress = memoryAddress;
		System.out.println("Valor: " + value + ", Memoria: " + memoryAddress);
	}
	
	
	/**
	 * Constructor with Integer input
	 * @param value
	 */
	public IntegerLiteralExpression(int value){
		
		super("int");
		this.value = value;
	}

	
	/**
	 * Returns the value of the expression
	 * @return value
	 */
	public int getValue() {
		return value;
	}
	
	public String toString(){
		
		return ""+value;
		
	}
	

	/**
	 * Translates to ASM code
	 */
	public ArrayList<String> toCode(){
		
		ArrayList<String> output = new ArrayList<String>();
		
		output.add("li $t0, "+this.getValue());
		output.add("sw $t0, "+this.getMemoryAddress()+"($gp)");
		
				
		return output;
		
	}
	
	/**
	 * Returns the memory address where the value will be stored
	 */
	public int getMemoryAddress(){
		
		return this.memoryAddress;
	}
	

	

}
