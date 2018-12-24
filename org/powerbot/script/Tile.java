package org.powerbot.script;

import java.awt.Color;



public class Tile
  implements Locatable, Nillable<Tile>, Comparable<Tile>
{
  public static final Tile NIL = new Tile(-1, -1, -1);
  public static final Color TARGET_COLOR = new Color(255, 0, 0, 75);
  protected final Vector3 p;
  
  public Tile(int arg0, int arg1) {
    this(arg0, arg1, 0);
  }
  
  public Tile(int arg0, int arg1, int arg2) {
    p = new Vector3(arg0, arg1, arg2);
  }
  





  public static Tile[] fromArray(int[][] arg0)
  {
    Tile[] arrayOfTile = new Tile[arg0.length];
    for (int i = 0; i < arrayOfTile.length; i++) {
      int j = arg0[i].length;
      arrayOfTile[i] = new Tile(j > 0 ? arg0[i][0] : 0, j > 1 ? arg0[i][1] : 0, arg0[i].length > 2 ? arg0[i][2] : 0);
    }
    return arrayOfTile;
  }
  




  public int x()
  {
    return p.x;
  }
  




  public int y()
  {
    return p.y;
  }
  





  public int floor()
  {
    return p.z;
  }
  




  public double distanceTo(Locatable arg0)
  {
    Tile localTile;
    



    return (arg0 == null) || ((localTile = arg0.tile()) == null) || (p.z != p.z) || (p.z == NILp.z) ? Double.POSITIVE_INFINITY : p.distanceTo(p);
  }
  






  public Tile derive(int arg0, int arg1)
  {
    return new Tile(p.x + arg0, p.y + arg1, p.z);
  }
  







  public Tile derive(int arg0, int arg1, int arg2)
  {
    return new Tile(p.x + arg0, p.y + arg1, arg2);
  }
  





  public org.powerbot.script.rt4.TileMatrix matrix(org.powerbot.script.rt4.ClientContext arg0)
  {
    return new org.powerbot.script.rt4.TileMatrix(arg0, this);
  }
  





  public org.powerbot.script.rt6.TileMatrix matrix(org.powerbot.script.rt6.ClientContext arg0)
  {
    return new org.powerbot.script.rt6.TileMatrix(arg0, this);
  }
  
  public Tile tile()
  {
    return this;
  }
  
  public Tile nil()
  {
    return NIL;
  }
  
  public int compareTo(Tile arg0)
  {
    return p.compareTo(p);
  }
  
  public String toString()
  {
    return p.toString();
  }
  
  public boolean equals(Object arg0)
  {
    return ((arg0 instanceof Tile)) && (p.equals(p));
  }
  
  public int hashCode()
  {
    return p.hashCode();
  }
}
