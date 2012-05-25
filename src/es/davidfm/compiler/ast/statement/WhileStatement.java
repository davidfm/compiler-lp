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

/**
 * This class represents a while loop
 */
public class WhileStatement extends Statement {
	
	
	private Expression condition;
	
	private Statement instruction;
	
	
	/**
	 * Constructor
	 * @param condition
	 * @param instruction
	 */
	public WhileStatement(Expression condition, Statement instruction){
		
		this.condition = condition;
		this.instruction = instruction;
	}

	/* (non-Javadoc)
	 * @see es.davidfm.compiler.ast.statement.Statement#toCode()
	 */
	@Override
	public ArrayList<String> toCode() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Returns the condition 
	 * @return condition
	 */
	public Expression getCondition() {
		return condition;
	}
	
	/**
	 * Returns the instruction that will be done as long as the condition is met
	 * @return instruction
	 */
	public Statement getInstruction() {
		return instruction;
	}

}
