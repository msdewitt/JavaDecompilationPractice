package org.powerbot.script;

public abstract interface Viewable
{
  public abstract boolean inViewport();
  
  public static abstract interface Query<T>
  {
    public abstract T viewable();
  }
}
