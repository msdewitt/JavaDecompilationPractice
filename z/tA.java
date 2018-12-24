package z;

public class tA
{
  public OA jdField_else;
  public OA jdField_if;
  public OA jdField_null;
  public String jdField_byte;
  public int jdField_new;
  public tA jdField_void;
  
  public tA() {}
  
  /* Error */
  public static tA jdMethod_this(tA a, OA a, OA a)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +6 -> 7
    //   4: aconst_null
    //   5: areturn
    //   6: athrow
    //   7: aload_0
    //   8: dup
    //   9: dup2
    //   10: getfield 24	z/tA:void	Lz/tA;
    //   13: aload_1
    //   14: aload_2
    //   15: invokestatic 26	z/tA:this	(Lz/tA;Lz/OA;Lz/OA;)Lz/tA;
    //   18: putfield 24	z/tA:void	Lz/tA;
    //   21: getfield 28	z/tA:else	Lz/OA;
    //   24: getfield 33	z/OA:super	I
    //   27: istore_3
    //   28: getfield 35	z/tA:if	Lz/OA;
    //   31: getfield 33	z/OA:super	I
    //   34: istore 4
    //   36: aload_2
    //   37: aload_1
    //   38: getfield 33	z/OA:super	I
    //   41: istore 5
    //   43: ifnonnull +9 -> 52
    //   46: ldc 36
    //   48: goto +8 -> 56
    //   51: athrow
    //   52: aload_2
    //   53: getfield 33	z/OA:super	I
    //   56: istore 6
    //   58: iload 5
    //   60: iload 4
    //   62: if_icmpge +113 -> 175
    //   65: iload 6
    //   67: iload_3
    //   68: if_icmple +107 -> 175
    //   71: iload 5
    //   73: iload_3
    //   74: if_icmpgt +24 -> 98
    //   77: iload 6
    //   79: iload 4
    //   81: if_icmplt +10 -> 91
    //   84: aload_0
    //   85: getfield 24	z/tA:void	Lz/tA;
    //   88: dup
    //   89: astore_0
    //   90: areturn
    //   91: aload_0
    //   92: dup
    //   93: aload_2
    //   94: putfield 28	z/tA:else	Lz/OA;
    //   97: areturn
    //   98: iload 6
    //   100: iload 4
    //   102: if_icmplt +10 -> 112
    //   105: aload_0
    //   106: dup
    //   107: aload_1
    //   108: putfield 35	z/tA:if	Lz/OA;
    //   111: areturn
    //   112: new 2	z/tA
    //   115: dup
    //   116: invokespecial 37	z/tA:<init>	()V
    //   119: dup
    //   120: astore_3
    //   121: dup
    //   122: aload_0
    //   123: dup_x2
    //   124: aload_0
    //   125: aload_3
    //   126: dup_x1
    //   127: aload_3
    //   128: aload_0
    //   129: dup_x1
    //   130: aload_0
    //   131: aload_3
    //   132: dup_x1
    //   133: aload_2
    //   134: putfield 28	z/tA:else	Lz/OA;
    //   137: getfield 35	z/tA:if	Lz/OA;
    //   140: putfield 35	z/tA:if	Lz/OA;
    //   143: getfield 39	z/tA:null	Lz/OA;
    //   146: putfield 39	z/tA:null	Lz/OA;
    //   149: getfield 41	z/tA:byte	Ljava/lang/String;
    //   152: putfield 41	z/tA:byte	Ljava/lang/String;
    //   155: getfield 43	z/tA:new	I
    //   158: putfield 43	z/tA:new	I
    //   161: getfield 24	z/tA:void	Lz/tA;
    //   164: putfield 24	z/tA:void	Lz/tA;
    //   167: aload_0
    //   168: aload_1
    //   169: putfield 35	z/tA:if	Lz/OA;
    //   172: putfield 24	z/tA:void	Lz/tA;
    //   175: aload_0
    //   176: areturn
    // Line number table:
    //   Java source line #84	-> byte code offset #0
    //   Java source line #85	-> byte code offset #4
    //   Java source line #87	-> byte code offset #7
    //   Java source line #89	-> byte code offset #21
    //   Java source line #90	-> byte code offset #28
    //   Java source line #91	-> byte code offset #37
    //   Java source line #92	-> byte code offset #43
    //   Java source line #94	-> byte code offset #58
    //   Java source line #95	-> byte code offset #71
    //   Java source line #96	-> byte code offset #77
    //   Java source line #98	-> byte code offset #84
    //   Java source line #101	-> byte code offset #91
    //   Java source line #103	-> byte code offset #98
    //   Java source line #105	-> byte code offset #105
    //   Java source line #108	-> byte code offset #112
    //   Java source line #109	-> byte code offset #128
    //   Java source line #110	-> byte code offset #137
    //   Java source line #111	-> byte code offset #143
    //   Java source line #112	-> byte code offset #149
    //   Java source line #113	-> byte code offset #155
    //   Java source line #114	-> byte code offset #161
    //   Java source line #115	-> byte code offset #167
    //   Java source line #116	-> byte code offset #172
    //   Java source line #119	-> byte code offset #175
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	a	tA
    //   0	177	1	a	OA
    //   0	177	2	a	OA
  }
}
