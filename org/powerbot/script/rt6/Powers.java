package org.powerbot.script.rt6;

import java.util.LinkedHashSet;
import java.util.Set;
import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;


public class Powers
  extends ClientAccessor
{
  public Powers(ClientContext arg0)
  {
    super(arg0);
  }
  




  public int prayerPoints()
  {
    return (ctx).varpbits.varpbit(3274) & 0x7FFF) / 10;
  }
  




  public int prayerBook()
  {
    return ctx).varpbits.varpbit(3277) % 2 != 0 ? 21 : 20;
  }
  




  public boolean quickSelectionActive()
  {
    return ctx).varpbits.varpbit(1769) == 1;
  }
  




  public boolean quickPrayersActive()
  {
    return ctx).varpbits.varpbit(1769) == 2;
  }
  



  public boolean prayerActive(Effect arg0)
  {
    int i;
    

    if ((arg0 instanceof Prayer)) {
      i = 3272;
    } else if ((arg0 instanceof Curse)) {
      i = 3275;
    } else {
      return false;
    }
    int j = arg0.index();
    if (j >= 32) {
      j -= 32;
      i += 2584;
    }
    return (ctx).varpbits.varpbit(i) >>> j & 0x1) == 1;
  }
  



  public boolean prayerQuick(Effect arg0)
  {
    int i;
    

    if ((arg0 instanceof Prayer)) {
      i = 1770;
    } else if ((arg0 instanceof Curse)) {
      i = 1768;
    } else {
      i = -1;
    }
    return (ctx).varpbits.varpbit(i) >>> arg0.index() & 0x1) == 1;
  }
  




  public Effect[] activePrayers()
  {
    int i = prayerBook();
    Object localObject1;
    switch (i) {
    case 20: 
      localObject1 = Prayer.values();
      break;
    case 21: 
      localObject1 = Curse.values();
      break;
    default: 
      localObject1 = new Effect[0];
    }
    
    
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    for (Effect localEffect : localObject1) {
      if (prayerActive(localEffect)) {
        localLinkedHashSet.add(localEffect);
      }
    }
    return (Effect[])localLinkedHashSet.toArray(new Effect[localLinkedHashSet.size()]);
  }
  




  public Effect[] quickPrayers()
  {
    int i = prayerBook();
    Object localObject1;
    switch (i) {
    case 20: 
      localObject1 = Prayer.values();
      break;
    case 21: 
      localObject1 = Curse.values();
      break;
    default: 
      localObject1 = new Effect[0];
    }
    
    
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    for (Effect localEffect : localObject1) {
      if (prayerQuick(localEffect)) {
        localLinkedHashSet.add(localEffect);
      }
    }
    return (Effect[])localLinkedHashSet.toArray(new Effect[localLinkedHashSet.size()]);
  }
  





  public boolean quickSelection(final boolean arg0)
  {
    if (quickSelectionActive() == arg0) {
      return true;
    }
    if (ctx).hud.legacy() ? ctx).hud.open(Hud.Window.PRAYER_ABILITIES) : ctx).hud.opened(Hud.Window.PRAYER_ABILITIES)) {
      if (arg0) {
        if (!ctx).widgets.component(1458, 39).interact("Select")) {
          return false;
        }
      }
      else if (!ctx).widgets.component(1458, 4).interact("Confirm")) {
        return false;
      }
      
    }
    else if (!ctx).widgets.component(1430, 13).interact(arg0 ? "Select quick" : "Finish")) {
      return false;
    }
    
    Condition.wait(new Condition.Check()
    {

      public boolean poll() { return quickSelectionActive() == arg0; } }, 150, 10);
  }
  







  public boolean quickPrayers(final boolean arg0)
  {
    if (quickPrayersActive() != arg0) {} ((ctx).hud.legacy() ? ctx).widgets.component(1505, 1) : ctx).widgets.component(1430, 13)).interact(arg0 ? "on" : "off")) && (Condition.wait(new Condition.Check()
    {

      public boolean poll() { return quickPrayersActive() == arg0; } }, 150, 10));
  }
  








  public boolean prayer(Effect arg0, boolean arg1)
  {
    if (ctx).skills.level(5) < arg0.level()) {
      return false;
    }
    if (prayerActive(arg0) == arg1) {
      return true;
    }
    if (ctx).hud.open(Hud.Window.PRAYER_ABILITIES)) {
      return ctx).widgets.component(1458, 32).component(arg0.id()).interact(arg1 ? "Activate" : "Deactivate");
    }
    return prayerActive(arg0) == arg1;
  }
  





  public boolean quickPrayers(Effect... arg0)
  {
    if (!quickSelectionActive()) {
      quickSelection(true);
    }
    if ((quickSelectionActive()) && (ctx).hud.open(Hud.Window.PRAYER_ABILITIES))) { Effect localEffect;
      for (localEffect : arg0) {
        if (!prayerQuick(localEffect))
        {

          if (ctx).widgets.component(1458, 34).component(localEffect.id()).interact("Select")) {
            Condition.sleep();
          }
        }
      }
      for (localEffect : quickPrayers()) {
        if ((prayerQuick(localEffect)) && (!search(arg0, localEffect)) && 
          (ctx).widgets.component(1458, 34).component(localEffect.id()).interact("Deselect"))) {
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
      if (localEffect.id() == arg1.id()) {
        return true;
      }
    }
    return false;
  }
  

  public static enum Prayer
    implements Powers.Effect
  {
    THICK_SKIN(0, 0, 1), 
    BURST_OF_STRENGTH(1, 1, 4), 
    CLARITY_OF_THOUGHT(2, 2, 7), 
    SHARP_EYE(3, 12, 8), 
    UNSTOPPABLE_FORCE(4, 14, 8), 
    MYSTIC_WILL(5, 13, 9), 
    CHARGE(6, 15, 9), 
    ROCK_SKIN(0, 0, 10), 
    SUPERHUMAN_STRENGTH(1, 1, 13), 
    IMPROVED_REFLEXES(2, 2, 16), 
    RAPID_RESTORE(7, 3, 19), 
    RAPID_HEAL(8, 4, 22), 
    PROTECT_ITEM_REGULAR(9, 5, 25), 
    HAWK_EYE(3, 12, 26), 
    UNRELENTING_FORCE(4, 14, 26), 
    MYSTIC_LORE(5, 13, 27), 
    SUPER_CHARGE(6, 15, 27), 
    STEEL_SKIN(0, 0, 28), 
    ULTIMATE_STRENGTH(1, 1, 31), 
    INCREDIBLE_REFLEXES(2, 2, 34), 
    PROTECT_FROM_SUMMONING(10, 16, 35), 
    PROTECT_FROM_MAGIC(11, 6, 37), 
    PROTECT_FROM_MISSILES(12, 7, 40), 
    PROTECT_FROM_MELEE(13, 8, 43), 
    EAGLE_EYE(3, 12, 44), 
    OVERPOWERING_FORCE(4, 14, 44), 
    MYSTIC_MIGHT(5, 13, 45), 
    OVERCHARGE(6, 15, 45), 
    RETRIBUTION(14, 9, 46), 
    REDEMPTION(15, 10, 49), 
    SMITE(16, 11, 52), 
    CHIVALRY(17, 17, 60), 
    RAPID_RENEWAL(18, 19, 65), 
    PIETY(19, 18, 70), 
    RIGOUR(20, 21, 74), 
    AUGURY(21, 20, 77);
    
    private final int id;
    private final int index;
    private final int level;
    
    private Prayer(int arg2, int arg3, int arg4) {
      id = arg2;
      index = arg3;
      level = arg4;
    }
    



    public int id()
    {
      return id;
    }
    



    public int index()
    {
      return index;
    }
    



    public int level()
    {
      return level;
    }
  }
  

  public static enum Curse
    implements Powers.Effect
  {
    PROTECT_ITEM_CURSE(0, 0, 50), 
    SAP_WARRIOR(1, 1, 50), 
    SAP_RANGER(2, 2, 52), 
    SAP_RANGE_STRENGTH(3, 25, 53), 
    SAP_MAGE(4, 3, 54), 
    SAP_MAGIC_STRENGTH(5, 24, 55), 
    SAP_SPIRIT(6, 4, 56), 
    SAP_DEFENCE(7, 27, 57), 
    SAP_STRENGTH(8, 26, 58), 
    BERSERKER(9, 5, 59), 
    DEFLECT_SUMMONING(10, 6, 62), 
    DEFLECT_MAGIC(11, 7, 65), 
    DEFLECT_MISSILE(12, 8, 68), 
    DEFLECT_MELEE(13, 9, 71), 
    LEECH_ATTACK(14, 10, 74), 
    LEECH_RANGED(15, 11, 76), 
    LEECH_RANGE_STRENGTH(16, 20, 77), 
    LEECH_MAGIC(17, 12, 78), 
    LEECH_MAGIC_STRENGTH(18, 21, 79), 
    LEECH_DEFENCE(19, 13, 80), 
    LIGHT_FORM(20, 29, 80), 
    DARK_FORM(21, 30, 80), 
    LEECH_STRENGTH(22, 14, 82), 
    LEECH_ENERGY(23, 15, 84), 
    LEECH_ADRENALINE(24, 16, 86), 
    CHRONICLE_ABSORPTION(25, 33, 87), 
    SOUL_LINK(26, 31, 88), 
    WRATH(27, 17, 89), 
    TEAMWORK_PROTECTION(28, 32, 89), 
    SUPERHEAT_FORM(29, 34, 91), 
    SOUL_SPLIT(30, 18, 92), 
    FORTITUDE(31, 28, 94), 
    TURMOIL(32, 19, 95), 
    ANGUISH(33, 22, 95), 
    TORMENT(34, 23, 95);
    
    private final int id;
    private final int index;
    private final int level;
    
    private Curse(int arg2, int arg3, int arg4) {
      id = arg2;
      index = arg3;
      level = arg4;
    }
    



    public int id()
    {
      return id;
    }
    



    public int index()
    {
      return index;
    }
    



    public int level()
    {
      return level;
    }
  }
  
  public static abstract interface Effect
  {
    public abstract int id();
    
    public abstract int index();
    
    public abstract int level();
  }
}
