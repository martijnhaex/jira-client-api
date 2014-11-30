package be.haexnet.jira.client.api;

import be.haexnet.jira.client.api.security.AuthorizationBuilder;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static be.haexnet.jira.client.api.IssueTracker.issueWith;
import static org.fest.assertions.Assertions.assertThat;

public class IssueTrackerTest {

    static final String REST_ISSUE_URL = "/rest/api/2/issue/";

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void canGetUrlWithoutAuthorization() throws Exception {
        final String issueKey = RandomStringUtils.randomAlphanumeric(4);
        final String restUrl = issueWith().issueKey(issueKey).withUrl();
        assertThat(restUrl).isEqualTo(REST_ISSUE_URL + issueKey);
    }

    @Test
    public void canGetUrlWithAuthorization() throws Exception {
        final String issueKey = RandomStringUtils.randomAlphanumeric(5);
        final String restUrl = issueWith().issueKey(issueKey).authorization(AuthorizationBuilder.authorizeWith()).withUrl();
        assertThat(restUrl).isEqualTo(REST_ISSUE_URL + issueKey);
    }

    @Test
    public void canNotGetUrlWithAuthorizationIsNull() throws Exception {
        expectedException.expect(IllegalStateException.class);
        expectedException.expectMessage("Cannot set authorization to NULL, authorization is not mandatory to be provided.");
        issueWith().issueKey(RandomStringUtils.randomAlphanumeric(5)).authorization(null).withUrl();
    }

    @Test
    public void cannotGetUrlThrowsIllegalStateException() throws Exception {
        expectedException.expect(IllegalStateException.class);
        expectedException.expectMessage("Cannot build issue url, please set the issue key first.");
        issueWith().withUrl();
    }
}