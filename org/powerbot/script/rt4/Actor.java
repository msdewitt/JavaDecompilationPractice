package org.powerbot.script.rt4;

import java.awt.Point;
import java.util.concurrent.atomic.AtomicReference;
import org.powerbot.bot.rt4.client.BarComponent;
import org.powerbot.bot.rt4.client.Client;
import org.powerbot.bot.rt4.client.CombatStatus;
import org.powerbot.bot.rt4.client.CombatStatusData;
import org.powerbot.bot.rt4.client.LinkedList;
import org.powerbot.bot.rt4.client.Node;
import org.powerbot.script.Tile;

public abstract class Actor extends Interactive implements org.powerbot.script.InteractiveEntity, org.powerbot.script.Nameable, org.powerbot.script.Validatable
{
  Actor(ClientContext arg0)
  {
    super(arg0);
    bounds(new int[] { -32, 32, 65344, 0, -32, 32 });
  }
  
  public void bounds(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5)
  {
    boundingModel.set(new BoundingModel((ClientContext)ctx, arg0, arg1, arg2, arg3, arg4, arg5)
    {
      public int x() {
        int i = relative();
        return i >> 16;
      }
      
      public int z()
      {
        int i = relative();
        return i & 0xFFFF;
      }
    });
  }
  




  protected abstract org.powerbot.bot.rt4.client.Actor getActor();
  




  public abstract String name();
  




  public abstract int combatLevel();
  



  public int animation()
  {
    org.powerbot.bot.rt4.client.Actor localActor = getActor();
    return localActor != null ? localActor.getAnimation() : -1;
  }
  




  public int speed()
  {
    org.powerbot.bot.rt4.client.Actor localActor = getActor();
    return localActor != null ? localActor.getSpeed() : -1;
  }
  




  public int orientation()
  {
    org.powerbot.bot.rt4.client.Actor localActor = getActor();
    return localActor != null ? localActor.getOrientation() / 256 : -1;
  }
  




  public String overheadMessage()
  {
    org.powerbot.bot.rt4.client.Actor localActor = getActor();
    String str = localActor != null ? localActor.getOverheadMessage() : "";
    return str != null ? str : "";
  }
  




  public boolean inMotion()
  {
    return speed() > 0;
  }
  





