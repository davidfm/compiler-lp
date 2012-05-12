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
 * This class represents a binary expression
 * 
 */
public class BinaryExpression extends Expression {
	
	
	private String op;  //operator   
	
	private Expression left; //lefthand operand
	
	private Expression right; //righthand operand
	
	
	
	/**
	 * Contructor. It receives the type of the expression, the operator and both left and righthand oeprands
	 * @param type
	 * @param op
	 * @param left
	 * @param right
	 */
	public BinaryExpression(String type, String op, Expression left, Expression right){
		
		super(type);
		this.op = op;
		this.left = left;
		this.right = right;
				
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
	 * This is not a tree leaf. 
	 * 
	 */
	public boolean isLeaf(){
		
		return false;
	}

	
}
	
	
		
	
	
	
	


