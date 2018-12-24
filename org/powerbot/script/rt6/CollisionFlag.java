package org.powerbot.script.rt6;



public final class CollisionFlag
{
  public static final CollisionFlag NORTHWEST = new CollisionFlag(1, false);
  public static final CollisionFlag NORTH = new CollisionFlag(2, false);
  public static final CollisionFlag NORTHEAST = new CollisionFlag(4, false);
  public static final CollisionFlag EAST = new CollisionFlag(8, false);
  public static final CollisionFlag SOUTHEAST = new CollisionFlag(16, false);
  public static final CollisionFlag SOUTH = new CollisionFlag(32, false);
  public static final CollisionFlag SOUTHWEST = new CollisionFlag(64, false);
  public static final CollisionFlag WEST = new CollisionFlag(128, false);
  public static final CollisionFlag OBJECT_BLOCK = new CollisionFlag(256, false);
  public static final CollisionFlag DECORATION_BLOCK = new CollisionFlag(262144, false);
  public static final CollisionFlag DEAD_BLOCK = new CollisionFlag(2097152, false);
  
  public static final CollisionFlag PADDING = new CollisionFlag(-1, false);
  private final boolean markable;
  private int type;
  
  private CollisionFlag(int arg0, boolean arg1) {
    type = arg0;
    markable = arg1;
  }
  
  public static CollisionFlag createNewMarkable() {
    return new CollisionFlag(0, true);
  }
  
  public boolean contains(CollisionFlag arg0) {
    return (type & type) != 0;
  }
  
  public CollisionFlag mark(CollisionFlag arg0) {
    if (markable) {
      type |= type;
      return this;
    }
    return new CollisionFlag(type | type, true);
  }
  
  public CollisionFlag erase(CollisionFlag arg0)
  {
    if (markable) {
      type &= (type ^ 0xFFFFFFFF);
      return this;
    }
    return new CollisionFlag(type & (type ^ 0xFFFFFFFF), true);
  }
  
  public CollisionFlag erase()
  {
    if (markable) {
      type = 0;
      return this;
    }
    return createNewMarkable();
  }
  
  public int getType()
  {
    return type;
  }
  
  public boolean equals(Object arg0)
  {
    if (this == arg0) {
      return true;
    }
    if (!(arg0 instanceof CollisionFlag)) {
      return false;
    }
    CollisionFlag localCollisionFlag = (CollisionFlag)arg0;
    return type == type;
  }
  
  public int hashCode()
  {
    return type;
  }
}
