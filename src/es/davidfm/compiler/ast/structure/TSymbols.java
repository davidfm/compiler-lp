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

import java.util.Hashtable;
import java.util.Stack;



/**
 * This class represents the Table of Symbols. 
 * It contains a stack of scopes, with a table of symbols for each scope.
 */
public class TSymbols {
	
	private Stack <Hashtable<String,Variable>> 	stack;
	
	
	/**
	 * Constructor
	 */
	public TSymbols(){
		
		this.stack = new Stack<Hashtable<String,Variable>>();
	}
	
	
	/**
	 * Add a new scope
	 */
	public void addScope(){
		
		this.stack.push(new Hashtable<String,Variable>());
	}
	
	/**
	 * Delete scope
	 */
	public void deleteScope(){
		
		this.stack.pop();
	}
	
	/**
	 * Add a new variable to last scope
	 * @param v
	 */
	public void addVariable(Variable v){
		
		this.stack.peek().put(v.getName(), v);
	}
	
	/**
	 * Get variable from the first scope
	 * @param name
	 * @return null if the variable does not exist
	 */
	public Variable getVariable(String name){
		
		Hashtable<String,Variable> table = this.stack.peek();
		
		if (table.containsKey(name))
			
			return (Variable) table.get(name);
		
		else
			return null;
	}
	
	
	/**
	 * Checks if the variable exists in the current scope
	 * @param name
	 * @return true if the variable exists
	 */
	public boolean exists(String name){
		
		return this.stack.peek().containsKey(name);
	}
	

}
