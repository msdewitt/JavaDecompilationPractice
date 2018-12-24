package org.powerbot.script;

import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.util.Arrays;



public class Area
{
  private final Polygon polygon;
  private final int plane;
  private Tile[] tiles;
  
  public Area(Tile arg0, Tile arg1)
  {
    this(new Tile[] { new Tile(
      Math.min(arg0.x(), arg1.x()), Math.min(arg0.y(), arg1.y()), arg0.floor()), new Tile(
      Math.max(arg0.x(), arg1.x()), Math.min(arg0.y(), arg1.y()), arg0.floor()), new Tile(
      Math.max(arg0.x(), arg1.x()), Math.max(arg0.y(), arg1.y()), arg1.floor()), new Tile(
      Math.min(arg0.x(), arg1.x()), Math.max(arg0.y(), arg1.y()), arg1.floor()) });
  }
  
  public Area(Tile... arg0)
  {
    if (arg0.length < 0) {
      throw new IllegalArgumentException("tiles.length < 0");
    }
    polygon = new Polygon();
    plane = arg0[0].floor();
    for (Tile localTile : arg0) {
      if (localTile.floor() != plane) {
        throw new IllegalArgumentException("mismatched planes " + plane + " != " + localTile.floor());
      }
      polygon.addPoint(localTile.x(), localTile.y());
    }
    tiles = null;
  }
  
  public boolean contains(Locatable... arg0) {
    for (Locatable localLocatable : arg0) {
      Tile localTile = localLocatable.tile();
      if ((localTile.floor() != plane) || (!polygon.contains(localTile.x(), localTile.y()))) {
        return false;
      }
    }
    return true;
  }
  
  public boolean containsOrIntersects(Locatable... arg0) {
    for (Locatable localLocatable : arg0) {
      Tile localTile = localLocatable.tile();
      if ((localTile.floor() != plane) || ((!polygon.contains(localTile.x(), localTile.y())) && (!polygon.intersects(localTile.x() - 0.5D, localTile.y() - 0.5D, 1.0D, 1.0D)))) {
        return false;
      }
    }
    return true;
  }
  
  public Tile getCentralTile() {
    Point localPoint = PolygonUtils.getCenter(polygon);
    return new Tile(x, y, plane);
  }
  
  public Tile getRandomTile() {
    Tile[] arrayOfTile = getTiles();
    int i = arrayOfTile.length;
    return i != 0 ? arrayOfTile[Random.nextInt(0, i)] : Tile.NIL;
  }
  
  public Tile getClosestTo(Locatable arg0) {
    Tile localTile1 = arg0 != null ? arg0.tile() : Tile.NIL;
    if (localTile1 != Tile.NIL) {
      double d1 = Double.POSITIVE_INFINITY;
      Object localObject = Tile.NIL;
      Tile[] arrayOfTile1 = getTiles();
      for (Tile localTile2 : arrayOfTile1) {
        double d2 = localTile1.distanceTo(localTile2);
        if (d2 < d1) {
          d1 = d2;
          localObject = localTile2;
        }
      }
      return localObject;
    }
    return Tile.NIL;
  }
  
  public Polygon getPolygon() {
    return polygon;
  }
  
  public Tile[] tiles() {
    return (Tile[])getTiles().clone();
  }
  
  private Tile[] getTiles() {
    if (tiles != null) {
      return tiles;
    }
    
    Rectangle localRectangle = polygon.getBounds();
    int i = 0;
    Tile[] arrayOfTile = new Tile[width * height];
    for (int j = 0; j < width; j++) {
      for (int k = 0; k < height; k++) {
        int m = x + j;
        int n = y + k;
        if (polygon.contains(m, n)) {
          arrayOfTile[(i++)] = new Tile(m, n, plane);
        }
      }
    }
    return this.tiles = (Tile[])Arrays.copyOf(arrayOfTile, i);
  }
  
  private double avg(int... arg0) {
    long l = 0L;
    for (int k : arg0) {
      l += k;
    }
    return l / arg0.length;
  }
  




  private static class PolygonUtils
  {
    private PolygonUtils() {}
    



    public static Point getCenter(Polygon arg0)
    {
      if (arg0 == null) {
        return null;
      }
      
      int i = npoints;
      Point[] arrayOfPoint = new Point[i];
      
      for (int j = 0; j < i; j++) {
        arrayOfPoint[j] = new Point(xpoints[j], ypoints[j]);
      }
      
      double d1 = 0.0D;double d2 = 0.0D;
      double d3 = getArea(arrayOfPoint, i);
      


      for (int k = 0; k < i; k++) {
        int m = (k + 1) % i;
        d4 = x * y - x * y;
        d1 += (x + x) * d4;
        d2 += (y + y) * d4;
      }
      double d4 = 1.0D / (6.0D * d3);
      d1 *= d4;
      d2 *= d4;
      return new Point((int)Math.abs(Math.round(d1)), (int)Math.abs(Math.round(d2)));
    }
    








    public static double getArea(Point[] arg0, int arg1)
    {
      double d = 0.0D;
      
      for (int i = 0; i < arg1; i++) {
        int j = (i + 1) % arg1;
        d += x * y;
        d -= y * x;
      }
      
      d /= 2.0D;
      return Math.abs(d);
    }
  }
}
