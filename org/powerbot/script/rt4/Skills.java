package org.powerbot.script.rt4;

import org.powerbot.bot.rt4.client.Client;

public class Skills
  extends ClientAccessor
{
  public Skills(ClientContext arg0)
  {
    super(arg0);
  }
  






  public int[] exps_at()
  {
    int i = 0;
    int[] arrayOfInt = new int[100];
    for (int j = 1; j < 100; j++) {
      i = (int)(i + Math.floor(j + 300.0D * Math.pow(2.0D, j / 7.0D)));
      arrayOfInt[j] = ((int)Math.floor(i / 4));
    }
    return arrayOfInt;
  }
  







  public int realLevel(int arg0)
  {
    int[] arrayOfInt = realLevels();
    if ((arg0 >= 0) && (arg0 < arrayOfInt.length)) {
      return arrayOfInt[arg0];
    }
    return -1;
  }
  







  public int level(int arg0)
  {
    int[] arrayOfInt = levels();
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
  






  public int[] realLevels()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    int[] arrayOfInt = localClient != null ? localClient.getSkillLevels2() : new int[0];
    return arrayOfInt != null ? arrayOfInt : new int[0];
  }
  





  public int[] levels()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    int[] arrayOfInt = localClient != null ? localClient.getSkillLevels1() : new int[0];
    return arrayOfInt != null ? arrayOfInt : new int[0];
  }
  





  public int[] experiences()
  {
    Client localClient = (Client)((ClientContext)ctx).client();
    int[] arrayOfInt = localClient != null ? localClient.getSkillExps() : new int[0];
    return arrayOfInt != null ? arrayOfInt : new int[0];
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
