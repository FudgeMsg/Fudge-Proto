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

package org.fudgemsg.proto.java;

import org.fudgemsg.proto.proto.InnerClassCodeGenerator;

/**
 * Code generator for the Java Fudge implementation
 * 
 * @author Andrew
 */
public class JavaCodeGenerator extends InnerClassCodeGenerator {
  
  public static final String LANG_ID = "Java";
  
  public JavaCodeGenerator () {
    super (JavaClassCode.INSTANCE);
  }
   
}