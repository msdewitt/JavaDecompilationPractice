package org.powerbot.script.rt6;

import java.util.ArrayList;
import java.util.List;
import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Input;
import org.powerbot.script.StringUtils;

public class CombatBar
  extends IdQuery<Action>
{
  private static final int[] EXPAND_COMPONENT_TEXTURES = { 18612, 24004 };
  private Component legacy_component = null;
  
  public CombatBar(ClientContext arg0) {
    super(arg0);
  }
  




  public boolean regenerate()
  {
    return ctx).hud.legacy() ? ctx).widgets.component(1504, 1).interact("Regenerate") : ctx).widgets
      .component(1430, 3).interact("Regenerate");
  }
  




  public boolean healPoison()
  {
    return ctx).hud.legacy() ? ctx).widgets.component(1504, 1).interact("Cure") : ctx).widgets
      .component(1430, 3).interact("Cure");
  }
  





  public boolean retaliating(final boolean arg0)
  {
    return 
      (ctx).hud.open(Hud.Window.MELEE_ABILITIES)) && (ctx).widgets.component(1503, 49).click());
  }
  










  public boolean retaliating()
  {
    return ctx).varpbits.varpbit(462) == 0;
  }
  
  public boolean legacy()
  {
    Component localComponent = legacy_component == null ? (this.legacy_component = componentByTexture(ctx).widgets.widget(1477).components(), EXPAND_COMPONENT_TEXTURES)) : legacy_component;
    
    return (localComponent != null) && (!localComponent.valid());
  }
  
  public int targetHealth() {
    Component localComponent = ctx).widgets.component(1490, 20);
    String str;
    if ((localComponent.visible()) && (!(str = localComponent.text()).isEmpty())) {
      return StringUtils.parseInt(str);
    }
    return -1;
  }
  
  public int targetHealthPercent() {
    Component localComponent1 = ctx).widgets.component(1490, 19);
    Component localComponent2 = ctx).widgets.component(1490, 21);
    if ((!localComponent1.visible()) || (!localComponent2.visible())) {
      return -1;
    }
    double d1 = localComponent1.scrollWidth();double d2 = localComponent2.scrollWidth();
    return d1 > 0.0D ? (int)Math.ceil(d2 / d1 * 100.0D) : -1;
  }
  
  public int targetCombatLevel() {
    Component localComponent = ctx).widgets.component(1490, 1);
    String str;
    if ((localComponent.visible()) && (!(str = localComponent.text()).isEmpty())) {
      return StringUtils.parseInt(str);
    }
    return -1;
  }
  
  public int targetWeakness() {
    Component localComponent = ctx).widgets.component(1490, 15);
    return localComponent.textureId();
  }
  
  public String targetName() {
    return ctx).widgets.component(1490, 6).text();
  }
  
  public List<Integer> targetEffects() {
    ArrayList localArrayList = new ArrayList();
    for (int i = 36; i < 72; i += 3) {
      Component localComponent = ctx).widgets.component(1490, i);
      int j;
      if (((j = localComponent.textureId()) != -1) && (localComponent.visible()))
      {

        localArrayList.add(Integer.valueOf(j)); }
    }
    return localArrayList;
  }
  
  public List<Integer> playerEffects() {
    ArrayList localArrayList = new ArrayList();
    for (Component localComponent : ctx).widgets.widget(1485)) {
      int i;
      if ((localComponent.type() == 5) && (localComponent.visible()) && ((i = localComponent.textureId()) != -1)) {
        localArrayList.add(Integer.valueOf(i));
      }
    }
    return localArrayList;
  }
  




  public int health()
  {
    if (ctx).hud.legacy()) {
      return StringUtils.parseInt(ctx).widgets.component(1504, 3).component(7).text());
    }
    String str = ctx).widgets.component(1430, 7).component(7).text();
    int i = str.indexOf('/');
    if (i != -1) {
      return StringUtils.parseInt(str.substring(0, i));
    }
    return -1;
  }
  





  public int maximumHealth()
  {
    if (ctx).hud.legacy()) {
      return ctx).skills.realLevel(3) * (legacy() ? 10 : 100);
    }
    String str = ctx).widgets.component(1430, 7).component(7).text();
    int i = str.indexOf('/');
    if (i != -1) {
      return StringUtils.parseInt(str.substring(i + 1));
    }
    return -1;
  }
  




  public int adrenaline()
  {
    return ctx).varpbits.varpbit(679);
  }
  




  public boolean expanded()
  {
    return ctx).widgets.component(1430, 57).visible();
  }
  





  public boolean expanded(final boolean arg0)
  {
    if (ctx).combatBar.legacy()) {
      return false;
    }
    if (expanded() == arg0) {
      return true;
    }
    
    Component localComponent = legacy_component == null ? (this.legacy_component = componentByTexture(ctx).widgets.widget(1477).components(), EXPAND_COMPONENT_TEXTURES)) : legacy_component;
    
    if (localComponent != null) {} (localComponent.interact(arg0 ? "Maximise" : "Minimise")) && 
      (Condition.wait(new Condition.Check()
      {

        public boolean poll() {
          return expanded() == arg0; } }, 300, 10));
  }
  







  public Action actionAt(int arg0)
  {
    if ((arg0 < 0) || (arg0 >= 12)) {
      throw new IndexOutOfBoundsException("0 > " + arg0 + " >= " + 12);
    }
    int i = getBarIndex();
    
    int j = ctx).varpbits.varpbit((i >= 5 ? 5265 : 739) + arg0 + i * 12);
    Action.Type localType; if ((j > 0) && (j != 10)) {
      localType = Action.Type.ABILITY;
    } else if ((j = ctx).varpbits.varpbit((i >= 5 ? 5335 : 823) + arg0 + i * 12)) > 0) {
      localType = Action.Type.ITEM;
    } else {
      localType = Action.Type.UNKNOWN;
      j = -1;
    }
    return new Action((ClientContext)ctx, i, arg0, localType, j);
  }
  




  public Action[] actions()
  {
    Action[] arrayOfAction = new Action[12];
    for (int i = 0; i < 12; i++) {
      arrayOfAction[i] = actionAt(i);
    }
    return arrayOfAction;
  }
  



  protected List<Action> get()
  {
    if (legacy()) {
      return new ArrayList(0);
    }
    ArrayList localArrayList = new ArrayList(12);
    Action[] arrayOfAction1 = actions();
    for (Action localAction : arrayOfAction1) {
      if (localAction != null)
      {

        localArrayList.add(localAction); }
    }
    return localArrayList;
  }
  





  public boolean deleteAction(Action arg0)
  {
    if (!expanded(true)) {
      return false;
    }
    final int i = arg0.slot();
    arg0 = actionAt(i);
    (arg0.id() == -1) || ((arg0.component().hover()) && 
      (ctx).input.drag(ctx).players.local().nextPoint(), true) && (Condition.wait(new Condition.Check()
      {

        public boolean poll() { return actionAt(i).id() == -1; } }, 20, 20)));
  }
  






  public boolean locked()
  {
    return (ctx).varpbits.varpbit(682) >> 4 & 0x1) != 0;
  }
  





  public boolean locked(final boolean arg0)
  {
    if (locked() == arg0) {
      return true;
    }
    Component localComponent = ctx).widgets.component(1430, 259);
    (localComponent.visible()) && (localComponent.interact("lock") && 
      (Condition.wait(new Condition.Check()
      {

        public boolean poll() {
          return locked() == arg0; } }, 300, 10));
  }
  

  public int getBarIndex()
  {
    return (ctx).varpbits.varpbit(682) >> 5 & 0x7) - 1;
  }
  



  public Action nil()
  {
    return new Action((ClientContext)ctx, -1, 0, Action.Type.UNKNOWN, -1);
  }
  
  private Component componentByTexture(Component[] arg0, int... arg1) {
    for (Component localComponent : arg0) {
      int k = localComponent.textureId();
      for (int i1 : arg1) {
        if (i1 == k) {
          return localComponent;
        }
      }
      if (localComponent.childrenCount() > 0)
      {
        if ((??? = componentByTexture(localComponent.components(), new int[0])) != null) {
          return ???;
        }
      }
    }
    return null;
  }
}
