package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector.FieldCache;

public class World extends org.powerbot.bot.ReflectProxy
{
  private static final Reflector.FieldCache jdField_null = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public World(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public FloorSettings getFloorSettings() {
    return new FloorSettings(reflector, reflector.access(this, null));
  }
  
  public MapOffset getMapOffset() {
    return new MapOffset(reflector, reflector.access(this, byte));
  }
  
  public Landscape getLandscape() {
    return new Landscape(reflector, reflector.access(this, new));
  }
  
  public Bundler getSceneryBundle() {
    return new Bundler(reflector, reflector.access(this, void));
  }
}
