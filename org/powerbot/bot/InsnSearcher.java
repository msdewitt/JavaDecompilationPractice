package org.powerbot.bot;

import z.COm9;

class InsnSearcher
{
  private final COm9 jdField_new;
  private COm9 jdField_void;
  
  public InsnSearcher(z.Com9 a)
  {
    a.<init>(TB);
  }
  
  private InsnSearcher(z.Xa a) {
    a.<init>(a.jdMethod_true());
  }
  
  private InsnSearcher(COm9 a) {
    jdField_new = a;
    jdField_void = a;
  }
  
  public COm9 current() {
    return jdField_void;
  }
  
  private void jdMethod_this(COm9 a) {
    jdField_void = a;
  }
  
  public void reset() {
    jdField_void = jdField_new;
  }
  
  private COm9 jdMethod_true() {
    jdField_void = jdField_void.jdMethod_this();
    while (jdField_void != null) { int tmp27_26 = 1;tmp27_26; if (-1 == tmp27_26) {
        jdField_void = jdField_void.jdMethod_this();tmpTernaryOp = a; continue;throw jdField_void.jdMethod_true();
      } }
    return jdField_void;
  }
  
  private COm9 jdMethod_this() {
    jdField_void = jdField_void.jdMethod_true();
    while (jdField_void != null) { int tmp27_26 = 1;tmp27_26; if (-1 == tmp27_26) {
        jdField_void = jdField_void.jdMethod_true();tmpTernaryOp = a; continue;throw jdField_void.jdMethod_true();
      } }
    return jdField_void;
  }
  

  public COm9 getNext(int a)
  {
    COm9 localCOm9;
    while (((localCOm9 = a.jdMethod_true()) != null) && (localCOm9.jdMethod_true() != a)) {}
    return localCOm9;
  }
  
  /* Error */
  public COm9 getPrevious(int a)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 57	org/powerbot/bot/InsnSearcher:this	()Lz/COm9;
    //   4: dup
    //   5: astore_2
    //   6: ifnull +14 -> 20
    //   9: aload_2
    //   10: invokevirtual 48	z/COm9:true	()I
    //   13: iload_1
    //   14: if_icmpne -14 -> 0
    //   17: aload_2
    //   18: areturn
    //   19: athrow
    //   20: aload_2
    //   21: areturn
    // Line number table:
    //   Java source line #63	-> byte code offset #0
    //   Java source line #64	-> byte code offset #6
    //   Java source line #65	-> byte code offset #18
    //   Java source line #68	-> byte code offset #20
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	22	0	a	InsnSearcher
    //   0	22	1	a	int
  }
  
  /* Error */
  public COm9 getNext(int[] a)
  {
    // Byte code:
    //   0: aload_1
    //   1: arraylength
    //   2: iconst_1
    //   3: dup
    //   4: dup
    //   5: pop2
    //   6: if_icmpge +6 -> 12
    //   9: aconst_null
    //   10: areturn
    //   11: athrow
    //   12: aload_0
    //   13: invokespecial 54	org/powerbot/bot/InsnSearcher:true	()Lz/COm9;
    //   16: dup
    //   17: astore_3
    //   18: ifnonnull +6 -> 24
    //   21: aload_3
    //   22: areturn
    //   23: athrow
    //   24: aload_3
    //   25: invokevirtual 48	z/COm9:true	()I
    //   28: aload_1
    //   29: iconst_0
    //   30: iconst_1
    //   31: dup
    //   32: pop2
    //   33: iaload
    //   34: if_icmpne -22 -> 12
    //   37: aload_0
    //   38: invokevirtual 60	org/powerbot/bot/InsnSearcher:current	()Lz/COm9;
    //   41: astore_2
    //   42: iconst_1
    //   43: dup
    //   44: dup
    //   45: pop2
    //   46: dup
    //   47: istore 5
    //   49: aload_1
    //   50: arraylength
    //   51: if_icmpge +63 -> 114
    //   54: aload_0
    //   55: invokespecial 54	org/powerbot/bot/InsnSearcher:true	()Lz/COm9;
    //   58: dup
    //   59: astore 4
    //   61: ifnull +53 -> 114
    //   64: aload 4
    //   66: invokevirtual 48	z/COm9:true	()I
    //   69: aload_1
    //   70: iload 5
    //   72: iaload
    //   73: if_icmpeq +18 -> 91
    //   76: aload_1
    //   77: iload 5
    //   79: iaload
    //   80: iconst_m1
    //   81: iconst_1
    //   82: dup
    //   83: pop2
    //   84: if_icmpeq +7 -> 91
    //   87: aload_0
    //   88: goto +27 -> 115
    //   91: iload 5
    //   93: aload_1
    //   94: arraylength
    //   95: iconst_1
    //   96: dup
    //   97: dup
    //   98: pop2
    //   99: isub
    //   100: if_icmpne +6 -> 106
    //   103: aload 4
    //   105: areturn
    //   106: iinc 5 1
    //   109: iload 5
    //   111: goto -62 -> 49
    //   114: aload_0
    //   115: aload_2
    //   116: invokespecial 62	org/powerbot/bot/InsnSearcher:this	(Lz/COm9;)V
    //   119: aload_0
    //   120: goto -107 -> 13
    //   123: nop
    //   124: athrow
    // Line number table:
    //   Java source line #72	-> byte code offset #0
    //   Java source line #73	-> byte code offset #9
    //   Java source line #78	-> byte code offset #12
    //   Java source line #79	-> byte code offset #18
    //   Java source line #80	-> byte code offset #22
    //   Java source line #82	-> byte code offset #24
    //   Java source line #83	-> byte code offset #37
    //   Java source line #85	-> byte code offset #42
    //   Java source line #86	-> byte code offset #54
    //   Java source line #87	-> byte code offset #61
    //   Java source line #88	-> byte code offset #88
    //   Java source line #90	-> byte code offset #91
    //   Java source line #91	-> byte code offset #103
    //   Java source line #85	-> byte code offset #106
    //   Java source line #94	-> byte code offset #114
    //   Java source line #97	-> byte code offset #123
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	a	InsnSearcher
    //   0	125	1	a	int[]
  }
}
