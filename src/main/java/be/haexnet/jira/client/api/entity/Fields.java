package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fields {
    @JsonProperty
    private String summary;
    @JsonProperty(value = "timetracking")
    private TimeTracking timeTracking;
    @JsonProperty(value = "issuetype")
    private IssueType issueType;
    @JsonProperty
    private User reporter;
    @JsonProperty
    private DateTime updated;
    @JsonProperty
    private DateTime created;
    @JsonProperty
    private String description;
    @JsonProperty
    private Priority priority;
    @JsonProperty
    private Status status;
    @JsonProperty
    private Project project;
    @JsonProperty
    private DateTime lastViewed;

    public String getSummary() {
        return summary;
    }

    public TimeTracking getTimeTracking() {
        return timeTracking;
    }

    public IssueType getIssueType() {
        return issueType;
    }

    public User getReporter() {
        return reporter;
    }

    public DateTime getUpdated() {
        return updated;
    }

    public DateTime getCreated() {
        return created;
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }

    public Project getProject() {
        return project;
    }

    public DateTime getLastViewed() {
        return lastViewed;
    }
}
