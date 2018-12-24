package org.powerbot.script.rt4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import org.powerbot.bot.rt4.client.Client;
import org.powerbot.bot.rt4.client.CollisionMap;
import org.powerbot.bot.rt4.client.Landscape;
import org.powerbot.script.Locatable;
import org.powerbot.script.Random;



public class LocalPath
  extends Path
{
  private final Locatable destination;
  private TilePath tilePath;
  private org.powerbot.script.Tile tile;
  
  LocalPath(ClientContext arg0, Locatable arg1)
  {
    super(arg0);
    destination = arg1;
  }
  
  static Graph getGraph(ClientContext arg0) {
    Client localClient = (Client)arg0.client();
    if (localClient == null) {
      return null;
    }
    int i = localClient.getFloor();
    CollisionMap[] arrayOfCollisionMap = localClient.getCollisionMaps();
    CollisionMap localCollisionMap;
    if ((arrayOfCollisionMap == null) || (i < 0) || (i >= arrayOfCollisionMap.length) || ((localCollisionMap = arrayOfCollisionMap[i]) == null)) {
      return null;
    }
    int[][] arrayOfInt = localCollisionMap.getFlags();
    double[][] arrayOfDouble = getCosts(arg0, arrayOfInt.length, arrayOfInt.length);
    return arrayOfInt != null ? new Graph(arrayOfInt, arrayOfDouble, localCollisionMap.getOffsetX(), localCollisionMap.getOffsetY(), null) : null;
  }
  
  static double[][] getCosts(ClientContext arg0, int arg1, int arg2) {
    Client localClient = (Client)arg0.client();
    Landscape localLandscape = localClient.getLandscape();
    
    int i = localClient.getFloor();
    org.powerbot.bot.rt4.client.Tile[][][] arrayOfTile;
    org.powerbot.bot.rt4.client.Tile[][] arrayOfTile1; if ((localLandscape == null) || ((arrayOfTile = localLandscape.getTiles()) == null) || (i < 0) || (i > arrayOfTile.length) || ((arrayOfTile1 = arrayOfTile[i]) == null))
    {
      return new double[0][0];
    }
    double[][] arrayOfDouble = new double[arg1][arg2];
    for (int j = 0; j < Math.min(arg1, arrayOfTile1.length); j++) {
      org.powerbot.bot.rt4.client.Tile[] arrayOfTile2 = arrayOfTile1[j];
      if (arrayOfTile2 != null)
      {

        int k = arrayOfTile2.length;
        for (int m = 0; m < Math.min(arg2, k); m++) {
          org.powerbot.bot.rt4.client.Tile localTile = arrayOfTile2[m];
          if (localTile != null)
          {


            if ((localTile.getGameObjectLength() > 0) || 
              (localTile.getBoundaryObject() != null) || (localTile.getWallObject() != null)) {
              for (int n = Math.max(0, j - 1); n <= Math.min(arg1 - 1, j + 1); n++)
                for (int i1 = Math.max(0, m - 1); i1 <= Math.min(arg2 - 1, m + 1); i1++)
                  arrayOfDouble[n][i1] += Random.nextDouble();
            }
          }
        }
      }
    }
    return arrayOfDouble;
  }
  
  static void dijkstra(Graph arg0, Node arg1, Node arg2) {
    g = 0.0D;
    f = 0.0D;
    
    PriorityQueue localPriorityQueue = new PriorityQueue(8, new Comparator()
    {
      public int compare(LocalPath.Node arg0, LocalPath.Node arg1) {
        return Double.compare(f, f);
      }
      
    });
    double d1 = Math.sqrt(2.0D);
    
    localPriorityQueue.add(arg1);
    opened = true;
    Node localNode1; while (!localPriorityQueue.isEmpty()) {
      localNode1 = (Node)localPriorityQueue.poll();
      closed = true;
      if (localNode1.equals(arg2)) {
        break;
      }
      for (Node localNode2 : arg0.neighbors(localNode1))
        if (!closed)
        {

          double d2 = g + ((x - x == 0) || (y - y == 0) ? 1.0D : d1);
          
          if ((!opened) || (d2 < g)) {
            g = (d2 + arg0.getNodeCost(x, y));
            h = 0.0D;
            f = (g + h);
            parent = localNode1;
            
            if (!opened) {
              localPriorityQueue.offer(localNode2);
              opened = true;
            }
          }
        }
    }
  }
  
  static Node[] follow(Node arg0) {
    LinkedList localLinkedList = new LinkedList();
    if (Double.isInfinite(g)) {
      return new Node[0];
    }
    while (arg0 != null) {
      localLinkedList.add(arg0);
      arg0 = parent;
    }
    
    Collections.reverse(localLinkedList);
    Node[] arrayOfNode = new Node[localLinkedList.size()];
    return (Node[])localLinkedList.toArray(arrayOfNode);
  }
  
  public boolean traverse(EnumSet<Path.TraversalOption> arg0)
  {
    return (valid()) && (tilePath.traverse(arg0));
  }
  
  public org.powerbot.script.Tile next()
  {
    return valid() ? tilePath.next() : org.powerbot.script.Tile.NIL;
  }
  
  public org.powerbot.script.Tile start()
  {
    return ctx).players.local().tile();
  }
  
  public org.powerbot.script.Tile end()
  {
    return destination.tile();
  }
  
  public boolean valid()
  {
    org.powerbot.script.Tile localTile1 = destination.tile();
    if ((localTile1 == null) || (localTile1 == org.powerbot.script.Tile.NIL)) {
      return false;
    }
    if ((localTile1.equals(tile)) && (tilePath != null)) {
      return true;
    }
    tile = localTile1;
    org.powerbot.script.Tile localTile2 = ctx).players.local().tile();
    org.powerbot.script.Tile localTile3 = ctx).game.mapOffset();
    if ((localTile3 == org.powerbot.script.Tile.NIL) || (localTile2 == org.powerbot.script.Tile.NIL) || (localTile1 == org.powerbot.script.Tile.NIL)) {
      return false;
    }
    localTile2 = localTile2.derive(-localTile3.x(), -localTile3.y());
    localTile1 = localTile1.derive(-localTile3.x(), -localTile3.y());
    
    Graph localGraph = getGraph((ClientContext)ctx);
    Node localNode1;
    Node localNode2;
    Node[] arrayOfNode; if ((localGraph != null) && 
      ((localNode1 = localGraph.getNode(localTile2.x(), localTile2.y())) != null) && 
      ((localNode2 = localGraph.getNode(localTile1.x(), localTile1.y())) != null)) {
      dijkstra(localGraph, localNode1, localNode2);
      arrayOfNode = follow(localNode2);
    } else {
      arrayOfNode = new Node[0];
    }
    if (arrayOfNode.length > 0) {
      org.powerbot.script.Tile[] arrayOfTile = new org.powerbot.script.Tile[arrayOfNode.length];
      for (int i = 0; i < arrayOfNode.length; i++) {
        arrayOfTile[i] = localTile3.derive(x, y);
      }
      tilePath = new TilePath((ClientContext)ctx, arrayOfTile);
      return true;
    }
    return false;
  }
  
  static final class Graph { private final int offX;
    private final int offY;
    private final double[][] costs;
    private final LocalPath.Node[][] nodes;
    private final int width;
    private final int height;
    
    private Graph(int[][] arg0, double[][] arg1, int arg2, int arg3) { offX = arg2;
      offY = arg3;
      nodes = new LocalPath.Node[arg0.length][];
      costs = arg1;
      width = arg0.length;
      int i = arg0.length;
      for (int j = 0; j < arg0.length; j++) {
        int[] arrayOfInt = arg0[j];
        nodes[j] = new LocalPath.Node[arrayOfInt.length];
        i = Math.min(i, arrayOfInt.length);
        for (int k = 0; k < arrayOfInt.length; k++) {
          nodes[j][k] = new LocalPath.Node(j, k, arg0[j][k], null);
        }
      }
      height = i;
    }
    
    private double getNodeCost(int arg0, int arg1) {
      int i = arg0 + offX;int j = arg1 + offY;
      if ((i >= 0) && (j >= 0) && (i < costs.length) && (j < costs[i].length)) {
        return costs[i][j];
      }
      return 0.0D;
    }
    
    LocalPath.Node getNode(int arg0, int arg1) {
      int i = arg0 - offX;int j = arg1 - offY;
      if ((i >= 0) && (j >= 0) && (i < nodes.length) && (j < nodes[i].length)) {
        return nodes[i][j];
      }
      return null;
    }
    
    private List<LocalPath.Node> neighbors(LocalPath.Node arg0) {
      ArrayList localArrayList = new ArrayList(8);
      int i = x;
      int j = y;
      
      if ((i < 0) || (j < 0) || (i >= width) || (j >= height))
      {
        return localArrayList;
      }
      if ((j > 0) && ((nodes[i][j].flag & 0x20) == 0) && ((nodes[i][(j - 1)].flag & 0x240100) == 0))
      {

        localArrayList.add(nodes[i][(j - 1)]);
      }
      if ((i > 0) && ((nodes[i][j].flag & 0x80) == 0) && ((nodes[(i - 1)][j].flag & 0x240100) == 0))
      {

        localArrayList.add(nodes[(i - 1)][j]);
      }
      if ((j < height - 1) && ((nodes[i][j].flag & 0x2) == 0) && ((nodes[i][(j + 1)].flag & 0x240100) == 0))
      {

        localArrayList.add(nodes[i][(j + 1)]);
      }
      if ((i < width - 1) && ((nodes[i][j].flag & 0x8) == 0) && ((nodes[(i + 1)][j].flag & 0x240100) == 0))
      {

        localArrayList.add(nodes[(i + 1)][j]);
      }
      if ((i > 0) && (j > 0) && ((nodes[i][j].flag & 0xE0) == 0) && ((nodes[(i - 1)][(j - 1)].flag & 0x240100) == 0) && ((nodes[i][(j - 1)].flag & 0x240180) == 0) && ((nodes[(i - 1)][j].flag & 0x240120) == 0))
      {



        localArrayList.add(nodes[(i - 1)][(j - 1)]);
      }
      if ((i > 0) && (j < height - 1) && ((nodes[i][j].flag & 0x83) == 0) && ((nodes[(i - 1)][(j + 1)].flag & 0x240100) == 0) && ((nodes[i][(j + 1)].flag & 0x240180) == 0) && ((nodes[(i - 1)][j].flag & 0x240102) == 0))
      {



        localArrayList.add(nodes[(i - 1)][(j + 1)]);
      }
      if ((i < height - 1) && (j > 0) && ((nodes[i][j].flag & 0x38) == 0) && ((nodes[(i + 1)][(j - 1)].flag & 0x240100) == 0) && ((nodes[i][(j - 1)].flag & 0x240108) == 0) && ((nodes[(i + 1)][j].flag & 0x240120) == 0))
      {



        localArrayList.add(nodes[(i + 1)][(j - 1)]);
      }
      if ((i < width - 1) && (j < height - 1) && ((nodes[i][j].flag & 0xE) == 0) && ((nodes[(i + 1)][(j + 1)].flag & 0x240100) == 0) && ((nodes[i][(j + 1)].flag & 0x240108) == 0) && ((nodes[(i + 1)][j].flag & 0x240102) == 0))
      {



        localArrayList.add(nodes[(i + 1)][(j + 1)]);
      }
      return localArrayList; } }
  
  static final class Node { public final int x;
    public final int y;
    public final int flag;
    private boolean opened;
    private boolean closed;
    private Node parent;
    private double f;
    private double g;
    private double h;
    
    private Node(int arg0, int arg1, int arg2) { x = arg0;
      y = arg1;
      flag = arg2;
      reset();
    }
    
    private void reset() {
      opened = (this.closed = 0);
      parent = null;
      f = (this.g = this.h = Double.POSITIVE_INFINITY);
    }
    
    public String toString()
    {
      return Node.class.getSimpleName() + "[x=" + x + ",y=" + y + "]";
    }
    
    public boolean equals(Object arg0)
    {
      if ((arg0 == null) || (!(arg0 instanceof Node))) {
        return false;
      }
      Node localNode = (Node)arg0;
      return (x == x) && (y == y);
    }
  }
}
