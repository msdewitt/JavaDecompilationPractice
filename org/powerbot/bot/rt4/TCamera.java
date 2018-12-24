package org.powerbot.bot.rt4;

import java.awt.Graphics;
import org.powerbot.bot.DebugHelper;
import org.powerbot.script.TextPaintListener;
import org.powerbot.script.rt4.Camera;
import org.powerbot.script.rt4.ClientAccessor;
import org.powerbot.script.rt4.ClientContext;

public class TCamera
  extends ClientAccessor
  implements TextPaintListener
{
  public TCamera(ClientContext a)
  {
    a.<init>(a);
  }
  
  public int draw(int a, Graphics a) {
    1; int tmp18_17 = 1;tmp18_17; int tmp20_18 = tmp18_17; int tmp23_22 = 1;tmp23_22;0[tmp23_22] = Integer.valueOf(ctx).camera.x()); int tmp42_20 = tmp20_18; int tmp44_43 = 1; int tmp45_44 = tmp44_43;tmp45_44;tmp44_43[tmp45_44] = Integer.valueOf(ctx).camera.y()); int tmp64_42 = tmp42_20; int tmp67_66 = 1;tmp67_66;2[tmp67_66] = Integer.valueOf(ctx).camera.z());DebugHelper.drawLine(tmp20_18, tmp42_20, String.format(tmp64_42, tmp64_42)); int 
      tmp104_103 = 1;tmp104_103; int tmp110_109 = 1;tmp110_109; int tmp112_110 = tmp110_109; int tmp115_114 = 1;tmp115_114;0[tmp115_114] = Integer.valueOf(ctx).camera.yaw()); int tmp134_112 = tmp112_110; int tmp136_135 = 1; int tmp137_136 = tmp136_135;tmp137_136;tmp136_135[tmp137_136] = Integer.valueOf(ctx).camera.pitch());DebugHelper.drawLine(new Object[tmp104_103], tmp112_110, String.format(tmp134_112, tmp134_112));
    return ++a;
  }
}
