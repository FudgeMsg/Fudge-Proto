// Automatically created - do not modify
/* fileheader.java.include
 *
 * This file is part of the Java unit test generated output.
 */
// Created from enums.proto:26(7)
package org.fudgemsg.proto.tests.enums;
public enum StringAliasAssumed {
  ZERO ("zero"),
  ONE ("1"),
  TWO ("2"),
  THREE ("3");
  private final String _fudgeEncoding;
  private StringAliasAssumed (final String fudgeEncoding) {
    _fudgeEncoding = fudgeEncoding;
  }
  public String getFudgeEncoding () {
    return _fudgeEncoding;
  }
  public static StringAliasAssumed fromFudgeEncoding (final String fudgeEncoding) {
    if (fudgeEncoding.equals ("zero")) return ZERO;
    if (fudgeEncoding.equals ("1")) return ONE;
    if (fudgeEncoding.equals ("2")) return TWO;
    if (fudgeEncoding.equals ("3")) return THREE;
    throw new IllegalArgumentException ("field is not a StringAliasAssumed - invalid value '" + fudgeEncoding + "'");
  }
}
/* filefooter.java.include
 *
 * This file is part of the Java unit test generated output.
 */