  public boolean inCombat()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return false;
    }
    CombatStatusData[] arrayOfCombatStatusData = getBarData();
    return (arrayOfCombatStatusData != null) && (arrayOfCombatStatusData[1] != null) && (arrayOfCombatStatusData[1].getCycleEnd() < localClient.getCycle());
  }
  




  public int healthPercent()
  {
    if (!valid()) {
      return -1;
    }
    CombatStatusData[] arrayOfCombatStatusData = getBarData();
    if ((arrayOfCombatStatusData == null) || (arrayOfCombatStatusData[1] == null)) {
      return 100;
    }
    return (int)Math.ceil(arrayOfCombatStatusData[1].getHealthRatio() * 100.0D / getBarComponent().getWidth());
  }
  







  @Deprecated
  public int health()
  {
    return healthPercent();
  }
  









  @Deprecated
  public int maxHealth()
  {
    return 100;
  }
  






  public Actor interacting()
  {
    Npc localNpc = ctx).npcs.nil();
    org.powerbot.bot.rt4.client.Actor localActor = getActor();
    int i = localActor != null ? localActor.getInteractingIndex() : -1;
    if (i == -1) {
      return localNpc;
    }
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return localNpc;
    }
    if (i < 32768) {
      org.powerbot.bot.rt4.client.Npc[] arrayOfNpc = localClient.getNpcs();
      return (i >= 0) && (i < arrayOfNpc.length) ? new Npc((ClientContext)ctx, arrayOfNpc[i]) : localNpc;
    }
    int j = i - 32768;
    if (j == localClient.getPlayerIndex()) {
      return new Player((ClientContext)ctx, localClient.getPlayer());
    }
    org.powerbot.bot.rt4.client.Player[] arrayOfPlayer = localClient.getPlayers();
    return (j >= 0) && (j < arrayOfPlayer.length) ? new Player((ClientContext)ctx, arrayOfPlayer[j]) : localNpc;
  }
  
  public int relative()
  {
    org.powerbot.bot.rt4.client.Actor localActor = getActor();
    int i;
    int j; if (localActor != null) {
      i = localActor.getX();
      j = localActor.getZ();
    } else {
      i = j = 0;
    }
    return i << 16 | j;
  }
  
  public Tile tile()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    org.powerbot.bot.rt4.client.Actor localActor = getActor();
    if ((localClient != null) && (localActor != null)) {
      return new Tile(localClient.getOffsetX() + (localActor.getX() >> 7), localClient.getOffsetY() + (localActor.getZ() >> 7), localClient.getFloor());
    }
    return Tile.NIL;
  }
  
  public Point nextPoint()
  {
    org.powerbot.bot.rt4.client.Actor localActor = getActor();
    BoundingModel localBoundingModel = (BoundingModel)boundingModel.get();
    if ((localActor != null) && (localBoundingModel != null)) {
      return localBoundingModel.nextPoint();
    }
    return new Point(-1, -1);
  }
  
  public Point centerPoint()
  {
    org.powerbot.bot.rt4.client.Actor localActor = getActor();
    BoundingModel localBoundingModel = (BoundingModel)boundingModel.get();
    if ((localActor != null) && (localBoundingModel != null)) {
      return localBoundingModel.centerPoint();
    }
    return new Point(-1, -1);
  }
  
  public boolean contains(Point arg0)
  {
    org.powerbot.bot.rt4.client.Actor localActor = getActor();
    BoundingModel localBoundingModel = (BoundingModel)boundingModel.get();
    return (localActor != null) && (localBoundingModel != null) && (localBoundingModel.contains(arg0));
  }
  
  public boolean equals(Object arg0)
  {
    if ((arg0 == null) || (!Actor.class.isAssignableFrom(arg0.getClass()))) {
      return false;
    }
    org.powerbot.bot.rt4.client.Actor localActor = ((Actor)Actor.class.cast(arg0)).getActor();
    return (localActor != null) && (localActor.equals(getActor()));
  }
  
  public int hashCode()
  {
    org.powerbot.bot.rt4.client.Actor localActor = getActor();
    return localActor != null ? localActor.hashCode() : 0;
  }
  
  private Node[] getBarNodes() {
    org.powerbot.bot.rt4.client.Actor localActor = getActor();
    if (localActor == null) {
      return null;
    }
    LinkedList localLinkedList = localActor.getCombatStatusList();
    if (localLinkedList == null) {
      return null;
    }
    Node localNode1 = localLinkedList.getSentinel();
    


    Node localNode4 = localNode1.getNext();
    Node localNode3; Node localNode2; if (!localNode4.getNext().equals(localNode1)) {
      localNode3 = localNode4;
      localNode2 = localNode4.getNext();
    } else {
      localNode3 = null;
      localNode2 = localNode4;
    }
    return new Node[] { localNode3, localNode2 };
  }
  
  private BarComponent getBarComponent() {
    Node[] arrayOfNode = getBarNodes();
    Client localClient = (Client)((ClientContext)ctx).client();
    if ((arrayOfNode == null) || (localClient == null)) {
      return null;
    }
    CombatStatusData[] arrayOfCombatStatusData = new CombatStatusData[arrayOfNode.length];
    for (int i = 0; i < arrayOfNode.length; i++) {
      if ((arrayOfNode[i] == null) || (arrayOfNode[i].isNull()) || 
        (!arrayOfNode[i].isTypeOf(CombatStatus.class))) {
        arrayOfCombatStatusData[i] = null;
      }
      else {
        CombatStatus localCombatStatus = new CombatStatus(reflector, arrayOfNode[i]);
        try
        {
          return localCombatStatus.getBarComponent();
        }
        catch (IllegalArgumentException localIllegalArgumentException) {}
      }
    }
    

    return null;
  }
  
  private CombatStatusData[] getBarData() {
    Node[] arrayOfNode = getBarNodes();
    Client localClient = (Client)((ClientContext)ctx).client();
    if ((arrayOfNode == null) || (localClient == null)) {
      return null;
    }
    CombatStatusData[] arrayOfCombatStatusData = new CombatStatusData[arrayOfNode.length];
    for (int i = 0; i < arrayOfNode.length; i++)
      if ((arrayOfNode[i] == null) || (arrayOfNode[i].isNull()) || 
        (!arrayOfNode[i].isTypeOf(CombatStatus.class))) {
        arrayOfCombatStatusData[i] = null;
      }
      else {
        CombatStatus localCombatStatus = new CombatStatus(reflector, arrayOfNode[i]);
        LinkedList localLinkedList;
        try {
          localLinkedList = localCombatStatus.getList();
        } catch (IllegalArgumentException localIllegalArgumentException) {
          continue;
        }
        if (localLinkedList == null) {
          arrayOfCombatStatusData[i] = null;
        }
        else {
          localIllegalArgumentException = localLinkedList.getSentinel().getNext();
          if ((localIllegalArgumentException.isNull()) || (!localIllegalArgumentException.isTypeOf(CombatStatusData.class))) {
            arrayOfCombatStatusData[i] = null;
          }
          else
            arrayOfCombatStatusData[i] = new CombatStatusData(reflector, localIllegalArgumentException);
        } }
    return arrayOfCombatStatusData;
  }
}
