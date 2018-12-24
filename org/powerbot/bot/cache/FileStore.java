package org.powerbot.bot.cache;

import java.nio.ByteBuffer;

public class FileStore {
  private static final int jdField_long = 6;
  private static final int jdField_int = 8;
  private static final int jdField_super = 10;
  private static final int jdField_final = 512;
  private static final int jdField_enum = 510;
  private static final int jdField_else = 520;
  
  static {
    int tmp4_3 = 1;tmp4_3; } private static final ByteBuffer jdField_if = ByteBuffer.allocateDirect(tmp4_3);
  private final int jdField_null;
  private final java.nio.channels.FileChannel jdField_byte;
  private final java.nio.channels.FileChannel jdField_new;
  private final int jdField_void;
  
  public FileStore(int a, java.nio.channels.FileChannel a, java.nio.channels.FileChannel a, int a)
  {
    jdField_null = a;
    jdField_byte = a;
    jdField_new = a;
    jdField_void = a;
  }
  






  public ByteBuffer get(int a)
  {
    try
    {
      int tmp4_3 = 1;tmp4_3; int tmp10_9 = 1;tmp10_9; if (6 + tmp10_9 > jdField_new.size()) {
        return null;throw (6 * tmp4_3);
      }
      
      1;1; int 
        tmp57_56 = 1;tmp57_56;
      
      int i = jdMethod_this(if);
      int j = jdMethod_this(if);if.flip();if.read(a, 6 * tmp57_56);
      
      if ((i < 0) || (i > jdField_void)) {
        return null;throw jdField_new;
      }
      if ((j <= 0) || (j > jdField_byte.size() / 520L)) {
        return null;
      }
      
      ByteBuffer localByteBuffer = ByteBuffer.allocate(i);
      int k = i; int 
        tmp135_134 = 1;tmp135_134;int m = tmp135_134; int 
        tmp149_148 = 1;tmp149_148; int tmp158_157 = 1;(a <= 65535 ? tmp149_148 : tmp158_157);int n = tmp158_157; int 
        tmp171_170 = 1;tmp171_170; int tmp179_178 = 1;(a <= 65535 ? tmp171_170 : tmp179_178);int i1 = tmp179_178;
      
      if (j == 0) {
        return null;
      }
      
      int i2 = k > n ? n : k;
      1;
      
      if.flip();jdField_byte.read(if, j * 520L);
      



      int i3 = if.getShort() & 0xFFFF;
      int i4 = if.getShort() & 0xFFFF;
      int i5 = jdMethod_this(if); int 
        tmp298_297 = 1;tmp298_297;int i6 = 0xFF & tmp298_297;
      
      i3 = if.getInt();
      i4 = if.getShort() & 0xFFFF;
      i5 = jdMethod_this(if); int 
        tmp344_343 = 1;tmp344_343;i6 = 0xFF & tmp344_343;
      

      if (((a <= 65535 ? a : a) != i3) || (m != i4) || (jdField_null != i6)) {
        return null;
      }
      if ((i5 < 0) || (i5 > jdField_byte.size() / 520L)) {
        return null;
      }
      

      k = ???++;
      j = i5;(k - i2);
      


      localByteBuffer.flip();
      return localByteBuffer;
    }
    catch (java.io.IOException localIOException1) {}
    return null;
  }
  
  private static int jdMethod_this(ByteBuffer a) {
    1;1;1;1; int tmp43_42 = 1;tmp43_42;return a.get() | 0xFF & tmp43_42;
  }
  
  /* Error */
  public int getFileCount()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 36	org/powerbot/bot/cache/FileStore:new	Ljava/nio/channels/FileChannel;
    //   4: invokevirtual 50	java/nio/channels/FileChannel:size	()J
    //   7: ldc2_w 51
    //   10: ldiv
    //   11: l2i
    //   12: ireturn
    //   13: athrow
    //   14: astore_1
    //   15: iconst_0
    //   16: iconst_1
    //   17: dup
    //   18: pop2
    //   19: ireturn
    // Line number table:
    //   Java source line #30	-> byte code offset #0
    //   Java source line #31	-> byte code offset #14
    //   Java source line #33	-> byte code offset #15
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	20	0	a	FileStore
    // Exception table:
    //   from	to	target	type
    //   0	12	14	java/lang/Exception
  }
}
