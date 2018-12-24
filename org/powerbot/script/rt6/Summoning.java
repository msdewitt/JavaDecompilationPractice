package org.powerbot.script.rt6;

import java.util.ArrayList;
import java.util.List;
import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Filter;
import org.powerbot.script.Random;




public class Summoning
  extends ClientAccessor
{
  public final FamiliarInventory familiarInventory;
  
  public Summoning(ClientContext arg0)
  {
    super(arg0);
    familiarInventory = new FamiliarInventory(arg0);
  }
  




  public int points()
  {
    return ctx).skills.level(23);
  }
  




  public int timeLeft()
  {
    return (ctx).varpbits.varpbit(1786) >>> 6) * 30;
  }
  




  public int specialPoints()
  {
    return ctx).varpbits.varpbit(1787);
  }
  




  public boolean summoned()
  {
    return ctx).varpbits.varpbit(1784) > 0;
  }
  





  public boolean select(Option arg0)
  {
    return select(arg0.text());
  }
  






  public boolean select(String arg0)
  {
    Component localComponent = ctx).hud.legacy() ? ctx).widgets.component(1506, 2) : ctx).widgets.component(1430, 19);
    Object localObject; if (Option.RENEW_FAMILIAR.text().toLowerCase().contains(arg0.toLowerCase())) {
      localObject = familiar();
      if ((localObject != null) && (((Familiar)localObject).requiredPoints() <= specialPoints())) {} return 
        (((ItemQuery)ctx).backpack.select()).id(new int[] { ctx).varpbits.varpbit(1831) }).count() > 0) && (localComponent.interact(arg0));
    }
    if (Option.DISMISS.text().toLowerCase().contains(arg0.toLowerCase())) {
      if ((localComponent.interact(arg0)) && (Condition.wait(new Condition.Check()
      {
        public boolean poll() {
          return ((TextQuery)ctx).chat.select()).text(new String[] { "Yes" }).isEmpty();
        }
      })))
      {




        localObject = (ChatOption)ctx).chat.poll();
        if (((ChatOption)localObject).select(Random.nextBoolean())) {
          Condition.sleep();
          if (((ChatOption)localObject).select(Random.nextBoolean())) {
            Condition.wait(new Condition.Check()
            {
              public boolean poll() {
                return !summoned();
              }
            });
          }
        }
      }
      return false;
    }
    if (Option.CAST.text().toLowerCase().contains(arg0.toLowerCase())) {
      localObject = familiar();
      return (localObject != null) && (((Familiar)localObject).requiredSpecialPoints() <= specialPoints()) && 
        (localComponent.interact(arg0));
    }
    return localComponent.interact(arg0);
  }
  




  public Option clickOption()
  {
    int i = ctx).varpbits.varpbit(1789);
    for (Option localOption : Option.values()) {
      if (i == localOption.value()) {
        return localOption;
      }
    }
    return Option.FOLLOWER_DETAILS;
  }
  





  public boolean clickOption(final Option arg0)
  {
    if (ctx).varpbits.varpbit(1789) == arg0.value()) {
      return true;
    }
    
    if (!(ctx).hud.legacy() ? ctx).widgets.component(1506, 2) : ctx).widgets.component(1430, 19)).interact("Select")) {
      return false;
    }
    if (!Condition.wait(new Condition.Check()
    {
      public boolean poll() {
        return ctx).widgets.widget(880).valid();
      }
    }, 30, 100))
    {




      return false;
    }
    if (ctx).widgets.component(880, arg0.id()).interact("Select")) {
      Condition.wait(new Condition.Check()
      {

        public boolean poll() { return ctx).varpbits.varpbit(1790) == arg0.tentative(); } }, 150, 20);
    }
    

    Component localComponent = ctx).widgets.component(880, 6);
    for (int i = 0; i < 3; i++) {
      if (!localComponent.valid()) {
        break;
      }
      if (localComponent.interact("Confirm")) {
        Condition.wait(new Condition.Check()
        {

          public boolean poll() { return ctx).varpbits.varpbit(1789) == arg0.value(); } }, 150, 20);
      }
    }
    

    return ctx).varpbits.varpbit(1789) == arg0.value();
  }
  





  public Npc npc()
  {
    if (!summoned()) {
      return ctx).npcs.nil();
    }
    final Player localPlayer = ctx).players.local();
    int i = ctx).varpbits.varpbit(1784);
    





    (Npc)((MobileIdNameQuery)((MobileIdNameQuery)ctx).npcs.select()).id(new int[] { i, i + 1 }).select(new Filter()
    {
      public boolean accept(Npc arg0) {
        Actor localActor;
        return ((localActor = arg0.interacting()) != null) && (localActor.equals(localPlayer));
      }
    }))
    




      .nearest().poll();
  }
  




  public Familiar familiar()
  {
    if (!summoned()) {
      return null;
    }
    for (Familiar localFamiliar : Familiar.values()) {
      if (localFamiliar.pouchId() == ctx).varpbits.varpbit(1831)) {
        return localFamiliar;
      }
    }
    return null;
  }
  




  public boolean call()
  {
    Component localComponent = ctx).widgets.component(662, 49);
    return (localComponent != null) && (summoned()) && (localComponent.visible()) && (localComponent.interact("Call"));
  }
  




  public boolean dismiss()
  {
    Component localComponent = ctx).widgets.component(662, 51);
    return (localComponent != null) && (summoned()) && (localComponent.visible()) && (localComponent.interact("Dismiss Now"));
  }
  




  public boolean takeBoB()
  {
    Component localComponent = ctx).widgets.component(662, 67);
    return (localComponent != null) && (summoned()) && (localComponent.visible()) && (localComponent.interact("Take"));
  }
  




  public boolean renew()
  {
    Component localComponent = ctx).widgets.component(662, 69);
    return (localComponent != null) && (summoned()) && (localComponent.visible()) && (localComponent.interact("Renew"));
  }
  




  public boolean cast()
  {
    Component localComponent = ctx).widgets.component(662, 5);
    return (localComponent != null) && (summoned()) && (localComponent.visible()) && (localComponent.interact("Cast"));
  }
  




  public boolean attack()
  {
    Component localComponent = ctx).widgets.component(662, 65);
    return (localComponent != null) && (summoned()) && (localComponent.visible()) && (localComponent.interact("Attack"));
  }
  


  public static enum Familiar
  {
    SPIRIT_WOLF(12047, 1, 0, 1, 12533, 3), 
    DREADFOWL(12043, 4, 0, 1, 12445, 3), 
    MEERKATS(19622, 4, 0, 1, 19621, 12), 
    SPIRIT_SPIDER(12059, 10, 0, 2, 12428, 6), 
    THORNY_SNAIL(12019, 13, 3, 2, 12459, 3), 
    GRANITE_CRAB(12009, 16, 0, 2, 12533, 12), 
    SPIRIT_MOSQUITO(12778, 17, 0, 2, 12838, 3), 
    DESERT_WYRM(12049, 18, 0, 1, 12460, 6), 
    SPIRIT_SCORPION(12055, 19, 0, 2, 12432, 6), 
    SPIRIT_TZ_KIH(12808, 22, 0, 3, 12839, 6), 
    ALBINO_RAT(12067, 23, 0, 3, 12430, 6), 
    SPIRIT_KALPHITE(12063, 25, 6, 3, 12446, 6), 
    COMPOST_MOUND(12091, 28, 0, 6, 12440, 12), 
    GIANT_CHINCHOMPA(12800, 29, 0, 1, 12834, 3), 
    VAMPYRE_BAT(12053, 31, 0, 4, 12447, 4), 
    HONEY_BADGER(12065, 32, 0, 4, 12433, 4), 
    BEAVER(12021, 33, 0, 4, 12429, 3), 
    VOID_RAVAGER(12818, 34, 0, 4, 12443, 3), 
    VOID_SPINNER(12780, 34, 0, 4, 12443, 3), 
    VOID_SHIFTER(12814, 34, 0, 4, 12443, 3), 
    VOID_TORCHER(12798, 34, 0, 4, 12443, 3), 
    BRONZE_MINOTAUR(12073, 36, 0, 9, 12462, 6), 
    BULL_ANT(12087, 40, 8, 5, 12431, 12), 
    MACAW(12071, 41, 0, 5, 12422, 12), 
    EVIL_TURNIP(12051, 42, 0, 5, 12448, 6), 
    SPIRIT_COCKATRICE(12095, 43, 0, 5, 12458, 3), 
    SPIRIT_GUTHATRICE(12097, 43, 0, 5, 12458, 3), 
    SPIRIT_SARATRICE(12099, 43, 0, 5, 12458, 3), 
    SPIRIT_ZAMATRICE(12101, 43, 0, 5, 12458, 3), 
    SPIRIT_PENGATRICE(12103, 43, 0, 5, 12458, 3), 
    SPIRIT_CORAXATRICE(12105, 43, 0, 5, 12458, 3), 
    SPIRIT_VULATRICE(12107, 43, 0, 5, 12458, 3), 
    IRON_MINOTAUR(12075, 46, 0, 9, 12463, 6), 
    PYRELORD(12816, 46, 0, 5, 12829, 6), 
    MAGPIE(12041, 47, 0, 5, 12426, 3), 
    BLOATED_LEECH(12061, 49, 0, 5, 12444, 6), 
    SPIRIT_TERRORBIRD(12007, 52, 12, 6, 12441, 8), 
    ABYSSAL_PARASITE(12035, 54, 7, 6, 12454, 6), 
    SPIRIT_JELLY(12027, 55, 0, 6, 12453, 6), 
    STEEL_MINOTAUR(12077, 56, 0, 9, 12464, 6), 
    IBIS(12531, 56, 0, 6, 12424, 12), 
    SPIRIT_GRAAHK(12810, 57, 0, 6, 12835, 3), 
    SPIRIT_KYATT(12812, 57, 0, 6, 12836, 3), 
    SPIRIT_LARUPIA(12784, 57, 0, 6, 12840, 6), 
    KARAMTHULHU_OVERLORD(12023, 58, 0, 6, 12455, 3), 
    SMOKE_DEVIL(12085, 61, 0, 7, 12468, 6), 
    ABYSSAL_LURKER(12037, 62, 7, 7, 12427, 3), 
    SPIRIT_COBRA(12015, 63, 0, 7, 12436, 3), 
    STRANGER_PLANT(12045, 64, 0, 7, 12467, 6), 
    MITHRIL_MINOTAUR(12079, 66, 0, 9, 12465, 6), 
    BARKER_TOAD(12123, 66, 0, 7, 12452, 6), 
    WAR_TORTOISE(12031, 67, 18, 7, 12439, 20), 
    BUNYIP(12029, 68, 0, 7, 12438, 3), 
    FRUIT_BAT(12033, 69, 0, 7, 12423, 6), 
    RAVENOUS_LOCTUS(12820, 70, 0, 4, 12830, 12), 
    ARTIC_BEAR(12057, 71, 0, 8, 12451, 6), 
    PHOENIX(14623, 72, 0, 8, 14622, 5), 
    OBSIDIAN_GOLEM(12792, 73, 0, 8, 12826, 12), 
    GRANITE_LOBSTER(12069, 74, 0, 8, 12449, 6), 
    PRAYING_MANTRIS(12011, 75, 0, 8, 12450, 6), 
    ADAMANT_MINOTAUR(12081, 76, 0, 9, 12466, 6), 
    FORGE_REGENT(12782, 76, 0, 9, 12841, 6), 
    TALON_BEAST(12794, 77, 0, 9, 12831, 6), 
    GIANT_ENT(12013, 78, 0, 8, 12457, 6), 
    FIRE_TITAN(12802, 79, 0, 9, 12824, 20), 
    ICE_TITAN(12806, 79, 0, 9, 12824, 20), 
    MOSS_TITAN(12804, 79, 0, 9, 12824, 20), 
    HYDRA(12025, 80, 0, 8, 12442, 6), 
    SPIRIT_DAGANNOTH(12017, 83, 0, 9, 12456, 6), 
    LAVA_TITAN(12788, 83, 0, 9, 12837, 4), 
    SWAMP_TITAN(12776, 85, 0, 9, 12832, 6), 
    RUNE_MINOTAUR(12083, 86, 0, 9, 12467, 6), 
    GHAST_FAMILIAR(21444, 87, 0, 1, 21453, 20), 
    UNICORN_STALLION(12039, 88, 0, 9, 12434, 20), 
    GEYSER_TITAN(12786, 89, 0, 10, 12833, 6), 
    WOLPERTINGER(12089, 92, 0, 10, 12437, 20), 
    ABYSSAL_TITAN(12796, 93, 7, 10, 12827, 6), 
    IRON_TITAN(12822, 95, 0, 10, 12828, 12), 
    PACK_YAK(12093, 96, 30, 10, 12435, 12), 
    STEEL_TITAN(12790, 99, 0, 10, 12825, 12);
    
    private final int pouch;
    
    private Familiar(int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) { pouch = arg2;
      level = arg3;
      space = arg4;
      points = arg5;
      special = arg7;
      scroll = arg6;
    }
    
    public int pouchId() {
      return pouch;
    }
    
    public int requiredLevel() {
      return level;
    }
    
    public int bobSpace() {
      return space;
    }
    
    public int requiredPoints() {
      return points;
    }
    

    public int scrollId() { return scroll; }
    
    private final int level;
    private final int space;
    public int requiredSpecialPoints() { return special; }
    
    private final int points;
    private final int scroll;
    private final int special;
  }
  
  public static enum Option {
    FOLLOWER_DETAILS("Follower Details", 7, 16, 0), 
    CAST("Cast", 9, 17, 1), 
    ATTACK("Attack", 11, 18, 2), 
    CALL_FOLLOWER("Call Follower", 13, 19, 3), 
    DISMISS("Dismiss", 15, 20, 4), 
    TAKE_BOB("Take BoB", 17, 21, 5), 
    RENEW_FAMILIAR("Renew Familiar", 19, 22, 6), 
    INTERACT("Interact", 22, 23, 7);
    
    private final String text;
    private final int id;
    
    private Option(String arg2, int arg3, int arg4, int arg5) { text = arg2;
      id = arg3;
      setting = arg4;
      set = arg5; }
    
    private final int setting;
    private final int set;
    public String text() { return text; }
    

    public int id() {
      return id;
    }
    
    public int value() {
      return setting;
    }
    
    public int tentative() {
      return set;
    }
  }
  
  public static class FamiliarInventory
    extends ClientAccessor
  {
    public FamiliarInventory(ClientContext arg0)
    {
      super();
    }
    





    public boolean store(int arg0)
    {
      if (!opened()) {
        return false;
      }
      for (final Item localItem : (ItemQuery)ctx).backpack.select()) {
        if (localItem.id() == arg0) {
          (localItem.interact("Store-All")) && (Condition.wait(new Condition.Check()
          {
            public boolean poll() {
              return !localItem.valid();
            }
          }));
        }
      }
      return false;
    }
    




    public boolean open()
    {
      if (!opened()) {
        Npc localNpc = ctx).summoning.npc();
        if (localNpc.interact("Store")) {
          Condition.wait(new Condition.Check()
          {
            public boolean poll() {
              return opened();
            }
          });
        }
      }
      return opened();
    }
    




    public boolean opened()
    {
      Component localComponent = ctx).widgets.component(671, 9);
      return (localComponent.visible()) && (localComponent.inViewport());
    }
    




    public boolean close()
    {
      final Component localComponent = ctx).widgets.component(671, 22).component(1);
      if ((localComponent.visible()) && (localComponent.click())) {
        Condition.wait(new Condition.Check()
        {
          public boolean poll() {
            return !localComponent.visible();
          }
        });
      }
      return !opened();
    }
    




    public Item[] items()
    {
      if (opened()) {
        Component localComponent1 = ctx).widgets.component(671, 26);
        ArrayList localArrayList = new ArrayList();
        for (Component localComponent2 : localComponent1.components()) {
          if (localComponent2.itemId() != -1) {
            localArrayList.add(new Item((ClientContext)ctx, localComponent2.itemId(), localComponent2.itemStackSize(), localComponent2));
          }
        }
        
        return (Item[])localArrayList.toArray(new Item[localArrayList.size()]);
      }
      return new Item[0];
    }
  }
}
