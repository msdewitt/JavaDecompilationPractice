package org.powerbot.bot.rt6;

import java.awt.Graphics;
import java.util.Arrays;
import org.powerbot.bot.DebugHelper;
import org.powerbot.script.rt6.ClientAccessor;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.Player;
import org.powerbot.script.rt6.Players;

public class TPlayer extends ClientAccessor implements org.powerbot.script.TextPaintListener
{
  public TPlayer(ClientContext a)
  {
    a.<init>(a);
  }
  
  public int draw(int a, Graphics a) {
    Player localPlayer = ctx).players.local();
    1; int tmp33_32 = 1;tmp33_32; int tmp38_37 = 1;tmp38_37;0[tmp38_37] = localPlayer.name(); int tmp47_46 = 1; int tmp48_47 = tmp47_46;tmp48_47;tmp47_46[tmp48_47] = Integer.valueOf(localPlayer.animation()); int tmp61_60 = 1;tmp61_60;2[tmp61_60] = Integer.valueOf(localPlayer.combatLevel()); int tmp74_73 = 1;tmp74_73;3[tmp74_73] = Integer.valueOf(localPlayer.healthPercent()); int tmp84_33 = tmp33_32; int tmp87_86 = 1;tmp87_86;4[tmp87_86] = Integer.valueOf(localPlayer.team()); int tmp97_84 = tmp84_33; int tmp100_99 = 1;tmp100_99;5[tmp100_99] = Integer.valueOf(localPlayer.speed()); int tmp110_97 = tmp97_84; int tmp114_113 = 1;tmp114_113;6[tmp114_113] = localPlayer.interacting();DebugHelper.drawLine(tmp84_33, tmp97_84, String.format(tmp110_97, tmp110_97));
    1; int tmp145_144 = 1;tmp145_144; int tmp147_145 = tmp145_144; int tmp150_149 = 1;tmp150_149;0[tmp150_149] = Integer.valueOf(localPlayer.orientation()); int tmp160_147 = tmp147_145; int tmp162_161 = 1; int tmp163_162 = tmp162_161;tmp163_162;tmp162_161[tmp163_162] = Boolean.toString(localPlayer.inCombat()); int tmp173_160 = tmp160_147; int tmp176_175 = 1;tmp176_175;2[tmp176_175] = Arrays.toString(localPlayer.appearance());DebugHelper.drawLine(tmp147_145, tmp160_147, String.format(tmp173_160, tmp173_160));
    return a;
  }
}
