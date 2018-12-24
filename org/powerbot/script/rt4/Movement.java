package org.powerbot.script.rt4;

import java.awt.Point;
import java.awt.Rectangle;
import org.powerbot.bot.rt4.client.Client;
import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Filter;
import org.powerbot.script.Input;
import org.powerbot.script.Locatable;
import org.powerbot.script.Targetable;
import org.powerbot.script.Tile;

public class Movement
  extends ClientAccessor
{
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
    return new LocalPath((ClientContext)ctx, arg0);
  }
  





  public Tile destination()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return Tile.NIL;
    }
    int i = localClient.getDestinationX();int j = localClient.getDestinationY();
    if ((i <= 0) || (j <= 0)) {
      return Tile.NIL;
    }
    return ctx).game.mapOffset().derive(i, j);
  }
  





  public boolean step(Locatable arg0)
  {
    Tile localTile1 = arg0.tile();
    if (!new TileMatrix((ClientContext)ctx, localTile1).onMap()) {
      localTile1 = closestOnMap(localTile1);
      if (!new TileMatrix((ClientContext)ctx, localTile1).onMap()) {
        return false;
      }
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
  




  public int energyLevel()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    return localClient != null ? localClient.getRunPercentage() : -1;
  }
  




  public boolean running()
  {
    return ctx).varpbits.varpbit(173) == 1;
  }
  





  public boolean running(final boolean arg0)
  {
    (arg0 == running()) || ((ctx).widgets.widget(160).component(22).interact("Toggle Run")) && 
      (Condition.wait(new Condition.Check()
      {

        public boolean poll() {
          return running() == arg0; } }, 20, 10)));
  }
  















  public int distance(Locatable arg0, Locatable arg1)
  {
    Tile localTile1 = ctx).game.mapOffset();
    
    if ((localTile1 == null) || (arg0 == null) || 
      ((localTile2 = arg0.tile()) == null) || (arg1 == null) || 
      ((localTile3 = arg1.tile()) == null) || (localTile1 == Tile.NIL) || (localTile2 == Tile.NIL) || (localTile3 == Tile.NIL) || 
      
      (arg0.tile().floor() != arg1.tile().floor()) || 
      (arg0.tile().floor() != localTile1.floor())) {
      return -1;
    }
    Tile localTile2 = localTile2.derive(-localTile1.x(), -localTile1.y());
    Tile localTile3 = localTile3.derive(-localTile1.x(), -localTile1.y());
    
    LocalPath.Graph localGraph = LocalPath.getGraph((ClientContext)ctx);
    LocalPath.Node localNode1;
    LocalPath.Node localNode2;
    LocalPath.Node[] arrayOfNode; if ((localGraph != null) && 
      ((localNode1 = localGraph.getNode(localTile2.x(), localTile2.y())) != null) && 
      ((localNode2 = localGraph.getNode(localTile3.x(), localTile3.y())) != null)) {
      LocalPath.dijkstra(localGraph, localNode1, localNode2);
      arrayOfNode = LocalPath.follow(localNode2);
    } else {
      arrayOfNode = new LocalPath.Node[0];
    }
    int i = arrayOfNode.length;
    return i > 0 ? i : -1;
  }
  












  public int distance(Locatable arg0)
  {
    return distance(ctx).players.local(), arg0);
  }
  











  public boolean reachable(Locatable arg0, Locatable arg1)
  {
    return distance(arg0, arg1) > 0;
  }
}
