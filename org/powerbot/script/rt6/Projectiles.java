package org.powerbot.script.rt6;

import java.util.ArrayList;
import java.util.List;
import org.powerbot.bot.rt6.NodeQueue;
import org.powerbot.bot.rt6.client.Client;
import org.powerbot.bot.rt6.client.ProjectileNode;






public class Projectiles
  extends IdQuery<Projectile>
{
  public Projectiles(ClientContext arg0)
  {
    super(arg0);
  }
  



  protected List<Projectile> get()
  {
    ArrayList localArrayList = new ArrayList();
    
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return localArrayList;
    }
    
    for (ProjectileNode localProjectileNode : NodeQueue.get(localClient.getProjectileDeque(), ProjectileNode.class)) {
      org.powerbot.bot.rt6.client.Projectile localProjectile = localProjectileNode.getProjectile();
      if (!localProjectile.isNull()) {
        localArrayList.add(new Projectile((ClientContext)ctx, localProjectile));
      }
    }
    
    return localArrayList;
  }
  



  public Projectile nil()
  {
    return new Projectile((ClientContext)ctx, new org.powerbot.bot.rt6.client.Projectile(ctx).client()).reflector, null));
  }
}
