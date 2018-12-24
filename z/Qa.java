package z;












public class Qa
{
  public static final int jdField_else = 0;
  









  public static final int jdField_if = 1;
  









  public static final int jdField_null = 2;
  









  public static final int jdField_byte = 3;
  









  public byte[] jdField_new;
  









  public int jdField_void;
  










  public Qa(byte[] a, int a)
  {
    jdField_new = a;
    jdField_void = a;
  }
  




  public int jdMethod_this()
  {
    return jdField_new[jdField_void];
  }
  








  public int jdMethod_true(int a)
  {
    int tmp11_10 = 1;tmp11_10; int tmp17_16 = 1; int tmp18_17 = tmp17_16;tmp18_17;return (2 + tmp11_10 * a)[(tmp17_16 + tmp18_17)];
  }
  









  public int jdMethod_this(int a)
  {
    int tmp11_10 = 1;tmp11_10; int tmp18_17 = 1;tmp18_17;return (2 + tmp11_10 * a)[(2 + tmp18_17)];
  }
  
  /* Error */
  public static Qa jdMethod_this(String a)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +10 -> 11
    //   4: aload_0
    //   5: invokevirtual 38	java/lang/String:length	()I
    //   8: ifne +6 -> 14
    //   11: aconst_null
    //   12: areturn
    //   13: athrow
    //   14: aload_0
    //   15: invokevirtual 38	java/lang/String:length	()I
    //   18: istore_1
    //   19: new 40	z/zb
    //   22: dup
    //   23: iload_1
    //   24: invokespecial 43	z/zb:<init>	(I)V
    //   27: dup
    //   28: astore_2
    //   29: iconst_0
    //   30: iconst_1
    //   31: dup
    //   32: pop2
    //   33: invokevirtual 47	z/zb:catch	(I)Lz/zb;
    //   36: iconst_0
    //   37: iconst_1
    //   38: dup
    //   39: pop2
    //   40: istore_3
    //   41: pop
    //   42: iload_3
    //   43: iload_1
    //   44: if_icmpge +213 -> 257
    //   47: aload_0
    //   48: iload_3
    //   49: invokevirtual 51	java/lang/String:charAt	(I)C
    //   52: dup
    //   53: istore 4
    //   55: iinc 3 1
    //   58: bipush 91
    //   60: iconst_1
    //   61: dup
    //   62: pop2
    //   63: if_icmpne +20 -> 83
    //   66: aload_2
    //   67: iconst_0
    //   68: iconst_1
    //   69: dup
    //   70: pop2
    //   71: iconst_0
    //   72: iconst_1
    //   73: dup
    //   74: pop2
    //   75: invokevirtual 54	z/zb:true	(II)Lz/zb;
    //   78: pop
    //   79: goto -37 -> 42
    //   82: athrow
    //   83: iload 4
    //   85: bipush 46
    //   87: iconst_1
    //   88: dup
    //   89: pop2
    //   90: if_icmpne +19 -> 109
    //   93: aload_2
    //   94: iconst_1
    //   95: dup
    //   96: pop2
    //   97: iconst_0
    //   98: iconst_1
    //   99: dup_x1
    //   100: dup
    //   101: pop2
    //   102: invokevirtual 54	z/zb:true	(II)Lz/zb;
    //   105: pop
    //   106: goto -64 -> 42
    //   109: iload 4
    //   111: bipush 42
    //   113: iconst_1
    //   114: dup
    //   115: pop2
    //   116: if_icmpne +19 -> 135
    //   119: aload_2
    //   120: iconst_2
    //   121: iconst_1
    //   122: dup
    //   123: pop2
    //   124: iconst_0
    //   125: iconst_1
    //   126: dup
    //   127: pop2
    //   128: invokevirtual 54	z/zb:true	(II)Lz/zb;
    //   131: pop
    //   132: goto -90 -> 42
    //   135: iload 4
    //   137: bipush 48
    //   139: iconst_1
    //   140: dup
    //   141: pop2
    //   142: if_icmplt -100 -> 42
    //   145: iload 4
    //   147: bipush 57
    //   149: iconst_1
    //   150: dup
    //   151: pop2
    //   152: if_icmpgt -110 -> 42
    //   155: iload 4
    //   157: bipush 48
    //   159: iconst_1
    //   160: dup
    //   161: pop2
    //   162: isub
    //   163: istore 5
    //   165: iload_3
    //   166: iload_1
    //   167: if_icmpge +55 -> 222
    //   170: aload_0
    //   171: iload_3
    //   172: invokevirtual 51	java/lang/String:charAt	(I)C
    //   175: dup
    //   176: istore 4
    //   178: bipush 48
    //   180: iconst_1
    //   181: dup
    //   182: pop2
    //   183: if_icmplt +39 -> 222
    //   186: iload 4
    //   188: bipush 57
    //   190: iconst_1
    //   191: dup
    //   192: pop2
    //   193: if_icmpgt +29 -> 222
    //   196: iload 5
    //   198: bipush 10
    //   200: iconst_1
    //   201: dup
    //   202: pop2
    //   203: imul
    //   204: iload 4
    //   206: iadd
    //   207: bipush 48
    //   209: iconst_1
    //   210: dup
    //   211: iinc 3 1
    //   214: pop2
    //   215: isub
    //   216: istore 5
    //   218: iload_3
    //   219: goto -53 -> 166
    //   222: iload_3
    //   223: iload_1
    //   224: if_icmpge +19 -> 243
    //   227: aload_0
    //   228: iload_3
    //   229: invokevirtual 51	java/lang/String:charAt	(I)C
    //   232: bipush 59
    //   234: iconst_1
    //   235: dup
    //   236: pop2
    //   237: if_icmpne +6 -> 243
    //   240: iinc 3 1
    //   243: aload_2
    //   244: iconst_3
    //   245: iconst_1
    //   246: dup
    //   247: pop2
    //   248: iload 5
    //   250: invokevirtual 54	z/zb:true	(II)Lz/zb;
    //   253: pop
    //   254: goto -212 -> 42
    //   257: aload_2
    //   258: getfield 55	z/zb:new	[B
    //   261: iconst_0
    //   262: iconst_1
    //   263: dup
    //   264: pop2
    //   265: aload_2
    //   266: getfield 56	z/zb:void	I
    //   269: iconst_2
    //   270: iconst_1
    //   271: dup
    //   272: pop2
    //   273: idiv
    //   274: i2b
    //   275: bastore
    //   276: new 2	z/Qa
    //   279: dup
    //   280: aload_2
    //   281: getfield 55	z/zb:new	[B
    //   284: iconst_0
    //   285: iconst_1
    //   286: dup
    //   287: pop2
    //   288: invokespecial 58	z/Qa:<init>	([BI)V
    //   291: areturn
    // Line number table:
    //   Java source line #135	-> byte code offset #0
    //   Java source line #136	-> byte code offset #11
    //   Java source line #138	-> byte code offset #14
    //   Java source line #139	-> byte code offset #19
    //   Java source line #140	-> byte code offset #29
    //   Java source line #141	-> byte code offset #36
    //   Java source line #142	-> byte code offset #47
    //   Java source line #143	-> byte code offset #58
    //   Java source line #144	-> byte code offset #66
    //   Java source line #145	-> byte code offset #83
    //   Java source line #146	-> byte code offset #93
    //   Java source line #147	-> byte code offset #109
    //   Java source line #148	-> byte code offset #119
    //   Java source line #149	-> byte code offset #135
    //   Java source line #150	-> byte code offset #155
    //   Java source line #151	-> byte code offset #165
    //   Java source line #152	-> byte code offset #196
    //   Java source line #153	-> byte code offset #218
    //   Java source line #155	-> byte code offset #222
    //   Java source line #156	-> byte code offset #240
    //   Java source line #158	-> byte code offset #243
    //   Java source line #160	-> byte code offset #254
    //   Java source line #161	-> byte code offset #257
    //   Java source line #162	-> byte code offset #276
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	292	0	a	String
  }
  
  public String toString()
  {
    int i = a.jdMethod_this(); int 
      tmp12_11 = 1;tmp12_11;i.<init>(2 * tmp12_11);
    StringBuilder localStringBuilder; 1;
    int j; switch (a.jdMethod_true(j)) {
    case 0: 
      int tmp72_71 = ;;;;
    case 1: 
    case 2: 
      for (;;)
      {
        break;
        


        throw 0; int 
        
          tmp86_85 = 1;tmp86_85;46.append(tmp86_85);tmpTernaryOp = localStringBuilder;
        break;throw (localStringBuilder = new java/lang/StringBuilder); int 
        
          tmp100_99 = 1;tmp100_99;42.append(tmp100_99);
      }
    case 3: 
      int tmp124_123 = 1;tmp124_123;59.append(tmp124_123);tmpTernaryOp = localStringBuilder.append(a.jdMethod_this(j));
      break;
    default: 
      int tmp137_136 = 1;tmp137_136;(0 == 0 ? localStringBuilder : 95.append(tmp137_136));
    }
    j++;
    
















    return localStringBuilder.toString();
  }
}
