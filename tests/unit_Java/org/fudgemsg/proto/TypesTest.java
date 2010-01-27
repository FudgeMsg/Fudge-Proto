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

import java.util.Arrays;

import org.fudgemsg.FudgeContext;
import org.fudgemsg.FudgeFieldContainer;
import org.fudgemsg.proto.tests.types.CustomEnum;
import org.fudgemsg.proto.tests.types.SubMessage;
import org.fudgemsg.proto.tests.types.Types;
import org.junit.Test;

public class TypesTest {
  
  private void compareSubMessage (final SubMessage object1, final SubMessage object2) {
    if ((object1 == null) && (object2 == null)) return;
    assertNotNull (object1);
    assertNotNull (object2);
    assertEquals (object1.getI (), object2.getI ());
    assertEquals (object1.getS (), object2.getS ());
  }
  
  private void compareTypes (final Types object1, final Types object2) {
    if ((object1 == null) && (object2 == null)) return;
    assertNotNull (object1);
    assertNotNull (object2);
    // single variables
    assertEquals (object1.getSBool (), object2.getSBool ());
    assertEquals (object1.getSByte (), object2.getSByte ());
    assertEquals (object1.getSDouble (), object2.getSDouble (), 0);
    assertEquals (object1.getSFloat (), object2.getSFloat (), 0);
    assertEquals (object1.getSIndicator (), object2.getSIndicator ());
    assertEquals (object1.getSInt (), object2.getSInt ());
    assertEquals (object1.getSLong (), object2.getSLong ());
    assertEquals (object1.getSShort (), object2.getSShort ());
    assertEquals (object1.getSString (), object2.getSString ());
    compareSubMessage (object1.getSSubMessage (), object2.getSSubMessage ());
    assertEquals (object1.getSCustomEnum (), object2.getSCustomEnum ());
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
    if ((aaBool1 != null) || (aaBool2 != null)) {
      assertNotNull (aaBool1);
      assertNotNull (aaBool2);
      assertEquals (n = aaBool1.length, aaBool2.length);
      for (i = 0; i < n; i++) {
        assertEquals (Arrays.equals (aaBool1[i], aaBool2[i]), true);
      }
    }
    byte[][] aaByte1 = object1.getAaByte (), aaByte2 = object2.getAaByte ();
    if ((aaByte1 != null) || (aaByte2 != null)) {
      assertNotNull (aaByte1);
      assertNotNull (aaByte2);
      assertEquals (n = aaByte1.length, aaByte2.length);
      for (i = 0; i < n; i++) {
        assertEquals (Arrays.equals (aaByte1[i], aaByte2[i]), true);
      }
    }
    double[][] aaDouble1 = object1.getAaDouble (), aaDouble2 = object2.getAaDouble ();
    if ((aaDouble1 != null) || (aaDouble2 != null)) {
      assertNotNull (aaDouble1);
      assertNotNull (aaDouble2);
      assertEquals (n = aaDouble1.length, aaDouble2.length);
      for (i = 0; i < n; i++) {
        assertEquals (Arrays.equals (aaDouble1[i], aaDouble2[i]), true);
      }
    }
    float[][] aaFloat1 = object1.getAaFloat (), aaFloat2 = object2.getAaFloat ();
    if ((aaFloat1 != null) || (aaFloat2 != null)) {
      assertNotNull (aaFloat1);
      assertNotNull (aaFloat2);
      assertEquals (n = aaFloat1.length, aaFloat2.length);
      for (i = 0; i < n; i++) {
        assertEquals (Arrays.equals (aaFloat1[i], aaFloat2[i]), true);
      }
    }
    boolean[][] aaIndicator1 = object1.getAaIndicator (), aaIndicator2 = object2.getAaIndicator ();
    if ((aaIndicator1 != null) || (aaIndicator2 != null)) {
      assertNotNull (aaIndicator1);
      assertNotNull (aaIndicator2);
      assertEquals (n = aaIndicator1.length, aaIndicator2.length);
      for (i = 0; i < n; i++) {
        assertEquals (Arrays.equals (aaIndicator1[i], aaIndicator2[i]), true);
      }
    }
    int[][] aaInt1 = object1.getAaInt (), aaInt2 = object2.getAaInt ();
    if ((aaInt1 != null) || (aaInt2 != null)) {
      assertNotNull (aaInt1);
      assertNotNull (aaInt2);
      assertEquals (n = aaInt1.length, aaInt2.length);
      for (i = 0; i < n; i++) {
        assertEquals (Arrays.equals (aaInt1[i], aaInt2[i]), true);
      }
    }
    long[][] aaLong1 = object1.getAaLong (), aaLong2 = object2.getAaLong ();
    if ((aaLong1 != null) || (aaLong2 != null)) {
      assertNotNull (aaLong1);
      assertNotNull (aaLong2);
      assertEquals (n = aaLong1.length, aaLong2.length);
      for (i = 0; i < n; i++) {
        assertEquals (Arrays.equals (aaLong1[i], aaLong2[i]), true);
      }
    }
    short[][] aaShort1 = object1.getAaShort (), aaShort2 = object2.getAaShort ();
    if ((aaShort1 != null) || (aaShort2 != null)) {
      assertNotNull (aaShort1);
      assertNotNull (aaShort2);
      assertEquals (n = aaShort1.length, aaShort2.length);
      for (i = 0; i < n; i++) {
        assertEquals (Arrays.equals (aaShort1[i], aaShort2[i]), true);
      }
    }
    String[][] aaString1 = object1.getAaString (), aaString2 = object2.getAaString ();
    if ((aaString1 != null) || (aaString2 != null)) {
      assertNotNull (aaString1);
      assertNotNull (aaString2);
      assertEquals (n = aaString1.length, aaString2.length);
      for (i = 0; i < n; i++) {
        assertEquals (Arrays.equals (aaString1[i], aaString2[i]), true);
      }
    }
    SubMessage[][] aaSubMessage1 = object1.getAaSubMessage (), aaSubMessage2 = object2.getAaSubMessage ();
    if ((aaSubMessage1 != null) || (aaSubMessage2 != null)) {
      assertNotNull (aaSubMessage1);
      assertNotNull (aaSubMessage2);
      assertEquals (n = aaSubMessage1.length, aaSubMessage2.length);
      for (i = 0; i < n; i++) {
        assertEquals (Arrays.equals (aaSubMessage1[i], aaSubMessage2[i]), true);
      }
    }
    CustomEnum[][] aaCustomEnum1 = object1.getAaCustomEnum (), aaCustomEnum2 = object2.getAaCustomEnum ();
    if ((aaCustomEnum1 != null) || (aaCustomEnum2 != null)) {
      assertNotNull (aaCustomEnum1);
      assertNotNull (aaCustomEnum2);
      assertEquals (n = aaCustomEnum1.length, aaCustomEnum2.length);
      for (i = 0; i < n; i++) {
        assertEquals (Arrays.equals (aaCustomEnum1[i], aaCustomEnum2[i]), true);
      }
    }
  }
  
