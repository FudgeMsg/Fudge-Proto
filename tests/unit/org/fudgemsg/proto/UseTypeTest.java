/* Copyright 2009 by OpenGamma Inc and other contributors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.fudgemsg.proto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import java.io.File;
import java.util.Arrays;

import org.fudgemsg.FudgeContext;
import org.fudgemsg.FudgeMsg;
import org.fudgemsg.tests.TypeTest;
import org.fudgemsg.tests.SubMessage;

public class UseTypeTest {
  
  private void compareSubMessage (final SubMessage object1, final SubMessage object2) {
    if ((object1 == null) && (object2 == null)) return;
    assertNotNull (object1);
    assertNotNull (object2);
    assertSame (object1.getI (), object2.getI ());
    assertSame (object1.getS (), object2.getS ());
  }
  
  private void compareTypetest (final TypeTest object1, final TypeTest object2) {
    if ((object1 == null) && (object2 == null)) return;
    assertNotNull (object1);
    assertNotNull (object2);
    // single variables
    assertSame (object1.getSBool (), object2.getSBool ());
    assertSame (object1.getSByte (), object2.getSByte ());
    assertSame (object1.getSDouble (), object2.getSDouble ());
    assertSame (object1.getSFloat (), object2.getSFloat ());
    assertSame (object1.getSIndicator (), object2.getSIndicator ());
    assertSame (object1.getSInt (), object2.getSInt ());
    assertSame (object1.getSLong (), object2.getSLong ());
    assertSame (object1.getSShort (), object2.getSShort ());
    assertSame (object1.getSString (), object2.getSString ());
    compareSubMessage (object1.getSSubMessage (), object2.getSSubMessage ());
    assertSame (object1.getSCustomEnum (), object2.getSCustomEnum ());
    // arrays
    assertEquals (Arrays.equals (object1.getABool (), object2.getABool ()), true);
    assertEquals (Arrays.equals (object1.getAByte (), object2.getAByte ()), true);
    assertEquals (Arrays.equals (object1.getADouble (), object2.getADouble ()), true);
    assertEquals (Arrays.equals (object1.getAFloat (), object2.getAFloat ()), true);
    assertEquals (Arrays.equals (object1.getAIndicator (), object2.getAIndicator ()), true);
    assertEquals (Arrays.equals (object1.getAInt (), object2.getAInt ()), true);
    assertEquals (Arrays.equals (object1.getALong (), object2.getALong ()), true);
    assertEquals (Arrays.equals (object1.getAString (), object2.getAString ()), true);
    assertEquals (Arrays.equals (object1.getASubMessage (), object2.getASubMessage ()), true);
    assertEquals (Arrays.equals (object1.getACustomEnum (), object2.getACustomEnum ()), true);
    int n, i;
    // repeated single variables
    assertEquals (n = object1.getRsBoolCount (), object2.getRsBoolCount ());
    for (i = 0; i < n; i++) {
      assertEquals (object1.getRsBool (i), object2.getRsBool (i));
    }
    assertEquals (n = object1.getRsByteCount (), object2.getRsByteCount ());
    for (i = 0; i < n; i++) {
      assertEquals (object1.getRsByte (i), object2.getRsByte (i));
    }
    assertEquals (n = object1.getRsDoubleCount (), object2.getRsDoubleCount ());
    for (i = 0; i < n; i++) {
      assertEquals (object1.getRsDouble (i), object2.getRsDouble (i));
    }
    assertEquals (n = object1.getRsFloatCount (), object2.getRsFloatCount ());
    for (i = 0; i < n; i++) {
      assertEquals (object1.getRsFloat (i), object2.getRsFloat (i));
    }
    assertEquals (n = object1.getRsIndicatorCount (), object2.getRsIndicatorCount ());
    for (i = 0; i < n; i++) {
      assertEquals (object1.getRsIndicator (i), object2.getRsIndicator (i));
    }
    assertEquals (n = object1.getRsIntCount (), object2.getRsIntCount ());
    for (i = 0; i < n; i++) {
      assertEquals (object1.getRsInt (i), object2.getRsInt (i));
    }
    assertEquals (n = object1.getRsLongCount (), object2.getRsLongCount ());
    for (i = 0; i < n; i++) {
      assertEquals (object1.getRsLong (i), object2.getRsLong (i));
    }
    assertEquals (n = object1.getRsShortCount (), object2.getRsShortCount ());
    for (i = 0; i < n; i++) {
      assertEquals (object1.getRsShort (i), object2.getRsShort (i));
    }
    assertEquals (n = object1.getRsStringCount (), object2.getRsStringCount ());
    for (i = 0; i < n; i++) {
      assertEquals (object1.getRsString (i), object2.getRsString (i));
    }
    assertEquals (n = object1.getRsSubMessageCount (), object2.getRsSubMessageCount ());
    for (i = 0; i < n; i++) {
      assertEquals (object1.getRsSubMessage (i), object2.getRsSubMessage (i));
    }
    assertEquals (n = object1.getRsCustomEnumCount (), object2.getRsCustomEnumCount ());
    for (i = 0; i < n; i++) {
      assertEquals (object1.getRsCustomEnum (i), object2.getRsCustomEnum (i));
    }
    // repeated arrays
    assertEquals (n = object1.getRaBoolCount (), object2.getRaBoolCount ());
    for (i = 0; i < n; i++) {
      assertEquals (Arrays.equals (object1.getRaBool (i), object2.getRaBool (i)), true);
    }
    assertEquals (n = object1.getRaByteCount (), object2.getRaByteCount ());
    for (i = 0; i < n; i++) {
      assertEquals (Arrays.equals (object1.getRaByte (i), object2.getRaByte (i)), true);
    }
    assertEquals (n = object1.getRaDoubleCount (), object2.getRaDoubleCount ());
    for (i = 0; i < n; i++) {
      assertEquals (Arrays.equals (object1.getRaDouble (i), object2.getRaDouble (i)), true);
    }
    assertEquals (n = object1.getRaFloatCount (), object2.getRaFloatCount ());
    for (i = 0; i < n; i++) {
      assertEquals (Arrays.equals (object1.getRaFloat (i), object2.getRaFloat (i)), true);
    }
    assertEquals (n = object1.getRaIndicatorCount (), object2.getRaIndicatorCount ());
    for (i = 0; i < n; i++) {
      assertEquals (Arrays.equals (object1.getRaIndicator (i), object2.getRaIndicator (i)), true);
    }
    assertEquals (n = object1.getRaIntCount (), object2.getRaIntCount ());
    for (i = 0; i < n; i++) {
      assertEquals (Arrays.equals (object1.getRaInt (i), object2.getRaInt (i)), true);
    }
    assertEquals (n = object1.getRaLongCount (), object2.getRaLongCount ());
    for (i = 0; i < n; i++) {
      assertEquals (Arrays.equals (object1.getRaLong (i), object2.getRaLong (i)), true);
    }
    assertEquals (n = object1.getRaShortCount (), object2.getRaShortCount ());
    for (i = 0; i < n; i++) {
      assertEquals (Arrays.equals (object1.getRaShort (i), object2.getRaShort (i)), true);
    }
    assertEquals (n = object1.getRaStringCount (), object2.getRaStringCount ());
    for (i = 0; i < n; i++) {
      assertEquals (Arrays.equals (object1.getRaString (i), object2.getRaString (i)), true);
    }
    assertEquals (n = object1.getRaSubMessageCount (), object2.getRaSubMessageCount ());
    for (i = 0; i < n; i++) {
      assertEquals (Arrays.equals (object1.getRaSubMessage (i), object2.getRaSubMessage (i)), true);
    }
    assertEquals (n = object1.getRaCustomEnumCount (), object2.getRaCustomEnumCount ());
    for (i = 0; i < n; i++) {
      assertEquals (Arrays.equals (object1.getRaCustomEnum (i), object2.getRaCustomEnum (i)), true);
    }
    // arrays of arrays
    boolean[][] aaBool1 = object1.getAaBool (), aaBool2 = object2.getAaBool ();
    assertEquals (n = aaBool1.length, aaBool2.length);
    for (i = 0; i < n; i++) {
      assertEquals (Arrays.equals (aaBool1[i], aaBool2[i]), true);
    }
    byte[][] aaByte1 = object1.getAaByte (), aaByte2 = object2.getAaByte ();
    assertEquals (n = aaByte1.length, aaByte2.length);
    for (i = 0; i < n; i++) {
      assertEquals (Arrays.equals (aaByte1[i], aaByte2[i]), true);
    }
    double[][] aaDouble1 = object1.getAaDouble (), aaDouble2 = object2.getAaDouble ();
    assertEquals (n = aaDouble1.length, aaDouble2.length);
    for (i = 0; i < n; i++) {
      assertEquals (Arrays.equals (aaDouble1[i], aaDouble2[i]), true);
    }
    float[][] aaFloat1 = object1.getAaFloat (), aaFloat2 = object2.getAaFloat ();
    assertEquals (n = aaFloat1.length, aaFloat2.length);
    for (i = 0; i < n; i++) {
      assertEquals (Arrays.equals (aaFloat1[i], aaFloat2[i]), true);
    }
    boolean[][] aaIndicator1 = object1.getAaIndicator (), aaFloat2 = object2.getAaIndicator ();
    assertEquals (n = aaIndicator1.length, aaIndicator2.length);
    public boolean[][] getAaIndicator () {
      return _aaIndicator;
    }
    public int[][] getAaInt () {
      return _aaInt;
    }
    public long[][] getAaLong () {
      return _aaLong;
    }
    public short[][] getAaShort () {
      return _aaShort;
    }
    public String[][] getAaString () {
      return _aaString;
    }
    public org.fudgemsg.tests.SubMessage[][] getAaSubMessage () {
      return _aaSubMessage;
    }
    public org.fudgemsg.tests.CustomEnum[][] getAaCustomEnum () {
      return _aaCustomEnum;
    }
  }
  
  @Test
  public void builderDefaultValues () {
    final FudgeContext context = new FudgeContext ();
    final TypeTest object = new TypeTest.Builder ().build ();
    final FudgeMsg message = object.toFudgeMsg (context);
    System.out.println (message.toString ());
    final TypeTest object2 = TypeTest.fromFudgeMsg (message);
    compareTypetest (object, object2);
  }
  
}