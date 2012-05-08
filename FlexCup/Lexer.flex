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

%cupsym Symbol
%cup
%char


%state COMMENT1
%state COMMENT2

%init{

%}

%{

private comments = false;

private Symbol token(int token, Object lexeme){
String tok = (String) lexeme;
int line = yyline + 1;

if token != (Symbol.EOF){
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
else{
return token(Symbol.EOF);
}

%eofval}


NUM_INTEGER=[0-9]+
NUM_FLOAT=[0.9]="."[0-9]+
BOOL= ("True"|"False")
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

<YYINITIAL> "+" {return token(Symbol.PLUS);}
<YYINITIAL> "-" {return token(Symbol.MINUS);}
<YYINITIAL> "*" {return token(Symbol.TIMES);}
<YYINITIAL> "/" {return token(Symbol.DIV);}
<YYINITIAL> "(" {return token(Symbol.LPAREN);}
<YYINITIAL> ")" {return token(Symbol.RPAREN);}
<YYINITIAL> "{" {return token(Symbol.LBRACE);}
<YYINITIAL> "}" {return token(symbol.RBRACE);}
<YYINITIAL> "int" {return token(Symbol.INTEGER);}
<YYINITIAL> "float" {return token(Symbol.FLOAT):}
<YYINITIAL> "boolean" {return token(Symbol.BOOLEAN);}
<YYINITIAL> "String" {return token(Symbol.STRING);}
<YYINITIAL> ";" {return token(Symbol.SEMI);}
<YYINITIAL> "," {return token(Symbol.COMMA);}
<YYINITIAL> "=" {return token(symbol.ASSIGN);}
<YYINITIAL> "main" {return token(Symbol.MAIN);}
<YYINITIAL> "print" {return token(Symbol.PRINT);}
<YYINITIAL> "printline" {return token(Symbol.PRINTLINE);}

<YYINITIAL> {NUM_INTEGER} {return token(Symbol.NUM_INTEGER);}
<YYINITIAL> {NUM_FLOAT} {return token(Symbol.NUM_FLOAT);}
<YYINITIAL> {BOOL} {return token(Symbol.BOOL);}
<YYINITIAL> {ID} {return token(Symbol.ID);}
<YYINITIAL> {STRG} {return token(Symbol.STRG);}
 
<YYINITIAL> [^] {System.out.println("Error en linea: " + yyline + " columna: " + yycolumn + " ----> " + yytext());}


