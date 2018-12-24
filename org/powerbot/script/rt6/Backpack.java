package org.powerbot.script.rt6;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import org.powerbot.bot.rt6.Items;

public class Backpack extends ItemQuery<Item> implements Resizable, Displayable
{
  public Backpack(ClientContext arg0)
  {
    super(arg0);
  }
  



  protected List<Item> get()
  {
    ArrayList localArrayList = new ArrayList(28);
    Component localComponent1 = component();
    int[][] arrayOfInt = ctx).items.getItems(93);
    for (int i = 0; i < 28; i++) {
      Component localComponent2 = localComponent1.component(i);
      if (i >= arrayOfInt.length) {
        break;
      }
      if (arrayOfInt[i][0] != -1)
      {

        localArrayList.add(new Item((ClientContext)ctx, arrayOfInt[i][0], arrayOfInt[i][1], localComponent2)); }
    }
    return localArrayList;
  }
  



  public boolean collapsed()
  {
    Component localComponent = component();
    return (localComponent.visible()) && (localComponent.widget().id() == 1473) && 
      (ctx).widgets.component(1473, 3).relativePoint().getX() != 0.0D);
  }
  



  public boolean scroll(Displayable arg0)
  {
    if (!collapsed()) {
      return true;
    }
    Component localComponent1 = component();
    if (localComponent1.widget().id() == 1473) {
      Rectangle localRectangle = ctx).widgets.component(1473, 7).viewportRect();
      Component localComponent2 = arg0.component();
      if (!localRectangle.contains(localComponent2.boundingRect())) {
        ctx).widgets.scroll(localComponent2, ctx).widgets.component(1473, 3), localRectangle.contains(ctx).input.getLocation()));
      }
      return localRectangle.contains(localComponent2.boundingRect());
    }
    return false;
  }
  




  public Item[] items()
  {
    Item[] arrayOfItem = new Item[28];
    Component localComponent1 = component();
    int[][] arrayOfInt = ctx).items.getItems(93);
    for (int i = 0; i < 28; i++) {
      Component localComponent2 = localComponent1.component(i);
      if (i < arrayOfInt.length) {
        arrayOfItem[i] = new Item((ClientContext)ctx, arrayOfInt[i][0], arrayOfInt[i][1], localComponent2);
      } else {
        arrayOfItem[i] = nil();
      }
    }
    return arrayOfItem;
  }
  





  public Item itemAt(int arg0)
  {
    Component localComponent = component();
    int[][] arrayOfInt = ctx).items.getItems(93);
    if ((arg0 >= 0) && (arg0 < 28) && (arg0 < arrayOfInt.length) && (arrayOfInt[arg0][0] != -1)) {
      return new Item((ClientContext)ctx, arrayOfInt[arg0][0], arrayOfInt[arg0][1], localComponent.component(arg0));
    }
    return nil();
  }
  




  public int selectedItemIndex()
  {
    Component localComponent = component();
    for (int i = 0; i < 28; i++) {
      if (localComponent.component(i).borderThickness() == 2) {
        return i;
      }
    }
    return -1;
  }
  




  public boolean itemSelected()
  {
    return selectedItemIndex() != -1;
  }
  





  public int indexOf(int arg0)
  {
    int[][] arrayOfInt = ctx).items.getItems(93);
    for (int i = 0; i < 28; i++) {
      if (i >= arrayOfInt.length) break;
      if (arrayOfInt[i][0] == arg0) {
        return i;
      }
    }
    


    return -1;
  }
  






  public Component component()
  {
    for (int k : Constants.BACKPACK_ALTERNATIVES) { Component localComponent;
      if (((localComponent = ctx).widgets.component(k >> 16, k & 0xFFFF)) != null) && (localComponent.visible())) {
        return localComponent;
      }
    }
    return ctx).widgets.component(1473, 7);
  }
  




  public int moneyPouchCount()
  {
    int[][] arrayOfInt1 = ctx).items.getItems(623);
    for (int[] arrayOfInt : arrayOfInt1) {
      if (arrayOfInt[0] == 995) {
        return arrayOfInt[1];
      }
    }
    return 0;
  }
  



  public Item nil()
  {
    return new Item((ClientContext)ctx, -1, -1, null);
  }
}
