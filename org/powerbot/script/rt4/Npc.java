package org.powerbot.script.rt4;

import java.awt.Color;
import org.powerbot.bot.rt4.Bot;
import org.powerbot.bot.rt4.HashTable;
import org.powerbot.bot.rt4.client.Cache;
import org.powerbot.bot.rt4.client.Client;
import org.powerbot.bot.rt4.client.NpcConfig;
import org.powerbot.bot.rt4.client.Varbit;
import org.powerbot.script.Actionable;
import org.powerbot.script.Identifiable;
import org.powerbot.script.StringUtils;


public class Npc
  extends Actor
  implements Identifiable, Actionable
{
  public static final Color TARGET_COLOR = new Color(255, 0, 255, 15);
  


  private static final int[] lookup = new int[32];
  static { int i = 2;
    for (int j = 0; j < 32; j++) {
      lookup[j] = (i - 1);
      i += i;
    }
  }
  
  private final org.powerbot.bot.rt4.client.Npc npc;
  private final int hash;
  Npc(ClientContext arg0, org.powerbot.bot.rt4.client.Npc arg1)
  {
    super(arg0);
    npc = arg1;
    hash = System.identityHashCode(arg1);
  }
  
  protected org.powerbot.bot.rt4.client.Actor getActor()
  {
    return npc;
  }
  
  public String name()
  {
    CacheNpcConfig localCacheNpcConfig = CacheNpcConfig.load(Bot.CACHE_WORKER, id());
    return localCacheNpcConfig != null ? StringUtils.stripHtml(name) : "";
  }
  
  public int combatLevel()
  {
    CacheNpcConfig localCacheNpcConfig = CacheNpcConfig.load(Bot.CACHE_WORKER, id());
    return localCacheNpcConfig != null ? level : -1;
  }
  
  public int id()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return -1;
    }
    NpcConfig localNpcConfig = npc == null ? new NpcConfig(reflector, null) : npc.getConfig();
    if (localNpcConfig.isNull()) {
      return -1;
    }
    int i = localNpcConfig.getVarbit();int j = localNpcConfig.getVarpbitIndex();
    int k = -1;
    Object localObject; if (i != -1) {
      localObject = localClient.getVarbitCache();
      Varbit localVarbit = (Varbit)HashTable.lookup(((Cache)localObject).getTable(), i, Varbit.class);
      if (!localVarbit.isNull()) {
        int m = lookup[(localVarbit.getEndBit() - localVarbit.getStartBit())];
        k = ctx).varpbits.varpbit(localVarbit.getIndex()) >> localVarbit.getStartBit() & m;
      }
    } else if (j != -1) {
      k = ctx).varpbits.varpbit(j);
    }
    if (k >= 0) {
      localObject = localNpcConfig.getConfigs();
      if ((k < localObject.length) && (localObject[k] != -1)) {
        return localObject[k];
      }
    }
    return localNpcConfig.getId();
  }
  
  public String[] actions()
  {
    CacheNpcConfig localCacheNpcConfig = CacheNpcConfig.load(Bot.CACHE_WORKER, id());
    return localCacheNpcConfig != null ? actions : new String[0];
  }
  
  public boolean valid()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    if ((localClient == null) || (npc == null) || (npc.isNull())) {
      return false;
    }
    org.powerbot.bot.rt4.client.Npc[] arrayOfNpc1 = localClient.getNpcs();
    for (org.powerbot.bot.rt4.client.Npc localNpc : arrayOfNpc1) {
      if (npc.equals(localNpc)) {
        return true;
      }
    }
    return false;
  }
  
  public int hashCode()
  {
    return hash;
  }
  
  public String toString()
  {
    return String.format("%s[id=%d/name=%s/level=%d]", new Object[] {Npc.class
      .getName(), Integer.valueOf(id()), name(), Integer.valueOf(combatLevel()) });
  }
  
  public short[] colors1() {
    CacheNpcConfig localCacheNpcConfig = CacheNpcConfig.load(Bot.CACHE_WORKER, id());
    return localCacheNpcConfig != null ? colors1 : new short[0];
  }
  
  public short[] colors2() {
    CacheNpcConfig localCacheNpcConfig = CacheNpcConfig.load(Bot.CACHE_WORKER, id());
    return localCacheNpcConfig != null ? colors2 : new short[0];
  }
}
