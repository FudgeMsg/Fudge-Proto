// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from enums.proto:5(7)
package org.fudgemsg.proto.tests.enums;
public enum IntegerAssumed1 {
  ZERO (0),
  ONE (1),
  TWO (2),
  THREE (3);
  private final int _fudgeEncoding;
  private IntegerAssumed1 (final int fudgeEncoding) {
    _fudgeEncoding = fudgeEncoding;
  }
  public int getFudgeEncoding () {
    return _fudgeEncoding;
  }
  public static IntegerAssumed1 fromFudgeEncoding (final int fudgeEncoding) {
    switch (fudgeEncoding) {
      case 0 : return ZERO;
      case 1 : return ONE;
      case 2 : return TWO;
      case 3 : return THREE;
      default : throw new IllegalArgumentException ("field is not a IntegerAssumed1 - invalid value '" + fudgeEncoding + "'");
    }
  }
}
/* filefooter.java.include
 *
 * This file is part of the Java unit test generated output.
 */
