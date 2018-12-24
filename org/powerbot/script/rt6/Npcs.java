package org.powerbot.script.rt6;

import java.util.ArrayList;
import java.util.List;
import org.powerbot.bot.Reflector;
import org.powerbot.bot.rt6.client.Client;
import org.powerbot.bot.rt6.client.Node;
import org.powerbot.bot.rt6.client.NpcNode;







public class Npcs
  extends MobileIdNameQuery<Npc>
{
  public Npcs(ClientContext arg0)
  {
    super(arg0);
  }
  



  protected List<Npc> get()
  {
    ArrayList localArrayList = new ArrayList();
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return localArrayList;
    }
    
    int[] arrayOfInt = localClient.getNpcIndices();
    org.powerbot.bot.rt6.client.HashTable localHashTable = localClient.getNpcTable();
    if ((arrayOfInt == null) || (localHashTable.isNull())) {
      return localArrayList;
    }
    
    Reflector localReflector = reflector;
    for (int i = 0; (i < localClient.getNpcCount()) && (i < arrayOfInt.length); i++) {
      Node localNode = (Node)org.powerbot.bot.rt6.HashTable.lookup(localHashTable, arrayOfInt[i], Node.class);
      if (localNode.isTypeOf(NpcNode.class)) {
        localArrayList.add(new Npc((ClientContext)ctx, new NpcNode(localReflector, localNode).getNpc()));
      } else if (localNode.isTypeOf(org.powerbot.bot.rt6.client.Npc.class)) {
        localArrayList.add(new Npc((ClientContext)ctx, new org.powerbot.bot.rt6.client.Npc(localReflector, localNode)));
      }
    }
    
    return localArrayList;
  }
  



  public Npc nil()
  {
    return new Npc((ClientContext)ctx, new org.powerbot.bot.rt6.client.Npc(ctx).client()).reflector, null));
  }
}
