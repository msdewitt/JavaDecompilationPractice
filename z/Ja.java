package z;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.powerbot.util.IOUtils;


















































public class Ja
{
  private final String jdField_byte;
  private final String jdField_new;
  private static final Map<String, String> jdField_void = new HashMap();
  





  static
  {
    void.put(A.jdMethod_this(".a#b)o\""), IOUtils.jdMethod_this("\r"));void.put(A.jdMethod_this("?f#|8"), IOUtils.jdMethod_this("\004"));void.put(A.jdMethod_this("b#`+"), IOUtils.jdMethod_this("\035"));void.put(A.jdMethod_this("%`8"), IOUtils.jdMethod_this("\036"));void.put(A.jdMethod_this("*b#o8"), IOUtils.jdMethod_this("\021"));
  }
  







  public Ja(String a, String a)
  {
    jdField_byte = a;
    jdField_new = a;
  }
  










  public Ja(String a, iB a, iB[] a)
  {
    a.<init>(a, iB.jdMethod_this(a, a));
  }
  







  public static Ja jdMethod_this(Method a)
  {
    return new Ja(a.getName(), iB.jdMethod_this(a));
  }
  







  public static Ja jdMethod_this(Constructor<?> a)
  {
    return new Ja(IOUtils.jdMethod_this("4>f>|i"), iB.jdMethod_this(a));
  }
  















  public static Ja jdMethod_this(String a)
    throws IllegalArgumentException
  {
    int tmp3_2 = 1;tmp3_2;return jdMethod_this(0, tmp3_2);
  }
  





















  public static Ja jdMethod_this(String a, boolean a)
    throws IllegalArgumentException
  {
    int tmp6_5 = 1;tmp6_5;int i = 32.indexOf(tmp6_5);
    1; int tmp22_21 = 1; int tmp23_22 = tmp22_21;tmp23_22;int j = tmp22_21 + tmp23_22; int 
      tmp30_29 = 1;tmp30_29;int k = 41.indexOf(tmp30_29, j); int 
      tmp41_40 = 1;tmp41_40; if (-1 != tmp41_40) { int tmp49_48 = 1;tmp49_48; if (-1 != tmp49_48) { int tmp58_57 = 1;tmp58_57; if (-1 != tmp58_57) break label71; } }
    throw new IllegalArgumentException();
    label71:
    tmp75_74 = 1; tmp75_74;String str2 = 0.substring(tmp75_74, i); int 
      tmp85_84 = 1; int tmp86_85 = tmp85_84;tmp86_85; int tmp91_90 = 1; int tmp92_91 = tmp91_90;tmp92_91;String str1 = (tmp85_84 + tmp86_85).substring(j, tmp91_90 - tmp92_91).trim();
    StringBuilder localStringBuilder = new StringBuilder(); int 
      tmp115_114 = 1;tmp115_114;40.append(tmp115_114);
    label189:
    do
    {
      tmp125_124 = 1;tmp125_124;
      int m; tmp136_135 = 1;tmp136_135; String str3; if (-1 == tmp136_135) {
        str3 = jdMethod_this(a.substring(j, k).trim(), a);tmpTernaryOp = localStringBuilder; break label189; throw (m = 44.indexOf(tmp125_124, j));
      } else {
        str3 = jdMethod_this(a.substring(j, m).trim(), a);
        tmp182_181 = 1;tmp183_182 = tmp182_181;tmp183_182;j = tmp182_181 + tmp183_182;
      }
      localStringBuilder.append(str3);
      1; } while (-1 != tmp199_198);
    1;
    localStringBuilder.append(jdMethod_this(str2, a));
    return new Ja(str1, localStringBuilder.toString());
  }
  


































  public String jdMethod_true()
  {
    return jdField_byte;
  }
  




  public String jdMethod_this()
  {
    return jdField_new;
  }
  




  public iB jdMethod_this()
  {
    return iB.jdMethod_this(jdField_new);
  }
  




  public iB[] jdMethod_this()
  {
    return iB.jdMethod_this(jdField_new);
  }
  
  public String toString()
  {
    return jdField_new;
  }
  
  public boolean equals(Object a)
  {
    if (!(a instanceof Ja)) {
      int tmp9_8 = 1;tmp9_8;return tmp9_8;throw 0;
    }
    a = (Ja)a;
    if ((jdField_byte.equals(jdField_byte)) && (jdField_new.equals(jdField_new))) { int tmp47_46 = 1; int tmp48_47 = tmp47_46;tmp48_47;return tmp48_47;throw tmp47_46; } int tmp54_53 = 1;tmp54_53;return tmp54_53;
  }
  
