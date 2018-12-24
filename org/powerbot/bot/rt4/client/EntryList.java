package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector;

public class EntryList extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public EntryList(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public Entry getSentinel() {
    return new Entry(reflector, reflector.access(this, void));
  }
}
