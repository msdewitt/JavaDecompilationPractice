package org.powerbot.script.rt6;

import org.powerbot.script.Condition.Check;

public class ProductionInterface extends ClientAccessor
{
  private static final int START_BUTTON_COMPONENT = 12;
  private static final int PROGRESS_INTERFACE_COMPONENT = 11;
  private static final int ITEM_SELECTION_PANE_COMPONENT = 44;
  private static final int ITEM_SCROLLBAR_COMPONENT = 47;
  
  public ProductionInterface(ClientContext arg0)
  {
    super(arg0);
  }
  

  private static final int SELECTED_AMOUNT_COMPONENT = 145;
  
  private static final int AMOUNT_SCROLL_BAR_COMPONENT = 148;
  
  private static final int MAX_AMOUNT_COMPONENT = 35;
  
  private static final int SELECTED_CATEGORY_COMPONENT = 51;
  
  private static final int CATEGORY_SELECTION_COMBOBOX_COMPONENT = 60;
  
  private static final int CATEGORY_SELECTION_SCROLL_BAR_COMPONENT = 61;
  
  private static final int AMOUNT_INPUT_BOX_COMPONENT = 72;
  
  private static final int MAIN_INTERFACE_WIDGET = 1371;
  private static final int ITEM_INFO_INTERFACE_WIDGET = 1370;
  private static final int PROGRESS_INTERFACE_WIDGET = 1251;
  private static final int CHOOSE_TOOL_WIDGET = 1179;
  private static final int SELECTED_ITEM_VARPBIT = 1170;
  private static final int SELECTED_AMOUNT_VARPBIT = 312;
  private static final int CLOSE_BUTTON_TEXTURE = 5450;
  private static long workingTimeLimit = -1L;
  
