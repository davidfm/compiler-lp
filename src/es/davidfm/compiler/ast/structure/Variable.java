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

/**
 * This class contains the information related to a variable.
 * Name, type and memory address where it will be stored.
 */
public class Variable {
	
	private String type;
	private String name;
	private int memoryAddress;
	
	
	public Variable(String type, String name, int memoryAddress){
		
		this.type = type;
		this.name = name;
		this.memoryAddress = memoryAddress;
		
	}
	
	


	public String getType() {
		return type;
	}




	public void setType(String type) {
		this.type = type;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}
	
	

	public boolean equals(String name){
		
		return this.name.equals(name);
	}
	
	public int getMemoryAddress(){
		
		return this.memoryAddress;
	}
	


	@Override
	public String toString() {
		return "Variable [Type=" + type + ", ID=" + name + " Address= " + memoryAddress + "]";
	}
	
	

	
	
	

}
