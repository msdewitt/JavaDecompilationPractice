package org.powerbot.bot.rt6;

import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.EventObject;
import org.powerbot.bot.AbstractEvent;

public class EventDispatcher extends org.powerbot.bot.EventDispatcher
{
  private static final int jdField_if = 1;
  private static final int jdField_null = 2;
  private static final int jdField_byte = 4;
  private static final int jdField_new = 8;
  private static final int jdField_void = 16;
  
  public EventDispatcher()
  {
    1;
    1;
    1;
    1;
    1;
    1; int 
      tmp124_123 = 1;tmp124_123; int 
      tmp144_143 = 1;tmp144_143;org.powerbot.script.TextPaintListener.class.put(128, Integer.valueOf(tmp144_143));org.powerbot.script.PaintListener.class.put(64, Integer.valueOf(tmp124_123));
  }
  
  protected int jdMethod_this(EventObject a)
  {
    Object localObject;
    switch ((localObject = (MouseEvent)a)
      .getID()) {
    case 500: 
    case 501: 
    case 502: 
    case 504: 
    case 505: 
      while (0 != 0) {} int tmp69_64 = 1; int tmp70_69 = tmp69_64;tmp70_69;return tmp70_69;throw tmp69_64;
    case 503: 
    case 506: 
      int tmp76_75 = 1;tmp76_75;return tmp76_75;throw 2;
    case 507: 
      int tmp82_81 = 1;tmp82_81;return tmp82_81;
    }
    
    switch ((localObject = (FocusEvent)a)
      .getID()) {
    case 1004: 
    case 1005: 
      while (0 != 0) {} int tmp139_138 = 1;tmp139_138;return tmp139_138;
    }
    
    switch ((localObject = (KeyEvent)a)
      .getID()) {
    case 400: 
    case 401: 
    case 402: 
      while (0 != 0) {} int tmp195_194 = 1;tmp195_194;return tmp195_194;
    }
    if ((a instanceof AbstractEvent)) {
      return (a instanceof KeyEvent) ? 16 : (a instanceof FocusEvent) ? 8 : (a instanceof MouseEvent) ? 4 : eventId;
    }
    
    throw new RuntimeException(org.powerbot.script.Vector3.jdMethod_this("\024l\022-\023{\023c\002"));
  }
  
