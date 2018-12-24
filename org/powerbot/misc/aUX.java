package org.powerbot.misc;

import java.lang.reflect.Type;
import org.powerbot.script.Calculations;
import org.powerbot.script.Script.Manifest;









public final class aUX
  implements Comparable<aUX>
{
  public static final String jdField_long = Calculations.jdMethod_this("!J}\nr\004}");
  private final String jdField_int;
  private final String jdField_super;
  private final String jdField_final;
  public String jdField_enum;
  public byte[] jdField_else;
  public String jdField_if;
  public String jdField_null;
  public boolean jdField_byte;
  public boolean jdField_new;
  public Type jdField_void;
  
  public aUX(Script.Manifest a)
  {
    int tmp15_14 = 1;tmp15_14;
    

      87jdField_byte = tmp15_14; int tmp21_20 = 1;tmp21_20;jdField_new = tmp21_20;
    jdField_int = tmp8_7.name();
    jdField_super = a;
    jdField_final = null.description();
  }
  
  aUX(String a, String a, String a)
  {
    int tmp15_14 = 1;tmp15_14;
    







      87jdField_byte = tmp15_14; int tmp21_20 = 1;tmp21_20;jdField_new = tmp21_20;
    jdField_int = tmp8_7;
    jdField_super = a;
    jdField_final = a;
  }
  
  /* Error */
  private String jdMethod_this(String a)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +10 -> 11
    //   4: aload_1
    //   5: invokevirtual 64	java/lang/String:isEmpty	()Z
    //   8: ifeq +7 -> 15
    //   11: ldc 66
    //   13: areturn
    //   14: athrow
    //   15: aload_1
    //   16: invokevirtual 69	java/lang/String:trim	()Ljava/lang/String;
    //   19: invokestatic 74	org/powerbot/script/StringUtils:stripHtml	(Ljava/lang/String;)Ljava/lang/String;
    //   22: areturn
    // Line number table:
    //   Java source line #48	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	23	0	a	aUX
    //   0	23	1	a	String
  }
  
  public String jdMethod_true()
  {
    return a.jdMethod_this(jdField_int);
  }
  
  /* Error */
  public String getID()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 47	org/powerbot/misc/aUX:super	Ljava/lang/String;
    //   4: ifnonnull +7 -> 11
    //   7: ldc 66
    //   9: areturn
    //   10: athrow
    //   11: aload_0
    //   12: getfield 47	org/powerbot/misc/aUX:super	Ljava/lang/String;
    //   15: areturn
    // Line number table:
    //   Java source line #57	-> byte code offset #0
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	16	0	a	aUX
  }
  
  public String jdMethod_this()
  {
    return a.jdMethod_this(jdField_final);
  }
  
  public String toString()
  {
    return a.jdMethod_true().toLowerCase();
  }
  
  /* Error */
  public static aUX jdMethod_this(java.util.Map<String, String> a)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 89
    //   3: invokestatic 94	org/powerbot/bot/rt4/HashTable:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   6: aconst_null
    //   7: invokeinterface 100 3 0
    //   12: checkcast 60	java/lang/String
    //   15: dup
    //   16: astore_1
    //   17: ifnull +10 -> 27
    //   20: aload_1
    //   21: invokevirtual 64	java/lang/String:isEmpty	()Z
    //   24: ifeq +6 -> 30
    //   27: aconst_null
    //   28: areturn
    //   29: athrow
    //   30: aload_0
    //   31: ldc 102
    //   33: invokestatic 105	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   36: aconst_null
    //   37: invokeinterface 100 3 0
    //   42: checkcast 60	java/lang/String
    //   45: astore_2
    //   46: aload_0
    //   47: ldc 107
    //   49: invokestatic 94	org/powerbot/bot/rt4/HashTable:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   52: aconst_null
    //   53: invokeinterface 100 3 0
    //   58: checkcast 60	java/lang/String
    //   61: astore_3
    //   62: new 2	org/powerbot/misc/aUX
    //   65: dup
    //   66: aload_1
    //   67: aload_2
    //   68: aload_3
    //   69: invokespecial 109	org/powerbot/misc/aUX:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   72: dup
    //   73: astore_2
    //   74: aload_0
    //   75: ldc 111
    //   77: invokestatic 105	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   80: invokeinterface 115 2 0
    //   85: ifeq +36 -> 121
    //   88: aload_0
    //   89: ldc 117
    //   91: invokestatic 94	org/powerbot/bot/rt4/HashTable:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   94: invokeinterface 121 2 0
    //   99: checkcast 60	java/lang/String
    //   102: ldc 123
    //   104: invokestatic 105	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   107: invokevirtual 126	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   110: ifne +11 -> 121
    //   113: iconst_1
    //   114: dup
    //   115: dup
    //   116: pop2
    //   117: goto +8 -> 125
    //   120: athrow
    //   121: iconst_0
    //   122: iconst_1
    //   123: dup
    //   124: pop2
    //   125: putfield 39	org/powerbot/misc/aUX:new	Z
    //   128: aload_2
    //   129: aload_0
    //   130: ldc -128
    //   132: invokestatic 94	org/powerbot/bot/rt4/HashTable:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   135: ldc 66
    //   137: invokeinterface 100 3 0
    //   142: checkcast 60	java/lang/String
    //   145: putfield 130	org/powerbot/misc/aUX:null	Ljava/lang/String;
    //   148: aload_0
    //   149: aload_2
    //   150: dup_x1
    //   151: invokestatic 135	org/powerbot/util/AUX:this	(Ljava/util/Map;Lorg/powerbot/misc/aUX;)V
    //   154: areturn
    // Line number table:
    //   Java source line #70	-> byte code offset #0
    //   Java source line #72	-> byte code offset #17
    //   Java source line #73	-> byte code offset #27
    //   Java source line #76	-> byte code offset #30
    //   Java source line #77	-> byte code offset #46
    //   Java source line #79	-> byte code offset #62
    //   Java source line #80	-> byte code offset #74
    //   Java source line #81	-> byte code offset #128
    //   Java source line #83	-> byte code offset #148
    //   Java source line #84	-> byte code offset #154
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	155	0	a	java.util.Map
  }
  
  public int jdMethod_this(aUX a)
  {
    String str1 = a.getID();String str2 = a.getID();
    if ((str1 == null) || (str2 == null)) { int tmp20_19 = 1;tmp20_19;return tmp20_19;throw 0; } return str1.compareTo(str2);
  }
}
