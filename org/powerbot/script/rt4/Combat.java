package org.powerbot.script.rt4;

import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Filter;


public class Combat
  extends ClientAccessor
{
  private Component specialAttackComp = null;
  private Component retaliateComp = null;
  
  public Combat(ClientContext arg0) {
    super(arg0);
  }
  




  public int healthPercent()
  {
    return (int)(health() / maxHealth() * 100.0D);
  }
  




  public int health()
  {
    return ctx).skills.level(3);
  }
  




  public int maxHealth()
  {
    return ctx).skills.realLevel(3);
  }
  




  public int specialPercentage()
  {
    return ctx).varpbits.varpbit(300) / 10;
  }
  




  public boolean specialAttack()
  {
    return ctx).varpbits.varpbit(301) == 1;
  }
  




  public boolean inMultiCombat()
  {
    return ctx).varpbits.varpbit(1021, 5, 1) == 1;
  }
  






  public boolean specialAttack(final boolean arg0)
  {
    if (specialAttack() == arg0) {
      return true;
    }
    if (!ctx).game.tab(Game.Tab.ATTACK)) {
      return false;
    }
    Component localComponent = specialAttackComp == null ? (this.specialAttackComp = findTextComponent(593, "Special attack:")) : specialAttackComp;
    final int i = specialPercentage();
    (localComponent != null) && (localComponent.visible() && (localComponent.click() && (Condition.wait(new Condition.Check()
    {

      public boolean poll() { return (specialAttack() == arg0) || (specialPercentage() != i); } }, 300, 6));
  }
  






  public boolean autoRetaliate()
  {
    return ctx).varpbits.varpbit(172, 0, 1) == 0;
  }
  





  public boolean autoRetaliate(final boolean arg0)
  {
    if (autoRetaliate() == arg0) {
      return true;
    }
    if (!ctx).game.tab(Game.Tab.ATTACK)) {
      return false;
    }
    Component localComponent = retaliateComp == null ? (this.retaliateComp = findTextComponent(593, "Auto Retaliate")) : retaliateComp;
    (localComponent != null) && (localComponent.visible() && (localComponent.click() && (Condition.wait(new Condition.Check()
    {

      public boolean poll() { return autoRetaliate() == arg0; } }, 300, 6));
  }
  






  public Style style()
  {
    return Style.values()[ctx).varpbits.varpbit(43, 0, 3)];
  }
  





  public boolean style(final Style arg0)
  {
    if (style() == arg0) {
      return true;
    }
    if (!ctx).game.tab(Game.Tab.ATTACK)) {
      return false;
    }
    Component localComponent = comp == null ? comp = ctx).widgets.component(593, 4 + arg0.ordinal() * 4) : comp;
    (localComponent != null) && (localComponent.visible() && (localComponent.click() && (Condition.wait(new Condition.Check()
    {

      public boolean poll() { return style() == arg0; } }, 300, 6));
  }
  

  private Component findTextComponent(int arg0, String arg1)
  {
    final String str = arg1.toLowerCase();
    findComponent(arg0, new Filter()
    {
      public boolean accept(Component arg0) {
        return arg0.text().toLowerCase().contains(str);
      }
    });
  }
  
  private Component findComponent(int arg0, Filter<Component> arg1) {
    for (Component localComponent1 : ctx).widgets.widget(arg0).components()) {
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
  






  public static enum Style
  {
    ACCURATE, 
    AGGRESSIVE, 
    CONTROLLED, 
    DEFENSIVE;
    private Component comp = null;
    
    private Style() {}
  }
}
