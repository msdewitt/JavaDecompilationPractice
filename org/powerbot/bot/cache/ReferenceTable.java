package org.powerbot.bot.cache;

import java.nio.ByteBuffer;

public class ReferenceTable {
  private int jdField_null;
  private int jdField_byte;
  private int jdField_new;
  private Entry[] jdField_void;
  
  public static class Entry { private int jdField_super;
    private int jdField_final;
    private int jdField_enum;
    private int jdField_else;
    
    public Entry() {}
    
    public int getIndex() { return jdField_super; }
    
    public int getIdentifier()
    {
      return jdField_final;
    }
    
    public int getCRC() {
      return jdField_enum;
    }
    
    public int getVersion() {
      return jdField_else;
    }
    
    public int getChildCount() {
      return jdField_if;
    }
    
    public int[] getChildIndices() {
      return jdField_null;
    }
    
    public int[] getChildIdentifiers() {
      return jdField_new;
    }
    

    public byte[] getDigest() { return jdField_void; }
    
    private int jdField_if;
    private int[] jdField_null;
    private int jdField_byte;
    private int[] jdField_new;
    private byte[] jdField_void;
  }
  
  public ReferenceTable(ByteBuffer a) {
    int tmp8_7 = 1;tmp8_7; int 
      tmp23_22 = 1;tmp23_22;getjdField_new = (0xFF & tmp23_22);a; int 
      tmp37_36 = 1;tmp37_36;5position87jdField_new].jdField_void = tmp37_36; int 
    
