package org.powerbot.script.rt6;

import java.awt.Point;
import org.powerbot.script.Actionable;
import org.powerbot.script.Identifiable;
import org.powerbot.script.Nameable;
import org.powerbot.script.Stackable;
import org.powerbot.script.StringUtils;

public class Item
  extends GenericItem
  implements Displayable, Identifiable, Nameable, Stackable, Actionable
{
  private final int id;
  private final Component component;
  private int stack;
  
  public Item(ClientContext arg0, Component arg1)
  {
    this(arg0, arg1.itemId(), arg1.itemStackSize(), arg1);
  }
  
  public Item(ClientContext arg0, int arg1, int arg2, Component arg3) {
    super(arg0);
    id = arg1;
    stack = arg2;
    component = arg3;
  }
  

  public void bounds(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {}
  

  public int id()
  {
    return id;
  }
  
  public int stackSize()
  {
    if (component == null) {
      return stack;
    }
    int i = component.itemStackSize();
    if ((component.visible()) && (component.itemId() == id)) {
      return this.stack = i;
    }
    return stack;
  }
  
  public String name()
  {
    String str;
    if ((component != null) && (component.itemId() == id)) {
      str = component.itemName();
    } else {
      str = loadidname;
    }
    return StringUtils.stripHtml(str);
  }
  
  public String[] actions()
  {
    return backpackActions();
  }
  



  public Component component()
  {
    return component;
  }
  
  public Point nextPoint()
  {
    if (component == null) {
      return new Point(-1, -1);
    }
    return component.nextPoint();
  }
  
  public Point centerPoint() {
    if (component == null) {
      return new Point(-1, -1);
    }
    return component.centerPoint();
  }
  
  public boolean contains(Point arg0)
  {
    return (component != null) && (component.contains(arg0));
  }
  
  public boolean valid()
  {
    return (id != -1) && (component != null) && (component.valid()) && (
      (!component.visible()) || (component.itemId() == id));
  }
  
  public String toString()
  {
    return getClass().getSimpleName() + "[" + id + "/" + stack + "]@" + component;
  }
  
  public int hashCode()
  {
    if (component == null) {
      return -1;
    }
    return id * 31 + component.index();
  }
  
  public boolean equals(Object arg0)
  {
    if ((arg0 == null) || (!(arg0 instanceof Item))) {
      return false;
    }
    Item localItem = (Item)arg0;
    return (id == id) && (((component != null) && 
      (component.equals(component))) || ((component == null) && (component == null)));
  }
}
