// Automatically created - do not modify
// Created from enums.proto:12(7)
package org.fudgemsg.proto.tests.enums;
public enum IntegerAssumed2 {
  ZERO (0),
  ONE (1),
  TWO (2),
  THREE (3);
  private final int _fudgeEncoding;
  private IntegerAssumed2 (final int fudgeEncoding) {
    _fudgeEncoding = fudgeEncoding;
  }
  public int getFudgeEncoding () {
    return _fudgeEncoding;
  }
  public static IntegerAssumed2 fromFudgeEncoding (final int fudgeEncoding) {
    switch (fudgeEncoding) {
      case 0 : return ZERO;
      case 1 : return ONE;
      case 2 : return TWO;
      case 3 : return THREE;
      default : throw new IllegalArgumentException ("field is not a IntegerAssumed2 - invalid value '" + fudgeEncoding + "'");
    }
  }
}
