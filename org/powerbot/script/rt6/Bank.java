package org.powerbot.script.rt6;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Filter;
import org.powerbot.script.Input;
import org.powerbot.script.Locatable;
import org.powerbot.script.MenuCommand;
import org.powerbot.script.Random;
import org.powerbot.script.StringUtils;
import org.powerbot.script.Tile;
import org.powerbot.script.Viewable;

public class Bank extends ItemQuery<Item> implements Viewable
{
  private static final Filter<Interactive> UNREACHABLE_FILTER = new Filter()
  {
    public boolean accept(Interactive arg0) {
      if ((arg0 instanceof Locatable)) {
        Tile localTile1 = ((Locatable)arg0).tile();
        for (Tile localTile2 : Constants.BANK_UNREACHABLES) {
          if (localTile1.equals(localTile2)) {
            return false;
          }
        }
      }
      return true;
    }
  };
  
  public Bank(ClientContext arg0) {
    super(arg0);
  }
  
  private Interactive getBank() {
    Player localPlayer = ctx).players.local();
    Tile localTile = localPlayer.tile();
    
    ((MobileIdNameQuery)((MobileIdNameQuery)ctx).npcs.select()).id(Constants.BANK_NPCS).viewable().select(UNREACHABLE_FILTER)).nearest();
    ((MobileIdNameQuery)((MobileIdNameQuery)ctx).objects.select()).id(new int[][] { Constants.BANK_BOOTHS, Constants.BANK_COUNTERS, Constants.BANK_CHESTS }).viewable().select(UNREACHABLE_FILTER)).nearest();
    if (!ctx).properties.getProperty("bank.antipattern", "").equals("disable")) {
      Npc localNpc = (Npc)ctx).npcs.poll();
      GameObject localGameObject = (GameObject)ctx).objects.poll();
      return localTile.distanceTo(localNpc) < localTile.distanceTo(localGameObject) ? localNpc : localGameObject;
    }
    double d1 = Math.min(localTile.distanceTo((Locatable)ctx).npcs.peek()), localTile.distanceTo((Locatable)ctx).objects.peek()));
    double d2 = Math.min(2.0D, Math.max(0.0D, d1 - 1.0D));
    ArrayList localArrayList = new ArrayList();
    ctx).npcs.within(d1 + Random.nextInt(2, 5)).within((Locatable)ctx).npcs.peek(), d2);
    ctx).objects.within(d1 + Random.nextInt(2, 5)).within((Locatable)ctx).objects.peek(), d2);
    ctx).npcs.addTo(localArrayList);
    ctx).objects.addTo(localArrayList);
    int i = localArrayList.size();
    return i == 0 ? ctx).npcs.nil() : (Interactive)localArrayList.get(Random.nextInt(0, i));
  }
  





  public Locatable nearest()
  {
    Object localObject = (Locatable)((MobileIdNameQuery)((MobileIdNameQuery)ctx).npcs.select()).select(UNREACHABLE_FILTER)).id(Constants.BANK_NPCS).nearest().poll();
    
    Tile localTile = ctx).players.local().tile();
    
    for (GameObject localGameObject : (MobileIdNameQuery)((MobileIdNameQuery)((MobileIdNameQuery)ctx).objects.select()).select(UNREACHABLE_FILTER)).id(new int[][] { Constants.BANK_BOOTHS, Constants.BANK_COUNTERS, Constants.BANK_CHESTS }).nearest().limit(1)) {
      if (localTile.distanceTo(localGameObject) < localTile.distanceTo((Locatable)localObject)) {
        localObject = localGameObject;
      }
    }
    if (((Locatable)localObject).tile() != Tile.NIL) {
      return localObject;
    }
    return Tile.NIL;
  }
  




  public boolean present()
  {
    return nearest() != Tile.NIL;
  }
  


  public boolean inViewport()
  {
    return getBank().valid();
  }
  




  public boolean opened()
  {
    return ctx).widgets.component(762, 213).valid();
  }
  





  public boolean open()
  {
    if (opened()) {
      return true;
    }
    Interactive localInteractive = getBank();
    int i;
    if (localInteractive.valid()) {
      if ((localInteractive instanceof Npc)) {
        i = ((Npc)localInteractive).id();
      } else if ((localInteractive instanceof GameObject)) {
        i = ((GameObject)localInteractive).id();
      } else {
        i = -1;
      }
    } else {
      i = -1;
    }
    if (i == -1) {
      return false;
    }
    int j = -1;
    int[][] arrayOfInt = { Constants.BANK_NPCS, Constants.BANK_BOOTHS, Constants.BANK_CHESTS, Constants.BANK_COUNTERS };
    for (int k = 0; k < arrayOfInt.length; k++) {
      Arrays.sort(arrayOfInt[k]);
      if (Arrays.binarySearch(arrayOfInt[k], i) >= 0) {
        j = k;
        break;
      }
    }
    if (j == -1) {
      return false;
    }
    final Filter local2 = new Filter()
    {
      public boolean accept(MenuCommand arg0) {
        String str = action;
        return (str.equalsIgnoreCase("Use")) || (str.equalsIgnoreCase("Open")) || (str.equalsIgnoreCase("Bank"));
      }
    };
    String[] arrayOfString1 = { "Bank", "Bank", null, "Bank" };
    String[] arrayOfString2 = { null, "Bank booth", null, "Counter" };
    if ((arrayOfString1[j] == null) && 
      (localInteractive.hover())) {
      Condition.wait(new Condition.Check()
      {

        public boolean poll() { return ctx).menu.indexOf(local2) != -1; } }, 100, 3);
    }
    


    String str = arrayOfString1[j];
    if (str != null ? localInteractive.interact(arrayOfString1[j], arrayOfString2[j]) : localInteractive
      .interact(local2)) {
      do {
        Condition.wait(new Condition.Check()
        {

          public boolean poll() { return (ctx).widgets.widget(13).component(0).visible()) || (opened()); } }, 150, 15);

      }
      while (ctx).players.local().inMotion());
      
      Condition.wait(new Condition.Check()
      {

        public boolean poll() { return (ctx).widgets.widget(13).component(0).visible()) || (opened()); } }, 100, 15);
    }
    

    return opened();
  }
  




  public boolean close()
  {
    (!opened()) || (
      (Random.nextBoolean() ? ctx).input.send("{VK_ESCAPE}") : ctx).widgets
      .component(762, 517).click("Close")) && 
      (Condition.wait(new Condition.Check()
      {

        public boolean poll() {
          return !opened(); } }, 150)));
  }
  





  protected List<Item> get()
  {
    Component localComponent1 = ctx).widgets.component(762, 213);
    if ((localComponent1 == null) || (!localComponent1.valid())) {
      return new ArrayList();
    }
    Component[] arrayOfComponent1 = localComponent1.components();
    ArrayList localArrayList = new ArrayList(arrayOfComponent1.length);
    for (Component localComponent2 : arrayOfComponent1) {
      int k = localComponent2.itemId();
      if (k != -1) {
        localArrayList.add(new Item((ClientContext)ctx, k, localComponent2.itemStackSize(), localComponent2));
      }
    }
    return localArrayList;
  }
  





  public Item itemAt(int arg0)
  {
    Component localComponent = ctx).widgets.component(762, 213).component(arg0);
    if (localComponent.itemId() != -1) {
      return new Item((ClientContext)ctx, localComponent);
    }
    return nil();
  }
  





  public int indexOf(int arg0)
  {
    Component localComponent = ctx).widgets.component(762, 213);
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
  


  public int currentTab()
  {
    return ((ctx).varpbits.varpbit(110) >>> 24) - 136) / 8;
  }
  





  public boolean currentTab(final int arg0)
  {
    Component localComponent = ctx).widgets.component(762, 150 + arg0 * 8);
    (localComponent.click()) && (Condition.wait(new Condition.Check()
    {

      public boolean poll() { return currentTab() == arg0; } }, 100, 8));
  }
  







  public Item tabItem(int arg0)
  {
    Component localComponent = ctx).widgets.component(762, 150 + arg0 * 8);
    if ((localComponent != null) && (localComponent.valid())) {
      return new Item((ClientContext)ctx, localComponent);
    }
    return nil();
  }
  






  public boolean withdraw(int arg0, Amount arg1)
  {
    return withdraw(arg0, arg1.getValue());
  }
  






  public boolean withdraw(int arg0, int arg1)
  {
    return withdraw((Item)((ItemQuery)select()).id(new int[] { arg0 }).poll(), arg1);
  }
  






  public boolean withdraw(Item arg0, int arg1)
  {
    return withdraw0(arg0, arg1, false);
  }
  







  public boolean withdrawToBoB(int arg0, int arg1)
  {
    return withdraw((Item)((ItemQuery)select()).id(new int[] { arg0 }).poll(), arg1);
  }
  







  public boolean withdrawToBoB(Item arg0, int arg1)
  {
    return withdraw0(arg0, arg1, true);
  }
  
  boolean withdraw0(Item arg0, int arg1, boolean arg2) {
    Component localComponent1 = ctx).widgets.component(762, 213);
    if ((!localComponent1.valid()) || (!arg0.valid())) {
      return false;
    }
    final Component localComponent2 = arg0.component();
    if ((relativePointy == 0) && 
      (!currentTab(0) && (Condition.wait(new Condition.Check()
    {
      public boolean poll() {
        return localComponent2relativePointy != 0;
      }
    }, 100, 10)))
    {




      return false;
    }
    
    Rectangle localRectangle = localComponent1.viewportRect();
    if ((!localRectangle.contains(localComponent2.viewportRect())) && (!ctx).widgets.scroll(localComponent2, ctx).widgets.component(762, 207), localRectangle
      .contains(ctx).input.getLocation())))) {
      return false;
    }
    
    String str = "Withdraw-" + arg1;
    
    if (arg1 != 1) {
      if (arg2) {
        str = "fall";
      } else if ((arg1 == 0) || (
        (arg0.stackSize() <= arg1) && (arg1 != 5) && (arg1 != 10))) {
        str = "Withdraw-All";
      } else if ((arg1 == -1) || (arg1 == arg0.stackSize() - 1))
        str = "Withdraw-All but one";
    }
    final int i = ctx).backpack.moneyPouchCount() + ((ItemQuery)ctx).backpack.select()).count(true);
    if ((arg1 != 0) && (!containsAction(localComponent2, str))) {
      if ((localComponent2.interact(arg2 ? "Withdraw-X to Bob" : "Withdraw-X")) && (Condition.wait(new Condition.Check()
      {
        public boolean poll() {
          return Bank.this.isInputWidgetOpen();
        }
      })))
      {




        Condition.sleep();
        ctx).input.sendln(arg1 + "");
      }
    }
    else if (!localComponent2.interact(str)) {
      return false;
    }
    
    (arg2) || (Condition.wait(new Condition.Check()
    {
      public boolean poll() {
        return ctx).backpack.moneyPouchCount() + ((ItemQuery)ctx).backpack.select()).count(true) != i;
      }
    }));
  }
  






  public boolean deposit(int arg0, Amount arg1)
  {
    return deposit(arg0, arg1.getValue());
  }
  






  public boolean deposit(int arg0, int arg1)
  {
    if ((!opened()) || (arg1 < 0)) {
      return false;
    }
    Item localItem = (Item)((ItemQuery)((ItemQuery)ctx).backpack.select()).id(new int[] { arg0 }).shuffle()).poll();
    if (!localItem.valid()) {
      return false;
    }
    String str = "Deposit-" + arg1;
    int i = ((ItemQuery)ctx).backpack.select()).id(new int[] { arg0 }).count(true);
    if (i == 1) {
      str = "Deposit";
    } else if ((arg1 == 0) || (i <= arg1)) {
      str = "Deposit-All";
    }
    final int j = ((ItemQuery)ctx).backpack.select()).count(true);
    Component localComponent = localItem.component();
    if ((arg1 != 0) && (!containsAction(localComponent, str))) {
      if ((localComponent.interact("Deposit-X")) && (Condition.wait(new Condition.Check()
      {
        public boolean poll() {
          return Bank.this.isInputWidgetOpen();
        }
      })))
      {




        Condition.sleep();
        ctx).input.sendln(arg1 + "");
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
        return j != ((ItemQuery)ctx).backpack.select()).count(true);
      }
    });
  }
  





  public boolean depositAllExcept(final int... arg0)
  {
    depositAllExcept(new Filter()
    {
      public boolean accept(Item arg0) {
        int i = arg0.id();
        for (int m : arg0) {
          if (i == m) {
            return true;
          }
        }
        return false;
      }
    });
  }
  





  public boolean depositAllExcept(final String... arg0)
  {
    depositAllExcept(new Filter()
    {
      public boolean accept(Item arg0) {
        for (String str : arg0) {
          if (str != null)
          {

            if (arg0.name().toLowerCase().contains(str.toLowerCase()))
              return true;
          }
        }
        return false;
      }
    });
  }
  





  public boolean depositAllExcept(Filter<Item> arg0)
  {
    if (((ItemQuery)((ItemQuery)ctx).backpack.select()).select(arg0)).count() == 0) {
      return depositInventory();
    }
    for (Item localItem : (ItemQuery)((ItemQuery)ctx).backpack.select()).shuffle()) {
      if (!arg0.accept(localItem))
      {

        deposit(localItem.id(), Amount.ALL);
      }
    }
    return ((ItemQuery)ctx).backpack.select()).count() == ((ItemQuery)ctx).backpack.select(arg0)).count();
  }
  




  public boolean depositInventory()
  {
    return (ctx).backpack.get().isEmpty()) || (ctx).widgets.component(762, 76).click());
  }
  




  public boolean depositEquipment()
  {
    return ctx).widgets.component(762, 78).click();
  }
  




  public boolean depositFamiliar()
  {
    return ctx).widgets.component(762, 82).click();
  }
  




  public boolean depositMoneyPouch()
  {
    return (ctx).backpack.moneyPouchCount() == 0) || (ctx).widgets.component(762, 84).click());
  }
  
  public boolean openPresetSetup() {
    return ctx).widgets.component(762, 1).component(0).click();
  }
  
  public boolean presetGear1() {
    return presetGear(1);
  }
  
  public boolean presetGear2() {
    return presetGear(2);
  }
  
  public boolean presetGear(int arg0) {
    return presetGear(arg0, false);
  }
  
  public boolean presetGear(int arg0, boolean arg1) {
    if (!opened()) {
      return false;
    }
    
    if (((arg0 == 1) || (arg0 == 2)) && (arg1) && (!isInputWidgetOpen())) {
      ctx).input.send(Integer.toString(arg0));
      return true;
    }
    switch (arg0) {
    case 1: 
      return ctx).widgets.component(762, 1).component(1).click();
    
    case 2: 
      return ctx).widgets.component(762, 1).component(2).click();
    
    case 3: 
      return ctx).widgets.component(762, 1).component(3).click();
    
    case 4: 
      return ctx).widgets.component(762, 1).component(4).click();
    
    case 5: 
      return ctx).widgets.component(762, 1).component(5).click();
    
    case 6: 
      return ctx).widgets.component(762, 1).component(6).click();
    
    case 7: 
      return ctx).widgets.component(762, 1).component(7).click();
    
    case 8: 
      return ctx).widgets.component(762, 1).component(8).click();
    
    case 9: 
      return ctx).widgets.component(762, 1).component(9).click();
    
    case 10: 
      return ctx).widgets.component(762, 1).component(10).click();
    }
    
    return false;
  }
  






  public boolean withdrawMode(final boolean arg0)
  {
    (withdrawMode() == arg0) || ((ctx).widgets.component(762, 54).click()) && (Condition.wait(new Condition.Check()
    {
      public boolean poll() {
        return withdrawMode() == arg0;
      }
    })));
  }
  




  public boolean withdrawMode()
  {
    return ctx).varpbits.varpbit(160) == 1;
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
    ALL_BUT_ONE,  ALL,  ONE,  FIVE(5),  TEN(10);
    
    private final int value;
    
    private Amount() {
      value = (ordinal() - 1);
    }
    
    private Amount(int arg2) {
      value = arg2;
    }
    
    public int getValue() {
      return value;
    }
  }
}
