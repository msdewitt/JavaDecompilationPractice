package org.powerbot.script.rt4;

import java.util.ArrayList;
import java.util.List;


public class Equipment
  extends ItemQuery<Item>
{
  public Equipment(ClientContext arg0)
  {
    super(arg0);
  }
  



  protected List<Item> get()
  {
    ArrayList localArrayList = new ArrayList(11);
    int[] arrayOfInt = ctx).players.local().appearance();
    for (Slot localSlot : Slot.values()) {
      int k = localSlot.getIndex();
      Component localComponent = ctx).widgets.widget(387).component(localSlot.getComponentIndex()).component(1);
      boolean bool = localComponent.visible();
      if ((k >= 0) && (((k < arrayOfInt.length) && (arrayOfInt[k] >= 0)) || (bool)))
      {

        localArrayList.add(new Item((ClientContext)ctx, localComponent, bool ? localComponent.itemId() : arrayOfInt[k], bool ? localComponent.itemStackSize() : 1)); }
    }
    return localArrayList;
  }
  





  public Item itemAt(Slot arg0)
  {
    int i = arg0.getIndex();
    int[] arrayOfInt = ctx).players.local().appearance();
    if (i < 0) {
      return nil();
    }
    Component localComponent = ctx).widgets.widget(387).component(arg0.getComponentIndex()).component(1);
    boolean bool = localComponent.visible();
    if (((i >= arrayOfInt.length) || (arrayOfInt[i] < 0)) && (!bool)) {
      return nil();
    }
    return new Item((ClientContext)ctx, localComponent, bool ? localComponent.itemId() : arrayOfInt[i], bool ? localComponent.itemStackSize() : 1);
  }
  



  public Item nil()
  {
    return new Item((ClientContext)ctx, null, -1, -1);
  }
  


  public static enum Slot
  {
    HEAD(0, 6), 
    CAPE(1, 7), 
    NECK(2, 8), 
    MAIN_HAND(3, 9), 
    TORSO(4, 10), 
    OFF_HAND(5, 11), 
    LEGS(7, 12), 
    HANDS(9, 13), 
    FEET(10, 14), 
    RING(12, 15), 
    QUIVER(13, 16);
    
    private final int index;
    
    private Slot(int arg2, int arg3) { index = arg2;
      component = arg3;
    }
    
    private final int component;
    public int getIndex() { return index; }
    

    public int getComponentIndex() {
      return component;
    }
  }
}
