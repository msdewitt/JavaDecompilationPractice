package org.powerbot.bot.rt4;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import org.powerbot.bot.Reflector;
import org.powerbot.bot.rt4.client.NodeDeque;

public class NodeQueue
{
  public NodeQueue() {}
  
  public static <E extends org.powerbot.bot.ReflectProxy> List<E> get(NodeDeque a, Class<E> a)
  {
    ArrayList localArrayList = new ArrayList();
    Constructor localConstructor;
    try
    {
      1; int tmp17_16 = 1;tmp17_16; int tmp22_21 = 1;tmp22_21;0[tmp22_21] = Reflector.class; int tmp27_17 = tmp17_16; int tmp29_28 = 1; int tmp30_29 = tmp29_28;tmp30_29;tmp29_28[tmp30_29] = Object.class;localConstructor = tmp27_17.getDeclaredConstructor(tmp27_17);
    } catch (NoSuchMethodException localNoSuchMethodException) {
      return localArrayList; }
    throw a;
    
    throw tmp19_17; org.powerbot.bot.rt4.client.Node localNode; if ((new Class[tmp11_10] == null) || ((localNoSuchMethodException = localNode = a.getSentinel()) == null)) {
      return localArrayList;
    }
    

    try
    {
      1; int tmp108_107 = 1;tmp108_107; int tmp110_108 = tmp108_107; int tmp113_112 = 1;tmp113_112;0[tmp113_112] = reflector; int tmp120_110 = tmp110_108; int tmp122_121 = 1; int tmp123_122 = tmp122_121;tmp123_122;tmp122_121[tmp123_122] = localNode;tmp110_108.add(tmp120_110.newInstance(tmp120_110));tmpTernaryOp = localNode;
    }
    catch (InstantiationException|java.lang.reflect.InvocationTargetException|IllegalAccessException localInstantiationException) {}
    

    return localArrayList;
  }
  
  public static String jdMethod_this(Object a)
  {
    int tmp13_12 = 4;
    int tmp30_27 = (a = (String)a).length();
    int tmp34_33 = 1;
    tmp34_33;
    int j;
    int ? = tmp34_33;
    int k = tmp30_27;
    (j = new char[tmp30_27] - 1);
    int i = tmp13_12 << tmp13_12 ^ (0x2 ^ 0x5) << 1;
    if ((5 << 4 ^ 0x1) >= 0)
    {
      int tmp53_52 = j;
      j--;
      ?[tmp53_52] = ((char)(a.charAt(tmp53_52) ^ i));
      int tmp74_71 = (j--);
      ?[tmp74_71] = ((char)(a.charAt(tmp74_71) ^ k));
    }
    return new String(?);
  }
}
