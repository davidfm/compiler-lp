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
 * 
 */
public class Program {

	private ArrayList<Variable> variables;
	private BlockStatement body;
	private TSymbols tos;

	public Program() {

		this.variables = new ArrayList<Variable>();
		this.body = new BlockStatement();
		this.tos = new TSymbols();
		this.tos.addScope();
	}

	public void addVariable(Variable var) {

		this.variables.add(var);
		tos.addVariable(var);

	}

	public ArrayList<Variable> getVariables() {

		return this.variables;
	}

	public void newScope() {

		this.tos.addScope();
	}

	public void deleteScope() {

		this.tos.deleteScope();
	}

	public void setBody(BlockStatement body) {

		this.body = body;
	}

	public BlockStatement getBody() {

		return this.body;
	}

	public boolean containsVariable(String id) {

		return tos.exists(id);
	}

	public Variable getVariable(String id) {

		return tos.getVariable(id);
	}

	public void addToBody(Statement s) {

		body.add(s);

	}

	@Override
	public String toString() {
		String output = "";

		output = "(Program\n\t(VariablesList(" + this.variables + "\n\t(Body("
				+ body + ")\n)";

		return output;
	}

	public ArrayList<String> toCode() {

		ArrayList<String> output = new ArrayList<String>();

		Iterator it = body.getList().iterator();

		while (it.hasNext()) {

			Statement s = (Statement) it.next();
			output.addAll(s.toCode());
		}

		return output;
	}

	public ArrayList<String> stringToCode() {

		ArrayList<String> output = new ArrayList<String>();

		Iterator it = body.getList().iterator();

		while (it.hasNext()) {

			Object o = it.next();
			
			
			boolean equals = o.getClass().toString().equals("class es.davidfm.compiler.ast.statement.AssignStatement");
			
			System.out.println(equals);
					
			if (equals) {

				AssignStatement aux = (AssignStatement) o;
				
				
				
				if (aux.getLeft().getType().equals("String")) {
					output.add(aux.stringToCode());

				}

			}
		}
		
		return output;

	}

}
