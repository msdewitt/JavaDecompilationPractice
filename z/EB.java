package z;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.powerbot.bot.rt6.HashTable;



















































































































































public class EB
  extends cOn
{
  private boolean jdField_super;
  private boolean jdField_final;
  private int jdField_enum;
  private String jdField_else;
  private String[] jdField_if;
  private Collection<S> jdField_null;
  private boolean jdField_byte;
  private Collection<S> jdField_new;
  private Collection<S> jdField_void;
  
  public EB(cOn a)
  {
    a.<init>(327680, a);
    if (a.getClass() != EB.class) {
      throw new IllegalStateException();
    }
  }
  









  public EB(int a, cOn a)
  {
    a.<init>(a, a);
    a;a.<init>();jdField_null = a;
    a;a.<init>();jdField_new = a;
    a;a.<init>();jdField_void = a;
  }
  










  public void jdMethod_this(int a, int a, String a, String a, String a, String[] a)
  {
    int tmp6_5 = 1;tmp6_5; if ((0x4000 & tmp6_5) == 0) { int tmp13_12 = 1; int tmp14_13 = tmp13_12;;; break label24; throw tmp13_12; } else { 1; } label24: 0jdField_super = tmp22_21;
    
    if (jdField_super) {
      jdField_else = a;
      jdField_enum = a; int 
        tmp52_51 = 1;tmp52_51;lengthjdField_if = tmp52_51;
      1; int tmp67_66 = 0; int tmp69_68 = 1;tmp69_68;System.arraycopy(tmp67_66, jdField_if, tmp67_66, tmp69_68, a.length);
    }
    

    a.jdMethod_this(a, a, a, a, a, a);
  }
  





  public cON jdMethod_this(int a, String a, String a, String a, String[] a)
  {
    if (jdField_super) {
      if (lpt6.jdMethod_this("\006*V T Nw").equals(a)) {
        int tmp21_20 = 1; int tmp22_21 = tmp21_20;tmp22_21;2120jdField_byte = tmp22_21;
      }
      






      int tmp32_31 = 1;tmp32_31;int i = 0xD3F & tmp32_31; int 
      





        tmp40_39 = 1;tmp40_39; if ((0x2 & tmp40_39) == 0) {
        if (HashTable.jdMethod_this("\030ZJZP\r").equals(a)) {
          ;; break label118; throw a; }
        if (!lpt6.jdMethod_this("\006*V T Nw").equals(a)) {
          jdField_void.add(new S(a, i, a));
        }
      }
    }
    label118:
    return a.jdMethod_this(a, a, a, a, a);
  }
  





  public auX jdMethod_this(int a, String a, String a, String a, Object a)
  {
    if (jdField_super) {
      if (HashTable.jdMethod_this("WVVZE_rVV@M\\Jfmw").equals(a))
      {
        int tmp24_23 = 1;tmp24_23;0jdField_super = tmp24_23; int 
          tmp30_29 = 1;tmp30_29;jdField_final = tmp30_29;
      }
      





      int tmp38_37 = 1;tmp38_37; if ((0x2 & tmp38_37) != 0) { int tmp49_48 = 1;tmp49_48; if ((0x88 & tmp49_48) != 0) {}
      } else {
        int tmp60_59 = 1;tmp60_59;int i = 0xDF & tmp60_59;
        


        jdField_null.add(new S(a, i, a));
      }
    }
    
    return a.jdMethod_this(a, a, a, a, a);
  }
  








  public void jdMethod_this(String a, String a, String a, int a)
  {
    if ((jdField_else != null) && (jdField_else.equals(a))) {
      jdField_enum = a;
    }
    a.jdMethod_this(a, a, a, a);
  }
  
  /* Error */
  public void jdMethod_this()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 56	z/EB:super	Z
    //   4: ifeq +59 -> 63
    //   7: aload_0
    //   8: getfield 109	z/EB:final	Z
    //   11: ifne +52 -> 63
    //   14: aload_0
    //   15: dup
    //   16: invokevirtual 118	z/EB:this	()J
    //   19: invokevirtual 121	z/EB:this	(J)V
    //   22: aload_0
    //   23: goto +41 -> 64
    //   26: athrow
    //   27: astore_1
    //   28: new 123	java/lang/RuntimeException
    //   31: dup
    //   32: new 125	java/lang/StringBuilder
    //   35: dup
    //   36: invokespecial 126	java/lang/StringBuilder:<init>	()V
    //   39: iconst_0
    //   40: ldc -128
    //   42: invokestatic 83	z/lpt6:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   45: invokevirtual 132	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   48: aload_0
    //   49: getfield 58	z/EB:else	Ljava/lang/String;
    //   52: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: invokevirtual 140	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: aload_1
    //   59: invokespecial 143	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   62: athrow
    //   63: aload_0
    //   64: invokespecial 145	z/cOn:this	()V
    //   67: return
    // Line number table:
    //   Java source line #312	-> byte code offset #0
    //   Java source line #314	-> byte code offset #14
    //   Java source line #318	-> byte code offset #23
    //   Java source line #315	-> byte code offset #27
    //   Java source line #316	-> byte code offset #28
    //   Java source line #321	-> byte code offset #63
    //   Java source line #322	-> byte code offset #67
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	68	0	a	EB
    // Exception table:
    //   from	to	target	type
    //   14	22	27	java/lang/Throwable
  }
  
  public boolean jdMethod_this()
  {
    return jdField_final;
  }
  
  public void jdMethod_this(long a) {
    int tmp4_3 = 1;tmp4_3;
    
    if ((a = 24.jdMethod_this(tmp4_3, HashTable.jdMethod_this("WVVZE_rVV@M\\Jfmw"), lpt6.jdMethod_this("\003"), null, Long.valueOf(a))) != null) {
      a.jdMethod_this();
    }
  }
  






  public long jdMethod_this()
    throws IOException
  {
    DataOutputStream localDataOutputStream = null;
    long l = 0L;
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      localDataOutputStream = new DataOutputStream(localByteArrayOutputStream); int 
      



        tmp30_29 = 1;tmp30_29; int tmp35_34 = 1;tmp35_34;47.writeUTF(tmp30_29.replace('.', tmp35_34));
      



      int j = jdField_else.jdField_enum; int 
        tmp53_52 = 1;tmp53_52; if ((0x200 & tmp53_52) != 0) {
        if (jdField_void.size() > 0) { int tmp77_76 = 1;tmp77_76;tmpTernaryOp = (0x400 | tmp77_76; break label93; throw j; } else { 1; } label93: j = 0xFBFF & tmp90_89;
      }
      
      int tmp102_101 = 1;tmp102_101;j.writeInt(0x611 & tmp102_101);
      






      Arrays.sort(jdField_if); int 
        tmp117_116 = 1;
      for (tmp117_116; (j = tmp117_116) < jdField_if.length;) {
        int tmp141_140 = 1;tmp141_140; int tmp146_145 = 1;(j++);tmp141_140.writeUTF(46.replace(tmp146_145, tmp146_145));tmpTernaryOp = j; continue;throw 47;
      }
      











      int tmp171_170 = 1;tmp171_170;jdMethod_this(localDataOutputStream, 0, tmp171_170);
      







      if (jdField_null.jdField_byte) {
        localDataOutputStream.writeUTF(HashTable.jdMethod_this("\030PHZJZP\r")); int 
          tmp198_197 = 1;tmp198_197;8.writeInt(tmp198_197);"a\023\037"
          .writeUTF(lpt6.jdMethod_this(localDataOutputStream));
      }
      






      DataOutputStream tmp217_216 = localDataOutputStream; int tmp219_218 = 1; int tmp220_219 = tmp219_218;tmp220_219;jdMethod_this(tmp217_216, tmp219_218, tmp220_219); int 
      






        tmp230_229 = 1; int tmp231_230 = tmp230_229;tmp231_230;jdMethod_this(localDataOutputStream, tmp230_229, tmp231_230);jdField_new.jdField_void
      
        .flush();
      





      byte[] arrayOfByte = tmp217_216.jdMethod_this(a.toByteArray());
      













      1; int tmp258_257 = 1; int tmp259_258 = tmp258_257;tmp259_258;int i = tmp258_257 - tmp259_258;
      1; int tmp282_281 = 1;tmp282_281;l = 0xFF & tmp282_281 | ???--;
      


      if (localDataOutputStream != null) {
        localDataOutputStream.close();return l;
      }
    }
    finally
    {
      if (localDataOutputStream == null) {}
    }
    


    return l;
  }
  
  /* Error */
  public byte[] jdMethod_this(byte[] a)
  {
    // Byte code:
    //   0: ldc -34
    //   2: invokestatic 94	org/powerbot/bot/rt6/HashTable:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   5: invokestatic 228	java/security/MessageDigest:getInstance	(Ljava/lang/String;)Ljava/security/MessageDigest;
    //   8: aload_1
    //   9: invokevirtual 231	java/security/MessageDigest:digest	([B)[B
    //   12: areturn
    //   13: athrow
    //   14: astore_1
    //   15: new 233	java/lang/UnsupportedOperationException
    //   18: dup
    //   19: aload_1
    //   20: invokevirtual 234	java/lang/Exception:toString	()Ljava/lang/String;
    //   23: invokespecial 236	java/lang/UnsupportedOperationException:<init>	(Ljava/lang/String;)V
    //   26: athrow
    // Line number table:
    //   Java source line #474	-> byte code offset #0
    //   Java source line #475	-> byte code offset #14
    //   Java source line #476	-> byte code offset #15
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	a	EB
    //   0	27	1	a	byte[]
    // Exception table:
    //   from	to	target	type
    //   0	12	14	java/lang/Exception
  }
  
  private static void jdMethod_this(Collection<S> a, DataOutput a, boolean a)
    throws IOException
  {
    int i;
    int tmp13_12 = 1;tmp13_12;S[] arrayOfS = (S[])new S[i = a.size()].toArray(tmp13_12);
    Arrays.sort(arrayOfS); int 
      tmp32_31 = 1;
    int j; for (tmp32_31; (j = tmp32_31) < i;) {
      DataOutput tmp43_42 = a; S[] tmp49_47 = arrayOfS;a.writeUTF(4947jdField_byte);tmp43_42
        .writeInt(4947jdField_new);
      if (a != 0) { int tmp84_83 = 1;tmp84_83; int tmp89_88 = 1;tmp89_88;tmpTernaryOp = tmp84_83.replace('.', tmp89_88); break label106; throw 47; } jdField_void.writeUTF(jdField_void);tmpTernaryOp = (++j); continue;throw tmp43_42;
    }
    label106:
  }
}
