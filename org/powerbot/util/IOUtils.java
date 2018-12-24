package org.powerbot.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.powerbot.script.StringUtils;

public class IOUtils
{
  private static final int jdField_void = 8192;
  
  public IOUtils() {}
  
  /* Error */
  public static byte[] jdMethod_true(InputStream a)
  {
    // Byte code:
    //   0: aload_0
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_1
    //   5: invokestatic 28	org/powerbot/util/IOUtils:this	(Ljava/io/InputStream;)[B
    //   8: astore_3
    //   9: aload_1
    //   10: ifnull +29 -> 39
    //   13: aload_2
    //   14: ifnull +21 -> 35
    //   17: aload_1
    //   18: invokevirtual 33	java/io/InputStream:close	()V
    //   21: aload_3
    //   22: areturn
    //   23: athrow
    //   24: astore 4
    //   26: aload_3
    //   27: aload_2
    //   28: aload 4
    //   30: invokevirtual 37	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   33: areturn
    //   34: athrow
    //   35: aload_1
    //   36: invokevirtual 33	java/io/InputStream:close	()V
    //   39: aload_3
    //   40: areturn
    //   41: astore_3
    //   42: aload_3
    //   43: dup
    //   44: astore_2
    //   45: athrow
    //   46: astore 5
    //   48: aload_1
    //   49: ifnull +31 -> 80
    //   52: aload_2
    //   53: ifnull +23 -> 76
    //   56: aload_1
    //   57: invokevirtual 33	java/io/InputStream:close	()V
    //   60: aload 5
    //   62: goto +20 -> 82
    //   65: astore_3
    //   66: aload 5
    //   68: aload_2
    //   69: aload_3
    //   70: invokevirtual 37	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   73: goto +9 -> 82
    //   76: aload_1
    //   77: invokevirtual 33	java/io/InputStream:close	()V
    //   80: aload 5
    //   82: athrow
    //   83: astore_1
    //   84: iconst_0
    //   85: iconst_1
    //   86: dup
    //   87: pop2
    //   88: newarray byte
    //   90: iconst_1
    //   91: dup
    //   92: pop2
    //   93: areturn
    // Line number table:
    //   Java source line #14	-> byte code offset #0
    //   Java source line #15	-> byte code offset #4
    //   Java source line #16	-> byte code offset #9
    //   Java source line #15	-> byte code offset #39
    //   Java source line #14	-> byte code offset #41
    //   Java source line #16	-> byte code offset #46
    //   Java source line #18	-> byte code offset #84
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	94	0	a	InputStream
    // Exception table:
    //   from	to	target	type
    //   17	21	24	java/lang/Throwable
    //   4	9	41	java/lang/Throwable
    //   4	9	46	finally
    //   41	48	46	finally
    //   56	60	65	java/lang/Throwable
    //   0	23	83	java/io/IOException
    //   24	34	83	java/io/IOException
    //   35	39	83	java/io/IOException
    //   41	83	83	java/io/IOException
  }
  
  public static byte[] jdMethod_this(InputStream a)
    throws IOException
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    1; int tmp17_16 = 1;tmp17_16;int ? = tmp17_16;
    int i; for (;;) { i = a.read(?); int tmp29_28 = 1;tmp29_28; if (-1 == tmp29_28) break;
      int tmp39_38 = ;;;; } throw a;
    
