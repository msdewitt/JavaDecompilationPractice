package org.powerbot.script.rt4;

import java.awt.Color;
import java.awt.Point;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import org.powerbot.bot.ReflectProxy;
import org.powerbot.bot.rt4.Bot;
import org.powerbot.bot.rt4.HashTable;
import org.powerbot.bot.rt4.client.Cache;
import org.powerbot.bot.rt4.client.Client;
import org.powerbot.bot.rt4.client.Varbit;
import org.powerbot.script.Actionable;
import org.powerbot.script.Identifiable;
import org.powerbot.script.InteractiveEntity;
import org.powerbot.script.Nameable;
import org.powerbot.script.StringUtils;
import org.powerbot.script.Tile;
import org.powerbot.script.Validatable;

public class GameObject extends Interactive implements Nameable, InteractiveEntity, Identifiable, Validatable, Actionable
{
  public static final Color TARGET_COLOR = new Color(0, 255, 0, 20);
  


  private static final int[] lookup = new int[32];
  static { int i = 2;
    for (int j = 0; j < 32; j++) {
      lookup[j] = (i - 1);
      i += i;
    }
  }
  

  private final BasicObject object;
  GameObject(ClientContext arg0, BasicObject arg1, Type arg2)
  {
    super(arg0);
    object = arg1;
    type = arg2;
    bounds(-32, 32, -64, 0, -32, 32);
  }
  
  public void bounds(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
  {
    boundingModel.set(new BoundingModel((ClientContext)ctx, arg0, arg1, arg2, arg3, arg4, arg5)
    {
      public int x() {
        int i = relative();
        return i >> 16;
      }
      
      public int z()
      {
        int i = relative();
        return i & 0xFFFF;
      }
    });
  }
  
  public int mainId() {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return -1;
    }
    return object != null ? object.getUid() >> 14 & 0xFFFF : -1;
  }
  
