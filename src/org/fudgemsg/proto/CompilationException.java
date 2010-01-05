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

/**
 * An unchecked exception that is thrown by the default error handler.
 * 
 * @author Andrew
 */
public class CompilationException extends RuntimeException {
  
  private static final long serialVersionUID = -6129331220822063895L;

  /* package */ CompilationException (final String message) {
    super (message);
  }
  
  /* package */ CompilationException (final String message, final Throwable cause) {
    super (message, cause);
  }
  
}