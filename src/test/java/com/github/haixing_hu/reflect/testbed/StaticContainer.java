/******************************************************************************
 *
 * Copyright (c) 2013  Haixing Hu
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
 *
 ******************************************************************************/

package com.github.haixing_hu.reflect.testbed;

public class StaticContainer {
  public static final Object IMMUTABLE_PUBLIC = "public";
  protected static final Object IMMUTABLE_PROTECTED = "protected";
  static final Object IMMUTABLE_PACKAGE = "";
  @SuppressWarnings("unused")
  private static final Object IMMUTABLE_PRIVATE = "private";

  public static Object mutablePublic;
  protected static Object mutableProtected;
  static Object mutablePackage;
  private static Object mutablePrivate;

  public static void reset() {
    mutablePublic = null;
    mutableProtected = null;
    mutablePackage = null;
    mutablePrivate = null;
  }

  public static Object getMutableProtected() {
    return mutableProtected;
  }

  public static Object getMutablePackage() {
    return mutablePackage;
  }

  public static Object getMutablePrivate() {
    return mutablePrivate;
  }
}
