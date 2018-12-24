package z;




















public class lPT4
  extends auX
{
  private final Gb jdField_void;
  



















  public lPT4(auX a, Gb a)
  {
    a.<init>(327680, a, a);
  }
  
  public lPT4(int a, auX a, Gb a)
  {
    a.<init>(a, a);
    jdField_void_of_type_ZGb = a;
  }
  
  /* Error */
  public aux jdMethod_this(String a, boolean a)
  {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: getfield 26	z/lPT4:jdField_void_of_type_ZAuX	Lz/auX;
    //   5: swap
    //   6: getfield 21	z/lPT4:jdField_void_of_type_ZGb	Lz/Gb;
    //   9: aload_1
    //   10: invokevirtual 32	z/Gb:for	(Ljava/lang/String;)Ljava/lang/String;
    //   13: iload_2
    //   14: invokevirtual 34	z/auX:this	(Ljava/lang/String;Z)Lz/aux;
    //   17: dup
    //   18: astore_1
    //   19: ifnonnull +6 -> 25
    //   22: aconst_null
    //   23: areturn
    //   24: athrow
    //   25: new 36	z/aA
    //   28: dup
    //   29: aload_1
    //   30: aload_0
    //   31: getfield 21	z/lPT4:jdField_void_of_type_ZGb	Lz/Gb;
    //   34: invokespecial 39	z/aA:<init>	(Lz/aux;Lz/Gb;)V
    //   37: areturn
    // Line number table:
    //   Java source line #59	-> byte code offset #0
    //   Java source line #61	-> byte code offset #19
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	38	0	a	lPT4
    //   0	38	1	a	String
    //   0	38	2	a	int
  }
  
  /* Error */
  public aux jdMethod_this(int a, Qa a, String a, boolean a)
  {
    // Byte code:
    //   0: iload_1
    //   1: aload_2
    //   2: aload_0
    //   3: dup_x2
    //   4: getfield 21	z/lPT4:jdField_void_of_type_ZGb	Lz/Gb;
    //   7: aload_3
    //   8: invokevirtual 32	z/Gb:for	(Ljava/lang/String;)Ljava/lang/String;
    //   11: iload 4
    //   13: invokespecial 47	z/auX:this	(ILz/Qa;Ljava/lang/String;Z)Lz/aux;
    //   16: dup
    //   17: astore_1
    //   18: ifnonnull +6 -> 24
    //   21: aconst_null
    //   22: areturn
    //   23: athrow
    //   24: new 36	z/aA
    //   27: dup
    //   28: aload_1
    //   29: aload_0
    //   30: getfield 21	z/lPT4:jdField_void_of_type_ZGb	Lz/Gb;
    //   33: invokespecial 39	z/aA:<init>	(Lz/aux;Lz/Gb;)V
    //   36: areturn
    // Line number table:
    //   Java source line #67	-> byte code offset #0
    //   Java source line #68	-> byte code offset #8
    //   Java source line #67	-> byte code offset #13
    //   Java source line #69	-> byte code offset #18
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	a	lPT4
    //   0	37	1	a	int
    //   0	37	2	a	Qa
    //   0	37	3	a	String
    //   0	37	4	a	int
  }
}
