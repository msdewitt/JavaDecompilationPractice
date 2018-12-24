package org.powerbot.bot.cache;

import java.nio.BufferUnderflowException;

public class JagexStream { private static final int jdField_short = 8;
  private static final int jdField_try = 16;
  private static final int jdField_false = 32;
  private static final int jdField_catch = 64;
  public static final int jdField_goto = 8;
  private static final int jdField_break = 4;
  private static final int jdField_char = 2;
  private static final int[] jdField_true;
  private static final int jdField_case = 128;
  private static final int jdField_for; public static final int jdField_long; public static final int jdField_int = 32768; public static final int jdField_super; public static final int jdField_final; public static final int jdField_enum = Integer.MIN_VALUE; public static final int jdField_else;
  static { 1; int tmp8_7 = 1;tmp8_7;true = tmp8_7; int 
    

      tmp15_13 = 1;tmp15_13;int i = tmp15_13; int tmp20_19 = 1;tmp20_19; for (int j = tmp20_19; i < true.length;) {
      1; int tmp38_37 = 1; int tmp39_38 = tmp38_37;tmp39_38;j = tmp38_37 | tmp39_38;
      i[j] = (i++);tmpTernaryOp = i; continue;throw true;
    }
    


    int tmp63_62 = 1;tmp63_62;for = 8[tmp63_62]; int 
      tmp75_74 = 1;tmp75_74;long = 7[tmp75_74]; int 
    

      tmp87_86 = 1;tmp87_86;super = 16[tmp87_86]; int 
      tmp99_98 = 1;tmp99_98;final = 15[tmp99_98]; int 
    

      tmp111_110 = 1;tmp111_110;else = 31[tmp111_110];
    



    1; int tmp125_124 = 1;tmp125_124; int tmp130_129 = 1;tmp130_129; int tmp136_135 = 1;tmp136_135;tmp130_129['€'] = tmp136_135; int tmp141_140 = 1;tmp141_140; int tmp145_144 = 1; int tmp146_145 = tmp145_144;tmp146_145;tmp145_144[0] = tmp146_145; int tmp152_151 = 1;tmp152_151; int tmp158_157 = 1;tmp158_157;tmp152_151['‚'] = tmp158_157; int tmp164_163 = 1;tmp164_163; int tmp170_169 = 1;tmp170_169;tmp164_163['ƒ'] = tmp170_169; int tmp176_175 = 1;tmp176_175; int tmp182_181 = 1;tmp182_181;tmp176_175['„'] = tmp182_181; int tmp188_187 = 1;tmp188_187; int tmp194_193 = 1;tmp194_193;tmp188_187['…'] = tmp194_193; int tmp201_200 = 1;tmp201_200; int tmp207_206 = 1;tmp207_206;tmp201_200['†'] = tmp207_206; int tmp214_213 = 1;tmp214_213; int tmp220_219 = 1;tmp220_219;tmp214_213['‡'] = tmp220_219; int tmp227_226 = 1;tmp227_226; int tmp233_232 = 1;tmp233_232;tmp227_226['ˆ'] = tmp233_232; int tmp240_239 = 1;tmp240_239; int tmp246_245 = 1;tmp246_245;tmp240_239['‰'] = tmp246_245; int tmp253_252 = 1;tmp253_252; int tmp259_258 = 1;tmp259_258;tmp253_252['Š'] = tmp259_258; int tmp266_265 = 1;tmp266_265; int tmp272_271 = 1;tmp272_271;tmp266_265['‹'] = tmp272_271; int tmp279_278 = 1;tmp279_278; int tmp285_284 = 1;tmp285_284;tmp279_278['Œ'] = tmp285_284; int tmp292_291 = 1;tmp292_291; int tmp296_295 = 1;tmp296_295;tmp292_291[0] = tmp296_295; int tmp303_302 = 1;tmp303_302; int tmp309_308 = 1;tmp309_308;tmp303_302['Ž'] = tmp309_308; int tmp316_315 = 1;tmp316_315; int tmp320_319 = 1;tmp320_319;tmp316_315[0] = tmp320_319; int tmp327_326 = 1;tmp327_326; int tmp331_330 = 1;tmp331_330;tmp327_326[0] = tmp331_330; int tmp338_337 = 1;tmp338_337; int tmp344_343 = 1;tmp344_343;tmp338_337['‘'] = tmp344_343; int tmp351_350 = 1;tmp351_350; int tmp357_356 = 1;tmp357_356;tmp351_350['’'] = tmp357_356; int tmp364_363 = 1;tmp364_363; int tmp370_369 = 1;tmp370_369;tmp364_363['“'] = tmp370_369; int tmp377_376 = 1;tmp377_376; int tmp383_382 = 1;tmp383_382;tmp377_376['”'] = tmp383_382; int tmp390_389 = 1;tmp390_389; int tmp396_395 = 1;tmp396_395;tmp390_389['•'] = tmp396_395; int tmp403_402 = 1;tmp403_402; int tmp409_408 = 1;tmp409_408;tmp403_402['–'] = tmp409_408; int tmp416_415 = 1;tmp416_415; int tmp422_421 = 1;tmp422_421;tmp416_415['—'] = tmp422_421; int tmp429_428 = 1;tmp429_428; int tmp435_434 = 1;tmp435_434;tmp429_428['˜'] = tmp435_434; int tmp442_441 = 1;tmp442_441; int tmp448_447 = 1;tmp448_447;tmp442_441['™'] = tmp448_447; int tmp455_454 = 1;tmp455_454; int tmp461_460 = 1;tmp461_460;tmp455_454['š'] = tmp461_460; int tmp468_467 = 1;tmp468_467; int tmp474_473 = 1;tmp474_473;tmp468_467['›'] = tmp474_473; int tmp481_480 = 1;tmp481_480; int tmp487_486 = 1;tmp487_486;tmp481_480['œ'] = tmp487_486; int tmp494_493 = 1;tmp494_493; int tmp498_497 = 1;tmp498_497;tmp494_493[0] = tmp498_497; int tmp505_504 = 1;tmp505_504; int tmp511_510 = 1;tmp511_510;tmp505_504['ž'] = tmp511_510; int tmp518_517 = 1;tmp518_517; int tmp524_523 = 1;tmp524_523;tmp518_517['Ÿ'] = tmp524_523; } private static final long jdField_if = 4294967295L; private static final int jdField_null = 32767; private static final char[] jdField_byte = 31;
  
