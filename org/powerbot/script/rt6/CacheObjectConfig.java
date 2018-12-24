package org.powerbot.script.rt6;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import org.powerbot.bot.cache.Block;
import org.powerbot.bot.cache.Block.Sector;
import org.powerbot.bot.cache.CacheWorker;
import org.powerbot.bot.cache.JagexStream;




class CacheObjectConfig
{
  private final JagexStream stream;
  private final int index;
  public byte[] meshType;
  public int[][] meshId;
  public String name;
  public int reachableState;
  public boolean isObjectBlocked;
  public int meshMergeType;
  public int[] alternateFileIndex;
  public boolean swapYZ;
  public boolean clippedRange;
  public int[] childrenFileIndex;
  public String[] menuActions;
  public int xSize;
  public int ySize;
  public short xScale = 128;
  public short yScale = 128;
  public short zScale = 128;
  public int xTranslate;
  public int yTranslate;
  public int zTranslate;
  public int stageOperationId;
  public int stageIndex;
  public int meshMergeValue;
  public int zOffsetOverride;
  public int yOffsetOverride;
  public int xOffsetOverride;
  public float xStart;
  public float yStart;
  public float zStart;
  public float xStop;
  public float yStop;
  public float zStop;
  public short[] originalColors;
  public short[] modifiedColors;
  public Map<Integer, Object> params = new LinkedHashMap();
  
  CacheObjectConfig(Block.Sector arg0, int arg1) {
    index = arg1;
    stream = new JagexStream(arg0.getPayload());
    
    xSize = 1;
    ySize = 1;
    reachableState = 2;
    isObjectBlocked = true;
    menuActions = new String[10];
    read();
  }
  
  static CacheObjectConfig load(CacheWorker arg0, int arg1) {
    Block localBlock = arg0.getBlock(16, arg1 >>> 8);
    if (localBlock == null) {
      return null;
    }
    Block.Sector localSector = localBlock.getSector(arg1 & 0xFF);
    if (localSector == null) {
      return null;
    }
    return new CacheObjectConfig(localSector, arg1);
  }
  
