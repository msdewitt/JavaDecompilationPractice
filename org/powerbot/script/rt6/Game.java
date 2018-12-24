package org.powerbot.script.rt6;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;
import org.powerbot.bot.Reflector;
import org.powerbot.bot.rt6.client.Client;
import org.powerbot.bot.rt6.client.Floor;
import org.powerbot.bot.rt6.client.MapOffset;
import org.powerbot.bot.rt6.client.TransformMatrix;
import org.powerbot.bot.rt6.client.World;
import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Locatable;
import org.powerbot.script.Tile;

public class Game extends ClientAccessor
{
  public static final int[] SIN_TABLE = new int['䀀'];
  public static final int[] COS_TABLE = new int['䀀'];
  
  static
  {
    for (int i = 0; i < 16384; i++) {
      SIN_TABLE[i] = ((int)(16384.0D * Math.sin(i * 3.834951969714103E-4D)));
      COS_TABLE[i] = ((int)(16384.0D * Math.cos(i * 3.834951969714103E-4D)));
    }
  }
  
  private Component viewport_component = null;
  
  public Game(ClientContext arg0) {
    super(arg0);
  }
  


  public boolean chatAlwaysOn()
  {
    return (ctx).varpbits.varpbit(1775) >> 3 & 0x1) == 1;
  }
  





  public boolean logout(final boolean arg0)
  {
    if ((!ctx).hud.open(Hud.Menu.OPTIONS)) && (!ctx).input.send("{ESCAPE}"))) {
      return false;
    }
    final Widget localWidget = ctx).widgets.widget(1433);
    if (Condition.wait(new Condition.Check()
    {
      public boolean poll() {
        return localWidget.component(67).visible();
      }
    }, 100, 10))
    {




      if (!localWidget.component(arg0 ? 64 : 67).interact("Select")) {
        return false;
      }
    }
    Condition.wait(new Condition.Check()
    {
      public boolean poll() {
        return clientState() == (arg0 ? 7 : 3);
      }
    });
  }
  









  public int clientState()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return -1;
    }
    int i = localClient.getClientState();
    if (i == reflector.getConstant("V_CLIENT_GAMESTATE_LOGIN_SCREEN"))
      return 3;
    if (i == reflector.getConstant("V_CLIENT_GAMESTATE_LOBBY_SCREEN"))
      return 7;
    if (i == reflector.getConstant("V_CLIENT_GAMESTATE_LOGGING_IN"))
      return 9;
    if (i == reflector.getConstant("V_CLIENT_GAMESTATE_ENVIRONMENT_PLAYABLE"))
      return 11;
    if (i == reflector.getConstant("V_CLIENT_GAMESTATE_ENVIRONMENT_LOADING")) {
      return 12;
    }
    return -1;
  }
  




  public boolean loggedIn()
  {
    int i = clientState();
    return (i == 11) || (i == 12);
  }
  




  public Crosshair crosshair()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    int i = localClient != null ? localClient.getCrossHairType() : -1;
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
    MapOffset localMapOffset = localClient.getWorld().getMapOffset();
    if (localMapOffset.isNull()) {
      return Tile.NIL;
    }
    return new Tile(localMapOffset.getX(), localMapOffset.getY(), localClient.getFloor());
  }
  




  public int floor()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return -1;
    }
    return localClient.getFloor();
  }
  





  public boolean inViewport(Point arg0)
  {
    return inViewport(x, y);
  }
  






  public boolean inViewport(int arg0, int arg1)
  {
    Viewport localViewport = getViewport();
    if ((arg0 > 0) && (arg1 > 0)) {
      if (loggedIn()) {
        Rectangle[] arrayOfRectangle1 = ctx).hud.bounds();
        for (Rectangle localRectangle : arrayOfRectangle1) {
          if (localRectangle.contains(arg0, arg1)) {
            return false;
          }
        }
      }
      return (arg0 >= x) && (arg0 <= mx) && (arg1 >= y) && (arg1 <= my);
    }
    return false;
  }
  







  public int tileHeight(int arg0, int arg1, int arg2)
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return 0;
    }
    if (arg2 == -1) {
      arg2 = localClient.getFloor();
    }
    int i = arg0 >> 9;int j = arg1 >> 9;
    byte[][][] arrayOfByte = localClient.getWorld().getFloorSettings().getBytes();
    if ((i < 0) || (i > 103) || (j < 0) || (j > 103)) {
      return 0;
    }
    if ((arg2 < 3) && ((arrayOfByte[1][i][j] & 0x2) != 0)) {
      arg2++;
    }
    Floor[] arrayOfFloor = localClient.getWorld().getLandscape().getFloors();
    if ((arg2 < 0) || (arg2 >= arrayOfFloor.length)) {
      return 0;
    }
    try {
      int[][] arrayOfInt = arrayOfFloor[arg2].getHeights();
      int k = arg0 & 0x1FF;
      int m = arg1 & 0x1FF;
      int n = arrayOfInt[i][j] * (512 - k) + arrayOfInt[(i + 1)][j] * k >> 9;
      int i1 = arrayOfInt[i][(1 + j)] * (512 - k) + arrayOfInt[(i + 1)][(j + 1)] * k >> 9;
      return n * (512 - m) + i1 * m >> 9;
    }
    catch (Exception localException1) {}
    return 0;
  }
  








  public Point groundToScreen(int arg0, int arg1, int arg2, int arg3)
  {
    if ((arg0 < 512) || (arg1 < 512) || (arg0 > 52224) || (arg1 > 52224)) {
      return new Point(-1, -1);
    }
    int i = tileHeight(arg0, arg1, arg2) + arg3;
    return worldToScreen(arg0, i, arg1);
  }
  







  public Point worldToScreen(int arg0, int arg1, int arg2)
  {
    Viewport localViewport = getViewport();
    float[] arrayOfFloat = new float[4];
    try {
      getViewProjMatrix().multiply(arg0, arg1, arg2, arrayOfFloat);
    } catch (Exception localException) {
      return new Point(-1, -1);
    }
    if (arrayOfFloat[2] >= -arrayOfFloat[3]) {
      localException = 1.0F / arrayOfFloat[3];
      arrayOfFloat[0] = (cx + arrayOfFloat[0] * localException * hw);
      arrayOfFloat[1] = (cy + arrayOfFloat[1] * localException * hh);
      if (localViewport.contains(arrayOfFloat[0], arrayOfFloat[1])) {
        return new Point((int)arrayOfFloat[0], (int)arrayOfFloat[1]);
      }
    }
    return new Point(-1, -1);
  }
  





  public Point tileToMap(Locatable arg0)
  {
    Point localPoint1 = new Point(-1, -1);
    Client localClient = (Client)((ClientContext)ctx).client();
    Tile localTile1 = ctx).game.mapOffset();
    Tile localTile2 = arg0.tile().derive(-localTile1.x(), -localTile1.y());
    int i = localTile2.x();
    int j = localTile2.y();
    if ((localClient == null) || (i < 1) || (i > 103) || (j < 1) || (j > 103)) {
      return localPoint1;
    }
    
    RelativeLocation localRelativeLocation = ctx).players.local().relative();
    float f1 = i * 4 - localRelativeLocation.x() / 128.0F + 2.0F;
    float f2 = j * 4 - localRelativeLocation.z() / 128.0F + 2.0F;
    int k = (int)Math.round(Math.sqrt(Math.pow(f1, 2.0D) + Math.pow(f2, 2.0D)));
    
    Component localComponent1 = mapComponent();
    int m = localComponent1.scrollWidth();
    int n = localComponent1.scrollHeight();
    int i1 = Math.max(m / 2, n / 2) + 10;
    if (k >= i1) {
      return localPoint1;
    }
    
    int i2 = localClient.getMinimapSettings() == reflector.getConstant("V_MINIMAP_SCALE_ON_VALUE") ? 1 : 0;
    double d = ctx).camera.rotation() * 16384.0D / 6.283185307179586D;
    int i3 = 0x3FFF & (int)d;
    if (i2 == 0) {
      i3 = 0x3FFF & localClient.getMinimapOffset() + (int)d;
    }
    int i4 = SIN_TABLE[i3];int i5 = COS_TABLE[i3];
    if (i2 == 0) {
      i6 = 256 + localClient.getMinimapScale();
      i4 = 256 * i4 / i6;
      i5 = 256 * i5 / i6;
    }
    
    int i6 = (int)(i5 * f1 + i4 * f2) >> 14;
    int i7 = (int)(i5 * f2 - i4 * f1) >> 14;
    i6 += m / 2;
    i7 *= -1;
    i7 += n / 2;
    
    if ((i6 > 4) && (i6 < m - 4) && (i7 > 4) && (i7 < n - 4))
    {
      Point localPoint2 = localComponent1.screenPoint();
      int i8 = i6 + (int)localPoint2.getX();
      int i9 = i7 + (int)localPoint2.getY();
      Point localPoint3 = new Point(i8, i9);
      Object localObject; if (ctx).hud.legacy()) {
        localObject = new Point(x + localComponent1.width() / 2, y + localComponent1.height() / 2);
        if (Math.pow(x - x, 2.0D) + Math.pow(y - y, 2.0D) >= Math.pow(68.0D, 2.0D)) {
          return localPoint1;
        }
      } else {
        localObject = new Rectangle(x - 6, y - 6, 12, 12);
        for (Component localComponent2 : mapBlockingComponents()) {
          if (localComponent2.viewportRect().intersects((Rectangle)localObject)) {
            return localPoint1;
          }
        }
      }
      return localPoint3;
    }
    
    return localPoint1;
  }
  
  Matrix4f getViewMatrix() {
    TransformMatrix localTransformMatrix = ((Client)((ClientContext)ctx).client()).getViewMatrix();
    Matrix4f localMatrix4f = new Matrix4f();
    m00 = localTransformMatrix.m00();
    m01 = localTransformMatrix.m01();
    m02 = localTransformMatrix.m02();
    m03 = localTransformMatrix.m03();
    m10 = localTransformMatrix.m10();
    m11 = localTransformMatrix.m11();
    m12 = localTransformMatrix.m12();
    m13 = localTransformMatrix.m13();
    m20 = localTransformMatrix.m20();
    m21 = localTransformMatrix.m21();
    m22 = localTransformMatrix.m22();
    m23 = localTransformMatrix.m23();
    
    m30 = 0.0F;
    m31 = 0.0F;
    m32 = 0.0F;
    m33 = 1.0F;
    return localMatrix4f;
  }
  
  Matrix4f getProjMatrix() {
    return new Matrix4f(((Client)((ClientContext)ctx).client()).getProjMatrix().getMatrix(), false);
  }
  
  Matrix4f getViewProjMatrix() {
    Matrix4f localMatrix4f = new Matrix4f();
    Matrix4f.multiply(getProjMatrix(), getViewMatrix(), localMatrix4f);
    return localMatrix4f;
  }
  
  public Viewport getViewport() {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return new Viewport(0.0F, 0.0F, 0.0F, 0.0F);
    }
    
    if ((viewport_component != null) && (
      (viewport_component.contentType() == 1337) || (viewport_component.contentType() == 1407))) {
      Rectangle localRectangle1 = viewport_component.viewportRect();
      if (width + height > 0) {
        return new Viewport(x, y, width, height);
      }
    }
    
    for (int i = 0; i < localClient.getWidgets().length; i++) {
      for (Component localComponent : ctx).widgets.widget(i)) {
        if ((localComponent.contentType() == 1337) || (localComponent.contentType() == 1407))
          if (localComponent.valid())
          {

            viewport_component = localComponent;
            Rectangle localRectangle2 = localComponent.viewportRect();
            return new Viewport(x, y, width, height);
          }
      }
    }
    return new Viewport(0.0F, 0.0F, 0.0F, 0.0F);
  }
  
  public Component mapComponent() {
    Widget localWidget = ctx).widgets.widget(1465);
    for (Component localComponent : localWidget.components()) {
      if (localComponent.contentType() == 1338) {
        return localComponent;
      }
    }
    return ctx).widgets.component(1465, 0);
  }
  
  private List<Component> mapBlockingComponents() {
    ArrayList localArrayList = new ArrayList();
    Widget localWidget = ctx).widgets.widget(1465);
    int[][] arrayOfInt1 = { { 36, 36 }, { 44, 44 }, { 30, 30 } };
    



    for (Component localComponent : localWidget.components()) {
      if (localComponent.visible())
      {


        int k = localComponent.width();int m = localComponent.height();
        for ([I local[I : arrayOfInt1) {
          if ((local[I[0] == k) && (local[I[1] == m)) {
            localArrayList.add(localComponent);
            break;
          }
        }
      }
    }
    localArrayList.add(ctx).widgets.widget(1919).component(1));
    
    return localArrayList;
  }
  

  public static enum Crosshair
    implements org.powerbot.script.Crosshair
  {
    NONE,  DEFAULT,  ACTION;
    
    private Crosshair() {}
  }
  
  static class Matrix4f {
    public float m00;
    public float m01;
    public float m02;
    public float m03;
    public float m10;
    public float m11;
    public float m12;
    public float m13;
    
    public Matrix4f(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, float arg11, float arg12, float arg13, float arg14, float arg15) { m00 = arg0;
      m01 = arg1;
      m02 = arg2;
      m03 = arg3;
      m10 = arg4;
      m11 = arg5;
      m12 = arg6;
      m13 = arg7;
      m20 = arg8;
      m21 = arg9;
      m22 = arg10;
      m23 = arg11;
      m30 = arg12;
      m31 = arg13;
      m32 = arg14;
      m33 = arg15; }
    
    public float m20;
    
    public Matrix4f(float[] arg0, boolean arg1) { if (arg0.length != 16) {
        throw new IllegalArgumentException("Array must be of size 16.");
      }
      
      if (arg1) {
        m00 = arg0[0];
        m01 = arg0[1];
        m02 = arg0[2];
        m03 = arg0[3];
        m10 = arg0[4];
        m11 = arg0[5];
        m12 = arg0[6];
        m13 = arg0[7];
        m20 = arg0[8];
        m21 = arg0[9];
        m22 = arg0[10];
        m23 = arg0[11];
        m30 = arg0[12];
        m31 = arg0[13];
        m32 = arg0[14];
        m33 = arg0[15];
      } else {
        m00 = arg0[0];
        m01 = arg0[4];
        m02 = arg0[8];
        m03 = arg0[12];
        m10 = arg0[1];
        m11 = arg0[5];
        m12 = arg0[9];
        m13 = arg0[13];
        m20 = arg0[2];
        m21 = arg0[6];
        m22 = arg0[10];
        m23 = arg0[14];
        m30 = arg0[3];
        m31 = arg0[7];
        m32 = arg0[11];
        m33 = arg0[15]; } }
    
    public float m21;
    public float m22;
    
    public Matrix4f(float arg0, float arg1, float arg2) { m00 = 1.0F;
      m01 = 0.0F;
      m02 = 0.0F;
      m03 = (-arg0);
      
      m10 = 0.0F;
      m11 = 1.0F;
      m12 = 0.0F;
      m13 = (-arg1);
      
      m20 = 0.0F;
      m21 = 0.0F;
      m22 = 1.0F;
      m23 = (-arg2);
      
      m30 = 0.0F;
      m31 = 0.0F;
      m32 = 0.0F;
      m33 = 1.0F; }
    
    public float m23;
    
    public Matrix4f() { m01 = (this.m02 = this.m03 = 0.0F);
      m10 = (this.m12 = this.m13 = 0.0F);
      m20 = (this.m21 = this.m23 = 0.0F);
      m30 = (this.m31 = this.m32 = 0.0F);
      m00 = (this.m11 = this.m22 = this.m33 = 1.0F); }
    
    public float m30;
    
    public Matrix4f(float arg0, float arg1, float arg2, float arg3) { this();
      rotate(this, arg0, arg1, arg2, arg3, this); }
    
    public float m31;
    
    public static void multiply(Matrix4f arg0, Matrix4f arg1, Matrix4f arg2) { float f1 = m00 * m00 + m01 * m10 + m02 * m20 + m03 * m30;
      float f2 = m00 * m01 + m01 * m11 + m02 * m21 + m03 * m31;
      float f3 = m00 * m02 + m01 * m12 + m02 * m22 + m03 * m32;
      float f4 = m00 * m03 + m01 * m13 + m02 * m23 + m03 * m33;
      
      float f5 = m10 * m00 + m11 * m10 + m12 * m20 + m13 * m30;
      float f6 = m10 * m01 + m11 * m11 + m12 * m21 + m13 * m31;
      float f7 = m10 * m02 + m11 * m12 + m12 * m22 + m13 * m32;
      float f8 = m10 * m03 + m11 * m13 + m12 * m23 + m13 * m33;
      
      float f9 = m20 * m00 + m21 * m10 + m22 * m20 + m23 * m30;
      float f10 = m20 * m01 + m21 * m11 + m22 * m21 + m23 * m31;
      float f11 = m20 * m02 + m21 * m12 + m22 * m22 + m23 * m32;
      float f12 = m20 * m03 + m21 * m13 + m22 * m23 + m23 * m33;
      
      float f13 = m30 * m00 + m31 * m10 + m32 * m20 + m33 * m30;
      float f14 = m30 * m01 + m31 * m11 + m32 * m21 + m33 * m31;
      float f15 = m30 * m02 + m31 * m12 + m32 * m22 + m33 * m32;
      float f16 = m30 * m03 + m31 * m13 + m32 * m23 + m33 * m33;
      
      m00 = f1;
      m01 = f2;
      m02 = f3;
      m03 = f4;
      
      m10 = f5;
      m11 = f6;
      m12 = f7;
      m13 = f8;
      
      m20 = f9;
      m21 = f10;
      m22 = f11;
      m23 = f12;
      
      m30 = f13;
      m31 = f14;
      m32 = f15;
      m33 = f16; }
    
    public float m32;
    public float m33;
    public static void inversion(Matrix4f arg0, Matrix4f arg1) { float f1 = m00 * m11 - m01 * m10;
      float f2 = m00 * m12 - m02 * m10;
      float f3 = m00 * m13 - m03 * m10;
      float f4 = m01 * m12 - m02 * m11;
      float f5 = m01 * m13 - m03 * m11;
      float f6 = m02 * m13 - m03 * m12;
      float f7 = m20 * m31 - m21 * m30;
      float f8 = m20 * m32 - m22 * m30;
      float f9 = m20 * m33 - m23 * m30;
      float f10 = m21 * m32 - m22 * m31;
      float f11 = m21 * m33 - m23 * m31;
      float f12 = m22 * m33 - m23 * m32;
      
      float f13 = f1 * f12 - f2 * f11 + f3 * f10 + f4 * f9 - f5 * f8 + f6 * f7;
      if (Math.abs(f13) <= 0.0F) {
        throw new ArithmeticException("This matrix cannot be inverted");
      }
      
      float f14 = 1.0F / f13;
      float f15 = (m11 * f12 - m12 * f11 + m13 * f10) * f14;
      float f16 = (-m10 * f12 + m12 * f9 - m13 * f8) * f14;
      float f17 = (m10 * f11 - m11 * f9 + m13 * f7) * f14;
      float f18 = (-m10 * f10 + m11 * f8 - m12 * f7) * f14;
      
      float f19 = (-m01 * f12 + m02 * f11 - m03 * f10) * f14;
      float f20 = (m00 * f12 - m02 * f9 + m03 * f8) * f14;
      float f21 = (-m00 * f11 + m01 * f9 - m03 * f7) * f14;
      float f22 = (m00 * f10 - m01 * f8 + m02 * f7) * f14;
      
      float f23 = (m31 * f6 - m32 * f5 + m33 * f4) * f14;
      float f24 = (-m30 * f6 + m32 * f3 - m33 * f2) * f14;
      float f25 = (m30 * f5 - m31 * f3 + m33 * f1) * f14;
      float f26 = (-m30 * f4 + m31 * f2 - m32 * f1) * f14;
      
      float f27 = (-m21 * f6 + m22 * f5 - m23 * f4) * f14;
      float f28 = (m20 * f6 - m22 * f3 + m23 * f2) * f14;
      float f29 = (-m20 * f5 + m21 * f3 - m23 * f1) * f14;
      float f30 = (m20 * f4 - m21 * f2 + m22 * f1) * f14;
      
      m00 = f15;
      m01 = f19;
      m02 = f23;
      m03 = f27;
      m10 = f16;
      m11 = f20;
      m12 = f24;
      m13 = f28;
      m20 = f17;
      m21 = f21;
      m22 = f25;
      m23 = f29;
      m30 = f18;
      m31 = f22;
      m32 = f26;
      m33 = f30;
    }
    
    public static void rotate(Matrix4f arg0, float arg1, float arg2, float arg3, float arg4, Matrix4f arg5) {
      float f1 = (float)Math.cos(arg1);float f2 = (float)Math.sin(arg1);
      
      float f3 = 1.0F - f1;
      float f4 = arg2 * arg3 * f3;
      float f5 = arg2 * arg4 * f3;
      float f6 = arg3 * arg4 * f3;
      float f7 = arg4 * f2;float f8 = arg3 * f2;float f9 = arg2 * f2;
      
      float f10 = arg2 * arg2 * f3 + f1;
      float f11 = f4 + f7;
      float f12 = f5 - f8;
      float f13 = f4 - f7;
      float f14 = arg3 * arg3 * f3 + f1;
      float f15 = f6 + f9;
      float f16 = f5 + f8;
      float f17 = f6 - f9;
      float f18 = arg4 * arg4 * f3 + f1;
      
      float f19 = m00;float f20 = m10;float f21 = m01;
      float f22 = m11;float f23 = m02;float f24 = m12;
      float f25 = m03;float f26 = m13;
      
      m00 = (f19 * f10 + f20 * f13 + m20 * f16);
      m10 = (f19 * f11 + f20 * f14 + m20 * f17);
      m20 = (f19 * f12 + f20 * f15 + m20 * f18);
      
      m01 = (f21 * f10 + f22 * f13 + m21 * f16);
      m11 = (f21 * f11 + f22 * f14 + m21 * f17);
      m21 = (f21 * f12 + f22 * f15 + m21 * f18);
      
      m02 = (f23 * f10 + f24 * f13 + m22 * f16);
      m12 = (f23 * f11 + f24 * f14 + m22 * f17);
      m22 = (f23 * f12 + f24 * f15 + m22 * f18);
      
      m03 = (f25 * f10 + f26 * f13 + m23 * f16);
      m13 = (f25 * f11 + f26 * f14 + m23 * f17);
      m23 = (f25 * f12 + f26 * f15 + m23 * f18);
    }
    
    public void multiply(float arg0, float arg1, float arg2, float[] arg3) {
      arg3[0] = (m00 * arg0 + m01 * arg1 + m02 * arg2 + m03);
      arg3[1] = (m10 * arg0 + m11 * arg1 + m12 * arg2 + m13);
      arg3[2] = (m20 * arg0 + m21 * arg1 + m22 * arg2 + m23);
      if (arg3.length > 3) {
        arg3[3] = (m30 * arg0 + m31 * arg1 + m32 * arg2 + m33);
      }
    }
    
    public float[] getTranslation() {
      return new float[] { m03, m13, m23 };
    }
  }
  
  public static class Viewport {
    public final float x;
    public final float y;
    public final float width;
    public final float height;
    public final float hw;
    public final float hh;
    public final float cx;
    public final float cy;
    public final float mx;
    public final float my;
    
    public Viewport(float arg0, float arg1, float arg2, float arg3) {
      x = arg0;
      y = arg1;
      width = arg2;
      height = arg3;
      hw = (arg2 / 2.0F);
      hh = (arg3 / 2.0F);
      cx = (hw + x);
      cy = (hh + y);
      mx = (x + width);
      my = (y + height);
    }
    
    public boolean contains(float arg0, float arg1) {
      return (arg0 > x) && (arg0 < mx) && (arg1 > y) && (arg1 < my);
    }
    
    public String toString()
    {
      return String.format("Viewport[x=%f,y=%f,w=%f,h=%f]", new Object[] { Float.valueOf(x), Float.valueOf(y), Float.valueOf(width), Float.valueOf(height) });
    }
  }
}
