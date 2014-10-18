package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Comment {
    @JsonProperty
    private User author;
    @JsonProperty(value = "body")
    private String message;
    @JsonProperty
    private User updateAuthor;
    @JsonProperty
    private DateTime created;
    @JsonProperty
    private DateTime updated;

    public User getAuthor() {
        return author;
    }

    public String getMessage() {
        return message;
    }

    public User getUpdateAuthor() {
        return updateAuthor;
    }

    public DateTime getCreated() {
        return created;
    }

    public DateTime getUpdated() {
        return updated;
    }
}
