package org.powerbot.script.rt6;

import java.awt.Point;
import java.util.concurrent.atomic.AtomicReference;
import org.powerbot.bot.Reflector;
import org.powerbot.bot.rt6.client.Animator;
import org.powerbot.bot.rt6.client.Client;
import org.powerbot.bot.rt6.client.CombatStatus;
import org.powerbot.bot.rt6.client.CombatStatusData;
import org.powerbot.bot.rt6.client.GameLocation;
import org.powerbot.bot.rt6.client.LinkedList;
import org.powerbot.bot.rt6.client.LinkedListNode;
import org.powerbot.bot.rt6.client.Node;
import org.powerbot.bot.rt6.client.NpcNode;
import org.powerbot.bot.rt6.client.RelativePosition;
import org.powerbot.bot.rt6.client.Sequence;
import org.powerbot.script.Filter;
import org.powerbot.script.InteractiveEntity;
import org.powerbot.script.Nameable;
import org.powerbot.script.Tile;

public abstract class Actor extends Interactive implements InteractiveEntity, Nameable
{
  public Actor(ClientContext arg0)
  {
    super(arg0);
    bounds(65344, 192, 64768, 0, 65344, 192);
  }
  
  public static Filter<Actor> areInMotion() {
    new Filter()
    {
      public boolean accept(Actor arg0) {
        return arg0.inMotion();
      }
    };
  }
  
  public static Filter<Actor> areInCombat() {
    new Filter()
    {
      public boolean accept(Actor arg0) {
        return arg0.inCombat();
      }
    };
  }
  
  private static int toPercent(int arg0) {
    return (int)Math.ceil(arg0 * 100.0D / 255.0D);
  }
  
  protected abstract org.powerbot.bot.rt6.client.Actor getAccessor();
  
