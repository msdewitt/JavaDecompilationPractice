package org.powerbot.script.rt4;

import java.awt.Point;
import java.awt.Rectangle;
import org.powerbot.script.Actionable;
import org.powerbot.script.Calculations;
import org.powerbot.script.Identifiable;
import org.powerbot.script.Nameable;
import org.powerbot.script.Stackable;
import org.powerbot.script.StringUtils;

public class Item extends GenericItem implements Identifiable, Nameable, Stackable, Actionable
{
  private static final int WIDTH = 42;
  private static final int HEIGHT = 36;
  final Component component;
  private final int inventoryIndex;
  private final int id;
  private int stack;
  private int[] bounds;
  
  public Item(ClientContext arg0, Component arg1)
  {
    this(arg0, arg1, arg1.itemId(), arg1.itemStackSize());
  }
  
  public Item(ClientContext arg0, Component arg1, int arg2, int arg3) {
    this(arg0, arg1, -1, arg2, arg3);
  }
  
  public Item(ClientContext arg0, Component arg1, int arg2, int arg3, int arg4) {
    super(arg0);
    component = arg1;
    inventoryIndex = arg2;
    id = arg3;
    stack = arg4;
  }
  



  public void bounds(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
  {
    bounds = new int[] { arg0, arg1, arg2, arg3 };
  }
  
  public int id()
  {
    return id;
  }
  
  public Point centerPoint()
  {
    if (component == null) {
      return new Point(-1, -1);
    }
    if (inventoryIndex != -1) {
      Point localPoint = component.screenPoint();
      int i = x - 3 + inventoryIndex % 4 * 42;int j = y - 2 + inventoryIndex / 4 * 36;
      return new Point(i + 21, j + 18);
    }
    return component.centerPoint();
  }
  
  public String name()
  {
    return StringUtils.stripHtml(super.name());
  }
  
  public int stackSize()
  {
    if ((component == null) || (!component.valid())) {
      return stack;
    }
    if (inventoryIndex != -1) {
      int[] arrayOfInt1 = component.itemIds();
      int[] arrayOfInt2 = component.itemStackSizes();
      return (arrayOfInt1.length > inventoryIndex) && (arrayOfInt2.length > inventoryIndex) && (arrayOfInt1[inventoryIndex] == id) ? (this.stack = arrayOfInt2[inventoryIndex]) : stack;
    }
    

    if ((component.visible()) && (component.itemId() == id)) {
      return this.stack = component.itemStackSize();
    }
    return stack;
  }
  
  public String[] actions()
  {
    return inventoryActions();
  }
  
  public Point nextPoint()
  {
    if (component == null) {
      return new Point(-1, -1);
    }
    if (inventoryIndex != -1) {
      Rectangle localRectangle = boundingRect();
      int i = width / 8;int j = height / 8;
      return Calculations.nextPoint(localRectangle, new Rectangle(x + width / 2 - i, y + height / 2 - j, width / 4, height / 4));
    }
    return component.nextPoint();
  }
  
  public boolean contains(Point arg0)
  {
    if (component == null) {
      return false;
    }
    if (inventoryIndex != -1) {
      Rectangle localRectangle = boundingRect();
      return localRectangle.contains(arg0);
    }
    return component.contains(arg0);
  }
  
  public Component component() {
    return component;
  }
  
  public boolean valid()
  {
    if ((id == -1) || (component == null) || (!component.valid())) {
      return false;
    }
    if (inventoryIndex != -1) {
      int[] arrayOfInt = component.itemIds();
      return (arrayOfInt.length > inventoryIndex) && (arrayOfInt[inventoryIndex] == id);
    }
    return (!component.visible()) || (component.itemId() == id);
  }
  
  public Rectangle boundingRect() {
    if (inventoryIndex == -1) return new Rectangle();
    Point localPoint = component.screenPoint();
    
    if (bounds != null) {
      int i = bounds[0];
      int j = bounds[1];
      int k = bounds[2];
      int m = bounds[3];
      localPoint = centerPoint();
      return new Rectangle(x + i, y + k, j, m);
    }
    return new Rectangle(x - 3 + inventoryIndex % 4 * 42, y - 2 + inventoryIndex / 4 * 36, 42, 36);
  }
  
  public int inventoryIndex() {
    return inventoryIndex;
  }
}
