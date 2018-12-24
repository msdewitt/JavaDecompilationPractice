package org.powerbot.script.rt6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.powerbot.bot.Reflector;
import org.powerbot.bot.rt6.client.AnimationBridge;
import org.powerbot.bot.rt6.client.BoundaryObject;
import org.powerbot.bot.rt6.client.Client;
import org.powerbot.bot.rt6.client.DynamicBoundaryObject;
import org.powerbot.bot.rt6.client.DynamicFloorObject;
import org.powerbot.bot.rt6.client.DynamicGameObject;
import org.powerbot.bot.rt6.client.DynamicWallObject;
import org.powerbot.bot.rt6.client.FloorObject;
import org.powerbot.bot.rt6.client.Landscape;
import org.powerbot.bot.rt6.client.RenderableEntity;
import org.powerbot.bot.rt6.client.RenderableNode;
import org.powerbot.bot.rt6.client.WallObject;
import org.powerbot.bot.rt6.client.World;
import org.powerbot.script.Locatable;



public class Objects
  extends MobileIdNameQuery<GameObject>
{
  private GameObject NIL;
  private static final Class<?>[][] o_types = { { BoundaryObject.class, DynamicBoundaryObject.class }, { BoundaryObject.class, DynamicBoundaryObject.class }, { FloorObject.class, DynamicFloorObject.class }, { WallObject.class, DynamicWallObject.class }, { WallObject.class, DynamicWallObject.class } };
  



  private static final GameObject.Type[] types = { GameObject.Type.BOUNDARY, GameObject.Type.BOUNDARY, GameObject.Type.FLOOR_DECORATION, GameObject.Type.WALL_DECORATION, GameObject.Type.WALL_DECORATION };
  



  public Objects(ClientContext arg0)
  {
    super(arg0);
    NIL = new GameObject((ClientContext)ctx, null, GameObject.Type.UNKNOWN);
  }
  
  public MobileIdNameQuery<GameObject> select(int arg0) {
    return (MobileIdNameQuery)select(get(arg0));
  }
  
  public MobileIdNameQuery<GameObject> select(Locatable arg0, int arg1) {
    return (MobileIdNameQuery)select(get(arg0, arg1));
  }
  



  protected List<GameObject> get()
  {
    return get(Integer.MAX_VALUE);
  }
  
  protected List<GameObject> get(int arg0) {
    return get(ctx).players.local(), arg0);
  }
  
  protected List<GameObject> get(Locatable arg0, int arg1) {
    arg1 = Math.min(arg1, 110);
    ArrayList localArrayList = new ArrayList();
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return localArrayList;
    }
    org.powerbot.bot.rt6.client.Tile[][][] arrayOfTile = localClient.getWorld().getLandscape().getTiles();
    int i = ctx).game.floor();
    if ((i < 0) || (i >= arrayOfTile.length)) {
      return localArrayList;
    }
    HashSet localHashSet = new HashSet();
    org.powerbot.bot.rt6.client.Tile[][] arrayOfTile1 = arrayOfTile[i];
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
          Object localObject4;
          for (Object localObject3 = localObject2.getInteractives(); !((RenderableNode)localObject3).isNull(); localObject3 = ((RenderableNode)localObject3).getNext()) {
            RenderableEntity localRenderableEntity = ((RenderableNode)localObject3).getEntity();
            if (!localRenderableEntity.isNull())
            {

              if (localRenderableEntity.isTypeOf(org.powerbot.bot.rt6.client.GameObject.class)) {
                localObject4 = new org.powerbot.bot.rt6.client.GameObject(reflector, localRenderableEntity);
                if (((org.powerbot.bot.rt6.client.GameObject)localObject4).getId() != -1) {
                  localHashSet.add(new GameObject((ClientContext)ctx, new BasicObject((RenderableEntity)localObject4, i), GameObject.Type.INTERACTIVE));
                }
              } else if (localRenderableEntity.isTypeOf(DynamicGameObject.class)) {
                localObject4 = new DynamicGameObject(reflector, localRenderableEntity);
                if (((DynamicGameObject)localObject4).getBridge().getId() != -1) {
                  localHashSet.add(new GameObject((ClientContext)ctx, new BasicObject((RenderableEntity)localObject4, i), GameObject.Type.INTERACTIVE));
                }
              }
            }
          }
          

          localObject3 = new Object[] {localObject2.getBoundary1(), localObject2.getBoundary2(), localObject2.getFloorDecoration(), localObject2.getWallDecoration1(), localObject2.getWallDecoration2() };
          
          for (int i3 = 0; i3 < localObject3.length; i3++) {
            if (localObject3[i3] != null)
            {

              localObject4 = null;
              for (Class localClass1 : o_types[i3])
              {
                Class localClass2 = localClass1;
                if ((localClass2 != null) && (reflector.isTypeOf(localObject3[i3], localClass2))) {
                  localObject4 = localClass2;
                  break;
                }
              }
              if (localObject4 != null)
              {
                try
                {
                  localArrayList.add(new GameObject((ClientContext)ctx, new BasicObject(
                    (RenderableEntity)((Class)localObject4).getConstructor(new Class[] { Reflector.class, Object.class }).newInstance(new Object[] { reflector, localObject3[i3] }), i), types[i3]));
                }
                catch (InstantiationException localInstantiationException1) {}catch (IllegalAccessException localIllegalAccessException1) {}catch (InvocationTargetException localInvocationTargetException1) {}catch (NoSuchMethodException localNoSuchMethodException1) {}
              }
            }
          }
        }
      }
    }
    
    localArrayList.addAll(localHashSet);
    localHashSet.clear();
    return localArrayList;
  }
  



  public GameObject nil()
  {
    return NIL;
  }
}
