package org.powerbot.script.rt6;

import java.util.ArrayList;
import java.util.List;
import org.powerbot.bot.rt6.NodeQueue;
import org.powerbot.bot.rt6.client.Client;
import org.powerbot.bot.rt6.client.ItemNode;
import org.powerbot.bot.rt6.client.NodeListCache;
import org.powerbot.script.Tile;



public class GroundItems
  extends GroundItemQuery<GroundItem>
{
  public GroundItems(ClientContext arg0)
  {
    super(arg0);
  }
  
  public GroundItemQuery<GroundItem> select(int arg0) {
    return (GroundItemQuery)select(get(arg0));
  }
  



  protected List<GroundItem> get()
  {
    return get(104);
  }
  
  protected List<GroundItem> get(int arg0) {
    if (arg0 < 1) {
      arg0 = 110;
    }
    
    ArrayList localArrayList = new ArrayList();
    
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return localArrayList;
    }
    
    org.powerbot.bot.rt6.client.HashTable localHashTable = localClient.getItemTable();
    if (localHashTable.isNull()) {
      return localArrayList;
    }
    int i = localClient.getFloor();
    


    Tile localTile1 = ctx).game.mapOffset();
    Tile localTile2 = ctx).players.local().tile();
    if ((localTile1 == Tile.NIL) || (localTile2 == Tile.NIL) || (!localTile2.matrix((ClientContext)ctx).valid())) {
      return localArrayList;
    }
    int j = localTile1.x();int k = j + 103;
    int m = localTile1.y();int n = m + 103;
    for (int i1 = Math.max(j, localTile2.x() - arg0); i1 <= Math.min(k, localTile2.x() + arg0); i1++) {
      for (int i2 = Math.max(m, localTile2.y() - arg0); i2 <= Math.min(n, localTile2.y() + arg0); i2++) {
        long l = i1 | i2 << 14 | i << 28;
        NodeListCache localNodeListCache = (NodeListCache)org.powerbot.bot.rt6.HashTable.lookup(localHashTable, l, NodeListCache.class);
        if (!localNodeListCache.isNull())
        {

          for (ItemNode localItemNode : NodeQueue.get(localNodeListCache.getDeque(), ItemNode.class))
            localArrayList.add(new GroundItem((ClientContext)ctx, new Tile(i1, i2, i), localItemNode));
        }
      }
    }
    return localArrayList;
  }
  



  public GroundItem nil()
  {
    return new GroundItem((ClientContext)ctx, Tile.NIL, new ItemNode(ctx).client()).reflector, null));
  }
}
