package org.powerbot.script.rt4;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.StringUtils;

public class Prayer
  extends ClientAccessor
{
  public Prayer(ClientContext arg0)
  {
    super(arg0);
  }
  
  public int prayerPoints() {
    return StringUtils.parseInt(ctx).widgets.component(160, 15).text());
  }
  
  @Deprecated
  public int points() {
    return prayerPoints();
  }
  
  public boolean prayersActive() {
    return ctx).varpbits.varpbit(83) > 0;
  }
  
  @Deprecated
  public boolean praying() {
    return prayersActive();
  }
  
  public boolean quickPrayer() {
    return ctx).varpbits.varpbit(375, 1) == 1;
  }
  
  public boolean quickPrayer(final boolean arg0) {
    (quickPrayer() == arg0) || ((ctx).widgets.component(160, 14).click()) && (Condition.wait(new Callable()
    {

      public Boolean call() throws Exception { return Boolean.valueOf(quickPrayer() == arg0); } }, 300, 6)));
  }
  

  public boolean quickSelectionActive()
  {
    return ctx).widgets.widget(77).component(0).valid();
  }
  
  public boolean prayerActive(Effect arg0) {
    return ctx).varpbits.varpbit(83, arg0.ordinal(), 1) == 1;
  }
  
  public boolean prayer(Effect arg0, boolean arg1) {
    if (ctx).skills.realLevel(5) < arg0.level()) {
      return false;
    }
    if (prayerActive(arg0) == arg1) {
      return true;
    }
    if (ctx).game.tab(Game.Tab.PRAYER)) {
      return ctx).widgets.component(541, arg0.index()).interact(arg1 ? "Activate" : "Deactivate");
    }
    return prayerActive(arg0) == arg1;
  }
  
  public boolean quickSelection(final boolean arg0) {
    if (quickSelectionActive() == arg0) {
      return true;
    }
    if (arg0) {
      if (!ctx).widgets.component(160, 14).interact("Setup", "Quick-prayers")) {
        return false;
      }
    }
    else if ((!ctx).game.tab(Game.Tab.PRAYER)) || (!ctx).widgets.component(77, 6).interact("Done"))) {
      return false;
    }
    

    Condition.wait(new Condition.Check()
    {

      public boolean poll() { return quickSelectionActive() == arg0; } }, 150, 10);
  }
  

  public boolean prayerQuick(Effect arg0)
  {
    return ctx).varpbits.varpbit(84, arg0.ordinal(), 1) == 1;
  }
  
  public Effect[] activePrayers() {
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    for (Effect localEffect : Effect.values()) {
      if (prayerActive(localEffect)) {
        localLinkedHashSet.add(localEffect);
      }
    }
    return (Effect[])localLinkedHashSet.toArray(new Effect[localLinkedHashSet.size()]);
  }
  
  public Effect[] quickPrayers() {
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    for (Effect localEffect : Effect.values()) {
      if (prayerQuick(localEffect)) {
        localLinkedHashSet.add(localEffect);
      }
    }
    return (Effect[])localLinkedHashSet.toArray(new Effect[localLinkedHashSet.size()]);
  }
  
  public boolean quickPrayers(Effect... arg0)
  {
    if ((!quickSelectionActive()) && 
      (!quickSelection(true))) {
      return false;
    }
    
    if ((quickSelectionActive()) && (ctx).game.tab(Game.Tab.PRAYER))) { Effect localEffect;
      for (localEffect : arg0) {
        if (!prayerQuick(localEffect))
        {


          if (ctx).widgets.component(77, 4).component(localEffect.quickSelectIndex()).interact("Toggle")) {
            Condition.sleep();
          }
        }
      }
      for (localEffect : quickPrayers()) {
        if ((prayerQuick(localEffect)) && (!search(arg0, localEffect)) && 
          (ctx).widgets.component(77, 4).component(localEffect.quickSelectIndex()).interact("Toggle"))) {
          Condition.sleep();
        }
      }
    }
    

    for (int i = 0; i < 3; i++) {
      if (!quickSelectionActive()) {
        break;
      }
      quickSelection(false);
    }
    return !quickSelectionActive();
  }
  
  private boolean search(Effect[] arg0, Effect arg1) {
    for (Effect localEffect : arg0) {
      if (localEffect.index() == arg1.index()) {
        return true;
      }
    }
    return false;
  }
  
  public static enum Effect
  {
    THICK_SKIN(4, 1), 
    BURST_OF_STRENGTH(5, 4), 
    CLARITY_OF_THOUGHT(6, 7), 
    ROCK_SKIN(7, 10), 
    SUPERHUMAN_STRENGTH(8, 13), 
    IMPROVED_REFLEXES(9, 16), 
    RAPID_RESTORE(10, 19), 
    RAPID_HEAL(11, 22), 
    PROTECT_ITEM(12, 25), 
    STEEL_SKIN(13, 28), 
    ULTIMATE_STRENGTH(14, 31), 
    INCREDIBLE_REFLEXES(15, 34), 
    PROTECT_FROM_MAGIC(16, 37), 
    PROTECT_FROM_MISSILES(17, 40), 
    PROTECT_FROM_MELEE(18, 43), 
    RETRIBUTION(19, 46), 
    REDEMPTION(20, 49), 
    SMITE(21, 52), 
    SHARP_EYE(22, 8), 
    MYSTIC_WILL(23, 9), 
    HAWK_EYE(24, 26), 
    MYSTIC_LORE(25, 27), 
    EAGLE_EYE(26, 44), 
    MYSTIC_MIGHT(27, 45), 
    RIGOUR(30, 74), 
    CHIVALRY(28, 60), 
    PIETY(29, 70), 
    AUGURY(31, 77), 
    PRESERVE(32, 55);
    
    private final int index;
    private final int level;
    
    private Effect(int arg2, int arg3) { index = arg2;
      level = arg3;
    }
    
    public int index() {
      return index;
    }
    
    public int level() {
      return level;
    }
    
    public int quickSelectIndex() {
      return ordinal();
    }
  }
}
