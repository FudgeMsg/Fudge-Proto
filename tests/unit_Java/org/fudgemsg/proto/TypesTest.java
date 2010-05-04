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

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.time.calendar.Clock;
import javax.time.calendar.DateProvider;
import javax.time.calendar.DateTimeProvider;
import javax.time.calendar.TimeProvider;

import org.fudgemsg.FudgeContext;
import org.fudgemsg.FudgeFieldContainer;
import org.fudgemsg.MutableFudgeFieldContainer;
import org.fudgemsg.proto.tests.types.AATypesBase;
import org.fudgemsg.proto.tests.types.AATypes_Optional;
import org.fudgemsg.proto.tests.types.AATypes_Required;
import org.fudgemsg.proto.tests.types.ATypesBase;
import org.fudgemsg.proto.tests.types.ATypes_Optional;
import org.fudgemsg.proto.tests.types.ATypes_Required;
import org.fudgemsg.proto.tests.types.CustomEnum;
import org.fudgemsg.proto.tests.types.MutableAATypes_Optional;
import org.fudgemsg.proto.tests.types.MutableAATypes_Required;
import org.fudgemsg.proto.tests.types.MutableATypes_Optional;
import org.fudgemsg.proto.tests.types.MutableATypes_Required;
import org.fudgemsg.proto.tests.types.MutableRATypes_Optional;
import org.fudgemsg.proto.tests.types.MutableRATypes_Required;
import org.fudgemsg.proto.tests.types.MutableRSTypes_Optional;
import org.fudgemsg.proto.tests.types.MutableRSTypes_Required;
import org.fudgemsg.proto.tests.types.MutableSTypes_Optional;
import org.fudgemsg.proto.tests.types.MutableSTypes_Required;
import org.fudgemsg.proto.tests.types.RATypesBase;
import org.fudgemsg.proto.tests.types.RATypes_Optional;
import org.fudgemsg.proto.tests.types.RATypes_Required;
import org.fudgemsg.proto.tests.types.RSTypesBase;
import org.fudgemsg.proto.tests.types.RSTypes_Optional;
import org.fudgemsg.proto.tests.types.RSTypes_Required;
import org.fudgemsg.proto.tests.types.STypes_Optional;
import org.fudgemsg.proto.tests.types.STypes_Required;
import org.fudgemsg.proto.tests.types.SubMessage;
import org.fudgemsg.proto.tests.types.TypesBase;
import org.junit.Test;

public class TypesTest {
  
  private final FudgeContext _fudgeContext = new FudgeContext ();
  private final Random _random = new Random ();
  
  private void compareSubMessage (final SubMessage object1, final SubMessage object2) {
    if ((object1 == null) && (object2 == null)) return;
    assertNotNull (object1);
    assertNotNull (object2);
    assertEquals (object1.getI (), object2.getI ());
    assertEquals (object1.getS (), object2.getS ());
    assertEquals (object1, object2);
  }
  
  private void compareTypes (final TypesBase object1, final TypesBase object2) {
    if ((object1 == null) && (object2 == null)) return;
    assertNotNull (object1);
    assertNotNull (object2);
    assertEquals (object1.get_Bool (), object2.get_Bool ());
    assertEquals (object1.get_Byte (), object2.get_Byte ());
    assertEquals (object1.get_Double (), object2.get_Double (), 0);
    assertEquals (object1.get_Float (), object2.get_Float (), 0);
    assertEquals (object1.get_Indicator (), object2.get_Indicator ());
    assertEquals (object1.get_Int (), object2.get_Int ());
    assertEquals (object1.get_Long (), object2.get_Long ());
    assertEquals (object1.get_Short (), object2.get_Short ());
    assertEquals (object1.get_String (), object2.get_String ());
    compareSubMessage (object1.get_SubMessage (), object2.get_SubMessage ());
    assertEquals (object1.get_CustomEnum (), object2.get_CustomEnum ());
    assertEquals (object1.get_Message (), object2.get_Message ());
    assertEquals (object1.get_Date (), object2.get_Date ());
    assertEquals (object1.get_DateTime (), object2.get_DateTime ());
    assertEquals (object1.get_Time (), object2.get_Time ());
    assertEquals (object1, object2);
  }
  
