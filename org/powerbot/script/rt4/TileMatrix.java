package org.powerbot.script.rt4;

import java.awt.Color;
import java.awt.Point;
import java.awt.Polygon;
import java.util.concurrent.atomic.AtomicReference;
import org.powerbot.script.InteractiveEntity;
import org.powerbot.script.Random;
import org.powerbot.script.Tile;


public final class TileMatrix
  extends Interactive
  implements InteractiveEntity
{
  public static final Color TARGET_COLOR = new Color(255, 0, 0, 75);
  private final Tile tile;
  
  public TileMatrix(ClientContext arg0, Tile arg1) {
    super(arg0);
    tile = arg1;
  }
  
  public void bounds(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
  {
    boundingModel.set(new BoundingModel((ClientContext)ctx, arg0, arg1, arg2, arg3, arg4, arg5)
    {
      public int x() {
        Tile localTile = ctx).game.mapOffset();
        return (tile.x() - localTile.x()) * 128 + 64;
      }
      
      public int z()
      {
        Tile localTile = ctx).game.mapOffset();
        return (tile.y() - localTile.y()) * 128 + 64;
      }
    });
  }
  






  public Point point(int arg0)
  {
    return point(0.5D, 0.5D, arg0);
  }
  
  public Point point(double arg0, double arg1, int arg2) {
    Tile localTile = ctx).game.mapOffset();
    return localTile != null ? ctx).game.worldToScreen((int)((tile.x() - localTile.x() + arg0) * 128.0D), (int)((tile.y() - localTile.y() + arg1) * 128.0D), arg2) : new Point(-1, -1);
  }
  


  /**
   * @deprecated
   */
  public Polygon getBounds()
  {
    return bounds();
  }
  




  public Polygon bounds()
  {
    Point localPoint1 = point(0.0D, 0.0D, 0);
    Point localPoint2 = point(1.0D, 0.0D, 0);
    Point localPoint3 = point(1.0D, 1.0D, 0);
    Point localPoint4 = point(0.0D, 1.0D, 0);
    return new Polygon(new int[] { x, x, x, x }, new int[] { y, y, y, y }, 4);
  }
  




  public Polygon[] triangles()
  {
    BoundingModel localBoundingModel = (BoundingModel)boundingModel.get();
    if (localBoundingModel != null) {
      return localBoundingModel.triangles();
    }
    return new Polygon[] {
      bounds() };
  }
  





  public Point mapPoint()
  {
    return ctx).game.tileToMap(tile);
  }
  





  public boolean onMap()
  {
    boolean bool = ctx).game.resizable();
    Point localPoint1 = ctx).game.mapComponent().centerPoint();
    Point localPoint2 = mapPoint();
    
    double d = Math.pow(x - x, 2.0D) + Math.pow(y - y, 2.0D);
    if (bool) {
      return d < Math.pow(68.0D, 2.0D);
    }
    return d < Math.pow(68.0D, 2.0D);
  }
  







  public boolean reachable()
  {
    return ctx).movement.reachable(ctx).players.local().tile(), tile);
  }
  
  public Tile tile()
  {
    return tile;
  }
  



  public boolean inViewport()
  {
    return isPolygonInViewport(bounds());
  }
  
  private boolean isPolygonInViewport(Polygon arg0) {
    for (int i = 0; i < npoints; i++) {
      if (!ctx).game.pointInViewport(xpoints[i], ypoints[i])) {
        return false;
      }
    }
    return true;
  }
  
  public Point nextPoint()
  {
    BoundingModel localBoundingModel = (BoundingModel)boundingModel.get();
    if (localBoundingModel != null) {
      return localBoundingModel.nextPoint();
    }
    if (!inViewport()) {
      return new Point(-1, -1);
    }
    int i = Random.nextGaussian(0, 100, 5.0D);
    int j = Random.nextGaussian(0, 100, 5.0D);
    return point(i / 100.0D, j / 100.0D, 0);
  }
  
  public Point centerPoint()
  {
    BoundingModel localBoundingModel = (BoundingModel)boundingModel.get();
    if (localBoundingModel != null) {
      return localBoundingModel.centerPoint();
    }
    if (!inViewport()) {
      return new Point(-1, -1);
    }
    return point(0);
  }
  
  public boolean contains(Point arg0)
  {
    BoundingModel localBoundingModel = (BoundingModel)boundingModel.get();
    if (localBoundingModel != null) {
      return localBoundingModel.contains(arg0);
    }
    Polygon localPolygon = bounds();
    return (isPolygonInViewport(localPolygon)) && (localPolygon.contains(arg0));
  }
  
  public boolean valid()
  {
    Tile localTile = ctx).game.mapOffset();
    if (localTile == null) {
      return false;
    }
    int i = tile.x() - localTile.x();int j = tile.y() - localTile.y();
    return (i >= 0) && (j >= 0) && (i < 104) && (j < 104);
  }
  
  public boolean equals(Object arg0)
  {
    return ((arg0 instanceof TileMatrix)) && (tile.equals(tile));
  }
  
  public int hashCode()
  {
    return tile.hashCode();
  }
  
  public String toString()
  {
    return tile.toString();
  }
}
