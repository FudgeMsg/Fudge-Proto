// Automatically created - do not modify
// Created from taxonomy.proto:5(10)
package org.fudgemsg.proto.tests.taxon;
public class Fruit extends org.fudgemsg.taxon.MapFudgeTaxonomy {
  public static final org.fudgemsg.taxon.FudgeTaxonomy INSTANCE = new Fruit ();
  public static final String STR_APPLE = "APPLE";
  public static final short VAL_APPLE = 1;
  public static final String STR_PEAR = "PEAR";
  public static final short VAL_PEAR = 3;
  public static final String STR_BANANA = "BANANA";
  public static final short VAL_BANANA = 2;
  private Fruit () {
    super (new int[] { VAL_APPLE, VAL_PEAR, VAL_BANANA }, new String[] { STR_APPLE, STR_PEAR, STR_BANANA });
  }
}