  private final byte[] jdField_new;
  
  private int jdField_void;
  

  public JagexStream(byte[] a)
  {
    jdField_new = a; int 
      tmp12_11 = 1;tmp12_11;0jdField_void = tmp12_11;
  }
  
  public int getLocation() {
    return jdField_void;
  }
  
  public int getLength() {
    return jdField_new.length;
  }
  
  public byte getByte() {
    int tmp3_2 = 1; int tmp4_3 = tmp3_2;tmp4_3;tmp3_2.jdMethod_this(tmp4_3); int 
      tmp17_14 = jdField_void; int tmp19_18 = 1; int tmp20_19 = tmp19_18;tmp20_19;1714jdField_void = (tmp19_18 + tmp20_19);return tmp17_14[a];
  }
  
  public void seek(int a) {
    jdField_void = a;
  }
  
  private int jdMethod_this() {
    return a.getLength() - a.getLocation();
  }
  
  private void jdMethod_this(int a) {
    if (!a.jdMethod_this(a)) {
      throw new BufferUnderflowException();
    }
  }
  
  private boolean jdMethod_this(int a)
  {
    if (a.jdMethod_this() >= a) { int tmp9_8 = 1; int tmp10_9 = tmp9_8;tmp10_9;return tmp10_9;throw tmp9_8; } int tmp16_15 = 1;tmp16_15;return tmp16_15;
  }
  
  public final int getUByte() {
    return a.getByte() & for;
  }
  
  public final int getUShort() {
    int tmp7_6 = 1;tmp7_6;return 8 << tmp7_6 | a.getUByte();
  }
  
  public final int getUInt24() {
    1; int tmp17_16 = 1;tmp17_16;return a.getUByte() | 8 << tmp17_16 | a.getUByte();
  }
  
  private long jdMethod_this() {
    return a.getInt() & 0xFFFFFFFF;
  }
  
  public final short getShort() {
    return (short)a.getUShort();
  }
  
  public final int getInt() {
    1;1; int tmp28_27 = 1;tmp28_27;return a.getUByte() | 8 << tmp28_27 | a.getUByte();
  }
  
  public final long getLong() {
    int tmp7_6 = 1;tmp7_6;return 32 << tmp7_6 | a.jdMethod_this();
  }
  
  public final int getReferenceTableSmart() {
    1; int tmp7_6 = 1;tmp7_6; int tmp11_10 = 1;tmp11_10;return 4.jdMethod_true(tmp7_6, 0, tmp11_10);
  }
  
  public final int getBigSmart() {
    int i = a.getUByte(); int 
      tmp7_6 = 1;tmp7_6;int j = tmp7_6;
    1; int tmp22_21 = 1;tmp22_21; if (128 != tmp22_21) {
      int tmp31_30 = 1;tmp31_30; int tmp35_34 = 1;tmp35_34;j = 2.jdMethod_this(tmp31_30, 0, tmp35_34); int 
        tmp46_45 = 1;tmp46_45; if (32767 == tmp46_45) {
        int tmp53_52 = 1;tmp53_52;return j = tmp53_52;throw -1;
      }
    } else {
      int tmp63_62 = 1;tmp63_62; int tmp67_66 = 1;tmp67_66;j = 4.jdMethod_this(tmp63_62, 0, tmp67_66);
    }
    return j;
  }
  
