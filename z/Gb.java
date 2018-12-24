package z;
















public abstract class Gb
{
  public Gb() {}
  















  public String jdMethod_for(String a)
  {
    iB localIB;
    













    switch ((localIB = iB.jdMethod_for(a))
      .jdMethod_for()) {
    case 9: 
      while (0 != 0) {} String str1 = a.jdMethod_for(localIB.jdMethod_true().jdMethod_this()); int 
        tmp54_53 = 1;
      int i; for (tmp54_53; (i = tmp54_53) < localIB.jdMethod_catch();) {
        int tmp76_75 = 1;tmp76_75;str1 = i++;tmpTernaryOp = i; continue;throw 91.append(tmp76_75);
      }
      return str1;throw new StringBuilder();
    case 10: 
      String str2;
      if ((str2 = a.jdMethod_this(localIB.jdMethod_true())) != null) {
        new StringBuilder();1; int tmp138_137 = 1;tmp138_137;return tmp138_137;
      }
      break; }
    return a;
  }
  
  private iB jdMethod_this(iB a) {
    switch (a.jdMethod_for()) {case 9: case 10:  String str;
      int i;
      for (;;) { if (0 == 0) { str = a.jdMethod_for(a.jdMethod_true().jdMethod_this()); int 
            tmp50_49 = 1;
          for (tmp50_49; (i = tmp50_49) < a.jdMethod_catch(); tmpTernaryOp = i) {
            1;str = i++;
          }
          throw 
            91.append(tmp71_70);
          
          return iB.jdMethod_for(str);throw new StringBuilder();
          

          if ((str = a.jdMethod_this(a.jdMethod_true())) != null) return iB.jdMethod_catch(str); ;;
        }
      }  case 11:  return iB.jdMethod_true(a.jdMethod_true(a.jdMethod_this()));
    }
    return a;
  }
  
