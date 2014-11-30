package be.haexnet.jira.client.api.security;

import be.haexnet.jira.client.api.security.model.Authorization;

import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.springframework.util.Assert.state;

public class AuthorizationBuilder {
    private String username;
    private String password;

    private AuthorizationBuilder() { }

    public static AuthorizationBuilder authorizeWith() {
        return new AuthorizationBuilder();
    }

    public AuthorizationBuilder username(final String username) {
        this.username = username;
        return this;
    }

    public AuthorizationBuilder password(final String password) {
        this.password = password;
        return this;
    }

    public Authorization getCredentials() {
        state(isNotBlank(username), "Cannot create authorization, please set the username first.");
        state(isNotBlank(password), "Cannot create authorization, please set the password first.");
        return Authorization.of(username, password);
    }
}
