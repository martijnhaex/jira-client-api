package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueLinkType {
    @JsonProperty
    private String name;
    @JsonProperty
    private String inward;
    @JsonProperty
    private String outward;

    public String getName() {
        return name;
    }

    public String getInward() {
        return inward;
    }

    public String getOutward() {
        return outward;
    }
}
