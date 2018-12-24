package org.powerbot.script.rt6;

import java.util.ArrayList;
import java.util.List;
import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Input;
import org.powerbot.script.Locatable;
import org.powerbot.script.StringUtils;
import org.powerbot.script.Tile;
import org.powerbot.script.Viewable;

public class DepositBox extends ItemQuery<Item> implements Viewable
{
  public DepositBox(ClientContext arg0)
  {
    super(arg0);
  }
  
  private Interactive getBox() {
    return (Interactive)((MobileIdNameQuery)ctx).objects.select()).id(Constants.DEPOSITBOX_ALTERNATIVES).viewable().nearest().poll();
  }
  





  public Locatable nearest()
  {
    Locatable localLocatable = (Locatable)((MobileIdNameQuery)ctx).objects.select()).id(Constants.DEPOSITBOX_ALTERNATIVES).nearest().poll();
    if (localLocatable.tile() != Tile.NIL) {
      return localLocatable;
    }
    return Tile.NIL;
  }
  




  public boolean present()
  {
    return nearest() != Tile.NIL;
  }
  


  public boolean inViewport()
  {
    return getBox().valid();
  }
  
  public boolean opened() {
    return ctx).widgets.widget(11).component(0).valid();
  }
  
  public boolean open() {
    if (opened()) {
      return true;
    }
    if (getBox().interact("Deposit")) {
      do {
        Condition.wait(new Condition.Check()
        {

          public boolean poll() { return (ctx).widgets.widget(13).component(0).valid()) || (opened()); } }, 150, 15);

      }
      while (ctx).players.local().inMotion());
    }
    return opened();
  }
  




  public boolean close()
  {
    return close(false);
  }
  





  public boolean close(boolean arg0)
  {
    if (!opened()) {
      return true;
    }
    boolean bool;
    if (arg0) {
      bool = ctx).input.send("{VK_ESCAPE}");
    } else {
      bool = ctx).widgets.component(11, 41).interact("Close");
    }
    (bool) && (Condition.wait(new Condition.Check()
    {

      public boolean poll() { return !opened(); } }, 150));
  }
  


  protected List<Item> get()
  {
    Component localComponent1 = ctx).widgets.component(11, 1);
    if ((localComponent1 == null) || (!localComponent1.valid())) {
      return new ArrayList();
    }
    Component[] arrayOfComponent1 = localComponent1.components();
    ArrayList localArrayList = new ArrayList(arrayOfComponent1.length);
    for (Component localComponent2 : arrayOfComponent1) {
      if (localComponent2.itemId() != -1) {
        localArrayList.add(new Item((ClientContext)ctx, localComponent2));
      }
    }
    return localArrayList;
  }
  
  public Item itemAt(int arg0) {
    Component localComponent1 = ctx).widgets.component(11, 1);
    if ((localComponent1 == null) || (!localComponent1.valid())) {
      return null;
    }
    Component localComponent2 = localComponent1.component(arg0);
    if ((localComponent2 != null) && (localComponent2.itemId() != -1)) {
      return new Item((ClientContext)ctx, localComponent2);
    }
    return null;
  }
  
  public int indexOf(int arg0) {
    Component localComponent = ctx).widgets.component(11, 1);
    if ((localComponent == null) || (!localComponent.valid())) {
      return -1;
    }
    Component[] arrayOfComponent = localComponent.components();
    for (int i = 0; i < arrayOfComponent.length; i++) {
      if (arrayOfComponent[i].itemId() == arg0) {
        return i;
      }
    }
    return -1;
  }
  






  public boolean deposit(int arg0, Amount arg1)
  {
    return deposit(arg0, arg1.getValue());
  }
  
  public boolean deposit(int arg0, int arg1) {
    if ((!opened()) || (arg1 < 0)) {
      return false;
    }
    Item localItem = (Item)((ItemQuery)((ItemQuery)select()).id(new int[] { arg0 }).shuffle()).poll();
    if (!localItem.valid()) {
      return false;
    }
    String str = "Deposit-" + arg1;
    int i = ((ItemQuery)select()).id(new int[] { arg0 }).count(true);
    if (i == 1) {
      str = "Deposit-1";
    } else if ((arg1 == 0) || (i <= arg1)) {
      str = "Deposit-All";
    }
    final int j = ((ItemQuery)select()).count(true);
    Component localComponent = localItem.component();
    if ((arg1 != 0) && (!containsAction(localComponent, str))) {
      if ((localComponent.interact("Deposit-X")) && (Condition.wait(new Condition.Check()
      {
        public boolean poll() {
          return DepositBox.this.isInputWidgetOpen();
        }
      })))
      {




        Condition.sleep();
        ctx).input.sendln(Integer.toString(arg1));
      } else {
        return false;
      }
    }
    else if (!localComponent.interact(str)) {
      return false;
    }
    
    Condition.wait(new Condition.Check()
    {
      public boolean poll() {
        return j != ((ItemQuery)select()).count(true);
      }
    });
  }
  




  public boolean depositInventory()
  {
    return (((ItemQuery)ctx).backpack.select()).isEmpty()) || (ctx).widgets.component(11, 13).click());
  }
  




  public boolean depositEquipment()
  {
    return ctx).widgets.component(11, 21).click();
  }
  




  public boolean depositFamiliar()
  {
    return ctx).widgets.component(11, 29).click();
  }
  




  public boolean depositMoneyPouch()
  {
    return (ctx).backpack.moneyPouchCount() == 0) || (ctx).widgets.component(11, 37).click());
  }
  
  private boolean containsAction(Component arg0, String arg1) {
    String[] arrayOfString1 = arg0.actions();
    for (String str : arrayOfString1) {
      if ((str != null) && (StringUtils.stripHtml(str).trim().equalsIgnoreCase(arg1))) {
        return true;
      }
    }
    return false;
  }
  
  private boolean isInputWidgetOpen() {
    return ctx).widgets.component(1469, 2).visible();
  }
  
  public Item nil()
  {
    return new Item((ClientContext)ctx, -1, -1, null);
  }
  


  public static enum Amount
  {
    ONE(1),  FIVE(5),  TEN(10),  ALL(0);
    
    private final int value;
    
    private Amount(int arg2) {
      value = arg2;
    }
    
    public int getValue() {
      return value;
    }
  }
}
