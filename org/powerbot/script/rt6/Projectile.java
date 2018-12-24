package org.powerbot.script.rt6;

import java.lang.ref.WeakReference;
import org.powerbot.bot.rt6.client.GameLocation;
import org.powerbot.bot.rt6.client.RelativePosition;
import org.powerbot.script.Identifiable;
import org.powerbot.script.Locatable;
import org.powerbot.script.Tile;
import org.powerbot.script.Validatable;

public class Projectile extends ClientAccessor implements Locatable, Identifiable, Validatable
{
  private final org.powerbot.bot.rt6.client.Projectile projectile;
  
  public Projectile(ClientContext arg0, org.powerbot.bot.rt6.client.Projectile arg1)
  {
    super(arg0);
    projectile = arg1;
  }
  
  public int id()
  {
    return projectile.getId();
  }
  
  public boolean valid()
  {
    return (projectile.obj.get() != null) && (((IdQuery)ctx).projectiles.select()).contains(this));
  }
  
  public int hashCode()
  {
    Object localObject;
    return (localObject = projectile.obj.get()) != null ? System.identityHashCode(localObject) : 0;
  }
  
  public boolean equals(Object arg0)
  {
    return ((arg0 instanceof Projectile)) && (projectile.equals(projectile));
  }
  
  public Tile tile()
  {
    RelativeLocation localRelativeLocation = relative();
    if ((projectile.obj.get() != null) && (localRelativeLocation != RelativeLocation.NIL)) {
      return ctx).game.mapOffset().derive((int)localRelativeLocation.x() >> 9, (int)localRelativeLocation.z() >> 9, localRelativeLocation.floor());
    }
    return Tile.NIL;
  }
  
  public RelativeLocation relative() {
    GameLocation localGameLocation = projectile.getLocation();
    Object localObject = localGameLocation != null ? localGameLocation.getRelativePosition() : null;
    if (localObject != null) {
      return new RelativeLocation(localObject.getX(), localObject.getZ(), ctx).game.floor());
    }
    return RelativeLocation.NIL;
  }
}
