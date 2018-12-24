package org.powerbot.script.rt4;

import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Identifiable;
import org.powerbot.script.Nillable;
import org.powerbot.script.Validatable;

public class World extends ClientAccessor implements Nillable<World>, Validatable, Identifiable
{
  public static final World NIL = new World(null, -1, Integer.MAX_VALUE, Type.UNKNOWN, Server.RUNE_SCAPE, Specialty.NONE);
  private final int number;
  private final int population;
  private final int textColor;
  
  public static enum Type { FREE(1130), 
    MEMBERS(1131), 
    DEAD_MAN(1237), 
    PVP(1238), 
    UNKNOWN(-1);
    
    public final int textureId;
    
    private Type(int arg2) {
      textureId = arg2;
    }
    
    public static Type forType(int arg0) {
      for (Type localType : ) {
        if (textureId == arg0) {
          return localType;
        }
      }
      return UNKNOWN;
    }
  }
  
  public static enum Specialty {
    NONE, 
    TRADE, 
    MINI_GAME, 
    PVP, 
    DEAD_MAN, 
    SKILL_REQUIREMENT;
    
    private Specialty() {}
    public static Specialty get(String arg0) { if (arg0.contains("Trade")) {
        return TRADE;
      }
      if (arg0.contains("PVP")) {
        return PVP;
      }
      if (arg0.contains("Deadman")) {
        return DEAD_MAN;
      }
      if (arg0.contains("skill t")) {
        return SKILL_REQUIREMENT;
      }
      if (!arg0.contains("-")) {
        return MINI_GAME;
      }
      return NONE;
    }
  }
  
  public static enum Server {
    RUNE_SCAPE(-1), 
    NORTH_AMERICA(1133), 
    AUSTRALIA(1137), 
    GERMANY(1140), 
    UNITED_KINGDOM(1135);
    
    public final int texture;
    
    private Server(int arg2) {
      texture = arg2;
    }
    
    public static Server forType(int arg0) {
      for (Server localServer : ) {
        if (texture == arg0) {
          return localServer;
        }
      }
      return RUNE_SCAPE;
    }
  }
  

  private final Type type;
  
  private final Server server;
  private final Specialty specialty;
  public World(ClientContext arg0, int arg1, int arg2, Type arg3, Server arg4, Specialty arg5)
  {
    super(arg0);
    number = arg1;
    population = arg2;
    type = arg3;
    server = arg4;
    specialty = arg5;
    textColor = 0;
  }
  
  public World(ClientContext arg0, int arg1, int arg2, Type arg3, Server arg4, Specialty arg5, int arg6)
  {
    super(arg0);
    number = arg1;
    population = arg2;
    type = arg3;
    server = arg4;
    specialty = arg5;
    textColor = arg6;
  }
  





  public int id()
  {
    return number;
  }
  




  public int size()
  {
    return population;
  }
  




  public Type type()
  {
    return type;
  }
  




  public Specialty specialty()
  {
    return specialty;
  }
  




  public Server server()
  {
    return server;
  }
  




  public int textColor()
  {
    return textColor;
  }
  





  public boolean hop()
  {
    if (!valid()) {
      return false;
    }
    ctx).worlds.open();
    Component localComponent1 = ctx).worlds.list();
    if ((localComponent1 == null) || (!localComponent1.visible())) {
      return false;
    }
    for (Component localComponent2 : localComponent1.components())
      if ((localComponent2.index() % 6 == 2) && (localComponent2.text().equalsIgnoreCase("" + number)))
      {

        ctx).widgets.scroll(localComponent2, localComponent1, bar(), true);
        if (localComponent2.click()) {
          if (!ctx).chat.pendingInput()) {
            if (!ctx).chat.continueChat(new String[] { "Switch" })) {
              ctx).chat.continueChat(new String[] { "Yes." });
            }
          }
          return (Condition.wait(new ClientStateCondition(45, null), 100, 20)) && 
            (Condition.wait(new ClientStateCondition(30, null), 100, 100));
        }
      }
    return false;
  }
  
  private Component component(int arg0, int arg1) {
    for (Component localComponent : ctx).widgets.widget(arg0).components()) {
      if (localComponent.textureId() == arg1) {
        return localComponent;
      }
    }
    return null;
  }
  
  private Component bar() {
    for (Component localComponent : ctx).widgets.widget(69).components()) {
      if (localComponent.components().length == 6) {
        return localComponent;
      }
    }
    return null;
  }
  
  public World nil()
  {
    return NIL;
  }
  
  public boolean valid()
  {
    return id() > -1;
  }
  

  public String toString()
  {
    return "World[id=" + number + "/population=" + population + "/type=" + type + "/location=" + server + "/specialty=" + specialty + "]";
  }
  

  public boolean equals(Object arg0)
  {
    return ((arg0 instanceof World)) && (number == number);
  }
  
  private class ClientStateCondition extends Condition.Check
  {
    private final int state;
    
    private ClientStateCondition(int arg1) {
      state = arg1;
    }
    

    public boolean poll()
    {
      return ctx).game.clientState() == state;
    }
  }
}
