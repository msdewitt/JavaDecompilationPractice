package org.powerbot.bot.rt6;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import org.powerbot.bot.rt6.client.Node;

public class HashTable<N> implements Iterator<N>, Iterable<N>
{
  private final org.powerbot.bot.rt6.client.HashTable jdField_if;
  private final Class<N> jdField_null;
  private int jdField_byte;
  private Node jdField_new;
  private Node jdField_void;
  
  public HashTable(org.powerbot.bot.rt6.client.HashTable a, Class<N> a)
  {
    int tmp8_7 = 1;tmp8_7;
    


      0jdField_byte = tmp8_7;
    



    if (a == null) {
      throw new IllegalArgumentException();
    }
    jdField_if = a;
    jdField_null = a;
  }
  
  public Iterator<N> iterator()
  {
    return a;
  }
  
  /* Error */
  public boolean hasNext()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 46	org/powerbot/bot/rt6/HashTable:void	Lorg/powerbot/bot/rt6/client/Node;
    //   4: ifnull +9 -> 13
    //   7: iconst_1
    //   8: dup
    //   9: dup
    //   10: pop2
    //   11: ireturn
    //   12: athrow
    //   13: aload_0
    //   14: getfield 32	org/powerbot/bot/rt6/HashTable:if	Lorg/powerbot/bot/rt6/client/HashTable;
    //   17: invokevirtual 49	org/powerbot/bot/rt6/client/HashTable:isNull	()Z
    //   20: ifne +14 -> 34
    //   23: aload_0
    //   24: getfield 32	org/powerbot/bot/rt6/HashTable:if	Lorg/powerbot/bot/rt6/client/HashTable;
    //   27: invokevirtual 53	org/powerbot/bot/rt6/client/HashTable:getBuckets	()[Lorg/powerbot/bot/rt6/client/Node;
    //   30: goto +5 -> 35
    //   33: athrow
    //   34: aconst_null
    //   35: astore_1
    //   36: aload_1
    //   37: ifnonnull +8 -> 45
    //   40: iconst_0
    //   41: iconst_1
    //   42: dup
    //   43: pop2
    //   44: ireturn
    //   45: aload_0
    //   46: getfield 55	org/powerbot/bot/rt6/HashTable:new	Lorg/powerbot/bot/rt6/client/Node;
    //   49: ifnull +16 -> 65
    //   52: aload_0
    //   53: getfield 55	org/powerbot/bot/rt6/HashTable:new	Lorg/powerbot/bot/rt6/client/Node;
    //   56: getfield 61	org/powerbot/bot/rt6/client/Node:obj	Ljava/lang/ref/WeakReference;
    //   59: invokevirtual 67	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   62: goto +4 -> 66
    //   65: aconst_null
    //   66: astore_2
    //   67: aload_0
    //   68: getfield 27	org/powerbot/bot/rt6/HashTable:byte	I
    //   71: ifle +56 -> 127
    //   74: aload_0
    //   75: getfield 27	org/powerbot/bot/rt6/HashTable:byte	I
    //   78: aload_1
    //   79: arraylength
    //   80: if_icmpgt +47 -> 127
    //   83: aload_1
    //   84: aload_0
    //   85: getfield 27	org/powerbot/bot/rt6/HashTable:byte	I
    //   88: iconst_1
    //   89: dup
    //   90: dup
    //   91: pop2
    //   92: isub
    //   93: aaload
    //   94: getfield 61	org/powerbot/bot/rt6/client/Node:obj	Ljava/lang/ref/WeakReference;
    //   97: invokevirtual 67	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   100: aload_2
    //   101: if_acmpeq +26 -> 127
    //   104: iconst_1
    //   105: aload_0
    //   106: dup
    //   107: dup2
    //   108: getfield 55	org/powerbot/bot/rt6/HashTable:new	Lorg/powerbot/bot/rt6/client/Node;
    //   111: putfield 46	org/powerbot/bot/rt6/HashTable:void	Lorg/powerbot/bot/rt6/client/Node;
    //   114: getfield 55	org/powerbot/bot/rt6/HashTable:new	Lorg/powerbot/bot/rt6/client/Node;
    //   117: invokevirtual 71	org/powerbot/bot/rt6/client/Node:getNext	()Lorg/powerbot/bot/rt6/client/Node;
    //   120: putfield 55	org/powerbot/bot/rt6/HashTable:new	Lorg/powerbot/bot/rt6/client/Node;
    //   123: iconst_1
    //   124: dup
    //   125: pop2
    //   126: ireturn
    //   127: aload_0
    //   128: getfield 27	org/powerbot/bot/rt6/HashTable:byte	I
    //   131: aload_1
    //   132: arraylength
    //   133: if_icmpge +71 -> 204
    //   136: aload_1
    //   137: aload_0
    //   138: dup
    //   139: getfield 27	org/powerbot/bot/rt6/HashTable:byte	I
    //   142: dup_x1
    //   143: iconst_1
    //   144: dup
    //   145: dup
    //   146: pop2
    //   147: iadd
    //   148: putfield 27	org/powerbot/bot/rt6/HashTable:byte	I
    //   151: aaload
    //   152: invokevirtual 71	org/powerbot/bot/rt6/client/Node:getNext	()Lorg/powerbot/bot/rt6/client/Node;
    //   155: astore_2
    //   156: aload_1
    //   157: aload_0
    //   158: getfield 27	org/powerbot/bot/rt6/HashTable:byte	I
    //   161: iconst_1
    //   162: dup
    //   163: dup
    //   164: pop2
    //   165: isub
    //   166: aaload
    //   167: getfield 61	org/powerbot/bot/rt6/client/Node:obj	Ljava/lang/ref/WeakReference;
    //   170: invokevirtual 67	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   173: aload_2
    //   174: getfield 61	org/powerbot/bot/rt6/client/Node:obj	Ljava/lang/ref/WeakReference;
    //   177: invokevirtual 67	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   180: if_acmpeq -53 -> 127
    //   183: iconst_1
    //   184: aload_2
    //   185: aload_0
    //   186: dup_x1
    //   187: aload_2
    //   188: putfield 46	org/powerbot/bot/rt6/HashTable:void	Lorg/powerbot/bot/rt6/client/Node;
    //   191: invokevirtual 71	org/powerbot/bot/rt6/client/Node:getNext	()Lorg/powerbot/bot/rt6/client/Node;
    //   194: putfield 55	org/powerbot/bot/rt6/HashTable:new	Lorg/powerbot/bot/rt6/client/Node;
    //   197: iconst_1
    //   198: dup
    //   199: pop2
    //   200: ireturn
    //   201: nop
    //   202: nop
    //   203: athrow
    //   204: iconst_0
    //   205: iconst_1
    //   206: dup
    //   207: pop2
    //   208: ireturn
    // Line number table:
    //   Java source line #36	-> byte code offset #0
    //   Java source line #37	-> byte code offset #7
    //   Java source line #39	-> byte code offset #13
    //   Java source line #40	-> byte code offset #36
    //   Java source line #41	-> byte code offset #40
    //   Java source line #43	-> byte code offset #45
    //   Java source line #44	-> byte code offset #67
    //   Java source line #45	-> byte code offset #105
    //   Java source line #46	-> byte code offset #114
    //   Java source line #47	-> byte code offset #123
    //   Java source line #49	-> byte code offset #127
    //   Java source line #50	-> byte code offset #136
    //   Java source line #51	-> byte code offset #156
    //   Java source line #52	-> byte code offset #184
    //   Java source line #53	-> byte code offset #191
    //   Java source line #54	-> byte code offset #197
    //   Java source line #56	-> byte code offset #201
    //   Java source line #57	-> byte code offset #204
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	209	0	a	HashTable
  }
  
  public N next()
  {
    if (!a.hasNext()) {
      throw new java.util.NoSuchElementException();
    }
    Constructor localConstructor;
    try {
      1; int tmp27_26 = 1;tmp27_26; int tmp29_27 = tmp27_26;;;;;;;;;;;
    } catch (NoSuchMethodException localNoSuchMethodException) {
      return null; }
    throw new Class[tmp21_20];throw 2;
    localNoSuchMethodException = null;
    try {
      1; int tmp68_67 = 1;tmp68_67; int tmp73_72 = 1;tmp73_72;0[tmp73_72] = jdField_if.reflector; int tmp83_68 = tmp68_67; int tmp85_84 = 1; int tmp86_85 = tmp85_84;tmp86_85;tmp85_84[tmp86_85] = jdField_void.obj.get();localNoSuchMethodException = tmp83_68.newInstance(tmp83_68);tmpTernaryOp = a;
    }
    catch (NullPointerException|java.lang.reflect.InvocationTargetException|IllegalAccessException|InstantiationException localNullPointerException1) {}
    jdField_void = null;
    return localNoSuchMethodException;
  }
  
  public void remove()
  {
    throw new UnsupportedOperationException();
  }
  
  /* Error */
  public static <E extends org.powerbot.bot.ReflectProxy> E lookup(org.powerbot.bot.rt6.client.HashTable a, long a, Class<E> a)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +6 -> 7
    //   4: aconst_null
    //   5: areturn
    //   6: athrow
    //   7: aload_3
    //   8: iconst_2
    //   9: iconst_1
    //   10: dup
    //   11: pop2
    //   12: anewarray 40	java/lang/Class
    //   15: iconst_1
    //   16: dup
    //   17: pop2
    //   18: dup
    //   19: iconst_0
    //   20: iconst_1
    //   21: dup
    //   22: pop2
    //   23: ldc 93
    //   25: aastore
    //   26: dup
    //   27: iconst_1
    //   28: dup
    //   29: dup
    //   30: pop2
    //   31: ldc 5
    //   33: aastore
    //   34: invokevirtual 97	java/lang/Class:getDeclaredConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   37: astore_3
    //   38: aload_0
    //   39: goto +9 -> 48
    //   42: athrow
    //   43: astore 4
    //   45: aconst_null
    //   46: areturn
    //   47: athrow
    //   48: invokevirtual 53	org/powerbot/bot/rt6/client/HashTable:getBuckets	()[Lorg/powerbot/bot/rt6/client/Node;
    //   51: dup
    //   52: astore 4
    //   54: arraylength
    //   55: ifne +42 -> 97
    //   58: aload_3
    //   59: iconst_2
    //   60: iconst_1
    //   61: dup
    //   62: pop2
    //   63: anewarray 5	java/lang/Object
    //   66: iconst_1
    //   67: dup
    //   68: pop2
    //   69: dup
    //   70: iconst_0
    //   71: iconst_1
    //   72: dup
    //   73: pop2
    //   74: aload_0
    //   75: getfield 101	org/powerbot/bot/rt6/client/HashTable:reflector	Lorg/powerbot/bot/Reflector;
    //   78: aastore
    //   79: dup
    //   80: iconst_1
    //   81: dup
    //   82: dup
    //   83: pop2
    //   84: aconst_null
    //   85: aastore
    //   86: invokevirtual 107	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   89: checkcast 117	org/powerbot/bot/ReflectProxy
    //   92: areturn
    //   93: astore 5
    //   95: aconst_null
    //   96: areturn
    //   97: aload 4
    //   99: lload_1
    //   100: aload 4
    //   102: arraylength
    //   103: iconst_1
    //   104: dup
    //   105: dup
    //   106: pop2
    //   107: isub
    //   108: i2l
    //   109: land
    //   110: l2i
    //   111: aaload
    //   112: dup
    //   113: astore 5
    //   115: invokevirtual 71	org/powerbot/bot/rt6/client/Node:getNext	()Lorg/powerbot/bot/rt6/client/Node;
    //   118: dup
    //   119: astore 4
    //   121: aload 5
    //   123: invokevirtual 121	org/powerbot/bot/rt6/client/Node:equals	(Ljava/lang/Object;)Z
    //   126: ifne +141 -> 267
    //   129: aload 4
    //   131: invokevirtual 122	org/powerbot/bot/rt6/client/Node:isNull	()Z
    //   134: ifne +133 -> 267
    //   137: aload 4
    //   139: invokevirtual 126	org/powerbot/bot/rt6/client/Node:getId	()J
    //   142: lload_1
    //   143: lcmp
    //   144: ifne +112 -> 256
    //   147: aload 4
    //   149: dup
    //   150: astore 6
    //   152: ldc -128
    //   154: invokevirtual 132	org/powerbot/bot/rt6/client/Node:isTypeOf	(Ljava/lang/Class;)Z
    //   157: ifeq +32 -> 189
    //   160: new 128	org/powerbot/bot/rt6/client/SoftReference
    //   163: dup
    //   164: aload 4
    //   166: getfield 133	org/powerbot/bot/rt6/client/Node:reflector	Lorg/powerbot/bot/Reflector;
    //   169: aload 4
    //   171: invokespecial 136	org/powerbot/bot/rt6/client/SoftReference:<init>	(Lorg/powerbot/bot/Reflector;Ljava/lang/Object;)V
    //   174: invokevirtual 137	org/powerbot/bot/rt6/client/SoftReference:get	()Ljava/lang/Object;
    //   177: checkcast 139	java/lang/ref/SoftReference
    //   180: invokevirtual 140	java/lang/ref/SoftReference:get	()Ljava/lang/Object;
    //   183: astore 6
    //   185: aload_3
    //   186: goto +33 -> 219
    //   189: aload 4
    //   191: ldc -114
    //   193: invokevirtual 132	org/powerbot/bot/rt6/client/Node:isTypeOf	(Ljava/lang/Class;)Z
    //   196: ifeq +22 -> 218
    //   199: new 142	org/powerbot/bot/rt6/client/HardReference
    //   202: dup
    //   203: aload 4
    //   205: getfield 133	org/powerbot/bot/rt6/client/Node:reflector	Lorg/powerbot/bot/Reflector;
    //   208: aload 4
    //   210: invokespecial 143	org/powerbot/bot/rt6/client/HardReference:<init>	(Lorg/powerbot/bot/Reflector;Ljava/lang/Object;)V
    //   213: invokevirtual 144	org/powerbot/bot/rt6/client/HardReference:get	()Ljava/lang/Object;
    //   216: astore 6
    //   218: aload_3
    //   219: iconst_2
    //   220: iconst_1
    //   221: dup
    //   222: pop2
    //   223: anewarray 5	java/lang/Object
    //   226: iconst_1
    //   227: dup
    //   228: pop2
    //   229: dup
    //   230: iconst_0
    //   231: iconst_1
    //   232: dup
    //   233: pop2
    //   234: aload_0
    //   235: getfield 101	org/powerbot/bot/rt6/client/HashTable:reflector	Lorg/powerbot/bot/Reflector;
    //   238: aastore
    //   239: dup
    //   240: iconst_1
    //   241: dup
    //   242: dup
    //   243: pop2
    //   244: aload 6
    //   246: aastore
    //   247: invokevirtual 107	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   250: checkcast 117	org/powerbot/bot/ReflectProxy
    //   253: areturn
    //   254: astore 6
    //   256: aload 4
    //   258: invokevirtual 71	org/powerbot/bot/rt6/client/Node:getNext	()Lorg/powerbot/bot/rt6/client/Node;
    //   261: dup
    //   262: astore 4
    //   264: goto -143 -> 121
    //   267: aload_3
    //   268: iconst_2
    //   269: iconst_1
    //   270: dup
    //   271: pop2
    //   272: anewarray 5	java/lang/Object
    //   275: iconst_1
    //   276: dup
    //   277: pop2
    //   278: dup
    //   279: iconst_0
    //   280: iconst_1
    //   281: dup
    //   282: pop2
    //   283: aload_0
    //   284: getfield 101	org/powerbot/bot/rt6/client/HashTable:reflector	Lorg/powerbot/bot/Reflector;
    //   287: aastore
    //   288: dup
    //   289: iconst_1
    //   290: dup
    //   291: dup
    //   292: pop2
    //   293: aconst_null
    //   294: aastore
    //   295: invokevirtual 107	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   298: checkcast 117	org/powerbot/bot/ReflectProxy
    //   301: areturn
    //   302: astore 4
    //   304: aconst_null
    //   305: areturn
    // Line number table:
    //   Java source line #86	-> byte code offset #0
    //   Java source line #87	-> byte code offset #4
    //   Java source line #91	-> byte code offset #7
    //   Java source line #94	-> byte code offset #39
    //   Java source line #92	-> byte code offset #43
    //   Java source line #93	-> byte code offset #45
    //   Java source line #95	-> byte code offset #47
    //   Java source line #96	-> byte code offset #54
    //   Java source line #98	-> byte code offset #58
    //   Java source line #99	-> byte code offset #93
    //   Java source line #101	-> byte code offset #95
    //   Java source line #103	-> byte code offset #97
    //   Java source line #104	-> byte code offset #115
    //   Java source line #105	-> byte code offset #137
    //   Java source line #106	-> byte code offset #147
    //   Java source line #107	-> byte code offset #152
    //   Java source line #108	-> byte code offset #160
    //   Java source line #109	-> byte code offset #189
    //   Java source line #110	-> byte code offset #199
    //   Java source line #113	-> byte code offset #218
    //   Java source line #114	-> byte code offset #254
    //   Java source line #104	-> byte code offset #256
    //   Java source line #119	-> byte code offset #267
    //   Java source line #120	-> byte code offset #302
    //   Java source line #122	-> byte code offset #304
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	306	0	a	org.powerbot.bot.rt6.client.HashTable
    //   0	306	1	a	long
    //   0	306	3	a	Class
    // Exception table:
    //   from	to	target	type
    //   7	38	43	java/lang/NoSuchMethodException
    //   58	92	93	java/lang/InstantiationException
    //   58	92	93	java/lang/reflect/InvocationTargetException
    //   58	92	93	java/lang/IllegalAccessException
    //   218	253	254	java/lang/InstantiationException
    //   218	253	254	java/lang/reflect/InvocationTargetException
    //   218	253	254	java/lang/IllegalAccessException
    //   267	301	302	java/lang/InstantiationException
    //   267	301	302	java/lang/reflect/InvocationTargetException
    //   267	301	302	java/lang/IllegalAccessException
  }
  
  public static String jdMethod_this(Object a)
  {
    int tmp30_27 = (a = (String)a).length();
    int tmp34_33 = 1;
    tmp34_33;
    int j;
    int ? = tmp34_33;
    int k = tmp30_27;
    (j = new char[tmp30_27] - 1);
    int i = 4 << 3 ^ 0x4;
    if (((0x2 ^ 0x5) << 4 ^ 0x2 ^ 0x5) >= 0)
    {
      int tmp53_52 = j;
      j--;
      ?[tmp53_52] = ((char)(a.charAt(tmp53_52) ^ i));
      int tmp74_71 = (j--);
      ?[tmp74_71] = ((char)(a.charAt(tmp74_71) ^ k));
    }
    return new String(?);
  }
}
