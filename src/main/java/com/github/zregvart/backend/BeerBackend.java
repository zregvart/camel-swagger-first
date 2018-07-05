/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.zregvart.backend;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("backend")
public class BeerBackend {

    List<Beer> beers = Arrays.asList(paleAle(), germanIpa(), porter());

    public List<Beer> getAllBeers() {
        return Collections.unmodifiableList(beers);
    }

    private static Beer germanIpa() {
        return new Beer(2, "Brlo German IPA", "Indian Pale Ale", 7, 50, 12, 1);
    }

    private static Beer paleAle() {
        return new Beer(1, "Brlo Pale Ale", "Pale Ale", 6, 40, 12, 1);
    }

    private static Beer porter() {
        return new Beer(3, "Brlo Porter", "Porter", 7, 35, 12, 1);
    }
}
