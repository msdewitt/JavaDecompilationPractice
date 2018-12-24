package org.powerbot.script;

import java.util.Comparator;


















































public abstract interface Locatable
{
  public abstract Tile tile();
  
  public static abstract interface Query<T>
  {
    public abstract T at(Locatable paramLocatable);
    
    public abstract T within(double paramDouble);
    
    public abstract T within(Locatable paramLocatable, double paramDouble);
    
    public abstract T within(Area paramArea);
    
    public abstract T nearest();
    
    public abstract T nearest(Locatable paramLocatable);
  }
  
  public static class Matcher
    implements Filter<Locatable>
  {
    private final Tile target;
    
    public Matcher(Locatable arg0)
    {
      target = arg0.tile();
    }
    
    public boolean accept(Locatable arg0)
    {
      Object localObject = arg0 != null ? arg0.tile() : null;
      return (localObject != null) && (target != null) && (target.equals(localObject));
    }
  }
  
  public static class WithinRange
    implements Filter<Locatable>
  {
    private final Tile target;
    private final double distance;
    
    public WithinRange(Locatable arg0, double arg1)
    {
      target = arg0.tile();
      distance = arg1;
    }
    
    public boolean accept(Locatable arg0)
    {
      Object localObject = arg0 != null ? arg0.tile() : null;
      return (localObject != null) && (target != null) && (localObject.distanceTo(target) <= distance);
    }
  }
  
  public static class WithinArea
    implements Filter<Locatable>
  {
    private final Area area;
    
    public WithinArea(Area arg0)
    {
      area = arg0;
    }
    
    public boolean accept(Locatable arg0)
    {
      Object localObject = arg0 != null ? arg0.tile() : null;
      if (localObject != null) {} return area.contains(new Locatable[] { localObject });
    }
  }
  
  public static class NearestTo
    implements Comparator<Locatable>
  {
    private final Tile target;
    
    public NearestTo(Locatable arg0)
    {
      target = arg0.tile();
    }
    
    public int compare(Locatable arg0, Locatable arg1)
    {
      Tile localTile1 = arg0.tile();
      Tile localTile2 = arg1.tile();
      if ((target == null) || (localTile1 == null) || (localTile2 == null)) {
        return Integer.MAX_VALUE;
      }
      double d1 = localTile1.distanceTo(target);
      double d2 = localTile2.distanceTo(target);
      return Double.compare(d1, d2);
    }
  }
}
