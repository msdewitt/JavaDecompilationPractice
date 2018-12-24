package org.powerbot.script.rt4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.powerbot.bot.ReflectProxy;
import org.powerbot.bot.rt4.client.Client;
import org.powerbot.bot.rt4.client.Landscape;
import org.powerbot.script.Locatable;


public class Objects
  extends BasicQuery<GameObject>
{
  private GameObject NIL;
  
  public Objects(ClientContext arg0)
  {
    super(arg0);
    NIL = new GameObject(arg0, null, GameObject.Type.UNKNOWN);
  }
  
  public BasicQuery<GameObject> select(int arg0) {
    return (BasicQuery)select(get(arg0));
  }
  
  public BasicQuery<GameObject> select(Locatable arg0, int arg1) {
    return (BasicQuery)select(get(arg0.tile(), arg1));
  }
  
  public List<GameObject> get()
  {
    return get(Integer.MAX_VALUE);
  }
  
  public List<GameObject> get(int arg0) {
    return get(ctx).players.local().tile(), arg0);
  }
  
  public List<GameObject> get(Locatable arg0, int arg1) {
    arg1 = Math.min(arg1, 110);
    CopyOnWriteArrayList localCopyOnWriteArrayList = new CopyOnWriteArrayList();
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return localCopyOnWriteArrayList;
    }
    org.powerbot.bot.rt4.client.Tile[][][] arrayOfTile = localClient.getLandscape().getTiles();
    int i = localClient.getFloor();
    if ((i < 0) || (i >= arrayOfTile.length)) {
      return localCopyOnWriteArrayList;
    }
    org.powerbot.bot.rt4.client.Tile[][] arrayOfTile1 = arrayOfTile[i];
    HashSet localHashSet = new HashSet();
    int j = 0;int k = Integer.MAX_VALUE;int m = 0;int n = Integer.MAX_VALUE;
    Object localObject1; if (arg1 >= 0) {
      org.powerbot.script.Tile localTile1 = ctx).game.mapOffset();localObject1 = arg0.tile();
      if ((localTile1 != org.powerbot.script.Tile.NIL) && (localObject1 != org.powerbot.script.Tile.NIL)) {
        org.powerbot.script.Tile localTile2 = ((org.powerbot.script.Tile)localObject1).derive(-localTile1.x(), -localTile1.y());
        j = localTile2.x() - arg1;
        k = localTile2.x() + arg1;
        m = localTile2.y() - arg1;
        n = localTile2.y() + arg1;
      }
    }
    for (int i1 = Math.max(0, j); i1 <= Math.min(k, arrayOfTile1.length - 1); i1++) {
      localObject1 = arrayOfTile1[i1];
      for (int i2 = Math.max(0, m); i2 <= Math.min(n, localObject1.length - 1); i2++) {
        Object localObject2 = localObject1[i2];
        if (!localObject2.isNull())
        {

          int i3 = Math.max(0, localObject2.getGameObjectLength());
          ReflectProxy[] arrayOfReflectProxy1 = { localObject2.getBoundaryObject(), localObject2.getFloorObject(), localObject2.getWallObject() };
          ReflectProxy[] arrayOfReflectProxy2 = new ReflectProxy[3 + i3];
          System.arraycopy(arrayOfReflectProxy1, 0, arrayOfReflectProxy2, 0, 3);
          org.powerbot.bot.rt4.client.GameObject[] arrayOfGameObject = localObject2.getGameObjects();
          System.arraycopy(arrayOfGameObject, 0, arrayOfReflectProxy2, 3, Math.min(i3, arrayOfGameObject.length));
          
          for (ReflectProxy localReflectProxy : arrayOfReflectProxy2) {
            BasicObject localBasicObject = new BasicObject(localReflectProxy);
            if (!object.isNull()) {
              int i6 = localBasicObject.getMeta() & 0x3F;
              GameObject.Type localType;
              if ((i6 == 0) || (i6 == 1) || (i6 == 9)) {
                localType = GameObject.Type.BOUNDARY;
              } else if ((i6 == 2) || (i6 == 3) || (i6 == 4) || (i6 == 5) || (i6 == 6) || (i6 == 7) || (i6 == 8)) {
                localType = GameObject.Type.WALL_DECORATION;
              } else if ((i6 == 10) || (i6 == 11)) {
                localType = GameObject.Type.INTERACTIVE;
              } else if (i6 == 22) {
                localType = GameObject.Type.FLOOR_DECORATION;
              } else {
                localType = GameObject.Type.UNKNOWN;
              }
              localHashSet.add(new GameObject((ClientContext)ctx, localBasicObject, localType));
            }
          }
        }
      } }
    return new ArrayList(localHashSet);
  }
  
  public GameObject nil()
  {
    return NIL;
  }
}
