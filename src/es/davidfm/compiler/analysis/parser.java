package es.davidfm.compiler.analysis;


//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue May 08 18:59:05 EEST 2012
//----------------------------------------------------

import java_cup.runtime.*;
import java.io.*;
import es.davidfm.compiler.ast.structure.*;
import es.davidfm.compiler.ast.expression.*;
import es.davidfm.compiler.ast.statement.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue May 08 18:59:05 EEST 2012
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
    "\000\025\000\002\002\004\000\002\011\002\000\002\002" +
    "\011\000\002\003\004\000\002\003\003\000\002\004\003" +
    "\000\002\004\003\000\002\005\005\000\002\006\006\000" +
    "\002\007\003\000\002\007\003\000\002\007\003\000\002" +
    "\010\005\000\002\010\005\000\002\010\005\000\002\010" +
    "\005\000\002\010\003\000\002\010\003\000\002\010\003" +
    "\000\002\010\003\000\002\010\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\047\000\004\025\000\001\002\000\004\002\051\001" +
    "\002\000\004\025\006\001\002\000\004\010\007\001\002" +
    "\000\004\011\010\001\002\000\004\012\011\001\002\000" +
    "\012\016\013\017\022\021\015\033\017\001\002\000\004" +
    "\033\047\001\002\000\004\033\ufff8\001\002\000\014\013" +
    "\ufffc\016\ufffc\017\ufffc\021\ufffc\033\ufffc\001\002\000\004" +
    "\033\ufff6\001\002\000\014\013\ufffd\016\013\017\022\021" +
    "\015\033\017\001\002\000\004\024\024\001\002\000\004" +
    "\013\023\001\002\000\014\013\ufffb\016\ufffb\017\ufffb\021" +
    "\ufffb\033\ufffb\001\002\000\004\033\ufff7\001\002\000\004" +
    "\002\uffff\001\002\000\014\010\031\030\032\031\027\033" +
    "\025\034\026\001\002\000\016\004\uffee\005\uffee\006\uffee" +
    "\007\uffee\011\uffee\022\uffee\001\002\000\016\004\uffef\005" +
    "\uffef\006\uffef\007\uffef\011\uffef\022\uffef\001\002\000\016" +
    "\004\ufff0\005\ufff0\006\ufff0\007\ufff0\011\ufff0\022\ufff0\001" +
    "\002\000\014\004\035\005\036\006\040\007\037\022\045" +
    "\001\002\000\014\010\031\030\032\031\027\033\025\034" +
    "\026\001\002\000\016\004\ufff1\005\ufff1\006\ufff1\007\ufff1" +
    "\011\ufff1\022\ufff1\001\002\000\014\004\035\005\036\006" +
    "\040\007\037\011\034\001\002\000\016\004\uffed\005\uffed" +
    "\006\uffed\007\uffed\011\uffed\022\uffed\001\002\000\014\010" +
    "\031\030\032\031\027\033\025\034\026\001\002\000\014" +
    "\010\031\030\032\031\027\033\025\034\026\001\002\000" +
    "\014\010\031\030\032\031\027\033\025\034\026\001\002" +
    "\000\014\010\031\030\032\031\027\033\025\034\026\001" +
    "\002\000\016\004\ufff3\005\ufff3\006\ufff3\007\037\011\ufff3" +
    "\022\ufff3\001\002\000\016\004\ufff2\005\ufff2\006\ufff2\007" +
    "\ufff2\011\ufff2\022\ufff2\001\002\000\016\004\ufff4\005\ufff4" +
    "\006\040\007\037\011\ufff4\022\ufff4\001\002\000\016\004" +
    "\ufff5\005\036\006\040\007\037\011\ufff5\022\ufff5\001\002" +
    "\000\014\013\ufff9\016\ufff9\017\ufff9\021\ufff9\033\ufff9\001" +
    "\002\000\004\013\ufffe\001\002\000\004\022\050\001\002" +
    "\000\014\013\ufffa\016\ufffa\017\ufffa\021\ufffa\033\ufffa\001" +
    "\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\047\000\006\002\003\011\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\014\003\017\004\015\005\013\006" +
    "\020\007\011\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\014\003\045\004" +
    "\015\005\013\006\020\007\011\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\010\027\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\010\032\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\010\043\001\001\000\004\010" +
    "\042\001\001\000\004\010\041\001\001\000\004\010\040" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

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
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




	public static void main (String [] args) throws Exception{

		if (args.length!=1)
			System.out.println("Error. No file to process");
		else{
			try{
				
				Lexer lexer = new Lexer(new FileReader(args[0]));	
				new parser(lexer).parse();

			}catch(Exception e){
				
				System.out.println("Error");

			}			
	
	}
}	



}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {



	Program program;
	
	void init(){
	
		program = new Program();
	
	}
	
	
	void end(){
	
		System.out.println(program);
		System.out.println("=====Program ended====");
	
	}
	








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
          case 20: // Expression ::= LPAREN Expression RPAREN 
            {
              Expression RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // Expression ::= ID 
            {
              Expression RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 	Variable v = program.getVariable(id);
			RESULT = new VariableExpression(v);
		
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Expression ::= STRG 
            {
              Expression RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new StringLiteralExpression(s); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Expression ::= NUM_FLOAT 
            {
              Expression RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new FloatLiteralExpression(f); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Expression ::= NUM_INTEGER 
            {
              Expression RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new IntegerLiteralExpression(i); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Expression ::= Expression DIV Expression 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new BinaryExpression("prueba","/",e1,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Expression ::= Expression TIMES Expression 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new BinaryExpression("prueba","*",e1,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Expression ::= Expression MINUS Expression 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new BinaryExpression("prueba","-",e1,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Expression ::= Expression PLUS Expression 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new BinaryExpression("prueba","+",e1,e2); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Type ::= STRING 
            {
              String RESULT =null;
		 RESULT = new String("String"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Type ::= FLOAT 
            {
              String RESULT =null;
		 RESULT = new String("float"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Type ::= INTEGER 
            {
              String RESULT =null;
		 RESULT = new String("int"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Assign ::= ID ASSIGN Expression SEMI 
            {
              AssignStatement RESULT =null;
		int id2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int id2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String id2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 if (program.containsVariable(id2)){
				Variable v = program.getVariable(id2);
				RESULT = new AssignStatement(v,e);
			} else {
				System.out.println("error");
			}

			
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Assign",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Declaration ::= Type ID SEMI 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 if (program.containsVariable(id)){
					System.out.println("error");
					} else {
						Variable v = new Variable(t,id);
						program.addVariable(v);
					}

				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Declaration",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Statement ::= Assign 
            {
              Statement RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		AssignStatement a = (AssignStatement)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 program.addToBody(a); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Statement ::= Declaration 
            {
              Statement RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // Body ::= Statement 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Body",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // Body ::= Statement Body 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Body",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // Program ::= NT$0 MAIN LPAREN RPAREN LBRACE Body RBRACE 
            {
              Program RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Program) ((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-6)).value;
		 end(); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // NT$0 ::= 
            {
              Program RESULT =null;
 System.out.println("Beginning of the program");
			init();
			 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",7, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= Program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Program start_val = (Program)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

