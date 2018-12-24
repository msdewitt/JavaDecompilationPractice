package org.powerbot.script;

public abstract interface Stackable
{
  public abstract int stackSize();
  
  public static abstract interface Query<T>
  {
    public abstract int count();
    
    public abstract int count(boolean paramBoolean);
  }
}
