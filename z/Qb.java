package z;








public class Qb
{
  public static final int jdField_do = 0;
  






  public static final int const = 1;
  






  public static final int jdField_short = 16;
  






  public static final int jdField_try = 17;
  






  public static final int jdField_false = 18;
  






  public static final int jdField_catch = 19;
  






  public static final int jdField_goto = 20;
  






  public static final int jdField_break = 21;
  






  public static final int jdField_char = 22;
  






  public static final int jdField_true = 23;
  






  public static final int jdField_case = 64;
  






  public static final int jdField_for = 65;
  






  public static final int jdField_long = 66;
  






  public static final int jdField_int = 67;
  






  public static final int jdField_super = 68;
  





  public static final int jdField_final = 69;
  





  public static final int jdField_enum = 70;
  





  public static final int jdField_else = 71;
  





  public static final int jdField_if = 72;
  





  public static final int jdField_null = 73;
  





  public static final int jdField_byte = 74;
  





  public static final int jdField_new = 75;
  





  private int jdField_void;
  






  public Qb(int a)
  {
    jdField_void = a;
  }
  












  public static Qb jdMethod_null(int a)
  {
    int tmp8_7 = 1;tmp8_7;a.<init>(24 << tmp8_7);return new z/Qb;
  }
  










  public static Qb jdMethod_true(int a, int a)
  {
    int tmp8_7 = 1;tmp8_7; int tmp15_14 = 1;tmp15_14;(24 << tmp8_7).<init>(a | 16 << tmp15_14);return a;
  }
  














  public static Qb jdMethod_this(int a, int a, int a)
  {
    int tmp8_7 = 1;tmp8_7; int tmp15_14 = 1;tmp15_14; int tmp23_22 = 1;tmp23_22;(a | 16 << tmp15_14).<init>(a | 8 << tmp23_22);return 24 << tmp8_7;
  }
  









  public static Qb jdMethod_for(int a)
  {
    a &= 0xFFFF; int 
      tmp15_14 = 1;tmp15_14;268435456.<init>(a | 8 << tmp15_14);return new z/Qb;
  }
  







  public static Qb jdMethod_catch(int a)
  {
    int tmp10_9 = 1;tmp10_9;369098752.<init>(a | 16 << tmp10_9);return new z/Qb;
  }
  









  public static Qb jdMethod_true(int a)
  {
    int tmp10_9 = 1;tmp10_9;385875968.<init>(a | 8 << tmp10_9);return new z/Qb;
  }
  









  public static Qb jdMethod_this(int a)
  {
    int tmp10_9 = 1;tmp10_9;1107296256.<init>(a | 8 << tmp10_9);return new z/Qb;
  }
  



















  public static Qb jdMethod_this(int a, int a)
  {
    int tmp8_7 = 1;tmp8_7;a.<init>(24 << tmp8_7 | a);return new z/Qb;
  }
  

























  public int jdMethod_final()
  {
    int tmp7_6 = 1;tmp7_6;return 24 >>> tmp7_6;
  }
  









  public int jdMethod_false()
  {
    int tmp10_9 = 1;tmp10_9;return 16 >> tmp10_9;
  }
  








  public int jdMethod_void()
  {
    int tmp10_9 = 1;tmp10_9;return 8 >> tmp10_9;
  }
  








  public int jdMethod_enum()
  {
    int tmp10_9 = 1;tmp10_9;return (short)(8 >> tmp10_9);
  }
  






  public int jdMethod_null()
  {
    int tmp10_9 = 1;tmp10_9;return 16 >> tmp10_9;
  }
  






  public int jdMethod_for()
  {
    int tmp10_9 = 1;tmp10_9;return 8 >> tmp10_9;
  }
  







  public int jdMethod_catch()
  {
    int tmp10_9 = 1;tmp10_9;return 8 >> tmp10_9;
  }
  











  public int jdMethod_true()
  {
    int tmp8_7 = 1;tmp8_7;return 0xFF & tmp8_7;
  }
  





  public int jdMethod_this()
  {
    return jdField_void;
  }
  
  public static String jdMethod_this(Object a)
  {
    int tmp9_8 = 2;
    int tmp28_25 = (a = (String)a).length();
    int tmp32_31 = 1;
    tmp32_31;
    int j;
    int ? = tmp32_31;
    int k = tmp28_25;
    (j = new char[tmp28_25] - 1);
    int i = 4 << 3 ^ 0x5;
    if ((5 << 4 ^ tmp9_8 << tmp9_8 ^ 0x3) >= 0)
    {
      int tmp51_50 = j;
      j--;
      ?[tmp51_50] = ((char)(a.charAt(tmp51_50) ^ i));
      int tmp72_69 = (j--);
      ?[tmp72_69] = ((char)(a.charAt(tmp72_69) ^ k));
    }
    return new String(?);
  }
}
