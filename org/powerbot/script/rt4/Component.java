package org.powerbot.script.rt4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Arrays;
import org.powerbot.bot.rt4.HashTable;
import org.powerbot.bot.rt4.client.Client;
import org.powerbot.bot.rt4.client.WidgetNode;
import org.powerbot.script.Calculations;




public class Component
  extends Interactive
{
  public static final Color TARGET_STROKE_COLOR = new Color(0, 255, 0, 150);
  public static final Color TARGET_FILL_COLOR = new Color(0, 0, 0, 50);
  
  private final Widget widget;
  private final Component component;
  private final int index;
  private Component[] sparseCache;
  
  Component(ClientContext arg0, Widget arg1, int arg2)
  {
    this(arg0, arg1, null, arg2);
  }
  
  Component(ClientContext arg0, Widget arg1, Component arg2, int arg3) {
    super(arg0);
    widget = arg1;
    component = arg2;
    index = arg3;
    
    sparseCache = new Component[0];
  }
  

  public void bounds(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {}
  
  public Widget widget()
  {
    return widget;
  }
  
  public Component parent() {
    if (component == null) {
      return new Component((ClientContext)ctx, ctx).widgets.nil(), -1);
    }
    return component;
  }
  
  public int index() {
    return index;
  }
  
  public Point screenPoint() {
    Client localClient = (Client)((ClientContext)ctx).client();
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    if ((localClient == null) || (localWidget == null)) {
      return new Point(-1, -1);
    }
    int i = parentId();
    if (i != -1) {
      localObject1 = ctx).widgets.widget(i >> 16).component(i & 0xFFFF);
      localObject2 = ((Component)localObject1).screenPoint();
      if ((x != -1) && (y != -1)) {
        j = localWidget.getScrollHeight() == 0 ? 1 : 0;
        return new Point(x + localWidget
          .getX() - (j != 0 ? ((Component)localObject1).scrollX() : 0), y + localWidget
          .getY() - (j != 0 ? ((Component)localObject1).scrollY() : 0));
      }
    }
    
    Object localObject1 = localClient.getWidgetBoundsX();Object localObject2 = localClient.getWidgetBoundsY();
    int j = boundsIndex();
    if ((localObject1 != null) && (localObject2 != null) && (j >= 0) && (j < localObject1.length) && (j < localObject2.length)) {
      int k = localObject1[j];int m = localObject2[j];
      return new Point(k - localWidget.getScrollX(), m - localWidget.getScrollY());
    }
    return new Point(-1, -1);
  }
  
  public int relativeX() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getX() : -1;
  }
  
  public int relativeY() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getY() : -1;
  }
  
  public int width() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getWidth() : -1;
  }
  
  public int height() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getHeight() : -1;
  }
  
  public Rectangle boundingRect() {
    Point localPoint = screenPoint();
    return new Rectangle(x, y, width(), height());
  }
  
  public int borderThickness() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getBorderThickness() : -1;
  }
  
  public int type() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getType() : -1;
  }
  
  public int id() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getId() : -1;
  }
  
  public int parentId() {
    Client localClient = (Client)((ClientContext)ctx).client();
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    if ((localClient == null) || (localWidget == null)) {
      return -1;
    }
    int i = localWidget.getParentId();
    if (i != -1) {
      return i;
    }
    
    int j = id() >>> 16;
    for (WidgetNode localWidgetNode : new HashTable(localClient.getWidgetTable(), WidgetNode.class)) {
      if (j == localWidgetNode.getUid()) {
        return (int)localWidgetNode.getId();
      }
    }
    return -1;
  }
  
  public synchronized Component component(int arg0) {
    if (arg0 < 0) {
      return new Component((ClientContext)ctx, widget, this, -1);
    }
    if ((arg0 < sparseCache.length) && (sparseCache[arg0] != null)) {
      return sparseCache[arg0];
    }
    Component localComponent = new Component((ClientContext)ctx, widget, this, arg0);
    int i = sparseCache.length;
    if (arg0 >= i) {
      sparseCache = ((Component[])Arrays.copyOf(sparseCache, arg0 + 1));
      for (int j = i; j < arg0 + 1; j++) {
        sparseCache[j] = new Component((ClientContext)ctx, widget, this, j);
      }
    }
    return sparseCache[arg0] =  = localComponent;
  }
  
  public synchronized int componentCount() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    Object localObject = localWidget != null ? localWidget.getChildren() : null;
    return localObject != null ? localObject.length : 0;
  }
  
  public Component[] components() {
    int i = componentCount();
    if (i <= 0) {
      return new Component[0];
    }
    component(i - 1);
    return (Component[])Arrays.copyOf(sparseCache, i);
  }
  
  public int contentType() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getContentType() : -1;
  }
  
  public int modelId() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getModelId() : -1;
  }
  
  public int modelType() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getModelType() : -1;
  }
  
  public int modelZoom() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getModelZoom() : -1;
  }
  
  public String[] actions() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    String[] arrayOfString1 = localWidget != null ? localWidget.getActions() : new String[0];
    String[] arrayOfString2 = arrayOfString1 != null ? (String[])arrayOfString1.clone() : new String[0];
    for (int i = 0; i < (arrayOfString2 != null ? arrayOfString2.length : 0); i++) {
      if (arrayOfString2[i] == null) {
        arrayOfString2[i] = "";
      }
    }
    return arrayOfString2 != null ? arrayOfString2 : new String[0];
  }
  
  public int angleX() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getAngleX() : -1;
  }
  
  public int angleY() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getAngleY() : -1;
  }
  
  public int angleZ() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getAngleZ() : -1;
  }
  
  public String text() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    String str = localWidget != null ? localWidget.getText() : "";
    return str != null ? str : "";
  }
  
  public String tooltip() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    String str = localWidget != null ? localWidget.getTooltip() : "";
    return str != null ? str : "";
  }
  
  public int textColor() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getTextColor() : -1;
  }
  
  public int scrollX() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getScrollX() : -1;
  }
  
  public int scrollY() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getScrollY() : -1;
  }
  
  public int scrollWidth() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getScrollWidth() : -1;
  }
  
  public int scrollHeight() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getScrollHeight() : -1;
  }
  
  public int boundsIndex() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getBoundsIndex() : -1;
  }
  
  public int textureId() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getTextureId() : -1;
  }
  
  public int[] itemIds() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    int[] arrayOfInt1 = localWidget != null ? localWidget.getItemIds() : new int[0];
    int[] arrayOfInt2 = (int[])(arrayOfInt1 != null ? arrayOfInt1 : new int[0]).clone();
    for (int i = 0; i < arrayOfInt2.length; i++) {
      arrayOfInt2[i] -= 1;
    }
    return arrayOfInt2;
  }
  
  public int[] itemStackSizes() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    int[] arrayOfInt = localWidget != null ? localWidget.getItemStackSizes() : new int[0];
    return (int[])(arrayOfInt != null ? arrayOfInt : new int[0]).clone();
  }
  
  public int itemId() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getItemId() : -1;
  }
  
  public int itemStackSize() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return localWidget != null ? localWidget.getItemStackSize() : -1;
  }
  
  public Point centerPoint()
  {
    Point localPoint = screenPoint();
    localPoint.translate(width() / 2, height() / 2);
    return localPoint;
  }
  
  public Point nextPoint()
  {
    Rectangle localRectangle = new Rectangle(screenPoint(), new Dimension(width(), height()));
    int i = x;int j = y;
    int k = width;int m = height;
    if ((x != -1) && (y != -1) && (width != -1) && (height != -1)) {
      return Calculations.nextPoint(localRectangle, new Rectangle(i + k / 2, j + m / 2, k / 4, m / 4));
    }
    return new Point(-1, -1);
  }
  
  public boolean contains(Point arg0)
  {
    Point localPoint = screenPoint();
    Rectangle localRectangle = new Rectangle(x, y, width(), height());
    return localRectangle.contains(arg0);
  }
  
  public boolean valid()
  {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    return (localWidget != null) && ((component == null) || (component.visible())) && 
      (id() != -1) && (localWidget.getBoundsIndex() != -1);
  }
  
  public boolean visible() {
    org.powerbot.bot.rt4.client.Widget localWidget = getInternal();
    int i = 0;
    if ((localWidget != null) && (valid()) && (!localWidget.isHidden())) {
      i = parentId();
    }
    return (i == -1) || ((i != 0) && (ctx).widgets.widget(i >> 16).component(i & 0xFFFF).visible()));
  }
  
  private org.powerbot.bot.rt4.client.Widget getInternal() {
    int i = widget.id();
    if ((i < 1) || (index < 0)) {
      return null;
    }
    if (component != null) {
      localObject = component.getInternal();
      arrayOfWidget = localObject != null ? ((org.powerbot.bot.rt4.client.Widget)localObject).getChildren() : null;
      if ((arrayOfWidget != null) && (index < arrayOfWidget.length)) {
        return arrayOfWidget[index];
      }
      return null;
    }
    Object localObject = (Client)((ClientContext)ctx).client();
    org.powerbot.bot.rt4.client.Widget[][] arrayOfWidget = localObject != null ? ((Client)localObject).getWidgets() : (org.powerbot.bot.rt4.client.Widget[][])null;
    if ((arrayOfWidget != null) && (i < arrayOfWidget.length)) {
      org.powerbot.bot.rt4.client.Widget[] arrayOfWidget1 = arrayOfWidget[i];
      return (arrayOfWidget1 != null) && (index < arrayOfWidget1.length) ? arrayOfWidget1[index] : null;
    }
    return null;
  }
  
  public String toString()
  {
    return String.format("%s (%s)[%s]", new Object[] { widget, component, Integer.valueOf(index) });
  }
}