      tmp44_43 = 1;
    int i;
    for (tmp44_43; (i = tmp44_43) < jdField_new;) {
      int tmp63_62 = i; int tmp64_63 = tmp63_62;tmp64_63; int tmp66_64 = tmp64_63;tmp66_64.<init>();Entry localEntry = tmp63_62[new org/powerbot/bot/cache/ReferenceTable$Entry] =  = tmp66_64; ByteBuffer 
      

        tmp91_90 = a;int j = tmp91_90.getInt();
      j = tmp91_90.getInt(); int 
        tmp105_104 = 1;tmp105_104; int tmp110_109 = 1;tmp110_109;
      (i++).get(Entry.jdMethod_this(localEntry));tmpTernaryOp = i; continue;throw Entry.jdMethod_this(new byte[tmp105_104], tmp110_109);
    }
  }
  


  public ReferenceTable(int a, ByteBuffer a, ReferenceTable a)
  {
    FileContainer localFileContainer;
    
    jdField_null = (localFileContainer = new FileContainer(a)).getCRC();
    if (a != null)
    {
      if (Entry.jdMethod_null(localObject = a.jdMethod_this()[a]) != jdField_null) {
        throw new RuntimeException(a + org.powerbot.bot.rt6.HashTable.jdMethod_this("\037") + jdField_null + org.powerbot.misc.NUl.jdMethod_this("J") + Entry.jdMethod_null((Entry)localObject));
      }
      Object localObject = Entry.jdMethod_this((Entry)localObject); int 
        tmp120_119 = 1;tmp120_119;a = Whirlpool.whirlpool(0, tmp120_119, a.capacity()); int 
        tmp132_131 = 1;
      int i; for (tmp132_131;; tmpTernaryOp = i) { int tmp140_139 = 1;tmp140_139; if (64 >= tmp140_139) break;
        if (a[i] != localObject[i]) {
          throw new RuntimeException(a);
        }
        i++; } throw (i = tmp132_131);
    }
    



    a.jdMethod_this(a, localFileContainer.unpack(), a);
  }
  
  private void jdMethod_this(int a, byte[] a, ReferenceTable a) {
    a = ByteBuffer.wrap(a); int 
      tmp13_12 = 1;tmp13_12;int i = 0xFF & tmp13_12; int 
      tmp22_21 = 1;tmp22_21; if (6 >= tmp22_21) {
      jdField_byte = a.getInt();
      if (a != null) {
        Entry localEntry1;
        if (Entry.jdMethod_for(localEntry1 = a.jdMethod_this()[a]) != jdField_byte) {
          throw new RuntimeException(a + org.powerbot.bot.rt6.HashTable.jdMethod_this("\037") + jdField_byte + org.powerbot.misc.NUl.jdMethod_this("J") + Entry.jdMethod_for(localEntry1));
        }
      }
    }
    int tmp128_127 = 1;tmp128_127;ReferenceTable localReferenceTable = 0xFF & tmp128_127; int 
      tmp135_134 = 1; int tmp136_135 = tmp135_134;tmp136_135; if ((tmp135_134 & tmp136_135) != 0) { int tmp143_142 = 1; int tmp144_143 = tmp143_142;;; break label154; throw tmp143_142; } else { 1; } label154: a = tmp152_151;
    int tmp159_158 = 1;tmp159_158; if ((0x2 & tmp159_158) != 0) { int tmp166_165 = 1; int tmp167_166 = tmp166_165;;; break label177; throw tmp166_165; } else { 1; } label177: a = tmp175_174;
    1; int tmp190_188 = 1;tmp190_188; int tmp197_196 = 1;((0x4 & tmp182_181) != 0 ? tmp190_188 : tmp197_196);int k = tmp197_196;
    1; int tmp214_212 = 1;tmp214_212; int tmp221_220 = 1;((0x8 & tmp206_205) != 0 ? tmp214_212 : tmp221_220);localReferenceTable = tmp221_220;
    
    1;
    jdField_new = jdMethod_this(a);
    
    jdField_new = (7 >= tmp230_229 ? a : a.getShort() & 0xFFFF); int 
    
      tmp267_266 = 1;tmp267_266;jdField_new].jdField_void = tmp267_266; int 
    
      tmp274_273 = 1;tmp274_273;int m = tmp274_273; int 
      tmp280_279 = 1;tmp280_279;int i1 = tmp280_279;
    1;
    int i2; int tmp307_305 = i2; int tmp308_307 = tmp307_305;tmp308_307; int tmp310_308 = tmp308_307;tmp310_308.<init>();Entry localEntry2 = tmp307_305[new org/powerbot/bot/cache/ReferenceTable$Entry] =  = tmp310_308;
    1;Entry.jdMethod_for(m, m = i + (7 >= tmp326_325 ? jdMethod_this(a) : a.getShort() & 0xFFFF));
    if (Entry.jdMethod_catch(localEntry2) > i1) {
      i1 = Entry.jdMethod_catch(localEntry2);
    }
    i2++;
    






    if (a != 0) {
      int tmp384_383 = 1;
      































































































































      for (tmp384_383; (i2 = tmp384_383) < jdField_new; tmpTernaryOp = i2) { 
          Entry.jdMethod_catch(i2++, a.getInt());
      }
      throw 
        jdField_void[i2];
    }
    
    1; int 
      tmp448_445 = (i2++);tmp448_445;Entry.jdMethod_catch(1, tmp448_445);
    


    1;
    Entry.jdMethod_enum(i2++, a.getInt());
    

    if (localReferenceTable != 0) {
      1;
      int i3 = a.getInt();
    }
    

    if (a != 0) {
      1;
      localEntry3 = jdField_void[i2];
      1;1;
      (i2++).get(Entry.jdMethod_this(localEntry3));
    }
    

    if (k != 0) {
      1;
      localEntry3 = i2++;
      a = a.getInt().getInt();
    }
    

    1;
    Entry.jdMethod_null(i2++, a.getInt());
    

    1;
    1;Entry.jdMethod_true(i, 7 >= tmp689_688 ? jdMethod_this(a) : a.getShort() & 0xFFFF);
    

    1;
    Entry localEntry3 = jdField_void[i2]; int 
      tmp745_744 = 1;tmp745_744;int n = tmp745_744;
    a = Entry.jdMethod_true(localEntry3);
    1; int 
      tmp767_766 = 1;tmp767_766;i1 = tmp767_766; int 
      tmp773_772 = 1;tmp773_772;localReferenceTable = tmp773_772;0;
    1; int tmp818_817 = (i + (7 >= tmp798_797 ? jdMethod_this(a) : a.getShort() & 0xFFFF));n = tmp818_817;localReferenceTable[n] = tmp818_817;
    if (Entry.jdMethod_true(localEntry3)[localReferenceTable] > i1) {
      i1 = Entry.jdMethod_true(localEntry3)[localReferenceTable];
    }
    localReferenceTable++; int 
    




      tmp858_857 = 1; int tmp859_858 = tmp858_857;tmp859_858;Entry.jdMethod_this(i1, tmp858_857 + tmp859_858); int 
      tmp869_868 = 1; int tmp870_869 = tmp869_868;tmp870_869; if (tmp869_868 + tmp870_869 == a) {
      Entry.jdMethod_true(localEntry3, null);
    }
    i2++;
    
















    if (a != 0) {
      1;
      
      a = Entry.jdMethod_true(localEntry3 = jdField_void[i2]);
      1; int 
        tmp939_938 = 1;tmp939_938;int j = tmp939_938;0; int 
        tmp963_962 = 1;tmp963_962;-1[tmp963_962] = (j++);
      
      1;
      

      a = Entry.jdMethod_true(localEntry3)[j];
      
      a = j;
      
      a[a.getInt()] = (j++);i2++;
    }
  }
  















  public int getVersion()
  {
    return jdField_byte;
  }
  
  public int getEntryCount() {
    return jdField_new;
  }
  
  private Entry[] jdMethod_this() {
    return jdField_void;
  }
  
  /* Error */
  public Entry getEntry(int a)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 33	org/powerbot/bot/cache/ReferenceTable:void	[Lorg/powerbot/bot/cache/ReferenceTable$Entry;
    //   4: dup
    //   5: astore_2
    //   6: arraylength
    //   7: istore_3
    //   8: iconst_0
    //   9: iconst_1
    //   10: dup
    //   11: pop2
    //   12: dup
    //   13: istore 4
    //   15: iload_3
    //   16: if_icmpge +30 -> 46
    //   19: aload_2
    //   20: iload 4
    //   22: aaload
    //   23: dup
    //   24: astore 5
    //   26: invokestatic 158	org/powerbot/bot/cache/ReferenceTable$Entry:catch	(Lorg/powerbot/bot/cache/ReferenceTable$Entry;)I
    //   29: iload_1
    //   30: if_icmpne +7 -> 37
    //   33: aload 5
    //   35: areturn
    //   36: athrow
    //   37: iinc 4 1
    //   40: iload 4
    //   42: goto -27 -> 15
    //   45: athrow
    //   46: aconst_null
    //   47: areturn
    // Line number table:
    //   Java source line #223	-> byte code offset #0
    //   Java source line #224	-> byte code offset #26
    //   Java source line #225	-> byte code offset #33
    //   Java source line #223	-> byte code offset #37
    //   Java source line #229	-> byte code offset #46
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	a	ReferenceTable
    //   0	48	1	a	int
  }
  
  public int getCRC()
  {
    return jdField_null;
  }
  
  /* Error */
  private static int jdMethod_this(ByteBuffer a)
  {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: invokevirtual 188	java/nio/ByteBuffer:position	()I
    //   5: invokevirtual 191	java/nio/ByteBuffer:get	(I)B
    //   8: iflt +12 -> 20
    //   11: aload_0
    //   12: invokevirtual 152	java/nio/ByteBuffer:getShort	()S
    //   15: ldc -103
    //   17: iand
    //   18: ireturn
    //   19: athrow
    //   20: aload_0
    //   21: invokevirtual 38	java/nio/ByteBuffer:getInt	()I
    //   24: ldc -64
    //   26: iand
    //   27: ireturn
    // Line number table:
    //   Java source line #237	-> byte code offset #0
    //   Java source line #238	-> byte code offset #8
    //   Java source line #239	-> byte code offset #11
    //   Java source line #241	-> byte code offset #20
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	28	0	a	ByteBuffer
  }
}
