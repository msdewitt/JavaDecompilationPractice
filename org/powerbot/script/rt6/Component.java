package org.powerbot.script.rt6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.io.PrintStream;
import org.powerbot.bot.rt6.HashTable;
import org.powerbot.bot.rt6.client.Client;
import org.powerbot.bot.rt6.client.ComponentNode;
import org.powerbot.script.Calculations;
import org.powerbot.script.Drawable;
import org.powerbot.script.Identifiable;
import org.powerbot.script.StringUtils;


public class Component
  extends Interactive
  implements Drawable, Displayable, Identifiable
{
  static final int RECURSION_DEPTH = 20;
  public static final Color TARGET_FILL_COLOR = new Color(0, 0, 0, 50);
  public static final Color TARGET_STROKE_COLOR = new Color(0, 255, 0, 150);
  private final Widget widget;
  private final Component parent;
  private final int index;
  
  public Component(ClientContext arg0, Widget arg1, int arg2) {
    this(arg0, arg1, null, arg2);
  }
  
  public Component(ClientContext arg0, Widget arg1, Component arg2, int arg3) {
    super(arg0);
    widget = arg1;
    parent = arg2;
    index = arg3;
  }
  
  public Widget widget() {
    return widget;
  }
  
  public Component parent() {
    if (parent == null) {
      return new Component((ClientContext)ctx, ctx).widgets.nil(), -1);
    }
    return parent;
  }
  
  public int index() {
    return index;
  }
  



  public void bounds(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {}
  


  public Component component()
  {
    return this;
  }
  
  public Component[] components() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    Object[] arrayOfObject;
    if ((localWidget != null) && ((arrayOfObject = localWidget.getComponents()) != null)) {
      Component[] arrayOfComponent = new Component[arrayOfObject.length];
      for (int i = 0; i < arrayOfObject.length; i++) {
        arrayOfComponent[i] = new Component((ClientContext)ctx, widget, this, i);
      }
      return arrayOfComponent;
    }
    return new Component[0];
  }
  
  public int childrenCount() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    Object[] arrayOfObject;
    if ((localWidget != null) && ((arrayOfObject = localWidget.getComponents()) != null)) {
      return arrayOfObject.length;
    }
    return 0;
  }
  
  public Component component(int arg0) {
    if (arg0 < 0) {
      throw new IndexOutOfBoundsException(arg0 + " < " + 0);
    }
    return new Component((ClientContext)ctx, widget, this, arg0);
  }
  
  public String[] actions() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    String[] arrayOfString = new String[0];
    if ((localWidget != null) && 
      ((arrayOfString = localWidget.getActions()) == null)) {
      arrayOfString = new String[0];
    }
    
    return (String[])arrayOfString.clone();
  }
  
  public int textureId() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getTextureId() : -1;
  }
  
  public int borderThickness() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getBorderThinkness() : -1;
  }
  



  public int id()
  {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getId() : -1;
  }
  
  public int itemIndex() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getComponentIndex() : -1;
  }
  
  public String itemName() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    String str = "";
    if ((localWidget != null) && ((str = localWidget.getComponentName()) == null)) {
      str = "";
    }
    return StringUtils.stripHtml(str);
  }
  
  public int itemId() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getComponentId() : -1;
  }
  
  public int itemStackSize() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getComponentStackSize() : -1;
  }
  
  public int modelId() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getModelId() : -1;
  }
  
  public int modelType() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getModelType() : -1;
  }
  
  public int modelZoom() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getModelZoom() : -1;
  }
  
  public int parentId() {
    Client localClient = (Client)((ClientContext)ctx).client();
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    if ((localClient == null) || (localWidget == null)) {
      return -1;
    }
    
    int i = localWidget.getParentId();
    if (i != -1) {
      return i;
    }
    

    int j = id() >>> 16;
    int k = 0;
    for (ComponentNode localComponentNode : new HashTable(localClient.getWidgetTable(), ComponentNode.class)) {
      if (j == localComponentNode.getUid()) {
        return (int)localComponentNode.getId();
      }
      if (k++ >= 1500) {
        System.out.printf("WARNING: parentId operation killed -- beyond depth of %d.%n", new Object[] { Integer.valueOf(1500) });
        break;
      }
    }
    return -1;
  }
  
  public Point screenPoint() {
    return _screenPoint(1);
  }
  
  private Point _screenPoint(int arg0) {
    if (arg0 > 20) {
      return new Point(-1, -1);
    }
    Client localClient = (Client)((ClientContext)ctx).client();
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    if ((localClient == null) || (localWidget == null)) {
      return new Point(-1, -1);
    }
    int i = parentId();
    int j = 0;int k = 0;
    Object localObject; int m; if (i != -1) {
      localObject = ctx).widgets.component(i >> 16, i & 0xFFFF)._screenPoint(arg0 + 1);
      j = x;
      k = y;
    } else {
      localObject = localClient.getWidgetBoundsArray();
      m = localWidget.getBoundsArrayIndex();
      if ((localObject != null) && (m > 0) && (m < localObject.length) && (localObject[m] != null)) {
        return new Point(x, y);
      }
    }
    if (i != -1) {
      localObject = ctx).widgets.component(i >> 16, i & 0xFFFF);
      m = ((Component)localObject).scrollWidthMax();int n = ((Component)localObject).scrollHeightMax();
      if ((m > 0) || (n > 0)) {
        j -= ((Component)localObject).scrollX();
        k -= ((Component)localObject).scrollY();
      }
    }
    j += localWidget.getX();
    k += localWidget.getY();
    return new Point(j, k);
  }
  
  public Point relativePoint() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? new Point(localWidget.getX(), localWidget.getY()) : new Point(-1, -1);
  }
  
  public String selectedAction() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    String str = "";
    if ((localWidget != null) && ((str = localWidget.getSelectedActionName()) == null)) {
      str = "";
    }
    return str;
  }
  
  public int shadowColor() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getShadowColor() : -1;
  }
  
  public int contentType() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getSpecialType() : -1;
  }
  
  public String text() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    String str = "";
    if ((localWidget != null) && ((str = localWidget.getText()) == null)) {
      str = "";
    }
    return str;
  }
  
  public int textColor() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getTextColor() : -1;
  }
  
  public String tooltip() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    String str = "";
    if ((localWidget != null) && ((str = localWidget.getTooltip()) == null)) {
      str = "";
    }
    return str;
  }
  
  public int type() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getType() : -1;
  }
  
  public int width() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getWidth() : -1;
  }
  
  public int height() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getHeight() : -1;
  }
  
  public int rotationX() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getXRotation() : -1;
  }
  
  public int rotationY() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getYRotation() : -1;
  }
  
  public int rotationZ() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getZRotation() : -1;
  }
  
  public boolean flippedVertically() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return (localWidget != null) && (localWidget.isVerticallyFlipped());
  }
  
  public boolean flippedHorizontally() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return (localWidget != null) && (localWidget.isHorizontallyFlipped());
  }
  
  public int scrollX() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getHorizontalScrollbarPosition() : -1;
  }
  
  public int scrollWidthMax() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getHorizontalScrollbarSize() : -1;
  }
  
  public int scrollWidth() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getHorizontalScrollbarThumbSize() : -1;
  }
  
  public int scrollY() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getVerticalScrollbarPosition() : -1;
  }
  
  public int scrollHeightMax() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getVerticalScrollbarSize() : -1;
  }
  
  public int scrollHeight() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return localWidget != null ? localWidget.getVerticalScrollbarThumbSize() : -1;
  }
  
  public boolean inventory() {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return (localWidget != null) && (localWidget.isInventoryInterface());
  }
  
  public boolean visible() {
    return _visible(1);
  }
  
  private boolean _visible(int arg0) {
    if (arg0 > 20) {
      System.out.printf("WARNING: Visible operation killed -- beyond depth of %d.%n", new Object[] { Integer.valueOf(20) });
      return false;
    }
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    int i = 0;
    if ((localWidget != null) && (valid()) && (!localWidget.isHidden())) {
      i = parentId();
    }
    return (i == -1) || ((i != 0) && (ctx).widgets.component(i >> 16, i & 0xFFFF)._visible(arg0 + 1)));
  }
  
  public Rectangle boundingRect() {
    Point localPoint = screenPoint();
    if ((x == -1) && (y == -1)) {
      return new Rectangle(0, 0, -1, -1);
    }
    return new Rectangle(x, y, 
      width(), 
      height());
  }
  
  public Rectangle viewportRect()
  {
    Point localPoint = screenPoint();
    if ((x == -1) && (y == -1)) {
      return new Rectangle(0, 0, -1, -1);
    }
    return new Rectangle(x, y, 
      scrollWidth(), 
      scrollHeight());
  }
  

  public Point nextPoint()
  {
    Rectangle localRectangle = getInteractRectangle();
    int i = x;int j = y;
    int k = width;int m = height;
    if ((width != -1) && (height != -1)) {
      return Calculations.nextPoint(localRectangle, new Rectangle(i + k / 2, j + m / 2, k / 4, m / 4));
    }
    return new Point(-1, -1);
  }
  
  public Point centerPoint() {
    Rectangle localRectangle = getInteractRectangle();
    return (localRectangle.getWidth() != -1.0D) && (localRectangle.getHeight() != -1.0D) ? new Point((int)localRectangle.getCenterX(), (int)localRectangle.getCenterY()) : new Point(-1, -1);
  }
  
  public boolean contains(Point arg0)
  {
    return getInteractRectangle().contains(arg0);
  }
  
  public boolean valid()
  {
    org.powerbot.bot.rt6.client.Widget localWidget = getInternalComponent();
    return (localWidget != null) && ((parent == null) || (parent.visible())) && 
      (id() != -1) && (localWidget.getBoundsArrayIndex() != -1);
  }
  
  public void draw(Graphics arg0)
  {
    draw(arg0, 50);
  }
  
  public void draw(Graphics arg0, int arg1)
  {
    Rectangle localRectangle = getInteractRectangle();
    if ((localRectangle.getWidth() == -1.0D) || (localRectangle.getHeight() == -1.0D)) {
      return;
    }
    Color localColor = TARGET_FILL_COLOR;
    int i = localColor.getRGB();
    if ((i >> 24 & 0xFF) != arg1) {
      localColor = new Color(i >> 16 & 0xFF, i >> 8 & 0xFF, i & 0xFF, arg1);
    }
    arg0.setColor(localColor);
    arg0.fillRect(x, y, width, height);
    localColor = TARGET_STROKE_COLOR;
    i = localColor.getRGB();
    arg1 *= 3;
    if ((i >> 24 & 0xFF) != arg1) {
      localColor = new Color(i >> 16 & 0xFF, i >> 8 & 0xFF, i & 0xFF, arg1);
    }
    arg0.setColor(localColor);
    arg0.drawRect(x, y, width, height);
  }
  
  private Rectangle getInteractRectangle() {
    Rectangle localRectangle = viewportRect();
    localRectangle.grow(-1, -1);
    return localRectangle;
  }
  
  private boolean isInScrollableArea() {
    int i = parentId();
    if (i == -1) {
      return false;
    }
    
    int j = 0;
    Component localComponent = ctx).widgets.component(i >> 16, i & 0xFFFF);
    while ((localComponent.scrollHeightMax() == 0) && ((i = localComponent.parentId()) != -1)) {
      localComponent = ctx).widgets.component(i >> 16, i & 0xFFFF);
      j++; if (j > 20) {
        break;
      }
    }
    
    return localComponent.scrollHeightMax() != 0;
  }
  
  private org.powerbot.bot.rt6.client.Widget getInternalComponent() {
    if ((index < 0) || (widget.id() < 1)) {
      return null;
    }
    Object[] arrayOfObject;
    if (parent != null) {
      localObject = parent.getInternalComponent();
      arrayOfObject = localObject != null ? ((org.powerbot.bot.rt6.client.Widget)localObject).getComponents() : null;
    } else {
      arrayOfObject = widget.getInternalComponents();
    }
    Object localObject = (Client)((ClientContext)ctx).client();
    return (localObject != null) && (arrayOfObject != null) && (index < arrayOfObject.length) ? new org.powerbot.bot.rt6.client.Widget(reflector, arrayOfObject[index]) : null;
  }
  
  public String toString()
  {
    return getClass().getSimpleName() + "[" + index + (parent != null ? "/" + parent : "") + "]@" + widget;
  }
  
  public int hashCode()
  {
    return widget.id() * 31 + index;
  }
  
  public boolean equals(Object arg0)
  {
    if ((arg0 == null) || (!(arg0 instanceof Component))) {
      return false;
    }
    Component localComponent = (Component)arg0;
    return (widget.equals(widget)) && (index == index) && (((parent == null) && (parent == null)) || ((parent != null) && 
      (parent.equals(parent))));
  }
}
