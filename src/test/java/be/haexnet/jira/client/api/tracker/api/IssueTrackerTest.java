package be.haexnet.jira.client.api.tracker.api;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static be.haexnet.jira.client.api.tracker.api.IssueTracker.issueWith;
import static org.fest.assertions.Assertions.assertThat;

public class IssueTrackerTest {

    static final String REST_ISSUE_URL = "/rest/api/2/issue/";

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void canGetUrl() throws Exception {
        final String issueKey = "API-1";
        final String restUrl = issueWith().issueKey(issueKey).getRestUrl();
        assertThat(restUrl).isEqualTo(REST_ISSUE_URL + issueKey);
    }

    @Test
    public void cannotGetUrlThrowsIllegalStateException() throws Exception {
        expectedException.expect(IllegalStateException.class);
        expectedException.expectMessage("Cannot build issue url, please set the issue key first.");
        issueWith().getRestUrl();
    }
}