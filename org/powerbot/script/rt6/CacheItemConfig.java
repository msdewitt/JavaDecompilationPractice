package org.powerbot.script.rt6;

import java.util.LinkedHashMap;
import java.util.Map;
import org.powerbot.bot.cache.Block;
import org.powerbot.bot.cache.Block.Sector;
import org.powerbot.bot.cache.CacheWorker;
import org.powerbot.bot.cache.JagexStream;
import org.powerbot.bot.rt6.Bot;
import org.powerbot.script.Validatable;

public class CacheItemConfig
  implements Validatable
{
  private static final int ADRENALINE_PARAM = 4332;
  private static final int ADRENALINE_TEMPLATE_PARAM = 4338;
  private static final int[] EQUIPPED_ACTIONS_PARAMS = { 528, 529, 530, 531, 1211 };
  private static final int[] BANK_ACTIONS_PARAMS = { 1264, 1265 };
  public final int index;
  private final CacheWorker worker;
  private final JagexStream stream;
  public String name = "";
  public boolean cosmetic;
  public boolean noted;
  public boolean lent;
  public boolean tradeable;
  public boolean stackable;
  public boolean members;
  public boolean specialAttack; public boolean twoHand; public int team = -1;
  public int value = -1;
  public int slot = -1;
  public int secondSlot = -1;
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
  public int lentTemplateId = -1;
  public int lentId = -1;
  public int certTemplateId = -1;
  public int certId = -1;
  public int stackId = -1;
  public int stackAmount = -1;
  public int maleEquip1 = -1;
  public int maleEquip2 = -1;
  public int maleWearX = -1;
  public int maleWearY = -1;
  public int maleWearZ = -1;
  public int femaleEquip1 = -1;
  public int femaleEquip2 = -1;
  public int femaleWearX = -1;
  public int femaleWearY = -1;
  public int femaleWearZ = -1;
  public int adrenaline = -1;
  public int adrenalineTemplateId = -1;
  public String[] actions = { null, null, null, null, "Drop" };
  public String[] groundActions = { null, null, "Take", null, null };
  public String[] equippedActions = new String[0];
  public String[] bankActions = new String[0];
  public final Map<Integer, Object> params = new LinkedHashMap();
  
  private CacheItemConfig(CacheWorker arg0, Block.Sector arg1, int arg2) {
    index = arg2;
    worker = arg0;
    stream = new JagexStream(arg1.getPayload());
    
    read();
    loadParams();
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
  
  private static CacheItemConfig load(CacheWorker arg0, int arg1) {
    Block localBlock = arg0.getBlock(19, arg1 >>> 8);
    if (localBlock == null) {
      return new CacheItemConfig();
    }
    Block.Sector localSector = localBlock.getSector(arg1 & 0xFF);
    if (localSector == null) {
      return new CacheItemConfig();
    }
    return new CacheItemConfig(arg0, localSector, arg1);
  }
  
  private void read() {
    int i;
    while ((i = stream.getUByte()) != 0)
      if (i == 1) {
        modelId = stream.getBigSmart();
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
          modelOffsetX = 65536;
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
      } else if (i == 13) {
        slot = stream.getUByte();
      } else if (i == 14) {
        secondSlot = stream.getUByte();
        if (secondSlot == 5) {
          twoHand = true;
        }
      } else if (i == 16) {
        members = true; } else { int j;
        if (i == 18) {
          j = stream.getUShort();
        } else if (i == 23) {
          maleEquip1 = stream.getBigSmart();
        } else if (i == 24) {
          femaleEquip1 = stream.getBigSmart();
        } else if (i == 25) {
          maleEquip2 = stream.getBigSmart();
        } else if (i == 26) {
          femaleEquip2 = stream.getBigSmart();
        } else if (i == 27) {
          j = stream.getUByte();
        } else if ((i >= 30) && (i < 35)) {
          groundActions[(i - 30)] = stream.getString();
        } else if ((i >= 35) && (i < 40)) {
          actions[(i - 35)] = stream.getString();
        } else if (i == 40) {
          j = stream.getUByte();
          originalColors = new int[j];
          modifiedColors = new int[j];
          for (int n = 0; n < j; n++) {
            originalColors[n] = stream.getUShort();
            modifiedColors[n] = stream.getUShort(); } } else { int[] arrayOfInt1;
          int i3;
          if (i == 41) {
            j = stream.getUByte();
            arrayOfInt1 = new int[j];
            int[] arrayOfInt2 = new int[j];
            for (i3 = 0; i3 < j; i3++) {
              arrayOfInt1[i3] = stream.getShort();
              arrayOfInt2[i3] = stream.getShort();
            } } else { int i2;
            if (i == 42) {
              j = stream.getUByte();
              arrayOfInt1 = new int[j];
              for (i2 = 0; i2 < j; i2++) {
                arrayOfInt1[i2] = stream.getByte();
              }
            } else if (i == 43) {
              j = stream.getInt();
            }
            else if (i == 44) {
              j = stream.getUShort();
            } else if (i == 45) {
              j = stream.getUShort();
            } else if (i == 65) {
              tradeable = true;
            } else if (i == 78) {
              j = stream.getBigSmart();
            } else if (i == 79) {
              j = stream.getBigSmart();
            } else if (i == 90) {
              j = stream.getBigSmart();
            } else if (i == 91) {
              j = stream.getBigSmart();
            } else if (i == 92) {
              j = stream.getBigSmart();
            } else if (i == 93) {
              j = stream.getBigSmart();
            } else if (i == 94) {
              j = stream.getUShort();
            } else if (i == 95) {
              modelRotationZ = stream.getUShort();
            } else if (i == 96) {
              j = stream.getUByte();
            } else if (i == 97) {
              certId = stream.getUShort();
            } else if (i == 98) {
              certTemplateId = stream.getUShort();
            } else if ((i >= 100) && (i < 110))
            {
              stackId = stream.getUShort();
              stackAmount = stream.getUShort();
            } else if ((i >= 110) && (i <= 112))
            {
              float f = stream.getUShort(); } else { int k;
              if (i == 113) {
                k = stream.getByte();
              } else if (i == 114) {
                k = stream.getByte() * 5;
              } else if (i == 115) {
                team = stream.getUByte();
              } else if (i == 121) {
                lentId = stream.getUShort();
              } else if (i == 122) {
                lentTemplateId = stream.getUShort();
              } else if (i == 125) {
                maleWearX = (stream.getByte() << 2);
                maleWearY = (stream.getByte() << 2);
                maleWearZ = (stream.getByte() << 2);
              } else if (i == 126) {
                femaleWearX = (stream.getByte() << 2);
                femaleWearY = (stream.getByte() << 2);
                femaleWearZ = (stream.getByte() << 2);
              } else if (i == 132) {
                k = stream.getUByte();
                arrayOfInt1 = new int[k];
                for (i2 = 0; i2 < k; i2++) {
                  arrayOfInt1[i2] = stream.getUShort();
                }
              } else if (i == 134) {
                k = stream.getUByte();
              } else if (i == 139) {
                cosmeticId = stream.getUShort();
              } else if (i == 140) {
                cosmeticTemplateId = stream.getUShort();
              } else if ((i >= 142) && (i < 147))
              {
                k = stream.getUShort();
              } else if ((i >= 150) && (i < 155))
              {
                k = stream.getUShort();
              } else if ((i != 156) && 
              
                (i != 157))
              {
                if (i == 161) {
                  k = stream.getUShort();
                } else if (i == 162) {
                  k = stream.getUShort();
                } else if (i == 163) {
                  k = stream.getUShort();
                } else if (i == 164) {
                  String str = stream.getString();
                } else if ((i != 165) && 
                
                  (i == 249)) {
                  int m = stream.getUByte();
                  for (int i1 = 0; i1 < m; i1++) {
                    i2 = stream.getUByte() == 1 ? 1 : 0;
                    i3 = stream.getUInt24();
                    Integer localInteger = i2 != 0 ? stream.getString() : Integer.valueOf(stream.getInt());
                    params.put(Integer.valueOf(i3), localInteger);
                  }
                }
              }
            }
          } } } }
  
  private void inherit(CacheItemConfig arg0) { if ((lentTemplateId != -1) && (lentId != -1)) {
      inheritLent(arg0);
    }
    if (certTemplateId != -1) {
      inheritCert(arg0);
    }
    if (cosmeticTemplateId != -1) {
      inheritCosmetic(arg0);
    }
    if (adrenalineTemplateId != -1) {
      inheritAdrenaline(arg0);
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
    twoHand = twoHand;
    secondSlot = secondSlot;
  }
  
  private void inheritLent(CacheItemConfig arg0) {
    delegate(arg0, lentId);
    lent = true;
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
  
  private void inheritAdrenaline(CacheItemConfig arg0) {
    CacheItemConfig localCacheItemConfig = load(certId);
    if (!localCacheItemConfig.valid()) {
      return;
    }
    specialAttack = true;
    adrenaline = adrenaline;
  }
  
  private void loadParams() {
    loadSpecialAttack();
    loadEquippedActions();
    loadBankActions();
  }
  
  private void loadEquippedActions() {
    int i = 0;int j = 0;
    int n; for (n : EQUIPPED_ACTIONS_PARAMS) {
      if (params.containsKey(Integer.valueOf(n))) {
        i++;
      }
    }
    if (i == 0) {
      return;
    }
    equippedActions = new String[i];
    for (n : EQUIPPED_ACTIONS_PARAMS) {
      String str = (String)params.get(Integer.valueOf(n));
      if (str != null) {
        equippedActions[(j++)] = str;
      }
    }
  }
  
  private void loadBankActions() {
    int i = 0;int j = 0;
    int n; for (n : BANK_ACTIONS_PARAMS) {
      if (params.containsKey(Integer.valueOf(n))) {
        i++;
      }
    }
    if (i == 0) {
      return;
    }
    bankActions = new String[i];
    for (n : BANK_ACTIONS_PARAMS) {
      String str = (String)params.get(Integer.valueOf(n));
      if (str != null) {
        bankActions[(j++)] = str;
      }
    }
  }
  
  private void loadSpecialAttack() {
    if (params.containsKey(Integer.valueOf(4332))) {
      specialAttack = true;
      adrenaline = ((Integer)params.get(Integer.valueOf(4332))).intValue();
    } else if (params.containsKey(Integer.valueOf(4338))) {
      adrenalineTemplateId = ((Integer)params.get(Integer.valueOf(4338))).intValue();
    }
  }
  
  public boolean valid()
  {
    return (index > -1) && (worker != null) && (stream != null);
  }
}
