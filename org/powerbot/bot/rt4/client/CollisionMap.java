package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector.FieldCache;

public class CollisionMap extends org.powerbot.bot.ReflectProxy
{
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public CollisionMap(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int[][] getFlags() {
    return (int[][])reflector.access(this, byte, [[I.class);
  }
  
  public int getOffsetX() {
    return reflector.accessInt(this, new);
  }
  
  public int getOffsetY() {
    return reflector.accessInt(this, void);
  }
}
