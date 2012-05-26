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
 * Abstract superclass
 */
public abstract class Expression {
	
	
	private String type;
	private int memoryAddress;
	
	public Expression(String type){
		
		this.type = type;
	}

	public String getType(){
		
		return this.type;
	}
	
	public void setType(String type){
		
		this.type = type;
	}
	
	public void setMemoryAddress(int m){
		
		this.memoryAddress = m;
	}
	
	public int getMemoryAddress(){
		
		return this.memoryAddress;
	}
	
	public String getOp(){
		
		return "";
	}
	
	
	public abstract ArrayList<String> toCode();
}
