package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector.FieldCache;

public class Tile extends org.powerbot.bot.ReflectProxy
{
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
    return new ItemPile(reflector, reflector.access(this, else));
  }
  
  public BoundaryObject getBoundaryObject() {
    return new BoundaryObject(reflector, reflector.access(this, if));
  }
  
  public WallObject getWallObject() {
    return new WallObject(reflector, reflector.access(this, null));
  }
  
  public FloorObject getFloorObject() {
    return new FloorObject(reflector, reflector.access(this, byte));
  }
  
  public GameObject[] getGameObjects() {
    Object[] arrayOfObject;
    if ((arrayOfObject = (Object[])reflector.access(this, new, [Ljava.lang.Object.class)) != null) { int tmp27_26 = 1;;; break label34; throw new GameObject[arrayOfObject.length]; } label34: GameObject[] arrayOfGameObject = null;
    if (arrayOfObject != null) {
      int tmp41_40 = 1;
      

















      int i;
      

















      for (tmp41_40; (i = tmp41_40) < arrayOfObject.length; tmpTernaryOp = i) {
        int tmp56_54 = i;tmp56_54; int tmp58_56 = tmp56_54;tmp58_56.<init>(reflector, arrayOfObject[i]);new org/powerbot/bot/rt4/client/GameObject[tmp58_56] = (i++);
      }
      throw 
        tmp55_54;
    }
    
    1; int tmp89_88 = 1;tmp89_88;return tmp89_88;
    
    return arrayOfGameObject;
  }
  
  public int getGameObjectLength() {
    return reflector.accessInt(this, void);
  }
}