  public int readSmartB() {
    int i;
    int tmp13_12 = 1;tmp13_12; if (32767 > tmp13_12) {
      return i - 65536;throw (i = a.getShort() & 0xFFFF);
    }
    return i;
  }
  
  public final int getSmart() {
    1; int tmp6_5 = 1;tmp6_5; int tmp10_9 = 1; int tmp11_10 = tmp10_9;tmp11_10;return tmp10_9.jdMethod_true(tmp6_5, 0, tmp11_10);
  }
  
  public final int getSignedSmart() {
    1; int tmp6_5 = 1;tmp6_5; int tmp9_8 = 1; int tmp10_9 = tmp9_8; int tmp11_10 = tmp10_9;tmp11_10;return tmp10_9.jdMethod_true(tmp6_5, tmp9_8, tmp11_10);
  }
  
  public int getSmartMinusOne() {
    int tmp5_4 = 1; int tmp6_5 = tmp5_4;tmp6_5;return tmp5_4 - tmp6_5;
  }
  
  public int getSmartShort() {
    int i;
    int tmp13_12 = 1;tmp13_12; if (32767 > tmp13_12) {
      return i - 65536;throw (i = a.getShort() & 0xFFFF);
    }
    return i;
  }
  
  public final int getSmarts() {
    int tmp2_1 = 1;tmp2_1;int i = tmp2_1; int 
      tmp9_8 = 1;
    int j; for (tmp9_8;; tmpTernaryOp = j) { int tmp17_16 = 1;tmp17_16; if (32767 != tmp17_16) break;
      j = a.getSmart();i += j;
    }
    throw (j = tmp9_8);
    

    return i;
  }
  
  private int jdMethod_true(int a, int a, boolean a) {
    int i = a.getUByte(); int 
      tmp11_10 = 1;tmp11_10; int tmp18_17 = 1;tmp18_17; if (128 == tmp18_17) { tmpTernaryOp = a; break label29; throw (0x80 & tmp11_10); } label29: int j = a;
    return a.jdMethod_this(i, j, a);
  }
  
  private int jdMethod_this(int a, int a, boolean a) {
    int tmp5_4 = 1;tmp5_4;a = 0xFF7F & tmp5_4; int 
      tmp11_9 = 1;
    int i; for (tmp11_9; (i = tmp11_9) < a;) {
      int tmp24_23 = 1;tmp24_23;a = a | (i++).getUByte();tmpTernaryOp = i; continue;throw (8 << tmp24_23);
    }
    if (a != 0) {
      1; int tmp55_53 = 1;tmp55_53; int tmp60_59 = 1;tmp60_59;a = a - (8 * tmp55_53 << 2 - tmp60_59);
    }
    return a;
  }
  
  protected final int jdMethod_this(int a, boolean a) {
    return a.jdMethod_true(a.getUByte(), a, a);
  }
  
  public byte[] getAllBytes() {
    return jdField_new;
  }
  
  public final byte[] getBytes(byte[] a) {
    int tmp3_2 = 1;tmp3_2; byte[] tmp6_5 = a;return 0.jdMethod_this(tmp6_5, tmp3_2, tmp6_5.length);
  }
  
  private byte[] jdMethod_this(byte[] a, int a, int a) {
    int tmp2_1 = a;a.jdMethod_this(tmp2_1);
    a = tmp2_1 + a;
    while ((a = a) < a) {
      a[a.getByte()] = (a++);tmpTernaryOp = a; continue;throw a;
    }
    return a;
  }
  
  public final String getString() {
    StringBuilder localStringBuilder = new StringBuilder();
    int i;
    while ((i = a.getUByte()) != 0) {
      int tmp22_21 = 1;tmp22_21; if (128 >= tmp22_21) { int tmp32_31 = 1;tmp32_31; if (160 < tmp32_31) {
          int tmp45_44 = 1;tmp45_44;
          int j; if ((j = i[(128 - tmp45_44)]) == 0) {
            int tmp57_56 = 1;tmp57_56;j = tmp57_56;
          }
          i = j;
        } }
      localStringBuilder.append((char)i);tmpTernaryOp = a; continue;throw 63;
    }
    return localStringBuilder.toString();
  }
  
  public final String getJagString() {
    if (a.getUByte() != 0) {
      throw new RuntimeException();
    }
    return a.getString();
  }
  
  public final void reset() {
    int tmp3_2 = 1;tmp3_2;0.seek(tmp3_2);
  }
}
