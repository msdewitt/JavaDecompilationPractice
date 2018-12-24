package org.powerbot.script.rt6;

import org.powerbot.bot.rt6.client.Client;
import org.powerbot.bot.rt6.client.PlayerFacade;
import org.powerbot.bot.rt6.client.Skill;

public class Skills
  extends ClientAccessor
{
  public Skills(ClientContext arg0)
  {
    super(arg0);
  }
  





  public int level(int arg0)
  {
    int[] arrayOfInt = levels();
    if ((arg0 >= 0) && (arg0 < arrayOfInt.length)) {
      return arrayOfInt[arg0];
    }
    return -1;
  }
  





  public int realLevel(int arg0)
  {
    int[] arrayOfInt = realLevels();
    if ((arg0 >= 0) && (arg0 < arrayOfInt.length)) {
      return arrayOfInt[arg0];
    }
    return -1;
  }
  





  public int experience(int arg0)
  {
    int[] arrayOfInt = experiences();
    if ((arg0 >= 0) && (arg0 < arrayOfInt.length)) {
      return arrayOfInt[arg0];
    }
    return -1;
  }
  
  public int[] levels() {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return new int[0];
    }
    PlayerFacade localPlayerFacade = localClient.getPlayerFacade();
    Skill[] arrayOfSkill;
    if ((localPlayerFacade == null) || ((arrayOfSkill = localPlayerFacade.getSkills()) == null)) {
      return new int[0];
    }
    int[] arrayOfInt = new int[arrayOfSkill.length];
    for (int i = 0; i < arrayOfSkill.length; i++) {
      Skill localSkill = arrayOfSkill[i];
      if (!localSkill.isNull()) {
        arrayOfInt[i] = localSkill.getEffectiveLevel();
      }
    }
    return arrayOfInt;
  }
  
  public int[] realLevels() {
    int[] arrayOfInt1 = experiences();
    int[] arrayOfInt2 = new int[arrayOfInt1.length];
    for (int i = 0; i < arrayOfInt1.length; i++) {
      arrayOfInt2[i] = levelAt(arrayOfInt1[i]);
    }
    return arrayOfInt2;
  }
  
  public int[] experiences() {
    Client localClient = (Client)((ClientContext)ctx).client();
    if (localClient == null) {
      return new int[0];
    }
    PlayerFacade localPlayerFacade = localClient.getPlayerFacade();
    Skill[] arrayOfSkill;
    if ((localPlayerFacade == null) || ((arrayOfSkill = localPlayerFacade.getSkills()) == null)) {
      return new int[0];
    }
    int[] arrayOfInt = new int[arrayOfSkill.length];
    for (int i = 0; i < arrayOfSkill.length; i++) {
      Skill localSkill = arrayOfSkill[i];
      if (!localSkill.isNull()) {
        arrayOfInt[i] = localSkill.getExperience();
      }
    }
    return arrayOfInt;
  }
  





  public int levelAt(int arg0)
  {
    for (int i = Constants.SKILLS_XP.length - 1; i > 0; i--) {
      if (arg0 > Constants.SKILLS_XP[i]) {
        return i;
      }
    }
    return 1;
  }
  





  public int experienceAt(int arg0)
  {
    if ((arg0 < 0) || (arg0 > 120)) {
      return -1;
    }
    return Constants.SKILLS_XP[arg0];
  }
}
