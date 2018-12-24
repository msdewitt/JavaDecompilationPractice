package org.powerbot.script.rt4;

import java.util.HashMap;
import java.util.Map;
import org.powerbot.bot.cache.Block;
import org.powerbot.bot.cache.Block.Sector;
import org.powerbot.bot.cache.CacheWorker;
import org.powerbot.bot.cache.JagexStream;
import org.powerbot.bot.rt4.Bot;
import org.powerbot.script.Validatable;



public class CacheItemConfig
  implements Validatable
{
  public final int index;
  private final CacheWorker worker;
  private final JagexStream stream;
  public String name = "";
  public String shiftAction = "";
  public boolean tradeable;
  public boolean stackable;
  public boolean members;
  public int team = -1;
  public int value = -1;
  public int modelId = -1;
  public int modelZoom = 0;
  public int modelOffsetX = 0;
  public int modelOffsetY = 0;
  public int modelRotationX = 0;
  public int modelRotationY = 0;
  public int modelRotationZ = 0;
  public int[] originalColors = new int[0];
  public int[] modifiedColors = new int[0];
  public int cosmeticTemplateId = -1;
  public int cosmeticId = -1;
  public int certTemplateId = -1;
  public int certId = -1;
  public int stackId = -1;
  public int stackAmount = -1;
  public int shiftActionIndex = -1;
  public boolean cosmetic;
  public boolean noted; public String[] actions = { null, null, null, null, "Drop" };
  public String[] groundActions = { null, null, "Take", null, null };
  public String[] equipActions = new String[0];
  public final Map<Integer, Object> params = new HashMap();
  private static final int[] EQUIP_ACTION_PARAMS = { 451, 452, 453, 454, 455 };
  
  private CacheItemConfig(CacheWorker arg0, Block.Sector arg1, int arg2)
  {
    index = arg2;
    worker = arg0;
    stream = new JagexStream(arg1.getPayload());
    read();
    inherit(this);
  }
  
  private CacheItemConfig() {
    index = -1;
    worker = null;
    stream = null;
  }
  
  public static CacheItemConfig load(int arg0) {
    return load(Bot.CACHE_WORKER, arg0);
  }
  
  static CacheItemConfig load(CacheWorker arg0, int arg1) {
    Block localBlock = arg0.getBlock(2, 10);
    if (localBlock == null) {
      return new CacheItemConfig();
    }
    Block.Sector localSector = localBlock.getSector(arg1);
    if (localSector == null) {
      return new CacheItemConfig();
    }
    return new CacheItemConfig(arg0, localSector, arg1);
  }
  
  private void read() {
    int i;
    while ((i = stream.getUByte()) != 0) {
      if (i == 1) {
        modelId = stream.getUShort();
      } else if (i == 2) {
        name = stream.getString();
      } else if (i == 4) {
        modelZoom = stream.getUShort();
      } else if (i == 5) {
        modelRotationX = stream.getUShort();
      } else if (i == 6) {
        modelRotationY = stream.getUShort();
      } else if (i == 7) {
        modelOffsetX = stream.getUShort();
        if (modelOffsetX > 32767) {
          modelOffsetX -= 65536;
        }
      } else if (i == 8) {
        modelOffsetY = stream.getUShort();
        if (modelOffsetY > 32767) {
          modelOffsetY -= 65536;
        }
      } else if (i == 11) {
        stackable = true;
      } else if (i == 12) {
        value = stream.getInt();
      } else if (i == 16) {
        members = true;
      } else if (i == 23) {
        stream.getUShort();
        stream.getUByte(); } else { int j;
        if (i == 24) {
          j = stream.getUShort();
        } else if (i == 25) {
          stream.getUShort();
          stream.getUByte();
        } else if (i == 26) {
          j = stream.getUShort();
        } else if ((i >= 30) && (i < 35)) {
          groundActions[(i - 30)] = stream.getString();
          if (groundActions[(i - 30)].equalsIgnoreCase("Hidden")) {
            groundActions[(i - 30)] = null;
          }
        } else if ((i >= 35) && (i < 40)) {
          actions[(i - 35)] = stream.getString();
        } else if (i == 40) {
          j = stream.getUByte();
          originalColors = new int[j];
          modifiedColors = new int[j];
          for (int m = 0; m < j; m++) {
            originalColors[m] = stream.getUShort();
            modifiedColors[m] = stream.getUShort();
          } } else { int i2;
          if (i == 41) {
            j = stream.getUByte();
            int[] arrayOfInt1 = new int[j];
            int[] arrayOfInt2 = new int[j];
            for (i2 = 0; i2 < j; i2++) {
              arrayOfInt1[i2] = stream.getUShort();
              arrayOfInt2[i2] = stream.getUShort();
            }
          } else if (i == 42) {
            shiftActionIndex = stream.getByte();
          } else if (i == 65) {
            tradeable = true;
          } else if (i == 78) {
            j = stream.getUShort();
          } else if (i == 79) {
            j = stream.getUShort();
          } else if (i == 90) {
            j = stream.getUShort();
          } else if (i == 91) {
            j = stream.getUShort();
          } else if (i == 92) {
            j = stream.getUShort();
          } else if (i == 93) {
            j = stream.getUShort();
          } else if (i == 95) {
            modelRotationZ = stream.getUShort();
          } else if (i == 97) {
            certId = stream.getUShort();
          } else if (i == 98) {
            certTemplateId = stream.getUShort();
          } else if ((i >= 100) && (i < 110))
          {
            stackId = stream.getUShort();
            stackAmount = stream.getUShort();
          } else if ((i >= 110) && (i <= 112)) {
            float f = stream.getUShort(); } else { int k;
            if (i == 113) {
              k = stream.getByte();
            } else if (i == 114) {
              k = stream.getByte();
            } else if (i == 115) {
              team = stream.getUByte();
            } else if (i == 139) {
              cosmeticId = stream.getUShort();
            } else if (i == 140) {
              cosmeticTemplateId = stream.getUShort();
            } else if (i == 148) {
              stream.getUShort();
            } else if (i == 149) {
              stream.getUShort();
            } else { if (i != 249) break;
              k = stream.getUByte();
              for (int n = 0; n < k; n++) {
                int i1 = stream.getUByte() == 1 ? 1 : 0;
                i2 = stream.getUInt24();
                Integer localInteger = i1 != 0 ? stream.getString() : Integer.valueOf(stream.getInt());
                params.put(Integer.valueOf(i2), localInteger);
              }
              loadEquipActions(params);
            }
          }
        }
      }
    }
  }
  
  private void inherit(CacheItemConfig arg0) {
    if (certTemplateId != -1) {
      inheritCert(arg0);
    }
    if (cosmeticTemplateId != -1) {
      inheritCosmetic(arg0);
    }
    if ((shiftActionIndex >= 0) && (shiftActionIndex < actions.length)) {
      shiftAction = actions[shiftActionIndex];
    }
  }
  
  private void delegate(CacheItemConfig arg0, int arg1) {
    CacheItemConfig localCacheItemConfig = load(arg1);
    if (!localCacheItemConfig.valid()) {
      return;
    }
    groundActions = groundActions;
    actions = actions;
    name = name;
    members = members;
    value = 0;
    team = team;
    actions[4] = "Discard";
  }
  
  private void inheritCert(CacheItemConfig arg0) {
    CacheItemConfig localCacheItemConfig = load(certId);
    if (!localCacheItemConfig.valid()) {
      return;
    }
    value = value;
    name = name;
    stackable = true;
    members = members;
    noted = true;
  }
  
  private void inheritCosmetic(CacheItemConfig arg0) {
    delegate(arg0, cosmeticId);
    cosmetic = true;
  }
  
  private void loadEquipActions(Map<Integer, Object> arg0) {
    int i = 0;int j = 0;
    int n; for (n : EQUIP_ACTION_PARAMS) {
      if (arg0.containsKey(Integer.valueOf(n))) {
        i++;
      }
    }
    if (i == 0) {
      return;
    }
    equipActions = new String[i];
    for (n : EQUIP_ACTION_PARAMS) {
      String str = (String)arg0.get(Integer.valueOf(n));
      if (str != null) {
        equipActions[(j++)] = str;
      }
    }
  }
  
  public boolean valid()
  {
    return (index > -1) && (worker != null) && (stream != null);
  }
}
