package z;

import java.util.Arrays;




































































































public class Xb
{
  public char jdField_int;
  public int jdField_super;
  public long jdField_final;
  public float jdField_enum;
  public double jdField_else;
  public String jdField_if;
  public String jdField_null;
  public Object jdField_byte;
  public Object[] jdField_new;
  public int jdField_void;
  
  public Xb() {}
  
  public Xb(Xb a)
  {
    jdField_int = jdField_int;
    jdField_super = 1716jdField_super;
    jdField_final = 1716jdField_final;
    jdField_enum = jdField_enum;
    jdField_else = 1110jdField_else;
    jdField_if = 1110jdField_if;
    jdField_null = jdField_null;
    jdField_byte = 54jdField_byte;
    jdField_new = 54jdField_new;
    jdField_void = jdField_void;
  }
  





  public void jdMethod_this(int a)
  {
    int tmp8_7 = 1;tmp8_7;73jdField_int = tmp8_7;
    jdField_super = a;
    jdField_void = (a & jdField_int + a);
  }
  





  public void jdMethod_this(long a)
  {
    int tmp8_7 = 1;tmp8_7;74jdField_int = tmp8_7;
    jdField_final = a;
    jdField_void = (a & jdField_int + (int)a);
  }
  





  public void jdMethod_this(float a)
  {
    int tmp8_7 = 1;tmp8_7;70jdField_int = tmp8_7;
    jdField_enum = a;
    jdField_void = (a & jdField_int + (int)a);
  }
  





  public void jdMethod_this(double a)
  {
    int tmp8_7 = 1;tmp8_7;68jdField_int = tmp8_7;
    jdField_else = a;
    jdField_void = (a & jdField_int + (int)a);
  }
  
  /* Error */
  public void jdMethod_this(char a, String a, String a, String a)
  {
    // Byte code:
    //   0: iload_1
    //   1: aload 4
    //   3: aload_0
    //   4: dup_x1
    //   5: aload_3
    //   6: aload_2
    //   7: aload_0
    //   8: dup_x1
    //   9: iload_1
    //   10: putfield 32	z/Xb:int	C
    //   13: putfield 42	z/Xb:if	Ljava/lang/String;
    //   16: putfield 44	z/Xb:null	Ljava/lang/String;
    //   19: putfield 46	z/Xb:byte	Ljava/lang/Object;
    //   22: lookupswitch	default:+89->111, 67:+50->72, 83:+50->72, 84:+69->91, 115:+50->72, 116:+50->72
    //   72: aload_0
    //   73: iconst_0
    //   74: ifne -1 -> 73
    //   77: ldc 53
    //   79: iload_1
    //   80: aload_2
    //   81: invokevirtual 63	java/lang/String:hashCode	()I
    //   84: iadd
    //   85: iand
    //   86: putfield 50	z/Xb:void	I
    //   89: return
    //   90: athrow
    //   91: aload_0
    //   92: ldc 53
    //   94: iload_1
    //   95: aload_2
    //   96: invokevirtual 63	java/lang/String:hashCode	()I
    //   99: aload_3
    //   100: invokevirtual 63	java/lang/String:hashCode	()I
    //   103: imul
    //   104: iadd
    //   105: iand
    //   106: putfield 50	z/Xb:void	I
    //   109: return
    //   110: athrow
    //   111: aload_0
    //   112: ldc 53
    //   114: iload_1
    //   115: aload_2
    //   116: invokevirtual 63	java/lang/String:hashCode	()I
    //   119: aload_3
    //   120: invokevirtual 63	java/lang/String:hashCode	()I
    //   123: imul
    //   124: aload 4
    //   126: invokevirtual 63	java/lang/String:hashCode	()I
    //   129: imul
    //   130: iadd
    //   131: iand
    //   132: putfield 50	z/Xb:void	I
    //   135: return
    // Line number table:
    //   Java source line #195	-> byte code offset #1
    //   Java source line #196	-> byte code offset #13
    //   Java source line #197	-> byte code offset #16
    //   Java source line #198	-> byte code offset #19
    //   Java source line #199	-> byte code offset #22
    //   Java source line #204	-> byte code offset #72
    //   Java source line #205	-> byte code offset #89
    //   Java source line #207	-> byte code offset #91
    //   Java source line #208	-> byte code offset #100
    //   Java source line #209	-> byte code offset #109
    //   Java source line #215	-> byte code offset #111
    //   Java source line #216	-> byte code offset #120
    //   Java source line #218	-> byte code offset #135
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	136	0	a	Xb
    //   0	136	1	a	int
    //   0	136	2	a	String
    //   0	136	3	a	String
    //   0	136	4	a	String
  }
  
