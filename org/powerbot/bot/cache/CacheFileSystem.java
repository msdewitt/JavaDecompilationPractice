package org.powerbot.bot.cache;

import java.io.File;
import java.nio.channels.FileChannel;
import org.powerbot.bot.MouseSpline;
import org.powerbot.script.Calculations;

class CacheFileSystem
{
  private static final int jdField_else = 256;
  private static final String jdField_if = MouseSpline.jdMethod_this("P\017T\000b\bT\002X1^\017^\006X");
  private static final String jdField_null = Calculations.jdMethod_this("\bp\f:w\f}\000N\006p\006y\000?\001p\021#");
  private static final String jdField_byte = MouseSpline.jdMethod_this("P\017T\000b\bT\002X1^\017^\006X@T\nE");
  private final File jdField_new;
  private final FileChannel[] jdField_void;
  
  public CacheFileSystem(File a)
  {
    jdField_new = a; int 
      tmp14_13 = 1;tmp14_13; int tmp20_19 = 1;tmp20_19;1413jdField_void = tmp20_19;
  }
  
  public FileChannel getDataChannel() {
    a;a.<init>(jdField_new, Calculations.jdMethod_this("\bp\f:w\f}\000N\006p\006y\000?\001p\021#")); int tmp24_23 = 1;tmp24_23;return a.jdMethod_this(256, tmp24_23);
  }
  
  public FileChannel getChannel(int a) {
    a;a.<init>(jdField_new, a);return a.jdMethod_this(a, a);
  }
  
  /* Error */
  private FileChannel jdMethod_this(File a, int a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 27	org/powerbot/bot/cache/CacheFileSystem:void	[Ljava/nio/channels/FileChannel;
    //   4: iload_2
    //   5: aaload
    //   6: ifnull +23 -> 29
    //   9: aload_0
    //   10: getfield 27	org/powerbot/bot/cache/CacheFileSystem:void	[Ljava/nio/channels/FileChannel;
    //   13: iload_2
    //   14: aaload
    //   15: invokevirtual 75	java/nio/channels/FileChannel:isOpen	()Z
    //   18: ifeq +11 -> 29
    //   21: aload_0
    //   22: getfield 27	org/powerbot/bot/cache/CacheFileSystem:void	[Ljava/nio/channels/FileChannel;
    //   25: iload_2
    //   26: aaload
    //   27: areturn
    //   28: athrow
    //   29: new 77	java/io/RandomAccessFile
    //   32: dup
    //   33: aload_1
    //   34: ldc 79
    //   36: invokestatic 41	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   39: invokespecial 80	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   42: dup
    //   43: astore_1
    //   44: invokevirtual 82	java/io/RandomAccessFile:getChannel	()Ljava/nio/channels/FileChannel;
    //   47: astore_3
    //   48: aload_0
    //   49: getfield 27	org/powerbot/bot/cache/CacheFileSystem:void	[Ljava/nio/channels/FileChannel;
    //   52: iload_2
    //   53: aload_3
    //   54: dup_x2
    //   55: aastore
    //   56: areturn
    //   57: athrow
    //   58: astore_1
    //   59: aload_0
    //   60: getfield 27	org/powerbot/bot/cache/CacheFileSystem:void	[Ljava/nio/channels/FileChannel;
    //   63: iload_2
    //   64: aconst_null
    //   65: dup_x2
    //   66: aastore
    //   67: areturn
    // Line number table:
    //   Java source line #32	-> byte code offset #0
    //   Java source line #33	-> byte code offset #21
    //   Java source line #36	-> byte code offset #29
    //   Java source line #37	-> byte code offset #44
    //   Java source line #38	-> byte code offset #48
    //   Java source line #39	-> byte code offset #58
    //   Java source line #41	-> byte code offset #59
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	a	CacheFileSystem
    //   0	68	1	a	File
    //   0	68	2	a	int
    // Exception table:
    //   from	to	target	type
    //   29	56	58	java/io/FileNotFoundException
  }
}
