package org.powerbot.script.rt4;

import java.util.ArrayList;
import java.util.List;
import org.powerbot.bot.rt4.client.Client;


public class Npcs
  extends BasicQuery<Npc>
{
  public Npcs(ClientContext arg0)
  {
    super(arg0);
  }
  
  public List<Npc> get()
  {
    ArrayList localArrayList = new ArrayList();
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return localArrayList;
    }
    int[] arrayOfInt = localClient.getNpcIndices();
    org.powerbot.bot.rt4.client.Npc[] arrayOfNpc = localClient.getNpcs();
    if ((arrayOfInt == null) || (arrayOfNpc == null)) {
      return localArrayList;
    }
    for (int i = 0; i < Math.min(localClient.getNpcCount(), arrayOfInt.length); i++) {
      org.powerbot.bot.rt4.client.Npc localNpc = arrayOfNpc[arrayOfInt[i]];
      if (!localNpc.isNull()) {
        localArrayList.add(new Npc((ClientContext)ctx, localNpc));
      }
    }
    return localArrayList;
  }
  
  public Npc nil()
  {
    return new Npc((ClientContext)ctx, null);
  }
}