  private void read() {
    int i;
    while ((i = stream.getUByte()) != 0) { int j;
      int m; int i5; if (i == 1) {
        j = stream.getUByte();
        meshType = new byte[j];
        meshId = new int[j][];
        for (m = 0; m < j; m++) {
          meshType[m] = stream.getByte();
          int i2 = stream.getUByte();
          meshId[m] = new int[i2];
          for (i5 = 0; i5 < i2; i5++) {
            meshId[m][i5] = stream.getBigSmart();
          }
        }
      } else if (i == 2) {
        name = stream.getString();
      } else if (i == 14) {
        xSize = stream.getUByte();
      } else if (i == 15) {
        ySize = stream.getUByte();
      } else if (17 == i) {
        reachableState = 0;
        isObjectBlocked = false;
      } else if (18 == i) {
        isObjectBlocked = false;
      } else if (19 == i) {
        stream.getUByte();
      } else if (i == 21) {
        meshMergeType = 1;
      } else if (22 == i) {
        j = 1;
      } else if (23 == i) {
        j = 1;
      } else if (24 == i) {
        j = stream.getBigSmart();
        if (-1 != j) {
          alternateFileIndex = new int[] { j };
        }
      } else if (i == 27) {
        reachableState = 1;
      } else if (i == 28) {
        j = stream.getUByte() << 2;
      } else if (29 == i) {
        j = stream.getByte();
      } else if (i == 39) {
        j = stream.getByte();
      } else if ((i >= 30) && (i < 35)) {
        menuActions[(i - 30)] = stream.getString();
      } else if (40 == i) {
        j = stream.getUByte();
        originalColors = new short[j];
        modifiedColors = new short[j];
        for (m = 0; m < j; m++) {
          originalColors[m] = stream.getShort();
          modifiedColors[m] = stream.getShort();
        } } else { Object localObject1;
        if (i == 41) {
          j = stream.getUByte();
          localObject1 = new short[j];
          short[] arrayOfShort = new short[j];
          for (i5 = 0; i5 < j; i5++) {
            localObject1[i5] = stream.getShort();
            arrayOfShort[i5] = stream.getShort();
          } } else { int i3;
          if (42 == i) {
            j = stream.getUByte();
            localObject1 = new byte[j];
            for (i3 = 0; i3 < j; i3++)
              localObject1[i3] = stream.getByte(); } else { int n;
            byte[] arrayOfByte;
            int i7; if (44 == i) {
              j = stream.getUShort();
              n = 0;
              i3 = j;
              while (i3 > 0) {
                n++;
                i3 >>= 1;
              }
              arrayOfByte = new byte[n];
              i3 = 0;
              for (i7 = 0; i7 < n; i7++) {
                if ((j & 1 << i7) > 0) {
                  arrayOfByte[i7] = ((byte)i3);
                  i3 = (byte)(i3 + 1);
                } else {
                  arrayOfByte[i7] = -1;
                }
              }
            } else if (i == 45) {
              j = stream.getUShort();
              n = 0;
              i3 = j;
              while (i3 > 0) {
                n++;
                i3 >>= 1;
              }
              arrayOfByte = new byte[n];
              i3 = 0;
              for (i7 = 0; i7 < n; i7++) {
                if ((j & 1 << i7) > 0) {
                  arrayOfByte[i7] = ((byte)i3);
                  i3 = (byte)(i3 + 1);
                } else {
                  arrayOfByte[i7] = -1;
                }
              }
            } else if (i == 62) {
              swapYZ = true;
            } else if (64 == i) {
              j = 0;
            } else if (i == 65) {
              xScale = stream.getShort();
            } else if (i == 66) {
              yScale = stream.getShort();
            } else if (i == 67) {
              zScale = stream.getShort();
            } else if (69 == i) {
              stream.getUByte();
            } else if (70 == i) {
              xTranslate = (stream.getSmartShort() << 2);
            } else if (71 == i) {
              yTranslate = (stream.getSmartShort() << 2);
            } else if (i == 72) {
              zTranslate = (stream.getSmartShort() << 2);
            } else if (i == 73) {
              j = 1;
            } else if (i == 74) {
              clippedRange = true;
            } else if (75 == i) {
              j = stream.getUByte();
            } else if ((i == 77) || (i == 92)) {
              stageOperationId = stream.getUShort();
              if (65535 == stageOperationId)
              {
                stageOperationId = -1;
              }
              stageIndex = stream.getUShort();
              if (65535 == stageIndex) {
                stageIndex = -1;
              }
              j = -1;
              if (92 == i) {
                j = stream.getBigSmart();
              }
              n = stream.getUByte();
              childrenFileIndex = new int[n + 2];
              for (i3 = 0; i3 <= n; i3++) {
                childrenFileIndex[i3] = stream.getBigSmart();
              }
              childrenFileIndex[(n + 1)] = j;
            } else if (i == 78) {
              j = stream.getUShort();
              n = stream.getUByte(); } else { int i6;
              Object localObject2; if (i == 79) {
                j = stream.getUShort();
                n = stream.getUShort();
                i3 = stream.getUByte();
                i6 = stream.getUByte();
                localObject2 = new int[i6];
                for (int i8 = 0; i8 < i6; i8++) {
                  localObject2[i8] = stream.getUShort();
                }
              } else if (i == 81) {
                meshMergeType = 2;
                meshMergeValue = stream.getUByte();
              } else if (82 == i) {
                j = 1;
              } else if (i == 88) {
                j = 0;
              } else if (89 == i) {
                j = 0;
              } else if (i == 91) {
                j = 1;
              } else if (93 == i) {
                meshMergeType = 3;
                meshMergeValue = stream.getUShort();
              } else if (94 == i) {
                meshMergeType = 4;
              } else if (i == 95) {
                meshMergeType = 5;
                meshMergeValue = stream.getSmartShort();
              } else if (i == 97) {
                j = 1;
              } else if (i == 98) {
                j = 1;
              } else if ((99 == i) || (100 == i)) {
                stream.getByte();
                stream.getShort();
              } else if (i == 101) {
                j = stream.getUByte();
              } else if (102 == i) {
                j = stream.getUShort();
              } else if (i == 103) {
                j = 0;
              } else if (104 == i) {
                j = stream.getUByte();
              } else if (105 == i) {
                j = 1;
              } else if (106 == i) {
                j = stream.getUByte();
                n = 0;
                alternateFileIndex = new int[j];
                int[] arrayOfInt3 = new int[j];
                for (i6 = 0; i6 < j; i6++) {
                  alternateFileIndex[i6] = stream.getBigSmart();
                  n += (arrayOfInt3[i6] = stream.getUByte());
                }
                for (i6 = 0; i6 < j; i6++) {
                  arrayOfInt3[i6] = (65535 * arrayOfInt3[i6] / n);
                }
              } else if (i == 107) {
                j = stream.getUShort();
              } else if ((i >= 150) && (i < 155)) {
                menuActions[(i - 150)] = stream.getString(); } else { int i4;
                if (160 == i) {
                  j = stream.getUByte();
                  int[] arrayOfInt2 = new int[j];
                  for (i4 = 0; i4 < j; i4++) {
                    arrayOfInt2[i4] = stream.getUShort();
                  }
                } else if (i == 162) {
                  meshMergeType = 3;
                  meshMergeValue = stream.getInt(); } else { int i1;
                  if (i == 163) {
                    j = stream.getByte();
                    i1 = stream.getByte();
                    i4 = stream.getByte();
                    i6 = stream.getByte();
                  } else if (i == 164) {
                    xOffsetOverride = stream.getSmartShort();
                  } else if (i == 165) {
                    yOffsetOverride = stream.getSmartShort();
                  } else if (166 == i) {
                    zOffsetOverride = stream.getSmartShort();
                  } else if (167 == i) {
                    j = stream.getUShort();
                  } else if (i == 168) {
                    j = 1;
                  } else if (169 == i) {
                    j = 1;
                  } else if (170 == i) {
                    j = stream.getSignedSmart();
                  } else if (171 == i) {
                    j = stream.getSignedSmart();
                  } else if (173 == i) {
                    j = stream.getUShort();
                    i1 = stream.getUShort();
                  } else if (i == 177) {
                    j = 1;
                  } else if (i == 178) {
                    j = stream.getUByte();
                  } else if (186 == i) {
                    stream.getByte();
                  } else if (189 == i) {
                    j = 1;
                  } else if ((i >= 190) && (i < 196)) {
                    int[] arrayOfInt1 = new int[6];
                    Arrays.fill(arrayOfInt1, -1);
                    arrayOfInt1[(i - 190)] = stream.getUShort();
                  } else if (i == 196)
                  {
                    stream.getByte();
                  } else if (i == 197)
                  {
                    stream.getByte();
                  } else if ((i != 198) && (i != 199)) { int k;
                    if (i == 200) {
                      k = 1;
                    } else if (201 == i) {
                      xStart = stream.getSmart();
                      yStart = stream.getSmart();
                      zStart = stream.getSmart();
                      xStop = stream.getSmart();
                      yStop = stream.getSmart();
                      zStop = stream.getSmart();
                    } else if (i == 249) {
                      k = stream.getUByte();
                      for (i1 = 0; i1 < k; i1++) {
                        i4 = stream.getUByte() == 1 ? 1 : 0;
                        i6 = stream.getUInt24();
                        localObject2 = i4 != 0 ? stream.getString() : Integer.valueOf(stream.getInt());
                        params.put(Integer.valueOf(i6), localObject2);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}
