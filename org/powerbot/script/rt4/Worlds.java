package org.powerbot.script.rt4;

import java.util.ArrayList;
import org.powerbot.script.AbstractQuery;
import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Filter;
import org.powerbot.script.Identifiable;
import org.powerbot.script.Identifiable.Matcher;
import org.powerbot.script.Identifiable.Query;

public class Worlds extends AbstractQuery<Worlds, World, ClientContext> implements Identifiable.Query<Worlds>
{
  public static final int WORLD_WIDGET = 69;
  public static final int LOGOUT_WIDGET = 182;
  private ArrayList<World> cache = new ArrayList();
  




  public Worlds(ClientContext arg0)
  {
    super(arg0);
  }
  
  protected Worlds getThis()
  {
    return this;
  }
  
  protected java.util.List<World> get()
  {
    ArrayList localArrayList = new ArrayList();
    Component localComponent = list();
    if (localComponent == null) {
      return cache;
    }
    Component[] arrayOfComponent = localComponent.components();
    for (int i = 0; i < arrayOfComponent.length - 6; i += 6) {
      World.Type localType = World.Type.forType(arrayOfComponent[(i + 1)].textureId());
      World.Server localServer = World.Server.forType(arrayOfComponent[(i + 3)].textureId());
      World.Specialty localSpecialty = World.Specialty.get(arrayOfComponent[(i + 5)].text());
      int j = Integer.valueOf(arrayOfComponent[(i + 2)].text()).intValue();
      int k = Integer.valueOf(arrayOfComponent[(i + 4)].text()).intValue();
      int m = Integer.valueOf(arrayOfComponent[(i + 5)].textColor()).intValue();
      localArrayList.add(new World((ClientContext)ctx, j, k, localType, localServer, localSpecialty, m));
    }
    cache = new ArrayList(localArrayList);
    return localArrayList;
  }
  





  public Worlds types(final World.Type... arg0)
  {
    (Worlds)select(new Filter() {
      public boolean accept(World arg0) {
        for (World.Type localType : arg0) {
          if (localType.equals(arg0.type())) {
            return true;
          }
        }
        return false;
      }
    });
  }
  





  public Worlds specialties(final World.Specialty... arg0)
  {
    (Worlds)select(new Filter() {
      public boolean accept(World arg0) {
        for (World.Specialty localSpecialty : arg0) {
          if (localSpecialty.equals(arg0.specialty())) {
            return true;
          }
        }
        return false;
      }
    });
  }
  





  public Worlds servers(final World.Server... arg0)
  {
    (Worlds)select(new Filter() {
      public boolean accept(World arg0) {
        for (World.Server localServer : arg0) {
          if (localServer.equals(arg0.server())) {
            return true;
          }
        }
        return false;
      }
    });
  }
  






  public Worlds population(final int arg0)
  {
    (Worlds)select(new Filter() {
      public boolean accept(World arg0) {
        return arg0.size() <= arg0;
      }
    });
  }
  





  public Worlds joinable()
  {
    (Worlds)select(new Filter() {
      public boolean accept(World arg0) {
        return (arg0.valid()) && 
          (arg0.type() != World.Type.DEAD_MAN) && 
          (arg0.specialty() != World.Specialty.PVP) && 
          (arg0.textColor() != 8355711);
      }
    });
  }
  




  public boolean open()
  {
    ctx).game.tab(Game.Tab.LOGOUT);
    if (ctx).widgets.widget(69).valid()) {
      return true;
    }
    Component localComponent = component(182, "World Switcher");
    (localComponent != null) && (localComponent.click() && (Condition.wait(new Condition.Check()
    {
      public boolean poll() { return ctx).widgets.widget(69).valid(); } }, 100, 20));
  }
  


  public World nil()
  {
    return World.NIL;
  }
  
  protected final Component list() {
    for (Component localComponent : ctx).widgets.widget(69).components()) {
      if ((localComponent.width() == 174) && (localComponent.height() == 204)) {
        return localComponent;
      }
    }
    return null;
  }
  
  protected final Component component(int arg0, String arg1) {
    for (Component localComponent : ctx).widgets.widget(arg0).components()) {
      if (localComponent.text().equalsIgnoreCase(arg1)) {
        return localComponent;
      }
    }
    return null;
  }
  
  public Worlds id(int... arg0)
  {
    return (Worlds)select(new Identifiable.Matcher(arg0));
  }
  
  public Worlds id(int[]... arg0)
  {
    int i = 0;
    
    for (Object localObject2 : arg0) {
      i += localObject2.length;
    }
    
    ??? = new int[i];
    ??? = 0;
    
    for (int[] arrayOfInt1 : arg0) {
      for (int i3 : arrayOfInt1) {
        ???[(???++)] = i3;
      }
    }
    
    return (Worlds)select(new Identifiable.Matcher((int[])???));
  }
  
  public Worlds id(Identifiable... arg0)
  {
    return (Worlds)select(new Identifiable.Matcher(arg0));
  }
}
