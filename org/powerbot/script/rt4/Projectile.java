package org.powerbot.script.rt4;

import java.lang.ref.WeakReference;
import org.powerbot.bot.rt4.client.Client;
import org.powerbot.script.Identifiable;
import org.powerbot.script.Locatable;
import org.powerbot.script.Tile;
import org.powerbot.script.Validatable;

public class Projectile extends ClientAccessor implements Locatable, Identifiable, Validatable
{
  private final org.powerbot.bot.rt4.client.Projectile projectile;
  
  public Projectile(ClientContext arg0, org.powerbot.bot.rt4.client.Projectile arg1)
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
    return Tile.NIL;
  }
  
  public boolean isStarted() {
    return projectile.isStarted();
  }
  
  public int getCycleStart() {
    return projectile.getCycleStart();
  }
  
  public int getEndHeight() {
    return projectile.getEndHeight();
  }
  
  public int getStartDistance() {
    return projectile.getStartDistance();
  }
  
  public int getOrientation() {
    return projectile.getOrientation();
  }
  
  public int getSlope() {
    return projectile.getSlope();
  }
  
  public int getId() {
    return projectile.getId();
  }
  
  public int getX() {
    int i = (int)projectile.getX();
    i = (i >> 7) + ctx).game.mapOffset().x();
    return i;
  }
  
  public int getY() {
    int i = (int)projectile.getY();
    i = (i >> 7) + ctx).game.mapOffset().y();
    return i;
  }
  
  public int getStartX() {
    int i = projectile.getStartX();
    i = (i >> 7) + ctx).game.mapOffset().x();
    return i;
  }
  
  public int getStartY() {
    int i = projectile.getStartY();
    i = (i >> 7) + ctx).game.mapOffset().y();
    return i;
  }
  
  public int getStartZ() {
    return projectile.getPlane();
  }
  
  public Actor getTarget() {
    int i = projectile.getTargetIndex();
    
    Npc localNpc = ctx).npcs.nil();
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null)
      return localNpc;
    Object localObject;
    if (i > 0) {
      localObject = localClient.getNpcs();
      return i < localObject.length ? new Npc((ClientContext)ctx, localObject[(i - 1)]) : localNpc; }
    if (i < 0) {
      i = -i;
      if (i == localClient.getPlayerIndex()) {
        return new Player((ClientContext)ctx, localClient.getPlayer());
      }
      localObject = localClient.getPlayers();
      return i < localObject.length ? new Player((ClientContext)ctx, localObject[(i - 1)]) : localNpc;
    }
    return localNpc;
  }
}
