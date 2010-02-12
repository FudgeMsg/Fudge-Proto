// Automatically created - do not modify
// Created from binding.proto:21(6)
package org.fudgemsg.proto.tests.binding;
public enum BindingEnum {
  APPLE (0),
  BANANA (1);
  private final int _fudgeEncoding;
  private BindingEnum (final int fudgeEncoding) {
    _fudgeEncoding = fudgeEncoding;
  }
  public int getFudgeEncoding () {
    return _fudgeEncoding;
  }
  public static BindingEnum fromFudgeEncoding (final int fudgeEncoding) {
    switch (fudgeEncoding) {
      case 0 : return APPLE;
      case 1 : return BANANA;
      default : throw new IllegalArgumentException ("Field is not a BindingEnum - invalid value '" + fudgeEncoding + "'");
    }
  }
  	      public static void foo () {
	      }
}
