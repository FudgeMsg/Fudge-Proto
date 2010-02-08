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

public interface RSTypesBase {
  public Boolean get_Bool ();
  public Byte get_Byte ();
  public Double get_Double ();
  public Float get_Float ();
  public Boolean get_Indicator ();
  public Integer get_Int ();
  public Long get_Long ();
  public Short get_Short ();
  public String get_String ();
  public SubMessage get_SubMessage ();
  public CustomEnum get_CustomEnum ();
  public FudgeFieldContainer get_Message ();
  public FudgeDate get_Date ();
  public Date get_DateTime ();
  public FudgeTime get_Time ();
  public Boolean get_Bool (int n);
  public Byte get_Byte (int n);
  public Double get_Double (int n);
  public Float get_Float (int n);
  public Boolean get_Indicator (int n);
  public Integer get_Int (int n);
  public Long get_Long (int n);
  public Short get_Short (int n);
  public String get_String (int n);
  public SubMessage get_SubMessage (int n);
  public CustomEnum get_CustomEnum (int n);
  public FudgeFieldContainer get_Message (int n);
  public FudgeDate get_Date (int n);
  public Date get_DateTime (int n);
  public FudgeTime get_Time (int n);
  public int get_BoolCount ();
  public int get_ByteCount ();
  public int get_DoubleCount ();
  public int get_FloatCount ();
  public int get_IndicatorCount ();
  public int get_IntCount ();
  public int get_LongCount ();
  public int get_ShortCount ();
  public int get_StringCount ();
  public int get_SubMessageCount ();
  public int get_CustomEnumCount ();
  public int get_MessageCount ();
  public int get_DateCount ();
  public int get_DateTimeCount ();
  public int get_TimeCount ();
}