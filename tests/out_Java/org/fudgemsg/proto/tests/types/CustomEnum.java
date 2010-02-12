// Automatically created - do not modify
// Created from types.proto:10(7)
package org.fudgemsg.proto.tests.types;
public enum CustomEnum {
  THIRD (3),
  FOURTH (4),
  SECOND (2),
  FIRST (1);
  private final int _fudgeEncoding;
  private CustomEnum (final int fudgeEncoding) {
    _fudgeEncoding = fudgeEncoding;
  }
  public int getFudgeEncoding () {
    return _fudgeEncoding;
  }
  public static CustomEnum fromFudgeEncoding (final int fudgeEncoding) {
    switch (fudgeEncoding) {
      case 3 : return THIRD;
      case 4 : return FOURTH;
      case 2 : return SECOND;
      case 1 : return FIRST;
      default : throw new IllegalArgumentException ("Field is not a CustomEnum - invalid value '" + fudgeEncoding + "'");
    }
  }
}