  private void compareTypes (final ATypesBase object1, final ATypesBase object2) {
    if ((object1 == null) && (object2 == null)) return;
    assertNotNull (object1);
    assertNotNull (object2);
    assertEquals (Arrays.equals (object1.get_Bool (), object2.get_Bool ()), true);
    assertArrayEquals (object1.get_Byte (), object2.get_Byte ());
    assertEquals (Arrays.equals (object1.get_Double (), object2.get_Double ()), true);
    assertEquals (Arrays.equals (object1.get_Float (), object2.get_Float ()), true);
    assertEquals (Arrays.equals (object1.get_Indicator (), object2.get_Indicator ()), true);
    assertArrayEquals (object1.get_Int (), object2.get_Int ());
    assertArrayEquals (object1.get_Long (), object2.get_Long ());
    assertArrayEquals (object1.get_Short (), object2.get_Short ());
    assertArrayEquals (object1.get_String (), object2.get_String ());
    assertArrayEquals (object1.get_SubMessage (), object2.get_SubMessage ());
    assertArrayEquals (object1.get_CustomEnum (), object2.get_CustomEnum ());
    assertArrayEquals (object1.get_Date (), object2.get_Date ());
    assertArrayEquals (object1.get_DateTime (), object2.get_DateTime ());
    assertArrayEquals (object1.get_Time (), object2.get_Time ());
    assertEquals (object1, object2);
  }

  private <T> void compareAAObject (T[][] a, T[][] b) {
    int n, i;
    if ((a != null) || (b != null)) {
      assertNotNull (a);
      assertNotNull (b);
      assertEquals (n = a.length, a.length);
      for (i = 0; i < n; i++) {
        assertArrayEquals (a[i], b[i]);
      }
    }
  }

  private void compareTypes (final AATypesBase object1, final AATypesBase object2) {
    if ((object1 == null) && (object2 == null)) return;
    assertNotNull (object1);
    assertNotNull (object2);
    int n, i;
    boolean[][] aaBool1 = object1.get_Bool (), aaBool2 = object2.get_Bool ();
    if ((aaBool1 != null) || (aaBool2 != null)) {
      assertNotNull (aaBool1);
      assertNotNull (aaBool2);
      assertEquals (n = aaBool1.length, aaBool2.length);
      for (i = 0; i < n; i++) {
        assertEquals (Arrays.equals (aaBool1[i], aaBool2[i]), true);
      }
    }
    byte[][] aaByte1 = object1.get_Byte (), aaByte2 = object2.get_Byte ();
    if ((aaByte1 != null) || (aaByte2 != null)) {
      assertNotNull (aaByte1);
      assertNotNull (aaByte2);
      assertEquals (n = aaByte1.length, aaByte2.length);
      for (i = 0; i < n; i++) {
        assertArrayEquals (aaByte1[i], aaByte2[i]);
      }
    }
    double[][] aaDouble1 = object1.get_Double (), aaDouble2 = object2.get_Double ();
    if ((aaDouble1 != null) || (aaDouble2 != null)) {
      assertNotNull (aaDouble1);
      assertNotNull (aaDouble2);
      assertEquals (n = aaDouble1.length, aaDouble2.length);
      for (i = 0; i < n; i++) {
        assertEquals (Arrays.equals (aaDouble1[i], aaDouble2[i]), true);
      }
    }
    float[][] aaFloat1 = object1.get_Float (), aaFloat2 = object2.get_Float ();
    if ((aaFloat1 != null) || (aaFloat2 != null)) {
      assertNotNull (aaFloat1);
      assertNotNull (aaFloat2);
      assertEquals (n = aaFloat1.length, aaFloat2.length);
      for (i = 0; i < n; i++) {
        assertEquals (Arrays.equals (aaFloat1[i], aaFloat2[i]), true);
      }
    }
    boolean[][] aaIndicator1 = object1.get_Indicator (), aaIndicator2 = object2.get_Indicator ();
    if ((aaIndicator1 != null) || (aaIndicator2 != null)) {
      assertNotNull (aaIndicator1);
      assertNotNull (aaIndicator2);
      assertEquals (n = aaIndicator1.length, aaIndicator2.length);
      for (i = 0; i < n; i++) {
        assertEquals (Arrays.equals (aaIndicator1[i], aaIndicator2[i]), true);
      }
    }
    int[][] aaInt1 = object1.get_Int (), aaInt2 = object2.get_Int ();
    if ((aaInt1 != null) || (aaInt2 != null)) {
      assertNotNull (aaInt1);
      assertNotNull (aaInt2);
      assertEquals (n = aaInt1.length, aaInt2.length);
      for (i = 0; i < n; i++) {
        assertArrayEquals (aaInt1[i], aaInt2[i]);
      }
    }
    long[][] aaLong1 = object1.get_Long (), aaLong2 = object2.get_Long ();
    if ((aaLong1 != null) || (aaLong2 != null)) {
      assertNotNull (aaLong1);
      assertNotNull (aaLong2);
      assertEquals (n = aaLong1.length, aaLong2.length);
      for (i = 0; i < n; i++) {
        assertArrayEquals (aaLong1[i], aaLong2[i]);
      }
    }
    short[][] aaShort1 = object1.get_Short (), aaShort2 = object2.get_Short ();
    if ((aaShort1 != null) || (aaShort2 != null)) {
      assertNotNull (aaShort1);
      assertNotNull (aaShort2);
      assertEquals (n = aaShort1.length, aaShort2.length);
      for (i = 0; i < n; i++) {
        assertArrayEquals (aaShort1[i], aaShort2[i]);
      }
    }
    compareAAObject (object1.get_String (), object2.get_String ());
    compareAAObject (object1.get_SubMessage (), object2.get_SubMessage ());
    compareAAObject (object1.get_CustomEnum (), object2.get_CustomEnum ());
    compareAAObject (object1.get_Date (), object2.get_Date ());
    compareAAObject (object1.get_DateTime (), object2.get_DateTime ());
    compareAAObject (object1.get_Time (), object2.get_Time ());
    assertEquals (true, object1.equals (object2));
    assertEquals (object1, object2);
  }
  