  private boolean categoryComboOpened() {
    return ctx).widgets.component(1371, 60).visible();
  }
  




  public String selectedCategory()
  {
    return ctx).widgets.component(1371, 51).component(0).text();
  }
  





  public boolean selectCategory(final String arg0)
  {
    if (selectedCategory().toLowerCase().contains(arg0.toLowerCase())) {
      return true;
    }
    if (!categoryComboOpened()) {
      localComponent1 = ctx).widgets.component(1371, 51);
      if ((!localComponent1.valid()) || (!localComponent1.click())) {
        return false;
      }
      
      if (!org.powerbot.script.Condition.wait(new Condition.Check()
      {
        public boolean poll() {
          return ProductionInterface.this.categoryComboOpened();
        }
      }, 250, 10))
      {




        return false;
      }
    }
    Component localComponent1 = findTextComponent(1371, arg0);
    if ((localComponent1 == null) || (!localComponent1.valid())) {
      return false;
    }
    Component localComponent2 = ctx).widgets.component(1371, 60);
    Component localComponent3 = ctx).widgets.component(1371, 61);
    (ctx).widgets.scroll(localComponent1, localComponent2, localComponent3, true)) && (localComponent1.click() && (org.powerbot.script.Condition.wait(new Condition.Check()
    {

      public boolean poll() { return selectedCategory().toLowerCase().contains(arg0.toLowerCase()); } }, 350, 10));
  }
  







  public int selectedItemId()
  {
    return ctx).varpbits.varpbit(1170);
  }
  





  public boolean itemSelected(int arg0)
  {
    return selectedItemId() == arg0;
  }
  




  public boolean opened()
  {
    return selectedItemId() != -1;
  }
  





  public boolean makeItem(boolean arg0)
  {
    (arg0 ? ctx).input.send("{VK_SPACE}") : ctx).widgets.component(1370, 12).click()) && (org.powerbot.script.Condition.wait(new Condition.Check()
    {

      public boolean poll() { return working(); } }, 300, 10));
  }
  






  public boolean makeItem()
  {
    return makeItem(false);
  }
  






  public boolean makeable(int arg0)
  {
    if (!opened()) {
      return false;
    }
    
    Component localComponent = findItemComponent(1371, new int[] { arg0 });
    return (localComponent != null) && (ctx).widgets.component(1371, 44).component(localComponent.index() + 1).textureId() == -1);
  }
  






  public boolean selectItem(final int arg0)
  {
    if (itemSelected(arg0)) {
      return true;
    }
    Component localComponent1 = findItemComponent(1371, new int[] { arg0 });
    if (localComponent1 == null) {
      return false;
    }
    Component localComponent2 = ctx).widgets.component(1371, 44);
    Component localComponent3 = ctx).widgets.component(1371, 47);
    (ctx).widgets.scroll(localComponent1, localComponent2, localComponent3, true)) && (localComponent1.click() && (org.powerbot.script.Condition.wait(new Condition.Check()
    {

      public boolean poll() { return itemSelected(arg0); } }, 350, 8));
  }
  







  public boolean close(boolean arg0)
  {
    if (!opened()) {
      return true;
    }
    boolean bool;
    if (arg0) {
      bool = ctx).input.send("{VK_ESCAPE");
    } else {
      Component localComponent = findTextureComponent(1370, 5450);
      bool = (localComponent != null) && (localComponent.click());
    }
    (bool) && (org.powerbot.script.Condition.wait(new Condition.Check()
    {

      public boolean poll() { return !opened(); } }, 250, 10));
  }
  






  public boolean close()
  {
    return close(false);
  }
  




  public int selectedAmount()
  {
    return ctx).varpbits.varpbit(312, 26, 31);
  }
  




  public boolean maxSelected()
  {
    return ctx).widgets.component(1371, 145).width() == 170;
  }
  




  public boolean selectMax()
  {
    if (maxSelected()) {
      return true;
    }
    
    Widgets localWidgets = ctx).widgets;
    return (ctx).input.move(localWidgets.component(1371, 148).nextPoint())) && (ctx).input.drag(localWidgets.component(1371, 35).nextPoint(), true)) && (maxSelected());
  }
  





  public boolean selectAmount(final int arg0)
  {
    if (selectedAmount() == arg0) {
      return true;
    }
    final Component localComponent = ctx).widgets.component(1370, 72);
    if (!localComponent.visible()) {
      if (!localComponent.click()) {
        return false;
      }
      if (!org.powerbot.script.Condition.wait(new Condition.Check()
      {
        public boolean poll() {
          return localComponent.visible();
        }
      }, 250, 10))
      {




        return false;
      }
    }
    (ctx).input.sendln(String.valueOf(arg0))) && (org.powerbot.script.Condition.wait(new Condition.Check()
    {

      public boolean poll() { return (selectedAmount() == arg0) || (maxSelected()); } }, 300, 10));
  }
  






  public boolean working()
  {
    return progressInterfaceEnabled() ? ctx).widgets.component(1251, 11).visible() : workingByAnimation();
  }
  




  public boolean toolSelectionOpened()
  {
    return ctx).widgets.widget(1179).valid();
  }
  





  public boolean selectTool(int... arg0)
  {
    if (!toolSelectionOpened()) {
      return opened();
    }
    Component localComponent = findItemComponent(1179, arg0);
    (localComponent != null) && (localComponent.valid() && (localComponent.click() && (org.powerbot.script.Condition.wait(new Condition.Check()
    {

      public boolean poll() { return opened(); } }, 10, 250));
  }
  


  private boolean workingByAnimation()
  {
    if (ctx).players.local().animation() != -1) {
      workingTimeLimit = System.currentTimeMillis() + (org.powerbot.script.Random.nextDouble(2.5D, 4.0D) * 1000.0D);
      return true;
    }
    return System.currentTimeMillis() < workingTimeLimit;
  }
  
  private boolean progressInterfaceEnabled() {
    return ctx).varpbits.varpbit(1173, 31, 1) == 0;
  }
  
  private Component findTextureComponent(int arg0, final int arg1)
  {
    findComponent(arg0, new org.powerbot.script.Filter()
    {
      public boolean accept(Component arg0) {
        return arg0.textureId() == arg1;
      }
    });
  }
  
  private Component findTextComponent(int arg0, String arg1) {
    final String str = arg1.toLowerCase();
    findComponent(arg0, new org.powerbot.script.Filter()
    {
      public boolean accept(Component arg0) {
        return arg0.text().toLowerCase().contains(str);
      }
    });
  }
  
  private Component findItemComponent(int arg0, final int... arg1) {
    findComponent(arg0, new org.powerbot.script.Filter()
    {
      public boolean accept(Component arg0) {
        int i = arg0.itemId();
        for (int m : arg1) {
          if (i == m) {
            return true;
          }
        }
        return false;
      }
    });
  }
  
  private Component findComponent(int arg0, org.powerbot.script.Filter<Component> arg1) {
    for (Component localComponent1 : ctx).widgets.widget(arg0)) {
      if (arg1.accept(localComponent1)) {
        return localComponent1;
      }
      for (Component localComponent2 : localComponent1.components()) {
        if (arg1.accept(localComponent2)) {
          return localComponent2;
        }
      }
    }
    return null;
  }
}
