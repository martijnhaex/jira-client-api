package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NewWorkLog {
    @JsonProperty
    private User author;
    @JsonProperty
    private User updateAuthor;
    @JsonProperty
    private String comment;
    @JsonProperty
    private DateTime started;
    @JsonProperty
    private String timeSpent;
    @JsonProperty(value = "timeSpentSeconds")
    private Long timeSpentInSeconds;

    public User getAuthor() {
        return author;
    }

    public User getUpdateAuthor() {
        return updateAuthor;
    }

    public String getComment() {
        return comment;
    }

    public DateTime getStarted() {
        return started;
    }

    public String getTimeSpent() {
        return timeSpent;
    }

    public Long getTimeSpentInSeconds() {
        return timeSpentInSeconds;
    }
}
