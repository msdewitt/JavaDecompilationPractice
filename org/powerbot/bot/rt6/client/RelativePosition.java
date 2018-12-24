package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector.FieldCache;

public class RelativePosition extends org.powerbot.bot.ReflectProxy
{
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public RelativePosition(org.powerbot.bot.Reflector arg0, Object arg1) { super(arg0, arg1); }
  
  public float getX()
  {
    return reflector.accessFloat(this, byte);
  }
  
  public float getY() {
    return reflector.accessFloat(this, new);
  }
  
  public float getZ() {
    return reflector.accessFloat(this, void);
  }
}
