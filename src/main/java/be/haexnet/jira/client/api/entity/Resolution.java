package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Resolution {
    @JsonProperty
    private String name;
    @JsonProperty
    private String description;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
