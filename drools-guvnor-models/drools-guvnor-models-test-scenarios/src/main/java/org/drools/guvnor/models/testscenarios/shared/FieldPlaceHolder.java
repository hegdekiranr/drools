/*
 * Copyright 2012 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.guvnor.models.testscenarios.shared;

/**
 * This is just a place holder for empty field cells.
 */
public class FieldPlaceHolder implements Field {

    private String name;

    public FieldPlaceHolder() {
    }

    public FieldPlaceHolder( final String name ) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}