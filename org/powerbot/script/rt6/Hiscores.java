package org.powerbot.script.rt6;

import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.powerbot.script.StringUtils;
import org.powerbot.util.HttpUtils;
import org.powerbot.util.IOUtils;





public class Hiscores
{
  private static final Map<String, Hiscores> cache = new ConcurrentHashMap();
  
  private static final String PAGE = "http://services.runescape.com/m=hiscore/index_lite.ws?player=%s";
  
  private final String username;
  
  private final Map<Stats, SkillStats> skills;
  private final Map<Stats, ActivityStats> activities;
  private final long totalxp;
  private final long updated;
  
  private Hiscores(String arg0)
    throws IOException
  {
    String str = IOUtils.readString(HttpUtils.openStream(new URL(String.format("http://services.runescape.com/m=hiscore/index_lite.ws?player=%s", new Object[] { StringUtils.urlEncode(arg0).replace("+", "%A0") }))));
    
    username = arg0;
    skills = new HashMap();
    activities = new HashMap();
    updated = System.currentTimeMillis();
    long l = 0L;
    
    HashMap localHashMap = new HashMap();
    Object localObject2; for (localObject2 : Stats.values()) {
      localHashMap.put(Integer.valueOf(((Stats)localObject2).ordinal()), localObject2);
    }
    
    ??? = str.split("\n");
    for (??? = 0; ??? < ???.length; ???++) {
      if (localHashMap.containsKey(Integer.valueOf(???))) {
        String[] arrayOfString = ???[???].split(",");
        localObject2 = (Stats)localHashMap.get(Integer.valueOf(???));
        int[] arrayOfInt;
        int k; switch (1.$SwitchMap$org$powerbot$script$rt6$Hiscores$StatsType[localObject2.type().ordinal()]) {
        case 1: 
          if (arrayOfString.length == 3) {
            arrayOfInt = new int[3];
            for (k = 0; k < arrayOfInt.length; k++) {
              try {
                arrayOfInt[k] = Integer.parseInt(arrayOfString[k]);
              } catch (NumberFormatException localNumberFormatException) {
                if ((localObject2 == Stats.OVERALL) && (k == 2)) {
                  arrayOfInt[k] = Integer.MAX_VALUE;
                } else {
                  localNumberFormatException.printStackTrace();
                  break;
                }
              }
              
              if (k == arrayOfInt.length - 1) {
                if (localObject2 == Stats.OVERALL) {
                  try {
                    l = Long.parseLong(arrayOfString[k]);
                  } catch (NumberFormatException localNumberFormatException1) {
                    l = arrayOfInt[2];
                  }
                }
                skills.put(localObject2, new SkillStats((Stats)localObject2, arrayOfInt[1], arrayOfInt[2], arrayOfInt[0]));
              }
            } }
          break;
        

        case 2: 
          if (arrayOfString.length == 2) {
            arrayOfInt = new int[2];
            try {
              for (k = 0; k < arrayOfInt.length; k++) {
                arrayOfInt[k] = Integer.parseInt(arrayOfString[k]);
              }
            } catch (NumberFormatException localNumberFormatException3) {
              continue;
            }
            activities.put(localObject2, new ActivityStats((Stats)localObject2, arrayOfInt[1], arrayOfInt[0]));
          }
          break;
        }
        
      }
    }
    totalxp = l;
  }
  





  public static synchronized Hiscores profile(String arg0)
  {
    arg0 = normaliseUsername(arg0);
    if (cache.containsKey(arg0)) {
      return (Hiscores)cache.get(arg0);
    }
    Hiscores localHiscores = null;
    try {
      localHiscores = new Hiscores(arg0);
    }
    catch (IOException localIOException) {}
    cache.put(arg0, localHiscores);
    return localHiscores;
  }
  





  private static String normaliseUsername(String arg0)
  {
    arg0 = arg0.trim().toLowerCase();
    StringBuilder localStringBuilder = new StringBuilder(arg0.length());
    int i = 1;
    
    for (int j = 0; j < arg0.length(); j++) {
      char c = arg0.charAt(j);
      if (" \t _".indexOf(c) != -1) {
        i = 1;
        localStringBuilder.append(' ');
      } else if (i != 0) {
        i = 0;
        localStringBuilder.append(String.valueOf(c).toUpperCase());
      } else {
        localStringBuilder.append(c);
      }
    }
    
    return localStringBuilder.toString();
  }
  




