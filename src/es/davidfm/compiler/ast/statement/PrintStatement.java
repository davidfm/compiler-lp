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
 * This class represents a print statement
 */
public class PrintStatement extends Statement {

	Variable v;

	public PrintStatement(Variable v) {

		this.v = v;

	}

	@Override
	public String toString() {

		return "PRINT(" + (v) + ")";
	}

	public ArrayList<String> toCode() {

		ArrayList<String> output = new ArrayList<String>();
		
		if (v.getType().equals("String")){
			
			output.add("li $v0, 4");
			output.add("la $a0, "+v.getName());
			output.add("syscall");
			
		} else if (v.getType().equals("int")){
			
			output.add("li $v0, 1");
			output.add("lw $a0, "+v.getMemoryAddress()+"($gp)");
			output.add("syscall");
		} else {
			
			output.add("li $v0, 2");
			output.add("lwc1 $f12, "+v.getMemoryAddress()+"($gp)");
			output.add("syscall");
		}
		

		return output;

	}

}
