/*
 * Copyright 2009 by OpenGamma Inc and other contributors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
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

/**
 * Helper class for JavaClassCode for dealing with repeated code constructs and
 * the local variable stack, which
 * seemed like a good idea at the time but isn't really necessary.
 */
/* package */class JavaWriter {

  private final JavaWriter _parent;

  private final IndentWriter _writer;

  private int _scope;

  private boolean _anonValue;

  /* package */JavaWriter(final IndentWriter writer) {
    _writer = writer;
    _parent = null;
    _scope = 1;
    _anonValue = true;
  }

  /* package */JavaWriter(final JavaWriter parent) {
    _parent = parent;
    _writer = parent._writer;
    _scope = parent._scope;
    _anonValue = parent._anonValue;
  }

  /* package */void namedLocalVariable(final String type, final String name,
      final String value) throws IOException {
    if (value != null) {
      _writer.write("final ");
    }
    _writer.write(type);
    _writer.write(' ');
    _writer.write(name);
    if (value != null) {
      _writer.write(" = ");
      _writer.write(value);
    }
  }

  /* package */String localVariable(final String type, final boolean isFinal)
      throws IOException {
    final StringBuilder sb = new StringBuilder("fudge").append(_scope++);
    if (isFinal)
      _writer.write("final ");
    _writer.write(type);
    _writer.write(' ');
    _writer.write(sb.toString());
    return sb.toString();
  }

  /* package */String localVariable(final String type, final boolean isFinal,
      final String value) throws IOException {
    final String lv = localVariable(type, isFinal);
    _writer.write(" = ");
    _writer.write(value);
    return lv;
  }

  /* package */String forEach(final String clazz, final String collection)
      throws IOException {
    _writer.write("for (");
    final String field = localVariable(clazz, false);
    _writer.write(" : ");
    _writer.write(collection);
    _writer.write(')');
    return field;
  }

  /* package */String forEachIndex(final String array, final String limit)
      throws IOException {
    _writer.write("for (");
    final String index = localVariable("int", false, "0");
    _writer.write("; ");
    _writer.write(index);
    _writer.write(" < ");
    _writer.write(array);
    _writer.write('.');
    _writer.write(limit);
    _writer.write("; ");
    _writer.write(index);
    _writer.write("++)");
    return index;
  }

  /* package */void throwInvalidFudgeFieldException(
      final MessageDefinition message, final String fieldRef,
      final String expected, final String cause) throws IOException {
    _writer
        .write("throw new IllegalArgumentException (\"Fudge message is not a ");
    _writer.write(message.getName());
    _writer.write(" - field '");
    _writer.write(fieldRef);
    _writer.write("' is not ");
    _writer.write(expected);
    _writer.write('\"');
    if (cause != null) {
      _writer.write(", ");
      _writer.write(cause);
    }
    _writer.write(')');
  }

  /* package */void throwNullParameterException(final String variable)
      throws IOException {
    _writer.write("throw new NullPointerException (\"");
    _writer.write(variable);
    _writer.write(" must not be null\")");
  }

  /* package */void ifNull(final String test) throws IOException {
    _writer.write("if (");
    _writer.write(test);
    _writer.write(" == null) ");
  }

  /* package */void ifNotNull(final String test) throws IOException {
    _writer.write("if (");
    _writer.write(test);
    _writer.write(" != null) ");
  }

  /* package */void ifZero(final String test) throws IOException {
    _writer.write("if (");
    _writer.write(test);
    _writer.write(" == 0) ");
  }

  /* package */ void ifSizeNot (final String object, final String method, final int value) throws IOException {
    _writer.write ("if (");
    // object needs extra parens if it has a cast at the front
    if (object.charAt (0) == '(') _writer.write ('(');
    _writer.write (object);
    if (object.charAt (0) == '(') _writer.write (')');
    _writer.write ('.');
    _writer.write (method);
    _writer.write (" != ");
    _writer.write (Integer.toString (value));
    _writer.write (") ");
  }

  /* package */void ifGtZero(final String test) throws IOException {
    _writer.write("if (");
    _writer.write(test);
    _writer.write(" > 0) ");
  }

  /* package */void ifBool(final String test) throws IOException {
    _writer.write("if (");
    _writer.write(test);
    _writer.write(") ");
  }

  /* package */void assignment(final String variable, final String value)
      throws IOException {
    _writer.write(variable);
    _writer.write(" = ");
    _writer.write(value);
  }

  /* package */void assignmentConstruct(final String variable,
      final String clazz, final String params) throws IOException {
    _writer.write(variable);
    _writer.write(" = new ");
    _writer.write(clazz);
    _writer.write(" (");
    if (params != null)
      _writer.write(params);
    _writer.write(')');
  }

  /* package */void method(final String modifier, final String returnType,
      final String name, final String params) throws IOException {
    _writer.write(modifier);
    _writer.write(' ');
    _writer.write(returnType);
    _writer.write(' ');
    _writer.write(name);
    _writer.write(" (");
    if (params != null)
      _writer.write(params);
    _writer.write(')');
  }

  /* package */void constructor(final String visibility, final String clazz,
      final String params) throws IOException {
    _writer.write(visibility);
    _writer.write (' ');
    _writer.write(clazz);
    _writer.write(" (");
    if (params != null)
      _writer.write(params);
    _writer.write(')');
  }

  /* package */void attribute(final boolean isFinal, final String type,
      final String name) throws IOException {
    _writer.write("private ");
    if (isFinal)
      _writer.write("final ");
    _writer.write(type);
    _writer.write(' ');
    _writer.write(name);
  }

  /* package */void publicStaticFinal(final String type, final String name,
      final String value) throws IOException {
    _writer.write("public static final ");
    _writer.write(type);
    _writer.write(' ');
    _writer.write(name);
    _writer.write(" = ");
    _writer.write(value);
  }

  /* package */void invoke(final String object, final String method, final String params) throws IOException {
    _writer.write(object);
    _writer.write('.');
    invoke(method, params);
  }
  
  /* package */void invoke(final String target, final String params) throws IOException {
    _writer.write(target);
    _writer.write(" (");
    if (params != null) _writer.write(params);
    _writer.write(')');
  }
  
  /* package */void returnInvoke(final String target, final String params,
      final String cast) throws IOException {
    _writer.write("return ");
    if (cast != null) {
      _writer.write('(');
      _writer.write(cast);
      _writer.write(')');
    }
    invoke(target, params);
  }

  /* package */void returnVariable(final String variable) throws IOException {
    _writer.write("return ");
    _writer.write(variable);
  }

  /* package */void returnIfNull(final String test, final String notNull,
      final String ifNull) throws IOException {
    _writer.write("return (");
    _writer.write(test);
    _writer.write(" != null) ? ");
    _writer.write(notNull);
    _writer.write(" : ");
    _writer.write(ifNull);
  }

  /* package */void guard() throws IOException {
    _writer.write("try");
  }

  /* package */void catchIllegalArgumentException() throws IOException {
    _writer.write("catch (IllegalArgumentException e)");
  }
  
  /* package */void classDef(final boolean isAbstract, final boolean isStatic, final String clazz,
      final String extendsClass, final String interfaceClass)
      throws IOException {
    _writer.write("public ");
    if (isStatic)
      _writer.write("static ");
    if (isAbstract)
      _writer.write("abstract ");
    _writer.write("class ");
    _writer.write(clazz);
    if (extendsClass != null) {
      _writer.write(" extends ");
      _writer.write(extendsClass);
    }
    if (interfaceClass != null) {
      _writer.write(" implements ");
      _writer.write(interfaceClass);
    }
  }

  /* package */void packageDef(final String namespace) throws IOException {
    _writer.write("package ");
    _writer.write(namespace);
  }
  
  /* package */ void importLib (final String namespace) throws IOException {
    _writer.write ("import ");
    _writer.write (namespace);
  }

  /* package */void whileBool (final String expression) throws IOException {
    _writer.write ("while (");
    _writer.write (expression);
    _writer.write (')');
  }

  /* package */IndentWriter getWriter() {
    return _writer;
  }

  /* package */JavaWriter getParent() {
    return _parent;
  }

}