    return localByteArrayOutputStream.toByteArray();
  }
  
  public static String readString(InputStream a)
  {
    return StringUtils.newStringUtf8(jdMethod_true(a));
  }
  
  public static void jdMethod_this(InputStream a, OutputStream a) throws IOException {
    1; int tmp9_8 = 1;tmp9_8;int ? = tmp9_8;
    int i; for (;;) { i = a.read(?); int tmp21_20 = 1;tmp21_20; if (-1 == tmp21_20) break;
      int tmp31_30 = ;;;; } throw a;
  }
  
  /* Error */
  public static void jdMethod_this(InputStream a, java.io.File a)
  {
    // Byte code:
    //   0: new 73	java/io/FileOutputStream
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 76	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   8: astore_1
    //   9: aconst_null
    //   10: astore_2
    //   11: aload_0
    //   12: aload_1
    //   13: invokestatic 78	org/powerbot/util/IOUtils:this	(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    //   16: aload_1
    //   17: ifnull +70 -> 87
    //   20: aload_2
    //   21: ifnull +17 -> 38
    //   24: aload_1
    //   25: invokevirtual 79	java/io/OutputStream:close	()V
    //   28: return
    //   29: athrow
    //   30: astore_3
    //   31: aload_2
    //   32: aload_3
    //   33: invokevirtual 37	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   36: return
    //   37: athrow
    //   38: aload_1
    //   39: invokevirtual 79	java/io/OutputStream:close	()V
    //   42: return
    //   43: astore_3
    //   44: aload_3
    //   45: dup
    //   46: astore_2
    //   47: athrow
    //   48: astore 4
    //   50: aload_1
    //   51: ifnull +31 -> 82
    //   54: aload_2
    //   55: ifnull +23 -> 78
    //   58: aload_1
    //   59: invokevirtual 79	java/io/OutputStream:close	()V
    //   62: aload 4
    //   64: goto +20 -> 84
    //   67: astore_3
    //   68: aload 4
    //   70: aload_2
    //   71: aload_3
    //   72: invokevirtual 37	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   75: goto +9 -> 84
    //   78: aload_1
    //   79: invokevirtual 79	java/io/OutputStream:close	()V
    //   82: aload 4
    //   84: athrow
    //   85: athrow
    //   86: astore_1
    //   87: return
    // Line number table:
    //   Java source line #43	-> byte code offset #0
    //   Java source line #44	-> byte code offset #11
    //   Java source line #45	-> byte code offset #16
    //   Java source line #43	-> byte code offset #43
    //   Java source line #45	-> byte code offset #48
    //   Java source line #46	-> byte code offset #85
    //   Java source line #45	-> byte code offset #86
    //   Java source line #47	-> byte code offset #87
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	a	InputStream
    //   0	88	1	a	java.io.File
    // Exception table:
    //   from	to	target	type
    //   24	28	30	java/lang/Throwable
    //   11	16	43	java/lang/Throwable
    //   11	16	48	finally
    //   43	50	48	finally
    //   58	62	67	java/lang/Throwable
    //   0	29	86	java/io/IOException
    //   30	37	86	java/io/IOException
    //   38	85	86	java/io/IOException
  }
  
  /* Error */
  private static long jdMethod_this(InputStream a, java.util.zip.Checksum a)
  {
    // Byte code:
    //   0: new 83	java/util/zip/CheckedInputStream
    //   3: dup
    //   4: aload_0
    //   5: aload_1
    //   6: invokespecial 86	java/util/zip/CheckedInputStream:<init>	(Ljava/io/InputStream;Ljava/util/zip/Checksum;)V
    //   9: astore_1
    //   10: aconst_null
    //   11: astore_2
    //   12: sipush 8192
    //   15: iconst_1
    //   16: dup
    //   17: pop2
    //   18: newarray byte
    //   20: iconst_1
    //   21: dup
    //   22: pop2
    //   23: astore_3
    //   24: aload_1
    //   25: aload_3
    //   26: invokevirtual 87	java/util/zip/CheckedInputStream:read	([B)I
    //   29: iconst_m1
    //   30: iconst_1
    //   31: dup
    //   32: pop2
    //   33: if_icmpeq +8 -> 41
    //   36: aload_1
    //   37: goto -12 -> 25
    //   40: athrow
    //   41: aload_1
    //   42: invokevirtual 91	java/util/zip/CheckedInputStream:getChecksum	()Ljava/util/zip/Checksum;
    //   45: invokeinterface 97 1 0
    //   50: lstore 4
    //   52: aload_1
    //   53: ifnull +30 -> 83
    //   56: aload_2
    //   57: ifnull +22 -> 79
    //   60: aload_1
    //   61: invokevirtual 98	java/util/zip/CheckedInputStream:close	()V
    //   64: lload 4
    //   66: lreturn
    //   67: athrow
    //   68: astore 6
    //   70: lload 4
    //   72: aload_2
    //   73: aload 6
    //   75: invokevirtual 37	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   78: lreturn
    //   79: aload_1
    //   80: invokevirtual 98	java/util/zip/CheckedInputStream:close	()V
    //   83: lload 4
    //   85: lreturn
    //   86: astore_3
    //   87: aload_3
    //   88: dup
    //   89: astore_2
    //   90: athrow
    //   91: astore 7
    //   93: aload_1
    //   94: ifnull +31 -> 125
    //   97: aload_2
    //   98: ifnull +23 -> 121
    //   101: aload_1
    //   102: invokevirtual 98	java/util/zip/CheckedInputStream:close	()V
    //   105: aload 7
    //   107: goto +20 -> 127
    //   110: astore_3
    //   111: aload 7
    //   113: aload_2
    //   114: aload_3
    //   115: invokevirtual 37	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   118: goto +9 -> 127
    //   121: aload_1
    //   122: invokevirtual 98	java/util/zip/CheckedInputStream:close	()V
    //   125: aload 7
    //   127: athrow
    //   128: astore_1
    //   129: ldc2_w 99
    //   132: lreturn
    // Line number table:
    //   Java source line #50	-> byte code offset #0
    //   Java source line #51	-> byte code offset #12
    //   Java source line #52	-> byte code offset #24
    //   Java source line #54	-> byte code offset #41
    //   Java source line #55	-> byte code offset #52
    //   Java source line #54	-> byte code offset #83
    //   Java source line #50	-> byte code offset #86
    //   Java source line #55	-> byte code offset #91
    //   Java source line #56	-> byte code offset #129
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	133	0	a	InputStream
    //   0	133	1	a	java.util.zip.Checksum
    //   11	103	2	localThrowable3	Throwable
    //   23	3	3	?	int
    //   86	2	3	localThrowable1	Throwable
    //   86	2	3	localThrowable4	Throwable
    //   110	5	3	localThrowable2	Throwable
    //   110	5	3	localThrowable5	Throwable
    //   50	34	4	l	long
    //   68	6	6	localThrowable	Throwable
    //   91	35	7	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   60	64	68	java/lang/Throwable
    //   12	40	86	java/lang/Throwable
    //   41	52	86	java/lang/Throwable
    //   12	40	91	finally
    //   41	52	91	finally
    //   86	93	91	finally
    //   101	105	110	java/lang/Throwable
    //   0	40	128	java/io/IOException
    //   41	67	128	java/io/IOException
    //   68	83	128	java/io/IOException
    //   86	128	128	java/io/IOException
  }
  
  /* Error */
  public static void jdMethod_this(java.util.Map<String, byte[]> a, java.io.File a)
  {
    // Byte code:
    //   0: new 104	java/util/zip/ZipOutputStream
    //   3: dup
    //   4: new 73	java/io/FileOutputStream
    //   7: dup
    //   8: aload_1
    //   9: invokespecial 76	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   12: invokespecial 107	java/util/zip/ZipOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   15: astore_1
    //   16: aconst_null
    //   17: astore_2
    //   18: aload_1
    //   19: aload_1
    //   20: iconst_0
    //   21: dup_x1
    //   22: iconst_1
    //   23: dup
    //   24: pop2
    //   25: invokevirtual 111	java/util/zip/ZipOutputStream:setMethod	(I)V
    //   28: iconst_1
    //   29: dup
    //   30: pop2
    //   31: invokevirtual 114	java/util/zip/ZipOutputStream:setLevel	(I)V
    //   34: aload_0
    //   35: invokeinterface 118 1 0
    //   40: invokeinterface 124 1 0
    //   45: astore_3
    //   46: aload_3
    //   47: invokeinterface 130 1 0
    //   52: ifeq +148 -> 200
    //   55: aload_3
    //   56: invokeinterface 134 1 0
    //   61: checkcast 7	java/util/Map$Entry
    //   64: astore 4
    //   66: new 136	java/util/zip/ZipEntry
    //   69: dup
    //   70: new 138	java/lang/StringBuilder
    //   73: dup
    //   74: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   77: aload 4
    //   79: invokeinterface 142 1 0
    //   84: checkcast 144	java/lang/String
    //   87: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: ldc -106
    //   92: invokestatic 155	z/lpT1:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   95: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: invokevirtual 159	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   101: invokespecial 162	java/util/zip/ZipEntry:<init>	(Ljava/lang/String;)V
    //   104: astore 5
    //   106: aload 4
    //   108: aload 5
    //   110: iconst_0
    //   111: iconst_1
    //   112: dup
    //   113: pop2
    //   114: invokevirtual 163	java/util/zip/ZipEntry:setMethod	(I)V
    //   117: invokeinterface 165 1 0
    //   122: checkcast 40	[B
    //   125: astore 6
    //   127: aload 5
    //   129: aload 6
    //   131: arraylength
    //   132: i2l
    //   133: invokevirtual 169	java/util/zip/ZipEntry:setSize	(J)V
    //   136: aload 5
    //   138: aload 6
    //   140: arraylength
    //   141: i2l
    //   142: invokevirtual 172	java/util/zip/ZipEntry:setCompressedSize	(J)V
    //   145: aload 4
    //   147: new 174	java/io/ByteArrayInputStream
    //   150: aload 5
    //   152: dup_x1
    //   153: dup
    //   154: pop2
    //   155: dup
    //   156: aload 6
    //   158: invokespecial 177	java/io/ByteArrayInputStream:<init>	([B)V
    //   161: new 179	java/util/zip/CRC32
    //   164: dup
    //   165: invokespecial 180	java/util/zip/CRC32:<init>	()V
    //   168: invokestatic 182	org/powerbot/util/IOUtils:this	(Ljava/io/InputStream;Ljava/util/zip/Checksum;)J
    //   171: invokevirtual 185	java/util/zip/ZipEntry:setCrc	(J)V
    //   174: aload_1
    //   175: dup_x1
    //   176: aload 5
    //   178: invokevirtual 189	java/util/zip/ZipOutputStream:putNextEntry	(Ljava/util/zip/ZipEntry;)V
    //   181: invokeinterface 165 1 0
    //   186: checkcast 40	[B
    //   189: invokevirtual 191	java/util/zip/ZipOutputStream:write	([B)V
    //   192: aload_1
    //   193: invokevirtual 194	java/util/zip/ZipOutputStream:closeEntry	()V
    //   196: goto -150 -> 46
    //   199: athrow
    //   200: aload_1
    //   201: ifnull +69 -> 270
    //   204: aload_2
    //   205: ifnull +16 -> 221
    //   208: aload_1
    //   209: invokevirtual 195	java/util/zip/ZipOutputStream:close	()V
    //   212: return
    //   213: athrow
    //   214: astore_3
    //   215: aload_2
    //   216: aload_3
    //   217: invokevirtual 37	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   220: return
    //   221: aload_1
    //   222: invokevirtual 195	java/util/zip/ZipOutputStream:close	()V
    //   225: return
    //   226: astore_3
    //   227: aload_3
    //   228: dup
    //   229: astore_2
    //   230: athrow
    //   231: astore 7
    //   233: aload_1
    //   234: ifnull +31 -> 265
    //   237: aload_2
    //   238: ifnull +23 -> 261
    //   241: aload_1
    //   242: invokevirtual 195	java/util/zip/ZipOutputStream:close	()V
    //   245: aload 7
    //   247: goto +20 -> 267
    //   250: astore_3
    //   251: aload 7
    //   253: aload_2
    //   254: aload_3
    //   255: invokevirtual 37	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   258: goto +9 -> 267
    //   261: aload_1
    //   262: invokevirtual 195	java/util/zip/ZipOutputStream:close	()V
    //   265: aload 7
    //   267: athrow
    //   268: athrow
    //   269: astore_1
    //   270: return
    // Line number table:
    //   Java source line #61	-> byte code offset #0
    //   Java source line #62	-> byte code offset #18
    //   Java source line #63	-> byte code offset #28
    //   Java source line #64	-> byte code offset #34
    //   Java source line #65	-> byte code offset #66
    //   Java source line #66	-> byte code offset #108
    //   Java source line #67	-> byte code offset #117
    //   Java source line #68	-> byte code offset #127
    //   Java source line #69	-> byte code offset #136
    //   Java source line #70	-> byte code offset #147
    //   Java source line #71	-> byte code offset #174
    //   Java source line #72	-> byte code offset #181
    //   Java source line #73	-> byte code offset #192
    //   Java source line #74	-> byte code offset #196
    //   Java source line #75	-> byte code offset #200
    //   Java source line #61	-> byte code offset #226
    //   Java source line #75	-> byte code offset #231
    //   Java source line #76	-> byte code offset #268
    //   Java source line #75	-> byte code offset #269
    //   Java source line #77	-> byte code offset #270
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	271	0	a	java.util.Map
    //   0	271	1	a	java.io.File
    //   17	237	2	localThrowable3	Throwable
    //   45	11	3	localIterator	java.util.Iterator
    //   214	3	3	localThrowable	Throwable
    //   214	3	3	localThrowable4	Throwable
    //   226	2	3	localThrowable1	Throwable
    //   226	2	3	localThrowable5	Throwable
    //   250	5	3	localThrowable2	Throwable
    //   250	5	3	localThrowable6	Throwable
    //   64	82	4	localEntry	java.util.Map.Entry
    //   104	73	5	localZipEntry	java.util.zip.ZipEntry
    //   125	32	6	arrayOfByte	byte[]
    //   231	35	7	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   208	212	214	java/lang/Throwable
    //   18	199	226	java/lang/Throwable
    //   18	199	231	finally
    //   226	233	231	finally
    //   241	245	250	java/lang/Throwable
    //   0	199	269	java/io/IOException
    //   200	213	269	java/io/IOException
    //   214	268	269	java/io/IOException
  }
  
  public static String jdMethod_this(Object a)
  {
    int tmp24_21 = (a = (String)a).length();
    int tmp28_27 = 1;
    tmp28_27;
    int j;
    int ? = tmp28_27;
    int k = tmp24_21;
    (j = new char[tmp24_21] - 1);
    int i = 1 << 3;
    if ((5 << 3 ^ 0x4) >= 0)
    {
      int tmp47_46 = j;
      j--;
      ?[tmp47_46] = ((char)(a.charAt(tmp47_46) ^ i));
      int tmp68_65 = (j--);
      ?[tmp68_65] = ((char)(a.charAt(tmp68_65) ^ k));
    }
    return new String(?);
  }
}
