package org.powerbot.bot;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class InputSimulator extends org.powerbot.script.Input
{
  private final AbstractBot jdField_break;
  private final AtomicBoolean jdField_char;
  private final AtomicBoolean[] jdField_true;
  private final AtomicInteger jdField_case;
  private final AtomicInteger jdField_for;
  private final AtomicInteger jdField_long;
  private final AtomicInteger jdField_int;
  private final AtomicInteger jdField_super;
  private final java.util.concurrent.atomic.AtomicLong jdField_final;
  private final java.util.concurrent.atomic.AtomicLong jdField_enum;
  private final Point[] jdField_else;
  public final Queue<java.awt.AWTEvent> jdField_if;
  private static final java.lang.reflect.Method jdField_null;
  private static final Field jdField_byte;
  private static final Field jdField_new;
  private static final java.util.Map<String, Integer> jdField_void;
  
  static
  {
    int tmp8_7 = 1;tmp8_7;'Ā'.<init>(tmp8_7);void = new java/util/HashMap;
    

    java.lang.reflect.Method localMethod = null;
    Field localField1;
    try { int tmp29_27 = 1;tmp29_27; int tmp35_34 = 1;tmp35_34; int tmp37_35 = tmp35_34; int tmp40_39 = 1;tmp40_39;0[tmp40_39] = Integer.TYPE;localMethod = new Class[tmp29_27].getDeclaredMethod(tmp37_35, tmp37_35);
    }
    catch (NoSuchMethodException localNoSuchMethodException) {
      null = localMethod;
      
      localField1 = null;
      try {
        localField1 = KeyEvent.class.getDeclaredField(org.powerbot.script.Calculations.jdMethod_this("t\035e\000\001t\001Z\000h&~\001t"));
      }
      catch (NoSuchFieldException localNoSuchFieldException2) {
        new = localField1;
        
        Field localField2 = null;
        try {
          localField2 = java.awt.event.InputEvent.class.getDeclaredField(org.powerbot.misc.NUl.jdMethod_this("f\016t\b"));
        }
        catch (NoSuchFieldException localNoSuchFieldException1) {}
        byte = localField2;
        
        Field[] arrayOfField;
        int i = (arrayOfField = KeyEvent.class.getFields()).length; int tmp120_119 = 1; int j; for (tmp120_119; (j = tmp120_119) < i; tmpTernaryOp = j) { Field localField3 = arrayOfField[j];
          int k = org.powerbot.script.Calculations.jdMethod_this("G.N").length();
          



          void.put(localField3.getName().substring(k), Integer.valueOf(localField3.getInt(null)));j++;
        }
      }
      throw localField1;
    }
    throw localMethod;
  }
  



























  public InputSimulator(AbstractBot a)
  {
    jdField_break = a;
    
    a; int tmp21_20 = 1;tmp21_20;0.<init>(tmp21_20);jdField_char = a;
    1; int tmp36_35 = 1;tmp36_35; int tmp41_40 = 1;tmp41_40;0[tmp41_40] = null; int tmp47_46 = 1; int tmp48_47 = tmp47_46;tmp48_47; AtomicBoolean tmp53_50 = new java/util/concurrent/atomic/AtomicBoolean; int tmp56_55 = 1;tmp56_55;0.<init>(tmp56_55);tmp48_47[tmp53_50] = tmp53_50; int tmp65_64 = 1;tmp65_64; AtomicBoolean tmp70_67 = new java/util/concurrent/atomic/AtomicBoolean; int tmp73_72 = 1;tmp73_72;0.<init>(tmp73_72);tmp65_64[tmp70_67] = tmp70_67; int tmp82_81 = 1;tmp82_81; AtomicBoolean tmp87_84 = new java/util/concurrent/atomic/AtomicBoolean; int tmp90_89 = 1;tmp90_89;0.<init>(tmp90_89);tmp82_81[tmp87_84] = tmp87_84;2jdField_true = 3;
    a; int tmp112_111 = 1;tmp112_111;0.<init>(tmp112_111);jdField_case = a;
    a; int tmp130_129 = 1;tmp130_129;0.<init>(tmp130_129);jdField_for = a;
    a; int tmp147_146 = 1;tmp147_146;0.<init>(tmp147_146);jdField_long = a;
    a; int tmp164_163 = 1;tmp164_163;0.<init>(tmp164_163);jdField_int = a;
    a;a.<init>(-1L);jdField_final = a;
    a = java.awt.Toolkit.getDefaultToolkit().getDesktopProperty(org.powerbot.misc.NUl.jdMethod_this("p\021eH|\023}\022x%}\017r\rX\be\003c\020p\n"));
    a; if ((a instanceof Integer)) { tmpTernaryOp = ((Integer)a).intValue(); break label229; throw a; } label229: a.<init>(500L); jdField_enum = new java/util/concurrent/atomic/AtomicLong;
    a; int tmp247_246 = 1;tmp247_246;0.<init>(tmp247_246);jdField_super = a;
    1; int tmp262_261 = 1;tmp262_261; int tmp267_266 = 1;tmp267_266;0[tmp267_266] = null; int tmp274_272 = 1;tmp274_272; Point tmp279_276 = new java/awt/Point; int tmp282_281 = 1;tmp282_281; int tmp286_285 = 1;tmp286_285;tmp282_281.<init>(-1, tmp286_285);tmp279_276[tmp279_276] = -1; int tmp295_294 = 1;tmp295_294; Point tmp300_297 = new java/awt/Point; int tmp303_302 = 1;tmp303_302; int tmp307_306 = 1;tmp307_306;tmp303_302.<init>(-1, tmp307_306);tmp300_297[tmp300_297] = -1; int tmp316_315 = 1;tmp316_315; Point tmp321_318 = new java/awt/Point; int tmp324_323 = 1;tmp324_323; int tmp328_327 = 1;tmp328_327;tmp324_323.<init>(-1, tmp328_327);tmp321_318[tmp321_318] = -1;3jdField_else = tmp316_315;
    a;a.<init>();jdField_if = a;
    


    if (((a = a.getComponent()) != null) && ((a = a.getMousePosition()) != null) && (a.getComponent().isFocusOwner()) && (a.getComponent().isShowing())) {
      int tmp396_395 = 1; int tmp397_396 = tmp396_395;tmp397_396;tmp396_395.set(tmp397_396);
      jdField_char.jdField_case.set(x);
      jdField_for.set(y);
    }
  }
  







  private void jdMethod_this(java.awt.AWTEvent a)
  {
    if ((a instanceof java.awt.event.InputEvent)) {
      jdField_if.offer(a);
    }
    java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(a);
  }
  













  public void processEvent(java.awt.AWTEvent a)
  {
    if ((a instanceof java.awt.event.MouseEvent)) {
      a = (java.awt.event.MouseEvent)a;
      jdField_case.set(a.getX());
      jdField_for.set(a.getY());
    }
  }
  
  public void blocking(boolean a)
  {
    a.blocking(a);
    ((org.powerbot.gui.coM1)jdField_break.chrome.jdField_null.get()).jdMethod_final();
  }
  
  public void keyboard(boolean a)
  {
    a.keyboard(a);
    ((org.powerbot.gui.coM1)jdField_break.chrome.jdField_null.get()).jdMethod_final();
  }
  
  public void focus()
  {
    Component localComponent;
    if (((localComponent = a.getComponent()) != null) && ((!localComponent.isFocusOwner()) || (!localComponent.isShowing()))) {
      int tmp33_32 = 1;tmp33_32; int tmp37_36 = 1;tmp37_36;'Ϭ'.<init>(tmp33_32, 0, tmp37_36, null);new java/awt/event/FocusEvent.jdMethod_this(localComponent); int 
        tmp50_49 = 1;tmp50_49;org.powerbot.script.Condition.sleep(tmp50_49);
    }
  }
  
  public void defocus()
  {
    Component localComponent;
    if (((localComponent = a.getComponent()) != null) && (localComponent.isFocusOwner()) && (localComponent.isShowing())) {
      a; int tmp39_38 = 1;tmp39_38; int tmp43_42 = 1;tmp43_42;'ϭ'.<init>(tmp39_38, 0, tmp43_42, null);a.jdMethod_this(localComponent); int 
        tmp53_52 = 1;tmp53_52;org.powerbot.script.Condition.sleep(tmp53_52);
    }
  }
  
  public Point getLocation()
  {
    return new Point(jdField_case.get(), jdField_for.get());
  }
  
  public Point getPressLocation()
  {
    return new Point(jdField_long.get(), jdField_int.get());
  }
  
  public long getPressWhen()
  {
    return jdField_final.get();
  }
  
  public boolean press(int a)
  {
    if ((localComponent = a.getComponent()) != null) { int tmp11_10 = 1; int tmp12_11 = tmp11_10;tmp12_11; if ((tmp11_10 >= tmp12_11) && (a < jdField_true.length)) {}
    } else { int tmp28_27 = 1;tmp28_27;return tmp28_27;throw 0;
    }
    if ((!jdField_char.get()) && (!a.jdMethod_this())) {
      a.defocus(); int 
        tmp55_54 = 1;tmp55_54;return tmp55_54;throw 0;
    }
    if (((!jdField_char.get()) && (!a.jdMethod_this())) || (jdField_true[a].get())) {
      int tmp90_89 = 1;tmp90_89;return tmp90_89;
    }
    int tmp98_97 = 1; int tmp99_98 = tmp98_97;tmp99_98;int i = a.jdMethod_this(tmp98_97, tmp99_98);
    int j = 
    
      jdField_case.get();int k = jdField_for.get();long l = System.currentTimeMillis(); int 
      tmp140_139 = 1; int tmp141_140 = tmp140_139;tmp141_140;tmp140_139.set(tmp141_140);
    if (l - jdField_final.get() <= jdField_enum.get()) {
      (jdField_super.get() == 0 ? jdField_super : jdField_super.getAndIncrement());
    }
    
    int tmp187_186 = 1;tmp187_186; int tmp205_204 = 1;tmp205_204;'ǵ'.<init>(tmp187_186, l, i, j, k, jdField_super.get(), 0, tmp205_204, a);Component localComponent = localComponent; int 
      tmp226_225 = 1; int tmp227_226 = tmp226_225;tmp227_226;tmp226_225.set(tmp227_226);
    jdField_true[a].jdField_else[a].move(j, k);
    jdField_long.set(j);
    jdField_int.set(k);
    jdField_final.set(l);a
      .focus();localComponent
      .jdMethod_this(a); int 
      tmp275_274 = 1;tmp275_274;return tmp275_274;
  }
  
  public boolean release(int a)
  {
    Component localComponent;
    if ((localComponent = a.getComponent()) != null) { int tmp11_10 = 1; int tmp12_11 = tmp11_10;tmp12_11; if ((tmp11_10 >= tmp12_11) && (a < jdField_true.length)) {}
    } else { int tmp28_27 = 1;tmp28_27;return tmp28_27;throw 0;
    }
    if (!jdField_true[a].get()) {
      int tmp46_45 = 1;tmp46_45;return tmp46_45;throw 0;
    }
    int tmp56_55 = 1;tmp56_55;int i = a.jdMethod_this(0, tmp56_55);
    int j = jdField_case.get();int k = jdField_for.get();
    long l;
    if ((l = System.currentTimeMillis()) - jdField_final.get() > jdField_enum.get()) {
      int tmp109_108 = 1;tmp109_108;0.set(tmp109_108);
    }
    int tmp123_122 = 1;tmp123_122; int tmp141_140 = 1;tmp141_140;'Ƕ'.<init>(tmp123_122, l, i, j, k, jdField_super.get(), 0, tmp141_140, a); int 
      tmp157_156 = 1;tmp157_156;0.set(tmp157_156);localComponent
      .jdMethod_this(jdField_true[a]);
    Point localPoint;
    if ((jdField_else[a].getLocation()).x == j) && (y == k)) {
      int tmp203_202 = 1;tmp203_202; int tmp221_220 = 1;tmp221_220;'Ǵ'.<init>(tmp203_202, l, i, j, k, jdField_super.get(), 0, tmp221_220, a);a = localComponent;
      a.jdMethod_this(a);
    }
    int tmp235_233 = 1;tmp235_233;return tmp235_233;
  }
  
  public boolean setLocation(Point a)
  {
    Component localComponent1;
    if ((localComponent1 = a.getComponent()) == null) {
      int tmp11_10 = 1;tmp11_10;return tmp11_10;throw 0;
    }
    Point tmp16_15 = a;a = 1615x;int i = 1615y;
    if ((a >= 0) && (i >= 0) && (a < localComponent1.getWidth()) && (i < localComponent1.getHeight())) { int tmp50_49 = 1; int tmp51_50 = tmp50_49;;; break label61; throw tmp50_49; } else { 1; } label61: int j = tmp59_58;
    int k = a.jdMethod_this(); int 
      tmp75_74 = 1;tmp75_74;0.set(tmp75_74);
    

    if (!a.jdMethod_this()) {
      int tmp111_110 = 1;tmp111_110; int tmp129_128 = 1;tmp129_128;'Ƿ'.<init>(tmp111_110, System.currentTimeMillis(), k, a, i, jdField_super.get(), 0, tmp129_128);
      jdField_case.set(a);
      jdField_for.set(i);a
        .jdMethod_this(localComponent2 = localComponent1);
    }
    a.jdMethod_this(a, i); int 
    
      tmp175_174 = 1;tmp175_174; int tmp193_192 = 1;tmp193_192;'Ǹ'.<init>(tmp175_174, System.currentTimeMillis(), k, a, i, jdField_super.get(), 0, tmp193_192);Component localComponent2 = localComponent1; int 
      tmp212_211 = 1; int tmp213_212 = tmp212_211;tmp213_212;tmp212_211.set(tmp213_212);
    jdField_char.jdField_case.set(a);
    jdField_for.set(i);localComponent2
      .jdMethod_this(a);a
      .jdMethod_this(a, i); int 
    

      tmp261_260 = 1;tmp261_260; int tmp279_278 = 1;tmp279_278;'ǹ'.<init>(tmp261_260, System.currentTimeMillis(), k, a, i, jdField_super.get(), 0, tmp279_278);localComponent2 = localComponent1; int 
      tmp299_298 = 1;tmp299_298;0.set(tmp299_298);
    jdField_char.jdField_case.set(a);
    jdField_for.set(i);localComponent2
      .jdMethod_this(a);a
      .jdMethod_this(a, i);
    
    a.jdMethod_this(a, i); int 
    
      tmp336_334 = 1;tmp336_334;return tmp336_334;
  }
  
  public boolean scroll(boolean a) {
    Component localComponent;
    if ((localComponent = a.getComponent()) == null) {
      int tmp11_10 = 1;tmp11_10;return tmp11_10;throw 0;
    }
    
    1;1; int tmp47_46 = 0; int tmp49_48 = 1;tmp49_48; int tmp53_52 = 1;tmp53_52; int tmp57_56 = 1;tmp57_56; int tmp60_59 = 1; int tmp61_60 = tmp60_59;tmp61_60; if (a != 0) { int tmp68_67 = 1; int tmp69_68 = tmp68_67;;; break label79; throw tmp68_67; } else { 1; } label79: jdField_case.get().<init>(jdField_for.get(), tmp47_46, tmp49_48, 0, tmp53_52, 0, tmp57_56, tmp60_59, tmp61_60, -1, tmp77_76); a = tmp47_46;
    a.jdMethod_this(a); int 
      tmp90_89 = 1;tmp90_89;return tmp90_89;
  }
  
  private int jdMethod_this() {
    int tmp3_2 = 1;tmp3_2; int tmp7_6 = 1;tmp7_6;return tmp3_2.jdMethod_this(0, tmp7_6);
  }
  
  private int jdMethod_this(int a, boolean a) {
    1; int tmp7_6 = 1;tmp7_6; int tmp12_11 = 1;tmp12_11; int tmp15_14 = 1; int tmp16_15 = tmp15_14;tmp16_15;tmp12_11[tmp15_14] = tmp16_15; int tmp21_20 = 1;tmp21_20; int tmp25_24 = 1; int tmp26_25 = tmp25_24;tmp26_25;tmp25_24[2] = tmp26_25; int tmp32_31 = 1;tmp32_31; int tmp36_35 = 1;tmp36_35;tmp32_31[3] = tmp36_35;int ? = 2;
    1; int tmp47_46 = 1;tmp47_46; int tmp52_51 = 1;tmp52_51; int tmp58_57 = 1;tmp58_57;tmp52_51['Ѐ'] = tmp58_57; int tmp63_62 = 1;tmp63_62; int tmp69_68 = 1; int tmp70_69 = tmp69_68;tmp70_69;tmp69_68['ࠀ'] = tmp70_69; int tmp76_75 = 1;tmp76_75; int tmp82_81 = 1;tmp82_81;tmp76_75['က'] = tmp82_81;int ? = 2;
    1; int tmp94_93 = 1;tmp94_93; int tmp99_98 = 1;tmp99_98; int tmp104_103 = 1;tmp104_103;tmp99_98[16] = tmp104_103; int tmp109_108 = 1;tmp109_108; int tmp114_113 = 1; int tmp115_114 = tmp114_113;tmp115_114;tmp114_113[8] = tmp115_114; int tmp121_120 = 1;tmp121_120; int tmp125_124 = 1;tmp125_124;tmp121_120[4] = tmp125_124;int ? = 2;
    1; int tmp137_136 = 1;tmp137_136; int tmp142_141 = 1;tmp142_141; int tmp146_145 = 1;tmp146_145;tmp142_141[0] = tmp146_145; int tmp151_150 = 1;tmp151_150; int tmp156_155 = 1; int tmp157_156 = tmp156_155;tmp157_156;tmp156_155[8] = tmp157_156; int tmp163_162 = 1;tmp163_162; int tmp167_166 = 1;tmp167_166;tmp163_162[4] = tmp167_166;int ? = 2; int 
      tmp174_173 = 1;tmp174_173;int i = tmp174_173; int 
      tmp180_179 = 1;
    int j; for (tmp180_179; (j = tmp180_179) < ?.length;) {
      int k = ?[j];
      if ((jdField_true[k].get()) || (a == k)) {
        if ((a != k) || (a != 0)) {
          tmpTernaryOp = (i |= ?[j]; break label251; throw 0;
        }
        

        i = i |= ?[j] | ?[j];
      }
      j++;tmpTernaryOp = j; continue;throw 0;
    }
    





    label251:
    





    return i;
  }
  
  private boolean jdMethod_this() {
    1; int tmp7_6 = 1;tmp7_6; int tmp12_11 = 1;tmp12_11; int tmp15_14 = 1; int tmp16_15 = tmp15_14;tmp16_15;tmp12_11[tmp15_14] = tmp16_15; int tmp21_20 = 1;tmp21_20; int tmp25_24 = 1; int tmp26_25 = tmp25_24;tmp26_25;tmp25_24[2] = tmp26_25; int tmp32_31 = 1;tmp32_31; int tmp36_35 = 1;tmp36_35;tmp32_31[3] = tmp36_35;
    int ?; int i = (? = 2).length; int tmp45_44 = 1; int j; for (tmp45_44; (j = tmp45_44) < i;) { int k = ?[j];
      if (jdField_true[k].get()) {
        int tmp72_71 = 1; int tmp73_72 = tmp72_71;tmp73_72;return tmp73_72;throw tmp72_71;
      }
      j++;tmpTernaryOp = j; continue;throw 0;
    }
    


    int tmp87_86 = 1;tmp87_86;return tmp87_86;
  }
  











































































  public boolean send(String a)
  {
    return a.jdMethod_this(a.jdMethod_this(a));
  }
  










  private void jdMethod_this(KeyEvent a)
  {
    a.focus();a
      .jdMethod_this(jdMethod_this(a));
  }
  
  private Queue<KeyEvent> jdMethod_this(String a) {
    java.util.LinkedList localLinkedList = new java.util.LinkedList(); int 
      tmp10_9 = 1;tmp10_9;int i = tmp10_9;
    StringBuilder localStringBuilder = new StringBuilder();
    
    1;
    int j; char c; switch (c = a.charAt(j))
    {
    case '{': 
      while (0 != 0) {} int tmp77_72 = 1; int tmp78_77 = tmp77_72;tmp78_77;i = tmp78_77;tmpTernaryOp = tmp77_72;
      break;throw 0;
    case '}': 
      int tmp87_86 = 1;tmp87_86;i = tmp87_86;
      if (localStringBuilder.length() != 0)
      {
        localStringBuilder = new StringBuilder();localLinkedList.add(localStringBuilder.toString());tmpTernaryOp = false;break;throw 0;
      }
      break;
    default: 
      if (i != 0) {
        localStringBuilder.append(c);
      } else {
        localLinkedList.add(String.valueOf(c));
      }
      break;
    }
    j++;
    





















    return a.jdMethod_this(localLinkedList);
  }
  
  private Queue<KeyEvent> jdMethod_this(Queue<String> a) {
    Component localComponent = a.getComponent();
    java.util.LinkedList localLinkedList = new java.util.LinkedList();
    int j;
    label624:
    do { String str1; char c1; for (;;) { str1 = (String)a.poll();
        
        1;
        1;
        tmp59_58 = 1;tmp59_58; if (13 != tmp59_58) break; tmpTernaryOp = a; }
      throw (c1 = 0.charAt(tmp48_47));
      
      int i;
      if ((i = jdMethod_this(c1)) == 0) {
        throw new IllegalArgumentException(c1 + org.powerbot.script.Calculations.jdMethod_this("8"));
      }
      
      tmp137_136 = 1;tmp137_136;tmp142_141 = 1;tmp142_141;
      tmp161_159 = c1;tmp170_169 = 1;tmp170_169;jdMethod_this(localComponent, i, tmp161_159, String.valueOf(tmp161_159).toLowerCase(), 0.charAt(tmp170_169));
      while (!'Ƒ'.add(jdMethod_this(tmp137_136, 16, tmp142_141, 65535)).isEmpty()) {
        String str2 = (String)a.peek();
        
        tmp203_202 = 1;tmp204_203 = tmp203_202;tmp204_203; if (tmp203_202 == tmp204_203) { tmp213_212 = 1;tmp213_212; char c2; if (Character.isUpperCase(c2 = 0.charAt(tmp213_212))) {
            int k;
            if ((k = jdMethod_this(c2)) != 0) {
              tmp239_238 = a;
              tmp251_249 = c2;tmp260_259 = 1;tmp260_259;jdMethod_this(localComponent, k, tmp251_249, String.valueOf(tmp251_249).toLowerCase(), 0.charAt(tmp260_259));tmpTernaryOp = tmp239_238.poll();
              continue;
              
              throw tmp239_238;
            }
          } } }
      tmp282_281 = 1;tmp282_281;tmp287_286 = 1;tmp287_286;'ƒ'.add(jdMethod_this(tmp282_281, 16, tmp287_286, 65535));
      
      tmp310_308 = c1;jdMethod_this(localLinkedList, localComponent, i, tmp310_308, tmp310_308);
      



      if (str1.startsWith(org.powerbot.misc.NUl.jdMethod_this("0Z9"))) {
        str1 = str1.substring(org.powerbot.script.Calculations.jdMethod_this("G.N").length());
      }
      tmp357_356 = 1;tmp357_356;String[] arrayOfString = org.powerbot.misc.NUl.jdMethod_this("F").split(2, tmp357_356);
      tmp371_370 = 1;tmp371_370;tmp376_375 = 1;tmp376_375;
      if ((j = ((Integer)0[tmp371_370].getOrDefault(0, Integer.valueOf(tmp376_375))).intValue()) == 0) {
        throw new IllegalArgumentException(org.powerbot.script.Calculations.jdMethod_this("x\013g\004}\fuEz\000h6e\027x\013v"));
      }
      1;tmp419_418 = 1;tmp419_418;tmp424_423 = 1;tmp424_423;tmp428_427 = 1;tmp428_427;tmp424_423[0] = tmp428_427;tmp433_432 = 1;tmp433_432;tmp437_436 = 1;tmp438_437 = tmp437_436;tmp438_437;tmp437_436[0] = tmp438_437;int ? = tmp433_432;
      tmp447_446 = 1;tmp448_447 = tmp447_446;tmp448_447; if (tmp447_446 > tmp448_447) { tmp456_455 = 1;tmp457_456 = tmp456_455;tmp457_456; if (tmp456_455[tmp457_456] != null) { 1;
          1;
          String str3;
          tmp536_535 = 1;tmp536_535;tmp539_538 = 1;tmp540_539 = tmp539_538;tmp540_539;tmp536_535[tmp539_538] = tmp540_539;
          if ((!str3.equals(org.powerbot.script.Calculations.jdMethod_this("\020a"))) && (!str3.equals(org.powerbot.misc.NUl.jdMethod_this("\024t\nt\007b\003"))) && (!str3.equals(org.powerbot.script.Calculations.jdMethod_this("\027t\tt\004b\000u")))) break label624;
          1;tmp594_593 = 1;tmp595_594 = tmp594_593;tmp596_595 = tmp595_594;tmp596_595;tmp595_594[tmp594_593] = tmp596_595;
        }
      }
      tmp609_607 = 1;tmp609_607;tmp612_611 = 1;tmp613_612 = tmp612_611;tmp613_612;tmp609_607[tmp612_611] = tmp613_612;
      tmp617_616 = 1;tmp617_616;tmp620_619 = 1;tmp621_620 = tmp620_619;(!tmp466_465[tmp467_465].isEmpty() ? tmp591_590 : ((str3 = tmp479_478[tmp480_478].trim().toLowerCase()).equals(org.powerbot.misc.NUl.jdMethod_this("u\tf\b"))) || (str3.equals(org.powerbot.script.Calculations.jdMethod_this("a\027t\026b"))) || (str3.equals(org.powerbot.misc.NUl.jdMethod_this("\026c\003b\025t\002"))) ? 0 : tmp621_620);tmp617_616[tmp620_619] = tmp621_620;
      
      tmp628_627 = 1;tmp628_627; if (0[tmp628_627] != 0) {
        tmp640_639 = 1;tmp640_639;localComponent.add(jdMethod_this(401, tmp640_639, j, 65535));
      }
      1; } while (tmp659_658[tmp660_658] == 0);
    int tmp672_671 = 1;tmp672_671;localComponent.add(jdMethod_this(402, tmp672_671, j, 65535));
    



    return localLinkedList;
  }
  
  private static void jdMethod_this(java.util.Collection<KeyEvent> a, Component a, int a, char a, char a) {
    1;
    1;1; int 
      tmp46_45 = 1;tmp46_45;a.add(jdMethod_this(402, tmp46_45, a, a));
  }
  
  private static KeyEvent jdMethod_this(Component a, int a, int a, char a) {
    int tmp2_0 = 1;tmp2_0;int i = tmp2_0; int 
      tmp10_9 = 1;tmp10_9; if (16 >= tmp10_9) { int tmp19_18 = 1;tmp19_18; if (18 <= tmp19_18) {
        int tmp26_25 = 1;tmp26_25;i = tmp26_25;
      } }
    int tmp35_34 = 1;tmp35_34; if (400 == tmp35_34) {
      int tmp42_41 = 1;tmp42_41;i = tmp42_41;
    }
    int tmp57_56 = 1;tmp57_56;a.<init>(a, System.currentTimeMillis(), 0, tmp57_56, a, a, i);a = new java/awt/event/KeyEvent;
    
    long l;
    if ((new != null) && ((l = jdMethod_this(a)) != 0L)) {
      try {
        a = new.isAccessible(); int 
          tmp97_96 = 1; int tmp98_97 = tmp97_96;tmp98_97;tmp97_96.setAccessible(tmp98_97);
        new.setLong(a, l);
        new.setAccessible(a);
        
        return a; } catch (IllegalAccessException a) {} throw new;
    }
    
    return a;
  }
  
  private static KeyEvent jdMethod_this(KeyEvent a) {
    if (byte != null) {
      try {
        boolean bool = byte.isAccessible(); int 
          tmp17_16 = 1; int tmp18_17 = tmp17_16;tmp18_17;tmp17_16.setAccessible(tmp18_17);
        byte.setLong(a, System.currentTimeMillis());
        byte.setAccessible(bool);
        
        return a; } catch (IllegalAccessException localIllegalAccessException1) {} throw byte;
    }
    return a;
  }
  
  public java.awt.Dimension getComponentSize() {
    Component localComponent;
    if ((localComponent = a.getComponent()) == null) { int tmp15_14 = 1;tmp15_14; int tmp19_18 = 1;tmp19_18;tmp15_14.<init>(0, tmp19_18);return 0;throw new java/awt/Dimension; } return localComponent.getSize();
  }
  
  /* Error */
  public Component getComponent()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 40	org/powerbot/bot/InputSimulator:break	Lorg/powerbot/bot/AbstractBot;
    //   4: getfield 154	org/powerbot/bot/AbstractBot:chrome	Lorg/powerbot/gui/BotChrome;
    //   7: ifnonnull +6 -> 13
    //   10: aconst_null
    //   11: areturn
    //   12: athrow
    //   13: aload_0
    //   14: getfield 40	org/powerbot/bot/InputSimulator:break	Lorg/powerbot/bot/AbstractBot;
    //   17: getfield 154	org/powerbot/bot/AbstractBot:chrome	Lorg/powerbot/gui/BotChrome;
    //   20: getfield 160	org/powerbot/gui/BotChrome:target	Ljava/util/concurrent/atomic/AtomicReference;
    //   23: invokevirtual 166	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
    //   26: checkcast 168	java/applet/Applet
    //   29: invokevirtual 172	java/applet/Applet:getComponents	()[Ljava/awt/Component;
    //   32: dup
    //   33: astore_1
    //   34: arraylength
    //   35: ifne +6 -> 41
    //   38: aconst_null
    //   39: areturn
    //   40: athrow
    //   41: aload_1
    //   42: iconst_0
    //   43: iconst_1
    //   44: dup
    //   45: pop2
    //   46: aaload
    //   47: areturn
    // Line number table:
    //   Java source line #96	-> byte code offset #0
    //   Java source line #97	-> byte code offset #10
    //   Java source line #99	-> byte code offset #13
    //   Java source line #100	-> byte code offset #34
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	a	InputSimulator
  }
  
  /* Error */
  public void redirect(java.awt.AWTEvent a)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 117	org/powerbot/bot/InputSimulator:getComponent	()Ljava/awt/Component;
    //   4: dup
    //   5: astore_2
    //   6: ifnonnull +5 -> 11
    //   9: return
    //   10: athrow
    //   11: aload_1
    //   12: instanceof 196
    //   15: ifeq +28 -> 43
    //   18: aload_2
    //   19: invokevirtual 200	java/awt/Component:getParent	()Ljava/awt/Container;
    //   22: invokevirtual 205	java/awt/Container:getLocation	()Ljava/awt/Point;
    //   25: astore_3
    //   26: aload_1
    //   27: checkcast 196	java/awt/event/MouseEvent
    //   30: aload_3
    //   31: getfield 137	java/awt/Point:x	I
    //   34: ineg
    //   35: aload_3
    //   36: getfield 142	java/awt/Point:y	I
    //   39: ineg
    //   40: invokevirtual 208	java/awt/event/MouseEvent:translatePoint	(II)V
    //   43: aload_1
    //   44: aload_2
    //   45: invokevirtual 214	java/awt/AWTEvent:setSource	(Ljava/lang/Object;)V
    //   48: invokestatic 77	java/awt/Toolkit:getDefaultToolkit	()Ljava/awt/Toolkit;
    //   51: invokevirtual 187	java/awt/Toolkit:getSystemEventQueue	()Ljava/awt/EventQueue;
    //   54: aload_1
    //   55: invokevirtual 192	java/awt/EventQueue:postEvent	(Ljava/awt/AWTEvent;)V
    //   58: return
    // Line number table:
    //   Java source line #111	-> byte code offset #0
    //   Java source line #112	-> byte code offset #6
    //   Java source line #113	-> byte code offset #9
    //   Java source line #116	-> byte code offset #11
    //   Java source line #117	-> byte code offset #18
    //   Java source line #118	-> byte code offset #26
    //   Java source line #120	-> byte code offset #43
    //   Java source line #121	-> byte code offset #48
    //   Java source line #122	-> byte code offset #58
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	a	InputSimulator
    //   0	59	1	a	java.awt.AWTEvent
  }
  
  /* Error */
  private void jdMethod_this(int a, int a)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 117	org/powerbot/bot/InputSimulator:getComponent	()Ljava/awt/Component;
    //   4: dup
    //   5: astore_3
    //   6: ifnull +10 -> 16
    //   9: aload_0
    //   10: invokespecial 261	org/powerbot/bot/InputSimulator:this	()Z
    //   13: ifne +5 -> 18
    //   16: return
    //   17: athrow
    //   18: aload_0
    //   19: dup
    //   20: dup_x1
    //   21: dup2
    //   22: getfield 101	org/powerbot/bot/InputSimulator:super	Ljava/util/concurrent/atomic/AtomicInteger;
    //   25: iconst_0
    //   26: iconst_1
    //   27: dup
    //   28: pop2
    //   29: invokevirtual 139	java/util/concurrent/atomic/AtomicInteger:set	(I)V
    //   32: invokespecial 296	org/powerbot/bot/InputSimulator:this	()I
    //   35: istore 4
    //   37: new 196	java/awt/event/MouseEvent
    //   40: dup
    //   41: aload_3
    //   42: sipush 506
    //   45: iconst_1
    //   46: dup
    //   47: pop2
    //   48: invokestatic 271	java/lang/System:currentTimeMillis	()J
    //   51: iload 4
    //   53: iload_1
    //   54: iload_2
    //   55: aload_0
    //   56: getfield 101	org/powerbot/bot/InputSimulator:super	Ljava/util/concurrent/atomic/AtomicInteger;
    //   59: invokevirtual 250	java/util/concurrent/atomic/AtomicInteger:get	()I
    //   62: iconst_0
    //   63: iconst_1
    //   64: dup
    //   65: pop2
    //   66: invokespecial 299	java/awt/event/MouseEvent:<init>	(Ljava/awt/Component;IJIIIIZ)V
    //   69: astore_3
    //   70: getfield 56	org/powerbot/bot/InputSimulator:case	Ljava/util/concurrent/atomic/AtomicInteger;
    //   73: iload_1
    //   74: invokevirtual 139	java/util/concurrent/atomic/AtomicInteger:set	(I)V
    //   77: getfield 58	org/powerbot/bot/InputSimulator:for	Ljava/util/concurrent/atomic/AtomicInteger;
    //   80: iload_2
    //   81: invokevirtual 139	java/util/concurrent/atomic/AtomicInteger:set	(I)V
    //   84: aload_3
    //   85: invokespecial 241	org/powerbot/bot/InputSimulator:this	(Ljava/awt/AWTEvent;)V
    //   88: return
    // Line number table:
    //   Java source line #325	-> byte code offset #0
    //   Java source line #326	-> byte code offset #6
    //   Java source line #327	-> byte code offset #16
    //   Java source line #329	-> byte code offset #18
    //   Java source line #330	-> byte code offset #32
    //   Java source line #331	-> byte code offset #37
    //   Java source line #332	-> byte code offset #70
    //   Java source line #333	-> byte code offset #77
    //   Java source line #334	-> byte code offset #84
    //   Java source line #335	-> byte code offset #88
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	a	InputSimulator
    //   0	89	1	a	int
    //   0	89	2	a	int
  }
  
  /* Error */
  private static int jdMethod_this(char a)
  {
    // Byte code:
    //   0: iload_0
    //   1: bipush 65
    //   3: iconst_1
    //   4: dup
    //   5: pop2
    //   6: if_icmplt +12 -> 18
    //   9: iload_0
    //   10: bipush 90
    //   12: iconst_1
    //   13: dup
    //   14: pop2
    //   15: if_icmple +38 -> 53
    //   18: iload_0
    //   19: bipush 48
    //   21: iconst_1
    //   22: dup
    //   23: pop2
    //   24: if_icmplt +12 -> 36
    //   27: iload_0
    //   28: bipush 57
    //   30: iconst_1
    //   31: dup
    //   32: pop2
    //   33: if_icmple +20 -> 53
    //   36: ldc_w 318
    //   39: invokestatic 321	org/powerbot/script/Calculations:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   42: iload_0
    //   43: invokevirtual 326	java/lang/String:indexOf	(I)I
    //   46: iconst_m1
    //   47: iconst_1
    //   48: dup
    //   49: pop2
    //   50: if_icmpeq +6 -> 56
    //   53: iload_0
    //   54: ireturn
    //   55: athrow
    //   56: iload_0
    //   57: bipush 97
    //   59: iconst_1
    //   60: dup
    //   61: pop2
    //   62: if_icmplt +18 -> 80
    //   65: iload_0
    //   66: bipush 122
    //   68: iconst_1
    //   69: dup
    //   70: pop2
    //   71: if_icmpgt +9 -> 80
    //   74: iload_0
    //   75: invokestatic 332	java/lang/Character:toUpperCase	(C)C
    //   78: ireturn
    //   79: athrow
    //   80: getstatic 334	org/powerbot/bot/InputSimulator:null	Ljava/lang/reflect/Method;
    //   83: ifnull +41 -> 124
    //   86: getstatic 334	org/powerbot/bot/InputSimulator:null	Ljava/lang/reflect/Method;
    //   89: aconst_null
    //   90: iconst_1
    //   91: dup
    //   92: dup
    //   93: pop2
    //   94: anewarray 148	java/lang/Object
    //   97: iconst_1
    //   98: dup
    //   99: pop2
    //   100: dup
    //   101: iconst_0
    //   102: iconst_1
    //   103: dup
    //   104: pop2
    //   105: iload_0
    //   106: invokestatic 338	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   109: aastore
    //   110: invokevirtual 344	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   113: checkcast 91	java/lang/Integer
    //   116: invokevirtual 95	java/lang/Integer:intValue	()I
    //   119: ireturn
    //   120: astore_1
    //   121: goto +556 -> 677
    //   124: iload_0
    //   125: tableswitch	default:+552->677, 32:+404->529, 33:+414->539, 34:+447->572, 35:+552->677, 36:+467->592, 37:+552->677, 38:+552->677, 39:+440->565, 40:+481->606, 41:+488->613, 42:+495->620, 43:+460->585, 44:+552->677, 45:+454->579, 46:+398->523, 47:+421->546, 48:+552->677, 49:+552->677, 50:+552->677, 51:+552->677, 52:+552->677, 53:+552->677, 54:+552->677, 55:+552->677, 56:+552->677, 57:+552->677, 58:+508->633, 59:+515->640, 60:+521->646, 61:+502->627, 62:+528->653, 63:+552->677, 64:+391->516, 65:+552->677, 66:+552->677, 67:+552->677, 68:+552->677, 69:+552->677, 70:+552->677, 71:+552->677, 72:+552->677, 73:+552->677, 74:+552->677, 75:+552->677, 76:+552->677, 77:+552->677, 78:+552->677, 79:+552->677, 80:+552->677, 81:+552->677, 82:+552->677, 83:+552->677, 84:+552->677, 85:+552->677, 86:+552->677, 87:+552->677, 88:+552->677, 89:+552->677, 90:+552->677, 91:+552->677, 92:+427->552, 93:+552->677, 94:+552->677, 95:+474->599, 96:+433->558, 97:+552->677, 98:+552->677, 99:+552->677, 100:+552->677, 101:+552->677, 102:+552->677, 103:+552->677, 104:+552->677, 105:+552->677, 106:+552->677, 107:+552->677, 108:+552->677, 109:+552->677, 110:+552->677, 111:+552->677, 112:+552->677, 113:+552->677, 114:+552->677, 115:+552->677, 116:+552->677, 117:+552->677, 118:+552->677, 119:+552->677, 120:+552->677, 121:+552->677, 122:+552->677, 123:+535->660, 124:+552->677, 125:+545->670
    //   516: sipush 512
    //   519: iconst_1
    //   520: dup
    //   521: pop2
    //   522: ireturn
    //   523: bipush 46
    //   525: iconst_1
    //   526: dup
    //   527: pop2
    //   528: ireturn
    //   529: bipush 32
    //   531: iconst_0
    //   532: ifne +135 -> 667
    //   535: iconst_1
    //   536: dup
    //   537: pop2
    //   538: ireturn
    //   539: sipush 517
    //   542: iconst_1
    //   543: dup
    //   544: pop2
    //   545: ireturn
    //   546: bipush 47
    //   548: iconst_1
    //   549: dup
    //   550: pop2
    //   551: ireturn
    //   552: bipush 92
    //   554: iconst_1
    //   555: dup
    //   556: pop2
    //   557: ireturn
    //   558: sipush 192
    //   561: iconst_1
    //   562: dup
    //   563: pop2
    //   564: ireturn
    //   565: sipush 222
    //   568: iconst_1
    //   569: dup
    //   570: pop2
    //   571: ireturn
    //   572: sipush 152
    //   575: iconst_1
    //   576: dup
    //   577: pop2
    //   578: ireturn
    //   579: bipush 45
    //   581: iconst_1
    //   582: dup
    //   583: pop2
    //   584: ireturn
    //   585: sipush 521
    //   588: iconst_1
    //   589: dup
    //   590: pop2
    //   591: ireturn
    //   592: sipush 515
    //   595: iconst_1
    //   596: dup
    //   597: pop2
    //   598: ireturn
    //   599: sipush 523
    //   602: iconst_1
    //   603: dup
    //   604: pop2
    //   605: ireturn
    //   606: sipush 519
    //   609: iconst_1
    //   610: dup
    //   611: pop2
    //   612: ireturn
    //   613: sipush 522
    //   616: iconst_1
    //   617: dup
    //   618: pop2
    //   619: ireturn
    //   620: sipush 151
    //   623: iconst_1
    //   624: dup
    //   625: pop2
    //   626: ireturn
    //   627: bipush 61
    //   629: iconst_1
    //   630: dup
    //   631: pop2
    //   632: ireturn
    //   633: sipush 513
    //   636: iconst_1
    //   637: dup
    //   638: pop2
    //   639: ireturn
    //   640: bipush 59
    //   642: iconst_1
    //   643: dup
    //   644: pop2
    //   645: ireturn
    //   646: sipush 153
    //   649: iconst_1
    //   650: dup
    //   651: pop2
    //   652: ireturn
    //   653: sipush 160
    //   656: iconst_1
    //   657: dup
    //   658: pop2
    //   659: ireturn
    //   660: sipush 161
    //   663: iconst_1
    //   664: dup
    //   665: pop2
    //   666: ireturn
    //   667: goto -136 -> 531
    //   670: sipush 162
    //   673: iconst_1
    //   674: dup
    //   675: pop2
    //   676: ireturn
    //   677: iconst_0
    //   678: iconst_1
    //   679: dup
    //   680: pop2
    //   681: ireturn
    // Line number table:
    //   Java source line #338	-> byte code offset #0
    //   Java source line #339	-> byte code offset #53
    //   Java source line #340	-> byte code offset #56
    //   Java source line #341	-> byte code offset #74
    //   Java source line #342	-> byte code offset #80
    //   Java source line #344	-> byte code offset #86
    //   Java source line #345	-> byte code offset #120
    //   Java source line #346	-> byte code offset #121
    //   Java source line #348	-> byte code offset #124
    //   Java source line #350	-> byte code offset #516
    //   Java source line #352	-> byte code offset #523
    //   Java source line #354	-> byte code offset #529
    //   Java source line #356	-> byte code offset #539
    //   Java source line #358	-> byte code offset #546
    //   Java source line #360	-> byte code offset #552
    //   Java source line #362	-> byte code offset #558
    //   Java source line #364	-> byte code offset #565
    //   Java source line #366	-> byte code offset #572
    //   Java source line #368	-> byte code offset #579
    //   Java source line #370	-> byte code offset #585
    //   Java source line #372	-> byte code offset #592
    //   Java source line #374	-> byte code offset #599
    //   Java source line #376	-> byte code offset #606
    //   Java source line #378	-> byte code offset #613
    //   Java source line #380	-> byte code offset #620
    //   Java source line #382	-> byte code offset #627
    //   Java source line #384	-> byte code offset #633
    //   Java source line #386	-> byte code offset #640
    //   Java source line #388	-> byte code offset #646
    //   Java source line #390	-> byte code offset #653
    //   Java source line #392	-> byte code offset #660
    //   Java source line #394	-> byte code offset #670
    //   Java source line #397	-> byte code offset #677
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	682	0	a	int
    //   120	1	1	localInvocationTargetException	java.lang.reflect.InvocationTargetException
    // Exception table:
    //   from	to	target	type
    //   86	119	120	java/lang/reflect/InvocationTargetException
    //   86	119	120	java/lang/IllegalAccessException
  }
  
  /* Error */
  private boolean jdMethod_this(Queue<KeyEvent> a)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokeinterface 358 1 0
    //   6: ifne +66 -> 72
    //   9: aload_0
    //   10: aload_1
    //   11: invokeinterface 361 1 0
    //   16: checkcast 363	java/awt/event/KeyEvent
    //   19: invokespecial 366	org/powerbot/bot/InputSimulator:this	(Ljava/awt/event/KeyEvent;)V
    //   22: aload_1
    //   23: invokeinterface 369 1 0
    //   28: checkcast 363	java/awt/event/KeyEvent
    //   31: dup
    //   32: astore_2
    //   33: ifnull -33 -> 0
    //   36: aload_2
    //   37: invokevirtual 372	java/awt/event/KeyEvent:getID	()I
    //   40: sipush 400
    //   43: iconst_1
    //   44: dup
    //   45: pop2
    //   46: if_icmpeq -46 -> 0
    //   49: invokestatic 377	org/powerbot/script/Random:getDelay	()I
    //   52: i2d
    //   53: dconst_1
    //   54: invokestatic 381	org/powerbot/script/Random:nextDouble	()D
    //   57: ldc2_w 382
    //   60: ddiv
    //   61: dadd
    //   62: dmul
    //   63: d2i
    //   64: invokestatic 247	org/powerbot/script/Condition:sleep	(I)I
    //   67: pop
    //   68: goto -68 -> 0
    //   71: athrow
    //   72: iconst_1
    //   73: dup
    //   74: dup
    //   75: pop2
    //   76: ireturn
    // Line number table:
    //   Java source line #405	-> byte code offset #0
    //   Java source line #406	-> byte code offset #9
    //   Java source line #407	-> byte code offset #22
    //   Java source line #408	-> byte code offset #33
    //   Java source line #409	-> byte code offset #49
    //   Java source line #411	-> byte code offset #68
    //   Java source line #412	-> byte code offset #72
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	a	InputSimulator
    //   0	77	1	a	Queue
  }
}
