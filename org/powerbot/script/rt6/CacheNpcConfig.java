package org.powerbot.script.rt6;

import java.util.HashMap;
import java.util.Map;
import org.powerbot.bot.cache.Block;
import org.powerbot.bot.cache.Block.Sector;
import org.powerbot.bot.cache.CacheWorker;
import org.powerbot.bot.cache.JagexStream;
import org.powerbot.bot.rt6.Bot;
import org.powerbot.script.Validatable;


public class CacheNpcConfig
  implements Validatable
{
  public final int index;
  private final CacheWorker worker;
  private final JagexStream stream;
  public String name = "null";
  public String[] actions = new String[5];
  public int combatLevel = -1;
  public int headIcon = -1;
  public boolean clickable = true;
  public boolean visible = true;
  public int scriptId;
  public int configId; public int[] childrenIds = new int[0];
  public int[] modelIds = new int[0];
  public int[][] modelOffsets = new int[0][];
  public int[] originalColors = new int[0];
  public int[] modifiedColors = new int[0];
  public float[] resize = { 128.0F, 128.0F, 128.0F };
  public final Map<Integer, Object> params = new HashMap();
  
  private CacheNpcConfig(CacheWorker arg0, Block.Sector arg1, int arg2) {
    index = arg2;
    worker = arg0;
    stream = new JagexStream(arg1.getPayload());
    
    read();
  }
  
  private CacheNpcConfig() {
    index = -1;
    worker = null;
    stream = null;
  }
  
  public static CacheNpcConfig load(int arg0) {
    return load(Bot.CACHE_WORKER, arg0);
  }
  
  private static CacheNpcConfig load(CacheWorker arg0, int arg1) {
    Block localBlock = arg0.getBlock(18, arg1 >>> 7);
    if (localBlock == null) {
      return new CacheNpcConfig();
    }
    Block.Sector localSector = localBlock.getSector(arg1 & 0x7F);
    if (localSector == null) {
      return new CacheNpcConfig();
    }
    return new CacheNpcConfig(arg0, localSector, arg1);
  }
  
  private void read() {
    int i;
    while ((i = stream.getUByte()) != 0) { int j;
      int k; int[] arrayOfInt1; int i1; int m; int i3; switch (i) {
      case 1: 
        j = stream.getUByte();
        modelIds = new int[j];
        for (k = 0; k < j; k++) {
          modelIds[k] = stream.getBigSmart();
        }
        break;
      
      case 2: 
        name = stream.getString();
        break;
      
      case 12: 
        stream.getUByte();
        break;
      
      case 30: 
      case 31: 
      case 32: 
      case 33: 
      case 34: 
        actions[(i - 30)] = stream.getString();
        break;
      
      case 40: 
        j = stream.getUByte();
        originalColors = new int[j];
        modifiedColors = new int[j];
        for (k = 0; k < j; k++) {
          originalColors[k] = stream.getUShort();
          modifiedColors[k] = stream.getUShort();
        }
        break;
      
      case 41: 
        j = stream.getUByte();
        arrayOfInt1 = new int[j];
        int[] arrayOfInt3 = new int[j];
        for (int i2 = 0; i2 < j; i2++) {
          arrayOfInt1[i2] = stream.getShort();
          arrayOfInt3[i2] = stream.getShort();
        }
        break;
      
      case 42: 
        j = stream.getUByte();
        arrayOfInt1 = new int[j];
        for (i1 = 0; i1 < j; i1++) {
          arrayOfInt1[i1] = stream.getByte();
        }
        break;
      
      case 44: 
        stream.getUShort();
        break;
      
      case 45: 
        stream.getUShort();
        break;
      
      case 60: 
        j = stream.getUByte();
        arrayOfInt1 = new int[j];
        for (i1 = 0; i1 < j; i1++) {
          arrayOfInt1[i1] = stream.getBigSmart();
        }
        break;
      
      case 93: 
        visible = false;
        break;
      
      case 95: 
        combatLevel = stream.getUShort();
        break;
      
      case 97: 
        float tmp1378_1377 = stream.getUShort();resize[2] = tmp1378_1377;resize[0] = tmp1378_1377;
        break;
      
      case 98: 
        resize[1] = stream.getUShort();
        break;
      
      case 99: 
        break;
      

      case 100: 
        stream.getByte();
        break;
      
      case 101: 
        stream.getByte();
        break;
      
      case 102: 
        j = stream.getUByte();
        m = 0;
        i1 = j;
        while (i1 != 0) {
          m++;
          i1 >>= 1;
        }
        int[] arrayOfInt4 = new int[m];
        int[] arrayOfInt5 = new int[m];
        for (int i5 = 0; i5 < m; i5++) {
          if ((j & 1 << i5) == 0) {
            arrayOfInt4[i5] = -1;
            arrayOfInt5[i5] = -1;
          } else {
            arrayOfInt4[i5] = stream.getBigSmart();
            arrayOfInt5[i5] = stream.getSmartMinusOne();
          }
        }
        break;
      
      case 103: 
        stream.getUShort();
        break;
      
      case 106: 
      case 118: 
        scriptId = stream.getUShort();
        if (scriptId == 65535) {
          scriptId = -1;
        }
        configId = stream.getUShort();
        if (configId == 65535) {
          configId = -1;
        }
        j = -1;
        if (i == 118) {
          j = stream.getUShort();
          if (j == 65535) {
            j = -1;
          }
        }
        m = stream.getUByte();
        childrenIds = new int[m + 2];
        for (i1 = 0; i1 <= m; i1++) {
          childrenIds[i1] = stream.getUShort();
          if (childrenIds[i1] == 65535) {
            childrenIds[i1] = -1;
          }
        }
        childrenIds[(m + 1)] = j;
        break;
      
      case 107: 
        clickable = false;
        break;
      
      case 109: 
        break;
      

      case 111: 
        break;
      

      case 113: 
        stream.getUShort();
        stream.getUShort();
        break;
      
      case 114: 
        stream.getByte();
        stream.getByte();
        break;
      
      case 119: 
        stream.getUByte();
        break;
      
      case 121: 
        modelOffsets = new int[modelIds.length][3];
        j = stream.getUByte();
        for (m = 0; m < j; m++) {
          i1 = stream.getUByte();
          modelOffsets[i1][0] = stream.getByte();
          modelOffsets[i1][1] = stream.getByte();
          modelOffsets[i1][2] = stream.getByte();
        }
        break;
      
      case 123: 
        stream.getUShort();
        break;
      
      case 125: 
        stream.getByte();
        break;
      
      case 127: 
        stream.getUShort();
        break;
      
      case 128: 
        stream.getUByte();
        break;
      
      case 134: 
        j = stream.getUShort();
        if (j == 65535) {
          j = -1;
        }
        m = stream.getUShort();
        if (m == 65535) {
          m = -1;
        }
        i1 = stream.getUShort();
        if (i1 == 65535) {
          i1 = -1;
        }
        i3 = stream.getUShort();
        if (i3 == 65535) {
          i3 = -1;
        }
        int i4 = stream.getUByte();
        break;
      
      case 137: 
        stream.getUShort();
        break;
      
      case 138: 
        headIcon = stream.getBigSmart();
        break;
      
      case 139: 
        stream.getBigSmart();
        break;
      
      case 140: 
        stream.getUByte();
        break;
      
      case 141: 
        break;
      

      case 142: 
        stream.getUShort();
        break;
      
      case 143: 
        break;
      

      case 150: 
      case 151: 
      case 152: 
      case 153: 
      case 154: 
        actions[(i - 150)] = stream.getString();
        break;
      
      case 155: 
        stream.getByte();
        stream.getByte();
        stream.getByte();
        stream.getByte();
        break;
      
      case 158: 
        break;
      

      case 159: 
        break;
      

      case 160: 
        j = stream.getUByte();
        int[] arrayOfInt2 = new int[j];
        for (i1 = 0; i1 < j; i1++) {
          arrayOfInt2[i1] = stream.getUShort();
        }
        break;
      
      case 162: 
        break;
      

      case 163: 
        stream.getUByte();
        break;
      
      case 164: 
        stream.getUShort();
        stream.getUShort();
        break;
      
      case 165: 
        stream.getUByte();
        break;
      
      case 168: 
        stream.getUByte();
        break;
      
      case 169: 
        break;
      

      case 170: 
      case 171: 
      case 172: 
      case 173: 
      case 174: 
      case 175: 
        stream.getUShort();
        break;
      
      case 178: 
        break;
      

      case 179: 
        stream.getSmart();
        stream.getSmart();
        stream.getSmart();
        stream.getSmart();
        stream.getSmart();
        stream.getSmart();
        break;
      
      case 180: 
        stream.getUByte();
        break;
      
      case 181: 
        stream.getUShort();
        stream.getUByte();
        break;
      
      case 182: 
        break;
      

      case 249: 
        j = stream.getUByte();
        for (int n = 0; n < j; n++) {
          i1 = stream.getUByte() == 1 ? 1 : 0;
          i3 = stream.getUInt24();
          Integer localInteger = i1 != 0 ? stream.getString() : Integer.valueOf(stream.getInt());
          params.put(Integer.valueOf(i3), localInteger);
        }
      }
      
    }
  }
  

  public boolean valid()
  {
    return (index > -1) && (worker != null) && (stream != null);
  }
  
  public String toString()
  {
    return String.format("%s[index=%d,combatLevel=%d,visible=%s]", new Object[] { name, Integer.valueOf(index), Integer.valueOf(combatLevel), Boolean.toString(visible) });
  }
}
