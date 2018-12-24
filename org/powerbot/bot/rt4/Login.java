package org.powerbot.bot.rt4;

import java.util.Properties;
import org.powerbot.bot.rt4.client.Client;
import org.powerbot.script.Calculations;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.rt4.Component;
import org.powerbot.script.rt4.Widgets;
import org.powerbot.script.rt6.BasicObject;

public class Login extends org.powerbot.script.PollingScript<ClientContext>
{
  private static final int jdField_null = 10;
  private static final int jdField_byte = 20;
  private static final int jdField_new = 25;
  private static final int jdField_void = 30;
  
  public Login()
  {
    int tmp10_9 = 1;tmp10_9;4.set(tmp10_9);
  }
  
  private boolean jdMethod_true() {
    Client localClient;
    if ((localClient = (Client)((ClientContext)ctx).client()) != null)
      if (ctx).properties.getProperty(Calculations.jdMethod_this("}\nv\fKu\fb\004s\tt"), "").equals(BasicObject.jdMethod_this("\037N\036Y"))) { int tmp56_55 = 1;tmp56_55; if (20 <= tmp56_55) {}
      } else if (ctx).properties.getProperty(Calculations.jdMethod_this("}\ns\007hKu\fb\004s\tt"), "").equals(BasicObject.jdMethod_this("\037N\036Y"))) { int tmp99_98 = 1;tmp99_98; if (20 > tmp99_98) {}
      } else { int tmp111_110 = 1;tmp111_110; if (10 >= tmp111_110) { int tmp123_122 = 1;tmp123_122; if (30 < tmp123_122) {} } else { if (!a.jdMethod_this()) break label141; } int tmp136_135 = 1; int tmp137_136 = tmp136_135;tmp137_136;return tmp137_136;throw tmp136_135; } label141: tmp143_142 = 1; tmp143_142;return tmp143_142;
  }
  
  private boolean jdMethod_this() {
    int tmp14_13 = 1;tmp14_13; int tmp19_18 = 1;tmp19_18;return tmp14_13.component(85, tmp19_18).valid();
  }
  
  /* Error */
  public void poll()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 117	org/powerbot/bot/rt4/Login:true	()Z
    //   4: ifne +27 -> 31
    //   7: getstatic 121	org/powerbot/bot/rt4/Login:threshold	Ljava/util/NavigableSet;
    //   10: aload_0
    //   11: invokeinterface 126 2 0
    //   16: ifeq +13 -> 29
    //   19: getstatic 121	org/powerbot/bot/rt4/Login:threshold	Ljava/util/NavigableSet;
    //   22: aload_0
    //   23: invokeinterface 129 2 0
    //   28: pop
    //   29: return
    //   30: athrow
    //   31: getstatic 121	org/powerbot/bot/rt4/Login:threshold	Ljava/util/NavigableSet;
    //   34: aload_0
    //   35: invokeinterface 132 2 0
    //   40: pop
    //   41: aload_0
    //   42: getfield 50	org/powerbot/bot/rt4/Login:ctx	Lorg/powerbot/script/ClientContext;
    //   45: checkcast 52	org/powerbot/script/rt4/ClientContext
    //   48: invokevirtual 56	org/powerbot/script/rt4/ClientContext:client	()Lorg/powerbot/script/Client;
    //   51: checkcast 58	org/powerbot/bot/rt4/client/Client
    //   54: astore_1
    //   55: invokestatic 136	org/powerbot/misc/GameAccounts:getInstance	()Lorg/powerbot/misc/GameAccounts;
    //   58: aload_0
    //   59: getfield 50	org/powerbot/bot/rt4/Login:ctx	Lorg/powerbot/script/ClientContext;
    //   62: checkcast 52	org/powerbot/script/rt4/ClientContext
    //   65: getfield 62	org/powerbot/script/rt4/ClientContext:properties	Ljava/util/Properties;
    //   68: ldc -118
    //   70: invokestatic 70	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   73: ldc 72
    //   75: invokevirtual 78	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   78: invokevirtual 142	org/powerbot/misc/GameAccounts:get	(Ljava/lang/String;)Lorg/powerbot/misc/GameAccounts$Account;
    //   81: dup
    //   82: astore_2
    //   83: ifnull +20 -> 103
    //   86: aload_2
    //   87: invokevirtual 145	org/powerbot/misc/GameAccounts$Account:true	()Ljava/lang/String;
    //   90: ifnull +13 -> 103
    //   93: aload_2
    //   94: invokevirtual 145	org/powerbot/misc/GameAccounts$Account:true	()Ljava/lang/String;
    //   97: invokevirtual 148	java/lang/String:isEmpty	()Z
    //   100: ifeq +5 -> 105
    //   103: return
    //   104: athrow
    //   105: aload_1
    //   106: invokevirtual 93	org/powerbot/bot/rt4/client/Client:getClientState	()I
    //   109: bipush 20
    //   111: iconst_1
    //   112: dup
    //   113: pop2
    //   114: if_icmplt +50 -> 164
    //   117: aload_0
    //   118: invokespecial 97	org/powerbot/bot/rt4/Login:this	()Z
    //   121: ifeq +42 -> 163
    //   124: aload_0
    //   125: getfield 50	org/powerbot/bot/rt4/Login:ctx	Lorg/powerbot/script/ClientContext;
    //   128: checkcast 52	org/powerbot/script/rt4/ClientContext
    //   131: getfield 103	org/powerbot/script/rt4/ClientContext:widgets	Lorg/powerbot/script/rt4/Widgets;
    //   134: sipush 378
    //   137: iconst_1
    //   138: dup
    //   139: pop2
    //   140: bipush 85
    //   142: iconst_1
    //   143: dup
    //   144: pop2
    //   145: invokevirtual 109	org/powerbot/script/rt4/Widgets:component	(II)Lorg/powerbot/script/rt4/Component;
    //   148: invokevirtual 151	org/powerbot/script/rt4/Component:click	()Z
    //   151: new 14	org/powerbot/bot/rt4/Login$1
    //   154: dup
    //   155: aload_0
    //   156: invokespecial 154	org/powerbot/bot/rt4/Login$1:<init>	(Lorg/powerbot/bot/rt4/Login;)V
    //   159: invokestatic 160	org/powerbot/script/Condition:wait	(Ljava/util/concurrent/Callable;)Z
    //   162: pop2
    //   163: return
    //   164: aload_1
    //   165: invokevirtual 163	org/powerbot/bot/rt4/client/Client:getLoginState	()I
    //   168: lookupswitch	default:+535->703, 0:+28->196, 2:+175->343
    //   196: aload_0
    //   197: iconst_0
    //   198: ifne +142 -> 340
    //   201: getfield 50	org/powerbot/bot/rt4/Login:ctx	Lorg/powerbot/script/ClientContext;
    //   204: checkcast 52	org/powerbot/script/rt4/ClientContext
    //   207: getfield 167	org/powerbot/script/rt4/ClientContext:game	Lorg/powerbot/script/rt4/Game;
    //   210: invokevirtual 172	org/powerbot/script/rt4/Game:resizable	()Z
    //   213: ifeq +23 -> 236
    //   216: aload_0
    //   217: getfield 50	org/powerbot/bot/rt4/Login:ctx	Lorg/powerbot/script/ClientContext;
    //   220: checkcast 52	org/powerbot/script/rt4/ClientContext
    //   223: getfield 176	org/powerbot/script/rt4/ClientContext:input	Lorg/powerbot/script/Input;
    //   226: ldc -78
    //   228: invokestatic 83	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   231: invokevirtual 184	org/powerbot/script/Input:send	(Ljava/lang/String;)Z
    //   234: pop
    //   235: return
    //   236: new 186	java/awt/Rectangle
    //   239: dup
    //   240: sipush 400
    //   243: iconst_1
    //   244: dup
    //   245: pop2
    //   246: sipush 275
    //   249: iconst_1
    //   250: dup
    //   251: pop2
    //   252: sipush 130
    //   255: iconst_1
    //   256: dup
    //   257: pop2
    //   258: bipush 25
    //   260: iconst_1
    //   261: dup
    //   262: pop2
    //   263: invokespecial 189	java/awt/Rectangle:<init>	(IIII)V
    //   266: astore_3
    //   267: aload_0
    //   268: getfield 50	org/powerbot/bot/rt4/Login:ctx	Lorg/powerbot/script/ClientContext;
    //   271: checkcast 52	org/powerbot/script/rt4/ClientContext
    //   274: getfield 176	org/powerbot/script/rt4/ClientContext:input	Lorg/powerbot/script/Input;
    //   277: aload_3
    //   278: getfield 192	java/awt/Rectangle:x	I
    //   281: iconst_0
    //   282: iconst_1
    //   283: dup
    //   284: pop2
    //   285: aload_3
    //   286: dup
    //   287: getfield 195	java/awt/Rectangle:width	I
    //   290: swap
    //   291: getfield 195	java/awt/Rectangle:width	I
    //   294: iconst_2
    //   295: iconst_1
    //   296: dup
    //   297: pop2
    //   298: idiv
    //   299: i2d
    //   300: invokestatic 201	org/powerbot/script/Random:nextGaussian	(IID)I
    //   303: iadd
    //   304: aload_3
    //   305: getfield 204	java/awt/Rectangle:y	I
    //   308: iconst_0
    //   309: iconst_1
    //   310: dup
    //   311: pop2
    //   312: aload_3
    //   313: dup
    //   314: getfield 207	java/awt/Rectangle:height	I
    //   317: swap
    //   318: getfield 207	java/awt/Rectangle:height	I
    //   321: iconst_2
    //   322: iconst_1
    //   323: dup
    //   324: pop2
    //   325: idiv
    //   326: i2d
    //   327: invokestatic 201	org/powerbot/script/Random:nextGaussian	(IID)I
    //   330: iadd
    //   331: iconst_1
    //   332: dup
    //   333: dup
    //   334: pop2
    //   335: invokevirtual 210	org/powerbot/script/Input:click	(IIZ)Z
    //   338: pop
    //   339: return
    //   340: goto -143 -> 197
    //   343: aload_2
    //   344: dup
    //   345: invokevirtual 213	org/powerbot/misc/GameAccounts$Account:toString	()Ljava/lang/String;
    //   348: astore_3
    //   349: invokevirtual 145	org/powerbot/misc/GameAccounts$Account:true	()Ljava/lang/String;
    //   352: astore_2
    //   353: aload_1
    //   354: dup
    //   355: invokevirtual 216	org/powerbot/bot/rt4/client/Client:getUsername	()Ljava/lang/String;
    //   358: astore 4
    //   360: invokevirtual 219	org/powerbot/bot/rt4/client/Client:getPassword	()Ljava/lang/String;
    //   363: astore 5
    //   365: aload 4
    //   367: aload_3
    //   368: invokevirtual 222	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   371: ifne +142 -> 513
    //   374: aload_1
    //   375: invokevirtual 225	org/powerbot/bot/rt4/client/Client:getLoginField	()I
    //   378: ifeq +22 -> 400
    //   381: aload_0
    //   382: getfield 50	org/powerbot/bot/rt4/Login:ctx	Lorg/powerbot/script/ClientContext;
    //   385: checkcast 52	org/powerbot/script/rt4/ClientContext
    //   388: getfield 176	org/powerbot/script/rt4/ClientContext:input	Lorg/powerbot/script/Input;
    //   391: ldc -29
    //   393: invokestatic 70	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   396: invokevirtual 184	org/powerbot/script/Input:send	(Ljava/lang/String;)Z
    //   399: pop
    //   400: new 12	org/powerbot/bot/rt4/Login$2
    //   403: dup
    //   404: aload_0
    //   405: aload_1
    //   406: invokespecial 230	org/powerbot/bot/rt4/Login$2:<init>	(Lorg/powerbot/bot/rt4/Login;Lorg/powerbot/bot/rt4/client/Client;)V
    //   409: bipush 10
    //   411: iconst_1
    //   412: dup
    //   413: pop2
    //   414: bipush 10
    //   416: iconst_1
    //   417: dup
    //   418: pop2
    //   419: invokestatic 233	org/powerbot/script/Condition:wait	(Ljava/util/concurrent/Callable;II)Z
    //   422: ifne +4 -> 426
    //   425: return
    //   426: aload 4
    //   428: invokevirtual 148	java/lang/String:isEmpty	()Z
    //   431: ifne +66 -> 497
    //   434: new 235	java/lang/StringBuilder
    //   437: dup
    //   438: invokespecial 236	java/lang/StringBuilder:<init>	()V
    //   441: astore 6
    //   443: iconst_0
    //   444: iconst_1
    //   445: dup
    //   446: pop2
    //   447: dup
    //   448: istore 7
    //   450: aload 4
    //   452: invokevirtual 239	java/lang/String:length	()I
    //   455: if_icmpge +22 -> 477
    //   458: aload 6
    //   460: bipush 8
    //   462: iconst_1
    //   463: iinc 7 1
    //   466: dup
    //   467: pop2
    //   468: invokevirtual 243	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   471: pop
    //   472: iload 7
    //   474: goto -24 -> 450
    //   477: aload_0
    //   478: getfield 50	org/powerbot/bot/rt4/Login:ctx	Lorg/powerbot/script/ClientContext;
    //   481: checkcast 52	org/powerbot/script/rt4/ClientContext
    //   484: getfield 176	org/powerbot/script/rt4/ClientContext:input	Lorg/powerbot/script/Input;
    //   487: aload 6
    //   489: invokevirtual 244	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   492: invokevirtual 184	org/powerbot/script/Input:send	(Ljava/lang/String;)Z
    //   495: pop
    //   496: return
    //   497: aload_0
    //   498: getfield 50	org/powerbot/bot/rt4/Login:ctx	Lorg/powerbot/script/ClientContext;
    //   501: checkcast 52	org/powerbot/script/rt4/ClientContext
    //   504: getfield 176	org/powerbot/script/rt4/ClientContext:input	Lorg/powerbot/script/Input;
    //   507: aload_3
    //   508: invokevirtual 247	org/powerbot/script/Input:sendln	(Ljava/lang/String;)Z
    //   511: pop
    //   512: return
    //   513: aload 5
    //   515: aload_2
    //   516: invokevirtual 89	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   519: ifne +146 -> 665
    //   522: aload_1
    //   523: invokevirtual 225	org/powerbot/bot/rt4/client/Client:getLoginField	()I
    //   526: iconst_1
    //   527: dup
    //   528: dup
    //   529: pop2
    //   530: if_icmpeq +22 -> 552
    //   533: aload_0
    //   534: getfield 50	org/powerbot/bot/rt4/Login:ctx	Lorg/powerbot/script/ClientContext;
    //   537: checkcast 52	org/powerbot/script/rt4/ClientContext
    //   540: getfield 176	org/powerbot/script/rt4/ClientContext:input	Lorg/powerbot/script/Input;
    //   543: ldc -7
    //   545: invokestatic 83	org/powerbot/script/rt6/BasicObject:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   548: invokevirtual 184	org/powerbot/script/Input:send	(Ljava/lang/String;)Z
    //   551: pop
    //   552: new 10	org/powerbot/bot/rt4/Login$3
    //   555: dup
    //   556: aload_0
    //   557: aload_1
    //   558: invokespecial 250	org/powerbot/bot/rt4/Login$3:<init>	(Lorg/powerbot/bot/rt4/Login;Lorg/powerbot/bot/rt4/client/Client;)V
    //   561: bipush 10
    //   563: iconst_1
    //   564: dup
    //   565: pop2
    //   566: bipush 10
    //   568: iconst_1
    //   569: dup
    //   570: pop2
    //   571: invokestatic 233	org/powerbot/script/Condition:wait	(Ljava/util/concurrent/Callable;II)Z
    //   574: ifne +4 -> 578
    //   577: return
    //   578: aload 5
    //   580: invokevirtual 148	java/lang/String:isEmpty	()Z
    //   583: ifne +66 -> 649
    //   586: new 235	java/lang/StringBuilder
    //   589: dup
    //   590: invokespecial 236	java/lang/StringBuilder:<init>	()V
    //   593: astore 6
    //   595: iconst_0
    //   596: iconst_1
    //   597: dup
    //   598: pop2
    //   599: dup
    //   600: istore 7
    //   602: aload 5
    //   604: invokevirtual 239	java/lang/String:length	()I
    //   607: if_icmpge +22 -> 629
    //   610: aload 6
    //   612: bipush 8
    //   614: iconst_1
    //   615: iinc 7 1
    //   618: dup
    //   619: pop2
    //   620: invokevirtual 243	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   623: pop
    //   624: iload 7
    //   626: goto -24 -> 602
    //   629: aload_0
    //   630: getfield 50	org/powerbot/bot/rt4/Login:ctx	Lorg/powerbot/script/ClientContext;
    //   633: checkcast 52	org/powerbot/script/rt4/ClientContext
    //   636: getfield 176	org/powerbot/script/rt4/ClientContext:input	Lorg/powerbot/script/Input;
    //   639: aload 6
    //   641: invokevirtual 244	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   644: invokevirtual 184	org/powerbot/script/Input:send	(Ljava/lang/String;)Z
    //   647: pop
    //   648: return
    //   649: aload_0
    //   650: getfield 50	org/powerbot/bot/rt4/Login:ctx	Lorg/powerbot/script/ClientContext;
    //   653: checkcast 52	org/powerbot/script/rt4/ClientContext
    //   656: getfield 176	org/powerbot/script/rt4/ClientContext:input	Lorg/powerbot/script/Input;
    //   659: aload_2
    //   660: invokevirtual 184	org/powerbot/script/Input:send	(Ljava/lang/String;)Z
    //   663: pop
    //   664: return
    //   665: aload_0
    //   666: getfield 50	org/powerbot/bot/rt4/Login:ctx	Lorg/powerbot/script/ClientContext;
    //   669: checkcast 52	org/powerbot/script/rt4/ClientContext
    //   672: getfield 176	org/powerbot/script/rt4/ClientContext:input	Lorg/powerbot/script/Input;
    //   675: ldc 72
    //   677: invokevirtual 247	org/powerbot/script/Input:sendln	(Ljava/lang/String;)Z
    //   680: new 8	org/powerbot/bot/rt4/Login$4
    //   683: dup
    //   684: aload_0
    //   685: invokespecial 251	org/powerbot/bot/rt4/Login$4:<init>	(Lorg/powerbot/bot/rt4/Login;)V
    //   688: bipush 100
    //   690: iconst_1
    //   691: dup
    //   692: pop2
    //   693: bipush 100
    //   695: iconst_1
    //   696: dup
    //   697: pop2
    //   698: invokestatic 233	org/powerbot/script/Condition:wait	(Ljava/util/concurrent/Callable;II)Z
    //   701: pop2
    //   702: return
    //   703: getstatic 257	java/lang/System:out	Ljava/io/PrintStream;
    //   706: ldc_w 259
    //   709: invokestatic 70	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   712: iconst_1
    //   713: dup
    //   714: dup
    //   715: pop2
    //   716: anewarray 261	java/lang/Object
    //   719: iconst_1
    //   720: dup
    //   721: pop2
    //   722: dup
    //   723: iconst_0
    //   724: iconst_1
    //   725: dup
    //   726: pop2
    //   727: aload_1
    //   728: invokevirtual 163	org/powerbot/bot/rt4/client/Client:getLoginState	()I
    //   731: invokestatic 267	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   734: aastore
    //   735: invokevirtual 273	java/io/PrintStream:printf	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream;
    //   738: pop
    //   739: return
    // Line number table:
    //   Java source line #38	-> byte code offset #0
    //   Java source line #39	-> byte code offset #7
    //   Java source line #40	-> byte code offset #19
    //   Java source line #42	-> byte code offset #29
    //   Java source line #44	-> byte code offset #31
    //   Java source line #45	-> byte code offset #41
    //   Java source line #46	-> byte code offset #55
    //   Java source line #47	-> byte code offset #83
    //   Java source line #48	-> byte code offset #103
    //   Java source line #50	-> byte code offset #105
    //   Java source line #51	-> byte code offset #117
    //   Java source line #52	-> byte code offset #124
    //   Java source line #53	-> byte code offset #151
    //   Java source line #60	-> byte code offset #163
    //   Java source line #68	-> byte code offset #164
    //   Java source line #70	-> byte code offset #196
    //   Java source line #71	-> byte code offset #216
    //   Java source line #73	-> byte code offset #236
    //   Java source line #74	-> byte code offset #267
    //   Java source line #75	-> byte code offset #300
    //   Java source line #76	-> byte code offset #327
    //   Java source line #74	-> byte code offset #335
    //   Java source line #80	-> byte code offset #339
    //   Java source line #83	-> byte code offset #343
    //   Java source line #84	-> byte code offset #353
    //   Java source line #86	-> byte code offset #365
    //   Java source line #87	-> byte code offset #374
    //   Java source line #88	-> byte code offset #381
    //   Java source line #90	-> byte code offset #400
    //   Java source line #96	-> byte code offset #425
    //   Java source line #98	-> byte code offset #426
    //   Java source line #99	-> byte code offset #434
    //   Java source line #100	-> byte code offset #443
    //   Java source line #101	-> byte code offset #458
    //   Java source line #100	-> byte code offset #471
    //   Java source line #103	-> byte code offset #477
    //   Java source line #104	-> byte code offset #496
    //   Java source line #106	-> byte code offset #497
    //   Java source line #107	-> byte code offset #513
    //   Java source line #108	-> byte code offset #522
    //   Java source line #109	-> byte code offset #533
    //   Java source line #111	-> byte code offset #552
    //   Java source line #117	-> byte code offset #577
    //   Java source line #119	-> byte code offset #578
    //   Java source line #120	-> byte code offset #586
    //   Java source line #121	-> byte code offset #595
    //   Java source line #122	-> byte code offset #610
    //   Java source line #121	-> byte code offset #623
    //   Java source line #124	-> byte code offset #629
    //   Java source line #125	-> byte code offset #648
    //   Java source line #127	-> byte code offset #649
    //   Java source line #129	-> byte code offset #665
    //   Java source line #130	-> byte code offset #680
    //   Java source line #136	-> byte code offset #702
    //   Java source line #141	-> byte code offset #703
    //   Java source line #145	-> byte code offset #739
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	740	0	a	Login
  }
}
