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



package es.davidfm.compiler.utils;

import es.davidfm.compiler.ast.expression.BinaryExpression;
import es.davidfm.compiler.ast.expression.BooleanLiteralExpression;
import es.davidfm.compiler.ast.expression.FloatLiteralExpression;
import es.davidfm.compiler.ast.expression.IntegerLiteralExpression;
import es.davidfm.compiler.ast.expression.StringLiteralExpression;
import es.davidfm.compiler.ast.expression.VariableExpression;
import es.davidfm.compiler.ast.statement.AssignStatement;
import es.davidfm.compiler.ast.statement.PrintLineStatement;
import es.davidfm.compiler.ast.statement.PrintStatement;

/**
 * 
 */
public class Cast {
	
	public static void toClass(Object o){
		
		String type = o.getClass().toString();
		
		//BinrayExpression
		if (type.equals(es.davidfm.compiler.ast.expression.BinaryExpression.class.toString())){
			
			castToBinary(o);
			
		//BooleanLiteralExpression	
		} else if (type.equals(es.davidfm.compiler.ast.expression.BooleanLiteralExpression.class.toString())){
			
			castToBoolean(o);
			
		}else if (type.equals(es.davidfm.compiler.ast.expression.FloatLiteralExpression.class.toString())){
			
			castToFloat(o);
			
		}else if (type.equals(es.davidfm.compiler.ast.expression.IntegerLiteralExpression.class.toString())){
			
			castToInteger(o);
			
		}else if (type.equals(es.davidfm.compiler.ast.expression.StringLiteralExpression.class.toString())){
			
			castToString(o);
			
		}else if (type.equals(es.davidfm.compiler.ast.expression.VariableExpression.class.toString())){
			
			castToVariable(o);
			
		}else if (type.equals(es.davidfm.compiler.ast.statement.AssignStatement.class.toString())){
			
			castToAssign(o);
			
		}else if (type.equals(es.davidfm.compiler.ast.statement.PrintLineStatement.class.toString())){
			
			castToPrintLine(o);
			
		}else{
			
			castToPrint(o);
			
		}
		
		
		
	}
	
	
	private static void castToBinary(Object o){
		
		o = (BinaryExpression) o;
		
	}	
	private static void castToBoolean(Object o){
		
		 o = (BooleanLiteralExpression) o;
	}
	
	private static void castToFloat(Object o){
		
		o = (FloatLiteralExpression) o;
	}
	
	private static void castToInteger(Object o){
		
		o = (IntegerLiteralExpression) o;
	}
	
	private static void castToString(Object o){
		
		o = (StringLiteralExpression) o;
	}
	
	private static void castToVariable(Object o){
		
		o = (VariableExpression) o;
	}
	
	private static void castToAssign(Object o){
		
		o = (AssignStatement) o;
	}
	
	private static void castToPrintLine(Object o){
		
		o = (PrintLineStatement) o;
	}
	
	private static void castToPrint(Object o){
		
		o = (PrintStatement) o;
	}

}