  public int hashCode()
  {
    return jdField_byte.hashCode() ^ jdField_new.hashCode();
  }
  
  /* Error */
  private static String jdMethod_this(String a, boolean a)
  {
    // Byte code:
    //   0: ldc 100
    //   2: aload_0
    //   3: invokevirtual 104	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   6: ifeq +6 -> 12
    //   9: aload_0
    //   10: areturn
    //   11: athrow
    //   12: new 81	java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial 82	java/lang/StringBuilder:<init>	()V
    //   19: astore_2
    //   20: iconst_0
    //   21: iconst_1
    //   22: dup
    //   23: pop2
    //   24: istore_3
    //   25: aload_0
    //   26: ldc 106
    //   28: invokestatic 109	z/A:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   31: iload_3
    //   32: invokevirtual 112	java/lang/String:indexOf	(Ljava/lang/String;I)I
    //   35: iconst_1
    //   36: dup
    //   37: dup
    //   38: pop2
    //   39: iadd
    //   40: dup
    //   41: istore_3
    //   42: ifle +18 -> 60
    //   45: aload_0
    //   46: aload_2
    //   47: bipush 91
    //   49: iconst_1
    //   50: dup
    //   51: pop2
    //   52: invokevirtual 86	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   55: pop
    //   56: goto -30 -> 26
    //   59: athrow
    //   60: aload_0
    //   61: iconst_0
    //   62: iconst_1
    //   63: dup
    //   64: pop2
    //   65: aload_0
    //   66: invokevirtual 116	java/lang/String:length	()I
    //   69: aload_2
    //   70: invokevirtual 117	java/lang/StringBuilder:length	()I
    //   73: iconst_2
    //   74: iconst_1
    //   75: dup
    //   76: pop2
    //   77: imul
    //   78: isub
    //   79: invokevirtual 76	java/lang/String:substring	(II)Ljava/lang/String;
    //   82: astore_3
    //   83: getstatic 119	z/Ja:void	Ljava/util/Map;
    //   86: aload_3
    //   87: invokeinterface 125 2 0
    //   92: checkcast 64	java/lang/String
    //   95: dup
    //   96: astore 4
    //   98: aload_2
    //   99: swap
    //   100: ifnull +13 -> 113
    //   103: aload 4
    //   105: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: aload_2
    //   110: goto +78 -> 188
    //   113: bipush 76
    //   115: iconst_1
    //   116: dup
    //   117: pop2
    //   118: invokevirtual 86	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   121: pop
    //   122: aload_3
    //   123: bipush 46
    //   125: iconst_1
    //   126: dup
    //   127: pop2
    //   128: invokevirtual 68	java/lang/String:indexOf	(I)I
    //   131: ifge +27 -> 158
    //   134: iload_1
    //   135: ifne +13 -> 148
    //   138: aload_2
    //   139: ldc 127
    //   141: invokestatic 52	org/powerbot/util/IOUtils:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   144: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   147: pop
    //   148: aload_2
    //   149: dup
    //   150: aload_3
    //   151: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: pop
    //   155: goto +23 -> 178
    //   158: aload_2
    //   159: dup
    //   160: aload_3
    //   161: bipush 46
    //   163: iconst_1
    //   164: dup
    //   165: pop2
    //   166: bipush 47
    //   168: iconst_1
    //   169: dup
    //   170: pop2
    //   171: invokevirtual 131	java/lang/String:replace	(CC)Ljava/lang/String;
    //   174: invokevirtual 92	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: pop
    //   178: bipush 59
    //   180: iconst_1
    //   181: dup
    //   182: pop2
    //   183: invokevirtual 86	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   186: pop
    //   187: aload_2
    //   188: invokevirtual 95	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   191: areturn
    // Line number table:
    //   Java source line #199	-> byte code offset #0
    //   Java source line #200	-> byte code offset #9
    //   Java source line #203	-> byte code offset #12
    //   Java source line #204	-> byte code offset #20
    //   Java source line #205	-> byte code offset #25
    //   Java source line #206	-> byte code offset #46
    //   Java source line #209	-> byte code offset #60
    //   Java source line #210	-> byte code offset #83
    //   Java source line #211	-> byte code offset #98
    //   Java source line #212	-> byte code offset #103
    //   Java source line #214	-> byte code offset #113
    //   Java source line #215	-> byte code offset #122
    //   Java source line #216	-> byte code offset #134
    //   Java source line #217	-> byte code offset #138
    //   Java source line #219	-> byte code offset #148
    //   Java source line #221	-> byte code offset #158
    //   Java source line #223	-> byte code offset #178
    //   Java source line #225	-> byte code offset #187
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	192	0	a	String
    //   0	192	1	a	int
  }
}
