package com.github.zregvart;

import javax.annotation.Generated;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;

/**
 * Generated from Swagger specification by Camel REST DSL generator.
 */
@Generated("org.apache.camel.generator.swagger.PathGenerator")
public final class BeerRoute extends RouteBuilder {
    /**
     * Defines Apache Camel routes using REST DSL fluent API.
     */
    public void configure() {
        rest()
            .get("/beers")
                .id("getAllBeers")
                .description("Returns all of the beers.")
                .param()
                    .name("style")
                    .type(RestParamType.query)
                    .dataType("string")
                    .required(false)
                    .description("Optional: filter by the style of the beer (e.g. lager).")
                .endParam()
                .to("bean:backend?method=getAllBeers")
            .post("/beers")
                .id("addBeer")
                .description("Adds a beer to the data set.")
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(false)
                    .description("The beer to add.")
                .endParam()
                .to("bean:backend?method=addBeer")
            .get("/beers/{beerId}")
                .id("getBeer")
                .description("Returns full information about a single beer.")
                .param()
                    .name("beerId")
                    .type(RestParamType.path)
                    .dataType("integer")
                    .required(true)
                    .description("The unique ID of a beer.")
                .endParam()
                .to("bean:backend?method=getBeer")
            .put("/beers/{beerId}")
                .id("updateBeer")
                .description("Updates information about a single beer.")
                .param()
                    .name("beerId")
                    .type(RestParamType.path)
                    .dataType("integer")
                    .required(true)
                    .description("The unique ID of a beer.")
                .endParam()
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(false)
                    .description("The beer to update.")
                .endParam()
                .to("bean:backend?method=updateBeer")
            .delete("/beers/{beerId}")
                .id("deleteBeer")
                .description("Removes a single beer from the data set.")
                .param()
                    .name("beerId")
                    .type(RestParamType.path)
                    .dataType("integer")
                    .required(true)
                    .description("The unique ID of a beer.")
                .endParam()
                .to("bean:backend?method=deleteBeer")
            .get("/breweries")
                .id("getAllBreweries")
                .description("Returns a list of all breweries.")
                .param()
                    .name("city")
                    .type(RestParamType.query)
                    .dataType("string")
                    .required(false)
                    .description("Optional: filter by city.")
                .endParam()
                .param()
                    .name("state")
                    .type(RestParamType.query)
                    .dataType("string")
                    .required(false)
                    .description("Optional: filter by state.")
                .endParam()
                .to("bean:backend?method=getAllBreweries")
            .post("/breweries")
                .id("addBrewery")
                .description("Adds a single brewery to the data set.")
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(false)
                    .description("New brewery info.")
                .endParam()
                .to("bean:backend?method=addBrewery")
            .get("/breweries/{breweryId}")
                .id("getBrewery")
                .description("Returns full information about a single brewery.")
                .param()
                    .name("breweryId")
                    .type(RestParamType.path)
                    .dataType("integer")
                    .required(true)
                    .description("Unique ID of a brewery.")
                .endParam()
                .to("bean:backend?method=getBrewery")
            .put("/breweries/{breweryId}")
                .id("updateBrewery")
                .description("Updates information about a single brewery.")
                .param()
                    .name("breweryId")
                    .type(RestParamType.path)
                    .dataType("integer")
                    .required(true)
                    .description("Unique ID of a brewery.")
                .endParam()
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(false)
                    .description("Updated brewery information.")
                .endParam()
                .to("bean:backend?method=updateBrewery")
            .delete("/breweries/{breweryId}")
                .id("deleteBrewery")
                .description("Removes a single brewery from the data set.")
                .param()
                    .name("breweryId")
                    .type(RestParamType.path)
                    .dataType("integer")
                    .required(true)
                    .description("Unique ID of a brewery.")
                .endParam()
                .to("bean:backend?method=deleteBrewery")
            .get("/breweries/{breweryId}/beers")
                .id("listBreweryBeers")
                .description("Returns all of the beers made by the brewery.")
                .param()
                    .name("breweryId")
                    .type(RestParamType.path)
                    .dataType("integer")
                    .required(true)
                    .description("The unique ID of a brewery.")
                .endParam()
                .to("bean:backend?method=listBreweryBeers")
            .post("/breweries/{breweryId}/beers")
                .id("addBeerToBrewery")
                .description("Adds a single beer to the data set for this brewery.")
                .param()
                    .name("breweryId")
                    .type(RestParamType.path)
                    .dataType("integer")
                    .required(true)
                    .description("The unique ID of a brewery.")
                .endParam()
                .param()
                    .name("body")
                    .type(RestParamType.body)
                    .required(false)
                    .description("Information about a new beer.")
                .endParam()
                .to("bean:backend?method=addBeerToBrewery");
    }
}