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

public class Beer {

    int id;

    String name;

    String style;

    double abv;

    double ibu;

    double ounces;

    int breweryId;

    public Beer(int id, String name, String style, double abv, double ibu, double ounces, int breweryId) {
        super();
        this.id = id;
        this.name = name;
        this.style = style;
        this.abv = abv;
        this.ibu = ibu;
        this.ounces = ounces;
        this.breweryId = breweryId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public double getAbv() {
        return abv;
    }

    public double getIbu() {
        return ibu;
    }

    public double getOunces() {
        return ounces;
    }

    public int getBreweryId() {
        return breweryId;
    }

}
