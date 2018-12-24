package org.powerbot.bot.rt6;

import java.awt.Graphics;
import org.powerbot.bot.DebugHelper;
import org.powerbot.script.rt6.Camera;
import org.powerbot.script.rt6.ClientContext;

public class TCamera implements org.powerbot.script.TextPaintListener
{
  private final ClientContext jdField_void;
  
  public TCamera(ClientContext a)
  {
    jdField_void = a;
  }
  
  public int draw(int a, Graphics a) {
    DebugHelper.drawLine(a, new StringBuilder(), jdField_void.camera.yaw());
    DebugHelper.drawLine(a, new StringBuilder(), jdField_void.camera.pitch());
    return a;
  }
}
