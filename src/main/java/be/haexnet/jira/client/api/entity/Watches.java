package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Watches {
    @JsonProperty
    private Integer watchCount;
    @JsonProperty
    private boolean isWatching;

    public Integer getWatchCount() {
        return watchCount;
    }

    public boolean isWatching() {
        return isWatching;
    }
}
