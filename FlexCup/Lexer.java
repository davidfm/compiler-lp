/* The following code was generated by JFlex 1.4.3 on 27/05/12 12:03 */

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


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 27/05/12 12:03 from the specification file
 * <tt>Lexer.flex</tt>
 */
final class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT2 = 4;
  public static final int COMMENT1 = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\17\1\16\1\0\2\17\22\0\1\17\1\41\1\15\5\0"+
    "\1\24\1\25\1\21\1\22\1\37\1\23\1\2\1\20\12\1\1\0"+
    "\1\36\1\43\1\40\1\42\2\0\22\13\1\34\7\13\4\0\1\14"+
    "\1\0\1\10\1\33\2\13\1\6\1\7\1\35\1\47\1\30\2\13"+
    "\1\11\1\44\1\31\1\32\1\45\1\13\1\4\1\12\1\3\1\5"+
    "\1\13\1\46\3\13\1\26\1\0\1\27\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\4\3\1\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\3\3\1\15"+
    "\1\16\1\17\1\1\1\20\1\21\3\3\1\4\1\22"+
    "\1\0\4\3\1\0\1\23\1\24\1\25\3\3\1\26"+
    "\1\27\1\30\1\31\3\3\1\32\1\33\4\3\1\34"+
    "\1\35\5\3\1\36\1\37\3\3\1\40\2\3\1\41"+
    "\2\3\1\42\1\43\1\3\1\44\1\3\1\45\1\46";

  private static int [] zzUnpackAction() {
    int [] result = new int[83];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\50\0\120\0\170\0\240\0\310\0\360\0\u0118"+
    "\0\u0140\0\u0168\0\170\0\u0190\0\170\0\170\0\170\0\170"+
    "\0\170\0\170\0\170\0\u01b8\0\u01e0\0\u0208\0\170\0\170"+
    "\0\u0230\0\u0258\0\u0280\0\u02a8\0\u02d0\0\u02f8\0\u0320\0\u0348"+
    "\0\170\0\u0370\0\u0398\0\u03c0\0\u03e8\0\u0410\0\u0438\0\170"+
    "\0\170\0\360\0\u0460\0\u0488\0\u04b0\0\170\0\170\0\170"+
    "\0\170\0\u04d8\0\u0500\0\u0528\0\170\0\u0370\0\u0550\0\u0578"+
    "\0\u05a0\0\u05c8\0\u0438\0\360\0\u05f0\0\u0618\0\u0640\0\u0668"+
    "\0\u0690\0\360\0\360\0\u06b8\0\u06e0\0\u0708\0\360\0\u0730"+
    "\0\u0758\0\360\0\u0780\0\u07a8\0\u07d0\0\360\0\u07f8\0\360"+
    "\0\u0820\0\360\0\360";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[83];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\4\1\6\2\7\1\10\1\11\4\7"+
    "\1\4\1\12\2\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\2\7\1\25\1\26\1\7"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\7\21\13\1\40\44\13\1\41\31\13\51\0"+
    "\1\5\1\42\46\0\1\7\1\0\1\7\1\43\10\7"+
    "\13\0\6\7\6\0\4\7\1\0\1\7\1\0\12\7"+
    "\13\0\6\7\6\0\4\7\1\0\1\7\1\0\6\7"+
    "\1\44\3\7\13\0\6\7\6\0\4\7\1\0\1\7"+
    "\1\0\5\7\1\45\1\46\3\7\13\0\6\7\6\0"+
    "\4\7\16\47\1\0\31\47\20\0\1\50\1\51\27\0"+
    "\1\7\1\0\4\7\1\52\5\7\13\0\1\7\1\53"+
    "\4\7\6\0\4\7\1\0\1\7\1\0\12\7\13\0"+
    "\2\7\1\54\3\7\6\0\4\7\1\0\1\7\1\0"+
    "\1\55\11\7\13\0\6\7\6\0\4\7\40\0\1\56"+
    "\47\0\1\57\47\0\1\60\47\0\1\61\10\0\1\7"+
    "\1\0\5\7\1\62\4\7\13\0\6\7\6\0\4\7"+
    "\1\0\1\7\1\0\1\7\1\63\10\7\13\0\6\7"+
    "\6\0\4\7\1\0\1\7\1\0\12\7\13\0\6\7"+
    "\6\0\3\7\1\64\20\0\1\65\30\0\1\66\47\0"+
    "\1\7\1\0\2\7\1\67\7\7\13\0\6\7\6\0"+
    "\4\7\1\0\1\7\1\0\7\7\1\70\2\7\13\0"+
    "\6\7\6\0\4\7\1\0\1\7\1\0\6\7\1\71"+
    "\3\7\13\0\6\7\6\0\4\7\1\0\1\7\1\0"+
    "\12\7\13\0\2\7\1\72\3\7\6\0\4\7\15\47"+
    "\1\73\1\0\31\47\1\0\1\7\1\0\1\74\11\7"+
    "\13\0\6\7\6\0\4\7\1\0\1\7\1\0\12\7"+
    "\13\0\2\7\1\75\3\7\6\0\4\7\1\0\1\7"+
    "\1\0\1\7\1\76\10\7\13\0\6\7\6\0\4\7"+
    "\1\0\1\7\1\0\12\7\13\0\1\77\5\7\6\0"+
    "\4\7\1\0\1\7\1\0\12\7\13\0\1\100\5\7"+
    "\6\0\4\7\1\0\1\7\1\0\12\7\13\0\1\101"+
    "\5\7\6\0\4\7\1\0\1\7\1\0\3\7\1\102"+
    "\6\7\13\0\6\7\6\0\4\7\1\0\1\7\1\0"+
    "\3\7\1\103\6\7\13\0\6\7\6\0\4\7\1\0"+
    "\1\7\1\0\7\7\1\67\2\7\13\0\6\7\6\0"+
    "\4\7\1\0\1\7\1\0\5\7\1\104\4\7\13\0"+
    "\6\7\6\0\4\7\1\0\1\7\1\0\6\7\1\105"+
    "\3\7\13\0\6\7\6\0\4\7\1\0\1\7\1\0"+
    "\12\7\13\0\1\106\5\7\6\0\4\7\1\0\1\7"+
    "\1\0\12\7\13\0\1\7\1\107\4\7\6\0\4\7"+
    "\1\0\1\7\1\0\12\7\13\0\1\7\1\110\4\7"+
    "\6\0\4\7\1\0\1\7\1\0\6\7\1\111\3\7"+
    "\13\0\6\7\6\0\4\7\1\0\1\7\1\0\1\112"+
    "\11\7\13\0\6\7\6\0\4\7\1\0\1\7\1\0"+
    "\3\7\1\113\6\7\13\0\6\7\6\0\4\7\1\0"+
    "\1\7\1\0\12\7\13\0\1\7\1\114\4\7\6\0"+
    "\4\7\1\0\1\7\1\0\1\115\11\7\13\0\6\7"+
    "\6\0\4\7\1\0\1\7\1\0\3\7\1\116\6\7"+
    "\13\0\6\7\6\0\4\7\1\0\1\7\1\0\5\7"+
    "\1\117\4\7\13\0\6\7\6\0\4\7\1\0\1\7"+
    "\1\0\12\7\13\0\5\7\1\120\6\0\4\7\1\0"+
    "\1\7\1\0\6\7\1\121\3\7\13\0\6\7\6\0"+
    "\4\7\1\0\1\7\1\0\12\7\13\0\1\7\1\122"+
    "\4\7\6\0\4\7\1\0\1\7\1\0\12\7\13\0"+
    "\1\7\1\123\4\7\6\0\4\7";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2120];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\6\1\1\11\1\1\7\11\3\1\2\11"+
    "\10\1\1\11\1\0\4\1\1\0\2\11\4\1\4\11"+
    "\3\1\1\11\36\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[83];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */


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



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 114) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 8: 
          { return token(sym.MINUS);
          }
        case 39: break;
        case 34: 
          { return token(sym.PRINT);
          }
        case 40: break;
        case 10: 
          { return token(sym.RPAREN);
          }
        case 41: break;
        case 14: 
          { return token(sym.COMMA);
          }
        case 42: break;
        case 7: 
          { return token(sym.PLUS);
          }
        case 43: break;
        case 17: 
          { return token(sym.LESS);
          }
        case 44: break;
        case 27: 
          { return token(sym.NUM_FLOAT);
          }
        case 45: break;
        case 11: 
          { return token(sym.LBRACE);
          }
        case 46: break;
        case 38: 
          { return token(sym.PRINTLN);
          }
        case 47: break;
        case 32: 
          { return token(sym.MAIN);
          }
        case 48: break;
        case 31: 
          { return token(sym.ELSE);
          }
        case 49: break;
        case 18: 
          { yybegin(YYINITIAL);
          }
        case 50: break;
        case 2: 
          { return token(sym.NUM_INTEGER);
          }
        case 51: break;
        case 15: 
          { return token(sym.ASSIGN);
          }
        case 52: break;
        case 22: 
          { return token(sym.EQUALS);
          }
        case 53: break;
        case 16: 
          { return token(sym.GREATER);
          }
        case 54: break;
        case 1: 
          { System.out.println("Error in line: " + yyline + " column: " + yycolumn + " ----> " + yytext()); System.exit(1);
          }
        case 55: break;
        case 19: 
          { yybegin(COMMENT2);
          }
        case 56: break;
        case 5: 
          { return token(sym.DIV);
          }
        case 57: break;
        case 30: 
          { return token(sym.BOOL);
          }
        case 58: break;
        case 20: 
          { yybegin(COMMENT1); comments=true;
          }
        case 59: break;
        case 13: 
          { return token(sym.SEMI);
          }
        case 60: break;
        case 25: 
          { return token(sym.LESSEQUAL);
          }
        case 61: break;
        case 29: 
          { return token(sym.INTEGER);
          }
        case 62: break;
        case 26: 
          { yybegin(YYINITIAL); comments=false;
          }
        case 63: break;
        case 23: 
          { return token(sym.DIFFERENT);
          }
        case 64: break;
        case 9: 
          { return token(sym.LPAREN);
          }
        case 65: break;
        case 37: 
          { return token(sym.BOOLEAN);
          }
        case 66: break;
        case 21: 
          { return token(sym.IF);
          }
        case 67: break;
        case 28: 
          { return token(sym.STRG);
          }
        case 68: break;
        case 12: 
          { return token(sym.RBRACE);
          }
        case 69: break;
        case 24: 
          { return token(sym.GREATEREQUAL);
          }
        case 70: break;
        case 6: 
          { return token(sym.TIMES);
          }
        case 71: break;
        case 35: 
          { return token(sym.WHILE);
          }
        case 72: break;
        case 3: 
          { return token(sym.ID);
          }
        case 73: break;
        case 36: 
          { return token(sym.STRING);
          }
        case 74: break;
        case 4: 
          { 
          }
        case 75: break;
        case 33: 
          { return token(sym.FLOAT);
          }
        case 76: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { if (comments) {
System.out.println("There are unclosed comments");
System.exit(1);
}else{
return token(sym.EOF);
}

 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
