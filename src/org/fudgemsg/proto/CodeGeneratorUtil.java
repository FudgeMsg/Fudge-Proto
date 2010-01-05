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

package org.fudgemsg.proto;

import java.io.File;

/**
 * Helper class for functions common to 2 or more of the code generator implementations.
 * 
 * @author Andrew
 */
public class CodeGeneratorUtil {
  
  /**
   * Private constructor to prevent instantiation.
   */
  private CodeGeneratorUtil () {
  }
  
  /**
   * Checks a directory exists.
   */
  public static boolean checkDirectory (final Compiler.Context context, final File file) {
    if (!file.exists ()) {
      if (!file.mkdirs ()) {
        context.error (null, "couldn't create target directory '" + file.getPath () + "'");
        return false;
      }
    }
    if (!file.isDirectory ()) {
      context.error (null, "target '" + file.getPath () + "' is not a directory");
      return false;
    }
    return true;
  }
  
  /**
   * Splits an identifier into its namespace components and returns a File representing the target folder
   * for Java-style packaging builds.
   */
  public static File applyNamespace (final Compiler.Context context, File file, final String[] identifier) {
    if (!checkDirectory (context, file)) return null;
    for (int i = 0; i < identifier.length - 1; i++) {
      file = new File (file, identifier[i]);
      if (!checkDirectory (context, file)) return null;
    }
    return file;
  }

}