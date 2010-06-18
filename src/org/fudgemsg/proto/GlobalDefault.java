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

public class GlobalDefault {
  
  // CodeGeneratorFactory
  private static String s_codeGeneratorLanguage = getProperty (CodeGenerator.class, "language", org.fudgemsg.proto.java.JavaCodeGenerator.LANG_ID);
  
  // Compiler
  private static boolean s_compilerFieldsMutable = getProperty (Compiler.class, "fieldsMutable", true);
  private static boolean s_compilerFieldsRequired = getProperty (Compiler.class, "fieldsRequired", false);
  private static boolean s_compilerRethrowExceptions = getProperty (Compiler.class, "rethrowExceptions", false);
  
  private GlobalDefault () {
  }
  
  protected static boolean getProperty (final Class<?> clazz, final String key, final boolean defaultValue) {
    String prop = getProperty (clazz, key, null);
    if (prop == null) return defaultValue;
    return prop.equalsIgnoreCase ("true");
  }
  
  protected static String getProperty (final Class<?> clazz, final String key, final String defaultValue) {
    return System.getProperty (clazz.getName () + "." + key, defaultValue);
  }
  
  public static String getCodeGeneratorLanguage () {
    return s_codeGeneratorLanguage;
  }
  
  public static synchronized void setCodeGeneratorLanguage (final String language) {
    s_codeGeneratorLanguage = language;
  }

  public static synchronized boolean isCompilerFieldsMutable () {
    return s_compilerFieldsMutable;
  }
  
  public static synchronized void setCompilerFieldsMutable (final boolean fieldsMutable) {
    s_compilerFieldsMutable = fieldsMutable;
  }
  
  public static synchronized boolean isCompilerFieldsRequired () {
    return s_compilerFieldsRequired;
  }
  
  public static synchronized void setCompilerFieldsRequired (final boolean fieldsRequired) {
    s_compilerFieldsRequired = fieldsRequired;
  }
  
  public static synchronized boolean isCompilerRethrowExceptions () {
    return s_compilerRethrowExceptions;
  }
  
  public static synchronized void setCompilerRethrowExceptions (final boolean rethrowExceptions) {
    s_compilerRethrowExceptions = rethrowExceptions;
  }
  
}