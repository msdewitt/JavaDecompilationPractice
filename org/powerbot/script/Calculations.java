package org.powerbot.script;

import java.awt.Point;
import java.awt.Rectangle;











public class Calculations
{
  public Calculations() {}
  
  public static Point nextPoint(Rectangle arg0, Rectangle arg1)
  {
    double[] arrayOfDouble = { x, y, width, height, width, height };
    if (Math.min(width, Math.min(height, Math.min(width, height))) < 1) {
      return new Point(-1, -1);
    }
    

    double d1 = Math.sqrt(Random.nextDouble());
    double d2 = 6.283185307179586D * Random.nextDouble();
    

    double d3 = arrayOfDouble[4] + Random.nextGaussian() * (arrayOfDouble[2] - arrayOfDouble[4]) / 1.5D;
    double d4 = arrayOfDouble[5] + Random.nextGaussian() * (arrayOfDouble[3] - arrayOfDouble[5]) / 1.5D;
    

    double d5 = d1 * Math.cos(d2) * (d3 / 2.0D);double d6 = d1 * Math.sin(d2) * (d4 / 2.0D);
    

    double d7 = x + arrayOfDouble[4] / 2.0D + d5;
    double d8 = y + arrayOfDouble[5] / 2.0D + d6;
    

    if ((d7 < arrayOfDouble[0]) || (d8 < arrayOfDouble[1]) || (d7 >= arrayOfDouble[0] + arrayOfDouble[2]) || (d8 >= arrayOfDouble[1] + arrayOfDouble[3])) {
      double d9 = arrayOfDouble[0] + Random.nextDouble(0.0D, arrayOfDouble[2]);double d10 = arrayOfDouble[1] + Random.nextDouble(0.0D, arrayOfDouble[3]);
      return new Point((int)d9, (int)d10);
    }
    return new Point((int)d7, (int)d8);
  }
  
  public static String jdMethod_this(Object s)
  {
    int tmp28_25 = (s = (String)s).length();
    int tmp32_31 = 1;
    tmp32_31;
    int j;
    int ? = tmp32_31;
    int k = tmp28_25;
    (j = new char[tmp28_25] - 1);
    int i = (0x3 ^ 0x5) << 4 ^ 0x5;
    if ((4 << 3 ^ 0x3 ^ 0x5) >= 0)
    {
      int tmp51_50 = j;
      j--;
      ?[tmp51_50] = ((char)(s.charAt(tmp51_50) ^ i));
      int tmp72_69 = (j--);
      ?[tmp72_69] = ((char)(s.charAt(tmp72_69) ^ k));
    }
    return new String(?);
  }
}
