package org.powerbot.script;

import java.awt.Point;

public class Vector3 implements Comparable<Vector3>
{
  public int x;
  public int y;
  public int z;
  
  public Vector3()
  {
    this(0, 0, 0);
  }
  
  public Vector3(int arg0, int arg1, int arg2) {
    x = arg0;
    y = arg1;
    z = arg2;
  }
  
  public Vector3 add(Vector3 arg0) {
    return new Vector3(x + x, y + y, z + z);
  }
  
  public Vector3 mul(double arg0) {
    return new Vector3((int)(x * arg0), (int)(y * arg0), (int)(z * arg0));
  }
  
  public double cross(Vector3 arg0, double arg1) {
    return magnitude() * arg0.magnitude() * Math.sin(arg1);
  }
  
  public double dot(Vector3 arg0) {
    return x * x + y * y + z * z;
  }
  
  public double distanceTo2D(Vector3 arg0) {
    return Math.sqrt(Math.pow(x - x, 2.0D) + Math.pow(y - y, 2.0D));
  }
  
  public double distanceTo(Vector3 arg0) {
    return Math.sqrt(Math.pow(x - x, 2.0D) + Math.pow(y - y, 2.0D) + Math.pow(z - z, 2.0D));
  }
  
  public final double gradientTo2D(Vector3 arg0) {
    return (y - y) / (x - x);
  }
  
  public final double angleTo2D(Vector3 arg0) {
    double d = Math.atan2(y - y, x - x);
    
    if (d < 0.0D) {
      d = Math.abs(d);
    } else {
      d = 6.283185307179586D - d;
    }
    
    return d;
  }
  
  public long toLong2D() {
    return x << 32 | y & 0xFFFFFFFF;
  }
  
  public int[] toMatrix() {
    return new int[] { x, y, z };
  }
  
  public Point toPoint2D() {
    return new Point(x, y);
  }
  
  public double magnitude() {
    return Math.sqrt(x * x + y * y + z * z);
  }
  
  public int compareTo(Vector3 arg0) {
    long l1;
    long l2;
    return l1 > l2 ? 1 : (l1 = toLong2D()) < (l2 = arg0.toLong2D()) ? -1 : z > z ? 1 : z < z ? -1 : 0;
  }
  
  public String toString()
  {
    return String.format("(%s, %s, %s)", new Object[] { Integer.valueOf(x), Integer.valueOf(y), Integer.valueOf(z) });
  }
  
  public boolean equals(Object arg0)
  {
    Vector2 localVector2;
    Vector3 localVector3;
    return (z == 0) && (y == y) && (x == x);
  }
  

  public int hashCode()
  {
    return (z & 0x80) << 30 | (y & 0x7FFF) << 16 | x & 0x7FFF;
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
    int i = 1 << 3 ^ 0x5;
    if ((2 << 3 ^ 0x3) >= 0)
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
