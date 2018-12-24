package org.powerbot.bot.rt6.client;

import org.powerbot.bot.Reflector;

public class PlayerFacade extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_new = new org.powerbot.bot.Reflector.FieldCache();
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public PlayerFacade(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public Skill[] getSkills() {
    Object[] arrayOfObject;
    if ((arrayOfObject = (Object[])reflector.access(this, new, [Ljava.lang.Object.class)) != null) { int tmp27_26 = 1;;; break label43; throw new Skill[arrayOfObject.length]; } else { 1;1; } label43: int ? = tmp41_40;
    int i; if (arrayOfObject != null) {
      int tmp50_49 = 1;
      
















      for (tmp50_49; (i = tmp50_49) < arrayOfObject.length;) {
        int tmp64_63 = i; int tmp65_64 = tmp64_63;tmp65_64; int tmp67_65 = tmp65_64;tmp67_65.<init>(reflector, arrayOfObject[i]);new org/powerbot/bot/rt6/client/Skill[tmp67_65] = (i++);tmpTernaryOp = i; continue;throw tmp64_63;
      }
    }
    return ?;
  }
  
  public Varpbits getVarpbits() {
    return new Varpbits(reflector, reflector.access(this, void));
  }
}
