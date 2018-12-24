package org.powerbot.script.rt6;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Filter;
import org.powerbot.script.StringUtils;

public class Lobby extends ClientAccessor
{
  public Lobby(ClientContext arg0)
  {
    super(arg0);
  }
  
  public boolean opened() {
    return ctx).game.clientState() == 7;
  }
  
  public boolean close() {
    (ctx).game.clientState() == 3) || ((ctx).widgets.component(906, 300).component(1).click()) && (Condition.wait(new Condition.Check()
    {
      public boolean poll() {
        return ctx).game.clientState() == 9;
      }
    })));
  }
  
  public Tab tab() {
    if (!opened()) {
      return Tab.NONE;
    }
    String str = ctx).widgets.component(906, 91).component(27).text().replace(' ', '_');
    for (Tab localTab : Tab.values()) {
      if (localTab.name().equalsIgnoreCase(str)) {
        return localTab;
      }
    }
    return Tab.NONE;
  }
  
  public boolean tab(final Tab arg0) {
    (opened()) && ((tab() == arg0) || ((ctx).widgets.component(906, 91).component(arg0.component()).click()) && (Condition.wait(new Condition.Check()
    {

      public boolean poll() { return tab() == arg0; } }, 100, 15))));
  }
  

  public List<World> worlds()
  {
    worlds(new Filter()
    {
      public boolean accept(Lobby.World arg0) {
        return true;
      }
    });
  }
  
  public World world(final int arg0) {
    World localWorld = new World(-1, -1, false, -1, "", "", false, -1);
    List localList = worlds(new Filter()
    {
      public boolean accept(Lobby.World arg0) {
        return number == arg0;
      }
    });
    return localList.size() == 1 ? (World)localList.get(0) : localWorld;
  }
  
  public List<World> worlds(Filter<World> arg0) {
    ArrayList localArrayList = new ArrayList();
    if (!tab(Tab.WORLD_SELECT)) {
      return localArrayList;
    }
    Widget localWidget = ctx).widgets.widget(910);
    int[] arrayOfInt = { 73, 72, 75, 76, 78, 79, 80 };
    



    Component[] arrayOfComponent = new Component[arrayOfInt.length];
    int i = -1;
    int k; for (int j = 0; j < arrayOfInt.length; j++) {
      arrayOfComponent[j] = localWidget.component(arrayOfInt[j]);
      k = arrayOfComponent[j].childrenCount();
      if (i == -1) {
        i = k;
      } else if (i != k) {
        return localArrayList;
      }
    }
    for (j = 0; j < i; j++) {
      k = StringUtils.parseInt(arrayOfComponent[0].component(j).text());
      boolean bool1 = arrayOfComponent[1].component(j).textureId() == 23793;
      int m;
      try {
        m = Integer.parseInt(arrayOfComponent[2].component(j).text());
      } catch (NumberFormatException localNumberFormatException) {
        continue;
      }
      localNumberFormatException = arrayOfComponent[3].component(j).text();String str = arrayOfComponent[4].component(j).text();
      boolean bool2 = arrayOfComponent[5].component(j).textureId() == 18694;
      int n = -1;
      try {
        n = Integer.parseInt(arrayOfComponent[6].component(j).text());
      }
      catch (NumberFormatException localNumberFormatException1) {}
      
      localNumberFormatException1 = new World(j, k, bool1, m, localNumberFormatException, str, bool2, n);
      if (arg0.accept(localNumberFormatException1)) {
        localArrayList.add(localNumberFormatException1);
      }
    }
    return localArrayList;
  }
  
  public World world() {
    World localWorld = new World(-1, -1, false, -1, "", "", false, -1);
    String str = ctx).widgets.component(906, 109).text();
    Matcher localMatcher = Pattern.compile("^World\\s(\\d*)$").matcher(str);
    if (localMatcher.find()) {
      final int i = StringUtils.parseInt(localMatcher.group(1));
      List localList = worlds(new Filter()
      {
        public boolean accept(Lobby.World arg0) {
          return arg0.number() == i;
        }
      });
      return localList.size() == 1 ? (World)localList.get(0) : localWorld;
    }
    return localWorld;
  }
  
  public boolean world(World arg0) {
    final World localWorld = world(number);
    if (number == -1) {
      return false;
    }
    Component localComponent1 = ctx).widgets.component(910, 81).component(index);
    Component localComponent2 = ctx).widgets.component(910, 66);
    Component localComponent3 = ctx).widgets.component(910, 90);
    (ctx).widgets.scroll(localComponent1, localComponent2, localComponent3, true)) && (localComponent1.click("Select", "World " + number) && (Condition.wait(new Condition.Check()
    {
      public boolean poll() {
        return world().number == localWorldnumber;
      }
    }));
  }
  
  public boolean enterGame() {
    final Component localComponent1 = ctx).widgets.component(906, 121);
    if ((!localComponent1.visible()) && (
      (!tab(Tab.PLAYER_INFO)) || (!Condition.wait(new Condition.Check()
    {
      public boolean poll() {
        return localComponent1.visible();
      }
    }))))
    {




      return false;
    }
    
    if ((localComponent1.click()) && (Condition.wait(new Condition.Check()
    {
      public boolean poll() {
        return ctx).game.clientState() != 7;
      }
    })))
    {
      int i;
      



      while ((i = ctx).game.clientState()) != 11) {
        final Component localComponent2 = ctx).widgets.component(906, 703);
        if (!Condition.wait(new Condition.Check()
        {
          public boolean poll() {
            int i = ctx).game.clientState();
            return (i == 11) || (i == 7) || (localComponent2.visible());
          }
        }, 600, 50)) {
          break;
        }
        





        if ((i == 7) || ((localComponent2.visible()) && (localComponent2.click()))) {
          ctx).properties.put("login.world", "0");
          break;
        }
      }
    }
    return ctx).game.clientState() == 11;
  }
  
  public static enum Tab {
    PLAYER_INFO,  WORLD_SELECT,  FRIENDS,  FRIENDS_CHAT,  CLAN_CHAT,  OPTIONS,  NONE;
    
    private Tab() {}
    public int component() { return 3 + 4 * ordinal(); }
  }
  
  public final class World
  {
    private final int index;
    private final int number;
    private final boolean favorite;
    private final int players;
    private final String activity;
    private final String type;
    private final boolean lootshare;
    private final int ping;
    
    public World(int arg1, int arg2, boolean arg3, int arg4, String arg5, String arg6, boolean arg7, int arg8) {
      index = arg1;
      number = arg2;
      favorite = arg3;
      players = arg4;
      activity = arg5;
      type = arg6;
      lootshare = arg7;
      ping = arg8;
    }
    
    public int componentIndex() {
      return index;
    }
    
    public int number() {
      return number;
    }
    
    public boolean favorite() {
      return favorite;
    }
    
    public int players() {
      return players;
    }
    
    public String activity() {
      return activity;
    }
    
    public String type() {
      return type;
    }
    
    public boolean lootshare() {
      return lootshare;
    }
    
    public int ping() {
      return ping;
    }
    
    public boolean members() {
      return type.equalsIgnoreCase("Members");
    }
    
    public boolean equals(Object arg0)
    {
      return ((arg0 instanceof World)) && (number == number);
    }
  }
}