  /* Error */
  public String jdMethod_catch(String a)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +6 -> 7
    //   4: aconst_null
    //   5: areturn
    //   6: athrow
    //   7: aload_0
    //   8: aload_1
    //   9: invokestatic 59	z/iB:catch	(Ljava/lang/String;)Lz/iB;
    //   12: invokespecial 66	z/Gb:this	(Lz/iB;)Lz/iB;
    //   15: invokevirtual 49	z/iB:true	()Ljava/lang/String;
    //   18: areturn
    // Line number table:
    //   Java source line #89	-> byte code offset #0
    //   Java source line #90	-> byte code offset #4
    //   Java source line #92	-> byte code offset #7
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	19	0	a	Gb
    //   0	19	1	a	String
  }
  
  public String[] jdMethod_this(String[] a)
  {
    int ? = null; int 
      tmp4_3 = 1;tmp4_3;int i = tmp4_3; int 
      tmp9_8 = 1;
    int j; for (tmp9_8; (j = tmp9_8) < a.length;) {
      String str1 = a[j];
      String str2;
      if (((str2 = a.jdMethod_this(str1)) != null) && (? == null)) {
        int tmp47_46 = 1;tmp47_46;? = tmp47_46;
        if (j > 0) {
          1; int tmp61_60 = 0; int tmp63_62 = 1;tmp63_62;System.arraycopy(tmp61_60, ?, tmp61_60, tmp63_62, j);
        }
        int tmp72_70 = 1;tmp72_70;i = tmp72_70;
      }
      if (i != 0) {
        if (str2 == null) { tmpTernaryOp = str1; break label95; throw j; } tmp71_70[?] = str2;
      }
      j++;tmpTernaryOp = j; continue;throw 
      




        tmp57_56;
    }
    


    label95:
    

    if (i != 0) return ?; return a;
  }
  
  /* Error */
  public String jdMethod_true(String a)
  {
    // Byte code:
    //   0: ldc 77
    //   2: invokestatic 82	org/powerbot/script/rt4/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   5: aload_1
    //   6: invokevirtual 86	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   9: ifeq +6 -> 15
    //   12: aload_1
    //   13: areturn
    //   14: athrow
    //   15: aload_1
    //   16: invokestatic 89	z/iB:this	(Ljava/lang/String;)[Lz/iB;
    //   19: astore_2
    //   20: new 36	java/lang/StringBuilder
    //   23: dup
    //   24: ldc 91
    //   26: invokestatic 94	z/aux:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   29: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   32: astore_3
    //   33: iconst_0
    //   34: iconst_1
    //   35: dup
    //   36: pop2
    //   37: dup
    //   38: istore 4
    //   40: aload_2
    //   41: arraylength
    //   42: if_icmpge +28 -> 70
    //   45: aload_3
    //   46: aload_0
    //   47: aload_2
    //   48: iload 4
    //   50: aaload
    //   51: iinc 4 1
    //   54: invokevirtual 29	z/iB:this	()Ljava/lang/String;
    //   57: invokevirtual 31	z/Gb:for	(Ljava/lang/String;)Ljava/lang/String;
    //   60: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: iload 4
    //   66: goto -26 -> 40
    //   69: athrow
    //   70: aload_1
    //   71: invokestatic 99	z/iB:this	(Ljava/lang/String;)Lz/iB;
    //   74: dup
    //   75: astore 4
    //   77: getstatic 102	z/iB:case	Lz/iB;
    //   80: if_acmpne +18 -> 98
    //   83: aload_3
    //   84: dup
    //   85: ldc 104
    //   87: invokestatic 82	org/powerbot/script/rt4/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   90: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: pop
    //   94: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   97: areturn
    //   98: aload_3
    //   99: dup
    //   100: bipush 41
    //   102: iconst_1
    //   103: dup
    //   104: pop2
    //   105: invokevirtual 41	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   108: aload_0
    //   109: aload 4
    //   111: invokevirtual 29	z/iB:this	()Ljava/lang/String;
    //   114: invokevirtual 31	z/Gb:for	(Ljava/lang/String;)Ljava/lang/String;
    //   117: invokevirtual 44	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: invokevirtual 47	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   124: areturn
    // Line number table:
    //   Java source line #116	-> byte code offset #0
    //   Java source line #117	-> byte code offset #12
    //   Java source line #120	-> byte code offset #15
    //   Java source line #121	-> byte code offset #20
    //   Java source line #122	-> byte code offset #33
    //   Java source line #123	-> byte code offset #45
    //   Java source line #122	-> byte code offset #63
    //   Java source line #125	-> byte code offset #70
    //   Java source line #126	-> byte code offset #77
    //   Java source line #127	-> byte code offset #83
    //   Java source line #128	-> byte code offset #94
    //   Java source line #130	-> byte code offset #98
    //   Java source line #131	-> byte code offset #121
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	125	0	a	Gb
    //   0	125	1	a	String
  }
  
  /* Error */
  public Object jdMethod_this(Object a)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 15
    //   4: ifeq +13 -> 17
    //   7: aload_0
    //   8: aload_1
    //   9: checkcast 15	z/iB
    //   12: invokespecial 66	z/Gb:this	(Lz/iB;)Lz/iB;
    //   15: areturn
    //   16: athrow
    //   17: aload_1
    //   18: instanceof 109
    //   21: ifeq +57 -> 78
    //   24: aload_1
    //   25: checkcast 109	z/RA
    //   28: astore_2
    //   29: new 109	z/RA
    //   32: dup
    //   33: aload_2
    //   34: invokevirtual 111	z/RA:this	()I
    //   37: aload_0
    //   38: aload_2
    //   39: invokevirtual 113	z/RA:catch	()Ljava/lang/String;
    //   42: invokevirtual 115	z/Gb:catch	(Ljava/lang/String;)Ljava/lang/String;
    //   45: aload_0
    //   46: aload_2
    //   47: invokevirtual 113	z/RA:catch	()Ljava/lang/String;
    //   50: aload_2
    //   51: invokevirtual 116	z/RA:true	()Ljava/lang/String;
    //   54: aload_2
    //   55: invokevirtual 117	z/RA:this	()Ljava/lang/String;
    //   58: invokevirtual 120	z/Gb:true	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   61: aload_0
    //   62: aload_2
    //   63: invokevirtual 117	z/RA:this	()Ljava/lang/String;
    //   66: invokevirtual 61	z/Gb:true	(Ljava/lang/String;)Ljava/lang/String;
    //   69: aload_2
    //   70: invokevirtual 123	z/RA:this	()Z
    //   73: invokespecial 126	z/RA:<init>	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    //   76: areturn
    //   77: athrow
    //   78: aload_1
    //   79: areturn
    // Line number table:
    //   Java source line #135	-> byte code offset #0
    //   Java source line #136	-> byte code offset #7
    //   Java source line #138	-> byte code offset #17
    //   Java source line #139	-> byte code offset #24
    //   Java source line #140	-> byte code offset #29
    //   Java source line #141	-> byte code offset #47
    //   Java source line #140	-> byte code offset #58
    //   Java source line #142	-> byte code offset #63
    //   Java source line #140	-> byte code offset #76
    //   Java source line #144	-> byte code offset #78
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	80	0	a	Gb
    //   0	80	1	a	Object
  }
  
  /* Error */
  public String jdMethod_this(String a, boolean a)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnonnull +6 -> 7
    //   4: aconst_null
    //   5: areturn
    //   6: athrow
    //   7: new 130	z/WA
    //   10: dup
    //   11: aload_1
    //   12: invokespecial 131	z/WA:<init>	(Ljava/lang/String;)V
    //   15: astore_1
    //   16: new 133	z/z
    //   19: dup
    //   20: invokespecial 134	z/z:<init>	()V
    //   23: astore_3
    //   24: aload_0
    //   25: aload_3
    //   26: invokevirtual 137	z/Gb:this	(Lz/Com6;)Lz/Com6;
    //   29: astore 4
    //   31: iload_2
    //   32: ifeq +14 -> 46
    //   35: aload_3
    //   36: aload_1
    //   37: aload 4
    //   39: invokevirtual 140	z/WA:this	(Lz/Com6;)V
    //   42: goto +11 -> 53
    //   45: athrow
    //   46: aload_1
    //   47: aload 4
    //   49: invokevirtual 142	z/WA:true	(Lz/Com6;)V
    //   52: aload_3
    //   53: invokevirtual 143	z/z:toString	()Ljava/lang/String;
    //   56: areturn
    // Line number table:
    //   Java source line #157	-> byte code offset #0
    //   Java source line #158	-> byte code offset #4
    //   Java source line #160	-> byte code offset #7
    //   Java source line #161	-> byte code offset #16
    //   Java source line #162	-> byte code offset #24
    //   Java source line #163	-> byte code offset #31
    //   Java source line #164	-> byte code offset #36
    //   Java source line #166	-> byte code offset #46
    //   Java source line #168	-> byte code offset #52
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	a	Gb
    //   0	57	1	a	String
    //   0	57	2	a	int
  }
  
  @Deprecated
  public Com6 jdMethod_true(Com6 a)
  {
    return new Ib(a, a);
  }
  
  public Com6 jdMethod_this(Com6 a)
  {
    return a.jdMethod_true(a);
  }
  










  public String jdMethod_true(String a, String a, String a)
  {
    return a;
  }
  








  public String jdMethod_this(String a, String a)
  {
    return a;
  }
  










  public String jdMethod_this(String a, String a, String a)
  {
    return a;
  }
  






  public String jdMethod_this(String a)
  {
    return a;
  }
  
  public static String jdMethod_this(Object a)
  {
    int tmp22_19 = (a = (String)a).length();
    int tmp26_25 = 1;
    tmp26_25;
    int j;
    int ? = tmp26_25;
    int k = tmp22_19;
    (j = new char[tmp22_19] - 1);
    int i = (0x3 ^ 0x5) << 3 ^ 0x1;
    if ((5 << 3 ^ 0x1) >= 0)
    {
      int tmp45_44 = j;
      j--;
      ?[tmp45_44] = ((char)(a.charAt(tmp45_44) ^ i));
      int tmp66_63 = (j--);
      ?[tmp66_63] = ((char)(a.charAt(tmp66_63) ^ k));
    }
    return new String(?);
  }
}
