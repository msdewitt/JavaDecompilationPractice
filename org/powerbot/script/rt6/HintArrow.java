package org.powerbot.script.rt6;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import org.powerbot.bot.Reflector;
import org.powerbot.bot.rt6.HashTable;
import org.powerbot.bot.rt6.client.Client;
import org.powerbot.bot.rt6.client.Node;
import org.powerbot.bot.rt6.client.NpcNode;
import org.powerbot.script.Locatable;
import org.powerbot.script.Tile;
import org.powerbot.script.Validatable;

public class HintArrow
  extends ClientAccessor
  implements Locatable, Validatable
{
  private final org.powerbot.bot.rt6.client.HintArrow arrow;
  
  public HintArrow(ClientContext arg0, org.powerbot.bot.rt6.client.HintArrow arg1)
  {
    super(arg0);
    arrow = arg1;
  }
  
  public int type() {
    return arrow.getType();
  }
  
  public int targetId() {
    return arrow.getTargetId();
  }
  
  public int floor() {
    return arrow.getFloor();
  }
  
  public Tile tile()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if ((localClient == null) || (arrow.obj.get() == null)) {
      return Tile.NIL;
    }
    
    int i = type();
    int j = targetId();
    if ((i == -1) || (i == 0)) {
      return Tile.NIL;
    }
    if (i == 1) {
      localObject = null;
      localNode = (Node)HashTable.lookup(localClient.getNpcTable(), j, Node.class);
      if (!localNode.isNull()) {
        Reflector localReflector = reflector;
        if (localNode.isTypeOf(NpcNode.class)) {
          localObject = new Npc((ClientContext)ctx, new NpcNode(localReflector, localNode).getNpc());
        } else if (localNode.isTypeOf(org.powerbot.bot.rt6.client.Npc.class)) {
          localObject = new Npc((ClientContext)ctx, new org.powerbot.bot.rt6.client.Npc(localReflector, localNode));
        }
      }
      return localObject != null ? ((Npc)localObject).tile() : Tile.NIL; }
    if (i == 2) {
      return ctx).game.mapOffset().derive(arrow.getX() >> 9, arrow.getY() >> 9, floor());
    }
    Object localObject = localClient.getPlayers();
    if ((i != 10) || (j < 0) || (j >= localObject.length)) {
      return Tile.NIL;
    }
    Node localNode = localObject[j];
    if (localNode != null) {
      return new Player((ClientContext)ctx, localNode).tile();
    }
    return Tile.NIL;
  }
  
  public RelativeLocation relative() {
    if (arrow.obj.get() != null) {
      return new RelativeLocation(arrow.getX(), arrow.getY(), arrow.getFloor());
    }
    return RelativeLocation.NIL;
  }
  
  public boolean valid()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return false;
    }
    org.powerbot.bot.rt6.client.HintArrow[] arrayOfHintArrow = localClient.getHintArrows();
    return (arrow.obj.get() != null) && (arrayOfHintArrow != null) && (Arrays.asList(arrayOfHintArrow).contains(arrow));
  }
  
  public int hashCode()
  {
    Object localObject;
    return (localObject = arrow.obj.get()) != null ? System.identityHashCode(localObject) : 0;
  }
  
  public boolean equals(Object arg0)
  {
    return ((arg0 instanceof HintArrow)) && (arrow.equals(arrow));
  }
}
