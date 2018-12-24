package org.powerbot.script.rt4;

public class HintArrow
{
  public HintArrow() {}
  
  public static String jdMethod_this(Object s)
  {
    int tmp11_10 = 1;
    int tmp30_27 = (s = (String)s).length();
    int tmp34_33 = 1;
    tmp34_33;
    int j;
    int ? = tmp34_33;
    int k = tmp30_27;
    (j = new char[tmp30_27] - 1);
    int i = (0x2 ^ 0x5) << 4 ^ 0x1;
    if (((0x3 ^ 0x5) << 4 ^ tmp11_10 << tmp11_10) >= 0)
    {
      int tmp53_52 = j;
      j--;
      ?[tmp53_52] = ((char)(s.charAt(tmp53_52) ^ i));
      int tmp74_71 = (j--);
      ?[tmp74_71] = ((char)(s.charAt(tmp74_71) ^ k));
    }
    return new String(?);
  }
}