  public int id()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return -1;
    }
    int i = object != null ? object.getUid() >> 14 & 0xFFFF : -1;
    if (object == null) {
      return i;
    }
    int j = -1;
    CacheObjectConfig localCacheObjectConfig = CacheObjectConfig.load(Bot.CACHE_WORKER, i);
    if (localCacheObjectConfig == null)
      return i;
    Object localObject;
    if (stageOperationId != -1) {
      localObject = localClient.getVarbitCache();
      Varbit localVarbit = new Varbit(object.object.reflector, HashTable.lookup(((Cache)localObject).getTable(), stageOperationId, Varbit.class));
      if (obj.get() != null) {
        int k = lookup[(localVarbit.getEndBit() - localVarbit.getStartBit())];
        j = ctx).varpbits.varpbit(localVarbit.getIndex()) >> localVarbit.getStartBit() & k;
      }
    } else if (stageIndex >= 0) {
      j = ctx).varpbits.varpbit(stageIndex);
    }
    if (j >= 0) {
      localObject = materialPointers;
      if ((localObject != null) && (j < localObject.length) && (localObject[j] != -1)) {
        return localObject[j];
      }
    }
    return i;
  }
  
  public String name()
  {
    if (object == null) {
      return "";
    }
    int i = object.getUid() >> 14 & 0xFFFF;
    
    CacheObjectConfig localCacheObjectConfig1 = CacheObjectConfig.load(Bot.CACHE_WORKER, i);
    CacheObjectConfig localCacheObjectConfig2 = CacheObjectConfig.load(Bot.CACHE_WORKER, id());
    if (localCacheObjectConfig2 != null) {
      if ((localCacheObjectConfig1 != null) && (name.equals("null"))) {
        return StringUtils.stripHtml(name);
      }
      return StringUtils.stripHtml(name); }
    if (localCacheObjectConfig1 != null) {
      return StringUtils.stripHtml(name);
    }
    return "";
  }
  
  public int[] colors1() {
    CacheObjectConfig localCacheObjectConfig = CacheObjectConfig.load(Bot.CACHE_WORKER, id());
    if (localCacheObjectConfig != null) {
      int[] arrayOfInt = originalColors;
      return arrayOfInt == null ? new int[0] : arrayOfInt;
    }
    return new int[0];
  }
  
  public int[] colors2() {
    CacheObjectConfig localCacheObjectConfig = CacheObjectConfig.load(Bot.CACHE_WORKER, id());
    if (localCacheObjectConfig != null) {
      int[] arrayOfInt = modifiedColors;
      return arrayOfInt == null ? new int[0] : arrayOfInt;
    }
    return new int[0];
  }
  
  public int width() {
    CacheObjectConfig localCacheObjectConfig = CacheObjectConfig.load(Bot.CACHE_WORKER, id());
    if (localCacheObjectConfig != null) {
      return xSize;
    }
    return -1;
  }
  
  public int height() {
    CacheObjectConfig localCacheObjectConfig = CacheObjectConfig.load(Bot.CACHE_WORKER, id());
    if (localCacheObjectConfig != null) {
      return ySize;
    }
    return -1;
  }
  
  public int[] meshIds() {
    CacheObjectConfig localCacheObjectConfig = CacheObjectConfig.load(Bot.CACHE_WORKER, id());
    if (localCacheObjectConfig != null) {
      int[] arrayOfInt = meshId;
      if (arrayOfInt == null) {
        arrayOfInt = new int[0];
      }
      return arrayOfInt;
    }
    return new int[0];
  }
  
  public String[] actions() {
    CacheObjectConfig localCacheObjectConfig = CacheObjectConfig.load(Bot.CACHE_WORKER, id());
    if (localCacheObjectConfig != null) {
      return actions;
    }
    return new String[0];
  }
  
  public int orientation() {
    return object != null ? object.getMeta() >> 6 : 0;
  }
  

  private final Type type;
  
  public Type type()
  {
    return type; }
  
  public int relative() {
    int i;
    int j;
    if (object != null) {
      if (object.isComplex()) {
        i = object.getX();
        j = object.getZ();
      } else {
        int k = object.getUid();
        i = (k & 0x7F) << 7;
        j = (k >> 7 & 0x7F) << 7;
      }
    } else {
      i = j = 0;
    }
    return i << 16 | j;
  }
  
  public boolean valid()
  {
    return (this != ctx).objects.nil()) && (object != null) && 
      (!object.object.isNull()) && 
      (ctx).objects.select(this, 0).contains(this));
  }
  
  public Tile tile()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    int i = relative();
    int j = i >> 16;int k = i & 0xFFFF;
    if ((localClient != null) && (j != 0) && (k != 0)) {
      return new Tile(localClient.getOffsetX() + (j >> 7), localClient.getOffsetY() + (k >> 7), localClient.getFloor());
    }
    return Tile.NIL;
  }
  
  public Point centerPoint()
  {
    BoundingModel localBoundingModel = (BoundingModel)boundingModel.get();
    return localBoundingModel != null ? localBoundingModel.centerPoint() : new Point(-1, -1);
  }
  
  public Point nextPoint()
  {
    BoundingModel localBoundingModel = (BoundingModel)boundingModel.get();
    return localBoundingModel != null ? localBoundingModel.nextPoint() : new Point(-1, -1);
  }
  
  public boolean contains(Point arg0)
  {
    BoundingModel localBoundingModel = (BoundingModel)boundingModel.get();
    return (localBoundingModel != null) && (localBoundingModel.contains(arg0));
  }
  
  public String toString()
  {
    return String.format("%s[id=%d,name=%s,type=%s,tile=%s]", new Object[] { GameObject.class.getName(), Integer.valueOf(id()), name(), type.name(), tile().toString() });
  }
  
  public int hashCode()
  {
    return object != null ? object.hashCode() : 0;
  }
  
  public boolean equals(Object arg0)
  {
    return ((arg0 instanceof GameObject)) && (hashCode() == arg0.hashCode());
  }
  
  public static enum Type {
    INTERACTIVE,  BOUNDARY,  WALL_DECORATION,  FLOOR_DECORATION,  UNKNOWN;
    
    private Type() {}
  }
}