  private <T> void assertListEquals (List<T> a, List<T> b) {
    int n, i;
    assertEquals (n = a.size (), b.size ());
    for (i = 0; i < n; i++) {
      assertEquals (a.get (i), b.get (i));
    }
  }

  private <T> void assertArrayListEquals (List<T[]> a, List<T[]> b) {
    int n, i;
    assertEquals (n = a.size (), b.size ());
    for (i = 0; i < n; i++) {
      assertArrayEquals (a.get (i), b.get (i));
    }
  }

  private void compareTypes (final RSTypesBase object1, final RSTypesBase object2) {
    if ((object1 == null) && (object2 == null)) return;
    assertNotNull (object1);
    assertNotNull (object2);
    assertListEquals (object1.get_Bool (), object2.get_Bool ());
    assertListEquals (object1.get_Byte (), object2.get_Byte ());
    assertListEquals (object1.get_Double (), object2.get_Double ());
    assertListEquals (object1.get_Float (), object2.get_Float ());
    assertListEquals (object1.get_Indicator (), object2.get_Indicator ());
    assertListEquals (object1.get_Int (), object2.get_Int ());
    assertListEquals (object1.get_Long (), object2.get_Long ());
    assertListEquals (object1.get_Short (), object2.get_Short ());
    assertListEquals (object1.get_String (), object2.get_String ());
    assertListEquals (object1.get_SubMessage (), object2.get_SubMessage ());
    assertListEquals (object1.get_CustomEnum (), object2.get_CustomEnum ());
    assertEquals (object1, object2);
  }
  
  private void compareTypes (final RATypesBase object1, final RATypesBase object2) {
    if ((object1 == null) && (object2 == null)) return;
    assertNotNull (object1);
    assertNotNull (object2);
    int n, i;
    List<boolean[]> raBool1 = object1.get_Bool (), raBool2 = object2.get_Bool ();
    assertEquals (n = raBool1.size (), raBool2.size ());
    for (i = 0; i < n; i++) {
      assertEquals (true, Arrays.equals (raBool1.get (i), raBool2.get (i)));
    }
    List<byte[]> raByte1 = object1.get_Byte (), raByte2 = object2.get_Byte ();
    assertEquals (n = raByte1.size (), raByte2.size ());
    for (i = 0; i < n; i++) {
      assertArrayEquals (raByte1.get (i), raByte2.get (i));
    }
    List<double[]> raDouble1 = object1.get_Double (), raDouble2 = object2.get_Double ();
    assertEquals (n = raDouble1.size (), raDouble2.size ());
    for (i = 0; i < n; i++) {
      assertEquals (true, Arrays.equals (raDouble1.get (i), raDouble2.get (i)));
    }
    List<float[]> raFloat1 = object1.get_Float (), raFloat2 = object2.get_Float ();
    assertEquals (n = raFloat1.size (), raFloat2.size ());
    for (i = 0; i < n; i++) {
      assertEquals (true, Arrays.equals (raFloat1.get (i), raFloat2.get (i)));
    }
    List<boolean[]> raIndicator1 = object1.get_Indicator (), raIndicator2 = object2.get_Indicator ();
    assertEquals (n = raIndicator1.size (), raIndicator2.size ());
    for (i = 0; i < n; i++) {
      assertEquals (true, Arrays.equals (raIndicator1.get (i), raIndicator2.get (i)));
    }
    List<int[]> raInt1 = object1.get_Int (), raInt2 = object2.get_Int ();
    assertEquals (n = raInt1.size (), raInt2.size ());
    for (i = 0; i < n; i++) {
      assertArrayEquals (raInt1.get (i), raInt2.get (i));
    }
    List<long[]> raLong1 = object1.get_Long (), raLong2 = object2.get_Long ();
    assertEquals (n = raLong1.size (), raLong2.size ());
    for (i = 0; i < n; i++) {
      assertArrayEquals (raLong1.get (i), raLong2.get (i));
    }
    List<short[]> raShort1 = object1.get_Short (), raShort2 = object2.get_Short ();
    assertEquals (n = raShort1.size (), raShort2.size ());
    for (i = 0; i < n; i++) {
      assertArrayEquals (raShort1.get (i), raShort2.get (i));
    }
    assertArrayListEquals (object1.get_String (), object2.get_String ());
    assertArrayListEquals (object1.get_SubMessage (), object2.get_SubMessage ());
    assertArrayListEquals (object1.get_CustomEnum (), object2.get_CustomEnum ());
    assertEquals (true, object1.equals (object2));
    assertEquals (object1, object2);
  }
  
