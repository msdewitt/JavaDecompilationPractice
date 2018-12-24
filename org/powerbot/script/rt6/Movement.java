package org.powerbot.script.rt6;

import java.awt.Point;
import java.awt.Rectangle;
import org.powerbot.bot.rt6.Map;
import org.powerbot.bot.rt6.client.Client;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Filter;
import org.powerbot.script.Input;
import org.powerbot.script.Locatable;
import org.powerbot.script.StringUtils;
import org.powerbot.script.Targetable;
import org.powerbot.script.Tile;

public class Movement extends ClientAccessor
{
  @Deprecated
  public static final int WIDGET_MAP = 1465;
  @Deprecated
  public static final int COMPONENT_MAP = 0;
  @Deprecated
  public static final int COMPONENT_RUN = 15;
  @Deprecated
  public static final int COMPONENT_RUN_ENERGY = 16;
  @Deprecated
  public static final int SETTING_RUN_ENABLED = 463;
  
  public Movement(ClientContext arg0)
  {
    super(arg0);
  }
  





  public TilePath newTilePath(Tile... arg0)
  {
    if (arg0 == null) {
      throw new IllegalArgumentException("tiles are null");
    }
    return new TilePath((ClientContext)ctx, arg0);
  }
  





  public LocalPath findPath(Locatable arg0)
  {
    if (arg0 == null) {
      throw new IllegalArgumentException();
    }
    return new LocalPath((ClientContext)ctx, ctx).map, arg0);
  }
  




  public Tile destination()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return Tile.NIL;
    }
    int i = localClient.getDestinationX();int j = localClient.getDestinationY();
    if ((i == -1) || (j == -1)) {
      return Tile.NIL;
    }
    return ctx).game.mapOffset().derive(i, j);
  }
  





  public boolean step(Locatable arg0)
  {
    Tile localTile1 = arg0.tile();
    if (!new TileMatrix((ClientContext)ctx, localTile1).onMap()) {
      localTile1 = closestOnMap(localTile1);
    }
    final Tile localTile2 = localTile1;
    Filter local1 = new Filter()
    {
      public boolean accept(Point arg0) {
        return ctx).input.click(true);
      }
    };
    ctx).input.apply(new Targetable() {
      private final TileMatrix tile = new TileMatrix((ClientContext)ctx, localTile2);
      
      public Point nextPoint()
      {
        return tile.mapPoint();
      }
      
      public boolean contains(Point arg0)
      {
        Point localPoint = tile.mapPoint();
        Rectangle localRectangle = new Rectangle(x - 2, y - 2, 4, 4);
        return localRectangle.contains(arg0); } }, local1);
  }
  







  public Tile closestOnMap(Locatable arg0)
  {
    Tile localTile1 = ctx).players.local().tile();
    Tile localTile2 = arg0.tile();
    if ((localTile1 == Tile.NIL) || (localTile2 == Tile.NIL)) {
      return Tile.NIL;
    }
    if (new TileMatrix((ClientContext)ctx, localTile2).onMap()) {
      return localTile2;
    }
    int i = localTile1.x();
    int j = localTile1.y();
    int k = localTile2.x();
    int m = localTile2.y();
    int n = Math.abs(i - k);
    int i1 = Math.abs(j - m);
    int i2 = k < i ? 1 : -1;
    int i3 = m < j ? 1 : -1;
    int i4 = n - i1;
    for (;;) {
      Tile localTile3 = new Tile(k, m, localTile1.floor());
      if (new TileMatrix((ClientContext)ctx, localTile3).onMap()) {
        return localTile3;
      }
      if ((k == i) && (m == j)) {
        break;
      }
      int i5 = 2 * i4;
      if (i5 > -i1) {
        i4 -= i1;
        k += i2;
      }
      if (i5 < n) {
        i4 += n;
        m += i3;
      }
    }
    return Tile.NIL;
  }
  





  public boolean running(final boolean arg0)
  {
    (running() == arg0) || ((ctx).widgets.component(1465, 15).click()) && 
      (org.powerbot.script.Condition.wait(new Condition.Check()
      {

        public boolean poll() {
          return running() == arg0; } }, 300, 10)));
  }
  






  public boolean running()
  {
    return ctx).varpbits.varpbit(463) == 1;
  }
  




  public int energyLevel()
  {
    Component localComponent = ctx).widgets.component(1465, 16);
    if ((localComponent != null) && (localComponent.valid())) {
      return StringUtils.parseInt(localComponent.text().replace('%', ' '));
    }
    return 0;
  }
  
  public CollisionMap collisionMap() {
    return collisionMap(ctx).game.floor());
  }
  
  public CollisionMap collisionMap(int arg0) {
    CollisionMap[] arrayOfCollisionMap = ctx).map.getCollisionMaps();
    if ((arg0 < 0) || (arg0 >= arrayOfCollisionMap.length)) {
      return new CollisionMap(0, 0);
    }
    return arrayOfCollisionMap[arg0];
  }
  
  public int distance(Locatable arg0) {
    return distance(ctx).players.local(), arg0);
  }
  







  public int distance(Locatable arg0, Locatable arg1)
  {
    if ((arg0 == null) || (arg1 == null)) {
      return -1;
    }
    Tile localTile1 = arg0.tile();
    Tile localTile2 = arg1.tile();
    if (localTile1.floor() != localTile2.floor()) {
      return -1;
    }
    Tile localTile3 = ctx).game.mapOffset();
    if ((localTile3 == Tile.NIL) || (localTile1 == Tile.NIL) || (localTile2 == Tile.NIL)) {
      return -1;
    }
    localTile1 = localTile1.derive(-localTile3.x(), -localTile3.y());
    localTile2 = localTile2.derive(-localTile3.x(), -localTile3.y());
    
    int i = localTile1.x();
    int j = localTile1.y();
    int k = localTile2.x();
    int m = localTile2.y();
    return ctx).map.getDistance(i, j, k, m, ctx).game.floor());
  }
  







  public boolean reachable(Locatable arg0, Locatable arg1)
  {
    if ((arg0 == null) || (arg1 == null)) {
      return false;
    }
    Tile localTile1 = arg0.tile();
    Tile localTile2 = arg1.tile();
    if (localTile1.floor() != localTile2.floor()) {
      return false;
    }
    
    Tile localTile3 = ctx).game.mapOffset();
    if ((localTile3 == Tile.NIL) || (localTile1 == Tile.NIL) || (localTile2 == Tile.NIL)) {
      return false;
    }
    localTile1 = localTile1.derive(-localTile3.x(), -localTile3.y());
    localTile2 = localTile2.derive(-localTile3.x(), -localTile3.y());
    
    int i = localTile1.x();
    int j = localTile1.y();
    int k = localTile2.x();
    int m = localTile2.y();
    return ctx).map.getPath(i, j, k, m, ctx).game.floor()).length > 0;
  }
}
