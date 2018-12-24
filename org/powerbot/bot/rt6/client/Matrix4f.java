package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class Matrix4f extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public Matrix4f(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public float[] getMatrix() {
    return (float[])reflector.access(this, void, [F.class);
  }
}
