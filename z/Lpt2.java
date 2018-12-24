package z;









public class Lpt2
  extends cOn
{
  private String jdField_null;
  







  private cON jdField_byte;
  







  private final String jdField_new;
  







  private int jdField_void;
  







  public Lpt2(String a, cOn a)
  {
    a.<init>(327680, a, a);
  }
  
  public Lpt2(int a, String a, cOn a)
  {
    a.<init>(a, a);
    jdField_new = a;
  }
  


  public void jdMethod_this(int a, int a, String a, String a, String a, String[] a)
  {
    jdField_void_of_type_ZCOn.jdMethod_this(a, a, a, a, a, a);
    jdField_null = a;
  }
  
  /* Error */
  public cON jdMethod_this(int a, String a, String a, String a, String[] a)
  {
    // Byte code:
    //   0: ldc 38
    //   2: invokestatic 43	org/powerbot/bot/cache/Block:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   5: aload_2
    //   6: invokevirtual 49	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   9: ifeq +117 -> 126
    //   12: bipush 10
    //   14: iconst_1
    //   15: dup
    //   16: pop2
    //   17: istore 7
    //   19: new 51	java/lang/StringBuilder
    //   22: dup
    //   23: invokespecial 54	java/lang/StringBuilder:<init>	()V
    //   26: iconst_0
    //   27: aload_0
    //   28: getfield 26	z/Lpt2:new	Ljava/lang/String;
    //   31: invokevirtual 58	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   34: aload_0
    //   35: dup
    //   36: getfield 60	z/Lpt2:jdField_void_of_type_Int	I
    //   39: dup_x1
    //   40: iconst_1
    //   41: dup
    //   42: dup
    //   43: pop2
    //   44: iadd
    //   45: putfield 60	z/Lpt2:jdField_void_of_type_Int	I
    //   48: invokevirtual 64	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   51: invokevirtual 68	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   54: astore 8
    //   56: aload_0
    //   57: dup
    //   58: getfield 30	z/Lpt2:jdField_void_of_type_ZCOn	Lz/cOn;
    //   61: iload 7
    //   63: aload 8
    //   65: aload_3
    //   66: aload 4
    //   68: aload 5
    //   70: invokevirtual 70	z/cOn:this	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lz/cON;
    //   73: astore 6
    //   75: getfield 72	z/Lpt2:byte	Lz/cON;
    //   78: ifnonnull +20 -> 98
    //   81: aload_0
    //   82: dup
    //   83: getfield 30	z/Lpt2:jdField_void_of_type_ZCOn	Lz/cOn;
    //   86: iload 7
    //   88: aload_2
    //   89: aload_3
    //   90: aconst_null
    //   91: dup
    //   92: invokevirtual 70	z/cOn:this	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lz/cON;
    //   95: putfield 72	z/Lpt2:byte	Lz/cON;
    //   98: aload_0
    //   99: getfield 72	z/Lpt2:byte	Lz/cON;
    //   102: sipush 184
    //   105: iconst_1
    //   106: dup
    //   107: pop2
    //   108: aload_0
    //   109: getfield 34	z/Lpt2:null	Ljava/lang/String;
    //   112: aload 8
    //   114: aload_3
    //   115: iconst_0
    //   116: iconst_1
    //   117: dup
    //   118: pop2
    //   119: invokevirtual 77	z/cON:this	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    //   122: aload 6
    //   124: areturn
    //   125: athrow
    //   126: aload_0
    //   127: getfield 30	z/Lpt2:jdField_void_of_type_ZCOn	Lz/cOn;
    //   130: iload_1
    //   131: aload_2
    //   132: aload_3
    //   133: aload 4
    //   135: aload 5
    //   137: invokevirtual 70	z/cOn:this	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lz/cON;
    //   140: dup
    //   141: astore 6
    //   143: areturn
    // Line number table:
    //   Java source line #73	-> byte code offset #0
    //   Java source line #74	-> byte code offset #12
    //   Java source line #75	-> byte code offset #19
    //   Java source line #76	-> byte code offset #56
    //   Java source line #78	-> byte code offset #75
    //   Java source line #79	-> byte code offset #81
    //   Java source line #81	-> byte code offset #98
    //   Java source line #83	-> byte code offset #124
    //   Java source line #84	-> byte code offset #126
    //   Java source line #86	-> byte code offset #143
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	144	0	a	Lpt2
    //   0	144	1	a	int
    //   0	144	2	a	String
    //   0	144	3	a	String
    //   0	144	4	a	String
    //   0	144	5	a	String[]
    //   73	69	6	localCON	cON
    //   17	70	7	i	int
    //   54	59	8	str	String
  }
  
  public void jdMethod_this()
  {
    if (jdField_byte != null) {
      int tmp16_15 = 1;tmp16_15;'±'.jdMethod_this(tmp16_15); int 
        tmp26_25 = 1;tmp26_25; int tmp30_29 = 1;tmp30_29;tmp26_25.jdMethod_this(0, tmp30_29);
    }
    jdField_void_of_type_ZCOn.jdMethod_this();
  }
}
