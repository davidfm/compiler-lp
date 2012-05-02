
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed May 02 15:44:37 EEST 2012
//----------------------------------------------------

package es.davidfm.compiler.analysis;

import java_cup.runtime.*;
import java.util.*;
import java.io.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed May 02 15:44:37 EEST 2012
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\032\000\002\011\002\000\002\002\011\000\002\002" +
    "\004\000\002\003\004\000\002\003\003\000\002\012\002" +
    "\000\002\004\004\000\002\013\002\000\002\004\004\000" +
    "\002\014\002\000\002\005\006\000\002\015\002\000\002" +
    "\016\002\000\002\006\010\000\002\017\002\000\002\007" +
    "\004\000\002\007\003\000\002\007\003\000\002\010\005" +
    "\000\002\010\005\000\002\010\005\000\002\010\005\000" +
    "\002\010\003\000\002\010\003\000\002\010\003\000\002" +
    "\010\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\054\000\004\025\001\001\002\000\004\002\056\001" +
    "\002\000\004\025\006\001\002\000\004\010\007\001\002" +
    "\000\004\011\010\001\002\000\004\012\011\001\002\000" +
    "\012\016\ufffc\017\ufffc\021\ufffc\033\ufffa\001\002\000\004" +
    "\033\ufff6\001\002\000\010\016\ufff8\017\ufff8\021\ufff8\001" +
    "\002\000\014\013\ufffd\016\ufffc\017\ufffc\021\ufffc\033\ufffa" +
    "\001\002\000\004\013\016\001\002\000\004\002\000\001" +
    "\002\000\004\013\ufffe\001\002\000\010\016\ufff3\017\025" +
    "\021\022\001\002\000\014\013\ufffb\016\ufffb\017\ufffb\021" +
    "\ufffb\033\ufffb\001\002\000\004\033\ufff0\001\002\000\004" +
    "\033\027\001\002\000\004\016\026\001\002\000\004\033" +
    "\ufff1\001\002\000\004\033\ufff2\001\002\000\004\022\030" +
    "\001\002\000\014\013\ufff7\016\ufff7\017\ufff7\021\ufff7\033" +
    "\ufff7\001\002\000\014\013\ufff9\016\ufff9\017\ufff9\021\ufff9" +
    "\033\ufff9\001\002\000\004\033\033\001\002\000\004\024" +
    "\034\001\002\000\012\010\ufff5\030\ufff5\031\ufff5\033\ufff5" +
    "\001\002\000\012\010\041\030\042\031\037\033\036\001" +
    "\002\000\016\004\uffe9\005\uffe9\006\uffe9\007\uffe9\011\uffe9" +
    "\022\uffe9\001\002\000\016\004\uffea\005\uffea\006\uffea\007" +
    "\uffea\011\uffea\022\uffea\001\002\000\014\004\045\005\046" +
    "\006\050\007\047\022\055\001\002\000\012\010\041\030" +
    "\042\031\037\033\036\001\002\000\016\004\uffeb\005\uffeb" +
    "\006\uffeb\007\uffeb\011\uffeb\022\uffeb\001\002\000\014\004" +
    "\045\005\046\006\050\007\047\011\044\001\002\000\016" +
    "\004\uffe8\005\uffe8\006\uffe8\007\uffe8\011\uffe8\022\uffe8\001" +
    "\002\000\012\010\041\030\042\031\037\033\036\001\002" +
    "\000\012\010\041\030\042\031\037\033\036\001\002\000" +
    "\012\010\041\030\042\031\037\033\036\001\002\000\012" +
    "\010\041\030\042\031\037\033\036\001\002\000\016\004" +
    "\uffed\005\uffed\006\uffed\007\047\011\uffed\022\uffed\001\002" +
    "\000\016\004\uffec\005\uffec\006\uffec\007\uffec\011\uffec\022" +
    "\uffec\001\002\000\016\004\uffee\005\uffee\006\050\007\047" +
    "\011\uffee\022\uffee\001\002\000\016\004\uffef\005\046\006" +
    "\050\007\047\011\uffef\022\uffef\001\002\000\014\013\ufff4" +
    "\016\ufff4\017\ufff4\021\ufff4\033\ufff4\001\002\000\004\002" +
    "\uffff\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\054\000\006\002\003\011\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\012\003\014\004\013\012\012\013" +
    "\011\001\001\000\006\006\030\015\031\001\001\000\006" +
    "\005\020\014\017\001\001\000\012\003\016\004\013\012" +
    "\012\013\011\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\007\022\017\023\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\016\034\001\001\000\004\010" +
    "\037\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\010\042\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\010\053\001\001" +
    "\000\004\010\052\001\001\000\004\010\051\001\001\000" +
    "\004\010\050\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 2;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	public static void main (String [] args) throws Exception{

		if (args.length!=1)
			System.out.println("Error. No file to process");
		else{
			try {

				Lexer lexico = new Lexer(new FileReader(args[0]));
				new parser(lexico).parse();


			} catch (Exception e){
				
				System.out.println("Error");
			}

		}
	}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // Expression ::= LPAREN Expression RPAREN 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // Expression ::= ID 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Expression ::= NUM_FLOAT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Expression ::= NUM_INTEGER 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Expression ::= Expression DIV Expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // Expression ::= Expression TIMES Expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Expression ::= Expression MINUS Expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Expression ::= Expression PLUS Expression 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Type ::= STRING 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Type ::= FLOAT 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Type ::= NT$6 INTEGER 
            {
              Object RESULT =null;
              // propagate RESULT from NT$6
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // NT$6 ::= 
            {
              Object RESULT =null;
 System.out.println("Type"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$6",13, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Assign ::= NT$4 ID ASSIGN NT$5 Expression SEMI 
            {
              Object RESULT =null;
              // propagate RESULT from NT$5
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Assign",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // NT$5 ::= 
            {
              Object RESULT =(Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
 System.out.println("Expression beginning"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$5",12, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // NT$4 ::= 
            {
              Object RESULT =null;
 System.out.println("Assign 2"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$4",11, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Declaration ::= NT$3 Type ID SEMI 
            {
              Object RESULT =null;
              // propagate RESULT from NT$3
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Declaration",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // NT$3 ::= 
            {
              Object RESULT =null;
 System.out.println("Declaration 2"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$3",10, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Statement ::= NT$2 Assign 
            {
              Object RESULT =null;
              // propagate RESULT from NT$2
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // NT$2 ::= 
            {
              Object RESULT =null;
 System.out.println("Assign call"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$2",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Statement ::= NT$1 Declaration 
            {
              Object RESULT =null;
              // propagate RESULT from NT$1
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // NT$1 ::= 
            {
              Object RESULT =null;
 System.out.println("Declaration call"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$1",8, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Statements ::= Statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statements",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Statements ::= Statement Statements 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statements",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // $START ::= Program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // Program ::= NT$0 MAIN LPAREN RPAREN LBRACE Statements RBRACE 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		 System.out.println("End"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // NT$0 ::= 
            {
              Object RESULT =null;
 System.out.println("Begining"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

