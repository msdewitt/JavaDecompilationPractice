package org.powerbot.bot.rt4.client;

import org.powerbot.bot.Reflector;

public class HashTable extends org.powerbot.bot.ReflectProxy
{
  private static final org.powerbot.bot.Reflector.FieldCache jdField_new = new org.powerbot.bot.Reflector.FieldCache();
  private static final org.powerbot.bot.Reflector.FieldCache jdField_void = new org.powerbot.bot.Reflector.FieldCache();
  
  public HashTable(Reflector arg0, Object arg1) {
    super(arg0, arg1);
  }
  
  public Node[] getBuckets() {
    Object[] arrayOfObject;
    if ((arrayOfObject = (Object[])reflector.access(this, new, [Ljava.lang.Object.class)) != null) { int tmp27_26 = 1;;; break label34; throw new Node[arrayOfObject.length]; } label34: Node[] arrayOfNode = null;
    int i; if (arrayOfObject != null) {
      int tmp41_40 = 1;
      
















      for (tmp41_40; (i = tmp41_40) < arrayOfObject.length;) {
        int tmp55_54 = i; int tmp56_55 = tmp55_54;tmp56_55; int tmp58_56 = tmp56_55;tmp58_56.<init>(reflector, arrayOfObject[i]);new org/powerbot/bot/rt4/client/Node[tmp58_56] = (i++);tmpTernaryOp = i; continue;throw tmp55_54;
      }
    }
    return arrayOfNode;
  }
  
  public int getSize() {
    return reflector.accessInt(this, void);
  }
}
