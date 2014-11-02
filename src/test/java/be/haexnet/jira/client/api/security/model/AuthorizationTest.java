package be.haexnet.jira.client.api.security.model;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class AuthorizationTest {
    @Test
    public void canGetAuthorizationHeader() throws Exception {
        assertThat(createAuthorizationHeader("username", "password")).isEqualTo("Basic dXNlcm5hbWU6cGFzc3dvcmQ=");
    }

    @Test
    public void canGetAuthorizationHeaderWhenUsernameIsNull() throws Exception {
        assertThat(createAuthorizationHeader(null, "password")).isEqualTo("Basic bnVsbDpwYXNzd29yZA==");
    }

    @Test
    public void canGetAuthorizationHeaderWhenUsernameIsEmpty() throws Exception {
        assertThat(createAuthorizationHeader("", "password")).isEqualTo("Basic OnBhc3N3b3Jk");
    }

    @Test
    public void canGetAuthorizationHeaderWhenPasswordIsNull() throws Exception {
         assertThat(createAuthorizationHeader("username", null)).isEqualTo("Basic dXNlcm5hbWU6bnVsbA==");
    }

    @Test
    public void canGetAuthorizationHeaderWhenPasswordIsEmpty() throws Exception {
        assertThat(createAuthorizationHeader("username", "")).isEqualTo("Basic dXNlcm5hbWU6");
    }

    @Test
    public void canGetAuthorizationHeaderWhenUsernameAndPasswordAreNull() throws Exception {
        assertThat(createAuthorizationHeader(null, null)).isEqualTo("Basic bnVsbDpudWxs");
    }

    @Test
    public void canGetAuthorizationHeaderWhenUsernameAndPasswordAreEmpty() throws Exception {
        assertThat(createAuthorizationHeader("", "")).isEqualTo("Basic Og==");
    }

    private String createAuthorizationHeader(final String username, final String password) {
        return Authorization.of(username, password).getAuthorizationHeader();
    }
}