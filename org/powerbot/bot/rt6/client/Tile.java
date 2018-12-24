package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector.FieldCache;

public class Tile extends org.powerbot.bot.ReflectProxy
{
  private static final Reflector.FieldCache jdField_enum = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_else = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_if = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_null = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_byte = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_new = new Reflector.FieldCache();
  private static final Reflector.FieldCache jdField_void = new Reflector.FieldCache();
  
  public Tile(org.powerbot.bot.Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public ItemPile getItemPile() {
    return new ItemPile(reflector, reflector.access(this, enum));
  }
  
  public Object getWallDecoration1() {
    return reflector.access(this, else);
  }
  
  public Object getWallDecoration2() {
    return reflector.access(this, if);
  }
  
  public Object getBoundary1() {
    return reflector.access(this, null);
  }
  
  public Object getBoundary2() {
    return reflector.access(this, byte);
  }
  
  public Object getFloorDecoration() {
    return reflector.access(this, new);
  }
  
  public RenderableNode getInteractives() {
    return new RenderableNode(reflector, reflector.access(this, void));
  }
}