  @Test
  public void builderDefaultValues () {
    final FudgeContext context = new FudgeContext ();
    final Types object = new Types.Builder ().build ();
    final FudgeFieldContainer message = object.toFudgeMsg (context);
    final Types object2 = Types.fromFudgeMsg (message);
    compareTypes (object, object2);
  }
  
  @Test
  public void builderSingleValues () {
    final FudgeContext context = new FudgeContext ();
    final Types object = new Types.Builder ().sBool (true).sByte ((byte)1).sDouble (2).sFloat (3).sIndicator (true).sInt (4).sLong (5).sShort ((short)6).sString ("7").sSubMessage (new SubMessage (8, "9")).sCustomEnum (CustomEnum.SECOND).build ();
    final FudgeFieldContainer message = object.toFudgeMsg (context);
    final Types object2 = Types.fromFudgeMsg (message);
    compareTypes (object, object2);
  }
  
  private Types createTypesObject () {
    final Types.Builder builder = new Types.Builder ();
    final boolean[] aBool = new boolean[32];
    final byte[] aByte = new byte[32];
    final double[] aDouble = new double[32];
    final float[] aFloat = new float[32];
    final int[] aInt = new int[32];
    final short[] aShort = new short[32];
    final String[] aString = new String[32];
    final SubMessage[] aSubMessage = new SubMessage[32];
    final CustomEnum[] aCustomEnum = new CustomEnum[32];
    for (int i = 0; i < 32; i++) {
      aBool[i] = ((i % 3) == 0) || ((i % 7) == 0);
      aByte[i] = (byte)i;
      aDouble[i] = (double)i * 3.1415;
      aFloat[i] = (float)i * 3.1415f;
      aInt[i] = i;
      aShort[i] = (short)i;
      aString[i] = Integer.toString (i);
      aSubMessage[i] = new SubMessage (i, Integer.toString (i));
      aCustomEnum[i] = CustomEnum.fromFudgeEncoding ((i & 3) + 1);
    }
    return builder.aBool(aBool).aByte (aByte).aDouble (aDouble).aFloat (aFloat).aInt (aInt).aShort (aShort).aString (aString).aSubMessage (aSubMessage).aCustomEnum (aCustomEnum).build ();
  }
  
  @Test
  public void builderArrayValues () {
    final FudgeContext context = new FudgeContext ();
    final Types object = createTypesObject ();
    final FudgeFieldContainer message = object.toFudgeMsg (context);
    final Types object2 = Types.fromFudgeMsg (message);
    compareTypes (object, object2);
  }
  
  @Test
  public void speedTest100000ToFudgeMsg () {
    final FudgeContext context = new FudgeContext ();
    final Types object = createTypesObject ();
    for (int i = 0; i < 100000; i++) {
      object.toFudgeMsg (context);
    }
  }
  
  @Test
  public void speedTest100000FromFudgeMsg () {
    final FudgeContext context = new FudgeContext ();
    final Types object = createTypesObject ();
    final FudgeFieldContainer message = object.toFudgeMsg (context);
    for (int i = 0; i < 100000; i++) {
      Types.fromFudgeMsg (message);
    }
  }
  
}