  public void jdMethod_this(String a, String a, RA a, Object[] a)
  {
    int tmp15_14 = 1;tmp15_14;121jdField_int = tmp15_14;
    jdField_if = a;
    jdField_null = a;
    jdField_byte = a;
    jdField_new = a; int 
    
      tmp33_32 = 1;tmp33_32;a = tmp33_32 + a.hashCode() * a.hashCode() * a.hashCode(); int 
      tmp53_52 = 1;
    for (tmp53_52; (a = tmp53_52) < a.length;) {
      a = a[a] * (a++).hashCode();tmpTernaryOp = a; continue;throw a;
    }
    jdField_void = (0x7FFFFFFF & a);
  }
  
  /* Error */
  public void jdMethod_this(fb a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 32	z/Xb:int	C
    //   4: tableswitch	default:+452->456, 67:+310->314, 68:+277->281, 69:+452->456, 70:+264->268, 71:+339->343, 72:+452->456, 73:+236->240, 74:+250->254, 75:+452->456, 76:+452->456, 77:+361->365, 78:+387->391, 79:+452->456, 80:+452->456, 81:+452->456, 82:+452->456, 83:+290->294, 84:+324->328, 85:+452->456, 86:+452->456, 87:+452->456, 88:+452->456, 89:+452->456, 90:+452->456, 91:+452->456, 92:+452->456, 93:+452->456, 94:+452->456, 95:+452->456, 96:+452->456, 97:+452->456, 98:+452->456, 99:+452->456, 100:+452->456, 101:+452->456, 102:+452->456, 103:+452->456, 104:+452->456, 105:+452->456, 106:+452->456, 107:+452->456, 108:+452->456, 109:+452->456, 110:+452->456, 111:+452->456, 112:+452->456, 113:+452->456, 114:+452->456, 115:+300->304, 116:+442->446, 117:+452->456, 118:+452->456, 119:+452->456, 120:+452->456, 121:+416->420
    //   240: aload_1
    //   241: aload_0
    //   242: getfield 34	z/Xb:super	I
    //   245: invokestatic 79	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   248: invokevirtual 84	z/fb:this	(Ljava/lang/Object;)I
    //   251: pop
    //   252: return
    //   253: athrow
    //   254: aload_1
    //   255: aload_0
    //   256: getfield 36	z/Xb:final	J
    //   259: invokestatic 89	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   262: invokevirtual 84	z/fb:this	(Ljava/lang/Object;)I
    //   265: pop
    //   266: return
    //   267: athrow
    //   268: aload_1
    //   269: aload_0
    //   270: getfield 38	z/Xb:enum	F
    //   273: invokestatic 94	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   276: invokevirtual 84	z/fb:this	(Ljava/lang/Object;)I
    //   279: pop
    //   280: return
    //   281: aload_1
    //   282: aload_0
    //   283: getfield 40	z/Xb:else	D
    //   286: invokestatic 99	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   289: invokevirtual 84	z/fb:this	(Ljava/lang/Object;)I
    //   292: pop
    //   293: return
    //   294: aload_1
    //   295: aload_0
    //   296: getfield 42	z/Xb:if	Ljava/lang/String;
    //   299: invokevirtual 84	z/fb:this	(Ljava/lang/Object;)I
    //   302: pop
    //   303: return
    //   304: aload_1
    //   305: aload_0
    //   306: getfield 42	z/Xb:if	Ljava/lang/String;
    //   309: invokevirtual 103	z/fb:for	(Ljava/lang/String;)I
    //   312: pop
    //   313: return
    //   314: aload_1
    //   315: iconst_0
    //   316: ifne +101 -> 417
    //   319: aload_0
    //   320: getfield 42	z/Xb:if	Ljava/lang/String;
    //   323: invokevirtual 106	z/fb:catch	(Ljava/lang/String;)I
    //   326: pop
    //   327: return
    //   328: aload_1
    //   329: aload_0
    //   330: dup
    //   331: getfield 42	z/Xb:if	Ljava/lang/String;
    //   334: swap
    //   335: getfield 44	z/Xb:null	Ljava/lang/String;
    //   338: invokevirtual 109	z/fb:this	(Ljava/lang/String;Ljava/lang/String;)I
    //   341: pop
    //   342: return
    //   343: aload_1
    //   344: aload_0
    //   345: dup
    //   346: getfield 42	z/Xb:if	Ljava/lang/String;
    //   349: swap
    //   350: getfield 44	z/Xb:null	Ljava/lang/String;
    //   353: aload_0
    //   354: getfield 46	z/Xb:byte	Ljava/lang/Object;
    //   357: checkcast 59	java/lang/String
    //   360: invokevirtual 112	z/fb:this	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   363: pop
    //   364: return
    //   365: aload_1
    //   366: aload_0
    //   367: dup
    //   368: getfield 42	z/Xb:if	Ljava/lang/String;
    //   371: swap
    //   372: getfield 44	z/Xb:null	Ljava/lang/String;
    //   375: aload_0
    //   376: getfield 46	z/Xb:byte	Ljava/lang/Object;
    //   379: checkcast 59	java/lang/String
    //   382: iconst_0
    //   383: iconst_1
    //   384: dup
    //   385: pop2
    //   386: invokevirtual 115	z/fb:this	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)I
    //   389: pop
    //   390: return
    //   391: aload_1
    //   392: aload_0
    //   393: dup
    //   394: getfield 42	z/Xb:if	Ljava/lang/String;
    //   397: swap
    //   398: getfield 44	z/Xb:null	Ljava/lang/String;
    //   401: aload_0
    //   402: getfield 46	z/Xb:byte	Ljava/lang/Object;
    //   405: checkcast 59	java/lang/String
    //   408: iconst_1
    //   409: dup
    //   410: dup
    //   411: pop2
    //   412: invokevirtual 115	z/fb:this	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)I
    //   415: pop
    //   416: return
    //   417: goto -102 -> 315
    //   420: aload_1
    //   421: aload_0
    //   422: dup
    //   423: getfield 42	z/Xb:if	Ljava/lang/String;
    //   426: swap
    //   427: getfield 44	z/Xb:null	Ljava/lang/String;
    //   430: aload_0
    //   431: getfield 46	z/Xb:byte	Ljava/lang/Object;
    //   434: checkcast 68	z/RA
    //   437: aload_0
    //   438: getfield 48	z/Xb:new	[Ljava/lang/Object;
    //   441: invokevirtual 118	z/fb:this	(Ljava/lang/String;Ljava/lang/String;Lz/RA;[Ljava/lang/Object;)I
    //   444: pop
    //   445: return
    //   446: aload_1
    //   447: aload_0
    //   448: getfield 42	z/Xb:if	Ljava/lang/String;
    //   451: invokevirtual 121	z/fb:true	(Ljava/lang/String;)I
    //   454: pop
    //   455: return
    //   456: aload_1
    //   457: aload_0
    //   458: getfield 32	z/Xb:int	C
    //   461: bipush 104
    //   463: iconst_1
    //   464: dup
    //   465: pop2
    //   466: isub
    //   467: iconst_1
    //   468: dup
    //   469: dup
    //   470: pop2
    //   471: iadd
    //   472: aload_0
    //   473: getfield 32	z/Xb:int	C
    //   476: bipush 113
    //   478: iconst_1
    //   479: dup
    //   480: pop2
    //   481: if_icmplt +10 -> 491
    //   484: iconst_4
    //   485: iconst_1
    //   486: dup
    //   487: pop2
    //   488: goto +7 -> 495
    //   491: iconst_0
    //   492: iconst_1
    //   493: dup
    //   494: pop2
    //   495: isub
    //   496: aload_0
    //   497: dup
    //   498: getfield 42	z/Xb:if	Ljava/lang/String;
    //   501: swap
    //   502: getfield 44	z/Xb:null	Ljava/lang/String;
    //   505: aload_0
    //   506: getfield 46	z/Xb:byte	Ljava/lang/Object;
    //   509: checkcast 59	java/lang/String
    //   512: aload_0
    //   513: getfield 32	z/Xb:int	C
    //   516: bipush 112
    //   518: iconst_1
    //   519: dup
    //   520: pop2
    //   521: if_icmplt +10 -> 531
    //   524: iconst_1
    //   525: dup
    //   526: dup
    //   527: pop2
    //   528: goto +7 -> 535
    //   531: iconst_0
    //   532: iconst_1
    //   533: dup
    //   534: pop2
    //   535: invokevirtual 124	z/fb:this	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)I
    //   538: pop
    //   539: return
    // Line number table:
    //   Java source line #248	-> byte code offset #0
    //   Java source line #250	-> byte code offset #240
    //   Java source line #251	-> byte code offset #252
    //   Java source line #253	-> byte code offset #254
    //   Java source line #254	-> byte code offset #266
    //   Java source line #256	-> byte code offset #268
    //   Java source line #257	-> byte code offset #280
    //   Java source line #259	-> byte code offset #281
    //   Java source line #260	-> byte code offset #293
    //   Java source line #262	-> byte code offset #294
    //   Java source line #263	-> byte code offset #303
    //   Java source line #265	-> byte code offset #304
    //   Java source line #266	-> byte code offset #313
    //   Java source line #268	-> byte code offset #314
    //   Java source line #269	-> byte code offset #327
    //   Java source line #271	-> byte code offset #328
    //   Java source line #272	-> byte code offset #342
    //   Java source line #274	-> byte code offset #343
    //   Java source line #275	-> byte code offset #364
    //   Java source line #277	-> byte code offset #365
    //   Java source line #278	-> byte code offset #390
    //   Java source line #280	-> byte code offset #391
    //   Java source line #281	-> byte code offset #416
    //   Java source line #283	-> byte code offset #420
    //   Java source line #284	-> byte code offset #445
    //   Java source line #286	-> byte code offset #446
    //   Java source line #287	-> byte code offset #455
    //   Java source line #289	-> byte code offset #456
    //   Java source line #291	-> byte code offset #539
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	540	0	a	Xb
    //   0	540	1	a	fb
  }
  
