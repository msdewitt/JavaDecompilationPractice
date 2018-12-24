package z;

import java.util.HashMap;
import org.powerbot.script.rt6.BasicObject;
import org.powerbot.util.prn;










































public class n
  extends lPT8
  implements CoN
{
  private final k jdField_new;
  private static final HashMap<String, String[]> jdField_void;
  
  public n(k a, cON a, Gb a)
  {
    a.<init>(327680, a, a);
    jdField_new = a;
  }
  




  public void jdMethod_true(String a, int a) {}
  




  public aux jdMethod_this()
  {
    return null;
  }
  

  public aux jdMethod_this(String a, boolean a)
  {
    return null;
  }
  

  public aux jdMethod_catch(int a, Qa a, String a, boolean a)
  {
    return null;
  }
  


  public aux jdMethod_this(int a, String a, boolean a)
  {
    return null;
  }
  
  public void jdMethod_this(String a, String a, String a, OA a, OA a, int a) {}
  
  public void jdMethod_this(int a, OA a) {}
  
  public void jdMethod_this(int a, int a, Object[] a, int a, Object[] a) {}
  
  public void jdMethod_this(lpt6 a) {}
  
  /* Error */
  public void jdMethod_this(Object a)
  {
    // Byte code:
    //   0: aload_1
    //   1: instanceof 45
    //   4: ifne +10 -> 14
    //   7: aload_0
    //   8: aload_1
    //   9: invokespecial 47	z/lPT8:this	(Ljava/lang/Object;)V
    //   12: return
    //   13: athrow
    //   14: aload_1
    //   15: checkcast 45	z/iB
    //   18: invokevirtual 50	z/iB:true	()Ljava/lang/String;
    //   21: astore_1
    //   22: new 52	java/lang/StringBuilder
    //   25: dup
    //   26: invokespecial 55	java/lang/StringBuilder:<init>	()V
    //   29: iconst_0
    //   30: ldc 57
    //   32: invokestatic 62	org/powerbot/util/prn:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   35: invokevirtual 66	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   38: aload_1
    //   39: bipush 47
    //   41: iconst_1
    //   42: dup
    //   43: pop2
    //   44: bipush 36
    //   46: iconst_1
    //   47: dup
    //   48: pop2
    //   49: invokevirtual 72	java/lang/String:replace	(CC)Ljava/lang/String;
    //   52: invokevirtual 76	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: invokevirtual 79	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: astore_2
    //   59: aload_0
    //   60: getfield 20	z/n:new	Lz/k;
    //   63: getfield 84	z/k:void	Ljava/util/List;
    //   66: aload_1
    //   67: invokeinterface 90 2 0
    //   72: ifne +41 -> 113
    //   75: aload_0
    //   76: getfield 20	z/n:new	Lz/k;
    //   79: getfield 84	z/k:void	Ljava/util/List;
    //   82: aload_1
    //   83: invokeinterface 93 2 0
    //   88: aload_0
    //   89: getfield 20	z/n:new	Lz/k;
    //   92: sipush 4104
    //   95: iconst_1
    //   96: dup
    //   97: pop2
    //   98: aload_2
    //   99: ldc 95
    //   101: invokestatic 98	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   104: invokevirtual 101	z/k:this	(ILjava/lang/String;Ljava/lang/String;)Lz/auX;
    //   107: dup
    //   108: astore_3
    //   109: invokevirtual 105	z/auX:this	()V
    //   112: pop
    //   113: aload_0
    //   114: dup
    //   115: getfield 20	z/n:new	Lz/k;
    //   118: getfield 108	z/k:null	Ljava/lang/String;
    //   121: astore_3
    //   122: getfield 110	z/n:jdField_void_of_type_ZCON	Lz/cON;
    //   125: sipush 178
    //   128: iconst_1
    //   129: dup
    //   130: pop2
    //   131: aload_3
    //   132: aload_2
    //   133: ldc 112
    //   135: invokestatic 62	org/powerbot/util/prn:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   138: invokevirtual 117	z/cON:true	(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   141: return
    // Line number table:
    //   Java source line #120	-> byte code offset #0
    //   Java source line #121	-> byte code offset #7
    //   Java source line #122	-> byte code offset #12
    //   Java source line #126	-> byte code offset #14
    //   Java source line #127	-> byte code offset #22
    //   Java source line #128	-> byte code offset #59
    //   Java source line #129	-> byte code offset #75
    //   Java source line #130	-> byte code offset #88
    //   Java source line #132	-> byte code offset #109
    //   Java source line #135	-> byte code offset #113
    //   Java source line #136	-> byte code offset #122
    //   Java source line #137	-> byte code offset #141
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	a	n
    //   0	142	1	a	Object
  }
  
  public void jdMethod_this(int a, String a, String a, String a, boolean a)
  {
    int tmp5_4 = 1;tmp5_4; String[] arrayOfString; if ((184 == tmp5_4) && (a.equals(BasicObject.jdMethod_this("J\nP\036Y$Z"))) && 
      ((arrayOfString = (String[])jdField_void_of_type_JavaUtilHashMap.get(a)) != null)) {
      int tmp62_61 = 1;tmp62_61;arrayOfString = 0[tmp62_61]; int 
        tmp68_67 = 1; int tmp69_68 = tmp68_67;tmp69_68;String str = tmp68_67[tmp69_68]; int 
        tmp86_85 = 1;tmp86_85;'»'.jdMethod_this(tmp86_85, arrayOfString); int 
        tmp94_93 = 1;tmp94_93;a.jdMethod_this(tmp94_93);
      if ((a == prn.jdMethod_this(89)) || (str == BasicObject.jdMethod_this("CxBj"))) { int tmp118_117 = 1;;; break label129; throw 94; } else { 1; } label129: 93.jdMethod_this(tmp127_126);
      
      int tmp140_139 = 1;tmp140_139;88.jdMethod_this(tmp140_139); int 
        tmp146_145 = 1;tmp146_145; int tmp159_158 = 1;tmp159_158;tmp146_145.jdMethod_this(arrayOfString, prn.jdMethod_this("\005\003W\003MT"), str, 0, tmp159_158);
      
      return;throw a;
    }
    a.jdMethod_this(a, a, a, a, a);
  }
  
  static
  {
    1; int tmp9_8 = 1;tmp9_8;1; int tmp18_17 = 1;tmp18_17; int tmp24_23 = 1;tmp24_23; int tmp26_24 = tmp24_23; int tmp29_28 = 1;tmp29_28;0[tmp29_28] = BasicObject.jdMethod_this("\001]\035]DP\nR\f\023)E\037Y"); int tmp37_26 = tmp26_24; int tmp39_38 = 1; int tmp40_39 = tmp39_38;tmp40_39;tmp39_38[tmp40_39] = prn.jdMethod_this("\021(\020<");tmp26_24[tmp37_26] = tmp37_26;1; int tmp56_54 = 1;tmp56_54; int tmp62_61 = 1;tmp62_61; int tmp64_62 = tmp62_61; int tmp67_66 = 1;tmp67_66;0[tmp67_66] = BasicObject.jdMethod_this("V\nJ\n\023\007]\005[Do\003S\031H"); int tmp75_64 = tmp64_62; int tmp77_76 = 1; int tmp78_77 = tmp77_76;tmp78_77;tmp77_76[tmp78_77] = prn.jdMethod_this("\0219\020<");tmp64_62[tmp75_64] = tmp75_64;1; int tmp94_93 = 1;tmp94_93; int tmp100_99 = 1;tmp100_99; int tmp102_100 = tmp100_99; int tmp105_104 = 1;tmp105_104;0[tmp105_104] = BasicObject.jdMethod_this("V\nJ\n\023\007]\005[D\003]\031]\bH\016N"); int tmp113_102 = tmp102_100; int tmp115_114 = 1; int tmp116_115 = tmp115_114;tmp116_115;tmp115_114[tmp116_115] = prn.jdMethod_this("\021)\020<");tmp102_100[tmp113_102] = tmp113_102;1; int tmp132_131 = 1;tmp132_131; int tmp138_137 = 1;tmp138_137; int tmp140_138 = tmp138_137; int tmp143_142 = 1;tmp143_142;0[tmp143_142] = BasicObject.jdMethod_this("V\nJ\n\023\007]\005[Du\005H\016[\016N"); int tmp151_140 = tmp140_138; int tmp153_152 = 1; int tmp154_153 = tmp153_152;tmp154_153;tmp153_152[tmp154_153] = prn.jdMethod_this("\021#\020<");tmp140_138[tmp151_140] = tmp151_140;1; int tmp170_169 = 1;tmp170_169; int tmp176_175 = 1;tmp176_175; int tmp178_176 = tmp176_175; int tmp181_180 = 1;tmp181_180;0[tmp181_180] = BasicObject.jdMethod_this("\001]\035]DP\nR\f\023'S\005["); int tmp189_178 = tmp178_176; int tmp191_190 = 1; int tmp192_191 = tmp191_190;tmp192_191;tmp191_190[tmp192_191] = prn.jdMethod_this("\021 \020<");tmp178_176[tmp189_178] = tmp189_178;1; int tmp208_207 = 1;tmp208_207; int tmp214_213 = 1;tmp214_213; int tmp216_214 = tmp214_213; int tmp219_218 = 1;tmp219_218;0[tmp219_218] = BasicObject.jdMethod_this("V\nJ\n\023\007]\005[Dz\007S\nH"); int tmp227_216 = tmp216_214; int tmp229_228 = 1; int tmp230_229 = tmp229_228;tmp230_229;tmp229_228[tmp230_229] = prn.jdMethod_this("\021,\020<");tmp216_214[tmp227_216] = tmp227_216;1; int tmp247_246 = 1;tmp247_246; int tmp253_252 = 1;tmp253_252; int tmp255_253 = tmp253_252; int tmp258_257 = 1;tmp258_257;0[tmp258_257] = BasicObject.jdMethod_this("\001]\035]DP\nR\f\023/S\036^\007Y"); int tmp266_255 = tmp255_253; int tmp268_267 = 1; int tmp269_268 = tmp268_267;tmp269_268;tmp268_267[tmp269_268] = prn.jdMethod_this("\021.\020<");tmp255_253[tmp266_255] = tmp266_255;String[] arrayOfString1 = new String[tmp247_246];
    





    HashMap localHashMap = new HashMap();
    String[] arrayOfString2 = arrayOfString1;int i = arrayOfString1.length; int tmp294_293 = 1; int j; for (tmp294_293; (j = tmp294_293) < i;) { String str1;
      int tmp313_312 = 1;tmp313_312;String str2 = 0[tmp313_312]; int 
        tmp319_318 = 1; int tmp320_319 = tmp319_318;tmp320_319;Object localObject = tmp319_318[tmp320_319];
      new StringBuilder();1;1; int tmp374_373 = 1;tmp374_373;str2 = tmp374_373;
      
      (j++).put(str2, str1);tmpTernaryOp = j; continue;throw localHashMap;
    }
    jdField_void_of_type_JavaUtilHashMap = localHashMap;
  }
}
