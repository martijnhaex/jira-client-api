package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Version {
    @JsonProperty
    private String name;
    @JsonProperty
    private String description;
    @JsonProperty
    private boolean arhived;
    @JsonProperty
    private boolean released;
    @JsonProperty
    private DateTime releaseDate;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isArhived() {
        return arhived;
    }

    public boolean isReleased() {
        return released;
    }

    public DateTime getReleaseDate() {
        return releaseDate;
    }
}
