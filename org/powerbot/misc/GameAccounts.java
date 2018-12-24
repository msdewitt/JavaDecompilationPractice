package org.powerbot.misc;

import java.util.ArrayList;
import java.util.Iterator;
import org.powerbot.script.Vector3;
import org.powerbot.script.rt6.BasicObject;
import org.powerbot.script.rt6.CollisionMap;
import z.lpt6;

public final class GameAccounts
  extends ArrayList<Account>
{
  private static final GameAccounts jdField_new = new GameAccounts();
  private static final long serialVersionUID = -8481913088185494034L;
  private final coN jdField_void;
  
  private GameAccounts()
  {
    a; int tmp20_19 = 1;tmp20_19;CollisionMap.jdMethod_this("E_GSQRPO\n\r\nUJU").<init>(0, tmp20_19);jdField_void = a;new GameAccounts();
  }
  

  public static GameAccounts getInstance()
  {
    return new;
  }
  
  /* Error */
  private synchronized void jdMethod_true()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 45	org/powerbot/misc/GameAccounts:void	Lorg/powerbot/misc/coN;
    //   4: invokevirtual 60	org/powerbot/misc/coN:this	()Z
    //   7: ifne +5 -> 12
    //   10: return
    //   11: athrow
    //   12: new 18	org/powerbot/util/Ini
    //   15: dup
    //   16: invokespecial 61	org/powerbot/util/Ini:<init>	()V
    //   19: astore_1
    //   20: aload_0
    //   21: getfield 45	org/powerbot/misc/GameAccounts:void	Lorg/powerbot/misc/coN;
    //   24: invokevirtual 64	org/powerbot/misc/coN:this	()Ljava/io/InputStream;
    //   27: astore_2
    //   28: aconst_null
    //   29: astore_3
    //   30: aload_1
    //   31: aload_2
    //   32: invokevirtual 67	org/powerbot/util/Ini:this	(Ljava/io/InputStream;)Lorg/powerbot/util/Ini;
    //   35: pop
    //   36: aload_2
    //   37: ifnull +84 -> 121
    //   40: aload_3
    //   41: ifnull +22 -> 63
    //   44: aload_2
    //   45: invokevirtual 72	java/io/InputStream:close	()V
    //   48: goto +73 -> 121
    //   51: athrow
    //   52: astore 4
    //   54: aload_3
    //   55: aload 4
    //   57: invokevirtual 76	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   60: goto +61 -> 121
    //   63: aload_2
    //   64: invokevirtual 72	java/io/InputStream:close	()V
    //   67: goto +54 -> 121
    //   70: astore 4
    //   72: aload 4
    //   74: dup
    //   75: astore_3
    //   76: athrow
    //   77: astore 5
    //   79: aload_2
    //   80: ifnull +33 -> 113
    //   83: aload_3
    //   84: ifnull +25 -> 109
    //   87: aload_2
    //   88: invokevirtual 72	java/io/InputStream:close	()V
    //   91: aload 5
    //   93: goto +22 -> 115
    //   96: astore 6
    //   98: aload 5
    //   100: aload_3
    //   101: aload 6
    //   103: invokevirtual 76	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   106: goto +9 -> 115
    //   109: aload_2
    //   110: invokevirtual 72	java/io/InputStream:close	()V
    //   113: aload 5
    //   115: athrow
    //   116: nop
    //   117: nop
    //   118: athrow
    //   119: astore_2
    //   120: return
    //   121: aload_1
    //   122: invokevirtual 79	org/powerbot/util/Ini:this	()Ljava/util/Set;
    //   125: invokeinterface 85 1 0
    //   130: dup
    //   131: astore_2
    //   132: invokeinterface 90 1 0
    //   137: ifeq +126 -> 263
    //   140: aload_2
    //   141: invokeinterface 94 1 0
    //   146: checkcast 11	java/util/Map$Entry
    //   149: dup
    //   150: astore_3
    //   151: invokeinterface 97 1 0
    //   156: checkcast 99	java/lang/String
    //   159: invokevirtual 103	java/lang/String:trim	()Ljava/lang/String;
    //   162: dup
    //   163: astore 4
    //   165: invokevirtual 106	java/lang/String:isEmpty	()Z
    //   168: ifeq +7 -> 175
    //   171: aload_2
    //   172: goto -40 -> 132
    //   175: new 8	org/powerbot/misc/GameAccounts$Account
    //   178: dup
    //   179: aload_0
    //   180: aload_3
    //   181: invokeinterface 97 1 0
    //   186: checkcast 99	java/lang/String
    //   189: invokespecial 109	org/powerbot/misc/GameAccounts$Account:<init>	(Lorg/powerbot/misc/GameAccounts;Ljava/lang/String;)V
    //   192: astore 5
    //   194: aload_3
    //   195: invokeinterface 112 1 0
    //   200: checkcast 16	org/powerbot/util/aUX
    //   203: astore 6
    //   205: aload_2
    //   206: aload 5
    //   208: aload 6
    //   210: ldc 114
    //   212: invokestatic 117	z/lpt6:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   215: invokevirtual 120	org/powerbot/util/aUX:this	(Ljava/lang/String;)Ljava/lang/String;
    //   218: invokestatic 123	org/powerbot/misc/GameAccounts$Account:this	(Lorg/powerbot/misc/GameAccounts$Account;Ljava/lang/String;)Ljava/lang/String;
    //   221: aload_0
    //   222: aload 6
    //   224: ldc 125
    //   226: aload 5
    //   228: dup_x2
    //   229: dup_x2
    //   230: aload 6
    //   232: ldc 127
    //   234: invokestatic 40	org/powerbot/script/rt6/CollisionMap:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   237: iconst_m1
    //   238: iconst_1
    //   239: dup
    //   240: pop2
    //   241: invokevirtual 130	org/powerbot/util/aUX:this	(Ljava/lang/String;I)I
    //   244: putfield 134	org/powerbot/misc/GameAccounts$Account:byte	I
    //   247: invokestatic 117	z/lpt6:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   250: invokevirtual 137	org/powerbot/util/aUX:this	(Ljava/lang/String;)Z
    //   253: putfield 140	org/powerbot/misc/GameAccounts$Account:new	Z
    //   256: invokevirtual 144	org/powerbot/misc/GameAccounts:add	(Ljava/lang/Object;)Z
    //   259: pop2
    //   260: goto -128 -> 132
    //   263: return
    // Line number table:
    //   Java source line #29	-> byte code offset #0
    //   Java source line #30	-> byte code offset #10
    //   Java source line #33	-> byte code offset #12
    //   Java source line #35	-> byte code offset #20
    //   Java source line #36	-> byte code offset #30
    //   Java source line #37	-> byte code offset #36
    //   Java source line #35	-> byte code offset #70
    //   Java source line #37	-> byte code offset #77
    //   Java source line #39	-> byte code offset #116
    //   Java source line #37	-> byte code offset #119
    //   Java source line #38	-> byte code offset #120
    //   Java source line #41	-> byte code offset #121
    //   Java source line #42	-> byte code offset #151
    //   Java source line #43	-> byte code offset #165
    //   Java source line #44	-> byte code offset #172
    //   Java source line #46	-> byte code offset #175
    //   Java source line #47	-> byte code offset #194
    //   Java source line #48	-> byte code offset #206
    //   Java source line #49	-> byte code offset #222
    //   Java source line #50	-> byte code offset #247
    //   Java source line #51	-> byte code offset #256
    //   Java source line #52	-> byte code offset #260
    //   Java source line #53	-> byte code offset #263
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	264	0	a	GameAccounts
    // Exception table:
    //   from	to	target	type
    //   44	48	52	java/lang/Throwable
    //   30	36	70	java/lang/Throwable
    //   30	36	77	finally
    //   70	79	77	finally
    //   87	91	96	java/lang/Throwable
    //   20	51	119	java/io/IOException
    //   52	116	119	java/io/IOException
  }
  
  /* Error */
  public synchronized void jdMethod_this()
  {
    // Byte code:
    //   0: new 18	org/powerbot/util/Ini
    //   3: dup
    //   4: invokespecial 61	org/powerbot/util/Ini:<init>	()V
    //   7: astore_1
    //   8: aload_0
    //   9: invokevirtual 145	org/powerbot/misc/GameAccounts:iterator	()Ljava/util/Iterator;
    //   12: dup
    //   13: astore_2
    //   14: invokeinterface 90 1 0
    //   19: ifeq +75 -> 94
    //   22: aload_2
    //   23: invokeinterface 94 1 0
    //   28: checkcast 8	org/powerbot/misc/GameAccounts$Account
    //   31: astore_3
    //   32: aload_2
    //   33: aload_1
    //   34: aload_3
    //   35: invokevirtual 148	org/powerbot/misc/GameAccounts$Account:toString	()Ljava/lang/String;
    //   38: invokevirtual 151	org/powerbot/util/Ini:this	(Ljava/lang/String;)Lorg/powerbot/util/aUX;
    //   41: ldc -103
    //   43: invokestatic 40	org/powerbot/script/rt6/CollisionMap:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   46: aload_3
    //   47: invokestatic 156	org/powerbot/misc/GameAccounts$Account:true	(Lorg/powerbot/misc/GameAccounts$Account;)Ljava/lang/String;
    //   50: invokevirtual 159	org/powerbot/util/aUX:this	(Ljava/lang/String;Ljava/lang/String;)Lorg/powerbot/util/aUX;
    //   53: ldc -95
    //   55: invokestatic 117	z/lpt6:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   58: aload_3
    //   59: getfield 134	org/powerbot/misc/GameAccounts$Account:byte	I
    //   62: invokevirtual 164	org/powerbot/util/aUX:this	(Ljava/lang/String;I)Lorg/powerbot/util/aUX;
    //   65: ldc -90
    //   67: invokestatic 40	org/powerbot/script/rt6/CollisionMap:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   70: aload_3
    //   71: getfield 140	org/powerbot/misc/GameAccounts$Account:new	Z
    //   74: invokevirtual 169	org/powerbot/util/aUX:this	(Ljava/lang/String;Z)Lorg/powerbot/util/aUX;
    //   77: ldc -85
    //   79: invokestatic 117	z/lpt6:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   82: aload_3
    //   83: invokevirtual 173	org/powerbot/misc/GameAccounts$Account:this	()Ljava/lang/String;
    //   86: invokevirtual 159	org/powerbot/util/aUX:this	(Ljava/lang/String;Ljava/lang/String;)Lorg/powerbot/util/aUX;
    //   89: pop
    //   90: goto -76 -> 14
    //   93: athrow
    //   94: aload_1
    //   95: aload_0
    //   96: getfield 45	org/powerbot/misc/GameAccounts:void	Lorg/powerbot/misc/coN;
    //   99: invokestatic 178	org/powerbot/util/AUX:this	(Lorg/powerbot/util/Ini;Lorg/powerbot/misc/coN;)V
    //   102: return
    // Line number table:
    //   Java source line #56	-> byte code offset #0
    //   Java source line #57	-> byte code offset #8
    //   Java source line #58	-> byte code offset #33
    //   Java source line #59	-> byte code offset #90
    //   Java source line #60	-> byte code offset #94
    //   Java source line #61	-> byte code offset #102
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	a	GameAccounts
  }
  
  public boolean jdMethod_this(String a)
  {
    a = jdMethod_true(a);
    for (Iterator localIterator = a.iterator(); localIterator.hasNext();)
      if (Account.jdMethod_this((Account)localIterator.next()).equalsIgnoreCase(a)) {
        int tmp39_38 = 1; int tmp40_39 = tmp39_38;tmp40_39;return tmp40_39;
        
        throw tmp39_38; }
    int tmp50_49 = 1;tmp50_49;return tmp50_49;
  }
  
  /* Error */
  public Account get(String a)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 180	org/powerbot/misc/GameAccounts:true	(Ljava/lang/String;)Ljava/lang/String;
    //   4: astore_1
    //   5: aload_0
    //   6: invokevirtual 145	org/powerbot/misc/GameAccounts:iterator	()Ljava/util/Iterator;
    //   9: astore_2
    //   10: aload_2
    //   11: invokeinterface 90 1 0
    //   16: ifeq +42 -> 58
    //   19: aload_2
    //   20: invokeinterface 94 1 0
    //   25: checkcast 8	org/powerbot/misc/GameAccounts$Account
    //   28: dup
    //   29: astore_3
    //   30: invokestatic 182	org/powerbot/misc/GameAccounts$Account:this	(Lorg/powerbot/misc/GameAccounts$Account;)Ljava/lang/String;
    //   33: aload_1
    //   34: invokevirtual 185	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   37: ifeq -27 -> 10
    //   40: aload_3
    //   41: invokevirtual 173	org/powerbot/misc/GameAccounts$Account:this	()Ljava/lang/String;
    //   44: ifnonnull +7 -> 51
    //   47: aload_3
    //   48: invokevirtual 190	org/powerbot/misc/GameAccounts$Account:this	()V
    //   51: aload_3
    //   52: areturn
    //   53: nop
    //   54: nop
    //   55: nop
    //   56: nop
    //   57: athrow
    //   58: aconst_null
    //   59: areturn
    // Line number table:
    //   Java source line #75	-> byte code offset #0
    //   Java source line #76	-> byte code offset #5
    //   Java source line #77	-> byte code offset #30
    //   Java source line #78	-> byte code offset #40
    //   Java source line #79	-> byte code offset #51
    //   Java source line #81	-> byte code offset #54
    //   Java source line #82	-> byte code offset #58
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	60	0	a	GameAccounts
    //   0	60	1	a	String
  }
  
  private static String jdMethod_true(String a)
  {
    return a = a.toLowerCase().trim().replaceAll(CollisionMap.jdMethod_this("xO"), lpt6.jdMethod_this("\026"));
  }
  
  public Account jdMethod_this(String a) {
    a = new Account(a); String 
      tmp12_11 = a;a.add(tmp12_11);
    return tmp12_11;
  }
  
  /* Error */
  public int jdMethod_this(String a)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 180	org/powerbot/misc/GameAccounts:true	(Ljava/lang/String;)Ljava/lang/String;
    //   4: astore_1
    //   5: iconst_0
    //   6: iconst_1
    //   7: dup
    //   8: pop2
    //   9: istore_2
    //   10: aload_0
    //   11: invokevirtual 145	org/powerbot/misc/GameAccounts:iterator	()Ljava/util/Iterator;
    //   14: dup
    //   15: astore_3
    //   16: invokeinterface 90 1 0
    //   21: ifeq +33 -> 54
    //   24: aload_3
    //   25: invokeinterface 94 1 0
    //   30: checkcast 8	org/powerbot/misc/GameAccounts$Account
    //   33: invokestatic 182	org/powerbot/misc/GameAccounts$Account:this	(Lorg/powerbot/misc/GameAccounts$Account;)Ljava/lang/String;
    //   36: aload_1
    //   37: invokevirtual 205	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   40: ifeq +6 -> 46
    //   43: iload_2
    //   44: ireturn
    //   45: athrow
    //   46: iinc 2 1
    //   49: aload_3
    //   50: goto -34 -> 16
    //   53: athrow
    //   54: iconst_m1
    //   55: iconst_1
    //   56: dup
    //   57: pop2
    //   58: ireturn
    // Line number table:
    //   Java source line #97	-> byte code offset #0
    //   Java source line #98	-> byte code offset #5
    //   Java source line #100	-> byte code offset #10
    //   Java source line #101	-> byte code offset #33
    //   Java source line #102	-> byte code offset #43
    //   Java source line #104	-> byte code offset #46
    //   Java source line #105	-> byte code offset #50
    //   Java source line #107	-> byte code offset #54
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	a	GameAccounts
    //   0	59	1	a	String
  }
  
  public final class Account
  {
    public static final String LOGIN_USER_PROPERTY = Vector3.jdMethod_this("a\031j\037cXl\025n\031x\030yXx\005h\004c\027`\023");
    public static final String jdField_enum = BasicObject.jdMethod_this("P\004[\002RE]\b_\004I\005HEH\004W\016R");
    private final String jdField_else;
    private String jdField_if;
    private String jdField_null;
    public int jdField_byte;
    public boolean jdField_new;
    
    Account(String a)
    {
      int tmp16_15 = 1;tmp16_15;
      

        -1jdField_byte = tmp16_15; int tmp22_21 = 1;tmp22_21;jdField_new = tmp22_21;
      jdField_else = GameAccounts.jdMethod_this(0);
    }
    
    public void jdMethod_this() {
      AUX localAUX;
      if ((localAUX = AUX.jdMethod_this()).jdMethod_this()) {
        int i = localAUX.jdMethod_this();
        String str = i;
        str = str.hashCode(); int 
          tmp65_64 = 1;tmp65_64; int tmp74_73 = 1;tmp74_73;
        byte[] arrayOfByte = (str = tmp65_64.substring(str.length(), 2 / tmp74_73)).getBytes();
        str = ""; int 
          tmp92_91 = 1; int tmp93_92 = tmp92_91;
        int j; for (tmp93_92; (j = tmp92_91 - tmp93_92) >= 0;) {
          str = j--;tmpTernaryOp = j; continue;throw new StringBuilder().insert(0, str);
        }
        a.jdMethod_this(str);
      }
    }
    
    public String jdMethod_true() {
      return jdField_if;
    }
    
    public void jdMethod_true(String a) {
      jdField_if = a;
    }
    
    public String jdMethod_this() {
      return jdField_null;
    }
    
    public void jdMethod_this(String a) {
      jdField_null = a;
    }
    
    public String getPIN()
    {
      1; int tmp13_12 = 1;tmp13_12; int tmp15_13 = tmp13_12; int tmp18_17 = 1;tmp18_17;0[tmp18_17] = Integer.valueOf(jdField_byte);return String.format(tmp15_13, tmp15_13);
    }
    
    public String toString()
    {
      return jdField_else;
    }
  }
}
