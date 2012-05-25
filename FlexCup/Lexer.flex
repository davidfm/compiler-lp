/**
    Copyright (C) 2012 David Fernández

LICENSE:

    This file is part of compiler-lp.

    compiler-lp is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    compiler-lp is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with CalculatorCompiler. If not, see <http://www.gnu.org/licenses/>.

@author David Fernández <davidfm[at]linux[dot]com>
@license http://www.gnu.org/licenses
@copyright 2012 David Fernández

*/

package es.davidfm.compiler.analysis;


import java_cup.runtime.*;
import java.io.IOException;

%%

%class Lexer

%unicode
%line
%column

%final

%cupsym sym
%cup
%char


%state COMMENT1
%state COMMENT2

%init{

%}

%{

private boolean comments = false;

private Symbol token(int token, Object lexeme){
String tok = (String) lexeme;
int line = yyline + 1;

if (token != (sym.EOF))
CodeInfo.saveInfo(line, tok);
return new Symbol(token, lexeme);
}

private Symbol token (int token) {

return token(token, yytext());
}

%}

%eofval{
if (comments) {
System.out.println("There are unclosed comments");
System.exit(1);
}else{
return token(sym.EOF);
}

%eofval}


NUM_INTEGER=[0-9]+
NUM_FLOAT=[0-9]+\.[0-9]+
BOOL= ("true"|"false")
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

<YYINITIAL> "+" {return token(sym.PLUS);}
<YYINITIAL> "-" {return token(sym.MINUS);}
<YYINITIAL> "*" {return token(sym.TIMES);}
<YYINITIAL> "/" {return token(sym.DIV);}
<YYINITIAL> "(" {return token(sym.LPAREN);}
<YYINITIAL> ")" {return token(sym.RPAREN);}
<YYINITIAL> "{" {return token(sym.LBRACE);}
<YYINITIAL> "}" {return token(sym.RBRACE);}
<YYINITIAL> "int" {return token(sym.INTEGER);}
<YYINITIAL> "float" {return token(sym.FLOAT);}
<YYINITIAL> "boolean" {return token(sym.BOOLEAN);}
<YYINITIAL> "String" {return token(sym.STRING);}
<YYINITIAL> ";" {return token(sym.SEMI);}
<YYINITIAL> "," {return token(sym.COMMA);}
<YYINITIAL> "==" {return token(sym.EQUALS);}
<YYINITIAL> "!=" {return token(sym.DIFFERENT);}
<YYINITIAL> ">=" {return token(sym.GREATEREQUAL);}
<YYINITIAL> "<=" {return token(sym.LESSEQUAL);}
<YYINITIAL> ">" {return token(sym.GREATER);}
<YYINITIAL> "<" {return token(sym.LESS);}

<YYINITIAL> "=" {return token(sym.ASSIGN);}
<YYINITIAL> "main" {return token(sym.MAIN);}
<YYINITIAL> "print" {return token(sym.PRINT);}
<YYINITIAL> "println" {return token(sym.PRINTLN);}
<YYINITIAL> "while" {return token(sym.WHILE);}


<YYINITIAL> {NUM_INTEGER} {return token(sym.NUM_INTEGER);}
<YYINITIAL> {NUM_FLOAT} {return token(sym.NUM_FLOAT);}
<YYINITIAL> {BOOL} {return token(sym.BOOL);}
<YYINITIAL> {ID} {return token(sym.ID);}
<YYINITIAL> {STRG} {return token(sym.STRG);}
 
<YYINITIAL> [^] {System.out.println("Error in line: " + yyline + " column: " + yycolumn + " ----> " + yytext()); System.exit(1);}


