package org.powerbot.bot;

import java.util.logging.Logger;
import org.powerbot.bot.rt4.HashTable;
import org.powerbot.script.ClientAccessor;
import org.powerbot.script.ClientContext;
import org.powerbot.script.MessageListener;

public class MessageLogger<C extends ClientContext> extends ClientAccessor<C> implements MessageListener
{
  private static final Logger jdField_void = Logger.getLogger(HashTable.jdMethod_this("Fzxljxnl"));
  
  public MessageLogger(C a) {
    a.<init>(a);
  }
  
  /* Error */
  public void messaged(org.powerbot.script.MessageEvent a)
  {
    // Byte code:
    //   0: getstatic 21	org/powerbot/bot/MessageLogger:void	Ljava/util/logging/Logger;
    //   3: new 23	java/lang/StringBuilder
    //   6: dup
    //   7: invokespecial 26	java/lang/StringBuilder:<init>	()V
    //   10: iconst_0
    //   11: ldc 28
    //   13: invokestatic 34	org/powerbot/script/rt6/CacheVarbitConfig:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   16: invokevirtual 38	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   19: aload_1
    //   20: invokevirtual 44	org/powerbot/script/MessageEvent:type	()I
    //   23: invokevirtual 48	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   26: ldc 50
    //   28: invokestatic 53	org/powerbot/bot/rt4/HashTable:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   31: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: aload_1
    //   35: invokevirtual 60	org/powerbot/script/MessageEvent:source	()Ljava/lang/String;
    //   38: invokevirtual 66	java/lang/String:isEmpty	()Z
    //   41: ifeq +9 -> 50
    //   44: ldc 68
    //   46: goto +30 -> 76
    //   49: athrow
    //   50: new 23	java/lang/StringBuilder
    //   53: dup
    //   54: invokespecial 26	java/lang/StringBuilder:<init>	()V
    //   57: iconst_0
    //   58: aload_1
    //   59: invokevirtual 60	org/powerbot/script/MessageEvent:source	()Ljava/lang/String;
    //   62: invokevirtual 38	java/lang/StringBuilder:insert	(ILjava/lang/String;)Ljava/lang/StringBuilder;
    //   65: ldc 70
    //   67: invokestatic 34	org/powerbot/script/rt6/CacheVarbitConfig:this	(Ljava/lang/Object;)Ljava/lang/String;
    //   70: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   73: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   76: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: aload_1
    //   80: invokevirtual 76	org/powerbot/script/MessageEvent:text	()Ljava/lang/String;
    //   83: invokevirtual 56	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   86: invokevirtual 73	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   89: invokevirtual 82	java/util/logging/Logger:info	(Ljava/lang/String;)V
    //   92: return
    // Line number table:
    //   Java source line #18	-> byte code offset #0
    //   Java source line #19	-> byte code offset #92
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	93	0	a	MessageLogger
    //   0	93	1	a	org.powerbot.script.MessageEvent
  }
}
