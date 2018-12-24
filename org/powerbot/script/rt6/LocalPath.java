package org.powerbot.script.rt6;

import java.util.EnumSet;
import org.powerbot.bot.rt6.Map;
import org.powerbot.bot.rt6.Map.Node;
import org.powerbot.script.Locatable;
import org.powerbot.script.Tile;

public class LocalPath
  extends Path
{
  private final Locatable destination;
  private final Map map;
  private Tile tile;
  private TilePath tilePath;
  
  public LocalPath(ClientContext arg0, Map arg1, Locatable arg2)
  {
    super(arg0);
    destination = arg2;
    map = arg1;
  }
  
  public boolean traverse(EnumSet<Path.TraversalOption> arg0)
  {
    return (valid()) && (tilePath.traverse(arg0));
  }
  
  public boolean valid()
  {
    Tile localTile1 = destination.tile();
    if ((localTile1 == null) || (localTile1 == Tile.NIL)) {
      return false;
    }
    if ((localTile1.equals(tile)) && (tilePath != null)) {
      return true;
    }
    tile = localTile1;
    Tile localTile2 = ctx).players.local().tile();
    Tile localTile3 = ctx).game.mapOffset();
    if ((localTile3 == Tile.NIL) || (localTile2 == Tile.NIL) || (localTile1 == Tile.NIL) || 
      (localTile2.floor() != localTile1.floor())) {
      return false;
    }
    localTile2 = localTile2.derive(-localTile3.x(), -localTile3.y());
    localTile1 = localTile1.derive(-localTile3.x(), -localTile3.y());
    Map.Node[] arrayOfNode = map.getPath(localTile2.x(), localTile2.y(), localTile1.x(), localTile1.y(), ctx).game.floor());
    if (arrayOfNode.length > 0) {
      Tile[] arrayOfTile = new Tile[arrayOfNode.length];
      for (int i = 0; i < arrayOfNode.length; i++) {
        arrayOfTile[i] = localTile3.derive(x, y);
      }
      tilePath = ctx).movement.newTilePath(arrayOfTile);
      return true;
    }
    return false;
  }
  
  public Tile next()
  {
    return valid() ? tilePath.next() : Tile.NIL;
  }
  
  public Tile start()
  {
    return Tile.NIL;
  }
  
  public Tile end()
  {
    return destination.tile();
  }
}
