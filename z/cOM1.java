package z;

import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;



















































































































































































































































































































































































































































































































































































































































































































































































































public final class cOM1
  extends DefaultHandler
{
  private String jdField_if;
  private final ContentHandler jdField_null;
  private Aux jdField_byte;
  private boolean jdField_new;
  private ContentHandler jdField_void;
  
  public cOM1(String a, ContentHandler a, Aux a)
  {
    int tmp13_12 = 1;tmp13_12;
    


















      0jdField_new = tmp13_12;
    jdField_if = a;
    jdField_null = a;
    jdField_byte = a;
  }
  
  /* Error */
  public final void startElement(String a, String a, String a, org.xml.sax.Attributes a)
    throws SAXException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 25	z/cOM1:new	Z
    //   4: ifeq +19 -> 23
    //   7: aload_0
    //   8: getfield 39	z/cOM1:void	Lorg/xml/sax/ContentHandler;
    //   11: aload_1
    //   12: aload_2
    //   13: aload_3
    //   14: aload 4
    //   16: invokeinterface 43 5 0
    //   21: return
    //   22: athrow
    //   23: aload_2
    //   24: aload_0
    //   25: getfield 27	z/cOM1:if	Ljava/lang/String;
    //   28: invokevirtual 49	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   31: ifeq +49 -> 80
    //   34: iconst_1
    //   35: aload_0
    //   36: dup
    //   37: dup_x2
    //   38: aload_0
    //   39: dup
    //   40: getfield 31	z/cOM1:byte	Lz/Aux;
    //   43: invokeinterface 53 1 0
    //   48: putfield 39	z/cOM1:void	Lorg/xml/sax/ContentHandler;
    //   51: getfield 39	z/cOM1:void	Lorg/xml/sax/ContentHandler;
    //   54: invokeinterface 56 1 0
    //   59: getfield 39	z/cOM1:void	Lorg/xml/sax/ContentHandler;
    //   62: aload_1
    //   63: aload_2
    //   64: aload_3
    //   65: aload 4
    //   67: invokeinterface 43 5 0
    //   72: iconst_1
    //   73: dup
    //   74: pop2
    //   75: putfield 25	z/cOM1:new	Z
    //   78: return
    //   79: athrow
    //   80: aload_0
    //   81: getfield 29	z/cOM1:null	Lorg/xml/sax/ContentHandler;
    //   84: ifnull +17 -> 101
    //   87: aload_0
    //   88: getfield 29	z/cOM1:null	Lorg/xml/sax/ContentHandler;
    //   91: aload_1
    //   92: aload_2
    //   93: aload_3
    //   94: aload 4
    //   96: invokeinterface 43 5 0
    //   101: return
    // Line number table:
    //   Java source line #834	-> byte code offset #0
    //   Java source line #835	-> byte code offset #7
    //   Java source line #837	-> byte code offset #23
    //   Java source line #838	-> byte code offset #34
    //   Java source line #839	-> byte code offset #43
    //   Java source line #840	-> byte code offset #51
    //   Java source line #841	-> byte code offset #59
    //   Java source line #843	-> byte code offset #72
    //   Java source line #844	-> byte code offset #80
    //   Java source line #845	-> byte code offset #87
    //   Java source line #847	-> byte code offset #101
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	102	0	a	cOM1
    //   0	102	1	a	String
    //   0	102	2	a	String
    //   0	102	3	a	String
    //   0	102	4	a	org.xml.sax.Attributes
  }
  
  public final void endElement(String a, String a, String a)
    throws SAXException
  {
    if (jdField_new) {
      jdField_void.endElement(a, a, a);
      if (a.equals(jdField_if)) {
        jdField_void.endDocument(); int 
          tmp42_41 = 1;tmp42_41;0jdField_new = tmp42_41;return;throw a;
      }
    } else if (jdField_null != null) {
      jdField_null.endElement(a, a, a);
    }
  }
  
  public final void startDocument() throws SAXException
  {
    if (jdField_null != null) {
      jdField_null.startDocument();
    }
  }
  
  public final void endDocument() throws SAXException
  {
    if (jdField_null != null) {
      jdField_null.endDocument();
    }
  }
  
  /* Error */
  public final void characters(char[] a, int a, int a)
    throws SAXException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 25	z/cOM1:new	Z
    //   4: ifeq +17 -> 21
    //   7: aload_0
    //   8: getfield 39	z/cOM1:void	Lorg/xml/sax/ContentHandler;
    //   11: aload_1
    //   12: iload_2
    //   13: iload_3
    //   14: invokeinterface 72 4 0
    //   19: return
    //   20: athrow
    //   21: aload_0
    //   22: getfield 29	z/cOM1:null	Lorg/xml/sax/ContentHandler;
    //   25: ifnull +15 -> 40
    //   28: aload_0
    //   29: getfield 29	z/cOM1:null	Lorg/xml/sax/ContentHandler;
    //   32: aload_1
    //   33: iload_2
    //   34: iload_3
    //   35: invokeinterface 72 4 0
    //   40: return
    // Line number table:
    //   Java source line #881	-> byte code offset #0
    //   Java source line #882	-> byte code offset #7
    //   Java source line #883	-> byte code offset #21
    //   Java source line #884	-> byte code offset #28
    //   Java source line #886	-> byte code offset #40
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	41	0	a	cOM1
    //   0	41	1	a	char[]
    //   0	41	2	a	int
    //   0	41	3	a	int
  }
}