  private int arraySize () {
    return _random.nextInt (16) + 1;
  }
  
  private boolean sbool () {
    return _random.nextBoolean ();
  }
  
  private boolean[] abool () {
    final int n = arraySize ();
    final boolean[] r = new boolean[n];
    for (int i = 0; i < n; i++) {
      r[i] = sbool ();
    }
    return r;
  }
  
  private boolean[][] aabool () {
    final int n = arraySize ();
    final boolean[][] r = new boolean[n][];
    for (int i = 0; i < n; i++) {
      r[i] = abool ();
    }
    return r;
  }
  
  private boolean sindicator () {
    return true;
  }
  
  private boolean[] aindicator () {
    final int n = arraySize ();
    final boolean[] r = new boolean[n];
    for (int i = 0; i < n; i++) {
      r[i] = sindicator ();
    }
    return r;
  }
  
  private boolean[][] aaindicator () {
    final int n = arraySize ();
    final boolean[][] r = new boolean[n][];
    for (int i = 0; i < n; i++) {
      r[i] = aindicator ();
    }
    return r;
  }
  
  private byte sbyte () {
    return (byte)_random.nextInt ();
  }
  
  private byte[] abyte () {
    final int n = arraySize ();
    final byte[] r = new byte[n];
    for (int i = 0; i < n; i++) {
      r[i] = sbyte ();
    }
    return r;
  }
  
  private byte[][] aabyte () {
    final int n = arraySize ();
    final byte[][] r = new byte[n][];
    for (int i = 0; i < n; i++) {
      r[i] = abyte ();
    }
    return r;
  }
  
  private short sshort () {
    return (short)_random.nextInt ();
  }
  
  private short[] ashort () {
    final int n = arraySize ();
    final short[] r = new short[n];
    for (int i = 0; i < n; i++) {
      r[i] = sshort ();
    }
    return r;
  }
  
  private short[][] aashort () {
    final int n = arraySize ();
    final short[][] r = new short[n][];
    for (int i = 0; i < n; i++) {
      r[i] = ashort ();
    }
    return r;
  }
  
  private int sint () {
    return _random.nextInt ();
  }
  
  private int[] aint () {
    final int n = arraySize ();
    final int[] r = new int[n];
    for (int i = 0; i < n; i++) {
      r[i] = sint ();
    }
    return r;
  }
  
  private int[][] aaint () {
    final int n = arraySize ();
    final int[][] r = new int[n][];
    for (int i = 0; i < n; i++) {
      r[i] = aint ();
    }
    return r;
  }
  
  private long slong () {
    return (long)_random.nextInt ();
  }
  
  private long[] along () {
    final int n = arraySize ();
    final long[] r = new long[n];
    for (int i = 0; i < n; i++) {
      r[i] = slong ();
    }
    return r;
  }
  
  private long[][] aalong () {
    final int n = arraySize ();
    final long[][] r = new long[n][];
    for (int i = 0; i < n; i++) {
      r[i] = along ();
    }
    return r;
  }
  
  private double sdouble () {
    return _random.nextDouble ();
  }
  
  private double[] adouble () {
    final int n = arraySize ();
    final double[] r = new double[n];
    for (int i = 0; i < n; i++) {
      r[i] = sdouble ();
    }
    return r;
  }
  
  private double[][] aadouble () {
    final int n = arraySize ();
    final double[][] r = new double[n][];
    for (int i = 0; i < n; i++) {
      r[i] = adouble ();
    }
    return r;
  }
  
  private float sfloat () {
    return _random.nextFloat ();
  }
  
  private float[] afloat () {
    final int n = arraySize ();
    final float[] r = new float[n];
    for (int i = 0; i < n; i++) {
      r[i] = sfloat ();
    }
    return r;
  }
  
