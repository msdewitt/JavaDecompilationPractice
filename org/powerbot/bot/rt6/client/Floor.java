package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class Floor extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public Floor(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int[][] getHeights() {
    return (int[][])reflector.access(this, void, [[I.class);
  }
}