  public void bounds(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
  {
    boundingModel.set(new BoundingModel((ClientContext)ctx, arg0, arg1, arg2, arg3, arg4, arg5)
    {
      public int x() {
        RelativeLocation localRelativeLocation = relative();
        return (int)localRelativeLocation.x();
      }
      
      public int z()
      {
        RelativeLocation localRelativeLocation = relative();
        return (int)localRelativeLocation.z();
      }
      
      public int floor()
      {
        RelativeLocation localRelativeLocation = relative();
        return localRelativeLocation.floor();
      }
    });
  }
  
  public abstract int combatLevel();
  
  public int orientation() {
    org.powerbot.bot.rt6.client.Actor localActor = getAccessor();
    return localActor != null ? (630 - localActor.getOrientation() * 45 / 2048) % 360 : 0;
  }
  
  public int height() {
    return getAccessor().getHeight();
  }
  
  public int animation() {
    return getAccessor().getAnimation().getSequence().getId();
  }
  
  public int stance() {
    return getAccessor().getPassiveAnimation().getSequence().getId();
  }
  
  public int[] animationQueue() {
    int[] arrayOfInt = getAccessor().getAnimationQueue();
    return arrayOfInt != null ? arrayOfInt : new int[0];
  }
  
  public int speed() {
    return getAccessor().getSpeed();
  }
  
  public boolean inMotion() {
    return speed() > 0;
  }
  
  public String overheadMessage() {
    String str = getAccessor().getMessage().getText();
    return str != null ? str : "";
  }
  
  public Actor interacting() {
    Npc localNpc = ctx).npcs.nil();
    org.powerbot.bot.rt6.client.Actor localActor = getAccessor();
    int i = localActor != null ? localActor.getInteracting() : -1;
    if (i == -1) {
      return localNpc;
    }
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return localNpc;
    }
    if (i < 32768) {
      Node localNode = (Node)org.powerbot.bot.rt6.HashTable.lookup(localClient.getNpcTable(), i, Node.class);
      if (localNode == null) {
        return localNpc;
      }
      localObject = reflector;
      if (localNode.isTypeOf(NpcNode.class))
        return new Npc((ClientContext)ctx, new NpcNode((Reflector)localObject, localNode).getNpc());
      if (localNode.isTypeOf(org.powerbot.bot.rt6.client.Npc.class)) {
        return new Npc((ClientContext)ctx, new org.powerbot.bot.rt6.client.Npc((Reflector)localObject, localNode));
      }
      return localNpc;
    }
    int j = i - 32768;
    Object localObject = localClient.getPlayers();
    return (j >= 0) && (j < localObject.length) ? new Player((ClientContext)ctx, localObject[j]) : localNpc;
  }
  
  public int adrenalineRatio()
  {
    if (!valid()) {
      return -1;
    }
    CombatStatusData[] arrayOfCombatStatusData = getBarData();
    if ((arrayOfCombatStatusData == null) || (arrayOfCombatStatusData[0] == null)) {
      return 0;
    }
    return arrayOfCombatStatusData[0].getHealthRatio();
  }
  
  public int healthRatio() {
    if (!valid()) {
      return -1;
    }
    CombatStatusData[] arrayOfCombatStatusData = getBarData();
    if ((arrayOfCombatStatusData == null) || (arrayOfCombatStatusData[1] == null)) {
      return 100;
    }
    return arrayOfCombatStatusData[1].getHealthRatio();
  }
  
  public int adrenalinePercent() {
    if (!valid()) {
      return -1;
    }
    CombatStatusData[] arrayOfCombatStatusData = getBarData();
    if ((arrayOfCombatStatusData == null) || (arrayOfCombatStatusData[0] == null)) {
      return 0;
    }
    return toPercent(arrayOfCombatStatusData[0].getHealthRatio());
  }
  
  public int healthPercent() {
    if (!valid()) {
      return -1;
    }
    CombatStatusData[] arrayOfCombatStatusData = getBarData();
    if ((arrayOfCombatStatusData == null) || (arrayOfCombatStatusData[1] == null)) {
      return 100;
    }
    return toPercent(arrayOfCombatStatusData[1].getHealthRatio());
  }
  
  public boolean inCombat() {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return false;
    }
    CombatStatusData[] arrayOfCombatStatusData = getBarData();
    return (arrayOfCombatStatusData != null) && (arrayOfCombatStatusData[1] != null) && (arrayOfCombatStatusData[1].getCycleEnd() < localClient.getCycle());
  }
  
  public boolean idle() {
    return (animation() == -1) && (!inCombat()) && (!inMotion()) && (!interacting().valid());
  }
  
  public Tile tile()
  {
    org.powerbot.bot.rt6.client.Actor localActor = getAccessor();
    RelativeLocation localRelativeLocation = relative();
    if ((localActor.isNull()) || (localRelativeLocation == RelativeLocation.NIL)) {
      return Tile.NIL;
    }
    return ctx).game.mapOffset().derive((int)localRelativeLocation.x() >> 9, (int)localRelativeLocation.z() >> 9, localRelativeLocation.floor());
  }
  
  public RelativeLocation relative() {
    RelativePosition localRelativePosition = getAccessor().getLocation().getRelativePosition();
    if (localRelativePosition.isNull()) {
      return RelativeLocation.NIL;
    }
    return new RelativeLocation(localRelativePosition.getX(), localRelativePosition.getZ(), ctx).game.floor());
  }
  
  public Point nextPoint()
  {
    BoundingModel localBoundingModel = (BoundingModel)boundingModel.get();
    return localBoundingModel != null ? localBoundingModel.nextPoint() : new Point(-1, -1);
  }
  
  public Point centerPoint() {
    BoundingModel localBoundingModel = (BoundingModel)boundingModel.get();
    return localBoundingModel != null ? localBoundingModel.centerPoint() : new Point(-1, -1);
  }
  
  public boolean contains(Point arg0)
  {
    BoundingModel localBoundingModel = (BoundingModel)boundingModel.get();
    return (localBoundingModel != null) && (localBoundingModel.contains(arg0));
  }
  
  private LinkedListNode[] getBarNodes() {
    org.powerbot.bot.rt6.client.Actor localActor = getAccessor();
    if (localActor == null) {
      return null;
    }
    LinkedList localLinkedList = localActor.getCombatStatusList();
    if (localLinkedList == null) {
      return null;
    }
    LinkedListNode localLinkedListNode1 = localLinkedList.getSentinel();
    


    LinkedListNode localLinkedListNode4 = localLinkedListNode1.getNext();
    LinkedListNode localLinkedListNode3; LinkedListNode localLinkedListNode2; if (!localLinkedListNode4.getNext().equals(localLinkedListNode1)) {
      localLinkedListNode3 = localLinkedListNode4;
      localLinkedListNode2 = localLinkedListNode4.getNext();
    } else {
      localLinkedListNode3 = null;
      localLinkedListNode2 = localLinkedListNode4;
    }
    
    return new LinkedListNode[] { localLinkedListNode3, localLinkedListNode2 };
  }
  
  private CombatStatusData[] getBarData() {
    LinkedListNode[] arrayOfLinkedListNode = getBarNodes();
    Client localClient = (Client)((ClientContext)ctx).client();
    if ((arrayOfLinkedListNode == null) || (localClient == null)) {
      return null;
    }
    CombatStatusData[] arrayOfCombatStatusData = new CombatStatusData[arrayOfLinkedListNode.length];
    for (int i = 0; i < arrayOfLinkedListNode.length; i++)
      if ((arrayOfLinkedListNode[i] == null) || (arrayOfLinkedListNode[i].isNull()) || 
        (!arrayOfLinkedListNode[i].isTypeOf(CombatStatus.class))) {
        arrayOfCombatStatusData[i] = null;
      }
      else {
        CombatStatus localCombatStatus = new CombatStatus(reflector, arrayOfLinkedListNode[i]);
        LinkedList localLinkedList;
        try {
          localLinkedList = localCombatStatus.getList();
        } catch (IllegalArgumentException localIllegalArgumentException) {
          continue;
        }
        if (localLinkedList == null) {
          arrayOfCombatStatusData[i] = null;
        }
        else
        {
          localIllegalArgumentException = localLinkedList.getSentinel().getNext();
          if ((localIllegalArgumentException.isNull()) || (!localIllegalArgumentException.isTypeOf(CombatStatusData.class))) {
            arrayOfCombatStatusData[i] = null;
          }
          else
            arrayOfCombatStatusData[i] = new CombatStatusData(reflector, localIllegalArgumentException);
        } }
    return arrayOfCombatStatusData;
  }
  
  public int hashCode()
  {
    org.powerbot.bot.rt6.client.Actor localActor;
    return (localActor = getAccessor()) != null ? localActor.hashCode() : -1;
  }
  
  public boolean equals(Object arg0)
  {
    if ((arg0 == null) || (!(arg0 instanceof Actor))) {
      return false;
    }
    Actor localActor = (Actor)arg0;
    org.powerbot.bot.rt6.client.Actor localActor1;
    return ((localActor1 = getAccessor()) != null) && (localActor1.equals(localActor.getAccessor()));
  }
}
