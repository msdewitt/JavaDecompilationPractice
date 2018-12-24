package org.powerbot.script.rt4;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.powerbot.bot.rt4.client.Client;
import org.powerbot.script.Calculations;
import org.powerbot.script.Condition;
import org.powerbot.script.Input;
import org.powerbot.script.Script.Controller;

public class Inventory extends ItemQuery<Item>
{
  public Inventory(ClientContext arg0)
  {
    super(arg0);
  }
  
  protected List<Item> get()
  {
    ArrayList localArrayList = new ArrayList(28);
    Component localComponent1 = component();
    int m; if (localComponent1.componentCount() > 0) {
      for (Component localComponent2 : localComponent1.components()) {
        m = localComponent2.itemId();
        if ((m > -1) && (m != 6512) && (localComponent2.itemStackSize() > 0))
        {

          localArrayList.add(new Item((ClientContext)ctx, localComponent2, m, localComponent2.itemStackSize())); }
      }
      return localArrayList;
    }
    ??? = localComponent1.itemIds();int[] arrayOfInt = localComponent1.itemStackSizes();
    for (??? = 0; ??? < Math.min(??? != null ? ???.length : -1, arrayOfInt != null ? arrayOfInt.length : -1); ???++) {
      int k = ???[???];m = arrayOfInt[???];
      if (k > 0)
      {

        localArrayList.add(new Item((ClientContext)ctx, localComponent1, ???, k, m)); }
    }
    return localArrayList;
  }
  
  public Item[] items() {
    Item[] arrayOfItem = new Item[28];
    Component localComponent1 = component();
    int m; if (localComponent1.componentCount() > 0) {
      localObject = localComponent1.components();
      int i = localObject.length;
      for (j = 0; j < 28; j++)
        if (j >= i) {
          arrayOfItem[j] = nil();
        }
        else {
          Component localComponent2 = localObject[j];
          m = localComponent2.itemId();
          if ((m <= -1) || (m == 6512) || (localComponent2.itemStackSize() <= 0)) {
            arrayOfItem[j] = nil();
          }
          else
            arrayOfItem[j] = new Item((ClientContext)ctx, localComponent2, m, localComponent2.itemStackSize());
        }
      return arrayOfItem;
    }
    Object localObject = localComponent1.itemIds();int[] arrayOfInt = localComponent1.itemStackSizes();
    for (int j = 0; j < Math.min(localObject != null ? localObject.length : -1, arrayOfInt != null ? arrayOfInt.length : -1); j++) {
      int k = localObject[j];m = arrayOfInt[j];
      if (k >= 1) {
        arrayOfItem[j] = new Item((ClientContext)ctx, localComponent1, j, k, m);
      } else {
        arrayOfItem[j] = nil();
      }
    }
    return arrayOfItem;
  }
  





  public Item itemAt(int arg0)
  {
    Component localComponent1 = component();
    if ((arg0 > -1) && (arg0 < 28)) {
      Component localComponent2;
      if ((localComponent1.componentCount() > arg0) && ((localComponent2 = localComponent1.component(arg0)).id() > -1) && (localComponent2.id() != 6512) && (localComponent1.itemStackSize() > -1))
        return new Item((ClientContext)ctx, localComponent2, localComponent2.id(), localComponent2.itemStackSize());
      int[] arrayOfInt1; int[] arrayOfInt2; if (((arrayOfInt1 = localComponent1.itemIds()) != null) && (arrayOfInt1.length > arg0) && (arrayOfInt1[arg0] > -1) && ((arrayOfInt2 = localComponent1.itemIds()) != null) && (arrayOfInt2[arg0] > -1)) {
        return new Item((ClientContext)ctx, localComponent1, arg0, arrayOfInt1[arg0], arrayOfInt2[arg0]);
      }
    }
    return nil();
  }
  






  public Item itemAt(int arg0, int arg1)
  {
    return itemAt(inventoryIndex(arg0, arg1));
  }
  
  public int selectionType() {
    Client localClient = (Client)((ClientContext)ctx).client();
    return localClient != null ? localClient.getSelectionType() : 0;
  }
  
  public int selectedItemIndex() {
    Client localClient = (Client)((ClientContext)ctx).client();
    return (localClient != null) && (selectionType() == 1) ? localClient.getSelectionIndex() : -1;
  }
  
