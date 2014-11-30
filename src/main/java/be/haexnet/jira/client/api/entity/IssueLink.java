package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IssueLink {
    @JsonProperty
    private IssueLinkType type;
    @JsonProperty
    private Issue inwardIssue;
    @JsonProperty
    private Issue outwardIssue;

    public IssueLinkType getType() {
        return type;
    }

    public Issue getInwardIssue() {
        return inwardIssue;
    }

    public Issue getOutwardIssue() {
        return outwardIssue;
    }
}