  public String username()
  {
    return username;
  }
  





  public SkillStats skill(Stats arg0)
  {
    return (SkillStats)skills.get(arg0);
  }
  





  public ActivityStats activity(Stats arg0)
  {
    return (ActivityStats)activities.get(arg0);
  }
  




  public long totalXp()
  {
    return totalxp;
  }
  




  public long updated()
  {
    return updated;
  }
  


  protected void clear()
  {
    cache.clear();
  }
  



  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str = System.getProperty("line.separator");
    localStringBuilder.append(username).append(" (").append(totalxp).append(")").append(str);
    
    for (Iterator localIterator = skills.values().iterator(); localIterator.hasNext();) { localObject = (SkillStats)localIterator.next();
      localStringBuilder.append(" * ").append(((SkillStats)localObject).toString()).append(str);
    }
    Object localObject;
    for (localIterator = activities.values().iterator(); localIterator.hasNext();) { localObject = (ActivityStats)localIterator.next();
      localStringBuilder.append(" * ").append(((ActivityStats)localObject).toString()).append(str);
    }
    
    localStringBuilder.setLength(localStringBuilder.length() - str.length());
    return localStringBuilder.toString();
  }
  


  public static enum StatsType
  {
    SKILL,  ACTIVITY;
    
    private StatsType() {}
  }
  
  public static enum Stats
  {
    OVERALL, 
    ATTACK, 
    DEFENCE, 
    STRENGTH, 
    CONSTITUTION, 
    RANGED, 
    PRAYER, 
    MAGIC, 
    COOKING, 
    WOODCUTTING, 
    FLETCHING, 
    FISHING, 
    FIREMAKING, 
    CRAFTING, 
    SMITHING, 
    MINING, 
    HERBLORE, 
    AGILITY, 
    THIEVING, 
    SLAYER, 
    FARMING, 
    RUNECRAFTING, 
    HUNTER, 
    CONSTRUCTION, 
    SUMMONING, 
    DUNGEONEERING, 
    DIVINATION, 
    BOUNTY_HUNTERS, 
    BOUNTY_HUNTER_ROGUES, 
    DOMINION_TOWER, 
    THE_CRUCIBLE, 
    CASTLE_WARS_GAMES, 
    BA_ATTACKERS, 
    BA_DEFENDERS, 
    BA_COLLECTORS, 
    BA_HEALERS, 
    DUEL_TOURNAMENT, 
    MOBILISING_ARMIES, 
    CONQUEST, 
    FIST_OF_GUTHIX, 
    GG_RESOURCE_RACE, 
    GG_ATHLETICS;
    




    private Stats() {}
    




    public Hiscores.StatsType type()
    {
      return ordinal() > 25 ? Hiscores.StatsType.ACTIVITY : Hiscores.StatsType.SKILL;
    }
  }
  


  public class SkillStats
  {
    public final int level;
    

    public final int xp;
    

    public final int rank;
    

    public final Hiscores.Stats stats;
    

    public SkillStats(Hiscores.Stats arg1, int arg2, int arg3, int arg4)
    {
      stats = arg1;
      level = arg2;
      xp = arg3;
      rank = arg4;
    }
    




    public Hiscores.Stats stats()
    {
      return stats;
    }
    




    public int level()
    {
      return level;
    }
    




    public int totalXp()
    {
      return xp;
    }
    




    public int rank()
    {
      return rank;
    }
    



    public String toString()
    {
      return StringUtils.toDisplayCase(stats.toString()) + ": " + level + " (" + xp + ") #" + rank;
    }
  }
  


  public class ActivityStats
  {
    public final int score;
    

    public final int rank;
    

    public final Hiscores.Stats stats;
    


    public ActivityStats(Hiscores.Stats arg1, int arg2, int arg3)
    {
      stats = arg1;
      score = arg2;
      rank = arg3;
    }
    




    public Hiscores.Stats stats()
    {
      return stats;
    }
    




    public int score()
    {
      return score;
    }
    




    public int rank()
    {
      return rank;
    }
    
    public String toString()
    {
      return StringUtils.toDisplayCase(stats.toString()) + ": " + score + " #" + rank;
    }
  }
}
