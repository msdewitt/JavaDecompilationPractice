package org.powerbot.util;

import java.io.PrintStream;
import java.util.logging.Formatter;

public class prn extends java.util.logging.Handler
{
  private final PrintStream jdField_byte;
  private final PrintStream jdField_new;
  private final Formatter jdField_void;
  
  public prn(PrintStream a, PrintStream a, Formatter a)
  {
    jdField_byte = a;
    jdField_new = a;
    jdField_void = a;
  }
  
  /* Error */
  public void publish(java.util.logging.LogRecord a)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 33	java/util/logging/LogRecord:getLevel	()Ljava/util/logging/Level;
    //   4: invokevirtual 39	java/util/logging/Level:intValue	()I
    //   7: getstatic 43	java/util/logging/Level:WARNING	Ljava/util/logging/Level;
    //   10: invokevirtual 39	java/util/logging/Level:intValue	()I
    //   13: if_icmplt +11 -> 24
    //   16: aload_0
    //   17: getfield 21	org/powerbot/util/prn:new	Ljava/io/PrintStream;
    //   20: goto +8 -> 28
    //   23: athrow
    //   24: aload_0
    //   25: getfield 19	org/powerbot/util/prn:byte	Ljava/io/PrintStream;
    //   28: astore_2
    //   29: aload_0
    //   30: getfield 23	org/powerbot/util/prn:void	Ljava/util/logging/Formatter;
    //   33: dup
    //   34: astore_3
    //   35: monitorenter
    //   36: aload_2
    //   37: aload_0
    //   38: getfield 23	org/powerbot/util/prn:void	Ljava/util/logging/Formatter;
    //   41: aload_1
    //   42: invokevirtual 49	java/util/logging/Formatter:format	(Ljava/util/logging/LogRecord;)Ljava/lang/String;
    //   45: invokevirtual 55	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   48: aload_1
    //   49: invokevirtual 59	java/util/logging/LogRecord:getThrown	()Ljava/lang/Throwable;
    //   52: dup
    //   53: astore_1
    //   54: ifnull +8 -> 62
    //   57: aload_1
    //   58: aload_2
    //   59: invokevirtual 65	java/lang/Throwable:printStackTrace	(Ljava/io/PrintStream;)V
    //   62: aload_3
    //   63: monitorexit
    //   64: return
    //   65: athrow
    //   66: astore 4
    //   68: aload_3
    //   69: monitorexit
    //   70: aload 4
    //   72: athrow
    //   73: athrow
    // Line number table:
    //   Java source line #21	-> byte code offset #0
    //   Java source line #22	-> byte code offset #7
    //   Java source line #23	-> byte code offset #29
    //   Java source line #24	-> byte code offset #36
    //   Java source line #25	-> byte code offset #48
    //   Java source line #26	-> byte code offset #54
    //   Java source line #27	-> byte code offset #57
    //   Java source line #29	-> byte code offset #62
    //   Java source line #30	-> byte code offset #73
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	74	0	a	prn
    //   0	74	1	a	java.util.logging.LogRecord
    // Exception table:
    //   from	to	target	type
    //   36	64	66	finally
    //   66	70	66	finally
  }
  
  public void flush()
  {
    jdField_byte.flush();
    jdField_new.flush();
  }
  
  public void close()
  {
    a.flush();
  }
  
  public static String jdMethod_this(Object a)
  {
    int tmp32_29 = (a = (String)a).length();
    int tmp36_35 = 1;
    tmp36_35;
    int j;
    int ? = tmp36_35;
    int k = tmp32_29;
    (j = new char[tmp32_29] - 1);
    int i = (0x2 ^ 0x5) << 3 ^ 0x1;
    if ((1 << 3 ^ 0x3 ^ 0x5) >= 0)
    {
      int tmp55_54 = j;
      j--;
      ?[tmp55_54] = ((char)(a.charAt(tmp55_54) ^ i));
      int tmp76_73 = (j--);
      ?[tmp76_73] = ((char)(a.charAt(tmp76_73) ^ k));
    }
    return new String(?);
  }
}
