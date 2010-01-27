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

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.fudgemsg.FudgeContext;
import org.fudgemsg.FudgeFieldContainer;
import org.fudgemsg.FudgeMsg;
import org.fudgemsg.proto.tests.inheritance.BaseClassA;
import org.fudgemsg.proto.tests.inheritance.BaseClassB;
import org.fudgemsg.proto.tests.inheritance.SubClassA;
import org.fudgemsg.proto.tests.inheritance.SubClassA2;
import org.junit.Test;

public class InheritanceTest {
  
  private static final List<Integer> INT_LIST = new ArrayList<Integer> (); 
    
  static {
    INT_LIST.add (42);
  }
  
  @Test
  public void testBaseClassA () {
    BaseClassA bcA = new BaseClassA.Builder (1, INT_LIST).build ();
    FudgeFieldContainer m = bcA.toFudgeMsg (new FudgeContext ());
    System.out.println (m);
    bcA = BaseClassA.fromFudgeMsg (m);
    assertNotNull (bcA);
  }
  
  @Test
  public void testBaseClassB () {
    BaseClassB bcB = new BaseClassB.Builder (2, INT_LIST).build ();
    FudgeFieldContainer m = bcB.toFudgeMsg (new FudgeContext ());
    System.out.println (m);
    bcB = BaseClassB.fromFudgeMsg (m);
    assertNotNull (bcB);
  }
  
  @Test
  public void testSubClassA () {
    SubClassA scA = new SubClassA.Builder (1, INT_LIST, 3, INT_LIST).build ();
    FudgeFieldContainer m = scA.toFudgeMsg (new FudgeContext ());
    System.out.println (m);
    scA = SubClassA.fromFudgeMsg (m);
    assertNotNull (scA);
    assertNotNull (BaseClassA.fromFudgeMsg (m));
  }
  
  @Test
  public void testSubClassA2 () {
    SubClassA2 scA2 = new SubClassA2.Builder (1, INT_LIST, 3, INT_LIST, 5, INT_LIST).build ();
    FudgeFieldContainer m = scA2.toFudgeMsg (new FudgeContext ());
    System.out.println (m);
    scA2 = SubClassA2.fromFudgeMsg (m);
    assertNotNull (scA2);
    assertNotNull (SubClassA.fromFudgeMsg (m));
    assertNotNull (BaseClassA.fromFudgeMsg (m));
  }
  
}