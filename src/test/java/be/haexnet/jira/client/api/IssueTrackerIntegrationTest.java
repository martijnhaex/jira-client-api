package be.haexnet.jira.client.api;

import be.haexnet.jira.client.api.entity.Issue;
import org.junit.Test;

import static be.haexnet.jira.client.api.IssueTracker.issueWith;
import static org.fest.assertions.Assertions.assertThat;

public class IssueTrackerIntegrationTest {
    @Test
    public void canTrack() throws Exception {
        final String issueKey = "SPR-7624";
        final IssueTracker issueTracker = issueWith().issueKey(issueKey);
        final Issue issue = issueTracker.track();
        assertThat(issue).isNotNull();
    }
}