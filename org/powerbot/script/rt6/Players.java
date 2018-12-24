package org.powerbot.script.rt6;

import java.util.ArrayList;
import java.util.List;
import org.powerbot.bot.rt6.client.Client;






public class Players
  extends PlayerQuery<Player>
{
  public Players(ClientContext arg0)
  {
    super(arg0);
  }
  




  public Player local()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    return localClient == null ? nil() : new Player((ClientContext)ctx, localClient.getPlayer());
  }
  





  protected List<Player> get()
  {
    ArrayList localArrayList = new ArrayList();
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return localArrayList;
    }
    
    int i = localClient.getPlayerCount();
    int[] arrayOfInt = localClient.getPlayerIndices();
    org.powerbot.bot.rt6.client.Player[] arrayOfPlayer = localClient.getPlayers();
    if ((arrayOfInt == null) || (arrayOfPlayer == null)) {
      return localArrayList;
    }
    for (int j = 0; j < Math.min(Math.min(arrayOfInt.length, arrayOfPlayer.length), i); j++) {
      int k = arrayOfInt[j];
      org.powerbot.bot.rt6.client.Player localPlayer = arrayOfPlayer[k];
      if (!localPlayer.isNull()) {
        localArrayList.add(new Player((ClientContext)ctx, localPlayer));
      }
    }
    return localArrayList;
  }
  
  public Player nil()
  {
    return new Player((ClientContext)ctx, new org.powerbot.bot.rt6.client.Player(ctx).client()).reflector, null));
  }
}
