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



package es.davidfm.compiler.generator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;



import es.davidfm.compiler.ast.structure.Program;

/**
 * This class translates the information contained in the AST to 
 * MIPS assembler code. To be used with SPIM simulator.
 */
public class CodeGenerator {
	
	private Program p;
	private String name;
	private PrintWriter file;
	
	
	
	
	public CodeGenerator(Program p){
		
		this.p = p;
		this.name = "output.asm";
		
		
		
	}
	
	
	private void openFile() throws IOException{
		
		file = new PrintWriter(new BufferedWriter(new FileWriter(name)));
		
	}
	
	private void closeFile(){
		
		file.close();
	}
	
	private void writeLine(String line){
		
		file.println(line);
		
	}
	
	private void write(String text){
		
		file.print(text);
		
	}
	
	private void newLine(){
		
		file.println("");
	}
	

		
		
		
		
	
	
	public void generateAsm() throws IOException{
		
					
		openFile();
		writeLine(".data");
		writeLine("rivinvaihto: .asciiz \"\\n\"");
		
		
		ArrayList<String> code = p.stringToCode();
		
		Iterator<String> it = code.iterator();
		
		while (it.hasNext()){
		
			writeLine(it.next());
			
		}
		
		
		writeLine(".text");
		writeLine(".globl main");
		newLine();
		writeLine("main: ");
		newLine();
		
		code = p.toCode();
		
		it = code.iterator();
		
		while (it.hasNext()){
			
			writeLine(it.next());
		}
		
		newLine();
		writeLine("li $v0, 10");
		writeLine("syscall");
		
		
		closeFile();		
	}
	
	
	



}
