package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector;

public class WallObject extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_new = new org.powerbot.bot.Reflector.FieldCache();
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public WallObject(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public long getUid() {
    return reflector.accessLong(this, new);
  }
  
  public int getMeta() {
    return reflector.accessInt(this, void);
  }
}
