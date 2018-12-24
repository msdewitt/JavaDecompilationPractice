package org.powerbot.bot;

import java.util.Map;

public class Reflector
{
  private final ClassLoader jdField_else;
  private final Map<String, String> jdField_if;
  private final Map<String, FieldConfig> jdField_null;
  private final Map<String, Long> jdField_byte;
  private final Map<String, Class<?>> jdField_new;
  private final Map<FieldConfig, java.lang.reflect.Field> jdField_void;
  
  public Reflector(ClassLoader a, ReflectorSpec a) {
    a.<init>(a, 32jdField_byte, 32jdField_new, jdField_void);
  }
  
  public Reflector(ClassLoader a, Map<String, String> a, Map<String, FieldConfig> a, Map<String, Long> a) {
    jdField_else = a;
    jdField_if = a;
    jdField_null = a;
    jdField_byte = a;
    a;a.<init>();jdField_new = a;
    a;a.<init>();jdField_void = a;
  }
  
  /* Error */
  public long getConstant(String a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 55	org/powerbot/bot/Reflector:byte	Ljava/util/Map;
    //   4: aload_1
    //   5: invokeinterface 66 2 0
    //   10: checkcast 68	java/lang/Long
    //   13: dup
    //   14: astore_1
    //   15: ifnull +9 -> 24
    //   18: aload_1
    //   19: invokevirtual 72	java/lang/Long:longValue	()J
    //   22: lreturn
    //   23: athrow
    //   24: ldc2_w 73
    //   27: lreturn
    // Line number table:
    //   Java source line #58	-> byte code offset #0
    //   Java source line #59	-> byte code offset #15
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	28	0	a	Reflector
    //   0	28	1	a	String
  }
  
  public static class FieldConfig
  {
    private final String jdField_null;
    private final String jdField_byte;
    private final String jdField_new;
    private final long jdField_void;
    
    public FieldConfig(String a, String a, String a, long a)
    {
      jdField_null = a;
      jdField_byte = a;
      jdField_new = a;
      jdField_void = a;
    }
    
    public String toString()
    {
      1; int tmp13_12 = 1;tmp13_12; int tmp18_17 = 1;tmp18_17;0[tmp18_17] = z.auX.jdMethod_this("J\017i\nh%c\bj\017k"); int tmp28_27 = 1; int tmp29_28 = tmp28_27;tmp29_28;tmp28_27[tmp29_28] = jdField_null; int tmp39_38 = 1;tmp39_38;2[tmp39_38] = jdField_byte; int tmp49_48 = 1;tmp49_48;3[tmp49_48] = jdField_new; int tmp56_13 = tmp13_12; int tmp59_58 = 1;tmp59_58;4[tmp59_58] = Long.valueOf(jdField_void);return String.format(tmp56_13, tmp56_13);
    }
  }
  
  public static class FieldCache {
    private Reflector.FieldConfig jdField_void;
    
    public FieldCache() {
      jdField_void = null;
    }
    
