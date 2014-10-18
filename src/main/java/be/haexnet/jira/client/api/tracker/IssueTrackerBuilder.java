package be.haexnet.jira.client.api.tracker;

import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.springframework.util.Assert.state;

public class IssueTrackerBuilder {

    private static final String REST_ISSUE_URL = "/rest/api/2/issue/";

    private String issueKey;

    private IssueTrackerBuilder() {

    }

    public static IssueTrackerBuilder issueWith() {
        return new IssueTrackerBuilder();
    }

    public IssueTrackerBuilder issueKey(final String issueKey) {
        this.issueKey = issueKey;
        return this;
    }

    public String getRestUrl() {
        state(isNotBlank(issueKey), "Cannot build issue url, please set the issue key first.");
        return REST_ISSUE_URL.concat(issueKey);
    }
}
