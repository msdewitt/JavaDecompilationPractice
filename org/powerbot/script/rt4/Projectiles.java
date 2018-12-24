package org.powerbot.script.rt4;

import java.util.ArrayList;
import java.util.List;
import org.powerbot.bot.rt4.NodeQueue;
import org.powerbot.bot.rt4.client.Client;






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
    
    for (org.powerbot.bot.rt4.client.Projectile localProjectile : NodeQueue.get(localClient.getProjectiles(), org.powerbot.bot.rt4.client.Projectile.class)) {
      Projectile localProjectile1 = new Projectile((ClientContext)ctx, localProjectile);
      localArrayList.add(localProjectile1);
    }
    
    return localArrayList;
  }
  



  public Projectile nil()
  {
    return new Projectile((ClientContext)ctx, new org.powerbot.bot.rt4.client.Projectile(ctx).client()).reflector, null));
  }
}
