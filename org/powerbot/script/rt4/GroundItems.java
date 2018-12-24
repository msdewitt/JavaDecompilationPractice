package org.powerbot.script.rt4;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.powerbot.bot.rt4.NodeQueue;
import org.powerbot.bot.rt4.client.Client;
import org.powerbot.bot.rt4.client.ItemNode;
import org.powerbot.bot.rt4.client.NodeDeque;
import org.powerbot.script.Tile;


public class GroundItems
  extends BasicQuery<GroundItem>
{
  public GroundItems(ClientContext arg0)
  {
    super(arg0);
  }
  
  public BasicQuery<GroundItem> select(int arg0) {
    Client localClient = (Client)((ClientContext)ctx).client();
    return (BasicQuery)select(get(arg0, localClient != null ? localClient.getFloor() : -1));
  }
  
  public List<GroundItem> get()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    return get(104, localClient != null ? localClient.getFloor() : -1);
  }
  
  private List<GroundItem> get(int arg0, int arg1) {
    if (arg0 < 1) {
      arg0 = 110;
    }
    CopyOnWriteArrayList localCopyOnWriteArrayList = new CopyOnWriteArrayList();
    Client localClient = (Client)((ClientContext)ctx).client();
    NodeDeque[][][] arrayOfNodeDeque;
    if ((localClient == null) || ((arrayOfNodeDeque = localClient.getGroundItems()) == null)) {
      return localCopyOnWriteArrayList;
    }
    NodeDeque[][] arrayOfNodeDeque1;
    if ((arg1 > -1) && (arg1 < arrayOfNodeDeque.length)) {
      arrayOfNodeDeque1 = arrayOfNodeDeque[arg1];
    } else {
      arrayOfNodeDeque1 = (NodeDeque[][])null;
    }
    if (arrayOfNodeDeque1 == null) {
      return localCopyOnWriteArrayList;
    }
    LinkedList localLinkedList = new LinkedList();
    Tile localTile1 = new Tile(localClient.getOffsetX(), localClient.getOffsetY(), arg1);
    Tile localTile2 = ctx).players.local().tile().derive(-localTile1.x(), -localTile1.y());
    for (int i = Math.max(0, localTile2.x() - arg0); i < Math.min(arrayOfNodeDeque1.length, localTile2.x() + arg0 + 1); i++) {
      NodeDeque[] arrayOfNodeDeque2 = arrayOfNodeDeque1[i];
      if (arrayOfNodeDeque2 != null)
      {

        for (int j = Math.max(0, localTile2.y() - arg0); j < Math.min(arrayOfNodeDeque2.length, localTile2.y() + arg0 + 1); j++) {
          for (ItemNode localItemNode : NodeQueue.get(arrayOfNodeDeque2[j], ItemNode.class)) {
            localLinkedList.add(new GroundItem((ClientContext)ctx, localTile1.derive(i, j), localItemNode));
          }
        }
      }
    }
    return localLinkedList;
  }
  
  public GroundItem nil()
  {
    return new GroundItem((ClientContext)ctx, Tile.NIL, new ItemNode(ctx).client()).reflector, null));
  }
}