  /* Error */
  protected void jdMethod_this(EventObject a, int a)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 94	org/powerbot/bot/rt6/EventDispatcher:iterator	()Ljava/util/Iterator;
    //   4: astore_3
    //   5: aload_3
    //   6: invokeinterface 100 1 0
    //   11: ifeq +448 -> 459
    //   14: aload_3
    //   15: invokeinterface 104 1 0
    //   20: checkcast 106	java/util/EventListener
    //   23: astore 4
    //   25: aload_0
    //   26: getfield 108	org/powerbot/bot/rt6/EventDispatcher:byte	Ljava/util/Map;
    //   29: aload 4
    //   31: invokeinterface 112 2 0
    //   36: checkcast 114	java/lang/Long
    //   39: dup
    //   40: astore 5
    //   42: ifnonnull +8 -> 50
    //   45: aload_3
    //   46: goto -40 -> 6
    //   49: athrow
    //   50: aload 5
    //   52: invokevirtual 118	java/lang/Long:longValue	()J
    //   55: iload_2
    //   56: i2l
    //   57: land
    //   58: lconst_0
    //   59: lcmp
    //   60: ifne +8 -> 68
    //   63: aload_3
    //   64: goto -58 -> 6
    //   67: athrow
    //   68: aload_1
    //   69: instanceof 57
    //   72: ifeq +190 -> 262
    //   75: aload_1
    //   76: checkcast 57	java/awt/event/MouseEvent
    //   79: dup
    //   80: astore 5
    //   82: invokevirtual 61	java/awt/event/MouseEvent:getID	()I
    //   85: tableswitch	default:+174->259, 500:+77->162, 501:+47->132, 502:+62->147, 503:+126->211, 504:+96->181, 505:+111->196, 506:+141->226, 507:+159->244
    //   132: aload 4
    //   134: checkcast 25	java/awt/event/MouseListener
    //   137: aload 5
    //   139: invokeinterface 122 2 0
    //   144: goto -139 -> 5
    //   147: aload 4
    //   149: checkcast 25	java/awt/event/MouseListener
    //   152: aload 5
    //   154: invokeinterface 125 2 0
    //   159: goto -154 -> 5
    //   162: aload 4
    //   164: iconst_0
    //   165: ifne +76 -> 241
    //   168: checkcast 25	java/awt/event/MouseListener
    //   171: aload 5
    //   173: invokeinterface 128 2 0
    //   178: goto -173 -> 5
    //   181: aload 4
    //   183: checkcast 25	java/awt/event/MouseListener
    //   186: aload 5
    //   188: invokeinterface 131 2 0
    //   193: goto -188 -> 5
    //   196: aload 4
    //   198: checkcast 25	java/awt/event/MouseListener
    //   201: aload 5
    //   203: invokeinterface 134 2 0
    //   208: goto -203 -> 5
    //   211: aload 4
    //   213: checkcast 39	java/awt/event/MouseMotionListener
    //   216: aload 5
    //   218: invokeinterface 137 2 0
    //   223: goto -218 -> 5
    //   226: aload 4
    //   228: checkcast 39	java/awt/event/MouseMotionListener
    //   231: aload 5
    //   233: invokeinterface 140 2 0
    //   238: goto -233 -> 5
    //   241: goto -77 -> 164
    //   244: aload 4
    //   246: checkcast 41	java/awt/event/MouseWheelListener
    //   249: aload 5
    //   251: checkcast 142	java/awt/event/MouseWheelEvent
    //   254: invokeinterface 146 2 0
    //   259: goto -254 -> 5
    //   262: aload_1
    //   263: instanceof 63
    //   266: ifeq +79 -> 345
    //   269: aload 4
    //   271: checkcast 63	java/awt/event/FocusEvent
    //   274: dup
    //   275: astore 5
    //   277: invokevirtual 64	java/awt/event/FocusEvent:getID	()I
    //   280: lookupswitch	default:+62->342, 1004:+28->308, 1005:+50->330
    //   308: aload 4
    //   310: iconst_0
    //   311: ifne +16 -> 327
    //   314: checkcast 45	java/awt/event/FocusListener
    //   317: aload 5
    //   319: invokeinterface 150 2 0
    //   324: goto -319 -> 5
    //   327: goto -17 -> 310
    //   330: aload 4
    //   332: checkcast 45	java/awt/event/FocusListener
    //   335: aload 5
    //   337: invokeinterface 153 2 0
    //   342: goto -337 -> 5
    //   345: aload_1
    //   346: instanceof 66
    //   349: ifeq +91 -> 440
    //   352: aload_1
    //   353: checkcast 66	java/awt/event/KeyEvent
    //   356: dup
    //   357: astore 5
    //   359: invokevirtual 67	java/awt/event/KeyEvent:getID	()I
    //   362: tableswitch	default:+75->437, 400:+26->388, 401:+45->407, 402:+63->425
    //   388: aload 4
    //   390: iconst_0
    //   391: ifne +31 -> 422
    //   394: checkcast 43	java/awt/event/KeyListener
    //   397: aload 5
    //   399: invokeinterface 157 2 0
    //   404: goto -399 -> 5
    //   407: aload 4
    //   409: checkcast 43	java/awt/event/KeyListener
    //   412: aload 5
    //   414: invokeinterface 160 2 0
    //   419: goto -414 -> 5
    //   422: goto -32 -> 390
    //   425: aload 4
    //   427: checkcast 43	java/awt/event/KeyListener
    //   430: aload 5
    //   432: invokeinterface 163 2 0
    //   437: goto -432 -> 5
    //   440: aload_1
    //   441: instanceof 69
    //   444: ifeq -439 -> 5
    //   447: aload_1
    //   448: checkcast 69	org/powerbot/bot/AbstractEvent
    //   451: aload 4
    //   453: invokevirtual 167	org/powerbot/bot/AbstractEvent:call	(Ljava/util/EventListener;)V
    //   456: goto -451 -> 5
    //   459: return
    // Line number table:
    //   Java source line #70	-> byte code offset #0
    //   Java source line #71	-> byte code offset #25
    //   Java source line #72	-> byte code offset #42
    //   Java source line #73	-> byte code offset #46
    //   Java source line #75	-> byte code offset #50
    //   Java source line #76	-> byte code offset #64
    //   Java source line #79	-> byte code offset #68
    //   Java source line #80	-> byte code offset #75
    //   Java source line #81	-> byte code offset #82
    //   Java source line #83	-> byte code offset #132
    //   Java source line #84	-> byte code offset #144
    //   Java source line #86	-> byte code offset #147
    //   Java source line #87	-> byte code offset #159
    //   Java source line #89	-> byte code offset #162
    //   Java source line #90	-> byte code offset #178
    //   Java source line #92	-> byte code offset #181
    //   Java source line #93	-> byte code offset #193
    //   Java source line #95	-> byte code offset #196
    //   Java source line #96	-> byte code offset #208
    //   Java source line #98	-> byte code offset #211
    //   Java source line #99	-> byte code offset #223
    //   Java source line #101	-> byte code offset #226
    //   Java source line #102	-> byte code offset #238
    //   Java source line #104	-> byte code offset #244
    //   Java source line #107	-> byte code offset #259
    //   Java source line #108	-> byte code offset #269
    //   Java source line #109	-> byte code offset #277
    //   Java source line #111	-> byte code offset #308
    //   Java source line #112	-> byte code offset #324
    //   Java source line #114	-> byte code offset #330
    //   Java source line #117	-> byte code offset #342
    //   Java source line #118	-> byte code offset #352
    //   Java source line #119	-> byte code offset #359
    //   Java source line #121	-> byte code offset #388
    //   Java source line #122	-> byte code offset #404
    //   Java source line #124	-> byte code offset #407
    //   Java source line #125	-> byte code offset #419
    //   Java source line #127	-> byte code offset #425
    //   Java source line #130	-> byte code offset #437
    //   Java source line #131	-> byte code offset #447
    //   Java source line #133	-> byte code offset #456
    //   Java source line #134	-> byte code offset #459
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	460	0	a	EventDispatcher
    //   0	460	1	a	EventObject
    //   0	460	2	a	int
  }
}
