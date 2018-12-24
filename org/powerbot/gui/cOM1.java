package org.powerbot.gui;

import javax.swing.DefaultListCellRenderer;

class cOM1
  extends DefaultListCellRenderer
{
  cOM1(cOm1 a) {}
  
  /* Error */
  public java.awt.Component getListCellRendererComponent(javax.swing.JList a, Object a, int a, boolean a, boolean a)
  {
    // Byte code:
    //   0: iload 4
    //   2: ifeq +24 -> 26
    //   5: aload_0
    //   6: aload_1
    //   7: dup_x1
    //   8: aload_0
    //   9: aload_1
    //   10: invokevirtual 28	javax/swing/JList:getSelectionBackground	()Ljava/awt/Color;
    //   13: invokevirtual 32	org/powerbot/gui/cOM1:setBackground	(Ljava/awt/Color;)V
    //   16: invokevirtual 35	javax/swing/JList:getSelectionForeground	()Ljava/awt/Color;
    //   19: invokevirtual 38	org/powerbot/gui/cOM1:setForeground	(Ljava/awt/Color;)V
    //   22: goto +21 -> 43
    //   25: athrow
    //   26: aload_0
    //   27: dup
    //   28: aload_1
    //   29: dup_x1
    //   30: invokevirtual 41	javax/swing/JList:getBackground	()Ljava/awt/Color;
    //   33: invokevirtual 32	org/powerbot/gui/cOM1:setBackground	(Ljava/awt/Color;)V
    //   36: invokevirtual 44	javax/swing/JList:getForeground	()Ljava/awt/Color;
    //   39: invokevirtual 38	org/powerbot/gui/cOM1:setForeground	(Ljava/awt/Color;)V
    //   42: aload_1
    //   43: invokevirtual 48	javax/swing/JList:getModel	()Ljavax/swing/ListModel;
    //   46: invokeinterface 54 1 0
    //   51: istore 5
    //   53: iload_3
    //   54: iconst_1
    //   55: dup
    //   56: dup
    //   57: pop2
    //   58: if_icmplt +14 -> 72
    //   61: iload_3
    //   62: iload 5
    //   64: iconst_2
    //   65: iconst_1
    //   66: dup
    //   67: pop2
    //   68: isub
    //   69: if_icmplt +81 -> 150
    //   72: aload_0
    //   73: iload_3
    //   74: aload_0
    //   75: aload_1
    //   76: invokevirtual 41	javax/swing/JList:getBackground	()Ljava/awt/Color;
    //   79: invokevirtual 32	org/powerbot/gui/cOM1:setBackground	(Ljava/awt/Color;)V
    //   82: iconst_1
    //   83: dup
    //   84: dup
    //   85: pop2
    //   86: if_icmpge +12 -> 98
    //   89: ldc 56
    //   91: invokestatic 62	org/powerbot/bot/cache/CacheWorker:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   94: goto +28 -> 122
    //   97: athrow
    //   98: iload_3
    //   99: iload 5
    //   101: iconst_2
    //   102: iconst_1
    //   103: dup
    //   104: pop2
    //   105: isub
    //   106: if_icmpne +11 -> 117
    //   109: ldc 64
    //   111: invokestatic 67	org/powerbot/script/Input:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   114: goto +8 -> 122
    //   117: ldc 69
    //   119: invokestatic 62	org/powerbot/bot/cache/CacheWorker:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   122: invokestatic 75	javax/swing/UIManager:getColor	(Ljava/lang/Object;)Ljava/awt/Color;
    //   125: invokevirtual 38	org/powerbot/gui/cOM1:setForeground	(Ljava/awt/Color;)V
    //   128: iload 4
    //   130: ifeq +20 -> 150
    //   133: aload_0
    //   134: dup
    //   135: dup2
    //   136: invokevirtual 76	org/powerbot/gui/cOM1:getBackground	()Ljava/awt/Color;
    //   139: astore_3
    //   140: invokevirtual 77	org/powerbot/gui/cOM1:getForeground	()Ljava/awt/Color;
    //   143: invokevirtual 32	org/powerbot/gui/cOM1:setBackground	(Ljava/awt/Color;)V
    //   146: aload_3
    //   147: invokevirtual 38	org/powerbot/gui/cOM1:setForeground	(Ljava/awt/Color;)V
    //   150: aload_0
    //   151: aload_2
    //   152: aload_0
    //   153: aload_1
    //   154: invokevirtual 81	javax/swing/JList:getFont	()Ljava/awt/Font;
    //   157: invokevirtual 85	org/powerbot/gui/cOM1:setFont	(Ljava/awt/Font;)V
    //   160: ifnonnull +8 -> 168
    //   163: ldc 87
    //   165: goto +7 -> 172
    //   168: aload_2
    //   169: invokevirtual 93	java/lang/Object:toString	()Ljava/lang/String;
    //   172: invokevirtual 97	org/powerbot/gui/cOM1:setText	(Ljava/lang/String;)V
    //   175: aload_0
    //   176: areturn
    // Line number table:
    //   Java source line #260	-> byte code offset #0
    //   Java source line #261	-> byte code offset #5
    //   Java source line #262	-> byte code offset #16
    //   Java source line #264	-> byte code offset #26
    //   Java source line #265	-> byte code offset #36
    //   Java source line #268	-> byte code offset #42
    //   Java source line #269	-> byte code offset #53
    //   Java source line #270	-> byte code offset #72
    //   Java source line #271	-> byte code offset #82
    //   Java source line #273	-> byte code offset #128
    //   Java source line #274	-> byte code offset #133
    //   Java source line #275	-> byte code offset #140
    //   Java source line #276	-> byte code offset #146
    //   Java source line #280	-> byte code offset #150
    //   Java source line #281	-> byte code offset #160
    //   Java source line #282	-> byte code offset #175
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	177	0	a	cOM1
    //   0	177	1	a	javax.swing.JList
    //   0	177	2	a	Object
    //   0	177	3	a	int
    //   0	177	4	a	int
    //   0	177	5	a	int
  }
}
