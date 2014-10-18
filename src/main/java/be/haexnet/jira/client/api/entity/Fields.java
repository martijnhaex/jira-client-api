package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;

import java.util.List;

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
    private List<String> labels;
    @JsonProperty
    private Project project;
    @JsonProperty
    private DateTime lastViewed;
    @JsonProperty(value = "comment")
    private Comments comments;
    @JsonProperty
    private Votes votes;
    @JsonProperty
    private Resolution resolution;
    @JsonProperty(value = "resolutiondate")
    private DateTime resolutionDate;
    @JsonProperty
    private User creator;
    @JsonProperty(value = "duedate")
    private DateTime dueDate;
    @JsonProperty(value = "worklog")
    private WorkLogs workLog;
    @JsonProperty
    private User assignee;
    @JsonProperty(value = "attachment")
    private List<Attachment> attachments;

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

    public List<String> getLabels() {
        return labels;
    }

    public Project getProject() {
        return project;
    }

    public DateTime getLastViewed() {
        return lastViewed;
    }

    public Comments getComments() {
        return comments;
    }

    public Votes getVotes() {
        return votes;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public DateTime getResolutionDate() {
        return resolutionDate;
    }

    public User getCreator() {
        return creator;
    }

    public DateTime getDueDate() {
        return dueDate;
    }

    public WorkLogs getWorkLog() {
        return workLog;
    }

    public User getAssignee() {
        return assignee;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }
}
