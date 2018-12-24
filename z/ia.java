package z;




















@Deprecated
public class ia
  extends aux
{
  public final Gb jdField_void;
  



















  public ia(aux a, Gb a)
  {
    a.<init>(327680, a, a);
  }
  
  public ia(int a, aux a, Gb a)
  {
    a.<init>(a, a);
    jdField_void_of_type_ZGb = a;
  }
  
  public void jdMethod_this(String a, Object a)
  {
    jdField_void_of_type_ZAux.jdMethod_this(a, jdField_void_of_type_ZGb.jdMethod_this(a));
  }
  
  public void jdMethod_this(String a, String a, String a)
  {
    jdField_void_of_type_ZAux.jdMethod_this(a, jdField_void_of_type_ZGb.jdMethod_for(a), a);
  }
  
  /* Error */
  public aux jdMethod_this(String a, String a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	z/ia:jdField_void_of_type_ZAux	Lz/aux;
    //   4: aload_1
    //   5: aload_0
    //   6: getfield 22	z/ia:jdField_void_of_type_ZGb	Lz/Gb;
    //   9: aload_2
    //   10: invokevirtual 41	z/Gb:for	(Ljava/lang/String;)Ljava/lang/String;
    //   13: invokevirtual 46	z/aux:this	(Ljava/lang/String;Ljava/lang/String;)Lz/aux;
    //   16: dup
    //   17: astore_1
    //   18: ifnonnull +6 -> 24
    //   21: aconst_null
    //   22: areturn
    //   23: athrow
    //   24: aload_1
    //   25: aload_0
    //   26: getfield 27	z/ia:jdField_void_of_type_ZAux	Lz/aux;
    //   29: if_acmpne +6 -> 35
    //   32: aload_0
    //   33: areturn
    //   34: athrow
    //   35: new 2	z/ia
    //   38: dup
    //   39: aload_1
    //   40: aload_0
    //   41: getfield 22	z/ia:jdField_void_of_type_ZGb	Lz/Gb;
    //   44: invokespecial 48	z/ia:<init>	(Lz/aux;Lz/Gb;)V
    //   47: areturn
    // Line number table:
    //   Java source line #70	-> byte code offset #0
    //   Java source line #71	-> byte code offset #18
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	a	ia
    //   0	48	1	a	String
    //   0	48	2	a	String
  }
  
  /* Error */
  public aux jdMethod_this(String a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	z/ia:jdField_void_of_type_ZAux	Lz/aux;
    //   4: aload_1
    //   5: invokevirtual 55	z/aux:this	(Ljava/lang/String;)Lz/aux;
    //   8: dup
    //   9: astore_1
    //   10: ifnonnull +6 -> 16
    //   13: aconst_null
    //   14: areturn
    //   15: athrow
    //   16: aload_1
    //   17: aload_0
    //   18: getfield 27	z/ia:jdField_void_of_type_ZAux	Lz/aux;
    //   21: if_acmpne +6 -> 27
    //   24: aload_0
    //   25: areturn
    //   26: athrow
    //   27: new 2	z/ia
    //   30: dup
    //   31: aload_1
    //   32: aload_0
    //   33: getfield 22	z/ia:jdField_void_of_type_ZGb	Lz/Gb;
    //   36: invokespecial 48	z/ia:<init>	(Lz/aux;Lz/Gb;)V
    //   39: areturn
    // Line number table:
    //   Java source line #77	-> byte code offset #0
    //   Java source line #78	-> byte code offset #10
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	40	0	a	ia
    //   0	40	1	a	String
  }
}
