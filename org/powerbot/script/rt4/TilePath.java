package org.powerbot.script.rt4;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.powerbot.script.Condition;
import org.powerbot.script.Condition.Check;
import org.powerbot.script.Random;
import org.powerbot.script.Tile;

public class TilePath extends Path
{
  private final AtomicInteger run_energy;
  private final AtomicInteger spaced_action;
  protected Tile[] tiles;
  protected Tile[] orig;
  private boolean end;
  private Tile last;
  
  public TilePath(ClientContext arg0, Tile[] arg1)
  {
    super(arg0);
    run_energy = new AtomicInteger(-1);
    spaced_action = new AtomicInteger(-1);
    orig = arg1;
    tiles = ((Tile[])Arrays.copyOf(arg1, arg1.length));
  }
  
  public boolean traverse(EnumSet<Path.TraversalOption> arg0)
  {
    Player localPlayer = ctx).players.local();
    final Tile localTile1 = next();
    if ((localTile1 == null) || (localPlayer == null)) {
      return false;
    }
    Tile localTile2 = ctx).movement.destination();
    if (localTile1.equals(end())) {
      if (localTile1.distanceTo(ctx).players.local()) <= 2.0D) {
        return false;
      }
      if ((end) && ((localPlayer.inMotion()) || (localTile2.equals(localTile1)))) {
        return false;
      }
      end = true;
    } else {
      end = false;
    }
    if (arg0 != null) {
      if ((arg0.contains(Path.TraversalOption.HANDLE_RUN)) && (!ctx).movement.running())) {
        int i = ctx).movement.energyLevel();
        run_energy.compareAndSet(-1, Random.nextInt(20, 90));
        if ((i >= run_energy.get()) && (ctx).movement.running(true))) {
          run_energy.set(-1);
        }
      }
      
      if ((arg0.contains(Path.TraversalOption.SPACE_ACTIONS)) && 
        (localPlayer.inMotion()) && (localTile2.distanceTo(last) > 3.0D)) {
        spaced_action.compareAndSet(-1, Random.nextInt(5, 12));
        double d2 = localTile2.distanceTo(localPlayer);
        double d1; if (d2 > spaced_action.get()) {
          d1 = d2;
        } else {
          double d3 = ctx).movement.distance(localTile2);
          d1 = d3 != -1.0D ? d3 : d2;
        }
        if (d1 > spaced_action.get()) {
          return true;
        }
      }
    }
    last = localTile1;
    if (ctx).movement.step(localTile1)) {
      spaced_action.set(-1);
      if (localPlayer.inMotion()) {
        Condition.wait(new Condition.Check()
        {

          public boolean poll() { return ctx).movement.destination().distanceTo(localTile1) < 3.0D; } }, 60, 10);
      }
      

      (localTile1.distanceTo(ctx).players.local()) < 5.0D) || (Condition.wait(new Condition.Check()
      {

        public boolean poll() { return (ctx).players.local().inMotion()) && (ctx).movement.destination().distanceTo(localTile1) < 3.0D); } }, 125, 10));
    }
    

    return false;
  }
  
  public boolean valid()
  {
    return (tiles.length > 0) && (next() != null) && (end().distanceTo(ctx).players.local()) > Math.sqrt(2.0D));
  }
  

  public Tile next()
  {
    int i = ctx).game.clientState();
    if (i == 25) {
      Condition.wait(new Condition.Check()
      {
        public boolean poll() {
          return ctx).game.clientState() != 25;
        }
      });
      return next();
    }
    if (i != 30) {
      return null;
    }
    
    Tile localTile = ctx).movement.destination();
    
    int k;
    
    for (int j = tiles.length - 1; j > 0; j--)
    {
      if ((tiles[j].matrix((ClientContext)ctx).valid()) && (tiles[j].matrix((ClientContext)ctx).onMap()))
      {





        if (localTile == Tile.NIL) {
          if (tiles[j].matrix((ClientContext)ctx).reachable()) {
            return tiles[j];
          }
        } else {
          if (tiles[j].distanceTo(localTile) < 3.0D) {
            return tiles[j];
          }
          

          for (k = j - 1; k >= 0; k--)
          {



            if ((!tiles[k].matrix((ClientContext)ctx).valid()) || (!tiles[k].matrix((ClientContext)ctx).onMap())) {
              break;
            }
            

            if (tiles[k].distanceTo(localTile) < 3.0D) {
              return tiles[j];
            }
          }
        }
      }
    }
    



    Player localPlayer = ctx).players.local();
    if ((localPlayer != null) && (!localPlayer.inMotion()) && (localTile != Tile.NIL)) {
      for (k = tiles.length - 1; k >= 0; k--) {
        if (tiles[k].matrix((ClientContext)ctx).onMap()) {
          return tiles[k];
        }
      }
    }
    if ((tiles.length == 0) || (!tiles[0].matrix((ClientContext)ctx).onMap())) {
      return null;
    }
    return tiles[0];
  }
  
  public Tile start()
  {
    return tiles[0];
  }
  
  public Tile end()
  {
    return tiles[(tiles.length - 1)];
  }
  
  public TilePath randomize(int arg0, int arg1) {
    for (int i = 0; i < tiles.length; i++) {
      tiles[i] = orig[i].derive(Random.nextInt(-arg0, arg0 + 1), Random.nextInt(-arg1, arg1 + 1));
    }
    return this;
  }
  
  public TilePath reverse() {
    Tile[] arrayOfTile = new Tile[tiles.length];
    for (int i = 0; i < orig.length; i++) {
      arrayOfTile[i] = orig[(tiles.length - 1 - i)];
    }
    orig = arrayOfTile;
    arrayOfTile = new Tile[tiles.length];
    for (i = 0; i < tiles.length; i++) {
      arrayOfTile[i] = tiles[(tiles.length - 1 - i)];
    }
    tiles = arrayOfTile;
    return this;
  }
  
  public Tile[] toArray() {
    Tile[] arrayOfTile = new Tile[tiles.length];
    System.arraycopy(tiles, 0, arrayOfTile, 0, tiles.length);
    return arrayOfTile;
  }
}
