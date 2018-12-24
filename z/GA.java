package z;

import java.util.HashMap;































public class GA
  extends HashMap<Xb, Xb>
{
  private static final long serialVersionUID = 1L;
  private final Xb jdField_if;
  private final Xb jdField_null;
  private final Xb jdField_byte;
  private final Xb jdField_new;
  private final Xb jdField_void;
  
  public GA()
  {
    a;a.<init>();jdField_if = a;
    
    a;a.<init>();jdField_null = a;
    
    a;a.<init>();jdField_byte = a;
    
    a;a.<init>();jdField_new = a;
    
    a;a.<init>();jdField_void = a;
  }
  
  public Xb jdMethod_this(int a) { jdField_if.jdMethod_this(a);
    
    if ((a = a.jdMethod_this(jdField_if)) == null) {
      a = new Xb(jdField_if);
      a.jdMethod_this(a);
    }
    return a;
  }
  
  public Xb jdMethod_this(float a) {
    jdField_if.jdMethod_this(a);
    
    if ((a = a.jdMethod_this(jdField_if)) == null) {
      a = new Xb(jdField_if);
      a.jdMethod_this(a);
    }
    return a;
  }
  
  public Xb jdMethod_this(long a) {
    jdField_if.jdMethod_this(a);
    
    if ((a = a.jdMethod_this(jdField_if)) == null) {
      a = new Xb(jdField_if);
      a.jdMethod_this(a);
    }
    return a;
  }
  
  public Xb jdMethod_this(double a) {
    jdField_if.jdMethod_this(a);
    
    if ((a = a.jdMethod_this(jdField_if)) == null) {
      a = new Xb(jdField_if);
      a.jdMethod_this(a);
    }
    return a;
  }
  
  /* Error */
  public Xb jdMethod_for(String a)
  {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: dup_x1
    //   3: getfield 25	z/GA:if	Lz/Xb;
    //   6: bipush 115
    //   8: iconst_1
    //   9: dup
    //   10: pop2
    //   11: aload_1
    //   12: aconst_null
    //   13: dup
    //   14: invokevirtual 68	z/Xb:this	(CLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   17: getfield 25	z/GA:if	Lz/Xb;
    //   20: invokespecial 43	z/GA:this	(Lz/Xb;)Lz/Xb;
    //   23: dup
    //   24: astore_1
    //   25: ifnonnull +20 -> 45
    //   28: new 22	z/Xb
    //   31: dup
    //   32: aload_0
    //   33: getfield 25	z/GA:if	Lz/Xb;
    //   36: invokespecial 46	z/Xb:<init>	(Lz/Xb;)V
    //   39: astore_1
    //   40: aload_0
    //   41: aload_1
    //   42: invokespecial 48	z/GA:this	(Lz/Xb;)V
    //   45: aload_1
    //   46: areturn
    // Line number table:
    //   Java source line #98	-> byte code offset #0
    //   Java source line #99	-> byte code offset #17
    //   Java source line #100	-> byte code offset #25
    //   Java source line #101	-> byte code offset #28
    //   Java source line #102	-> byte code offset #40
    //   Java source line #104	-> byte code offset #45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	47	0	a	GA
    //   0	47	1	a	String
    //   9	47	2	tmp9_8	int
  }
  
  /* Error */
  private Xb jdMethod_catch(String a)
  {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: dup_x1
    //   3: getfield 27	z/GA:null	Lz/Xb;
    //   6: bipush 83
    //   8: iconst_1
    //   9: dup
    //   10: pop2
    //   11: aload_1
    //   12: aconst_null
    //   13: dup
    //   14: invokevirtual 68	z/Xb:this	(CLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   17: getfield 27	z/GA:null	Lz/Xb;
    //   20: invokespecial 43	z/GA:this	(Lz/Xb;)Lz/Xb;
    //   23: dup
    //   24: astore_2
    //   25: ifnonnull +26 -> 51
    //   28: aload_0
    //   29: aload_1
    //   30: invokevirtual 72	z/GA:for	(Ljava/lang/String;)Lz/Xb;
    //   33: new 22	z/Xb
    //   36: dup
    //   37: aload_0
    //   38: getfield 27	z/GA:null	Lz/Xb;
    //   41: invokespecial 46	z/Xb:<init>	(Lz/Xb;)V
    //   44: astore_2
    //   45: aload_0
    //   46: aload_2
    //   47: invokespecial 48	z/GA:this	(Lz/Xb;)V
    //   50: pop
    //   51: aload_2
    //   52: areturn
    // Line number table:
    //   Java source line #108	-> byte code offset #0
    //   Java source line #109	-> byte code offset #17
    //   Java source line #110	-> byte code offset #25
    //   Java source line #111	-> byte code offset #28
    //   Java source line #112	-> byte code offset #33
    //   Java source line #113	-> byte code offset #45
    //   Java source line #115	-> byte code offset #51
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	a	GA
    //   0	53	1	a	String
    //   24	28	2	localXb	Xb
    //   9	53	3	tmp9_8	int
  }
  
  /* Error */
  public Xb jdMethod_true(String a)
  {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: dup_x1
    //   3: getfield 27	z/GA:null	Lz/Xb;
    //   6: bipush 67
    //   8: iconst_1
    //   9: dup
    //   10: pop2
    //   11: aload_1
    //   12: aconst_null
    //   13: dup
    //   14: invokevirtual 68	z/Xb:this	(CLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   17: getfield 27	z/GA:null	Lz/Xb;
    //   20: invokespecial 43	z/GA:this	(Lz/Xb;)Lz/Xb;
    //   23: dup
    //   24: astore_2
    //   25: ifnonnull +26 -> 51
    //   28: aload_0
    //   29: aload_1
    //   30: invokevirtual 72	z/GA:for	(Ljava/lang/String;)Lz/Xb;
    //   33: new 22	z/Xb
    //   36: dup
    //   37: aload_0
    //   38: getfield 27	z/GA:null	Lz/Xb;
    //   41: invokespecial 46	z/Xb:<init>	(Lz/Xb;)V
    //   44: astore_2
    //   45: aload_0
    //   46: aload_2
    //   47: invokespecial 48	z/GA:this	(Lz/Xb;)V
    //   50: pop
    //   51: aload_2
    //   52: areturn
    // Line number table:
    //   Java source line #119	-> byte code offset #0
    //   Java source line #120	-> byte code offset #17
    //   Java source line #121	-> byte code offset #25
    //   Java source line #122	-> byte code offset #28
    //   Java source line #123	-> byte code offset #33
    //   Java source line #124	-> byte code offset #45
    //   Java source line #126	-> byte code offset #51
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	a	GA
    //   0	53	1	a	String
    //   24	28	2	localXb	Xb
    //   9	53	3	tmp9_8	int
  }
  
  /* Error */
  public Xb jdMethod_this(String a)
  {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: dup_x1
    //   3: getfield 27	z/GA:null	Lz/Xb;
    //   6: bipush 116
    //   8: iconst_1
    //   9: dup
    //   10: pop2
    //   11: aload_1
    //   12: aconst_null
    //   13: dup
    //   14: invokevirtual 68	z/Xb:this	(CLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   17: getfield 27	z/GA:null	Lz/Xb;
    //   20: invokespecial 43	z/GA:this	(Lz/Xb;)Lz/Xb;
    //   23: dup
    //   24: astore_2
    //   25: ifnonnull +26 -> 51
    //   28: aload_0
    //   29: aload_1
    //   30: invokevirtual 72	z/GA:for	(Ljava/lang/String;)Lz/Xb;
    //   33: new 22	z/Xb
    //   36: dup
    //   37: aload_0
    //   38: getfield 27	z/GA:null	Lz/Xb;
    //   41: invokespecial 46	z/Xb:<init>	(Lz/Xb;)V
    //   44: astore_2
    //   45: aload_0
    //   46: aload_2
    //   47: invokespecial 48	z/GA:this	(Lz/Xb;)V
    //   50: pop
    //   51: aload_2
    //   52: areturn
    // Line number table:
    //   Java source line #130	-> byte code offset #0
    //   Java source line #131	-> byte code offset #17
    //   Java source line #132	-> byte code offset #25
    //   Java source line #133	-> byte code offset #28
    //   Java source line #134	-> byte code offset #33
    //   Java source line #135	-> byte code offset #45
    //   Java source line #137	-> byte code offset #51
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	a	GA
    //   0	53	1	a	String
    //   24	28	2	localXb	Xb
    //   9	53	3	tmp9_8	int
  }
  
  public Xb jdMethod_this(int a, String a, String a, String a, boolean a)
  {
    1; int tmp12_11 = 1; int tmp13_12 = tmp12_11;tmp13_12; if (a != 0) { int tmp25_24 = 1;tmp25_24; if (9 != tmp25_24) { int tmp32_31 = 1;;; break label42; throw 4; } } int tmp40_39 = 1;tmp40_39; label42: a.jdMethod_this((char)(0 + tmp40_39), a, a, a);
    Xb localXb;
    if ((localXb = a.jdMethod_this(jdField_new)) == null) {
      int tmp68_67 = 1;tmp68_67; if (4 <= tmp68_67) {
        ;; break label97; throw (tmp12_11 - tmp13_12);
      } else {
        a.jdMethod_this(a, a, a, a); }
      label97:
      localXb = new Xb(jdField_new);
      a.jdMethod_this(localXb);
    }
    return localXb;
  }
  
  /* Error */
  public Xb jdMethod_this(Object a)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 87
    //   4: ifeq +18 -> 22
    //   7: aload_1
    //   8: checkcast 87	java/lang/Integer
    //   11: invokevirtual 91	java/lang/Integer:intValue	()I
    //   14: istore_2
    //   15: aload_0
    //   16: iload_2
    //   17: invokevirtual 93	z/GA:this	(I)Lz/Xb;
    //   20: areturn
    //   21: athrow
    //   22: aload_1
    //   23: instanceof 95
    //   26: ifeq +18 -> 44
    //   29: aload_1
    //   30: checkcast 95	java/lang/Float
    //   33: invokevirtual 99	java/lang/Float:floatValue	()F
    //   36: fstore_2
    //   37: aload_0
    //   38: fload_2
    //   39: invokevirtual 101	z/GA:this	(F)Lz/Xb;
    //   42: areturn
    //   43: athrow
    //   44: aload_1
    //   45: instanceof 103
    //   48: ifeq +17 -> 65
    //   51: aload_1
    //   52: checkcast 103	java/lang/Long
    //   55: invokevirtual 107	java/lang/Long:longValue	()J
    //   58: lstore_2
    //   59: aload_0
    //   60: lload_2
    //   61: invokevirtual 109	z/GA:this	(J)Lz/Xb;
    //   64: areturn
    //   65: aload_1
    //   66: instanceof 111
    //   69: ifeq +17 -> 86
    //   72: aload_1
    //   73: checkcast 111	java/lang/Double
    //   76: invokevirtual 115	java/lang/Double:doubleValue	()D
    //   79: dstore_2
    //   80: aload_0
    //   81: dload_2
    //   82: invokevirtual 117	z/GA:this	(D)Lz/Xb;
    //   85: areturn
    //   86: aload_1
    //   87: instanceof 84
    //   90: ifeq +12 -> 102
    //   93: aload_0
    //   94: aload_1
    //   95: checkcast 84	java/lang/String
    //   98: invokespecial 119	z/GA:catch	(Ljava/lang/String;)Lz/Xb;
    //   101: areturn
    //   102: aload_1
    //   103: instanceof 121
    //   106: ifeq +58 -> 164
    //   109: aload_1
    //   110: checkcast 121	z/iB
    //   113: dup
    //   114: astore_2
    //   115: invokevirtual 123	z/iB:for	()I
    //   118: dup
    //   119: istore_3
    //   120: bipush 10
    //   122: iconst_1
    //   123: dup
    //   124: pop2
    //   125: if_icmpne +12 -> 137
    //   128: aload_0
    //   129: aload_2
    //   130: invokevirtual 126	z/iB:true	()Ljava/lang/String;
    //   133: invokevirtual 128	z/GA:true	(Ljava/lang/String;)Lz/Xb;
    //   136: areturn
    //   137: iload_3
    //   138: bipush 11
    //   140: iconst_1
    //   141: dup
    //   142: pop2
    //   143: if_icmpne +12 -> 155
    //   146: aload_0
    //   147: aload_2
    //   148: invokevirtual 130	z/iB:this	()Ljava/lang/String;
    //   151: invokevirtual 132	z/GA:this	(Ljava/lang/String;)Lz/Xb;
    //   154: areturn
    //   155: aload_0
    //   156: aload_2
    //   157: invokevirtual 130	z/iB:this	()Ljava/lang/String;
    //   160: invokevirtual 128	z/GA:true	(Ljava/lang/String;)Lz/Xb;
    //   163: areturn
    //   164: aload_1
    //   165: instanceof 134
    //   168: ifeq +33 -> 201
    //   171: aload_1
    //   172: checkcast 134	z/RA
    //   175: astore_2
    //   176: aload_0
    //   177: aload_2
    //   178: invokevirtual 136	z/RA:this	()I
    //   181: aload_2
    //   182: invokevirtual 138	z/RA:catch	()Ljava/lang/String;
    //   185: aload_2
    //   186: invokevirtual 139	z/RA:true	()Ljava/lang/String;
    //   189: aload_2
    //   190: invokevirtual 140	z/RA:this	()Ljava/lang/String;
    //   193: aload_2
    //   194: invokevirtual 143	z/RA:this	()Z
    //   197: invokevirtual 145	z/GA:this	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lz/Xb;
    //   200: areturn
    //   201: new 147	java/lang/IllegalArgumentException
    //   204: dup
    //   205: new 149	java/lang/StringBuilder
    //   208: dup
    //   209: invokespecial 150	java/lang/StringBuilder:<init>	()V
    //   212: iconst_0
    //   213: ldc -104
    //   215: invokestatic 157	z/LPT2:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   218: invokevirtual 161	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   221: aload_1
    //   222: invokevirtual 165	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   225: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   228: invokespecial 171	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   231: athrow
    // Line number table:
    //   Java source line #157	-> byte code offset #0
    //   Java source line #158	-> byte code offset #7
    //   Java source line #159	-> byte code offset #15
    //   Java source line #160	-> byte code offset #22
    //   Java source line #161	-> byte code offset #29
    //   Java source line #162	-> byte code offset #37
    //   Java source line #163	-> byte code offset #44
    //   Java source line #164	-> byte code offset #51
    //   Java source line #165	-> byte code offset #59
    //   Java source line #166	-> byte code offset #65
    //   Java source line #167	-> byte code offset #72
    //   Java source line #168	-> byte code offset #80
    //   Java source line #169	-> byte code offset #86
    //   Java source line #170	-> byte code offset #93
    //   Java source line #171	-> byte code offset #102
    //   Java source line #172	-> byte code offset #109
    //   Java source line #173	-> byte code offset #115
    //   Java source line #174	-> byte code offset #120
    //   Java source line #175	-> byte code offset #128
    //   Java source line #176	-> byte code offset #137
    //   Java source line #177	-> byte code offset #146
    //   Java source line #179	-> byte code offset #155
    //   Java source line #181	-> byte code offset #164
    //   Java source line #182	-> byte code offset #171
    //   Java source line #183	-> byte code offset #176
    //   Java source line #185	-> byte code offset #201
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	232	0	a	GA
    //   0	232	1	a	Object
  }
  
  public Xb jdMethod_this(String a, String a, String a)
  {
    int tmp9_8 = 1;tmp9_8;71.jdMethod_this(tmp9_8, a, a, a);
    Xb localXb;
    if ((localXb = a.jdMethod_this(jdField_byte.jdField_byte)) == null)
    {

      localXb = new Xb(jdField_byte);
      a.jdMethod_this(localXb);a.jdMethod_this(a, a);
    }
    return localXb;
  }
  
  public Xb jdMethod_this(String a, String a, String a, boolean a)
  {
    if (a != 0) { int tmp12_11 = 1;tmp12_11;tmpTernaryOp = a; break label25; throw tmp12_11; } else { 1; } label25: 77.jdMethod_this(tmp22_21, a, a, a);
    
    if ((a = a.jdMethod_this(jdField_byte)) == null)
    {

      a = new Xb(jdField_byte);
      a.jdMethod_this(a);a.jdMethod_this(a, a);
    }
    return a;
  }
  
  public Xb jdMethod_this(String a, String a, RA a, Object... a)
  {
    jdField_void.jdMethod_this(a, a, a, a);
    Xb localXb;
    if ((localXb = a.jdMethod_this(jdField_void)) == null)
    {


      int tmp58_57 = 1;tmp58_57;a = tmp58_57; for (0; a < a.length;) { 
          a.jdMethod_this(a[(a++)]);tmpTernaryOp = a; continue;throw a.jdMethod_this(a.jdMethod_this(), a.jdMethod_catch(), a.jdMethod_true(), a.jdMethod_this(), a.jdMethod_this());
      }
      localXb = new Xb(jdField_void);
      a.jdMethod_this(localXb);
    }
    return localXb;
  }
  
  public Xb jdMethod_this(String a, String a) {
    int tmp9_8 = 1;tmp9_8;84.jdMethod_this(tmp9_8, a, a, null);
    Xb localXb;
    if ((localXb = a.jdMethod_this(jdField_null.jdField_null)) == null)
    {

      localXb = new Xb(jdField_null);
      a.jdMethod_this(localXb);a.jdMethod_for(a);
    }
    return localXb;
  }
  
  private Xb jdMethod_this(Xb a) {
    return (Xb)a.get(a);
  }
  
  private void jdMethod_this(Xb a) {
    Xb tmp2_1 = a;a.put(tmp2_1, tmp2_1);
  }
}
