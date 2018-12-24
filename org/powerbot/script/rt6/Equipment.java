package org.powerbot.script.rt6;

import java.util.ArrayList;
import java.util.List;
import org.powerbot.bot.rt6.Items;

public class Equipment extends ItemQuery<Item> implements Displayable
{
  public Equipment(ClientContext arg0)
  {
    super(arg0);
  }
  



  protected List<Item> get()
  {
    ArrayList localArrayList = new ArrayList(28);
    int[][] arrayOfInt = ctx).items.getItems(670);
    Component localComponent1 = component();
    for (Slot localSlot : Slot.values()) {
      int k = localSlot.getStorageIndex();
      Component localComponent2 = localComponent1.component(localSlot.getComponentIndex());
      if ((k >= 0) && (k < arrayOfInt.length) && (arrayOfInt[k][0] != -1))
      {

        localArrayList.add(new Item((ClientContext)ctx, arrayOfInt[k][0], arrayOfInt[k][1], localComponent2)); }
    }
    return localArrayList;
  }
  





  public Item itemAt(Slot arg0)
  {
    int i = arg0.getStorageIndex();
    int[][] arrayOfInt = ctx).items.getItems(670);
    Component localComponent = component().component(arg0.getComponentIndex());
    if ((i >= arrayOfInt.length) || (arrayOfInt[i][0] == -1)) {
      return new Item((ClientContext)ctx, -1, -1, localComponent);
    }
    return new Item((ClientContext)ctx, arrayOfInt[i][0], arrayOfInt[i][1], localComponent);
  }
  




  public Component component()
  {
    Component localComponent = ctx).widgets.component(1462, 14);
    return localComponent.visible() ? localComponent : ctx).widgets.component(1464, 16);
  }
  



  public Item nil()
  {
    return new Item((ClientContext)ctx, -1, -1, null);
  }
  


  public static enum Slot
  {
    HEAD(0, 0), 
    CAPE(1, 1), 
    NECK(2, 2), 
    MAIN_HAND(3, 3), 
    TORSO(4, 4), 
    OFF_HAND(5, 5), 
    LEGS(7, 7), 
    HANDS(9, 9), 
    FEET(10, 10), 
    RING(12, 12), 
    QUIVER(13, 13), 
    AURA(14, 14), 
    POCKET(15, 15);
    
    private final int storageIndex;
    private final int component;
    
    private Slot(int arg2, int arg3) { storageIndex = arg2;
      component = arg3;
    }
    
    public int getStorageIndex() {
      return storageIndex;
    }
    
    public int getComponentIndex() {
      return component;
    }
  }
}
