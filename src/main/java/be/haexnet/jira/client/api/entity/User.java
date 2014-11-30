package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    @JsonProperty
    private String name;
    @JsonProperty
    private String displayName;
    @JsonProperty
    private String emailAddress;
    @JsonProperty
    private boolean active;
    @JsonProperty(value = "avatarUrls")
    private Avatar avatar;

    public String getName() {
        return name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public boolean isActive() {
        return active;
    }

    public Avatar getAvatar() {
        return avatar;
    }
}
