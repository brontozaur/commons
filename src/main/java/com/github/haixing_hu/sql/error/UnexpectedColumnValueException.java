/*
 * Copyright (c) 2014  Haixing Hu
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
 */
package com.github.haixing_hu.sql.error;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Thrown to indicated an unexpected column value in a {@link ResultSet}.
 *
 * @author Haixing Hu
 */
public class UnexpectedColumnValueException extends SQLException {

  private static final long serialVersionUID = 6610363067051998337L;

  public UnexpectedColumnValueException(final int columnIndex,
      final Object value) {
    super("Unexpected column value at column index " + columnIndex + ": "
        + value);
  }

  public UnexpectedColumnValueException(final String columnLabel,
      final Object value) {
    super("Unexpected column value at column '" + columnLabel + "': " + value);
  }

}
