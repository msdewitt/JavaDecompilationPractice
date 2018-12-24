package org.powerbot.bot.cache;

public class Block
{
  private final ReferenceTable.Entry jdField_byte;
  private final byte[] jdField_new;
  private Sector[] jdField_void;
  
  public static class Sector {
    private final int jdField_byte;
    private final int jdField_new;
    private final byte[] jdField_void;
    
    Sector(int a, int a, byte[] a) {
      jdField_byte = a;
      jdField_new = a;
      jdField_void = a;
    }
    
    public int getIndex() {
      return jdField_byte;
    }
    
    public int getIdentifier() {
      return jdField_new;
    }
    
    public byte[] getPayload() {
      return jdField_void;
    }
  }
  
  public Block(ReferenceTable.Entry a, byte[] a) {
    jdField_byte = a;
    jdField_new = a;a
      .jdMethod_this();
  }
  
  private void jdMethod_this() {
    JagexStream localJagexStream = new JagexStream(jdField_new); JagexStream 
      tmp14_13 = localJagexStream; int tmp21_20 = 1; int tmp22_21 = tmp21_20;tmp22_21;tmp14_13.getLength().seek(tmp21_20 - tmp22_21);
    int i = tmp14_13.getUByte(); int 
      tmp36_35 = 1; int tmp37_36 = tmp36_35;tmp37_36; int tmp42_41 = 1;tmp42_41;(tmp36_35 - tmp37_36)
    
      .seek(j = 4 - tmp42_41 * i * jdField_byte.getChildCount()); int 
      tmp70_69 = 1;tmp70_69;int ? = tmp70_69; int 
      tmp79_78 = 1;tmp79_78;int ? = tmp79_78; int 
      tmp85_84 = 1;
    int k; for (tmp85_84; (k = tmp85_84) < i;) {
      int tmp96_95 = 1;tmp96_95;m = tmp96_95; int 
        tmp102_101 = 1;
      for (tmp102_101; (n = tmp102_101) < ?.length;) {
        m += localJagexStream.getInt(); int 
          tmp126_124 = n; int tmp126_122 = ?;tmp126_124[(tmp126_122[tmp126_124] + m)] = (n++);tmpTernaryOp = n; continue;throw tmp126_122;
      }
      k++;tmpTernaryOp = k; continue;throw 
      
        0;
    }
    
    int m;
    
    1; int 
      tmp174_173 = 1;tmp174_173;new byte[?[k]][tmp174_173] = (k++);
    

    localJagexStream.seek(j); int 
      tmp200_199 = 1;tmp200_199;int ? = tmp200_199;
    1; int 
      tmp217_216 = 1;tmp217_216;int n = tmp217_216; int 
      tmp223_222 = 1;tmp223_222;int j = tmp223_222;
    1;
    n += localJagexStream.getInt();
    System.arraycopy(localJagexStream.getAllBytes(), j, ?[?], ?[?], n);?[?]
       += n;?++;
    j = j + n;m++; int 
    


      tmp307_306 = 1;tmp307_306;lengthjdField_void = tmp307_306;
    1; int 
      tmp334_332 = m;tmp334_332; int tmp336_334 = tmp334_332; int tmp342_341 = 1;tmp342_341;m.<init>(-1, tmp342_341, ?[m]);tmp336_334[tmp336_334] = (m++);
  }
  
  /* Error */
  public Sector getSector(int a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 26	org/powerbot/bot/cache/Block:byte	Lorg/powerbot/bot/cache/ReferenceTable$Entry;
    //   4: invokevirtual 83	org/powerbot/bot/cache/ReferenceTable$Entry:getChildIndices	()[I
    //   7: dup
    //   8: astore_2
    //   9: ifnonnull +8 -> 17
    //   12: iload_1
    //   13: goto +9 -> 22
    //   16: athrow
    //   17: aload_2
    //   18: iload_1
    //   19: invokestatic 89	java/util/Arrays:binarySearch	([II)I
    //   22: istore_3
    //   23: iload_3
    //   24: iflt +12 -> 36
    //   27: iload_3
    //   28: aload_0
    //   29: getfield 68	org/powerbot/bot/cache/Block:void	[Lorg/powerbot/bot/cache/Block$Sector;
    //   32: arraylength
    //   33: if_icmplt +6 -> 39
    //   36: aconst_null
    //   37: areturn
    //   38: athrow
    //   39: aload_0
    //   40: getfield 68	org/powerbot/bot/cache/Block:void	[Lorg/powerbot/bot/cache/Block$Sector;
    //   43: iload_3
    //   44: aaload
    //   45: areturn
    // Line number table:
    //   Java source line #79	-> byte code offset #0
    //   Java source line #80	-> byte code offset #9
    //   Java source line #81	-> byte code offset #23
    //   Java source line #82	-> byte code offset #36
    //   Java source line #84	-> byte code offset #39
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	46	0	a	Block
    //   0	46	1	a	int
  }
  
  public static String jdMethod_this(Object a)
  {
    int tmp30_27 = (a = (String)a).length();
    int tmp34_33 = 1;
    tmp34_33;
    int j;
    int ? = tmp34_33;
    int k = tmp30_27;
    (j = new char[tmp30_27] - 1);
    int i = (0x3 ^ 0x5) << 4 ^ 4 << 1;
    if ((0x3 ^ 0x5) >= 0)
    {
      int tmp53_52 = j;
      j--;
      ?[tmp53_52] = ((char)(a.charAt(tmp53_52) ^ i));
      int tmp74_71 = (j--);
      ?[tmp74_71] = ((char)(a.charAt(tmp74_71) ^ k));
    }
    return new String(?);
  }
}
