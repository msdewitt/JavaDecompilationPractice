package org.powerbot.bot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import org.powerbot.script.Vector3;

public final class MouseSpline
{
  private final java.util.Random jdField_void;
  
  public MouseSpline()
  {
    a;a.<init>();jdField_void = a;
    jdField_void.setSeed(jdField_void.nextLong());
  }
  
  public int getPressDuration() {
    return org.powerbot.script.Random.getDelay();
  }
  
  public Iterable<Vector3> getPath(Vector3 a, Vector3 a) {
    return a.jdMethod_this(a, a);
  }
  
  public long getAbsoluteDelay(int a) {
    1;1; int tmp16_15 = 1;tmp16_15;return 16 << tmp16_15;
  }
  
  private Queue<Vector3> jdMethod_this(Vector3 a, Vector3 a) {
    java.util.ArrayDeque localArrayDeque = new java.util.ArrayDeque();
    
    double d = a.distanceTo2D(a); int 
      tmp19_18 = 1;tmp19_18;int i = 2 >> tmp19_18;1; int tmp31_30 = 1; int tmp32_31 = tmp31_30;tmp32_31;int j = tmp31_30 + tmp32_31;
    
    if (d < 255.0D) {
      int tmp52_51 = 1;tmp52_51;
      Iterator localIterator = localArrayDeque.iterator();
      for (a.addAll(a.jdMethod_this(a, 4, tmp52_51)); localIterator.hasNext();) { localObject = (Vector3)localIterator.next(); int 
          tmp99_98 = 1;tmp99_98;0z = tmp99_98;tmpTernaryOp = localObject;
        continue;throw localIterator; }
      return localArrayDeque;throw localArrayDeque;
    }
    
    1; int tmp124_123 = 1;tmp124_123;int k = 2 + tmp124_123;
    1; int tmp139_138 = 1;tmp139_138;Object localObject = tmp139_138;1; int tmp151_150 = 1;tmp151_150;int ? = tmp151_150; int 
      tmp161_160 = 1;tmp161_160;0[tmp161_160] = a; int 
      tmp167_166 = 1; int tmp168_167 = tmp167_166;tmp168_167;localObject.length[(tmp167_166 - tmp168_167)] = a; int 
      tmp175_173 = 1;tmp175_173;a = tmp175_173;1;
    1; int tmp207_206 = 1; int tmp208_207 = tmp207_206;tmp208_207; int tmp216_215 = 1;(2 % tmp197_196 == 0 ? tmp207_206 - tmp208_207 : tmp216_215); int tmp232_231 = 1;tmp232_231;localObject.length[0[tmp216_215]] = (jdField_void.nextDouble() - 0.5D).mul(4 / (tmp232_231 - k) + 1.0D); Object 
      tmp248_246 = localObject;248246x += -i + jdField_void.nextInt(j);
    248246y.y = (-i + (jdField_void.nextInt(j) + a++)); int 
    

      tmp305_304 = 1;tmp305_304;0[tmp305_304] = jdMethod_this(0.0D, (Vector3[])localObject); int 
      tmp322_321 = 1;tmp322_321;a = 2 << tmp322_321;
    
    1;
    float f = 1.0F / a * a; int 
      tmp353_352 = 1; int tmp354_353 = tmp353_352;tmp354_353;tmp353_352[tmp354_353] = jdMethod_this(f, (Vector3[])localObject);
    1; int tmp374_373 = 1;tmp374_373; int tmp384_383 = 1;tmp384_383;0374373z.z = Math.abs(255 % tmp384_383);
    1; int tmp400_399 = 1; int tmp401_400 = tmp400_399;tmp401_400; int tmp411_410 = 1;tmp411_410;400399401400z.z = Math.abs(255 % tmp411_410);
    1;1; int 
      tmp444_443 = 1;tmp444_443; int tmp450_449 = 1; int tmp451_450 = tmp450_449;tmp451_450;?[tmp450_449[tmp451_450]] = (a++);tmp444_443;
    

    return localArrayDeque;
  }
  
  private java.util.Collection<Vector3> jdMethod_this(Vector3 a, Vector3 a) {
    double d = a.gradientTo2D(a); int 
      tmp14_13 = 1;tmp14_13;int i = 3 >> tmp14_13;
    if ((jdMethod_this(d, -5.0D, -1.0D)) || (jdMethod_this(d, 1.0D, 5.0D))) {
      int tmp45_44 = 1;tmp45_44;tmp45_44 = tmp45_44;
    }
    return a.jdMethod_this(a, a, tmp45_44);
  }
  
