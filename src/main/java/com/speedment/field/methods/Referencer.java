/**
 *
 * Copyright (c) 2006-2015, Speedment, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); You may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.speedment.field.methods;

import com.speedment.annotation.Api;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author Emil Forslund
 * @param <ENTITY> the entity
 * @param <FK> the type of the foreign key stream
 */
@Api(version = "2.2")
public interface Referencer<ENTITY, FK> extends Function<ENTITY, Stream<FK>> {

}