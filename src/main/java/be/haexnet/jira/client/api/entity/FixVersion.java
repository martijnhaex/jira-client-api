package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FixVersion {
    @JsonProperty
    private String name;
    @JsonProperty
    private String description;
    @JsonProperty
    private boolean archived;
    @JsonProperty
    private boolean released;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isArchived() {
        return archived;
    }

    public boolean isReleased() {
        return released;
    }
}
