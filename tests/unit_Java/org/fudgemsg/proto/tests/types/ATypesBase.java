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

package org.fudgemsg.proto.tests.types;

import org.fudgemsg.FudgeFieldContainer;
import org.fudgemsg.types.FudgeDate;
import org.fudgemsg.types.FudgeTime;
import java.util.Date;

public interface ATypesBase {
  public boolean[] get_Bool ();
  public byte[] get_Byte ();
  public double[] get_Double ();
  public float[] get_Float ();
  public boolean[] get_Indicator ();
  public int[] get_Int ();
  public long[] get_Long ();
  public short[] get_Short ();
  public String[] get_String ();
  public SubMessage[] get_SubMessage ();
  public CustomEnum[] get_CustomEnum ();
  public FudgeFieldContainer[] get_Message ();
  public FudgeDate[] get_Date ();
  public Date[] get_DateTime ();
  public FudgeTime[] get_Time ();
}