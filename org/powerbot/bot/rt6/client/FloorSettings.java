package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class FloorSettings extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public FloorSettings(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public byte[][][] getBytes() {
    return (byte[][][])reflector.access(this, void, [[[B.class);
  }
}
