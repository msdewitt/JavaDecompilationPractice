package org.powerbot.script.rt4;

import java.util.HashMap;
import java.util.Map;
import org.powerbot.bot.cache.Block;
import org.powerbot.bot.cache.Block.Sector;
import org.powerbot.bot.cache.CacheWorker;
import org.powerbot.bot.cache.JagexStream;
import org.powerbot.bot.rt4.Bot;




public class CacheNpcConfig
{
  public final int index;
  private final JagexStream stream;
  public String name = "null";
  public int[] modelIds;
  public int[] materialPointers; public int[] d; public int size = 552360651;
  public int v = -1;
  public int m = -1;
  public int h = -1;
  public int n = -1;
  public int x = -1;
  public int o = -1;
  public int r = -1;
  public String[] actions = new String[5];
  public boolean visible = true;
  public int level = -1;
  public int z = -1;
  public int b = -1;
  public boolean a = false;
  public int ag = 0;
  public int am = 0;
  public int aa = -1;
  public int az = -1;
  public int stageOperation = -1;
  public int stageIndex = -1;
  public boolean clickable = true;
  public boolean au = true;
  public boolean ao = false;
  public int af = -1;
  public short[] colors1;
  public short[] colors2; public short[] q; public short[] g; public final Map<Integer, Object> params = new HashMap();
  
  public CacheNpcConfig(Block.Sector arg0, int arg1) {
    index = arg1;
    stream = new JagexStream(arg0.getPayload());
    read();
  }
  
  public static CacheNpcConfig load(int arg0) {
    return load(Bot.CACHE_WORKER, arg0);
  }
  
  static CacheNpcConfig load(CacheWorker arg0, int arg1) {
    Block localBlock = arg0.getBlock(2, 9);
    if (localBlock == null) {
      return null;
    }
    Block.Sector localSector = localBlock.getSector(arg1);
    if (localSector == null) {
      return null;
    }
    return new CacheNpcConfig(localSector, arg1);
  }
  
  private void read() {
    int i;
    while ((i = stream.getUByte()) != 0) { int j;
      int k; switch (i) {
      case 1: 
        j = stream.getUByte();
        modelIds = new int[j];
        for (k = 0; k < j; k++) {
          modelIds[k] = stream.getUShort();
        }
        break;
      
      case 2: 
        name = stream.getString();
        break;
      case 12: 
        size = stream.getUByte();
        break;
      case 13: 
        v = stream.getUShort();
        break;
      case 14: 
        n = stream.getUShort();
        break;
      case 15: 
        m = stream.getUShort();
        break;
      case 16: 
        h = stream.getUShort();
        break;
      case 17: 
        n = stream.getUShort();
        x = stream.getUShort();
        o = stream.getUShort();
        r = stream.getUShort();
        break;
      case 30: 
      case 31: 
      case 32: 
      case 33: 
      case 34: 
        actions[(i - 30)] = stream.getString();
        if (actions[(i - 30)].equalsIgnoreCase("Hidden")) {
          actions[(i - 30)] = null;
        }
        break;
      case 40: 
        j = stream.getUByte();
        colors1 = new short[j];
        colors2 = new short[j];
        for (k = 0; k < j; k++) {
          colors1[k] = ((short)stream.getUShort());
          colors2[k] = ((short)stream.getUShort());
        }
        
        break;
      case 41: 
        j = stream.getUByte();
        q = new short[j];
        g = new short[j];
        for (k = 0; k < j; k++) {
          q[k] = ((short)stream.getUShort());
          g[k] = ((short)stream.getUShort());
        }
        
        break;
      case 60: 
        j = stream.getUByte();
        d = new int[j];
        for (k = 0; k < j; k++) {
          d[k] = stream.getUShort();
        }
        
        break;
      case 93: 
        visible = false;
        break;
      case 95: 
        level = stream.getUShort();
        break;
      case 97: 
        z = stream.getUShort();
        break;
      case 98: 
        b = stream.getUShort();
        break;
      case 99: 
        a = true;
        break;
      case 100: 
        ag = stream.getByte();
        break;
      case 101: 
        am = stream.getByte();
        break;
      case 102: 
        aa = stream.getUShort();
        break;
      case 103: 
        az = stream.getUShort();
        break;
      case 106: 
        stageOperation = stream.getUShort();
        if (stageOperation == 65535) {
          stageOperation = -1;
        }
        stageIndex = stream.getUShort();
        if (stageIndex == 65535) {
          stageIndex = -1;
        }
        j = stream.getUByte();
        materialPointers = new int[j + 1];
        for (k = 0; k <= j; k++) {
          materialPointers[k] = stream.getUShort();
          if (65535 == materialPointers[k]) {
            materialPointers[k] = -1;
          }
        }
        break;
      case 107: 
        clickable = false;
        break;
      case 109: 
        au = false;
        break;
      case 111: 
        ao = true;
        break;
      case 112: 
        af = stream.getUByte();
        break;
      case 249: 
        k = stream.getUByte();
        for (int i1 = 0; i1 < k; i1++) {
          int i2 = stream.getUByte() == 1 ? 1 : 0;
          int i3 = stream.getUInt24();
          Integer localInteger = i2 != 0 ? stream.getString() : Integer.valueOf(stream.getInt());
          params.put(Integer.valueOf(i3), localInteger);
        }
      }
    }
  }
}
