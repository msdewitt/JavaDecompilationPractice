package org.powerbot.script.rt6;

import org.powerbot.script.Identifiable;
import org.powerbot.script.Validatable;

public class Action extends ClientAccessor implements Identifiable, Validatable, Displayable
{
  private final int bar;
  private final int slot;
  private final Type type;
  private final int id;
  
  public Action(ClientContext arg0, int arg1, int arg2, Type arg3, int arg4)
  {
    super(arg0);
    if ((arg2 < 0) || (arg3 == null)) {
      throw new IllegalArgumentException();
    }
    bar = arg1;
    slot = arg2;
    type = arg3;
    id = arg4;
  }
  
  public int slot() {
    return slot;
  }
  
  public Type type() {
    return type;
  }
  
  public int id()
  {
    return id;
  }
  
  public String bind() {
    Component localComponent = ctx).widgets.component(1430, 65 + slot * 13);
    return localComponent.text().trim();
  }
  
  public boolean select() {
    return select(true);
  }
  
  public boolean select(boolean arg0) {
    if (!valid()) {
      return false;
    }
    String str = bind();
    if (arg0) {
      if (str.length() == 1) {
        ctx).input.send(bind());
        return true;
      }
    } else {
      return component().click();
    }
    return false;
  }
  
  public boolean ready() {
    Component localComponent1 = ctx).widgets.component(1430, 63 + slot * 13);
    Component localComponent2 = ctx).widgets.component(1430, 62 + slot * 13);
    return (valid()) && (!localComponent1.visible()) && (localComponent2.textColor() == 16777215);
  }
  
  public int cooldownPercentage() {
    Component localComponent = ctx).widgets.component(1430, 63 + slot * 13);
    if (!localComponent.visible()) {
      return 100;
    }
    return (localComponent.textureId() - 14522) * 100 / 150;
  }
  
  public boolean queued()
  {
    Component localComponent = ctx).widgets.component(1430, 69 + slot * 13);
    return (valid()) && (localComponent.visible());
  }
  



  public Component component()
  {
    return ctx).widgets.component(1430, 62 + slot * 13);
  }
  
  public int hashCode()
  {
    return Math.max(id, 0);
  }
  
  public boolean equals(Object arg0)
  {
    if ((arg0 == null) || (!(arg0 instanceof Action))) {
      return false;
    }
    Action localAction = (Action)arg0;
    return (slot == slot) && (type == type) && (id == id);
  }
  
  public boolean valid()
  {
    if (type != Type.UNKNOWN) {} return 
    
      id == (type == Type.ABILITY ? ctx).varpbits.varpbit((bar >= 6 ? 5265 : 739) + slot + bar * 12) : ctx).varpbits.varpbit((bar >= 6 ? 5335 : 823) + slot + bar * 12));
  }
  
  public static enum Type {
    ABILITY,  ITEM,  UNKNOWN;
    
    private Type() {}
  }
}
