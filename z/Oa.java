package z;

import java.io.InputStream;













public abstract class Oa
  extends InputStream
{
  private int jdField_void;
  
  public Oa()
  {
    int tmp7_6 = 1;tmp7_6;0jdField_void = tmp7_6;
  }
  
  public void jdMethod_this(int a) { int tmp3_2 = 1;tmp3_2; if (-1 != tmp3_2) {
      jdField_void += a;
    }
  }
  
  public int jdMethod_this() {
    return jdField_void;
  }
  
  public static String jdMethod_this(Object a)
  {
    int tmp26_23 = (a = (String)a).length();
    int tmp30_29 = 1;
    tmp30_29;
    int j;
    int ? = tmp30_29;
    int k = tmp26_23;
    int tmp40_36 = (j = new char[tmp26_23] - 1);
    tmp40_36;
    int i = 2 << 3;
    (5 << 4 ^ 2 << 1);
    if (tmp40_36 >= 0)
    {
      int tmp50_49 = j;
      j--;
      ?[tmp50_49] = ((char)(a.charAt(tmp50_49) ^ i));
      int tmp71_68 = (j--);
      ?[tmp71_68] = ((char)(a.charAt(tmp71_68) ^ k));
    }
    return new String(?);
  }
}
