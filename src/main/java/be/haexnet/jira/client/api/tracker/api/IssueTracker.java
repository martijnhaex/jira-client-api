package be.haexnet.jira.client.api.tracker.api;

import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.springframework.util.Assert.state;

public class IssueTracker implements Tracker {

    private static final String REST_ISSUE_URL = "/rest/api/2/issue/";

    private String issueKey;

    private IssueTracker() {

    }

    public static IssueTracker issueWith() {
        return new IssueTracker();
    }

    public IssueTracker issueKey(final String issueKey) {
        this.issueKey = issueKey;
        return this;
    }

    @Override
    public String getRestUrl() {
        state(isNotBlank(issueKey), "Cannot build issue url, please set the issue key first.");
        return REST_ISSUE_URL.concat(issueKey);
    }
}
