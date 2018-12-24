package org.powerbot.script;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;






public class StringUtils
{
  public StringUtils() {}
  
  public static String stripHtml(String arg0)
  {
    return arg0.replaceAll("\\<.*?\\>", "");
  }
  






  public static String toDisplayCase(String arg0)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 1;
    
    for (char c : arg0.toCharArray()) {
      c = i != 0 ? Character.toUpperCase(c) : Character.toLowerCase(c);
      localStringBuilder.append(c);
      i = " '-_/".indexOf(c) >= 0 ? 1 : 0;
    }
    
    return localStringBuilder.toString();
  }
  




  public static int parseInt(String arg0)
  {
    try
    {
      return Integer.parseInt(arg0.trim().replace(",", ""));
    }
    catch (NumberFormatException localNumberFormatException) {}
    return -1;
  }
  





  public static String urlEncode(String arg0)
  {
    if (arg0 == null) {
      return null;
    }
    try {
      return URLEncoder.encode(arg0, "UTF-8");
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {}
    return arg0;
  }
  






  public static String urlDecode(String arg0)
  {
    try
    {
      return URLDecoder.decode(arg0, "UTF-8");
    } catch (Exception localException) {}
    return arg0;
  }
  





  public static byte[] getBytesUtf8(String arg0)
  {
    try
    {
      return arg0.getBytes("UTF-8");
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      throw new IllegalStateException(localUnsupportedEncodingException);
    }
  }
  





  public static String newStringUtf8(byte[] arg0)
  {
    if (arg0 == null) {
      return null;
    }
    try {
      return new String(arg0, "UTF-8");
    } catch (UnsupportedEncodingException localUnsupportedEncodingException) {
      throw new IllegalStateException(localUnsupportedEncodingException);
    }
  }
  





  public static String byteArrayToHexString(byte[] arg0)
  {
    StringBuilder localStringBuilder = new StringBuilder(arg0.length * 2);
    for (int k : arg0) {
      localStringBuilder.append(Integer.toString((k & 0xFF) + 256, 16).substring(1));
    }
    return localStringBuilder.toString();
  }
  





  public static byte[] hexStringToByteArray(String arg0)
  {
    int i = arg0.length();
    byte[] arrayOfByte = new byte[i / 2];
    for (int j = 0; j < i; j += 2) {
      arrayOfByte[(j / 2)] = ((byte)((Character.digit(arg0.charAt(j), 16) << 4) + Character.digit(arg0.charAt(j + 1), 16)));
    }
    return arrayOfByte;
  }
}
