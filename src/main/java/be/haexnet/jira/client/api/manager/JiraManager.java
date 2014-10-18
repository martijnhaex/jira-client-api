package be.haexnet.jira.client.api.manager;

import be.haexnet.jira.client.api.tracker.api.Tracker;

public class JiraManager {

    private static final String JIRA_URL = "https://jira.spring.io";

    private Tracker issueTracker;

    private JiraManager() {

    }

    public static JiraManager manageJira() {
        return new JiraManager();
    }

    public JiraManager forIssue(final Tracker issueTracker) {
        this.issueTracker = issueTracker;
        return this;
    }

    public String track() {
        final String restUrl = issueTracker.getRestUrl();
        return JIRA_URL.concat(restUrl);
    }
}