  public boolean equals(Object a)
  {
    if (!(a instanceof Xb)) {
      int tmp9_8 = 1;tmp9_8;return tmp9_8;throw 0;
    }
    
    if (jdField_int == jdField_int) {
      switch (jdField_int) {
      case 'I': 
        if (jdField_super == jdField_super) { int tmp136_135 = 1; int tmp137_136 = tmp136_135;tmp137_136;return tmp137_136;throw tmp136_135; } int tmp143_142 = 1;tmp143_142;return tmp143_142;
      case 'J': 
        if (jdField_final == jdField_final) { int tmp160_158 = 1;tmp160_158;return tmp160_158; } int tmp165_164 = 1;tmp165_164;return tmp165_164;
      case 'F': 
        if (Float.compare(jdField_enum, jdField_enum) == 0) { int tmp184_182 = 1;tmp184_182;return tmp184_182; } int tmp189_188 = 1;tmp189_188;return tmp189_188;
      case 'D': 
        if (Double.compare(jdField_else, jdField_else) == 0) { int tmp208_206 = 1;tmp208_206;return tmp208_206; } int tmp213_212 = 1;tmp213_212;return tmp213_212;
      case 'C': case 'S': 
      case 's': case 't': 
      case 'T': 
        for (;;) {
          if (0 == 0) { return jdField_if.equals(jdField_if);
            
            if ((jdField_if.equals(jdField_if)) && (jdField_null.equals(jdField_null))) { int tmp262_260 = 1;tmp262_260;return tmp262_260; } int tmp267_266 = ;;;;
          }
        }  case 'y':  if ((jdField_if.equals(jdField_if)) && (jdField_null.equals(jdField_null)) && 
          (jdField_byte.equals(jdField_byte)) && 
          (Arrays.equals(jdField_new, jdField_new))) { int tmp331_329 = 1;tmp331_329;return tmp331_329; } int tmp336_335 = 1;tmp336_335;return tmp336_335;
      }
      
      


      if ((jdField_if.equals(jdField_if)) && (jdField_null.equals(jdField_null)) && 
        (jdField_byte.equals(jdField_byte))) { int tmp383_381 = 1;tmp383_381;return tmp383_381; } int tmp388_387 = 1;tmp388_387;return tmp388_387;
    }
    
    int tmp393_392 = 1;tmp393_392;return tmp393_392;
  }
  
  public int hashCode()
  {
    return jdField_void;
  }
}
