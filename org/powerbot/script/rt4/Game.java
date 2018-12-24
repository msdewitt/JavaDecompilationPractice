package org.powerbot.script.rt4;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Point;
import java.util.concurrent.atomic.AtomicReference;
import org.powerbot.bot.AbstractBot;
import org.powerbot.bot.rt4.client.Client;
import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Crosshair;
import org.powerbot.script.Filter;
import org.powerbot.script.MenuCommand;
import org.powerbot.script.Tile;

public class Game extends ClientAccessor
{
  private static final int[] ARRAY_SIN = new int['ࠀ'];
  private static final int[] ARRAY_COS = new int['ࠀ'];
  
  static
  {
    for (int i = 0; i < 2048; i++) {
      ARRAY_SIN[i] = ((int)(65536.0D * Math.sin(i * 0.0030679615D)));
      ARRAY_COS[i] = ((int)(65536.0D * Math.cos(i * 0.0030679615D)));
    }
  }
  
  public Game(ClientContext arg0) {
    super(arg0);
  }
  




  public boolean logout()
  {
    if (ctx).game.tab(Tab.LOGOUT)) {
      Component localComponent = ctx).widgets.widget(182).component(12);
      if ((localComponent.visible()) && (localComponent.valid()) && (localComponent.interact("Logout"))) {
        Condition.wait(new Condition.Check()
        {
          public boolean poll() {
            return clientState() == 10;
          }
        });
      }
    }
    return false;
  }
  






  public boolean tab(Tab arg0)
  {
    return tab(arg0, false);
  }
  







  public boolean tab(final Tab arg0, boolean arg1)
  {
    if (arg0 == tab()) {
      return true;
    }
    Keybind localKeybind;
    String str;
    boolean bool;
    if ((arg1) && ((localKeybind = Keybind.keybind(arg0)) != Keybind.NONE) && (!(str = localKeybind.key((ClientContext)ctx)).equals(""))) {
      bool = ctx).input.send(str);
    } else {
      Component localComponent = getByTexture(textures);
      bool = (localComponent != null) && (localComponent.click(new Filter()
      {
        public boolean accept(MenuCommand arg0) {
          for (String str : arg0tips) {
            if (action.equals(str)) {
              return true;
            }
          }
          return false;
        }
      }));
    }
    (bool) && (Condition.wait(new Condition.Check()
    {

      public boolean poll() { return tab() == arg0; } }, 50, 10));
  }
  






  public Tab tab()
  {
    for (Tab localTab : ) {
      Component localComponent1 = getByTexture(textures);
      if (localComponent1 != null)
      {
        try
        {
          Component localComponent2 = ctx).widgets.widget(localComponent1.widget().id()).component(localComponent1.index() - openedTabIndexOffset(localTab));
          if (localComponent2.textureId() != -1) {
            return localTab;
          }
        } catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException1) {}
      }
    }
    return Tab.NONE;
  }
  
  private int openedTabIndexOffset(Tab arg0) {
    if (bottomLineTabs()) {
      switch (4.$SwitchMap$org$powerbot$script$rt4$Game$Tab[arg0.ordinal()]) {
      case 1: 
        return 1;
      case 2: 
      case 3: 
      case 4: 
      case 5: 
      case 6: 
      case 7: 
        return 6;
      }
      return 7;
    }
    

    return 7;
  }
  
  private Component getByTexture(int... arg0) {
    Widget localWidget = ctx).widgets.widget(resizable() ? 161 : bottomLineTabs() ? 164 : 548);
    for (Component localComponent : localWidget.components()) {
      for (int n : arg0) {
        if (localComponent.textureId() == n) {
          return localComponent;
        }
      }
    }
    return null;
  }
  




  public boolean escapeClosing()
  {
    return ctx).varpbits.varpbit(1224) < 0;
  }
  




  public boolean loggedIn()
  {
    int i = clientState();
    return (i == 30) || (i == 25);
  }
  




  public Dimension dimensions()
  {
    Applet localApplet = (Applet)ctx).bot()).chrome.target.get();
    return localApplet != null ? new Dimension(localApplet.getWidth(), localApplet.getHeight()) : new Dimension(-1, -1);
  }
  





  public int clientState()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    return localClient != null ? localClient.getClientState() : -1;
  }
  




  public int floor()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    return localClient != null ? localClient.getFloor() : -1;
  }
  




  public Crosshair crosshair()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    int i = localClient != null ? localClient.getCrosshairIndex() : -1;
    if ((i < 0) || (i > 2)) {
      return Crosshair.NONE;
    }
    return Crosshair.values()[i];
  }
  




  public Tile mapOffset()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return Tile.NIL;
    }
    return new Tile(localClient.getOffsetX(), localClient.getOffsetY(), localClient.getFloor());
  }
  





  public boolean inViewport(Point arg0)
  {
    return pointInViewport(x, y);
  }
  




  public boolean resizable()
  {
    return ctx).widgets.widget(548).component(12).screenPoint().x != 4;
  }
  




  public boolean bottomLineTabs()
  {
    return (resizable()) && ((ctx).varpbits.varpbit(1055) >>> 8 & 0x1) == 1);
  }
  






  public boolean pointInViewport(int arg0, int arg1)
  {
    if (resizable()) {
      Dimension localDimension = dimensions();
      return (arg0 >= 0) && (arg1 >= 0) && ((arg0 > 520) || (arg1 <= height - 170)) && ((arg0 < width - 245) || ((arg1 < height - 340) && (arg1 > 170))) && (arg0 <= width - 1) && (arg1 <= height - 1);
    }
    

    return (arg0 >= 4) && (arg1 >= 4) && (arg0 <= 515) && (arg1 <= 337);
  }
  





  public HintArrow hintArrow()
  {
    HintArrow localHintArrow = new HintArrow();
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return localHintArrow;
    }
    return localHintArrow;
  }
  





  public Point tileToMap(Tile arg0)
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return new Point(-1, -1);
    }
    int i = ctx).players.local().relative();
    int j = localClient.getMinimapAngle() & 0x7FF;
    int[] arrayOfInt = { arg0.x(), arg0.y(), ARRAY_SIN[j], ARRAY_COS[j], -1, -1 };
    arrayOfInt[0] = ((arrayOfInt[0] - localClient.getOffsetX()) * 4 + 2 - (i >> 16) / 32);
    arrayOfInt[1] = ((arrayOfInt[1] - localClient.getOffsetY()) * 4 + 2 - (i & 0xFFFF) / 32);
    arrayOfInt[4] = (arrayOfInt[1] * arrayOfInt[2] + arrayOfInt[3] * arrayOfInt[0] >> 16);
    arrayOfInt[5] = (arrayOfInt[2] * arrayOfInt[0] - arrayOfInt[1] * arrayOfInt[3] >> 16);
    Point localPoint = mapComponent().centerPoint();
    return new Point(x + arrayOfInt[4], y + arrayOfInt[5]);
  }
  








  public int tileHeight(int arg0, int arg1)
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return 0;
    }
    int i = localClient.getFloor();
    int j = arg0 >> 7;
    int k = arg1 >> 7;
    if ((j < 0) || (k < 0) || (j > 103) || (k > 103) || (i < 0) || (i > 3))
    {
      return 0;
    }
    byte[][][] arrayOfByte = localClient.getLandscapeMeta();
    int[][][] arrayOfInt = localClient.getTileHeights();
    if (arrayOfByte == null) {
      return 0;
    }
    if ((i < 3) && ((arrayOfByte[1][j][k] & 0x2) == 2)) {
      i++;
    }
    
    j &= 0x7F;
    k &= 0x7F;
    int m = j * arrayOfInt[i][(1 + j)][k] + arrayOfInt[i][j][k] * (128 - j) >> 7;
    int n = (128 - j) * arrayOfInt[i][j][(1 + k)] + j * arrayOfInt[i][(1 + j)][(k + 1)] >> 7;
    return k * n + m * (128 - k) >> 7;
  }
  









  public Point worldToScreen(int arg0, int arg1, int arg2)
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return new Point(-1, -1);
    }
    return worldToScreen(arg0, tileHeight(arg0, arg1), arg1, arg2);
  }
  










  public Point worldToScreen(int arg0, int arg1, int arg2, int arg3)
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    Point localPoint = new Point(-1, -1);
    if ((arg0 < 128) || (arg0 > 13056) || (arg2 < 128) || (arg2 > 13056))
    {
      return localPoint;
    }
    int i = localClient.getFloor();
    if (i < 0) {
      return localPoint;
    }
    int j = arg1 - arg3;
    int k = arg0 - localClient.getCameraX();int m = arg2 - localClient.getCameraZ();
    int n = j - localClient.getCameraY();
    int i1 = localClient.getCameraPitch();int i2 = localClient.getCameraYaw();
    int[] arrayOfInt = { ARRAY_SIN[i2], ARRAY_COS[i2], ARRAY_SIN[i1], ARRAY_COS[i1] };
    int i3 = arrayOfInt[0] * m + arrayOfInt[1] * k >> 16;
    int i4 = arrayOfInt[1] * m - arrayOfInt[0] * k >> 16;
    int i5 = arrayOfInt[3] * n - arrayOfInt[2] * i4 >> 16;
    int i6 = arrayOfInt[3] * i4 + arrayOfInt[2] * n >> 16;
    if (i6 >= 50) {
      int i7 = 256;int i8 = 167;
      if (ctx).widgets.widget(548).component(12).screenPoint().x != 4) {
        Dimension localDimension = dimensions();
        i7 = width / 2;
        i8 = height / 2;
      }
      int i9 = localClient.getTileSize();
      return new Point(i3 * i9 / i6 + i7, i5 * i9 / i6 + i8);
    }
    


    return localPoint;
  }
  





  public Component mapComponent()
  {
    Widget localWidget = ctx).widgets.widget(resizable() ? 161 : bottomLineTabs() ? 164 : 548);
    for (Component localComponent : localWidget.components()) {
      if (localComponent.contentType() == 1338) {
        return localComponent;
      }
    }
    return new Component((ClientContext)ctx, localWidget, -1);
  }
  


  public static enum Tab
  {
    ATTACK("Combat Options", new int[] { 168 }), 
    STATS("Skills", new int[] { 898 }), 
    QUESTS(new String[] { "Quest List", "Minigames", "Achievement Diaries", "Kourend Tasks" }, new int[] { 776, 1052, 1053, 1299 }), 
    INVENTORY("Inventory", new int[] { 900 }), 
    EQUIPMENT("Worn Equipment", new int[] { 901 }), 
    PRAYER("Prayer", new int[] { 902 }), 
    MAGIC("Magic", new int[] { 780, 1582, 1583, 1584 }), 
    CLAN_CHAT("Clan Chat", new int[] { 904 }), 
    FRIENDS_LIST("Friends List", new int[] { 782 }), 
    IGNORED_LIST("Ignore List", new int[] { 783 }), 
    LOGOUT("Logout", new int[] { 907, 542 }), 
    OPTIONS("Options", new int[] { 908 }), 
    EMOTES("Emotes", new int[] { 909 }), 
    MUSIC("Music Player", new int[] { 910 }), 
    NONE("", new int[] { -1 });
    
    public final String[] tips;
    public final int[] textures;
    
    private Tab(String arg2, int... arg3) { this(new String[] { arg2 }, arg3); }
    
    private Tab(String[] arg2, int... arg3)
    {
      tips = arg2;
      textures = arg3;
    }
  }
  

  public static enum Crosshair
    implements Crosshair
  {
    NONE,  DEFAULT,  ACTION;
    
    private Crosshair() {} }
  
  public static enum Keybind { NONE(Game.Tab.NONE, -1, -1), 
    ATTACK(Game.Tab.ATTACK, 1224, 0), 
    STATS(Game.Tab.STATS, 1224, 5), 
    QUESTS(Game.Tab.QUESTS, 1224, 10), 
    INVENTORY(Game.Tab.INVENTORY, 1224, 15), 
    EQUIPMENT(Game.Tab.EQUIPMENT, 1224, 20), 
    PRAYER(Game.Tab.PRAYER, 1224, 25), 
    MAGIC(Game.Tab.MAGIC, 1225, 0), 
    FRIENDS_LIST(Game.Tab.FRIENDS_LIST, 1225, 10), 
    IGNORED_LIST(Game.Tab.IGNORED_LIST, 1225, 15), 
    LOGOUT(Game.Tab.LOGOUT, 1226, 5), 
    OPTIONS(Game.Tab.OPTIONS, 1225, 20), 
    EMOTES(Game.Tab.EMOTES, 1225, 25), 
    CLAN_CHAT(Game.Tab.CLAN_CHAT, 1225, 5), 
    MUSIC(Game.Tab.MUSIC, 1226, 0);
    
    private static final int KEY_MASK = 15;
    private final Game.Tab tab;
    
    private Keybind(Game.Tab arg2, int arg3, int arg4) {
      tab = arg2;
      varpbit = arg3;
      shift = arg4; }
    
    private final int varpbit;
    private final int shift;
    public static Keybind keybind(Game.Tab arg0) { for (Keybind localKeybind : ) {
        if (tab == arg0) {
          return localKeybind;
        }
      }
      return NONE;
    }
    
    public String key(ClientContext arg0) {
      if (this == NONE) {
        return "";
      }
      int i = varpbits.varpbit(varpbit);
      if (i < 0) {
        i -= Integer.MIN_VALUE;
      }
      i = i >>> shift & 0xF;
      if (i == 0) {
        return "";
      }
      return "{VK_F" + i + "}";
    }
  }
}
