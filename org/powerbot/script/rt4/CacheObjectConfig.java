package org.powerbot.script.rt4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.powerbot.bot.cache.Block;
import org.powerbot.bot.cache.Block.Sector;
import org.powerbot.bot.cache.CacheWorker;
import org.powerbot.bot.cache.JagexStream;
import org.powerbot.bot.rt4.Bot;




public class CacheObjectConfig
{
  public final int index;
  private final JagexStream stream;
  public String name = "null";
  public String[] actions = new String[5];
  public int xSize = 1;
  public int[] materialPointers;
  public int ySize = 1;
  public int[] meshId;
  public int[] meshType;
  public boolean swapYZ = false;
  public int yScale = 128;
  public int xScale = 128;
  public int zScale = 128;
  public int xTranslate = 0;
  public int yTranslate = 0;
  public int stageOperationId = -1;
  public int stageIndex = -1;
  public int zTranslate = 0;
  public int[] originalColors;
  public int[] modifiedColors; public final Map<Integer, Object> params = new HashMap();
  
  CacheObjectConfig(Block.Sector arg0, int arg1) {
    index = arg1;
    stream = new JagexStream(arg0.getPayload());
    read();
  }
  
  public static CacheObjectConfig load(int arg0) {
    return load(Bot.CACHE_WORKER, arg0);
  }
  
  static CacheObjectConfig load(CacheWorker arg0, int arg1) {
    Block localBlock = arg0.getBlock(2, 6);
    if (localBlock == null) {
      return null;
    }
    Block.Sector localSector = localBlock.getSector(arg1);
    if (localSector == null) {
      return null;
    }
    return new CacheObjectConfig(localSector, arg1);
  }
  
  private void read() {
    int i;
    while ((i = stream.getUByte()) != 0) { int j;
      int k; int i1; int m; int n; switch (i) {
      case 1: 
        j = stream.getUByte();
        if (j > 0)
        {

          if (meshId != null) {
            stream.seek(stream.getLocation() + j * 3);
          }
          else {
            meshId = new int[j];
            meshType = new int[j];
            for (k = 0; k < j; k++) {
              meshId[k] = stream.getUShort();
              meshType[k] = stream.getUByte();
            } } }
        break;
      
      case 2: 
        name = stream.getString();
        break;
      case 5: 
        j = stream.getUByte();
        if (j > 0)
        {

          if (meshId != null) {
            stream.seek(stream.getLocation() + j * 2);
          }
          else {
            meshId = new int[j];
            meshType = null;
            for (k = 0; k < j; k++)
              meshId[k] = stream.getUShort();
          } }
        break;
      
      case 14: 
        xSize = stream.getUByte();
        break;
      case 15: 
        ySize = stream.getUByte();
        break;
      case 17: 
      case 18: 
        break;
      case 19: 
        stream.getUByte();
        break;
      case 21: 
      case 22: 
      case 23: 
        break;
      case 24: 
        stream.getUShort();
        break;
      case 27: 
        break;
      case 28: 
        stream.getUByte();
        break;
      case 29: 
      case 39: 
        stream.getByte();
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
        originalColors = new int[j];
        modifiedColors = new int[j];
        for (k = 0; k < j; k++) {
          originalColors[k] = stream.getUShort();
          modifiedColors[k] = stream.getUShort();
        }
        break;
      
      case 41: 
        j = stream.getUByte();
        short[] arrayOfShort1 = new short[j];short[] arrayOfShort2 = new short[j];
        for (i1 = 0; i1 < j; i1++) {
          arrayOfShort1[i1] = ((short)stream.getUShort());
          arrayOfShort2[i1] = ((short)stream.getUShort());
        }
        break;
      
      case 60: 
        stream.getUShort();
        break;
      case 62: 
        swapYZ = true;
        break;
      case 64: 
        break;
      case 65: 
        xScale = stream.getUShort();
        break;
      case 66: 
        yScale = stream.getUShort();
        break;
      case 67: 
        zScale = stream.getUShort();
        break;
      case 68: 
        stream.getUShort();
        break;
      case 69: 
        stream.getUByte();
        break;
      case 70: 
        xTranslate = stream.getUShort();
        break;
      case 71: 
        yTranslate = stream.getUShort();
        break;
      case 72: 
        zTranslate = stream.getUShort();
        break;
      case 73: 
      case 74: 
        break;
      case 75: 
        stream.getUByte();
        break;
      case 77: 
      case 92: 
        stageOperationId = (stream.getUShort() & 0xFFFF);
        if (65535 == stageOperationId) {
          stageOperationId = -1;
        }
        stageIndex = (stream.getUShort() & 0xFFFF);
        if (65535 == stageIndex) {
          stageIndex = -1;
        }
        j = -1;
        if (i == 92) {
          j = stream.getUShort();
          if (j == 65535) {
            j = -1;
          }
        }
        m = stream.getUByte();
        materialPointers = new int[2 + m];
        for (n = 0; n <= m; n++) {
          materialPointers[n] = (stream.getUShort() & 0xFFFF);
          if (65535 == materialPointers[n])
          {

            materialPointers[n] = -1; }
        }
        materialPointers[(m + 1)] = j;
        break;
      
      case 78: 
        stream.getUShort();
        stream.getUByte();
        break;
      case 79: 
        stream.getUShort();
        stream.getUShort();
        stream.getUByte();
        j = stream.getUByte();
        for (m = 0; m < j; m++) {
          stream.getUShort();
        }
        break;
      case 81: 
        stream.getUByte();
        break;
      case 82: 
        stream.getUShort();
        break;
      case 249: 
        m = stream.getUByte();
        for (n = 0; n < m; n++) {
          i1 = stream.getUByte() == 1 ? 1 : 0;
          int i2 = stream.getUInt24();
          Integer localInteger = i1 != 0 ? stream.getString() : Integer.valueOf(stream.getInt());
          params.put(Integer.valueOf(i2), localInteger);
        }
      }
      
    }
  }
  
  public String toString()
  {
    return String.format("ObjectDefinition[index=%s,name=%s,actions=%s,xSize=%d,ySize=%d,ext_links=%s,ext_ids=%s,ext_types=%s,stageIndex=%d,stageId=%d]", new Object[] {
    
      Integer.valueOf(index), name, Arrays.toString(actions), Integer.valueOf(xSize), Integer.valueOf(ySize), 
      Arrays.toString(materialPointers), Arrays.toString(meshId), Arrays.toString(meshType), 
      Integer.valueOf(stageIndex), Integer.valueOf(stageOperationId) });
  }
}
