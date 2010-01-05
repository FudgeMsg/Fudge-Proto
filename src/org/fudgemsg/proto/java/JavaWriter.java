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

import java.io.IOException;

import org.fudgemsg.proto.IndentWriter;
import org.fudgemsg.proto.MessageDefinition;
import org.fudgemsg.proto.EnumDefinition;

/**
 * Helper class for JavaClassCode for dealing with repeated code constructs.
 */
/* package */ class JavaWriter {
  
  private final JavaWriter _parent;
  
  private final IndentWriter _writer;
  
  private int _scope;
  
  /* package */ JavaWriter (final IndentWriter writer) {
    _writer = writer;
    _parent = null;
    _scope = 1;
  }
  
  /* package */ JavaWriter (final JavaWriter parent) {
    _parent = parent;
    _writer = parent._writer;
    _scope = parent._scope;
  }
  
  /* package */ void namedLocalVariable (final String type, final String name, final String value) throws IOException {
    if (value != null) {
      _writer.write ("final ");
    }
    _writer.write (type);
    _writer.write (' ');
    _writer.write (name);
    if (value != null) {
      _writer.write (" = ");
      _writer.write (value);
    }
  }
  
  /* package */ String localVariable (final String type, final boolean isFinal) throws IOException {
    final StringBuilder sb = new StringBuilder ("tmp").append (_scope++);
    if (isFinal) _writer.write ("final ");
    _writer.write (type);
    _writer.write (' ');
    _writer.write (sb.toString ());
    return sb.toString ();
  }
  
  /* package */ String localVariable (final String type, final boolean isFinal, final String value) throws IOException {
    final String lv = localVariable (type, isFinal);
    _writer.write (" = ");
    _writer.write (value);
    return lv;
  }
  
  /* package */ String forEach (final String clazz, final String collection) throws IOException {
    _writer.write ("for (");
    final String field = localVariable (clazz, false);
    _writer.write (" : ");
    _writer.write (collection);
    _writer.write (')');
    return field;
  }
  
  /* package */ String forEachIndex (final String array) throws IOException {
    _writer.write ("for (");
    final String index = localVariable ("int", false, "0");
    _writer.write ("; ");
    _writer.write (index);
    _writer.write (" < ");
    _writer.write (array);
    _writer.write (".length; ");
    _writer.write (index);
    _writer.write ("++)");
    return index;
  }
  
  /* package */ void throwInvalidFudgeFieldException (final MessageDefinition message, final String fieldRef, final String expected, final String cause) throws IOException {
    _writer.write ("throw new IllegalArgumentException (\"Fudge message is not a ");
    _writer.write (message.getName ());
    _writer.write (" - field '");
    _writer.write (fieldRef);
    _writer.write ("' is not ");
    _writer.write (expected);
    _writer.write ("\"");
    if (cause != null) {
      _writer.write (", ");
      _writer.write (cause);
    }
    _writer.write (")");
  }

  /* package */ void defaultThrowInvalidFudgeEnumException (final EnumDefinition enumDefinition, final String encodedValueExpr) throws IOException {
    _writer.write ("default : throw new IllegalArgumentException (\"Field is not a ");
    _writer.write (enumDefinition.getName ());
    _writer.write (" - invalid value '\" + ");
    _writer.write (encodedValueExpr);
    _writer.write (" + \"'\")");
  }

  /* package */ void elseThrowInvalidFudgeFieldException (final MessageDefinition message, final String fieldRef, final String expected, final String cause) throws IOException {
    _writer.write ("else ");
    throwInvalidFudgeFieldException (message, fieldRef, expected, cause);
  }
  
  /* package */ void ifNotFieldTypeMatch (final String fudgeType, final String localVariable) throws IOException {
    _writer.write ("if (!");
    _writer.write (fudgeType);
    _writer.write (".equals (");
    _writer.write (localVariable);
    _writer.write (".getType ())) ");
  }
    
  /* package */ void ifFieldTypeMatch (final String fudgeType, final String localVariable) throws IOException {
    _writer.write ("if (");
    _writer.write (fudgeType);
    _writer.write (".equals (");
    _writer.write (localVariable);
    _writer.write (".getType ())) ");
  }
  
  /* package */ void ifInstanceOf (final String test, final String clazz) throws IOException {
    _writer.write ("if (");
    _writer.write (test);
    _writer.write (" instanceof ");
    _writer.write (clazz);
    _writer.write (") ");
  }

  /* package */ void ifNull (final String test) throws IOException {
    _writer.write ("if (");
    _writer.write (test);
    _writer.write (" == null) ");
  }
  
  /* package */ void ifNotNull (final String test) throws IOException {
    _writer.write ("if (");
    _writer.write (test);
    _writer.write (" != null) ");
  }
  
  /* package */ void ifZero (final String test) throws IOException {
    _writer.write ("if (");
    _writer.write (test);
    _writer.write (" == 0) ");
  }
  
  /* package */ void ifGtZero (final String test) throws IOException {
    _writer.write ("if (");
    _writer.write (test);
    _writer.write (" > 0) ");
  }
  
  /* package */ void ifBool (final String test) throws IOException {
    _writer.write ("if (");
    _writer.write (test);
    _writer.write (") ");
  }

  /* package */ void elseIfFieldTypeMatch (final String fudgeType, final String localVariable) throws IOException {
    _writer.write ("else ");
    ifFieldTypeMatch (fudgeType, localVariable);
  }
  
  /* package */ void assignment (final String variable, final String value) throws IOException {
    _writer.write (variable);
    _writer.write (" = ");
    _writer.write (value);
  }
  
  /* package */ void assignmentGetValueCast (final String target, final String source, final String type) throws IOException {
    _writer.write (target);
    _writer.write (" = (");
    _writer.write (type);
    _writer.write (')');
    _writer.write (source);
    _writer.write (".getValue ()");
  }
  
  /* package */ void invoke (final String object, final String method, final String params) throws IOException {
    _writer.write (object);
    _writer.write ('.');
    invoke (method, params);
  }
  
  /* package */ void invoke (final String target, final String params) throws IOException {
    _writer.write (target);
    _writer.write (" (");
    if (params != null) _writer.write (params);
    _writer.write (')');
  }
  
  /* package */ void guard () throws IOException {
    _writer.write ("try");
  }
  
  /* package */ void catchIllegalArgumentException () throws IOException {
    _writer.write ("catch (IllegalArgumentException e)");
  }
  
  /* package */ void method (final boolean isStatic, final String returnType, final String name, final String params) throws IOException {
    _writer.write ("public ");
    if (isStatic) _writer.write ("static ");
    _writer.write (returnType);
    _writer.write (' ');
    _writer.write (name);
    _writer.write (" (");
    if (params != null) _writer.write (params);
    _writer.write (')');
  }
  
  /* package */ void constructor (final boolean isPublic, final String clazz, final String params) throws IOException {
    _writer.write (isPublic ? "public " : "private ");
    _writer.write (clazz);
    _writer.write (" (");
    if (params != null) _writer.write (params);
    _writer.write (')');
  }

  /* package */ void attribute (final boolean isFinal, final String type, final String name) throws IOException {
    _writer.write ("private ");
    if (isFinal) _writer.write ("final ");
    _writer.write (type);
    _writer.write (' ');
    _writer.write (name);
  }
  
  /* package */ void publicStaticFinal (final String type, final String name, final String value) throws IOException {
    _writer.write ("public static final ");
    _writer.write (type);
    _writer.write (' ');
    _writer.write (name);
    _writer.write (" = ");
    _writer.write (value);
  }

  /* package */ void returnInvoke (final String target, final String params) throws IOException {
    _writer.write ("return ");
    invoke (target, params);
  }
  
  /* package */ void returnVariable (final String variable) throws IOException {
    _writer.write ("return ");
    _writer.write (variable);
  }
  
  /* package */ void returnIfNull (final String test, final String notNull, final String ifNull) throws IOException {
    _writer.write ("return (");
    _writer.write (test);
    _writer.write (" != null) ? ");
    _writer.write (notNull);
    _writer.write (" : ");
    _writer.write (ifNull);
  }
  
  /* package */ void returnThis () throws IOException {
    _writer.write ("return this");
  }
  
  /* package */ void returnConstruct (final String clazz, final String params) throws IOException {
    _writer.write ("return new ");
    _writer.write (clazz);
    _writer.write (" (");
    if (params != null) _writer.write (params);
    _writer.write (')');
  }
  
  /* package */ void returnNullIfZero (final String test) throws IOException {
    _writer.write ("if (");
    _writer.write (test);
    _writer.write (" == 0) return null");
  }

  /* package */ void throwIndexOutOfBoundsException (final String variable) throws IOException {
    _writer.write ("throw new IndexOutOfBoundsException (\"");
    _writer.write (variable);
    _writer.write ("=\" + ");
    _writer.write (variable);
    _writer.write (')');
  }
  
  /* package */ void select (final String variable) throws IOException {
    _writer.write ("switch (");
    _writer.write (variable);
    _writer.write (')');
  }
  
  /* package */ void selectCaseReturn (final String caseValue, final String retValue) throws IOException {
    _writer.write ("case ");
    _writer.write (caseValue);
    _writer.write (" : return ");
    _writer.write (retValue);
  }
  
  /* package */ void classDef (final boolean isStatic, final String clazz, final String extendsClass) throws IOException {
    _writer.write ("public ");
    if (isStatic) _writer.write ("static ");
    _writer.write (" final class ");
    _writer.write (clazz);
    if (extendsClass != null) {
      _writer.write (" extends ");
      _writer.write (extendsClass);
    }
  }
  
  /* package */ void packageDef (final String namespace) throws IOException {
    _writer.write ("package ");
    _writer.write (namespace);
  }

  /* package */ void enumDef (final String clazz) throws IOException {
    _writer.write ("public enum ");
    _writer.write (clazz);
  }
  
  /* package */ void enumElementSeparator () throws IOException {
    _writer.write (',');
    _writer.newLine ();
  }
  
  /* package */ void enumElement (final String id, final String params) throws IOException {
    _writer.write (id);
    if (params != null) {
      _writer.write (" (");
      _writer.write (params);
      _writer.write (')');
    }
  }

  /* package */ IndentWriter getWriter () {
    return _writer;
  }
  
  /* package */JavaWriter getParent () {
    return _parent;
  }
  
}