package be.haexnet.jira.client.api.manager;

import be.haexnet.jira.client.api.tracker.api.IssueTracker;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static be.haexnet.jira.client.api.manager.JiraManager.manageJira;
import static be.haexnet.jira.client.api.tracker.api.IssueTracker.issueWith;
import static org.fest.assertions.Assertions.assertThat;

public class JiraManagerTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void canTrack() throws Exception {
        final String issueKey = "SPR-7624";
        final IssueTracker issueTracker = issueWith().issueKey(issueKey);
        final String trackingUrl = manageJira().forIssue(issueTracker).track();
        assertThat(trackingUrl).isEqualTo("https://jira.spring.io/rest/api/2/issue/" + issueKey);
    }

    @Test
    public void cannotTrackThrowsIllegalStateException() throws Exception {
        expectedException.expect(IllegalStateException.class);
        expectedException.expectMessage("Cannot build issue url, please set the issue key first.");
        manageJira().forIssue(issueWith()).track();
    }
}