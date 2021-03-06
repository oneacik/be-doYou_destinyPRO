
package com.github.fairit.destinypro.entity.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DisplayProperties {

    @JsonProperty("description")
    private String description;

    @JsonProperty("name")
    private String name;

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
