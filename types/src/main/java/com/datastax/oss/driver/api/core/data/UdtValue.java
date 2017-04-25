/*
 * Copyright (C) 2017-2017 DataStax Inc.
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
package com.datastax.oss.driver.api.core.data;

import com.datastax.oss.driver.api.core.detach.Detachable;
import com.datastax.oss.driver.api.type.UserDefinedType;
import java.io.Serializable;

/**
 * Driver-side representation of an instance of a CQL user defined type.
 *
 * <p>It is an ordered set of named, typed fields.
 *
 * <p>A tuple value is attached if and only if its type is attached (see {@link Detachable}).
 */
public interface UdtValue
    extends GettableById,
        GettableByName,
        SettableById<UdtValue>,
        SettableByName<UdtValue>,
        Serializable {

  UserDefinedType getType();
}