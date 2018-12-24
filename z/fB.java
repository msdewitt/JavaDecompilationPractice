package z;

import java.util.Comparator;

public class fB
  implements Comparator<Xb>
{
  public fB() {}
  
  /* Error */
  public int jdMethod_this(Xb a, Xb a)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 21	z/fB:this	(Lz/Xb;)I
    //   4: aload_2
    //   5: invokestatic 21	z/fB:this	(Lz/Xb;)I
    //   8: isub
    //   9: dup
    //   10: istore_3
    //   11: ifne +347 -> 358
    //   14: aload_1
    //   15: getfield 27	z/Xb:int	C
    //   18: lookupswitch	default:+290->308, 67:+164->182, 68:+146->164, 70:+128->146, 73:+90->108, 74:+109->127, 83:+164->182, 84:+180->198, 115:+164->182, 116:+164->182, 121:+213->231
    //   108: aload_1
    //   109: getfield 31	z/Xb:super	I
    //   112: invokestatic 37	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   115: aload_2
    //   116: getfield 31	z/Xb:super	I
    //   119: invokestatic 37	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   122: invokevirtual 41	java/lang/Integer:compareTo	(Ljava/lang/Integer;)I
    //   125: ireturn
    //   126: athrow
    //   127: aload_1
    //   128: getfield 45	z/Xb:final	J
    //   131: invokestatic 50	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   134: aload_2
    //   135: getfield 45	z/Xb:final	J
    //   138: invokestatic 50	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   141: invokevirtual 53	java/lang/Long:compareTo	(Ljava/lang/Long;)I
    //   144: ireturn
    //   145: athrow
    //   146: aload_1
    //   147: getfield 57	z/Xb:enum	F
    //   150: invokestatic 62	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   153: aload_2
    //   154: getfield 57	z/Xb:enum	F
    //   157: invokestatic 62	java/lang/Float:valueOf	(F)Ljava/lang/Float;
    //   160: invokevirtual 65	java/lang/Float:compareTo	(Ljava/lang/Float;)I
    //   163: ireturn
    //   164: aload_1
    //   165: getfield 69	z/Xb:else	D
    //   168: invokestatic 74	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   171: aload_2
    //   172: getfield 69	z/Xb:else	D
    //   175: invokestatic 74	java/lang/Double:valueOf	(D)Ljava/lang/Double;
    //   178: invokevirtual 77	java/lang/Double:compareTo	(Ljava/lang/Double;)I
    //   181: ireturn
    //   182: aload_1
    //   183: iconst_0
    //   184: ifne +44 -> 228
    //   187: getfield 81	z/Xb:if	Ljava/lang/String;
    //   190: aload_2
    //   191: getfield 81	z/Xb:if	Ljava/lang/String;
    //   194: invokevirtual 86	java/lang/String:compareTo	(Ljava/lang/String;)I
    //   197: ireturn
    //   198: aload_1
    //   199: getfield 81	z/Xb:if	Ljava/lang/String;
    //   202: aload_2
    //   203: getfield 81	z/Xb:if	Ljava/lang/String;
    //   206: invokevirtual 86	java/lang/String:compareTo	(Ljava/lang/String;)I
    //   209: dup
    //   210: istore_3
    //   211: ifne +147 -> 358
    //   214: aload_1
    //   215: getfield 89	z/Xb:null	Ljava/lang/String;
    //   218: aload_2
    //   219: getfield 89	z/Xb:null	Ljava/lang/String;
    //   222: invokevirtual 86	java/lang/String:compareTo	(Ljava/lang/String;)I
    //   225: dup
    //   226: istore_3
    //   227: ireturn
    //   228: goto -45 -> 183
    //   231: aload_1
    //   232: getfield 81	z/Xb:if	Ljava/lang/String;
    //   235: aload_2
    //   236: getfield 81	z/Xb:if	Ljava/lang/String;
    //   239: invokevirtual 86	java/lang/String:compareTo	(Ljava/lang/String;)I
    //   242: dup
    //   243: istore_3
    //   244: ifne +114 -> 358
    //   247: aload_1
    //   248: getfield 89	z/Xb:null	Ljava/lang/String;
    //   251: aload_2
    //   252: getfield 89	z/Xb:null	Ljava/lang/String;
    //   255: invokevirtual 86	java/lang/String:compareTo	(Ljava/lang/String;)I
    //   258: dup
    //   259: istore_3
    //   260: ifne +98 -> 358
    //   263: aload_1
    //   264: getfield 93	z/Xb:byte	Ljava/lang/Object;
    //   267: checkcast 95	z/RA
    //   270: astore 4
    //   272: aload_2
    //   273: getfield 93	z/Xb:byte	Ljava/lang/Object;
    //   276: checkcast 95	z/RA
    //   279: astore 5
    //   281: aload 4
    //   283: aload 5
    //   285: invokestatic 98	z/fB:this	(Lz/RA;Lz/RA;)I
    //   288: dup
    //   289: istore_3
    //   290: ifne +68 -> 358
    //   293: aload_1
    //   294: getfield 102	z/Xb:new	[Ljava/lang/Object;
    //   297: aload_2
    //   298: getfield 102	z/Xb:new	[Ljava/lang/Object;
    //   301: invokestatic 105	z/fB:this	([Ljava/lang/Object;[Ljava/lang/Object;)I
    //   304: istore_3
    //   305: goto +53 -> 358
    //   308: aload_1
    //   309: getfield 81	z/Xb:if	Ljava/lang/String;
    //   312: aload_2
    //   313: getfield 81	z/Xb:if	Ljava/lang/String;
    //   316: invokevirtual 86	java/lang/String:compareTo	(Ljava/lang/String;)I
    //   319: dup
    //   320: istore_3
    //   321: ifne +37 -> 358
    //   324: aload_1
    //   325: getfield 89	z/Xb:null	Ljava/lang/String;
    //   328: aload_2
    //   329: getfield 89	z/Xb:null	Ljava/lang/String;
    //   332: invokevirtual 86	java/lang/String:compareTo	(Ljava/lang/String;)I
    //   335: dup
    //   336: istore_3
    //   337: ifne +21 -> 358
    //   340: aload_1
    //   341: getfield 93	z/Xb:byte	Ljava/lang/Object;
    //   344: checkcast 83	java/lang/String
    //   347: aload_2
    //   348: getfield 93	z/Xb:byte	Ljava/lang/Object;
    //   351: checkcast 83	java/lang/String
    //   354: invokevirtual 86	java/lang/String:compareTo	(Ljava/lang/String;)I
    //   357: istore_3
    //   358: iload_3
    //   359: ireturn
    // Line number table:
    //   Java source line #151	-> byte code offset #0
    //   Java source line #152	-> byte code offset #11
    //   Java source line #153	-> byte code offset #14
    //   Java source line #155	-> byte code offset #108
    //   Java source line #157	-> byte code offset #127
    //   Java source line #159	-> byte code offset #146
    //   Java source line #161	-> byte code offset #164
    //   Java source line #166	-> byte code offset #182
    //   Java source line #168	-> byte code offset #198
    //   Java source line #169	-> byte code offset #211
    //   Java source line #170	-> byte code offset #214
    //   Java source line #174	-> byte code offset #231
    //   Java source line #175	-> byte code offset #244
    //   Java source line #176	-> byte code offset #247
    //   Java source line #177	-> byte code offset #260
    //   Java source line #178	-> byte code offset #263
    //   Java source line #179	-> byte code offset #272
    //   Java source line #180	-> byte code offset #281
    //   Java source line #181	-> byte code offset #290
    //   Java source line #182	-> byte code offset #293
    //   Java source line #184	-> byte code offset #305
    //   Java source line #189	-> byte code offset #308
    //   Java source line #190	-> byte code offset #321
    //   Java source line #191	-> byte code offset #324
    //   Java source line #192	-> byte code offset #337
    //   Java source line #193	-> byte code offset #340
    //   Java source line #194	-> byte code offset #354
    //   Java source line #199	-> byte code offset #358
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	360	0	a	fB
    //   0	360	1	a	Xb
    //   0	360	2	a	Xb
  }
  
  private static int jdMethod_this(RA a, RA a)
  {
    int i;
    if ((i = a.jdMethod_this() - a.jdMethod_this()) == 0)
    {
      if ((i = a.jdMethod_catch().compareTo(a.jdMethod_catch())) == 0)
      {
        if ((i = a.jdMethod_true().compareTo(a.jdMethod_true())) == 0) {
          i = a.jdMethod_this().compareTo(a.jdMethod_this());
        }
      }
    }
    return i;
  }
  
  private static int jdMethod_this(iB a, iB a) {
    return a.jdMethod_this().compareTo(a.jdMethod_this());
  }
  
  /* Error */
  private static int jdMethod_this(Object[] a, Object[] a)
  {
    // Byte code:
    //   0: aload_0
    //   1: arraylength
    //   2: dup
    //   3: istore_2
    //   4: aload_1
    //   5: arraylength
    //   6: isub
    //   7: dup
    //   8: istore_3
    //   9: ifne +131 -> 140
    //   12: iconst_0
    //   13: iconst_1
    //   14: dup
    //   15: pop2
    //   16: dup
    //   17: istore 4
    //   19: iload_2
    //   20: if_icmpge +120 -> 140
    //   23: aload_0
    //   24: iload 4
    //   26: aaload
    //   27: astore 5
    //   29: aload_1
    //   30: iload 4
    //   32: aaload
    //   33: astore 6
    //   35: aload 5
    //   37: invokevirtual 130	java/lang/Object:getClass	()Ljava/lang/Class;
    //   40: invokevirtual 135	java/lang/Class:getName	()Ljava/lang/String;
    //   43: aload 6
    //   45: invokevirtual 130	java/lang/Object:getClass	()Ljava/lang/Class;
    //   48: invokevirtual 135	java/lang/Class:getName	()Ljava/lang/String;
    //   51: invokevirtual 86	java/lang/String:compareTo	(Ljava/lang/String;)I
    //   54: dup
    //   55: istore_3
    //   56: ifne +70 -> 126
    //   59: aload 5
    //   61: instanceof 124
    //   64: ifeq +22 -> 86
    //   67: aload 5
    //   69: checkcast 124	z/iB
    //   72: aload 6
    //   74: checkcast 124	z/iB
    //   77: invokestatic 137	z/fB:this	(Lz/iB;Lz/iB;)I
    //   80: dup
    //   81: istore_3
    //   82: goto +45 -> 127
    //   85: athrow
    //   86: aload 5
    //   88: instanceof 95
    //   91: ifeq +22 -> 113
    //   94: aload 5
    //   96: checkcast 95	z/RA
    //   99: aload 6
    //   101: checkcast 95	z/RA
    //   104: invokestatic 98	z/fB:this	(Lz/RA;Lz/RA;)I
    //   107: dup
    //   108: istore_3
    //   109: goto +18 -> 127
    //   112: athrow
    //   113: aload 5
    //   115: checkcast 139	java/lang/Comparable
    //   118: aload 6
    //   120: invokeinterface 142 2 0
    //   125: istore_3
    //   126: iload_3
    //   127: ifeq +5 -> 132
    //   130: iload_3
    //   131: ireturn
    //   132: iinc 4 1
    //   135: iload 4
    //   137: goto -118 -> 19
    //   140: iconst_0
    //   141: iconst_1
    //   142: dup
    //   143: pop2
    //   144: ireturn
    // Line number table:
    //   Java source line #222	-> byte code offset #0
    //   Java source line #223	-> byte code offset #4
    //   Java source line #224	-> byte code offset #9
    //   Java source line #225	-> byte code offset #12
    //   Java source line #226	-> byte code offset #23
    //   Java source line #227	-> byte code offset #29
    //   Java source line #228	-> byte code offset #35
    //   Java source line #229	-> byte code offset #45
    //   Java source line #230	-> byte code offset #56
    //   Java source line #231	-> byte code offset #59
    //   Java source line #232	-> byte code offset #67
    //   Java source line #233	-> byte code offset #86
    //   Java source line #234	-> byte code offset #94
    //   Java source line #237	-> byte code offset #113
    //   Java source line #241	-> byte code offset #126
    //   Java source line #242	-> byte code offset #130
    //   Java source line #225	-> byte code offset #132
    //   Java source line #246	-> byte code offset #140
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	145	0	a	Object[]
    //   0	145	1	a	Object[]
  }
  
  private static int jdMethod_this(Xb a)
  {
    switch (jdField_int) {
    case 'I': 
      int tmp242_241 = 1;tmp242_241;return tmp242_241;throw 0;
    case 'J': 
      int tmp247_246 = 1; int tmp248_247 = tmp247_246;tmp248_247;return tmp248_247;throw tmp247_246;
    case 'F': 
      int tmp254_253 = 1;tmp254_253;return tmp254_253;
    case 'D': 
      int tmp259_258 = 1;tmp259_258;return tmp259_258;
    case 's': 
      int tmp264_263 = 1;tmp264_263;return tmp264_263;
    case 'S': 
      int tmp269_268 = 1;tmp269_268;return tmp269_268;
    case 'C': case 'T': case 'G': case 'M': case 'N':  for (;;) {
        if (0 == 0) { int tmp279_278 = 1;tmp279_278;return tmp279_278; int 
          
            tmp285_284 = 1;tmp285_284;return tmp285_284; int 
          
            tmp291_290 = 1;tmp291_290;return tmp291_290; int 
          
            tmp297_296 = 1;tmp297_296;return tmp297_296; int 
          
            tmp303_302 = ;;;;
        }
      }  case 'y':  int tmp312_311 = 1;tmp312_311;return tmp312_311;
    case 't': 
      int tmp318_317 = 1;tmp318_317;return tmp318_317;
    }
    1; int tmp334_333 = 1;tmp334_333;return 104 - tmp334_333;
  }
}
