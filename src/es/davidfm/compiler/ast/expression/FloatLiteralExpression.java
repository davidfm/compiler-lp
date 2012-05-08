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

/**
 * 
 */
public class FloatLiteralExpression extends Expression {
	
	private float value;
	
	public FloatLiteralExpression(String lexeme){
		
		super("float");
		this.value = Float.parseFloat(lexeme);
	}
	
	public FloatLiteralExpression(float value){
		super("float");
		this.value = value;
	}

	public float getValue() {
		return value;
	}
	
	
	
	

}
