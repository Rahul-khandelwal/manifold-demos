package manifold.extensions.java.lang.String;

import manifold.ext.rt.api.Extension;
import manifold.ext.rt.api.Intercept;
import manifold.ext.rt.api.This;

@Extension
public class StringExtensions {

  public static boolean isNullOrBlank(@This String str) {
    return str == null || str.isBlank();
  }

  @Intercept
  public static boolean isEmpty(@This String str) {
    return str == null || str.isEmpty();
  }

  public static void print(@This String str) {
    System.out.println("Custom print for " + str + " is done.");
  }
}
