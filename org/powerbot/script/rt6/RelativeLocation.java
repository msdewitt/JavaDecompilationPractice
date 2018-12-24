package org.powerbot.script.rt6;



public class RelativeLocation
{
  public static final RelativeLocation NIL = new RelativeLocation(-1.0F, -1.0F, -1);
  private final float x;
  private final int floor;
  private final float z;
  
  RelativeLocation(float arg0, float arg1, int arg2) {
    x = arg0;
    floor = arg2;
    z = arg1;
  }
  
  public float x() {
    return x;
  }
  
  public int floor() {
    return floor;
  }
  
  public float z() {
    return z;
  }
}
