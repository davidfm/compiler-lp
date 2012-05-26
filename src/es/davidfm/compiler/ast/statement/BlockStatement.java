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

import es.davidfm.compiler.ast.structure.Variable;

/**
 * This class represents a group of statements.
 * It is used as the body of the program, body of a loop, etc.
 */
public class BlockStatement extends Statement {
	
	private ArrayList<Variable> variables;
	
	private ArrayList<Statement> list; //List of statements
	
	
	/**
	 * Constructor.
	 * A new list of statements is instantiated
	 */
	public BlockStatement(){
		this.variables = new ArrayList<Variable>();
		this.list = new ArrayList<Statement>();
	}
	
	
	public BlockStatement(ArrayList<Variable> variables, ArrayList<Statement> list){
		this.variables = variables;
		this.list = list;
		
		
	}

	/**
	 * Returns the statements contained in this block
	 * @return list
	 */
	public ArrayList<Statement> getList() {
		return list;
	}
	
	/**
	 * Adds statement to the block
	 * @param stm
	 */
	public void add(Statement stm){
		
		this.list.add(stm);
	}
	
	public String toString(){
		
		return "Variables("+variables.toString()+") Body("+list.toString()+")";
	}
	
	/**
	 * Not yet implemented because it is not used
	 */
	public ArrayList<String> toCode(){
		
		return null;
	}
}