  private float[][] aafloat () {
    final int n = arraySize ();
    final float[][] r = new float[n][];
    for (int i = 0; i < n; i++) {
      r[i] = afloat ();
    }
    return r;
  }
  
  private String sstring () {
    final StringBuilder sb = new StringBuilder ();
    for (int i = 0; i < 8; i++) {
      sb.append ('A' + _random.nextInt (26));
    }
    return sb.toString ();
  }
  
  private String[] astring () {
    final int n = arraySize ();
    final String[] r = new String[n];
    for (int i = 0; i < n; i++) {
      r[i] = sstring ();
    }
    return r;
  }
  
  private String[][] aastring () {
    final int n = arraySize ();
    final String[][] r = new String[n][];
    for (int i = 0; i < n; i++) {
      r[i] = astring ();
    }
    return r;
  }
  
  private SubMessage ssubmessage () {
    return new SubMessage (sint (), sstring ());
  }
  
  private SubMessage[] asubmessage () {
    final int n = arraySize ();
    final SubMessage[] r = new SubMessage[n];
    for (int i = 0; i < n; i++) {
      r[i] = ssubmessage ();
    }
    return r;
  }
  
  private SubMessage[][] aasubmessage () {
    final int n = arraySize ();
    final SubMessage[][] r = new SubMessage[n][];
    for (int i = 0; i < n; i++) {
      r[i] = asubmessage ();
    }
    return r;
  }
  
  private CustomEnum scustomenum () {
    switch (_random.nextInt (3)) {
      case 0 : return CustomEnum.FIRST;
      case 1 : return CustomEnum.SECOND;
      case 2 : return CustomEnum.THIRD;
      case 3 : return CustomEnum.FOURTH;
      default : return null;
    }
  }
  
  private CustomEnum[] acustomenum () {
    final int n = arraySize ();
    final CustomEnum[] r = new CustomEnum[n];
    for (int i = 0; i < n; i++) {
      r[i] = scustomenum ();
    }
    return r;
  }
  
  private CustomEnum[][] aacustomenum () {
    final int n = arraySize ();
    final CustomEnum[][] r = new CustomEnum[n][];
    for (int i = 0; i < n; i++) {
      r[i] = acustomenum();
    }
    return r;
  }
  
  private FudgeFieldContainer smessage () {
    MutableFudgeFieldContainer ffc = _fudgeContext.newMessage ();
    ffc.add (sstring (), _random.nextInt (256), sstring ());
    return ffc;
  }
  
  private FudgeFieldContainer[] amessage () {
    final int n = arraySize ();
    final FudgeFieldContainer[] r = new FudgeFieldContainer[n];
    for (int i = 0; i < n; i++) {
      r[i] = smessage ();
    }
    return r;
  }
  
  private FudgeFieldContainer[][] aamessage () {
    final int n = arraySize ();
    final FudgeFieldContainer[][] r = new FudgeFieldContainer[n][];
    for (int i = 0; i < n; i++) {
      r[i] = amessage ();
    }
    return r;
  }
  
  private DateProvider sdate () {
    return Clock.systemDefaultZone ().dateTime ();
  }
  
  private DateProvider[] adate () {
    final int n = arraySize ();
    final DateProvider[] r = new DateProvider[n];
    for (int i = 0; i < n; i++) {
      r[i] = sdate ();
    }
    return r;
  }
  
  private DateProvider[][] aadate () {
    final int n = arraySize ();
    final DateProvider[][] r = new DateProvider[n][];
    for (int i = 0; i < n; i++) {
      r[i] = adate ();
    }
    return r;
  }
  
  private DateTimeProvider sdatetime () {
    return Clock.systemDefaultZone ().dateTime ();
  }
  
  private DateTimeProvider[] adatetime () {
    final int n = arraySize ();
    final DateTimeProvider[] r = new DateTimeProvider[n];
    for (int i = 0; i < n; i++) {
      r[i] = sdatetime ();
    }
    return r;
  }
  
  private DateTimeProvider[][] aadatetime () {
    final int n = arraySize ();
    final DateTimeProvider[][] r = new DateTimeProvider[n][];
    for (int i = 0; i < n; i++) {
      r[i] = adatetime ();
    }
    return r;
  }
  
  private TimeProvider stime () {
    return Clock.systemDefaultZone ().dateTime ();
  }
  
  private TimeProvider[] atime () {
    final int n = arraySize ();
    final TimeProvider[] r = new TimeProvider[n];
    for (int i = 0; i < n; i++) {
      r[i] = stime ();
    }
    return r;
  }
  
