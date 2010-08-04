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

import org.fudgemsg.FudgeContext;
import org.fudgemsg.FudgeFieldContainer;
import org.fudgemsg.proto.tests.polymorphism.M1;
import org.fudgemsg.proto.tests.polymorphism.M2;
import org.fudgemsg.proto.tests.polymorphism.M3;
import org.fudgemsg.proto.tests.polymorphism.M4;
import org.junit.Test;

public class PolymorphismTest {
  
  @Test
  public void testMessage () {
    M1 m1 = new M1 ();
    m1.setId ("this is M1");
    M2 m2 = new M2 ();
    m2.setId ("this is M2");
    m2.setFoo ("hello");
    M3 m3 = new M3 ();
    m3.setId ("this is M3");
    m3.setBar ("world");
    M4 m4 = new M4 ();
    m4.setFoo (m2);
    m4.setBar (m3);
    m4.setOther (m1);
    FudgeFieldContainer c = m4.toFudgeMsg (FudgeContext.GLOBAL_DEFAULT);
    System.out.println ("M4=" + c);
    M4 m_out = M4.fromFudgeMsg (c);
    assertEquals (M2.class, m_out.getFoo ().getClass ());
    assertEquals (M3.class, m_out.getBar ().getClass ());
    assertEquals (M1.class, m_out.getOther ().getClass ());
  }
  
}