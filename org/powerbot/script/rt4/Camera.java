package org.powerbot.script.rt4;

import org.powerbot.bot.rt4.client.Client;
import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Input;
import org.powerbot.script.Locatable;
import org.powerbot.script.Random;
import org.powerbot.script.Tile;

public class Camera extends ClientAccessor
{
  public final float[] offset;
  public final float[] center;
  
  public Camera(ClientContext arg0)
  {
    super(arg0);
    offset = new float[3];
    center = new float[3];
  }
  




  public int x()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    return localClient.getCameraX();
  }
  




  public int y()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    return localClient.getCameraY();
  }
  




  public int z()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    return localClient.getCameraZ();
  }
  




  public int yaw()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    return (int)(localClient.getCameraYaw() / 5.68D);
  }
  




  public final int pitch()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    return (int)((localClient.getCameraPitch() - 128) / 2.56D);
  }
  





  public boolean pitch(boolean arg0)
  {
    return pitch(arg0 ? 100 : 0);
  }
  





  public boolean pitch(int arg0)
  {
    if (arg0 == pitch()) {
      return true;
    }
    int i = pitch() < arg0 ? 1 : 0;
    ctx).input.send(i != 0 ? "{VK_UP down}" : "{VK_DOWN down}");
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
    ctx).input.send(i != 0 ? "{VK_UP up}" : "{VK_DOWN up}");
    return Math.abs(arg0 - pitch()) <= 8;
  }
  





  public boolean angle(char arg0)
  {
    switch (arg0) {
    case 'n': 
      return angle(0);
    case 'w': 
      return angle(90);
    case 's': 
      return angle(180);
    case 'e': 
      return angle(270);
    }
    throw new RuntimeException("invalid direction " + arg0 + ", expecting n,w,s,e");
  }
  





  public boolean angle(int arg0)
  {
    final int i = arg0 % 360;
    int j = angleTo(i);
    if (Math.abs(j) <= 5) {
      return true;
    }
    int k = j > 5 ? 1 : 0;
    
    ctx).input.send(k != 0 ? "{VK_LEFT down}" : "{VK_RIGHT down}");
    float f = Math.signum(angleTo(i));
    for (;;) {
      final int m = angleTo(i);
      if (!Condition.wait(new Condition.Check()
      {
        public boolean poll() {
          return angleTo(i) != m;
        }
      }, 10, 10)) {
        break;
      }
      




      int n = angleTo(i);
      if ((Math.abs(n) <= 15) || (Math.signum(n) != f)) {
        break;
      }
    }
    ctx).input.send(k != 0 ? "{VK_LEFT up}" : "{VK_RIGHT up}");
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
    turnTo(arg0, 0);
  }
  





  public void turnTo(Locatable arg0, int arg1)
  {
    int i = getAngleToLocatable(arg0);
    if (arg1 == 0) {
      angle(i);
    } else {
      angle(Random.nextInt(i - arg1, i + arg1 + 1));
    }
  }
  
  private int getAngleToLocatable(Locatable arg0) {
    Player localPlayer = ctx).players.local();
    Object localObject = localPlayer != null ? localPlayer.tile() : null;
    Tile localTile = arg0.tile();
    return (localObject != null) && (localTile != null) ? (int)Math.toDegrees(Math.atan2(localTile.y() - localObject.y(), localTile.x() - localObject.x())) - 90 : 0;
  }
}
