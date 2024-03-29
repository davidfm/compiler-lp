
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Fri May 25 14:02:52 EEST 2012
//----------------------------------------------------

package es.davidfm.compiler.analysis;

import java_cup.runtime.*;
import java.io.*;
import es.davidfm.compiler.ast.structure.*;
import es.davidfm.compiler.ast.expression.*;
import es.davidfm.compiler.ast.statement.*;
import es.davidfm.compiler.generator.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Fri May 25 14:02:52 EEST 2012
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
    "\000\031\000\002\002\004\000\002\013\002\000\002\002" +
    "\011\000\002\003\004\000\002\003\003\000\002\004\003" +
    "\000\002\004\003\000\002\004\003\000\002\004\003\000" +
    "\002\005\005\000\002\006\006\000\002\007\003\000\002" +
    "\007\003\000\002\007\003\000\002\010\005\000\002\010" +
    "\005\000\002\010\005\000\002\010\005\000\002\010\003" +
    "\000\002\010\003\000\002\010\003\000\002\010\003\000" +
    "\002\010\005\000\002\011\007\000\002\012\007" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\063\000\004\025\000\001\002\000\004\002\065\001" +
    "\002\000\004\025\006\001\002\000\004\010\007\001\002" +
    "\000\004\011\010\001\002\000\004\012\011\001\002\000" +
    "\016\016\013\017\026\021\017\026\022\027\014\033\021" +
    "\001\002\000\004\033\063\001\002\000\004\033\ufff6\001" +
    "\002\000\004\010\057\001\002\000\020\013\ufffc\016\ufffc" +
    "\017\ufffc\021\ufffc\026\ufffc\027\ufffc\033\ufffc\001\002\000" +
    "\020\013\ufff9\016\ufff9\017\ufff9\021\ufff9\026\ufff9\027\ufff9" +
    "\033\ufff9\001\002\000\004\033\ufff4\001\002\000\020\013" +
    "\ufffd\016\013\017\026\021\017\026\022\027\014\033\021" +
    "\001\002\000\004\024\034\001\002\000\004\010\030\001" +
    "\002\000\020\013\ufffa\016\ufffa\017\ufffa\021\ufffa\026\ufffa" +
    "\027\ufffa\033\ufffa\001\002\000\004\013\027\001\002\000" +
    "\020\013\ufffb\016\ufffb\017\ufffb\021\ufffb\026\ufffb\027\ufffb" +
    "\033\ufffb\001\002\000\004\033\ufff5\001\002\000\004\002" +
    "\uffff\001\002\000\004\033\031\001\002\000\004\011\032" +
    "\001\002\000\004\022\033\001\002\000\020\013\uffea\016" +
    "\uffea\017\uffea\021\uffea\026\uffea\027\uffea\033\uffea\001\002" +
    "\000\014\010\041\030\042\031\037\033\035\034\036\001" +
    "\002\000\016\004\uffec\005\uffec\006\uffec\007\uffec\011\uffec" +
    "\022\uffec\001\002\000\016\004\uffed\005\uffed\006\uffed\007" +
    "\uffed\011\uffed\022\uffed\001\002\000\016\004\uffee\005\uffee" +
    "\006\uffee\007\uffee\011\uffee\022\uffee\001\002\000\014\004" +
    "\045\005\046\006\050\007\047\022\055\001\002\000\014" +
    "\010\041\030\042\031\037\033\035\034\036\001\002\000" +
    "\016\004\uffef\005\uffef\006\uffef\007\uffef\011\uffef\022\uffef" +
    "\001\002\000\014\004\045\005\046\006\050\007\047\011" +
    "\044\001\002\000\016\004\uffeb\005\uffeb\006\uffeb\007\uffeb" +
    "\011\uffeb\022\uffeb\001\002\000\014\010\041\030\042\031" +
    "\037\033\035\034\036\001\002\000\014\010\041\030\042" +
    "\031\037\033\035\034\036\001\002\000\014\010\041\030" +
    "\042\031\037\033\035\034\036\001\002\000\014\010\041" +
    "\030\042\031\037\033\035\034\036\001\002\000\016\004" +
    "\ufff1\005\ufff1\006\ufff1\007\047\011\ufff1\022\ufff1\001\002" +
    "\000\016\004\ufff0\005\ufff0\006\ufff0\007\ufff0\011\ufff0\022" +
    "\ufff0\001\002\000\016\004\ufff2\005\ufff2\006\050\007\047" +
    "\011\ufff2\022\ufff2\001\002\000\016\004\ufff3\005\046\006" +
    "\050\007\047\011\ufff3\022\ufff3\001\002\000\020\013\ufff7" +
    "\016\ufff7\017\ufff7\021\ufff7\026\ufff7\027\ufff7\033\ufff7\001" +
    "\002\000\004\013\ufffe\001\002\000\004\033\060\001\002" +
    "\000\004\011\061\001\002\000\004\022\062\001\002\000" +
    "\020\013\uffe9\016\uffe9\017\uffe9\021\uffe9\026\uffe9\027\uffe9" +
    "\033\uffe9\001\002\000\004\022\064\001\002\000\020\013" +
    "\ufff8\016\ufff8\017\ufff8\021\ufff8\026\ufff8\027\ufff8\033\ufff8" +
    "\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\063\000\006\002\003\013\004\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\020\003\023\004\017\005\014\006" +
    "\024\007\011\011\022\012\015\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\020\003\055\004\017" +
    "\005\014\006\024\007\011\011\022\012\015\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\010\037\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\010\042\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\010\053\001\001\000\004" +
    "\010\052\001\001\000\004\010\051\001\001\000\004\010" +
    "\050\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
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
	int memory = 0;
	
	void init(){
	
		program = new Program();
	
	}
	
	
	void end() throws IOException{
	
		CodeGenerator cg = new CodeGenerator(program);
		cg.generateAsm();
		
	
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
          case 24: // Println ::= PRINTLN LPAREN ID RPAREN SEMI 
            {
              PrintLineStatement RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
	if (program.containsVariable(id)){
 		RESULT = new PrintLineStatement(program.getVariable(id));
	} else {

		System.out.println("Error. Variable not declared.");

	 }

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Println",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // Print ::= PRINT LPAREN ID RPAREN SEMI 
            {
              PrintStatement RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
	if (program.containsVariable(id)){
 		RESULT = new PrintStatement(program.getVariable(id));
	} else {

		System.out.println("Error. Variable not declared.");

	 }

              CUP$parser$result = parser.getSymbolFactory().newSymbol("Print",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // Expression ::= LPAREN Expression RPAREN 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = e; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // Expression ::= ID 
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
          case 20: // Expression ::= STRG 
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
          case 19: // Expression ::= NUM_FLOAT 
            {
              Expression RESULT =null;
		int fleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int fright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String f = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new FloatLiteralExpression(f, memory); memory+=4; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // Expression ::= NUM_INTEGER 
            {
              Expression RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new IntegerLiteralExpression(i, memory); memory+=4; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Expression ::= Expression DIV Expression 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new BinaryExpression("/",e1,e2,memory); memory+=4; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Expression ::= Expression TIMES Expression 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new BinaryExpression("*",e1,e2,memory); memory+=4; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Expression ::= Expression MINUS Expression 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new BinaryExpression("-",e1,e2,memory); memory+=4; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Expression ::= Expression PLUS Expression 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new BinaryExpression("+",e1,e2,memory); memory+=4; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Expression",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Type ::= STRING 
            {
              String RESULT =null;
		 RESULT = new String("String"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Type ::= FLOAT 
            {
              String RESULT =null;
		 RESULT = new String("float"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Type ::= INTEGER 
            {
              String RESULT =null;
		 RESULT = new String("int"); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Type",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Assign ::= ID ASSIGN Expression SEMI 
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
				System.out.println("Error. Variable not declared.");
			}

			
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Assign",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Declaration ::= Type ID SEMI 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 if (program.containsVariable(id)){
					System.out.println("Variable " + id + " is already declared");
					} else {

						if (!t.equals("String")){
						Variable v = new Variable(t,id, memory);
						memory+=4;
						program.addVariable(v);

						} else {
							Variable v = new Variable(t,id, -1);
							program.addVariable(v);
						}
							
					}

				
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Declaration",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Statement ::= Println 
            {
              Statement RESULT =null;
		int plleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int plright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		PrintLineStatement pl = (PrintLineStatement)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		program.addToBody(pl); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Statement ::= Print 
            {
              Statement RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		PrintStatement p = (PrintStatement)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 program.addToBody(p); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Statement",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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
		
				System.out.println("Analysis finished succesfully");
				end();
				System.out.println("Code generated succesfully");				
  			
              CUP$parser$result = parser.getSymbolFactory().newSymbol("Program",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // NT$0 ::= 
            {
              Program RESULT =null;
 System.out.println("Beginning the analysis");
			init();
			 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("NT$0",9, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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

