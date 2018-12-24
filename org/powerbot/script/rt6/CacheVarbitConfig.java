package org.powerbot.script.rt6;

import org.powerbot.bot.cache.Block.Sector;
import org.powerbot.bot.cache.CacheWorker;
import org.powerbot.bot.cache.JagexStream;

public class CacheVarbitConfig
{
  private final int index;
  private final JagexStream stream;
  public int configId = -1;
  public int configType = -1;
  public int lowerBitIndex = -1;
  public int upperBitIndex = -1;
  
  CacheVarbitConfig(Block.Sector arg0, int arg1) {
    index = arg1;
    stream = new JagexStream(arg0.getPayload());
    read();
  }
  
  static CacheVarbitConfig load(CacheWorker arg0, int arg1) {
    org.powerbot.bot.cache.Block localBlock = arg0.getBlock(16, 69);
    if (localBlock == null) {
      return null;
    }
    Block.Sector localSector = localBlock.getSector(arg1);
    if (localSector == null) {
      return null;
    }
    return new CacheVarbitConfig(localSector, arg1);
  }
  
  private void read() {
    int i;
    while ((i = stream.getUByte()) != 0) {
      if (i == 1) {
        configType = stream.getUByte();
        configId = stream.getBigSmart();
      } else if (i == 2) {
        lowerBitIndex = stream.getUByte();
        upperBitIndex = stream.getUByte();
      }
    }
  }
  
  public static String jdMethod_this(Object s)
  {
    int tmp30_27 = (s = (String)s).length();
    int tmp34_33 = 1;
    tmp34_33;
    int j;
    int ? = tmp34_33;
    int k = tmp30_27;
    int tmp44_40 = (j = new char[tmp30_27] - 1);
    tmp44_40;
    int i = 5 << 4 ^ 0x2 ^ 0x5;
    ((0x3 ^ 0x5) << 3 ^ 0x2);
    if (tmp44_40 >= 0)
    {
      int tmp54_53 = j;
      j--;
      ?[tmp54_53] = ((char)(s.charAt(tmp54_53) ^ i));
      int tmp75_72 = (j--);
      ?[tmp75_72] = ((char)(s.charAt(tmp75_72) ^ k));
    }
    return new String(?);
  }
}
