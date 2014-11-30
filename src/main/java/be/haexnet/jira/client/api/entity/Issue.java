package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Issue {
    @JsonProperty
    private String key;
    @JsonProperty
    private Fields fields;

    public String getKey() {
        return key;
    }

    public Fields getFields() {
        return fields;
    }
}
