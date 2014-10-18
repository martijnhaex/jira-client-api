package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Project {
    @JsonProperty
    private String key;
    @JsonProperty
    private String name;
    @JsonProperty(value = "avatarUrls")
    private Avatar avatar;

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public Avatar getAvatar() {
        return avatar;
    }
}
