package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class Landscape extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_new = new org.powerbot.bot.Reflector.FieldCache();
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public Landscape(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public Floor[] getFloors() {
    Object[] arrayOfObject;
    if ((arrayOfObject = (Object[])reflector.access(this, new, [Ljava.lang.Object.class)) != null) { int tmp27_26 = 1;;; break label43; throw new Floor[arrayOfObject.length]; } else { 1;1; } label43: int ? = tmp41_40;
    int i; if (arrayOfObject != null) {
      int tmp50_49 = 1;
      
















      for (tmp50_49; (i = tmp50_49) < arrayOfObject.length;) {
        int tmp64_63 = i; int tmp65_64 = tmp64_63;tmp65_64; int tmp67_65 = tmp65_64;tmp67_65.<init>(reflector, arrayOfObject[i]);new org/powerbot/bot/rt6/client/Floor[tmp67_65] = (i++);tmpTernaryOp = i; continue;throw tmp64_63;
      }
    }
    return ?;
  }
  
  public Tile[][][] getTiles() {
    Object[][][] arrayOfObject;
    if ((arrayOfObject = (Object[][][])reflector.access(this, void, [[[Ljava.lang.Object.class)) == null) {
      int tmp23_22 = 1;tmp23_22; int tmp29_28 = 1;tmp29_28;return tmp29_28;throw new Tile[tmp23_22][][];
    }
    int tmp39_38 = 1;tmp39_38;int ? = tmp39_38;
    1;
    int i;
    Object[][] arrayOfObject1; int j; if ((arrayOfObject1 = arrayOfObject[i]) == null) {
      int tmp66_65 = ;;;;;;
      break label207; throw ?;
    } else {
      int tmp86_85 = 1;tmp86_85;int ? = tmp86_85;
      ?[i] = ?;
      1;
      
      Object[] arrayOfObject2;
      int tmp124_123 = 1;tmp124_123; int tmp130_129 = 1;tmp130_129;0[new Tile[tmp124_123]] = tmp130_129; int 
      

        tmp143_142 = 1;tmp143_142;int ? = tmp143_142;
      ?[j] = ?;
      1;
      int k; int tmp175_172 = k;tmp175_172; int tmp177_175 = tmp175_172;tmp177_175.<init>(reflector, arrayOfObject2[k]);new org/powerbot/bot/rt6/client/Tile[tmp177_175] = (k++);j++;
    }
    label207:
    i++;
    



















    return ?;
  }
}
