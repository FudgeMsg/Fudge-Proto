/*
 * Copyright 2009 by OpenGamma Inc and other contributors.
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

package org.fudgemsg.proto.cpp;

import org.fudgemsg.proto.proto.ClassCodeGenerator;

/**
 * Code generator implementation for the C++ Fudge implementation
 * 
 * @author Andrew
 */
public class CPPCodeGenerator extends ClassCodeGenerator {
  
  public static final String LANG_ID = "C++";
  
  public CPPCodeGenerator () {
    super (CPPClassCode.INSTANCE);
  }

}