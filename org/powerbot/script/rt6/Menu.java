package org.powerbot.script.rt6;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.powerbot.bot.rt6.NodeQueue;
import org.powerbot.bot.rt6.client.Client;
import org.powerbot.bot.rt6.client.MenuGroupNode;
import org.powerbot.bot.rt6.client.MenuItemNode;
import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Filter;
import org.powerbot.script.Input;
import org.powerbot.script.MenuCommand;
import org.powerbot.script.Random;
import org.powerbot.script.StringUtils;
import org.powerbot.script.Vector2;

public class Menu
  extends ClientAccessor
{
  private Component tooltipComp = null;
  
  public Menu(ClientContext arg0) {
    super(arg0);
  }
  





  public static Filter<MenuCommand> filter(String arg0)
  {
    return filter(arg0, null);
  }
  






  public static Filter<MenuCommand> filter(String arg0, String arg1)
  {
    String str1 = arg0 != null ? arg0.toLowerCase() : null;
    final String str2 = arg1 != null ? arg1.toLowerCase() : null;
    new Filter()
    {
      public boolean accept(MenuCommand arg0) {
        return ((val$a == null) || (action.toLowerCase().contains(val$a))) && ((str2 == null) || 
          (str2.equalsIgnoreCase("null")) || (option.toLowerCase().contains(str2)));
      }
    };
  }
  




  public boolean opened()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    return (localClient != null) && (localClient.isMenuOpen());
  }
  





  public int indexOf(Filter<? super MenuCommand> arg0)
  {
    MenuCommand[] arrayOfMenuCommand = commands();
    for (int i = 0; i < arrayOfMenuCommand.length; i++) {
      if (arg0.accept(arrayOfMenuCommand[i])) {
        return i;
      }
    }
    return -1;
  }
  





  public boolean hover(Filter<? super MenuCommand> arg0)
  {
    return select(arg0, false);
  }
  





  public boolean click(Filter<? super MenuCommand> arg0)
  {
    return select(arg0, true);
  }
  
  private boolean select(final Filter<? super MenuCommand> arg0, boolean arg1) {
    final Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return false;
    }
    int i = indexOf(arg0);
    if (i == -1) {
      return false;
    }
    
    if ((arg1) && (!localClient.isMenuOpen() && (!Condition.wait(new Condition.Check()
    {
      public boolean poll() {
        return (indexOf(arg0) != 0) && (!arg0.accept(tooltip()));
      }
    }, 10, 10)))
    {




      return ctx).input.click(true);
    }
    
    if ((!localClient.isMenuOpen()) && 
      (ctx).input.click(false))) {
      Condition.wait(new Condition.Check()
      {

        public boolean poll() { return localClient.isMenuOpen(); } }, 5, 20);
      

      Condition.sleep(Random.hicks(i));
      
      if (!localClient.isMenuOpen()) {
        return false;
      }
      if ((i = indexOf(arg0)) == -1) {
        close();
        return false;
      }
    }
    

    Point localPoint = hoverIndex(localClient, i);
    return (localPoint.getX() != -1.0D) && (localPoint.getY() != -1.0D) && ((!arg1) || (ctx).input.click(localPoint, true)));
  }
  




  public boolean close()
  {
    final Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return false;
    }
    if (!localClient.isMenuOpen()) {
      return true;
    }
    
    Game.Viewport localViewport = ctx).game.getViewport();
    int i = localClient.getMenuX();int j = localClient.getMenuY();
    

    int k = m = i;
    int i1; int n = i1 = Math.min((int)my - 5, Math.max(4, j + Random.nextInt(-10, 10)));
    k = Math.max(4, k + Random.nextInt(-30, -10));
    
    int m = m + localClient.getMenuWidth() + (localClient.isMenuCollapsed() ? localClient.getSubMenuWidth() : 0) + Random.nextInt(10, 30);
    if ((m <= (int)mx - 5) && ((k - i >= 5) || (Random.nextBoolean()))) {
      ctx).input.move(m, i1);
    } else {
      ctx).input.move(k, n);
    }
    Condition.wait(new Condition.Check()
    {

      public boolean poll() { return localClient.isMenuOpen(); } }, 10, 50);
  }
  

  public Rectangle bounds()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if ((localClient == null) || (!opened())) {
      return new Rectangle(-1, -1, -1, -1);
    }
    return new Rectangle(localClient.getMenuX(), localClient.getMenuY(), localClient.getMenuWidth(), localClient.getMenuHeight());
  }
  
  private Point hoverIndex(Client arg0, int arg1) {
    int i = 0;int j = -1;
    Vector2 localVector2 = new Vector2(0, 16 * arg1);
    
    if (arg0.isMenuCollapsed()) {
      for (localObject = NodeQueue.get(arg0.getCollapsedMenuItems(), MenuGroupNode.class).iterator(); ((Iterator)localObject).hasNext();) { MenuGroupNode localMenuGroupNode = (MenuGroupNode)((Iterator)localObject).next();
        j++;
        List localList = NodeQueue.get(localMenuGroupNode.getItems(), MenuItemNode.class);
        for (int k = 0; k < localList.size(); k++) {
          if (i++ == arg1) {
            if (k == 0) {
              localVector2 = new Vector2(0, 16 * j);
              break label166;
            }
            return hoverSub(arg0, j, k);
          }
        }
      }
      


      if (arg0.isMenuOpen()) {
        close();
      }
      return new Point(-1, -1);
    }
    
    label166:
    
    Object localObject = new Vector2(arg0.getMenuX() + Random.nextInt(4, arg0.getMenuWidth() - 5), arg0.getMenuY() + 21 + Random.nextInt(2, 15)).add(localVector2);
    return (ctx).input.move(((Vector2)localObject).toPoint())) && (arg0.isMenuOpen()) ? ((Vector2)localObject).toPoint() : new Point(-1, -1);
  }
  

  private Point hoverSub(Client arg0, int arg1, int arg2)
  {
    Vector2 localVector2 = new Vector2(arg0.getMenuX() + Random.nextInt(4, arg0.getMenuWidth() - 5), arg0.getMenuY() + (21 + 16 * arg1 + Random.nextInt(2, 15)));
    
    if (ctx).input.move(localVector2.toPoint())) {
      Condition.sleep();
      if (arg0.isMenuOpen()) {
        Point localPoint1 = ctx).input.getLocation();
        
        int j = arg0.getSubMenuX();
        int i; if ((ctx).input.move(i = j + Random.nextInt(4, arg0.getSubMenuWidth() - 5), y)) && (arg0.isMenuOpen())) {
          int k = arg0.getSubMenuY();
          Point localPoint2 = new Point(i, k + (16 * arg2 + Random.nextInt(2, 15) + 21));
          if (ctx).input.move(localPoint2)) {
            Condition.sleep();
            return arg0.isMenuOpen() ? localPoint2 : new Point(-1, -1);
          }
        }
      }
    }
    if (arg0.isMenuOpen()) {
      close();
    }
    return new Point(-1, -1);
  }
  
  private List<MenuItemNode> getMenuItemNodes() {
    LinkedList localLinkedList = new LinkedList();
    
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null)
      return localLinkedList;
    boolean bool;
    Object localObject1;
    Object localObject2;
    if ((bool = localClient.isMenuCollapsed())) {
      for (localObject1 = NodeQueue.get(localClient.getCollapsedMenuItems(), MenuGroupNode.class).iterator(); ((Iterator)localObject1).hasNext();) { localObject2 = (MenuGroupNode)((Iterator)localObject1).next();
        localLinkedList.addAll(NodeQueue.get(((MenuGroupNode)localObject2).getItems(), MenuItemNode.class));
      }
    } else {
      localLinkedList.addAll(NodeQueue.get(localClient.getMenuItems(), MenuItemNode.class));
    }
    if (localLinkedList.size() > 1) {
      localObject1 = (MenuItemNode)localLinkedList.get(0);
      localObject2 = ((MenuItemNode)localObject1).getAction();
      if (localObject2 != null) if (StringUtils.stripHtml((String)localObject2).equalsIgnoreCase(bool ? "Walk here" : "Cancel")) {
          Collections.reverse(localLinkedList);
        }
    }
    return localLinkedList;
  }
  




  public String[] items()
  {
    MenuCommand[] arrayOfMenuCommand = commands();
    int i = arrayOfMenuCommand.length;
    String[] arrayOfString = new String[i];
    for (int j = 0; j < i; j++) {
      arrayOfString[j] = (action + " " + option);
      arrayOfString[j] = arrayOfString[j].trim();
    }
    return arrayOfString;
  }
  




  public MenuCommand[] commands()
  {
    List localList = getMenuItemNodes();
    int i = localList.size();
    MenuCommand[] arrayOfMenuCommand = new MenuCommand[i];
    for (int j = 0; j < i; j++) {
      MenuItemNode localMenuItemNode = (MenuItemNode)localList.get(j);
      arrayOfMenuCommand[j] = new MenuCommand(localMenuItemNode.getAction(), localMenuItemNode.getOption());
    }
    return arrayOfMenuCommand;
  }
  




  public MenuCommand tooltip()
  {
    Component localComponent = tooltipComp == null ? (this.tooltipComp = getTooltipComponent()) : tooltipComp;
    if ((localComponent == null) || (!localComponent.parent().visible())) {
      return new MenuCommand("", "");
    }
    String str1 = localComponent.text();
    
    int i = str1.indexOf("<", 1);
    if (i == -1) {
      return new MenuCommand("", "");
    }
    String str2 = str1.substring(0, i).trim();
    int j = 0;
    for (int n : str1.toCharArray()) {
      if (n == 60) {
        j++;
      }
    }
    if (j <= 2) {
      return new MenuCommand(str2, "");
    }
    ??? = str1.substring(i - 1, str1.length()).trim();
    return new MenuCommand(str2, (String)???);
  }
  
  private Component getTooltipComponent() {
    for (Component localComponent : ctx).widgets.widget(1477)) {
      if ((localComponent.childrenCount() > 0) && (localComponent.text().contains("<col=ebe0bc>"))) {
        return localComponent;
      }
    }
    return null;
  }
  
  @Deprecated
  public static class Command extends MenuCommand {
    protected Command(String arg0, String arg1) {
      super(arg1);
    }
  }
}
