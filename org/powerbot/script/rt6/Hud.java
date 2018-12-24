package org.powerbot.script.rt6;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Input;

public class Hud
  extends ClientAccessor
{
  private final AtomicReference<Rectangle[]> boundsCache = new AtomicReference(null);
  private long cachedAt = 0L;
  
  public Hud(ClientContext arg0) {
    super(arg0);
  }
  
  private void updateBounds() {
    int[][] arrayOfInt = { { 1484, 1 }, { 1189, 6 }, { 1184, 1 }, { 1490, 10 } };
    Rectangle[] arrayOfRectangle = new Rectangle[Window.values().length + 2 + arrayOfInt.length];
    int i = 0;
    arrayOfRectangle[(i++)] = ctx).widgets.component(1431, 0).viewportRect();
    if ((!ctx).hud.legacy()) || (!ctx).combatBar.legacy()))
      arrayOfRectangle[(i++)] = ctx).widgets.component(1430, 0).viewportRect();
    Window localWindow;
    Component localComponent;
    for (localWindow : arrayOfInt) {
      localComponent = ctx).widgets.component(localWindow[0], localWindow[1]);
      if (localComponent.visible())
      {

        arrayOfRectangle[(i++)] = localComponent.viewportRect(); }
    }
    for (localWindow : Window.values()) {
      localComponent = getSprite(localWindow);
      if (localComponent != null)
      {

        arrayOfRectangle[(i++)] = localComponent.parent().viewportRect(); }
    }
    for (localWindow : arrayOfRectangle) {
      if (localWindow == null) {
        break;
      }
      localWindow.grow(5, 5);
    }
    boundsCache.set(Arrays.copyOf(arrayOfRectangle, i));
  }
  




  public Rectangle[] bounds()
  {
    if (Math.abs(System.currentTimeMillis() - cachedAt) >= 1500L) {
      cachedAt = System.currentTimeMillis();
      localObject = new Thread(new Runnable()
      {
        public void run() {
          Hud.this.updateBounds();
        }
      });
      ((Thread)localObject).start();
      if (boundsCache.get() == null) {
        try {
          ((Thread)localObject).join();
        }
        catch (InterruptedException localInterruptedException) {}
      }
    }
    Object localObject = (Rectangle[])boundsCache.get();
    return localObject == null ? new Rectangle[0] : localObject;
  }
  
  public boolean legacy() {
    return ctx).game.mapComponent().width() != 0;
  }
  
  public boolean fixed() {
    if (!legacy()) {
      return false;
    }
    Component localComponent1 = getLegacyTab(BACKPACKtab);Component localComponent2 = getLegacyTab(EMOTEStab);
    return (localComponent1 != null) && (localComponent2 != null) && (screenPointy - screenPointy > 100);
  }
  
  public boolean floating(Window arg0) {
    return (getSprite(arg0) != null) || (getTab(arg0) != null);
  }
  





  public boolean opened(Window arg0)
  {
    return ((legacy()) && (opened(tab))) || (ctx).widgets.component(arg0.widget(), arg0.component()).visible());
  }
  
  private boolean opened(LegacyTab arg0) {
    if (arg0 == null) {
      return false;
    }
    Component localComponent = getLegacyTab(arg0);
    int i = localComponent == null ? -1 : localComponent.component(0).textureId();
    return (i == 23346) || (i == 23348);
  }
  





  public boolean opened(SubTab arg0)
  {
    boolean bool = legacy();
    if (bool ? !opened(windowtab) : !opened(arg0.window())) {
      return false;
    }
    int i = bool ? 1617 : arg0.window().widget();
    int j = bool ? 1 : 5;
    Component localComponent = getSubTab(arg0, i);
    return (localComponent != null) && (localComponent.parent().component(localComponent.index() + j).visible());
  }
  





  public boolean open(Menu arg0)
  {
    if (legacy()) {
      return openTab(tab);
    }
    Component localComponent = getMenu(arg0);
    return (localComponent != null) && (localComponent.click());
  }
  





  public boolean open(final Window arg0)
  {
    if (legacy()) {
      return openTab(tab);
    }
    if ((arg0 == null) || (arg0.menu() == Menu.OTHER)) {
      return false;
    }
    if ((opened(arg0)) || (arg0.menu() == Menu.NONE)) {
      return true;
    }
    
    if (isTabInBar(arg0)) {
      localComponent1 = getTab(arg0);
      (localComponent1 != null) && (localComponent1.click() && (Condition.wait(new Condition.Check()
      {

        public boolean poll() { return opened(arg0); } }, 100, 20));
    }
    


    Component localComponent1 = getMenu(arg0.menu());
    if ((localComponent1 != null) && ((getToggle(arg0) != null) || (localComponent1.hover()))) {
      final Component localComponent2 = ctx).widgets.component(1432, 6);
      if (localComponent2 == null) {
        return false;
      }
      Condition.wait(new Condition.Check()
      {

        public boolean poll() { return localComponent2.visible(); } }, 100, 20);
      

      Condition.sleep();
      Component localComponent3 = getToggle(arg0);
      if ((localComponent3 != null) && (localComponent3.hover()) && 
        (localComponent3.visible()) && (ctx).input.click(true))) {
        Condition.wait(new Condition.Check()
        {

          public boolean poll() { return opened(arg0); } }, 100, 20);
      }
    }
    


    return false;
  }
  
  private boolean openTab(final LegacyTab arg0) {
    if (arg0 == null) {
      return false;
    }
    if (opened(arg0)) {
      return true;
    }
    Component localComponent = getLegacyTab(arg0);
    (localComponent != null) && (localComponent.click() && (Condition.wait(new Condition.Check()
    {

      public boolean poll() { return Hud.this.opened(arg0); } }, 100, 5));
  }
  







  public boolean open(final SubTab arg0)
  {
    if (opened(arg0)) {
      return true;
    }
    boolean bool = legacy();
    if (bool ? !openTab(windowtab) : !open(arg0.window())) {
      return false;
    }
    Component localComponent = getSubTab(arg0, bool ? 1617 : arg0.window().widget());
    (localComponent != null) && (localComponent.click() && (Condition.wait(new Condition.Check()
    {

      public boolean poll() { return opened(arg0); } }, 100, 20));
  }
  







  public boolean close(final Window arg0)
  {
    if (legacy()) {
      return closeTab(tab);
    }
    if (arg0.menu() == Menu.NONE) {
      return false;
    }
    if (!floating(arg0)) {
      return true;
    }
    if (open(arg0)) {
      Component localComponent = getSprite(arg0);
      if ((localComponent != null) && (localComponent.widget().component(localComponent.parent().index() + 1).component(1).interact("Close"))) {
        Condition.wait(new Condition.Check()
        {

          public boolean poll() { return !opened(arg0); } }, 125, 20);
      }
    }
    

    return !opened(arg0);
  }
  
  private boolean closeTab(final LegacyTab arg0) {
    if ((arg0 == null) || (fixed())) {
      return false;
    }
    Component localComponent = getLegacyTab(arg0);
    (!opened(arg0)) || ((localComponent != null) && (localComponent.click() && (Condition.wait(new Condition.Check()
    {

      public boolean poll() { return !Hud.this.opened(arg0); } }, 100, 5)));
  }
  

  private Component getLegacyTab(LegacyTab arg0)
  {
    for (Component localComponent1 : ctx).widgets.widget(1431)) {
      if (localComponent1.childrenCount() > 0) {
        for (Component localComponent2 : localComponent1.components()) {
          if (localComponent2.textureId() == texture) {
            return localComponent2;
          }
        }
      } else if (localComponent1.textureId() == texture) {
        return localComponent1;
      }
    }
    return null;
  }
  
  public FloatingMessage floatingMessage() {
    Component[] arrayOfComponent1 = { ctx).widgets.component(1177, 0), ctx).widgets.component(1477, 484) };
    for (Component localComponent1 : arrayOfComponent1) {
      Component localComponent2 = localComponent1.component(0);Component localComponent3 = localComponent1.component(9);
      if (localComponent2.textureId() != -1) {
        return new FloatingMessage(localComponent3.text(), localComponent2.textureId());
      }
    }
    return new FloatingMessage("", -1);
  }
  
  private boolean isTabInBar(Window arg0) {
    Component localComponent = getTab(arg0);
    return (localComponent != null) && (localComponent.parent().viewportRect().contains(localComponent.viewportRect()));
  }
  
  private Component getToggle(Window arg0) {
    if (arg0 == null) {
      return null;
    }
    int i = arg0.miniTexture();
    for (Component localComponent : ctx).widgets.component(1432, 6).components()) {
      if ((localComponent.textureId() == i) && (localComponent.visible())) {
        return localComponent;
      }
    }
    return null;
  }
  
  Component getMenu(Menu arg0) {
    if (arg0 == null) {
      return null;
    }
    int i = arg0.texture();
    for (Component localComponent1 : ctx).widgets.widget(1431)) {
      for (Component localComponent2 : localComponent1.components()) {
        if ((localComponent2.textureId() == i) && (localComponent2.valid())) {
          return localComponent2;
        }
      }
    }
    return null;
  }
  
  Component getTab(Window arg0) {
    if (arg0 == null) {
      return null;
    }
    int i = arg0.miniTexture();
    for (Component localComponent1 : ctx).widgets.widget(1477)) {
      for (Component localComponent2 : localComponent1.components()) {
        if ((localComponent2.textureId() == i) && (localComponent2.valid())) {
          return localComponent2;
        }
      }
    }
    return null;
  }
  
  Component getSprite(Window arg0) {
    if (arg0 == null) {
      return null;
    }
    int i = arg0.texture();
    for (Component localComponent1 : ctx).widgets.widget(1477)) {
      for (Component localComponent2 : localComponent1.components()) {
        if ((localComponent2.textureId() == i) && (localComponent2.visible())) {
          return localComponent2;
        }
      }
    }
    return null;
  }
  
  Component getSubTab(SubTab arg0, int arg1) {
    if (arg0 == null) {
      return null;
    }
    int i = arg0.texture();
    for (Component localComponent1 : ctx).widgets.widget(arg1)) {
      for (Component localComponent2 : localComponent1.components()) {
        if ((localComponent2.textureId() == i) && (localComponent2.visible()) && 
          (localComponent2.width() == 20) && (localComponent2.height() == 20)) {
          return localComponent2;
        }
      }
    }
    
    return null;
  }
  


  public static enum Menu
  {
    NONE(null, -1, new Hud.Window[0]), 
    OTHER(null, -1, new Hud.Window[0]), 
    HERO(null, 14821, new Hud.Window[] { Hud.Window.SKILLS, Hud.Window.ACTIVE_TASK, Hud.Window.BACKPACK, Hud.Window.WORN_EQUIPMENT }), 
    CUSTOMIZATIONS(null, 14823, new Hud.Window[0]), 
    ADVENTURES(new Hud.LegacyTab(1819, "Adventures"), 18831, new Hud.Window[] { Hud.Window.ACTIVE_TASK }), 
    POWERS(null, 18832, new Hud.Window[] { Hud.Window.PRAYER_ABILITIES, Hud.Window.MAGIC_ABILITIES, Hud.Window.MELEE_ABILITIES, Hud.Window.RANGED_ABILITIES, Hud.Window.DEFENCE_ABILITIES }), 
    SOCIAL(null, 14822, new Hud.Window[] { Hud.Window.FRIENDS, Hud.Window.FRIENDS_CHAT_INFO, Hud.Window.CLAN }), 
    EXTRAS(new Hud.LegacyTab(23663, "Extras"), 23663, new Hud.Window[0]), 
    HELP(null, 18838, new Hud.Window[0]), 
    OPTIONS(new Hud.LegacyTab(1829, "Settings"), 18835, new Hud.Window[] { Hud.Window.NOTES, Hud.Window.MUSIC_PLAYER });
    
    private final Hud.LegacyTab tab;
    private final int texture;
    private final Hud.Window[] windows;
    
    private Menu(Hud.LegacyTab arg2, int arg3, Hud.Window... arg4) { tab = arg2;
      texture = arg3;
      windows = arg4;
    }
    
    public int texture() {
      return texture;
    }
    
    public Hud.Window[] windows() {
      return windows;
    }
  }
  


  public static enum Window
  {
    ALL_CHAT(Hud.Menu.NONE, 18726, 18754, 137, 82, null), 
    PRIVATE_CHAT(Hud.Menu.NONE, 18727, 18755, 1467, 55, null), 
    FRIENDS_CHAT(Hud.Menu.NONE, 18728, 18756, 1472, 55, null), 
    CLAN_CHAT(Hud.Menu.NONE, 18729, 18757, 1471, 55, null), 
    GUEST_CLAN_CHAT(Hud.Menu.NONE, 18731, 18790, 1470, 55, null), 
    EMOTES(Hud.Menu.NONE, 18741, 18776, 590, 14, new Hud.LegacyTab(1830, "Emotes")), 
    MINIMAP(Hud.Menu.NONE, 18742, 0, 1465, 12, null), 
    
    COMBAT(Hud.Menu.NONE, 0, 0, 1503, 1, new Hud.LegacyTab(1817, "Combat Settings")), 
    
    SKILLS(Hud.Menu.HERO, 18738, 24429, 1466, 0, new Hud.LegacyTab(1818, "Skills")), 
    ACTIVE_TASK(Hud.Menu.HERO, 18735, 21862, 1220, 0, new Hud.LegacyTab(1820, "Active Task")), 
    BACKPACK(Hud.Menu.HERO, 18732, 18772, 1473, 7, new Hud.LegacyTab(1821, "Backpack")), 
    WORN_EQUIPMENT(Hud.Menu.HERO, 18733, 18773, 1464, 1, new Hud.LegacyTab(1822, "Worn Equipment")), 
    PRAYER_ABILITIES(Hud.Menu.POWERS, 18734, 18774, 1458, 32, new Hud.LegacyTab(1823, "Prayer Abilities")), 
    MAGIC_ABILITIES(Hud.Menu.POWERS, 18724, 32067, 1461, 0, new Hud.LegacyTab(1824, "Magic Book")), 
    MELEE_ABILITIES(Hud.Menu.POWERS, 18722, 31265, 1460, 0, new Hud.LegacyTab(1824, "Magic Book")), 
    RANGED_ABILITIES(Hud.Menu.POWERS, 18723, 31269, 1452, 0, new Hud.LegacyTab(1824, "Magic Book")), 
    DEFENCE_ABILITIES(Hud.Menu.POWERS, 18725, 18753, 1449, 0, new Hud.LegacyTab(1824, "Magic Book")), 
    FRIENDS(Hud.Menu.SOCIAL, 18737, 18759, 550, 33, new Hud.LegacyTab(6238, "Friends")), 
    FRIENDS_CHAT_INFO(Hud.Menu.SOCIAL, 18739, 18761, 1427, 0, new Hud.LegacyTab(6237, "Friends Chat Info")), 
    CLAN(Hud.Menu.SOCIAL, 18740, 18762, 1110, 2, new Hud.LegacyTab(1828, "Clan")), 
    NOTES(Hud.Menu.OPTIONS, 18744, 18779, 1417, 1, new Hud.LegacyTab(1832, "Notes")), 
    MUSIC_PLAYER(Hud.Menu.OPTIONS, 18745, 18780, 1416, 0, new Hud.LegacyTab(1831, "Music Player")), 
    
    MINIGAMES(Hud.Menu.OTHER, 18749, 18788, 939, 0, null), 
    FAMILIAR(Hud.Menu.OTHER, 18748, 18787, 662, 0, null);
    
    private final Hud.Menu menu;
    private final int miniTexture;
    private final int texture;
    final int widget;
    final int component;
    private final Hud.LegacyTab tab;
    
    private Window(Hud.Menu arg2, int arg3, int arg4, int arg5, int arg6, Hud.LegacyTab arg7) { menu = arg2;
      texture = arg3;
      miniTexture = arg4;
      widget = arg5;
      component = arg6;
      tab = arg7;
    }
    
    public Hud.Menu menu() {
      return menu;
    }
    
    public int texture() {
      return texture;
    }
    
    public int miniTexture() {
      return miniTexture;
    }
    
    public int widget() {
      return widget;
    }
    
    private int component() {
      return component;
    }
  }
  


  public static enum SubTab
  {
    DEFENCE_ABILITIES(Hud.Window.DEFENCE_ABILITIES, 14877), 
    CONSTITUTION_ABILITIES(Hud.Window.DEFENCE_ABILITIES, 14878), 
    MAGIC_ABILITIES(Hud.Window.MAGIC_ABILITIES, 14876), 
    COMBAT_SPELLS(Hud.Window.MAGIC_ABILITIES, 14367), 
    TELEPORT_SPELLS(Hud.Window.MAGIC_ABILITIES, 14333), 
    SKILLING_SPELLS(Hud.Window.MAGIC_ABILITIES, 14379), 
    ATTACK_ABILITIES(Hud.Window.MELEE_ABILITIES, 14873), 
    STRENGTH_ABILITIES(Hud.Window.MELEE_ABILITIES, 14874), 
    RANGED_ABILITIES(Hud.Window.RANGED_ABILITIES, 14875);
    
    private final int texture;
    private final Hud.Window window;
    
    private SubTab(Hud.Window arg2, int arg3) {
      texture = arg3;
      window = arg2;
    }
    
    public int texture() {
      return texture;
    }
    
    public Hud.Window window() {
      return window;
    }
  }
  
  private static class LegacyTab {
    public final int texture;
    public final String hint;
    
    public LegacyTab(int arg0, String arg1) {
      texture = arg0;
      hint = arg1;
    }
  }
}
