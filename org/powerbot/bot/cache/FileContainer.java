package org.powerbot.bot.cache;

import java.nio.ByteBuffer;
import java.util.zip.CRC32;






class FileContainer
{
  private final int jdField_null;
  private byte[] jdField_byte;
  private int jdField_new;
  private int jdField_void;
  
  public FileContainer(ByteBuffer a)
  {
    void tmp13_10 = new CRC32();tmp13_10.update(a.array());
    jdField_null = ((int)tmp13_10.getValue());a
      .jdMethod_this(a);
  }
  
  private void jdMethod_this(ByteBuffer a) {
    int tmp11_10 = 1;tmp11_10;getjdField_new = (0xFF & tmp11_10);
    int i = a.getInt();
    if (jdField_new == 0) {
      jdField_void = ;; break label46; throw a;
    } else {
      jdField_void = a.getInt(); }
    label46:
    tmp50_49 = 1; tmp50_49;jdField_byte = tmp50_49;
    a.get(jdField_byte);
  }
  
  /* Error */
  public byte[] unpack()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 47	org/powerbot/bot/cache/FileContainer:new	I
    //   4: ifne +9 -> 13
    //   7: aload_0
    //   8: getfield 55	org/powerbot/bot/cache/FileContainer:byte	[B
    //   11: areturn
    //   12: athrow
    //   13: aload_0
    //   14: getfield 47	org/powerbot/bot/cache/FileContainer:new	I
    //   17: iconst_3
    //   18: iconst_1
    //   19: dup
    //   20: pop2
    //   21: if_icmpne +17 -> 38
    //   24: getstatic 69	java/lang/System:out	Ljava/io/PrintStream;
    //   27: ldc 71
    //   29: invokestatic 76	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   32: invokevirtual 82	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   35: aconst_null
    //   36: areturn
    //   37: athrow
    //   38: aload_0
    //   39: getfield 53	org/powerbot/bot/cache/FileContainer:void	I
    //   42: newarray byte
    //   44: iconst_1
    //   45: dup
    //   46: pop2
    //   47: astore_1
    //   48: new 84	java/io/ByteArrayInputStream
    //   51: dup
    //   52: aload_0
    //   53: getfield 55	org/powerbot/bot/cache/FileContainer:byte	[B
    //   56: invokespecial 86	java/io/ByteArrayInputStream:<init>	([B)V
    //   59: astore_2
    //   60: new 88	java/io/DataInputStream
    //   63: dup
    //   64: aload_0
    //   65: getfield 47	org/powerbot/bot/cache/FileContainer:new	I
    //   68: iconst_1
    //   69: dup
    //   70: dup
    //   71: pop2
    //   72: if_icmpne +14 -> 86
    //   75: new 90	z/CA
    //   78: dup
    //   79: aload_2
    //   80: invokespecial 93	z/CA:<init>	(Ljava/io/InputStream;)V
    //   83: goto +11 -> 94
    //   86: new 95	java/util/zip/GZIPInputStream
    //   89: dup
    //   90: aload_2
    //   91: invokespecial 96	java/util/zip/GZIPInputStream:<init>	(Ljava/io/InputStream;)V
    //   94: invokespecial 97	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   97: dup
    //   98: aload_1
    //   99: invokevirtual 100	java/io/DataInputStream:readFully	([B)V
    //   102: invokevirtual 103	java/io/DataInputStream:close	()V
    //   105: aload_1
    //   106: areturn
    //   107: astore_2
    //   108: aconst_null
    //   109: areturn
    // Line number table:
    //   Java source line #38	-> byte code offset #0
    //   Java source line #39	-> byte code offset #7
    //   Java source line #40	-> byte code offset #13
    //   Java source line #41	-> byte code offset #24
    //   Java source line #42	-> byte code offset #35
    //   Java source line #44	-> byte code offset #38
    //   Java source line #46	-> byte code offset #48
    //   Java source line #47	-> byte code offset #60
    //   Java source line #50	-> byte code offset #97
    //   Java source line #51	-> byte code offset #102
    //   Java source line #52	-> byte code offset #105
    //   Java source line #53	-> byte code offset #107
    //   Java source line #55	-> byte code offset #108
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	110	0	a	FileContainer
    // Exception table:
    //   from	to	target	type
    //   48	106	107	java/io/IOException
  }
  
  public int getCRC()
  {
    return jdField_null;
  }
}
