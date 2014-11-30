package be.haexnet.jira.client.api;


import be.haexnet.jira.client.api.entity.Issue;
import be.haexnet.jira.client.api.security.AuthorizationBuilder;

import java.util.Optional;

import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.springframework.util.Assert.state;

public class IssueTracker extends Tracker<Issue> {

    private static final String REST_ISSUE_URL = "/rest/api/2/issue/";

    private String issueKey;
    private Optional<AuthorizationBuilder> authorization = Optional.empty();

    private IssueTracker() {

    }

    public static IssueTracker issueWith() {
        return new IssueTracker();
    }

    public IssueTracker issueKey(final String issueKey) {
        this.issueKey = issueKey;
        return this;
    }

    public IssueTracker authorization(final AuthorizationBuilder authorization) {
        state(authorization != null, "Cannot set authorization to NULL, authorization is not mandatory to be provided.");
        this.authorization = Optional.of(authorization);
        return this;
    }

    @Override
    protected Class<Issue> tracksFor() {
        return Issue.class;
    }

    @Override
    protected Optional<AuthorizationBuilder> withAuthorization() {
        return authorization;
    }

    @Override
    protected String withUrl() {
        state(isNotBlank(issueKey), "Cannot build issue url, please set the issue key first.");
        return REST_ISSUE_URL.concat(issueKey);
    }

}
