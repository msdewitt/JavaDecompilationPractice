package org.powerbot.script.rt6;

import java.awt.Color;
import java.awt.Point;
import java.util.concurrent.atomic.AtomicReference;
import org.powerbot.bot.rt6.Bot;
import org.powerbot.bot.rt6.client.Animator;
import org.powerbot.bot.rt6.client.GameLocation;
import org.powerbot.bot.rt6.client.RelativePosition;
import org.powerbot.bot.rt6.client.RenderableEntity;
import org.powerbot.bot.rt6.client.Sequence;
import org.powerbot.script.Area;
import org.powerbot.script.InteractiveEntity;
import org.powerbot.script.Nameable;
import org.powerbot.script.StringUtils;
import org.powerbot.script.Tile;

public class GameObject extends Interactive implements InteractiveEntity, Nameable, org.powerbot.script.Identifiable, org.powerbot.script.Actionable
{
  public static final Color TARGET_COLOR = new Color(0, 255, 0, 20);
  public final BasicObject object;
  private final Type type;
  
  public GameObject(ClientContext arg0, BasicObject arg1, Type arg2) {
    super(arg0);
    object = arg1;
    type = arg2;
    bounds(-128, 128, 65280, 0, -128, 128);
  }
  
  public void bounds(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
  {
    boundingModel.set(new BoundingModel((ClientContext)ctx, arg0, arg1, arg2, arg3, arg4, arg5)
    {
      public int x() {
        RelativeLocation localRelativeLocation = relative();
        return (int)localRelativeLocation.x();
      }
      
      public int z()
      {
        RelativeLocation localRelativeLocation = relative();
        return (int)localRelativeLocation.z();
      }
      
      public int floor()
      {
        return GameObject.this.floor();
      }
    });
  }
  
  public int mainId() {
    return object != null ? object.getMainId() : -1;
  }
  
  public int id()
  {
    return object != null ? object.getId() : -1;
  }
  
  public Type type() {
    return type;
  }
  
  public int animation() {
    return object != null ? object.getAnimator().getSequence().getId() : -1;
  }
  
  public String name()
  {
    CacheObjectConfig localCacheObjectConfig = CacheObjectConfig.load(Bot.CACHE_WORKER, id());
    String str = "";
    if (localCacheObjectConfig != null) {
      str = name;
    }
    return str == null ? "" : StringUtils.stripHtml(str);
  }
  
  public String[] actions()
  {
    CacheObjectConfig localCacheObjectConfig = CacheObjectConfig.load(Bot.CACHE_WORKER, id());
    if (localCacheObjectConfig != null) {
      return menuActions;
    }
    return new String[0];
  }
  
  public int orientation() {
    return object != null ? object.getOrientation() : -1;
  }
  
  public int floor() {
    return object != null ? object.getFloor() : -1;
  }
  


  public Area area()
  {
    Tile localTile = tile();
    return new Area(localTile, localTile);
  }
  
  public Tile tile()
  {
    RelativeLocation localRelativeLocation = relative();
    if ((object == null) || (object.object.isNull())) {
      return Tile.NIL;
    }
    return ctx).game.mapOffset().derive((int)localRelativeLocation.x() >> 9, (int)localRelativeLocation.z() >> 9, object.getFloor());
  }
  
  public int clippingType() {
    CacheObjectConfig localCacheObjectConfig = CacheObjectConfig.load(Bot.CACHE_WORKER, id());
    if (localCacheObjectConfig != null) {
      return reachableState;
    }
    return -1;
  }
  
  public RelativeLocation relative() {
    if (object == null) {
      return RelativeLocation.NIL;
    }
    RelativePosition localRelativePosition = object.object.getLocation().getRelativePosition();
    if (localRelativePosition.isNull()) {
      return RelativeLocation.NIL;
    }
    return new RelativeLocation(localRelativePosition.getX(), localRelativePosition.getZ(), ctx).game.floor());
  }
  
  public Point nextPoint()
  {
    BoundingModel localBoundingModel = (BoundingModel)boundingModel.get();
    return localBoundingModel != null ? localBoundingModel.nextPoint() : new Point(-1, -1);
  }
  
  public Point centerPoint() {
    BoundingModel localBoundingModel = (BoundingModel)boundingModel.get();
    return localBoundingModel != null ? localBoundingModel.centerPoint() : new Point(-1, -1);
  }
  
  public boolean contains(Point arg0)
  {
    BoundingModel localBoundingModel = (BoundingModel)boundingModel.get();
    return (localBoundingModel != null) && (localBoundingModel.contains(arg0));
  }
  
  public boolean valid()
  {
    return (this != ctx).objects.nil()) && (object != null) && 
      (!object.object.isNull()) && 
      (ctx).objects.select(this, 0).contains(this));
  }
  
  public int hashCode()
  {
    return object != null ? object.hashCode() : 0;
  }
  
  public boolean equals(Object arg0)
  {
    return ((arg0 instanceof GameObject)) && (object != null) && (object.equals(object));
  }
  
  public String toString()
  {
    return GameObject.class.getSimpleName() + "[id=" + id() + ",name=" + name() + "]";
  }
  
  public static enum Type {
    INTERACTIVE,  BOUNDARY,  WALL_DECORATION,  FLOOR_DECORATION,  UNKNOWN;
    
    private Type() {}
  }
}
