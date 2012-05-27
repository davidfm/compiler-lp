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
import java.util.Arrays;
import java.util.List;


/**
 * This class represents a binary expression
 * 
 */
public class BinaryExpression extends Expression {
	
	
	private String op;  //operator   
	
	private Expression left; //lefthand operand
	
	private Expression right; //righthand operand
	
	private int memoryAddress;
	
	
	
	/**
	 * Contructor. It receives the type of the expression, the operator and both left and righthand oeprands
	 * @param type
	 * @param op
	 * @param left
	 * @param right
	 */
	public BinaryExpression(String op, Expression left, Expression right, int memoryAddress){
		
		super("");
		this.op = op;
		this.left = left;
		this.right = right;
		this.memoryAddress = memoryAddress;
				
		if (left.getType().equals(right.getType())){
			
			super.setType(left.getType());
			
			if (super.getType().equals("String")){
				
				System.out.println("Error, you cannot operate strings");
				System.exit(1);
				
			}
			
			
		} else if (left.getType().equals("int") && right.getType().equals("float") 
				|| left.getType().equals("float") && right.getType().equals("int")){
			
			super.setType("float");
			
		} else {
			
			System.out.println("Error");
			System.exit(1);
		}
	}

	
	/**
	 * Returns the operator
	 * @return op
	 */
	public String getOp() {
		return op;
	}

	
	/**
	 * Returns the lefthand expression
	 * @return left
	 */
	public Expression getLeft() {
		return left;
	}

	
	/**
	 * Returns the righthand expression
	 * @return right
	 */
	public Expression getRight() {
		return right;
	}
	
	

	@Override	
	public String toString(){
		
		return op+"("+left+","+right+")";
	}
	
	

	/**
	 * Returns the memory address where the result will be stored
	 */
	public int getMemoryAddress(){
		
		return this.memoryAddress;
	}
	
	/**
	 * Translates to ASM code
	 */
	public ArrayList<String> toCode(){
		
		 List<String> relation = Arrays.asList(">", "<", "==", "!=",
				"<=", ">=");
		 
		ArrayList<String> output = new ArrayList<String>();
		output.addAll(left.toCode());
		output.addAll(right.toCode());
		
		if (!relation.contains(op)){
		
		char operator = op.charAt(0);
		
		if (this.getType().equals("int")){
		output.add("lw $t0, "+left.getMemoryAddress()+"($gp)");
		output.add("lw $t1, "+right.getMemoryAddress()+"($gp)");
		
		
		switch(operator){
		
		case('+'):
		
			output.add("add $t0, $t0, $t1");
			break;
			
		case ('-'):
			
			output.add("sub $t0, $t0, $t1");
		break;
		
		case('*'):
			
			output.add("mul $t0, $t0, $t1");
			break;
		
		case('/'):
			
			output.add("div $t0, $t0, $t1");
			break;			
		
		}
		
		
		output.add("sw $t0, " + this.getMemoryAddress()+("($gp)"));
		
		} else {
			
			if (left.getType().equals("int")){
				
				output.add("lw $t0, "+left.getMemoryAddress()+"($gp)");
				output.add("mtc1 $t0, $f6");
				output.add("cvt.s.w $f2, $f6");
				output.add("lwc1 $f4, "+right.getMemoryAddress()+"($gp)" );
				
			} else if (right.getType().equals("int")){
				
				output.add("lwc1 $f2, "+left.getMemoryAddress()+"($gp)" );
				output.add("lw $t0, "+right.getMemoryAddress()+"($gp)");
				output.add("mtc1 $t0, $f6");
				output.add("cvt.s.w $f4, $f6");
				
			} else {
				output.add("lwc1 $f2, "+left.getMemoryAddress()+"($gp)" );
				output.add("lwc1 $f4, "+right.getMemoryAddress()+"($gp)" );
			}
			
			switch(operator){
			
			case('+'):
			
				output.add("add.s $f2, $f2, $f4");
				break;
				
			case ('-'):
				
				output.add("sub.s $f2, $f2, $f4");
			break;
			
			case('*'):
				
				output.add("mul.s $f2, $f2, $f4");
				break;
			
			case('/'):
				
				output.add("div.s $f2, $f2, $f4");
				break;			
			
			}
			
			output.add("swc1 $f2, "+this.getMemoryAddress()+"($gp)");
			
		}
		
		}
		return output;
		
	}


	
}
	
	
		
	
	
	
	


