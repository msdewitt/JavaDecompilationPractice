package org.powerbot.util;

import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import org.powerbot.bot.MouseSpline;
import z.COm8;


































public class AuX
  extends Formatter
{
  public AuX() {}
  
  public String format(LogRecord a)
  {
    return 
      a.getLevel().getLocalizedName() + MouseSpline.jdMethod_this("3\035") + a.getLoggerName() + COm8.jdMethod_this("\030b") + a.getMessage();
  }
}
