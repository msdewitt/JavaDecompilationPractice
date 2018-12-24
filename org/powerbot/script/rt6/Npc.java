package org.powerbot.script.rt6;

import java.awt.Color;
import org.powerbot.bot.rt6.Bot;
import org.powerbot.bot.rt6.client.NpcConfig;
import org.powerbot.bot.rt6.client.OverheadSprites;
import org.powerbot.script.Actionable;
import org.powerbot.script.Identifiable;
import org.powerbot.script.StringUtils;

public class Npc
  extends Actor
  implements Identifiable, Actionable
{
  public static final Color TARGET_COLOR = new Color(255, 0, 255, 15);
  
  private CacheNpcConfig cacheNpcConfig = null;
  private CacheVarbitConfig cacheVarbitConfig = null;
  

  private static final int[] lookup = new int[32];
  static { int i = 2;
    for (int j = 0; j < 32; j++) {
      lookup[j] = (i - 1);
      i += i;
    }
  }
  
  private final org.powerbot.bot.rt6.client.Npc npc;
  public Npc(ClientContext arg0, org.powerbot.bot.rt6.client.Npc arg1)
  {
    super(arg0);
    npc = arg1;
  }
  
  protected org.powerbot.bot.rt6.client.Npc getAccessor()
  {
    return npc;
  }
  
  public String name()
  {
    NpcConfig localNpcConfig = npc.getConfig();
    return localNpcConfig.isNull() ? "" : StringUtils.stripHtml(localNpcConfig.getName());
  }
  
  public int combatLevel()
  {
    NpcConfig localNpcConfig = npc.getConfig();
    return localNpcConfig.isNull() ? -1 : localNpcConfig.getCombatLevel();
  }
  
  public int id()
  {
    NpcConfig localNpcConfig = npc.getConfig();
    if (localNpcConfig.isNull()) {
      return -1;
    }
    CacheNpcConfig localCacheNpcConfig = cacheNpcConfig == null ? (this.cacheNpcConfig = CacheNpcConfig.load(localNpcConfig.getId())) : cacheNpcConfig;
    if (!localCacheNpcConfig.valid()) {
      return localNpcConfig.getId();
    }
    int i = scriptId;int j = configId;
    int k = -1;
    Object localObject; int m; if (i != -1) {
      localObject = cacheVarbitConfig == null ? (this.cacheVarbitConfig = CacheVarbitConfig.load(Bot.CACHE_WORKER, i)) : cacheVarbitConfig;
      if (localObject != null) {
        m = lookup[(upperBitIndex - lowerBitIndex)];
        k = ctx).varpbits.varpbit(configId, lowerBitIndex, m);
      }
    } else if (j != -1) {
      k = j;
    }
    if (k >= 0) {
      localObject = childrenIds;
      if (localObject.length > 0) {
        if (k >= localObject.length)
        {
          k = localObject.length - 1;
        }
        
        if ((m = localObject[k]) != -1) {
          return m;
        }
      }
    }
    return localNpcConfig.getId();
  }
  
  public String[] actions()
  {
    NpcConfig localNpcConfig = npc.getConfig();
    return localNpcConfig.isNull() ? new String[0] : localNpcConfig.getActions();
  }
  
  public int prayerIcon() {
    int[] arrayOfInt = getOverheadArray1();
    short[] arrayOfShort = getOverheadArray2();
    int i = arrayOfInt.length;
    if (i != arrayOfShort.length) {
      return -1;
    }
    
    for (int j = 0; j < i; j++) {
      if (arrayOfInt[j] == 440) {
        return arrayOfShort[j];
      }
    }
    return -1;
  }
  
  private int[] getOverheadArray1() {
    NpcConfig localNpcConfig = npc.getConfig();
    int[] arrayOfInt1 = npc.getOverhead().getArray1();int[] arrayOfInt2 = localNpcConfig.getOverheadArray1();
    return arrayOfInt2 != null ? arrayOfInt2 : arrayOfInt1 != null ? arrayOfInt1 : new int[0];
  }
  
  private short[] getOverheadArray2()
  {
    NpcConfig localNpcConfig = npc.getConfig();
    short[] arrayOfShort1 = npc.getOverhead().getArray2();short[] arrayOfShort2 = localNpcConfig.getOverheadArray2();
    return arrayOfShort2 != null ? arrayOfShort2 : arrayOfShort1 != null ? arrayOfShort1 : new short[0];
  }
  
  public boolean valid()
  {
    org.powerbot.bot.rt6.client.Npc localNpc = getAccessor();
    if (localNpc.isNull()) {
      return false;
    }
    for (Npc localNpc1 : (MobileIdNameQuery)ctx).npcs.select()) {
      if (localNpc1.getAccessor().equals(localNpc)) {
        return true;
      }
    }
    return false;
  }
  
  public String toString()
  {
    return Npc.class.getSimpleName() + "[id=" + id() + ",name=" + name() + ",level=" + combatLevel() + "]";
  }
}
