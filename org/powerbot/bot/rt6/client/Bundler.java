package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class Bundler extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_new = new org.powerbot.bot.Reflector.FieldCache();
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public Bundler(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public Cache getConfigCache() {
    return new Cache(reflector, reflector.access(this, new));
  }
  
  public Resources getResources() {
    return new Resources(reflector, reflector.access(this, void));
  }
}
