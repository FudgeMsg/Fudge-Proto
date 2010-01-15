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

package org.fudgemsg.proto.tests;

public enum ExternalEnum {
  APPLE,
  BANANA;
  
  public int getFudgeEncoding () {
    return ordinal ();
  }
  
  public static ExternalEnum fromFudgeEncoding (final int fudgeEncoding) {
    switch (fudgeEncoding) {
    case 0 : return APPLE;
    case 1 : return BANANA;
    default : return null;
    }
  }
  
}