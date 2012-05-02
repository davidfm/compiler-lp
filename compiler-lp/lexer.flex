/**
    Copyright (C) 2012 David Fernández

	LICENSE:	

    This file is part of CalculatorCompiler.

    CalculatorCompiler is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    CalculatorCompiler is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with CalculatorCompiler.  If not, see <http://www.gnu.org/licenses/>.

	@author David Fernández <davidfm[at]linux[dot]com>
	@license http://www.gnu.org/licenses
	@copyright 2012 David Fernández
	
*/

import java_cup.runtime.Symbol;
import java.io.IOException;


%%

%class Lexer

%unicode
%line
%column

%standalone

//%final

//%cupsym Symbol
//%cup
%char

%state COMMENT1
%state COMMENT2


%init{

	private boolean comments = false;

%}

%eofval{
	if (comments){
		System.out.println("There are unclosed comments");
		System.exit(1);
	}

	else
		System.out.println("Analsys ended succesfully");
		System.exit(1);
%eofval}


NUM_INTEGER=[0-9]+
NUM_FLOAT=[0.9]"."[0.9]+
BOOL=("true"|"false")
ID=[a-zA-Z]([a-zA-Z0-9]|"_")*
STRG="\"".+"\""
%%

<COMMENT2> [\n] {yybegin(YYINITIAL);}
<YYINITIAL, COMMENT1, COMMENT2> " " {}
<YYINITIAL, COMMENT1, COMMENT2> [\t\r\n\f] {}
<YYINITIAL> "/*" {yybegin(COMMENT1); comments=true;}
<YYINITIAL> "//" {yybegin(COMMENT2); }
<COMMENT1> "*/" {yybegin(YYINITIAL); comments=false;}
<COMMENT1, COMMENT2> [^] {}

<YYINITIAL> "+" {System.out.println("PLUS");}
<YYINITIAL> "-" {System.out.println("MINUS");}
<YYINITIAL> "*" {System.out.println("TIMES");}
<YYINITIAL> "/" {System.out.println("DIV");}
<YYINITIAL> "(" {System.out.println("LPAREN");}
<YYINITIAL> ")" {System.out.println("RPAREN");}
<YYINITIAL> "{" {System.out.println("LBRACE");}
<YYINITIAL> "}" {System.out.println("RBRACE");}
<YYINITIAL> "int" {System.out.println("INTEGER");}
<YYINITIAL> "float" {System.out.println("FLOAT");}
<YYINITIAL> "boolean" {System.out.println("BOOLEAN");}
<YYINITIAL> "String" {System.out.println("STRING");}
<YYINITIAL> ";" {System.out.println("SEMI");}
<YYINITIAL> "," {System.out.println("COMMA");}
<YYINITIAL> "=" {System.out.println("ASSIGN");}
<YYINITIAL> "main" {System.out.println("MAIN");}
<YYINITIAL> "print" {System.out.println("PRINT");}
<YYINITIAL> "printline" {System.out.println("PRINTLINE");}

<YYINITIAL> {NUM_INTEGER} {System.out.println("NUM_INTEGER");}
<YYINITIAL> {NUM_FLOAT} {System.out.println("NUM_FLOAT");}
<YYINITIAL> {BOOL} {System.out.println("BOOL");}
<YYINITIAL> {ID} {System.out.println("ID");}
<YYINITIAL> {STRG} {System.out.println("STRG");}
 
<YYINITIAL> [^] {System.out.println("Error en linea: " + yyline + " columna: " + yycolumn + " ----> " + yytext());}





