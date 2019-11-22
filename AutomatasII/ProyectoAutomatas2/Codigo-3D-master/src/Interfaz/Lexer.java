/* The following code was generated by JFlex 1.4.3 on 19/11/19 9:50 */

package Interfaz;
import Interfaz.Tokens;
import static Interfaz.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 19/11/19 9:50 from the specification file
 * <tt>C:/Users/julio/OneDrive/Documentos/NetBeansProjects/AnalizadorLexico/src/codigo/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\5\2\0\1\3\22\0\1\3\1\57\1\6\2\0"+
    "\1\62\1\55\1\0\1\63\1\64\1\54\1\52\1\3\1\53\1\72"+
    "\1\4\12\2\1\0\1\71\1\61\1\51\1\60\2\0\1\23\1\26"+
    "\1\20\1\1\1\7\1\15\1\42\1\46\1\35\3\1\1\41\1\36"+
    "\1\1\1\47\1\1\1\45\1\1\1\44\1\1\1\40\4\1\1\67"+
    "\1\0\1\70\1\0\1\1\1\0\1\17\1\25\1\31\1\21\1\12"+
    "\1\24\1\1\1\50\1\34\1\27\1\1\1\16\1\43\1\10\1\14"+
    "\1\33\1\1\1\13\1\22\1\11\1\30\1\37\1\1\1\32\2\1"+
    "\1\65\1\56\1\66\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\23\2\1\10\1\11\1\12\1\13\3\14\2\15\1\1"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\0\1\4\1\26\3\25\1\27\10\25\1\30\17\25"+
    "\1\15\1\31\1\14\1\0\1\3\10\25\1\32\1\33"+
    "\22\25\1\0\3\25\1\34\7\25\1\35\3\25\1\36"+
    "\6\25\1\37\3\25\1\3\3\25\1\40\1\41\12\25"+
    "\1\42\5\25\1\43\1\44\1\45\1\46\6\25\1\47"+
    "\3\25\1\50\10\25\1\51\4\25\1\52\1\53\1\54"+
    "\1\55\4\25\1\56\1\57\1\60\1\61\1\25\1\62"+
    "\1\63\7\25\1\64\1\25\1\65";

  private static int [] zzUnpackAction() {
    int [] result = new int[211];
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
    "\0\0\0\73\0\166\0\261\0\354\0\u0127\0\73\0\73"+
    "\0\u0162\0\u019d\0\u01d8\0\u0213\0\u024e\0\u0289\0\u02c4\0\u02ff"+
    "\0\u033a\0\u0375\0\u03b0\0\u03eb\0\u0426\0\u0461\0\u049c\0\u04d7"+
    "\0\u0512\0\u054d\0\u0588\0\u05c3\0\u05fe\0\u0639\0\u0674\0\u06af"+
    "\0\u06ea\0\u05c3\0\u0725\0\u0760\0\u0674\0\u079b\0\73\0\73"+
    "\0\73\0\73\0\73\0\73\0\166\0\u07d6\0\u0811\0\73"+
    "\0\u084c\0\u0887\0\u08c2\0\166\0\u08fd\0\u0938\0\u0973\0\u09ae"+
    "\0\u09e9\0\u0a24\0\u0a5f\0\u0a9a\0\u0ad5\0\u0b10\0\u0b4b\0\u0b86"+
    "\0\u0bc1\0\u0bfc\0\u0c37\0\u0c72\0\u0cad\0\u0ce8\0\u0d23\0\u0d5e"+
    "\0\u0d99\0\u0dd4\0\u0e0f\0\u0e4a\0\73\0\73\0\73\0\u0e85"+
    "\0\u07d6\0\u0ec0\0\u0efb\0\u0f36\0\u0f71\0\u0fac\0\u0fe7\0\u1022"+
    "\0\u105d\0\166\0\u1098\0\u10d3\0\u110e\0\u1149\0\u1184\0\u11bf"+
    "\0\u11fa\0\u1235\0\u1270\0\u12ab\0\u12e6\0\u1321\0\u135c\0\u1397"+
    "\0\u13d2\0\u140d\0\u1448\0\u1483\0\u14be\0\u14f9\0\u1534\0\u156f"+
    "\0\u15aa\0\166\0\u15e5\0\u1620\0\u165b\0\u1696\0\u16d1\0\u170c"+
    "\0\u1747\0\166\0\u1782\0\u17bd\0\u17f8\0\166\0\u1833\0\u186e"+
    "\0\u18a9\0\u18e4\0\u191f\0\u195a\0\166\0\u1995\0\u19d0\0\u1a0b"+
    "\0\73\0\u1a46\0\u1a81\0\u1abc\0\166\0\166\0\u1af7\0\u1b32"+
    "\0\u1b6d\0\u1ba8\0\u1be3\0\u1c1e\0\u1c59\0\u1c94\0\u1ccf\0\u1d0a"+
    "\0\166\0\u1d45\0\u1d80\0\u1dbb\0\u1df6\0\u1e31\0\166\0\166"+
    "\0\166\0\166\0\u1e6c\0\u1ea7\0\u1ee2\0\u1f1d\0\u1f58\0\u1f93"+
    "\0\166\0\u1fce\0\u2009\0\u2044\0\166\0\u207f\0\u20ba\0\u20f5"+
    "\0\u2130\0\u216b\0\u21a6\0\u21e1\0\u221c\0\166\0\u2257\0\u2292"+
    "\0\u22cd\0\u2308\0\166\0\166\0\166\0\166\0\u2343\0\u237e"+
    "\0\u23b9\0\u23f4\0\166\0\166\0\166\0\166\0\u242f\0\166"+
    "\0\166\0\u246a\0\u24a5\0\u24e0\0\u251b\0\u2556\0\u2591\0\u25cc"+
    "\0\166\0\u2607\0\166";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[211];
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
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\3\1\12\1\13\1\3\1\14\1\15\2\3\1\16"+
    "\1\3\1\17\1\20\1\21\1\3\1\22\4\3\1\23"+
    "\1\3\1\24\1\25\1\3\1\26\1\27\1\30\1\31"+
    "\2\3\1\32\1\3\1\33\1\34\1\35\1\36\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\2\74\0\2\55"+
    "\4\0\42\55\24\0\1\4\67\0\1\56\3\0\1\5"+
    "\73\0\1\57\44\0\1\60\22\0\2\55\4\0\1\55"+
    "\1\61\11\55\1\62\7\55\1\63\12\55\1\64\3\55"+
    "\23\0\2\55\4\0\4\55\1\65\35\55\23\0\2\55"+
    "\4\0\13\55\1\66\26\55\23\0\2\55\4\0\4\55"+
    "\1\67\35\55\23\0\2\55\4\0\7\55\1\70\11\55"+
    "\1\71\3\55\1\72\14\55\23\0\2\55\4\0\5\55"+
    "\1\73\2\55\1\74\31\55\23\0\2\55\4\0\25\55"+
    "\1\75\14\55\23\0\2\55\4\0\7\55\1\76\11\55"+
    "\1\77\20\55\23\0\2\55\4\0\10\55\1\100\31\55"+
    "\23\0\2\55\4\0\5\55\1\101\34\55\23\0\2\55"+
    "\4\0\10\55\1\102\31\55\23\0\2\55\4\0\1\55"+
    "\1\103\40\55\23\0\2\55\4\0\21\55\1\104\20\55"+
    "\23\0\2\55\4\0\10\55\1\105\31\55\23\0\2\55"+
    "\4\0\5\55\1\106\34\55\23\0\2\55\4\0\4\55"+
    "\1\107\35\55\23\0\2\55\4\0\5\55\1\110\2\55"+
    "\1\111\14\55\1\112\14\55\23\0\2\55\4\0\10\55"+
    "\1\113\31\55\23\0\2\55\4\0\10\55\1\114\31\55"+
    "\73\0\1\115\72\0\1\60\1\116\71\0\1\60\1\0"+
    "\1\116\70\0\1\60\76\0\1\117\73\0\1\117\65\0"+
    "\1\115\6\0\1\115\63\0\1\115\7\0\1\115\64\0"+
    "\1\120\21\0\1\121\70\0\5\57\1\0\65\57\1\0"+
    "\2\55\4\0\2\55\1\122\37\55\23\0\2\55\4\0"+
    "\2\55\1\123\37\55\23\0\2\55\4\0\24\55\1\124"+
    "\15\55\23\0\2\55\4\0\21\55\1\125\20\55\23\0"+
    "\2\55\4\0\14\55\1\126\25\55\23\0\2\55\4\0"+
    "\12\55\1\127\27\55\23\0\2\55\4\0\5\55\1\130"+
    "\34\55\23\0\2\55\4\0\1\55\1\131\40\55\23\0"+
    "\2\55\4\0\1\55\1\132\40\55\23\0\2\55\4\0"+
    "\1\55\1\133\40\55\23\0\2\55\4\0\4\55\1\134"+
    "\5\55\1\135\27\55\23\0\2\55\4\0\1\55\1\136"+
    "\40\55\23\0\2\55\4\0\15\55\1\137\24\55\23\0"+
    "\2\55\4\0\2\55\1\140\37\55\23\0\2\55\4\0"+
    "\7\55\1\141\32\55\23\0\2\55\4\0\7\55\1\142"+
    "\32\55\23\0\2\55\4\0\4\55\1\143\35\55\23\0"+
    "\2\55\4\0\25\55\1\144\14\55\23\0\2\55\4\0"+
    "\3\55\1\145\36\55\23\0\2\55\4\0\7\55\1\146"+
    "\32\55\23\0\2\55\4\0\13\55\1\147\26\55\23\0"+
    "\2\55\4\0\10\55\1\150\31\55\23\0\2\55\4\0"+
    "\13\55\1\151\26\55\23\0\2\55\4\0\25\55\1\152"+
    "\14\55\23\0\2\55\4\0\3\55\1\153\36\55\23\0"+
    "\2\55\4\0\22\55\1\154\17\55\23\0\2\55\4\0"+
    "\22\55\1\155\17\55\24\0\1\156\71\0\2\55\4\0"+
    "\3\55\1\157\36\55\23\0\2\55\4\0\10\55\1\160"+
    "\31\55\23\0\2\55\4\0\4\55\1\161\35\55\23\0"+
    "\2\55\4\0\3\55\1\162\36\55\23\0\2\55\4\0"+
    "\15\55\1\163\24\55\23\0\2\55\4\0\3\55\1\164"+
    "\36\55\23\0\2\55\4\0\2\55\1\165\37\55\23\0"+
    "\2\55\4\0\22\55\1\166\17\55\23\0\2\55\4\0"+
    "\20\55\1\167\21\55\23\0\2\55\4\0\10\55\1\170"+
    "\31\55\23\0\2\55\4\0\3\55\1\171\36\55\23\0"+
    "\2\55\4\0\5\55\1\172\34\55\23\0\2\55\4\0"+
    "\10\55\1\173\31\55\23\0\2\55\4\0\5\55\1\174"+
    "\34\55\23\0\2\55\4\0\13\55\1\125\26\55\23\0"+
    "\2\55\4\0\3\55\1\175\36\55\23\0\2\55\4\0"+
    "\10\55\1\176\31\55\23\0\2\55\4\0\22\55\1\177"+
    "\17\55\23\0\2\55\4\0\30\55\1\200\11\55\23\0"+
    "\2\55\4\0\25\55\1\201\14\55\23\0\2\55\4\0"+
    "\2\55\1\202\37\55\23\0\2\55\4\0\15\55\1\203"+
    "\24\55\23\0\2\55\4\0\2\55\1\204\37\55\23\0"+
    "\2\55\4\0\1\55\1\205\40\55\23\0\2\55\4\0"+
    "\1\55\1\206\40\55\23\0\2\55\4\0\25\55\1\207"+
    "\14\55\23\0\2\55\4\0\3\55\1\210\36\55\24\0"+
    "\1\156\61\0\1\211\7\0\2\55\4\0\4\55\1\212"+
    "\35\55\23\0\2\55\4\0\12\55\1\213\27\55\23\0"+
    "\2\55\4\0\3\55\1\214\36\55\23\0\2\55\4\0"+
    "\1\55\1\215\10\55\1\216\27\55\23\0\2\55\4\0"+
    "\1\55\1\217\40\55\23\0\2\55\4\0\10\55\1\220"+
    "\31\55\23\0\2\55\4\0\25\55\1\221\14\55\23\0"+
    "\2\55\4\0\21\55\1\222\20\55\23\0\2\55\4\0"+
    "\22\55\1\223\17\55\23\0\2\55\4\0\1\55\1\224"+
    "\40\55\23\0\2\55\4\0\16\55\1\225\23\55\23\0"+
    "\2\55\4\0\34\55\1\226\5\55\23\0\2\55\4\0"+
    "\10\55\1\227\31\55\23\0\2\55\4\0\25\55\1\230"+
    "\14\55\23\0\2\55\4\0\5\55\1\231\34\55\23\0"+
    "\2\55\4\0\12\55\1\232\27\55\23\0\2\55\4\0"+
    "\4\55\1\233\35\55\23\0\2\55\4\0\25\55\1\234"+
    "\14\55\23\0\2\55\4\0\4\55\1\235\35\55\23\0"+
    "\2\55\4\0\2\55\1\236\37\55\23\0\2\55\4\0"+
    "\10\55\1\237\31\55\23\0\2\55\4\0\4\55\1\240"+
    "\35\55\23\0\2\55\4\0\5\55\1\241\34\55\23\0"+
    "\2\55\4\0\5\55\1\242\34\55\23\0\2\55\4\0"+
    "\13\55\1\243\26\55\23\0\2\55\4\0\40\55\1\244"+
    "\1\55\23\0\2\55\4\0\1\55\1\245\40\55\23\0"+
    "\2\55\4\0\5\55\1\246\34\55\23\0\2\55\4\0"+
    "\1\55\1\247\40\55\23\0\2\55\4\0\2\55\1\250"+
    "\37\55\23\0\2\55\4\0\10\55\1\251\31\55\23\0"+
    "\2\55\4\0\3\55\1\252\36\55\23\0\2\55\4\0"+
    "\10\55\1\253\31\55\23\0\2\55\4\0\1\55\1\254"+
    "\40\55\23\0\2\55\4\0\5\55\1\255\34\55\23\0"+
    "\2\55\4\0\10\55\1\256\31\55\23\0\2\55\4\0"+
    "\10\55\1\257\31\55\23\0\2\55\4\0\22\55\1\260"+
    "\17\55\23\0\2\55\4\0\10\55\1\261\31\55\23\0"+
    "\2\55\4\0\4\55\1\262\35\55\23\0\2\55\4\0"+
    "\25\55\1\263\14\55\23\0\2\55\4\0\4\55\1\264"+
    "\35\55\23\0\2\55\4\0\2\55\1\265\37\55\23\0"+
    "\2\55\4\0\1\55\1\266\40\55\23\0\2\55\4\0"+
    "\2\55\1\267\37\55\23\0\2\55\4\0\3\55\1\270"+
    "\36\55\23\0\2\55\4\0\2\55\1\271\37\55\23\0"+
    "\2\55\4\0\2\55\1\272\37\55\23\0\2\55\4\0"+
    "\5\55\1\273\34\55\23\0\2\55\4\0\4\55\1\274"+
    "\35\55\23\0\2\55\4\0\4\55\1\275\35\55\23\0"+
    "\2\55\4\0\5\55\1\276\34\55\23\0\2\55\4\0"+
    "\4\55\1\277\35\55\23\0\2\55\4\0\10\55\1\300"+
    "\31\55\23\0\2\55\4\0\5\55\1\301\34\55\23\0"+
    "\2\55\4\0\25\55\1\302\14\55\23\0\2\55\4\0"+
    "\3\55\1\241\36\55\23\0\2\55\4\0\5\55\1\303"+
    "\34\55\23\0\2\55\4\0\4\55\1\304\35\55\23\0"+
    "\2\55\4\0\5\55\1\305\34\55\23\0\2\55\4\0"+
    "\10\55\1\306\31\55\23\0\2\55\4\0\35\55\1\307"+
    "\4\55\23\0\2\55\4\0\13\55\1\310\26\55\23\0"+
    "\2\55\4\0\1\55\1\311\40\55\23\0\2\55\4\0"+
    "\1\55\1\312\40\55\23\0\2\55\4\0\10\55\1\313"+
    "\31\55\23\0\2\55\4\0\22\55\1\314\17\55\23\0"+
    "\2\55\4\0\16\55\1\315\23\55\23\0\2\55\4\0"+
    "\25\55\1\316\14\55\23\0\2\55\4\0\7\55\1\317"+
    "\32\55\23\0\2\55\4\0\24\55\1\320\15\55\23\0"+
    "\2\55\4\0\10\55\1\321\31\55\23\0\2\55\4\0"+
    "\10\55\1\322\31\55\23\0\2\55\4\0\7\55\1\323"+
    "\32\55\22\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9794];
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
    "\1\0\1\11\4\1\2\11\36\1\6\11\1\1\1\0"+
    "\1\1\1\11\34\1\3\11\1\0\35\1\1\0\32\1"+
    "\1\11\112\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[211];
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
    public String lexeme;


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
    while (i < 168) {
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
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
        case 21: 
          { lexeme=yytext(); return Identificador;
          }
        case 54: break;
        case 53: 
          { lexeme=yytext(); return ordenprincipal;
          }
        case 55: break;
        case 44: 
          { lexeme=yytext(); return mostrar;
          }
        case 56: break;
        case 20: 
          { lexeme=yytext(); return P_coma;
          }
        case 57: break;
        case 16: 
          { lexeme=yytext(); return Llave_a;
          }
        case 58: break;
        case 46: 
          { lexeme=yytext(); return conjunto;
          }
        case 59: break;
        case 29: 
          { lexeme=yytext(); return Else;
          }
        case 60: break;
        case 40: 
          { lexeme=yytext(); return inicio;
          }
        case 61: break;
        case 42: 
          { lexeme=yytext(); return boleano;
          }
        case 62: break;
        case 34: 
          { lexeme=yytext(); return nuevo;
          }
        case 63: break;
        case 45: 
          { lexeme=yytext(); return grafico;
          }
        case 64: break;
        case 6: 
          { return Linea;
          }
        case 65: break;
        case 30: 
          { lexeme=yytext(); return For;
          }
        case 66: break;
        case 5: 
          { lexeme=yytext(); return Division;
          }
        case 67: break;
        case 13: 
          { lexeme = yytext(); return Op_relacional;
          }
        case 68: break;
        case 12: 
          { lexeme=yytext(); return Op_logico;
          }
        case 69: break;
        case 22: 
          { lexeme = yytext(); return Op_atribucion;
          }
        case 70: break;
        case 26: 
          { lexeme=yytext(); return fin;
          }
        case 71: break;
        case 25: 
          { lexeme = yytext(); return Op_incremento;
          }
        case 72: break;
        case 43: 
          { lexeme=yytext(); return validar;
          }
        case 73: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 74: break;
        case 17: 
          { lexeme=yytext(); return Llave_c;
          }
        case 75: break;
        case 27: 
          { lexeme=yytext(); return con;
          }
        case 76: break;
        case 14: 
          { lexeme=yytext(); return Parentesis_a;
          }
        case 77: break;
        case 38: 
          { lexeme=yytext(); return estado;
          }
        case 78: break;
        case 7: 
          { lexeme=yytext(); return Comillas;
          }
        case 79: break;
        case 47: 
          { lexeme=yytext(); return caracter;
          }
        case 80: break;
        case 18: 
          { lexeme = yytext(); return Corchete_a;
          }
        case 81: break;
        case 41: 
          { lexeme=yytext(); return funcion;
          }
        case 82: break;
        case 36: 
          { lexeme=yytext(); return Do;
          }
        case 83: break;
        case 2: 
          { lexeme=yytext(); return elemento;
          }
        case 84: break;
        case 39: 
          { lexeme=yytext(); return cadena;
          }
        case 85: break;
        case 31: 
          { lexeme=yytext(); return Main;
          }
        case 86: break;
        case 10: 
          { lexeme=yytext(); return Resta;
          }
        case 87: break;
        case 37: 
          { lexeme=yytext(); return T_dato;
          }
        case 88: break;
        case 32: 
          { lexeme=yytext(); return afn;
          }
        case 89: break;
        case 49: 
          { lexeme=yytext(); return automata;
          }
        case 90: break;
        case 23: 
          { lexeme=yytext(); return er;
          }
        case 91: break;
        case 35: 
          { lexeme=yytext(); return hacia;
          }
        case 92: break;
        case 15: 
          { lexeme=yytext(); return Parentesis_c;
          }
        case 93: break;
        case 11: 
          { lexeme=yytext(); return Multiplicacion;
          }
        case 94: break;
        case 48: 
          { lexeme=yytext(); return alfabeto;
          }
        case 95: break;
        case 19: 
          { lexeme = yytext(); return Corchete_c;
          }
        case 96: break;
        case 1: 
          { return ERROR;
          }
        case 97: break;
        case 52: 
          { lexeme=yytext(); return Mostrartabla;
          }
        case 98: break;
        case 8: 
          { lexeme=yytext(); return Igual;
          }
        case 99: break;
        case 50: 
          { lexeme=yytext(); return While;
          }
        case 100: break;
        case 4: 
          { /*Ignore*/
          }
        case 101: break;
        case 28: 
          { lexeme = yytext(); return Op_booleano;
          }
        case 102: break;
        case 33: 
          { lexeme=yytext(); return afd;
          }
        case 103: break;
        case 24: 
          { lexeme=yytext(); return If;
          }
        case 104: break;
        case 51: 
          { lexeme=yytext(); return expre;
          }
        case 105: break;
        case 9: 
          { lexeme=yytext(); return Suma;
          }
        case 106: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}