  private static boolean jdMethod_this(double a, double a, double a) {
    if ((a >= a) && (a <= a)) { int tmp14_13 = 1; int tmp15_14 = tmp14_13;tmp15_14;return tmp15_14;throw tmp14_13; } int tmp21_20 = 1;tmp21_20;return tmp21_20;
  }
  
  private java.util.Collection<Vector3> jdMethod_this(Vector3 a, Vector3 a, int a) {
    ArrayList localArrayList = new ArrayList();
    

    if ((jdMethod_this(d1 = a.angleTo2D(a), 0.0D, 0.7853981633974483D)) || (jdMethod_this(d1, 2.356194490192345D, 3.141592653589793D)) || (jdMethod_this(d1, 3.141592653589793D, 3.9269908169872414D)) || (jdMethod_this(d1, 5.497787143782138D, 6.283185307179586D))) { int tmp70_69 = 1; int tmp71_70 = tmp70_69;;; break label81; throw tmp70_69; } else { 1; } label81: int i = tmp79_78;
    Vector3 tmp86_85 = a;double d1 = 8685x - x;double d2 = 8685y - y; int 
    


      tmp116_115 = 1; int tmp117_116 = tmp116_115;tmp117_116;int j = tmp117_116;tmp116_115;
    float f = 1.0F / a * j;
    double d3 = d1 * f;double d4 = d2 * f; Vector3 
      tmp155_154 = a; Vector3 tmp156_155 = tmp155_154;double d5 = 156155x + d3;
    double d6 = 155154y + d4;
    double d7 = 156155z;
    double d8;
    if (i != 0) {
      d8 = Math.sin(6.283185307179586D * f) * d3 * (-1.0D + 2.0D * jdField_void.nextDouble()) / 4.71238898038469D;
      d6 += d8;tmpTernaryOp = d7; break label278; throw localArrayList.add(a);
    } else {
      d8 = Math.cos(6.283185307179586D * f) * d4 * (-1.0D + 2.0D * jdField_void.nextDouble()) / 4.71238898038469D;
      d5 += d8; }
    label278:
    d7 = Math.ceil(d7 + Math.pow(Math.abs(d8), 3.0D)) % 255.0D;
    ArrayList tmp305_302 = localArrayList;tmp305_302; ArrayList tmp307_305 = tmp305_302;((int)d5).<init>((int)d6, d7, (int)j++);tmp307_305.add(tmp307_305); ArrayList 
    

      tmp336_334 = localArrayList;tmp336_334.add(a);
    
    return tmp336_334;
  }
  
  private static Vector3 jdMethod_this(double a, Vector3... a) {
    double d = 1.0D - a; int 
      tmp7_6 = 1; int tmp8_7 = tmp7_6;tmp8_7;int i = tmp7_6 - tmp8_7; int 
      tmp16_15 = 1;tmp16_15;Vector3 localVector3 = 0[tmp16_15].mul(Math.pow(d, i)); int 
      tmp33_31 = 1;
    int j; for (tmp33_31; (j = tmp33_31) < i;) {
      localVector3 = a[j].add((3.0D * Math.pow(d, i - j) * Math.pow(a, j)).mul(j++));tmpTernaryOp = j; continue;throw localVector3;
    }
    
    return localVector3 = localVector3.add(a[i].mul(Math.pow(a, i)));
  }
  
  public static String jdMethod_this(Object a)
  {
    int tmp34_31 = (a = (String)a).length();
    int tmp38_37 = 1;
    tmp38_37;
    int j;
    int ? = tmp38_37;
    int k = tmp34_31;
    int tmp48_44 = (j = new char[tmp34_31] - 1);
    tmp48_44;
    int i = (0x3 ^ 0x5) << 4 ^ (0x2 ^ 0x5) << 1;
    ((0x2 ^ 0x5) << 3 ^ 0x5);
    if (tmp48_44 >= 0)
    {
      int tmp58_57 = j;
      j--;
      ?[tmp58_57] = ((char)(a.charAt(tmp58_57) ^ i));
      int tmp79_76 = (j--);
      ?[tmp79_76] = ((char)(a.charAt(tmp79_76) ^ k));
    }
    return new String(?);
  }
}
