package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class OverheadSprites extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_new = new org.powerbot.bot.Reflector.FieldCache();
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public OverheadSprites(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public int[] getArray1() {
    return reflector.accessInts(this, new);
  }
  
  public short[] getArray2() {
    return (short[])reflector.access(this, void, [S.class);
  }
}
