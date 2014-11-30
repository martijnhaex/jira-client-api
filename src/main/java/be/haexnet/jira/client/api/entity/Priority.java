package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Priority {
    @JsonProperty
    private String name;
    @JsonProperty
    private String iconUrl;

    public String getName() {
        return name;
    }

    public String getIconUrl() {
        return iconUrl;
    }
}