    /* Error */
    public String toString()
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 19	org/powerbot/bot/Reflector$FieldCache:void	Lorg/powerbot/bot/Reflector$FieldConfig;
      //   4: ifnull +12 -> 16
      //   7: aload_0
      //   8: getfield 19	org/powerbot/bot/Reflector$FieldCache:void	Lorg/powerbot/bot/Reflector$FieldConfig;
      //   11: invokevirtual 25	org/powerbot/bot/Reflector$FieldConfig:toString	()Ljava/lang/String;
      //   14: areturn
      //   15: athrow
      //   16: ldc 27
      //   18: invokestatic 33	z/lpT1:this	(Ljava/lang/Object;)Ljava/lang/String;
      //   21: areturn
      // Line number table:
      //   Java source line #53	-> byte code offset #0
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	22	0	a	FieldCache
    }
  }
  
  public boolean accessBool(ReflectProxy a, FieldCache a)
  {
    int tmp5_4 = 1;tmp5_4;return ((Boolean)a.jdMethod_this(a, 0, Boolean.valueOf(tmp5_4))).booleanValue();
  }
  
  /* Error */
  public int accessInt(ReflectProxy a, FieldCache a)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic 100	org/powerbot/bot/Reflector$FieldCache:this	(Lorg/powerbot/bot/Reflector$FieldCache;)Lorg/powerbot/bot/Reflector$FieldConfig;
    //   4: ifnull +11 -> 15
    //   7: aload_2
    //   8: invokestatic 100	org/powerbot/bot/Reflector$FieldCache:this	(Lorg/powerbot/bot/Reflector$FieldCache;)Lorg/powerbot/bot/Reflector$FieldConfig;
    //   11: goto +12 -> 23
    //   14: athrow
    //   15: aload_2
    //   16: aload_0
    //   17: invokespecial 103	org/powerbot/bot/Reflector:this	()Lorg/powerbot/bot/Reflector$FieldConfig;
    //   20: invokestatic 106	org/powerbot/bot/Reflector$FieldCache:this	(Lorg/powerbot/bot/Reflector$FieldCache;Lorg/powerbot/bot/Reflector$FieldConfig;)Lorg/powerbot/bot/Reflector$FieldConfig;
    //   23: astore_3
    //   24: aload_3
    //   25: ifnonnull +9 -> 34
    //   28: iconst_m1
    //   29: iconst_1
    //   30: dup
    //   31: pop2
    //   32: ireturn
    //   33: athrow
    //   34: aload_0
    //   35: aload_1
    //   36: aload_3
    //   37: ldc 108
    //   39: invokespecial 111	org/powerbot/bot/Reflector:this	(Lorg/powerbot/bot/ReflectProxy;Lorg/powerbot/bot/Reflector$FieldConfig;Ljava/lang/Class;)Ljava/lang/Object;
    //   42: checkcast 108	java/lang/Integer
    //   45: dup
    //   46: astore_1
    //   47: ifnull +14 -> 61
    //   50: aload_1
    //   51: invokevirtual 115	java/lang/Integer:intValue	()I
    //   54: aload_3
    //   55: invokestatic 118	org/powerbot/bot/Reflector$FieldConfig:this	(Lorg/powerbot/bot/Reflector$FieldConfig;)J
    //   58: l2i
    //   59: imul
    //   60: ireturn
    //   61: iconst_m1
    //   62: iconst_1
    //   63: dup
    //   64: pop2
    //   65: ireturn
    // Line number table:
    //   Java source line #67	-> byte code offset #0
    //   Java source line #68	-> byte code offset #24
    //   Java source line #69	-> byte code offset #28
    //   Java source line #71	-> byte code offset #34
    //   Java source line #72	-> byte code offset #47
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	66	0	a	Reflector
    //   0	66	1	a	ReflectProxy
    //   0	66	2	a	FieldCache
  }
  
  public int[] accessInts(ReflectProxy a, FieldCache a)
  {
    return (int[])a.access(a, a, [I.class);
  }
  
  /* Error */
  public long accessLong(ReflectProxy a, FieldCache a)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic 100	org/powerbot/bot/Reflector$FieldCache:this	(Lorg/powerbot/bot/Reflector$FieldCache;)Lorg/powerbot/bot/Reflector$FieldConfig;
    //   4: ifnull +11 -> 15
    //   7: aload_2
    //   8: invokestatic 100	org/powerbot/bot/Reflector$FieldCache:this	(Lorg/powerbot/bot/Reflector$FieldCache;)Lorg/powerbot/bot/Reflector$FieldConfig;
    //   11: goto +12 -> 23
    //   14: athrow
    //   15: aload_2
    //   16: aload_0
    //   17: invokespecial 103	org/powerbot/bot/Reflector:this	()Lorg/powerbot/bot/Reflector$FieldConfig;
    //   20: invokestatic 106	org/powerbot/bot/Reflector$FieldCache:this	(Lorg/powerbot/bot/Reflector$FieldCache;Lorg/powerbot/bot/Reflector$FieldConfig;)Lorg/powerbot/bot/Reflector$FieldConfig;
    //   23: astore_3
    //   24: aload_3
    //   25: ifnonnull +8 -> 33
    //   28: ldc2_w 73
    //   31: lreturn
    //   32: athrow
    //   33: aload_0
    //   34: aload_1
    //   35: aload_3
    //   36: ldc 68
    //   38: invokespecial 111	org/powerbot/bot/Reflector:this	(Lorg/powerbot/bot/ReflectProxy;Lorg/powerbot/bot/Reflector$FieldConfig;Ljava/lang/Class;)Ljava/lang/Object;
    //   41: checkcast 68	java/lang/Long
    //   44: dup
    //   45: astore_1
    //   46: ifnull +13 -> 59
    //   49: aload_1
    //   50: invokevirtual 72	java/lang/Long:longValue	()J
    //   53: aload_3
    //   54: invokestatic 118	org/powerbot/bot/Reflector$FieldConfig:this	(Lorg/powerbot/bot/Reflector$FieldConfig;)J
    //   57: lmul
    //   58: lreturn
    //   59: ldc2_w 73
    //   62: lreturn
    // Line number table:
    //   Java source line #80	-> byte code offset #0
    //   Java source line #81	-> byte code offset #24
    //   Java source line #82	-> byte code offset #28
    //   Java source line #84	-> byte code offset #33
    //   Java source line #85	-> byte code offset #46
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	a	Reflector
    //   0	63	1	a	ReflectProxy
    //   0	63	2	a	FieldCache
  }
  
  public float accessFloat(ReflectProxy a, FieldCache a)
  {
    return ((Float)a.jdMethod_this(a, a, Float.valueOf(-1.0F))).floatValue();
  }
  
  public double accessDouble(ReflectProxy a, FieldCache a) {
    return ((Double)a.jdMethod_this(a, a, Double.valueOf(-1.0D))).doubleValue();
  }
  
  public byte accessByte(ReflectProxy a, FieldCache a) {
    int tmp5_4 = 1;tmp5_4;return ((Byte)a.jdMethod_this(a, -1, Byte.valueOf(tmp5_4))).byteValue();
  }
  
  public short accessShort(ReflectProxy a, FieldCache a) {
    int tmp5_4 = 1;tmp5_4;return ((Short)a.jdMethod_this(a, -1, Short.valueOf(tmp5_4))).shortValue();
  }
  
  public String accessString(ReflectProxy a, FieldCache a) {
    return (String)a.access(a, a, String.class);
  }
  
  public Object access(ReflectProxy a, FieldCache a) {
    return a.access(a, a, Object.class);
  }
  
  public <T> T access(ReflectProxy a, FieldCache a, Class<T> a) {
    if (FieldCache.jdMethod_this(a) != null) { tmpTernaryOp = a; break label27; throw FieldCache.jdMethod_this(a); } label27: return a.jdMethod_this(a, FieldCache.jdMethod_this(a, a.jdMethod_this()), a);
  }
  
  /* Error */
  private <T> T jdMethod_this(ReflectProxy a, FieldConfig a, Class<T> a)
  {
    // Byte code:
    //   0: aload_1
    //   1: getfield 195	org/powerbot/bot/ReflectProxy:obj	Ljava/lang/ref/WeakReference;
    //   4: invokevirtual 200	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   7: astore_1
    //   8: aload_2
    //   9: ifnonnull +6 -> 15
    //   12: aconst_null
    //   13: areturn
    //   14: athrow
    //   15: aload_0
    //   16: getfield 60	org/powerbot/bot/Reflector:void	Ljava/util/Map;
    //   19: aload_2
    //   20: invokeinterface 204 2 0
    //   25: ifeq +56 -> 81
    //   28: aload_0
    //   29: getfield 60	org/powerbot/bot/Reflector:void	Ljava/util/Map;
    //   32: aload_2
    //   33: invokeinterface 66 2 0
    //   38: checkcast 206	java/lang/reflect/Field
    //   41: dup
    //   42: astore 4
    //   44: ifnonnull +107 -> 151
    //   47: new 208	java/lang/RuntimeException
    //   50: dup
    //   51: new 210	java/lang/StringBuilder
    //   54: dup
    //   55: invokespecial 211	java/lang/StringBuilder:<init>	()V
    //   58: iconst_0
    //   59: ldc -43
    //   61: invokestatic 218	org/powerbot/bot/rt4/NodeQueue:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   64: invokevirtual 222	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   67: aload_2
    //   68: invokevirtual 226	org/powerbot/bot/Reflector$FieldConfig:toString	()Ljava/lang/String;
    //   71: invokevirtual 230	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   74: invokevirtual 231	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   77: invokespecial 234	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   80: athrow
    //   81: aload_0
    //   82: aload_2
    //   83: invokestatic 238	org/powerbot/bot/Reflector$FieldConfig:true	(Lorg/powerbot/bot/Reflector$FieldConfig;)Ljava/lang/String;
    //   86: invokespecial 241	org/powerbot/bot/Reflector:this	(Ljava/lang/String;)Ljava/lang/Class;
    //   89: dup
    //   90: astore 5
    //   92: ifnonnull +18 -> 110
    //   95: aload_0
    //   96: getfield 60	org/powerbot/bot/Reflector:void	Ljava/util/Map;
    //   99: aload_2
    //   100: aconst_null
    //   101: dup_x2
    //   102: invokeinterface 245 3 0
    //   107: pop
    //   108: areturn
    //   109: athrow
    //   110: aload 5
    //   112: aload_2
    //   113: invokestatic 247	org/powerbot/bot/Reflector$FieldConfig:this	(Lorg/powerbot/bot/Reflector$FieldConfig;)Ljava/lang/String;
    //   116: invokevirtual 251	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   119: astore 4
    //   121: aload 4
    //   123: goto +21 -> 144
    //   126: astore 6
    //   128: aload_0
    //   129: getfield 60	org/powerbot/bot/Reflector:void	Ljava/util/Map;
    //   132: aload_2
    //   133: aconst_null
    //   134: dup_x2
    //   135: invokeinterface 245 3 0
    //   140: pop
    //   141: areturn
    //   142: nop
    //   143: athrow
    //   144: iconst_1
    //   145: dup
    //   146: dup
    //   147: pop2
    //   148: invokevirtual 255	java/lang/reflect/Field:setAccessible	(Z)V
    //   151: aload 4
    //   153: invokevirtual 258	java/lang/reflect/Field:getModifiers	()I
    //   156: bipush 8
    //   158: iconst_1
    //   159: dup
    //   160: pop2
    //   161: iand
    //   162: ifeq +10 -> 172
    //   165: iconst_1
    //   166: dup
    //   167: dup
    //   168: pop2
    //   169: goto +7 -> 176
    //   172: iconst_0
    //   173: iconst_1
    //   174: dup
    //   175: pop2
    //   176: istore 6
    //   178: iload 6
    //   180: ifeq +14 -> 194
    //   183: aload 4
    //   185: aconst_null
    //   186: invokevirtual 259	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   189: astore 5
    //   191: goto +26 -> 217
    //   194: aload_1
    //   195: ifnull +12 -> 207
    //   198: aload 4
    //   200: aload_1
    //   201: invokevirtual 259	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   204: goto +4 -> 208
    //   207: aconst_null
    //   208: astore 5
    //   210: goto +7 -> 217
    //   213: astore 6
    //   215: aconst_null
    //   216: areturn
    //   217: aload 5
    //   219: ifnull +10 -> 229
    //   222: aload_3
    //   223: aload 5
    //   225: invokevirtual 262	java/lang/Class:cast	(Ljava/lang/Object;)Ljava/lang/Object;
    //   228: areturn
    //   229: aconst_null
    //   230: areturn
    // Line number table:
    //   Java source line #117	-> byte code offset #0
    //   Java source line #118	-> byte code offset #8
    //   Java source line #119	-> byte code offset #12
    //   Java source line #123	-> byte code offset #15
    //   Java source line #124	-> byte code offset #28
    //   Java source line #125	-> byte code offset #44
    //   Java source line #126	-> byte code offset #47
    //   Java source line #129	-> byte code offset #81
    //   Java source line #130	-> byte code offset #92
    //   Java source line #131	-> byte code offset #95
    //   Java source line #132	-> byte code offset #108
    //   Java source line #135	-> byte code offset #110
    //   Java source line #139	-> byte code offset #123
    //   Java source line #136	-> byte code offset #126
    //   Java source line #137	-> byte code offset #128
    //   Java source line #138	-> byte code offset #141
    //   Java source line #140	-> byte code offset #142
    //   Java source line #145	-> byte code offset #151
    //   Java source line #146	-> byte code offset #178
    //   Java source line #147	-> byte code offset #183
    //   Java source line #149	-> byte code offset #194
    //   Java source line #153	-> byte code offset #210
    //   Java source line #151	-> byte code offset #213
    //   Java source line #152	-> byte code offset #215
    //   Java source line #154	-> byte code offset #217
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	231	0	a	Reflector
    //   0	231	1	a	ReflectProxy
    //   0	231	2	a	FieldConfig
    //   0	231	3	a	Class
    // Exception table:
    //   from	to	target	type
    //   110	121	126	java/lang/NoSuchFieldException
    //   151	210	213	java/lang/IllegalArgumentException
    //   151	210	213	java/lang/IllegalAccessException
  }
  
  /* Error */
  private <T> T jdMethod_this(ReflectProxy a, FieldCache a, T a)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: aload_3
    //   4: invokevirtual 269	java/lang/Object:getClass	()Ljava/lang/Class;
    //   7: invokevirtual 128	org/powerbot/bot/Reflector:access	(Lorg/powerbot/bot/ReflectProxy;Lorg/powerbot/bot/Reflector$FieldCache;Ljava/lang/Class;)Ljava/lang/Object;
    //   10: dup
    //   11: astore_1
    //   12: ifnonnull +6 -> 18
    //   15: aload_3
    //   16: areturn
    //   17: athrow
    //   18: aload_1
    //   19: areturn
    // Line number table:
    //   Java source line #158	-> byte code offset #0
    //   Java source line #159	-> byte code offset #12
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	20	0	a	Reflector
    //   0	20	1	a	ReflectProxy
    //   0	20	2	a	FieldCache
    //   0	20	3	a	Object
  }
  
  /* Error */
  private StackTraceElement jdMethod_this()
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokevirtual 274	java/lang/Class:getName	()Ljava/lang/String;
    //   5: astore_1
    //   6: invokestatic 280	java/lang/Thread:currentThread	()Ljava/lang/Thread;
    //   9: invokevirtual 284	java/lang/Thread:getStackTrace	()[Ljava/lang/StackTraceElement;
    //   12: astore_2
    //   13: iconst_2
    //   14: iconst_1
    //   15: dup
    //   16: pop2
    //   17: dup
    //   18: istore_3
    //   19: aload_2
    //   20: arraylength
    //   21: if_icmpge +38 -> 59
    //   24: aload_2
    //   25: iload_3
    //   26: aaload
    //   27: ifnull +25 -> 52
    //   30: aload_2
    //   31: iload_3
    //   32: aaload
    //   33: invokevirtual 289	java/lang/StackTraceElement:getClassName	()Ljava/lang/String;
    //   36: aload_1
    //   37: invokevirtual 292	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   40: ifeq +7 -> 47
    //   43: goto +9 -> 52
    //   46: athrow
    //   47: aload_2
    //   48: iload_3
    //   49: aaload
    //   50: areturn
    //   51: athrow
    //   52: iinc 3 1
    //   55: iload_3
    //   56: goto -37 -> 19
    //   59: aload_2
    //   60: dup
    //   61: arraylength
    //   62: iconst_1
    //   63: dup
    //   64: dup
    //   65: pop2
    //   66: isub
    //   67: aaload
    //   68: areturn
    // Line number table:
    //   Java source line #163	-> byte code offset #0
    //   Java source line #164	-> byte code offset #6
    //   Java source line #165	-> byte code offset #13
    //   Java source line #166	-> byte code offset #24
    //   Java source line #167	-> byte code offset #43
    //   Java source line #169	-> byte code offset #47
    //   Java source line #165	-> byte code offset #52
    //   Java source line #171	-> byte code offset #59
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	69	0	a	Reflector
  }
  
  String jdMethod_true(String a)
  {
    return (String)jdField_if.get(a);
  }
  
  private String jdMethod_this(String a) {
    int tmp4_3 = 1;tmp4_3; int tmp9_8 = 1;tmp9_8;a = tmp4_3.replace('/', tmp9_8);
    for (java.util.Iterator localIterator = jdField_if.entrySet().iterator(); localIterator.hasNext();) { java.util.Map.Entry localEntry;
      if (((String)(localEntry = (java.util.Map.Entry)localIterator.next()).getValue()).equals(a)) {
        return (String)localEntry.getKey();
        
        throw 46; } }
    return null;
  }
  
  /* Error */
  private Class<?> jdMethod_this(String a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 59	org/powerbot/bot/Reflector:new	Ljava/util/Map;
    //   4: aload_1
    //   5: invokeinterface 204 2 0
    //   10: ifeq +20 -> 30
    //   13: aload_0
    //   14: getfield 59	org/powerbot/bot/Reflector:new	Ljava/util/Map;
    //   17: aload_1
    //   18: invokeinterface 66 2 0
    //   23: checkcast 185	java/lang/Class
    //   26: dup
    //   27: astore_2
    //   28: areturn
    //   29: athrow
    //   30: aload_0
    //   31: dup
    //   32: getfield 59	org/powerbot/bot/Reflector:new	Ljava/util/Map;
    //   35: swap
    //   36: getfield 50	org/powerbot/bot/Reflector:else	Ljava/lang/ClassLoader;
    //   39: aload_1
    //   40: dup_x1
    //   41: invokevirtual 332	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   44: dup
    //   45: astore_2
    //   46: invokeinterface 245 3 0
    //   51: pop
    //   52: aload_2
    //   53: areturn
    //   54: athrow
    //   55: astore_3
    //   56: aload_0
    //   57: getfield 59	org/powerbot/bot/Reflector:new	Ljava/util/Map;
    //   60: aload_1
    //   61: aconst_null
    //   62: dup_x2
    //   63: invokeinterface 245 3 0
    //   68: pop
    //   69: areturn
    //   70: nop
    //   71: athrow
    // Line number table:
    //   Java source line #190	-> byte code offset #0
    //   Java source line #191	-> byte code offset #13
    //   Java source line #194	-> byte code offset #30
    //   Java source line #198	-> byte code offset #53
    //   Java source line #195	-> byte code offset #55
    //   Java source line #196	-> byte code offset #56
    //   Java source line #197	-> byte code offset #69
    //   Java source line #200	-> byte code offset #70
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	a	Reflector
    //   0	72	1	a	String
    // Exception table:
    //   from	to	target	type
    //   30	52	55	java/lang/InternalError
    //   30	52	55	java/lang/ClassNotFoundException
  }
  
  public boolean isTypeOf(Object a, Class<? extends ReflectProxy> a)
  {
    try
    {
      a = a.jdMethod_this(a.getName());
      if ((a == null) || (a == null)) {
        int tmp19_18 = 1;tmp19_18;return tmp19_18;throw 0;
      }
      Class localClass;
      if (((localClass = a.jdMethod_this(a)) != null) && (a.getClass().isAssignableFrom(localClass))) { int tmp45_44 = 1; int tmp46_45 = tmp45_44;tmp46_45;return tmp46_45;throw tmp45_44; } int tmp52_51 = 1;tmp52_51;return tmp52_51;
    } catch (InternalError a) {
      1; } return tmp58_57;
  }
  

  private FieldConfig jdMethod_this()
  {
    int tmp11_10 = 1;tmp11_10; int tmp16_15 = 1;tmp16_15;String str = tmp11_10.replace('/', tmp16_15);Object localObject = 46.getMethodName();
    if (str.endsWith(org.powerbot.script.Vector3.jdMethod_this("N\032d\023c\002"))) { tmpTernaryOp = ""; break label76; throw new StringBuilder(); } else { 1; } label76: str = 46.append(tmp68_67).toString() + (String)localObject;
    
    if ((localObject = (FieldConfig)jdField_null.get(str)) == null) {
      throw new RuntimeException(str);
    }
    return localObject;
  }
  

  private static java.util.List<java.lang.reflect.Field> jdMethod_this(Class<?> a)
  {
    java.util.ArrayList localArrayList;
    Class localClass = a.getSuperclass();java.util.Collections.addAll(localArrayList = new java.util.ArrayList(), a.getDeclaredFields());
    if ((localClass != null) && (!localClass.equals(Object.class))) {
      localArrayList.addAll(jdMethod_this(localClass));
    }
    
    return localArrayList;
  }
}