  public Item selectedItem() {
    int i = selectedItemIndex();
    return itemAt(i);
  }
  
  public Component component()
  {
    for (int[] arrayOfInt1 : Constants.INVENTORY_ALTERNATIVES) { Component localComponent;
      if (((localComponent = ctx).widgets.widget(arrayOfInt1[0]).component(arrayOfInt1[1])).valid()) && (localComponent.visible())) {
        return localComponent;
      }
    }
    return ctx).widgets.widget(149).component(0);
  }
  






  public boolean drop(Item arg0, boolean arg1)
  {
    if ((arg1) && (shiftDroppingEnabled())) {
      return (ctx).input.send("{VK_SHIFT down}")) && (arg0.click(true)) && (ctx).input.send("{VK_SHIFT up}"));
    }
    return arg0.interact("Drop", arg0.name());
  }
  



  public boolean drop(ItemQuery<Item> arg0)
  {
    Item localItem;
    

    if (shiftDroppingEnabled()) {
      ctx).input.send("{VK_SHIFT down}");
      for (localIterator = arg0.iterator(); localIterator.hasNext();) { localItem = (Item)localIterator.next();
        localItem.click(true);
        Condition.sleep(org.powerbot.script.Random.getDelay());
        if (ctx).controller.isStopping()) {
          break;
        }
      }
      ctx).input.send("{VK_SHIFT up}");
      return true;
    }
    for (Iterator localIterator = arg0.iterator(); localIterator.hasNext();) { localItem = (Item)localIterator.next();
      localItem.interact("Drop", localItem.name());
      if (ctx).controller.isStopping()) {
        break;
      }
    }
    return true;
  }
  







  public int inventoryColumn(int arg0)
  {
    return arg0 % 4;
  }
  






  public int inventoryRow(int arg0)
  {
    return Math.floorDiv(arg0, 4);
  }
  







  public int inventoryIndex(int arg0, int arg1)
  {
    return arg0 * 4 + arg1;
  }
  








  public Point indexPosition(int arg0)
  {
    return new Point(inventoryColumn(arg0), inventoryRow(arg0));
  }
  








  public Point indexCenterPoint(int arg0, int arg1)
  {
    if ((arg1 < 0) || (arg1 > 3) || (arg0 < 0) || (arg0 > 6)) {
      throw new IndexOutOfBoundsException();
    }
    
    int i = arg1 * 18 + 18;
    int j = arg0 * 16 + 16;
    
    Point localPoint = ctx).widgets.component(149, 0).screenPoint();
    return new Point(x + i, y + j);
  }
  





  public Point indexCenterPoint(int arg0)
  {
    if ((arg0 < 0) || (arg0 > 27)) {
      throw new IndexOutOfBoundsException();
    }
    return indexCenterPoint(inventoryRow(arg0), inventoryColumn(arg0));
  }
  






  public Rectangle boundingRect(int arg0)
  {
    Point localPoint = indexCenterPoint(arg0);
    return new Rectangle(x - 21, y - 18, 42, 36);
  }
  







  public boolean drag(Item arg0, int arg1)
  {
    if (!arg0.valid()) {
      return false;
    }
    
    if (arg0.inventoryIndex() == arg1) {
      return true;
    }
    
    if ((arg1 < 0) || (arg1 > 27)) {
      throw new IndexOutOfBoundsException();
    }
    
    if (!ctx).input.move(arg0.nextPoint())) {
      return false;
    }
    
    Rectangle localRectangle1 = boundingRect(arg1);
    int i = width / 8;int j = height / 8;
    Rectangle localRectangle2 = new Rectangle(x + width / 2 - i, y + height / 2 - j, width / 4, height / 4);
    
    return ctx).input.drag(Calculations.nextPoint(localRectangle1, localRectangle2), true);
  }
  
  public boolean shiftDroppingEnabled() {
    return ctx).varpbits.varpbit(1055, 17, 1) == 1;
  }
  
  public boolean isFull() {
    return ((ItemQuery)ctx).inventory.select()).size() >= 28;
  }
  
  public Item nil()
  {
    return new Item((ClientContext)ctx, null, -1, -1, -1);
  }
}
