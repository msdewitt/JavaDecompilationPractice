package org.powerbot.bot.rt6;

import java.util.concurrent.atomic.AtomicInteger;
import org.powerbot.script.PollingScript;
import org.powerbot.script.rt6.ClientAccessor;
import org.powerbot.script.rt6.ClientContext;

public class Antipattern extends PollingScript<ClientContext>
{
  private final Module[] jdField_void;
  
  public Antipattern()
  {
    1; int tmp13_12 = 1;tmp13_12; int tmp18_17 = 1;tmp18_17;0[tmp18_17] = new ExaminePattern((ClientContext)ctx); int tmp37_36 = 1; int tmp38_37 = tmp37_36;tmp38_37;tmp37_36[tmp38_37] = new CameraPattern((ClientContext)ctx); int tmp55_13 = tmp13_12; int tmp58_57 = 1;tmp58_57;2[tmp58_57] = new WindowPattern((ClientContext)ctx);5513jdField_void = tmp55_13;
  }
  
  /* Error */
  public void poll()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 21	org/powerbot/bot/rt6/Antipattern:ctx	Lorg/powerbot/script/ClientContext;
    //   4: checkcast 23	org/powerbot/script/rt6/ClientContext
    //   7: getfield 41	org/powerbot/script/rt6/ClientContext:properties	Ljava/util/Properties;
    //   10: ldc 43
    //   12: invokestatic 49	z/A:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   15: ldc 51
    //   17: invokevirtual 57	java/util/Properties:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   20: ldc 59
    //   22: invokestatic 62	org/powerbot/script/Vector3:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   25: invokevirtual 68	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   28: ifeq +5 -> 33
    //   31: return
    //   32: athrow
    //   33: aload_0
    //   34: getfield 34	org/powerbot/bot/rt6/Antipattern:void	[Lorg/powerbot/bot/rt6/Antipattern$Module;
    //   37: dup
    //   38: astore_1
    //   39: arraylength
    //   40: istore_2
    //   41: iconst_0
    //   42: iconst_1
    //   43: dup
    //   44: pop2
    //   45: dup
    //   46: istore_3
    //   47: iload_2
    //   48: if_icmpge +28 -> 76
    //   51: aload_1
    //   52: iload_3
    //   53: aaload
    //   54: dup
    //   55: astore 4
    //   57: invokevirtual 72	org/powerbot/bot/rt6/Antipattern$Module:isTick	()Z
    //   60: ifeq +8 -> 68
    //   63: aload 4
    //   65: invokevirtual 75	org/powerbot/bot/rt6/Antipattern$Module:run	()V
    //   68: iinc 3 1
    //   71: iload_3
    //   72: goto -25 -> 47
    //   75: athrow
    //   76: return
    // Line number table:
    //   Java source line #23	-> byte code offset #0
    //   Java source line #24	-> byte code offset #31
    //   Java source line #26	-> byte code offset #33
    //   Java source line #27	-> byte code offset #57
    //   Java source line #28	-> byte code offset #63
    //   Java source line #26	-> byte code offset #68
    //   Java source line #31	-> byte code offset #76
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	a	Antipattern
  }
  
  public static abstract class Module
    extends ClientAccessor
    implements Runnable
  {
    protected final AtomicInteger jdField_new;
    private long jdField_void = 0L; public Module(ClientContext a) { a.<init>(a);
      a; int tmp22_21 = 1;tmp22_21;30.<init>(tmp22_21);jdField_new = a;new java/util/concurrent/atomic/AtomicInteger
        .isTick();
    }
    
    public boolean isTick() {
      if ((jdField_void != 0L) && (System.nanoTime() > jdField_void)) { int tmp21_20 = 1; int tmp22_21 = tmp21_20;;; break label32; throw tmp21_20; } else { 1; } label32: int i = tmp30_29;
      int tmp48_47 = 1;tmp48_47;nanoTimejdField_void = (jdField_new.get() + (60 * tmp48_47 * 1.0E9D * org.powerbot.script.Random.nextDouble(1.0D, 3.0D)));
      return a;
    }
    
    public boolean isAggressive() {
      if (System.currentTimeMillis() % 5L == 0L) { int tmp13_12 = 1; int tmp14_13 = tmp13_12;tmp14_13;return tmp14_13;throw tmp13_12; } int tmp20_19 = 1;tmp20_19;return tmp20_19;
    }
    
    public boolean isStateful() {
      if (!a.isAggressive()) { int tmp8_7 = 1; int tmp9_8 = tmp8_7;tmp9_8;return tmp9_8;throw tmp8_7; } int tmp15_14 = 1;tmp15_14;return tmp15_14;
    }
  }
}
