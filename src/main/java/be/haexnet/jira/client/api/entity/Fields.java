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
    @JsonProperty(value = "issuelinks")
    private List<IssueLink> issueLinks;
    @JsonProperty(value = "subtasks")
    private List<Issue> subTasks;
    @JsonProperty
    private Status status;
    @JsonProperty
    private List<String> labels;
    @JsonProperty(value = "workratio")
    private Long workRatio;
    @JsonProperty
    private Project project;
    @JsonProperty
    private String environment;
    @JsonProperty
    private DateTime lastViewed;
    @JsonProperty(value = "aggregateprogress")
    private Progress aggregateProgess;
    @JsonProperty
    private List<Component> components;
    @JsonProperty(value = "comment")
    private Comments comments;
    @JsonProperty(value = "timeoriginalestimate")
    private Long timeOriginalEstimate;
    @JsonProperty
    private Votes votes;
    @JsonProperty
    private List<FixVersion> fixVersions;
    @JsonProperty
    private Resolution resolution;
    @JsonProperty(value = "resolutiondate")
    private DateTime resolutionDate;
    @JsonProperty
    private User creator;
    @JsonProperty(value = "aggregatetimeoriginalestimate")
    private Long aggregateTimeOriginalEstimate;
    @JsonProperty(value = "duedate")
    private DateTime dueDate;
    @JsonProperty
    private Watches watches;
    @JsonProperty(value = "worklog")
    private WorkLogs workLog;
    @JsonProperty
    private User assignee;
    @JsonProperty(value = "attachment")
    private List<Attachment> attachments;
    @JsonProperty(value = "aggregatetimeestimate")
    private Long aggregateTimeEstimate;
    @JsonProperty
    private List<Version> versions;
    @JsonProperty(value = "timeestimate")
    private Long timeEstimate;
    @JsonProperty(value = "aggregatetimespent")
    private Long aggregateTimeSpent;

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

    public List<IssueLink> getIssueLinks() {
        return issueLinks;
    }

    public List<Issue> getSubTasks() {
        return subTasks;
    }

    public Status getStatus() {
        return status;
    }

    public List<String> getLabels() {
        return labels;
    }

    public Long getWorkRatio() {
        return workRatio;
    }

    public Project getProject() {
        return project;
    }

    public String getEnvironment() {
        return environment;
    }

    public DateTime getLastViewed() {
        return lastViewed;
    }

    public Progress getAggregateProgess() {
        return aggregateProgess;
    }

    public List<Component> getComponents() {
        return components;
    }

    public Comments getComments() {
        return comments;
    }

    public Long getTimeOriginalEstimate() {
        return timeOriginalEstimate;
    }

    public Votes getVotes() {
        return votes;
    }

    public List<FixVersion> getFixVersions() {
        return fixVersions;
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

    public Long getAggregateTimeOriginalEstimate() {
        return aggregateTimeOriginalEstimate;
    }

    public DateTime getDueDate() {
        return dueDate;
    }

    public Watches getWatches() {
        return watches;
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

    public Long getAggregateTimeEstimate() {
        return aggregateTimeEstimate;
    }

    public List<Version> getVersions() {
        return versions;
    }

    public Long getTimeEstimate() {
        return timeEstimate;
    }

    public Long getAggregateTimeSpent() {
        return aggregateTimeSpent;
    }
}