  private TimeProvider[][] aatime () {
    final int n = arraySize ();
    final TimeProvider[][] r = new TimeProvider[n][];
    for (int i = 0; i < n; i++) {
      r[i] = atime ();
    }
    return r;
  }
  
  @Test
  public void aa_optional () {
    AATypes_Optional.Builder builder = new AATypes_Optional.Builder ();
    builder._Bool (aabool ());
    builder._Byte (aabyte ());
    builder._Double (aadouble ());
    builder._Float (aafloat ());
    builder._Indicator (aaindicator ());
    builder._Int (aaint ());
    builder._Long (aalong ());
    builder._Short (aashort ());
    builder._String (aastring ());
    builder._SubMessage (aasubmessage ());
    builder._CustomEnum (aacustomenum ());
    builder._Message (aamessage ());
    builder._Date (aadate ());
    builder._DateTime (aadatetime ());
    builder._Time (aatime ());
    AATypes_Optional in = builder.build ();
    AATypes_Optional out = AATypes_Optional.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void aa_required () {
    AATypes_Required in = new AATypes_Required (aabool (), aabyte (), aadouble (), aafloat (), aaindicator (), aaint (), aalong (), aashort (), aastring (), aasubmessage (), aacustomenum (), aamessage (), aadate (), aadatetime (), aatime ());
    AATypes_Required out = AATypes_Required.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void a_optional () {
    ATypes_Optional.Builder builder = new ATypes_Optional.Builder ();
    builder._Bool (abool ());
    builder._Byte (abyte ());
    builder._Double (adouble ());
    builder._Float (afloat ());
    builder._Indicator (aindicator ());
    builder._Int (aint ());
    builder._Long (along ());
    builder._Short (ashort ());
    builder._String (astring ());
    builder._SubMessage (asubmessage ());
    builder._CustomEnum (acustomenum ());
    builder._Message (amessage ());
    builder._Date (adate ());
    builder._DateTime (adatetime ());
    builder._Time (atime ());
    ATypes_Optional in = builder.build ();
    ATypes_Optional out = ATypes_Optional.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void a_required () {
    ATypes_Required in = new ATypes_Required (abool (), abyte (), adouble (), afloat (), aindicator (), aint (), along (), ashort (), astring (), asubmessage (), acustomenum (), amessage (), adate (), adatetime (), atime ());
    ATypes_Required out = ATypes_Required.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void ra_optional () {
    RATypes_Optional.Builder builder = new RATypes_Optional.Builder ();
    builder._Bool (Arrays.asList (aabool ()));
    builder._Byte (Arrays.asList (aabyte ()));
    builder._Double (Arrays.asList (aadouble ()));
    builder._Float (Arrays.asList (aafloat ()));
    builder._Indicator (Arrays.asList (aaindicator ()));
    builder._Int (Arrays.asList (aaint ()));
    builder._Long (Arrays.asList (aalong ()));
    builder._Short (Arrays.asList (aashort ()));
    builder._String (Arrays.asList (aastring ()));
    builder._SubMessage (Arrays.asList (aasubmessage ()));
    builder._CustomEnum (Arrays.asList (aacustomenum ()));
    builder._Message (Arrays.asList (aamessage ()));
    builder._Date (Arrays.asList (aadate ()));
    builder._DateTime (Arrays.asList (aadatetime ()));
    builder._Time (Arrays.asList (aatime ()));
    RATypes_Optional in = builder.build ();
    RATypes_Optional out = RATypes_Optional.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void ra_required () {
    RATypes_Required in = new RATypes_Required (Arrays.asList (aabool ()), Arrays.asList (aabyte ()), Arrays.asList (aadouble ()), Arrays.asList (aafloat ()), Arrays.asList (aaindicator ()), Arrays.asList (aaint ()), Arrays.asList (aalong ()), Arrays.asList (aashort ()), Arrays.asList (aastring ()), Arrays.asList (aasubmessage ()), Arrays.asList (aacustomenum ()), Arrays.asList (aamessage ()), Arrays.asList (aadate ()), Arrays.asList (aadatetime ()), Arrays.asList (aatime ()));
    RATypes_Required out = RATypes_Required.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void rs_optional () {
    RSTypes_Optional.Builder builder = new RSTypes_Optional.Builder ();
    builder._Bool (Arrays.asList (sbool ()));
    builder._Byte (Arrays.asList (sbyte ()));
    builder._Double (Arrays.asList (sdouble ()));
    builder._Float (Arrays.asList (sfloat ()));
    builder._Indicator (Arrays.asList (sindicator ()));
    builder._Int (Arrays.asList (sint ()));
    builder._Long (Arrays.asList (slong ()));
    builder._Short (Arrays.asList (sshort ()));
    builder._String (Arrays.asList (astring ()));
    builder._SubMessage (Arrays.asList (asubmessage ()));
    builder._CustomEnum (Arrays.asList (acustomenum ()));
    builder._Message (Arrays.asList (amessage ()));
    builder._Date (Arrays.asList (adate ()));
    builder._DateTime (Arrays.asList (adatetime ()));
    builder._Time (Arrays.asList (atime ()));
    RSTypes_Optional in = builder.build ();
    RSTypes_Optional out = RSTypes_Optional.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void rs_required () {
    RSTypes_Required in = new RSTypes_Required (Arrays.asList (sbool ()), Arrays.asList (sbyte ()), Arrays.asList (sdouble ()), Arrays.asList (sfloat ()), Arrays.asList (sindicator ()), Arrays.asList (sint ()), Arrays.asList (slong ()), Arrays.asList (sshort ()), Arrays.asList (astring ()), Arrays.asList (asubmessage ()), Arrays.asList (acustomenum ()), Arrays.asList (amessage ()), Arrays.asList (adate ()), Arrays.asList (adatetime ()), Arrays.asList (atime ()));
    RSTypes_Required out = RSTypes_Required.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void s_optional () {
    STypes_Optional.Builder builder = new STypes_Optional.Builder ();
    builder._Bool (sbool ());
    builder._Byte (sbyte ());
    builder._Double (sdouble ());
    builder._Float (sfloat ());
    builder._Indicator (sindicator ());
    builder._Int (sint ());
    builder._Long (slong ());
    builder._Short (sshort ());
    builder._String (sstring ());
    builder._SubMessage (ssubmessage ());
    builder._CustomEnum (scustomenum ());
    builder._Message (smessage ());
    builder._Date (sdate ());
    builder._DateTime (sdatetime ());
    builder._Time (stime ());
    STypes_Optional in = builder.build ();
    STypes_Optional out = STypes_Optional.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void s_required () {
    STypes_Required in = new STypes_Required (sbool (), sbyte (), sdouble (), sfloat (), sindicator (), sint (), slong (), sshort (), sstring (), ssubmessage (), scustomenum (), smessage (), sdate (), sdatetime (), stime ());
    STypes_Required out = STypes_Required.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void maa_optional () {
    MutableAATypes_Optional in = new MutableAATypes_Optional ();
    in.set_Bool (aabool ());
    in.set_Byte (aabyte ());
    in.set_Double (aadouble ());
    in.set_Float (aafloat ());
    in.set_Indicator (aaindicator ());
    in.set_Int (aaint ());
    in.set_Long (aalong ());
    in.set_Short (aashort ());
    in.set_String (aastring ());
    in.set_SubMessage (aasubmessage ());
    in.set_CustomEnum (aacustomenum ());
    in.set_Message (aamessage ());
    in.set_Date (aadate ());
    in.set_DateTime (aadatetime ());
    in.set_Time (aatime ());
    MutableAATypes_Optional out = MutableAATypes_Optional.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void maa_required () {
    MutableAATypes_Required in = new MutableAATypes_Required (aabool (), aabyte (), aadouble (), aafloat (), aaindicator (), aaint (), aalong (), aashort (), aastring (), aasubmessage (), aacustomenum (), aamessage (), aadate (), aadatetime (), aatime ());
    MutableAATypes_Required out = MutableAATypes_Required.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void ma_optional () {
    MutableATypes_Optional in = new MutableATypes_Optional ();
    in.set_Bool (abool ());
    in.set_Byte (abyte ());
    in.set_Double (adouble ());
    in.set_Float (afloat ());
    in.set_Indicator (aindicator ());
    in.set_Int (aint ());
    in.set_Long (along ());
    in.set_Short (ashort ());
    in.set_String (astring ());
    in.set_SubMessage (asubmessage ());
    in.set_CustomEnum (acustomenum ());
    in.set_Message (amessage ());
    in.set_Date (adate ());
    in.set_DateTime (adatetime ());
    in.set_Time (atime ());
    MutableATypes_Optional out = MutableATypes_Optional.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void ma_required () {
    MutableATypes_Required in = new MutableATypes_Required (abool (), abyte (), adouble (), afloat (), aindicator (), aint (), along (), ashort (), astring (), asubmessage (), acustomenum (), amessage (), adate (), adatetime (), atime ());
    MutableATypes_Required out = MutableATypes_Required.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void mra_optional () {
    MutableRATypes_Optional in = new MutableRATypes_Optional ();
    in.set_Bool (Arrays.asList (aabool ()));
    in.set_Byte (Arrays.asList (aabyte ()));
    in.set_Double (Arrays.asList (aadouble ()));
    in.set_Float (Arrays.asList (aafloat ()));
    in.set_Indicator (Arrays.asList (aaindicator ()));
    in.set_Int (Arrays.asList (aaint ()));
    in.set_Long (Arrays.asList (aalong ()));
    in.set_Short (Arrays.asList (aashort ()));
    in.set_String (Arrays.asList (aastring ()));
    in.set_SubMessage (Arrays.asList (aasubmessage ()));
    in.set_CustomEnum (Arrays.asList (aacustomenum ()));
    in.set_Message (Arrays.asList (aamessage ()));
    in.set_Date (Arrays.asList (aadate ()));
    in.set_DateTime (Arrays.asList (aadatetime ()));
    in.set_Time (Arrays.asList (aatime ()));
    MutableRATypes_Optional out = MutableRATypes_Optional.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void mra_required () {
    MutableRATypes_Required in = new MutableRATypes_Required (Arrays.asList (aabool ()), Arrays.asList (aabyte ()), Arrays.asList (aadouble ()), Arrays.asList (aafloat ()), Arrays.asList (aaindicator ()), Arrays.asList (aaint ()), Arrays.asList (aalong ()), Arrays.asList (aashort ()), Arrays.asList (aastring ()), Arrays.asList (aasubmessage ()), Arrays.asList (aacustomenum ()), Arrays.asList (aamessage ()), Arrays.asList (aadate ()), Arrays.asList (aadatetime ()), Arrays.asList (aatime ()));
    MutableRATypes_Required out = MutableRATypes_Required.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void mrs_optional () {
    MutableRSTypes_Optional in = new MutableRSTypes_Optional ();
    in.set_Bool (Arrays.asList (sbool ()));
    in.set_Byte (Arrays.asList (sbyte ()));
    in.set_Double (Arrays.asList (sdouble ()));
    in.set_Float (Arrays.asList (sfloat ()));
    in.set_Indicator (Arrays.asList (sindicator ()));
    in.set_Int (Arrays.asList (sint ()));
    in.set_Long (Arrays.asList (slong ()));
    in.set_Short (Arrays.asList (sshort ()));
    in.set_String (Arrays.asList (astring ()));
    in.set_SubMessage (Arrays.asList (asubmessage ()));
    in.set_CustomEnum (Arrays.asList (acustomenum ()));
    in.set_Message (Arrays.asList (amessage ()));
    in.set_Date (Arrays.asList (adate ()));
    in.set_DateTime (Arrays.asList (adatetime ()));
    in.set_Time (Arrays.asList (atime ()));
    MutableRSTypes_Optional out = MutableRSTypes_Optional.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void mrs_required () {
    MutableRSTypes_Required in = new MutableRSTypes_Required (Arrays.asList (sbool ()), Arrays.asList (sbyte ()), Arrays.asList (sdouble ()), Arrays.asList (sfloat ()), Arrays.asList (sindicator ()), Arrays.asList (sint ()), Arrays.asList (slong ()), Arrays.asList (sshort ()), Arrays.asList (astring ()), Arrays.asList (asubmessage ()), Arrays.asList (acustomenum ()), Arrays.asList (amessage ()), Arrays.asList (adate ()), Arrays.asList (adatetime ()), Arrays.asList (atime ()));
    MutableRSTypes_Required out = MutableRSTypes_Required.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void ms_optional () {
    MutableSTypes_Optional in = new MutableSTypes_Optional ();
    in.set_Bool (sbool ());
    in.set_Byte (sbyte ());
    in.set_Double (sdouble ());
    in.set_Float (sfloat ());
    in.set_Indicator (sindicator ());
    in.set_Int (sint ());
    in.set_Long (slong ());
    in.set_Short (sshort ());
    in.set_String (sstring ());
    in.set_SubMessage (ssubmessage ());
    in.set_CustomEnum (scustomenum ());
    in.set_Message (smessage ());
    in.set_Date (sdate ());
    in.set_DateTime (sdatetime ());
    in.set_Time (stime ());
    MutableSTypes_Optional out = MutableSTypes_Optional.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
  @Test
  public void ms_required () {
    MutableSTypes_Required in = new MutableSTypes_Required (sbool (), sbyte (), sdouble (), sfloat (), sindicator (), sint (), slong (), sshort (), sstring (), ssubmessage (), scustomenum (), smessage (), sdate (), sdatetime (), stime ());
    MutableSTypes_Required out = MutableSTypes_Required.fromFudgeMsg (in.toFudgeMsg (_fudgeContext));
    compareTypes (in, out);
  }
  
}