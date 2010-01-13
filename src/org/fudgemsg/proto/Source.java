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

import java.io.IOException;
import java.io.Reader;

/**
 * Abstract interface of a source file, sufficient to feed the lexing phase and resolve related files. Any
 * subclass must implement an equals method to work properly. 
 * 
 * @author Andrew
 */
public interface Source {
  
  /**
   * Returns a Reader that can deliver the source code to the lexer. The lexer will call close on the reader
   * when it is done to release any system resources.
   */
  public Reader openReader () throws IOException;
  
  /**
   * Indicates whether the source is to be used to drive output, or is merely for reference.
   */
  public boolean isCompilationTarget ();
  
  /**
   * Returns a Source object that contains a given definition (e.g. based on filesystem conventions), or null
   * if there is none available.
   */
  public Source findSource (final String identifier) throws IOException;

}