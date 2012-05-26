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

package es.davidfm.compiler.ast.structure;

import java.util.ArrayList;

import java.util.Iterator;

import es.davidfm.compiler.ast.statement.AssignStatement;
import es.davidfm.compiler.ast.statement.BlockStatement;
import es.davidfm.compiler.ast.statement.Statement;

/**
 * This class is the root of the AST.
 */
public class Program {

	private ArrayList<Variable> variables;
	private BlockStatement body;
	private TSymbols tos;

	/**
	 * Constructor
	 */
	public Program() {

		this.variables = new ArrayList<Variable>();
		this.body = new BlockStatement();
		this.tos = new TSymbols();
		this.tos.addScope();
	}
	
	/**
	 * Add new variable
	 * @param var
	 */
	public void addVariable(Variable var) {

		this.variables.add(var);
		tos.addVariable(var);

	}
	
	/**
	 * Get the variables that have been declared.
	 * @return variables
	 */
	public ArrayList<Variable> getVariables() {

		return this.variables;
	}
	
	/**
	 * Adds a new scope to the Table of Symbols
	 */
	public void newScope() {

		this.tos.addScope();
	}

	/**
	 * Deletes scope from the Table of Symbols
	 */
	public void deleteScope() {

		this.tos.deleteScope();
	}
	
	/**
	 * Sets the body of the program
	 * @param body
	 */
	public void setBody(BlockStatement body) {

		this.body = body;
	}
	
	/**
	 * Returns the body of the program
	 * @return body
	 */
	public BlockStatement getBody() {

		return this.body;
	}
	
	/**
	 * 
	 * @param id
	 * @return true if variable exists
	 */
	public boolean containsVariable(String id) {

		return tos.exists(id);
	}
	
	/**
	 * Returns the variable matching a given id
	 * @param id
	 * @return a variable
	 */
	public Variable getVariable(String id) {

		return tos.getVariable(id);
	}
	
	/**
	 * Adds a new statment to the body
	 * @param s
	 */
	public void addToBody(Statement s) {

		body.add(s);

	}

	@Override
	public String toString() {
		String output = "";

		output = "(Program\n\t"
				+ body + ")\n)";

		return output;
	}
	
	/**
	 * Translation to ASM
	 * @return 
	 */
	public ArrayList<String> toCode() {

	
		return body.toCode();
	}
	
	/**
	 * Translates only the declarations of- Strings to ASM
	 * Necessary due to MIPS characteristics when working with Strings.
	 * @return
	 */
	public ArrayList<String> stringToCode() {

		ArrayList<String> output = new ArrayList<String>();

		
		Iterator<Variable> it = variables.iterator();
		
		while (it.hasNext()){
			
			Variable aux = it.next();
			
			if (aux.getType().equals("String")){
				
				output.add(aux.getName()+": .space 32");
			}
		}
		
				
		return output;

	}

}
