package org.powerbot.script.rt4;

import java.awt.Color;
import java.awt.Point;
import java.util.List;
import org.powerbot.bot.rt4.NodeQueue;
import org.powerbot.bot.rt4.client.Client;
import org.powerbot.bot.rt4.client.ItemNode;
import org.powerbot.bot.rt4.client.NodeDeque;
import org.powerbot.script.Actionable;
import org.powerbot.script.Identifiable;
import org.powerbot.script.InteractiveEntity;
import org.powerbot.script.Nameable;
import org.powerbot.script.Tile;
import org.powerbot.script.Validatable;

public class GroundItem
  extends GenericItem
  implements Nameable, InteractiveEntity, Identifiable, Validatable, Actionable
{
  public static final Color TARGET_COLOR = new Color(255, 255, 0, 75);
  

  private final TileMatrix tile;
  

  private final ItemNode node;
  


  GroundItem(ClientContext arg0, Tile arg1, ItemNode arg2)
  {
    super(arg0);
    tile = arg1.matrix(arg0);
    boundingModel = tile.boundingModel;
    node = arg2;
    bounds(-8, 8, -8, 0, -8, 8);
  }
  
  public void bounds(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
  {
    tile.bounds(arg0, arg1, arg2, arg3, arg4, arg5);
  }
  
  public int id()
  {
    return node.getItemId();
  }
  




  public int stackSize()
  {
    return node.getStackSize();
  }
  
  public Point centerPoint()
  {
    return tile.centerPoint();
  }
  
  public Point nextPoint()
  {
    return tile.nextPoint();
  }
  
  public boolean contains(Point arg0)
  {
    return tile.contains(arg0);
  }
  
  public Tile tile()
  {
    return tile.tile();
  }
  
  public int hashCode()
  {
    return node.hashCode();
  }
  
  public boolean equals(Object arg0)
  {
    return ((arg0 instanceof GroundItem)) && (tile.equals(tile)) && (node.equals(node));
  }
  
  public String toString()
  {
    return String.format("%s[id=%d,stack=%d,tile=%s]", new Object[] { GroundItem.class.getName(), Integer.valueOf(id()), Integer.valueOf(stackSize()), tile.tile().toString() });
  }
  
  public String[] actions()
  {
    return groundActions();
  }
  
  public boolean valid()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if ((localClient == null) || (node.isNull())) {
      return false;
    }
    NodeDeque[][][] arrayOfNodeDeque = localClient.getGroundItems();
    if (arrayOfNodeDeque != null) {
      int i = localClient.getFloor();
      if ((i < 0) || (i >= arrayOfNodeDeque.length) || (arrayOfNodeDeque[i] == null)) {
        return false;
      }
      Tile localTile = tile.tile().derive(-localClient.getOffsetX(), -localClient.getOffsetY());
      if ((localTile.x() < 0) || (localTile.y() < 0) || (localTile.x() >= arrayOfNodeDeque[i].length)) {
        return false;
      }
      NodeDeque[] arrayOfNodeDeque1 = arrayOfNodeDeque[i][localTile.x()];
      if ((arrayOfNodeDeque1 == null) || (localTile.y() >= arrayOfNodeDeque1.length)) {
        return false;
      }
      NodeDeque localNodeDeque = arrayOfNodeDeque1[localTile.y()];
      return (localNodeDeque != null) && (NodeQueue.get(localNodeDeque, ItemNode.class).contains(node));
    }
    return false;
  }
}
