package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueType {
    @JsonProperty
    private String name;
    @JsonProperty
    private String description;
    @JsonProperty
    private String iconUrl;
    @JsonProperty
    private boolean subTask;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public boolean isSubTask() {
        return subTask;
    }
}
