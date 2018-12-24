package org.powerbot.script.rt4;

import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.powerbot.bot.rt4.client.Client;

public class Players
  extends PlayerQuery<Player>
{
  public Players(ClientContext arg0)
  {
    super(arg0);
  }
  
  public List<Player> get()
  {
    CopyOnWriteArrayList localCopyOnWriteArrayList = new CopyOnWriteArrayList();
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return localCopyOnWriteArrayList;
    }
    int[] arrayOfInt = localClient.getPlayerIndices();
    org.powerbot.bot.rt4.client.Player[] arrayOfPlayer = localClient.getPlayers();
    if ((arrayOfInt == null) || (arrayOfPlayer == null)) {
      return localCopyOnWriteArrayList;
    }
    for (int i = 0; i < Math.min(localClient.getPlayerCount(), arrayOfInt.length); i++) {
      int j = arrayOfInt[i];
      org.powerbot.bot.rt4.client.Player localPlayer = arrayOfPlayer[j];
      if (obj.get() != null) {
        localCopyOnWriteArrayList.add(new Player((ClientContext)ctx, localPlayer));
      }
    }
    return localCopyOnWriteArrayList;
  }
  
  public Player local() {
    Player localPlayer = new Player((ClientContext)ctx, null);
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return localPlayer;
    }
    return new Player((ClientContext)ctx, localClient.getPlayer());
  }
  
  public Player nil()
  {
    return new Player((ClientContext)ctx, null);
  }
}
