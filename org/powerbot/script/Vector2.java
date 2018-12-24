package org.powerbot.script;

import java.awt.Point;


public class Vector2
  implements Comparable<Vector2>
{
  public final int x;
  public final int y;
  
  public Vector2()
  {
    this(0, 0);
  }
  
  public Vector2(Point arg0) {
    this(x, y);
  }
  
  public Vector2(int arg0, int arg1) {
    x = arg0;
    y = arg1;
  }
  
  public Vector2 add(Vector2 arg0) {
    return new Vector2(x + x, y + y);
  }
  
  public Vector2 mul(double arg0) {
    return new Vector2((int)(x * arg0), (int)(y * arg0));
  }
  
  public double cross(Vector2 arg0, double arg1) {
    return magnitude() * arg0.magnitude() * Math.sin(arg1);
  }
  
  public double dot(Vector2 arg0) {
    return x * x + y * y;
  }
  
  public final double distanceTo(Vector2 arg0) {
    return Math.sqrt(Math.pow(x - x, 2.0D) + Math.pow(y - y, 2.0D));
  }
  
  public final double gradientTo(Vector2 arg0) {
    return (y - y) / (x - x);
  }
  
  public final double angleTo(Vector2 arg0) {
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
    return new int[] { x, y };
  }
  
  public Point toPoint() {
    return new Point(x, y);
  }
  
  public double magnitude() {
    return Math.sqrt(x * x + y * y);
  }
  
  public int compareTo(Vector2 arg0)
  {
    return x > x ? 1 : x < x ? -1 : y > y ? 1 : y < y ? -1 : 0;
  }
  
  public String toString()
  {
    return String.format("(%s, %s)", new Object[] { Integer.valueOf(x), Integer.valueOf(y) });
  }
  
  public boolean equals(Object arg0)
  {
    Vector3 localVector3;
    Vector2 localVector2;
    return (z == 0) && (y == y) && (x == x);
  }
  

  public int hashCode()
  {
    return (y & 0xFFFF) << 16 | x & 0xFFFF;
  }
}
