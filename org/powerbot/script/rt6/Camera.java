package org.powerbot.script.rt6;

import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Input;
import org.powerbot.script.Locatable;
import org.powerbot.script.Random;
import org.powerbot.script.Tile;

public class Camera extends ClientAccessor
{
  public Camera(ClientContext arg0)
  {
    super(arg0);
  }
  
  public float rotation()
  {
    Game.Matrix4f localMatrix4f = new Game.Matrix4f();
    Game.Matrix4f.inversion(ctx).game.getViewMatrix(), localMatrix4f);
    float f; if (m10 > 0.998D) {
      f = (float)Math.atan2(m02, m22);
    } else if (m10 < -0.998D) {
      f = (float)Math.atan2(m02, m22);
    } else {
      f = (float)Math.atan2(-m20, m00);
    }
    if (f > 0.0F) {
      f -= 6.2831855F;
    }
    return -f;
  }
  




  public int yaw()
  {
    float f = rotation();
    f = (float)(f * 57.29577951308232D);
    return Math.round(f) % 360;
  }
  





  public int pitch()
  {
    Game.Matrix4f localMatrix4f = new Game.Matrix4f();
    Game.Matrix4f.inversion(ctx).game.getViewMatrix(), localMatrix4f);
    float f; if (m10 > 0.998D) {
      f = 1.5707964F;
    } else if (m10 < -0.998D) {
      f = -1.5707964F;
    } else {
      f = (float)Math.atan2(-m12, m11);
    }
    if (f > 0.0F) {
      f -= 6.2831855F;
    }
    f *= -1.0F;
    return (int)Math.round(f * 100.0D / 1.5707963267948966D);
  }
  





  public boolean pitch(boolean arg0)
  {
    return pitch(arg0 ? 100 : 0);
  }
  






  public boolean pitch(boolean arg0, boolean arg1)
  {
    return pitch(arg0 ? 100 : 0, arg1);
  }
  





  public boolean pitch(int arg0)
  {
    return pitch(arg0, false);
  }
  






  public boolean pitch(int arg0, boolean arg1)
  {
    boolean bool = arg1;
    if ((arg1) && 
      (ctx).game.chatAlwaysOn())) {
      bool = false;
    }
    
    if (arg0 == pitch()) {
      return true;
    }
    int i = pitch() < arg0 ? 1 : 0;
    String str1;
    if (i != 0) {
      str1 = bool ? "{VK_W down}" : "{VK_UP down}";
    } else {
      str1 = bool ? "{VK_S down}" : "{VK_DOWN down}";
    }
    ctx).input.send(str1);
    for (;;) {
      final int j = pitch();
      if (!Condition.wait(new Condition.Check()
      {
        public boolean poll() {
          return pitch() != j;
        }
      }, 10, 10)) {
        break;
      }
      




      int k = pitch();
      if ((i != 0) && (k >= arg0))
        break;
      if ((i == 0) && (k <= arg0)) {
        break;
      }
    }
    String str2;
    if (i != 0) {
      str2 = bool ? "{VK_W up}" : "{VK_UP up}";
    } else {
      str2 = bool ? "{VK_S up}" : "{VK_DOWN up}";
    }
    ctx).input.send(str2);
    return Math.abs(arg0 - pitch()) <= 8;
  }
  





  public boolean angle(char arg0)
  {
    return angle(arg0, false);
  }
  





  public boolean angle(char arg0, boolean arg1)
  {
    switch (arg0) {
    case 'n': 
      return angle(0, arg1);
    case 'w': 
      return angle(90, arg1);
    case 's': 
      return angle(180, arg1);
    case 'e': 
      return angle(270, arg1);
    }
    throw new RuntimeException("invalid direction " + arg0 + ", expecting n,w,s,e");
  }
  





  public boolean angle(int arg0)
  {
    return angle(arg0, false);
  }
  






  public boolean angle(int arg0, boolean arg1)
  {
    boolean bool = arg1;
    if ((arg1) && 
      (ctx).game.chatAlwaysOn())) {
      bool = false;
    }
    
    final int i = arg0 % 360;
    int j = angleTo(i);
    if (Math.abs(j) <= 8) {
      return true;
    }
    int k = j > 8 ? 1 : 0;
    
    String str;
    if (k != 0) {
      str = bool ? "{VK_A down}" : "{VK_LEFT down}";
    } else {
      str = bool ? "{VK_D down}" : "{VK_RIGHT down}";
    }
    ctx).input.send(str);
    int m = (int)Math.signum(angleTo(i));
    for (;;) {
      final int n = angleTo(i);
      if (!Condition.wait(new Condition.Check()
      {
        public boolean poll() {
          return angleTo(i) != n;
        }
      }, 10, 10)) {
        break;
      }
      




      int i1 = angleTo(i);
      if ((Math.abs(i1) <= 15) || (Math.signum(i1) != m)) {
        break;
      }
    }
    if (k != 0) {
      str = bool ? "{VK_A up}" : "{VK_LEFT up}";
    } else {
      str = bool ? "{VK_D up}" : "{VK_RIGHT up}";
    }
    ctx).input.send(str);
    return Math.abs(angleTo(i)) <= 15;
  }
  





  public int angleTo(int arg0)
  {
    int i = yaw();
    if (i < arg0) {
      i += 360;
    }
    int j = i - arg0;
    if (j > 180) {
      j -= 360;
    }
    return j;
  }
  




  public void turnTo(Locatable arg0)
  {
    turnTo(arg0, 0, false);
  }
  





  public void turnTo(Locatable arg0, int arg1)
  {
    turnTo(arg0, arg1, false);
  }
  





  public void turnTo(Locatable arg0, boolean arg1)
  {
    turnTo(arg0, 0, arg1);
  }
  






  public void turnTo(Locatable arg0, int arg1, boolean arg2)
  {
    boolean bool = arg2;
    if ((arg2) && 
      (ctx).game.chatAlwaysOn())) {
      bool = false;
    }
    
    int i = getAngleToLocatable(arg0);
    if (arg1 == 0) {
      angle(i, bool);
    } else {
      angle(Random.nextInt(i - arg1, i + arg1 + 1), bool);
    }
  }
  
  private int getAngleToLocatable(Locatable arg0) {
    Player localPlayer = ctx).players.local();
    Object localObject = localPlayer != null ? localPlayer.tile() : null;
    Tile localTile = arg0.tile();
    return (localObject != null) && (localTile != null) ? (int)Math.toDegrees(Math.atan2(localTile.y() - localObject.y(), localTile.x() - localObject.x())) - 90 : 0;
  }
}
