package org.powerbot.script.rt6;

import java.awt.Color;
import java.awt.Point;
import org.powerbot.bot.rt6.client.ItemNode;
import org.powerbot.script.Actionable;
import org.powerbot.script.Drawable;
import org.powerbot.script.Identifiable;
import org.powerbot.script.InteractiveEntity;
import org.powerbot.script.Nameable;
import org.powerbot.script.Stackable;
import org.powerbot.script.Tile;


public class GroundItem
  extends GenericItem
  implements InteractiveEntity, Identifiable, Nameable, Stackable, Drawable, Actionable
{
  public static final Color TARGET_COLOR = new Color(255, 255, 0, 75);
  private final TileMatrix tile;
  private final ItemNode item;
  
  public GroundItem(ClientContext arg0, Tile arg1, ItemNode arg2) {
    super(arg0);
    tile = arg1.matrix(arg0);
    boundingModel = tile.boundingModel;
    item = arg2;
    bounds(-64, 64, -64, 0, -64, 64);
  }
  
  public void bounds(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
  {
    tile.bounds(arg0, arg1, arg2, arg3, arg4, arg5);
  }
  
  public int id()
  {
    return item.getId();
  }
  
  public int stackSize()
  {
    return item.getStackSize();
  }
  
  public String[] actions()
  {
    return groundActions();
  }
  
  public Tile tile()
  {
    return tile.tile();
  }
  
  public Point nextPoint()
  {
    return tile.nextPoint();
  }
  
  public Point centerPoint() {
    return tile.centerPoint();
  }
  
  public boolean contains(Point arg0)
  {
    return tile.contains(arg0);
  }
  
  public boolean valid()
  {
    return ((GroundItemQuery)ctx).groundItems.select()).contains(this);
  }
  
  public int hashCode()
  {
    return item.hashCode();
  }
  
  public boolean equals(Object arg0)
  {
    return ((arg0 instanceof GroundItem)) && (tile.equals(tile)) && (item.equals(item));
  }
  
  public String toString()
  {
    return GroundItem.class.getSimpleName() + "[id=" + id() + ",stacksize=" + stackSize() + ",name=" + name() + "]";
  }
}
