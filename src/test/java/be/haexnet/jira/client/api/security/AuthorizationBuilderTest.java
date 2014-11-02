package be.haexnet.jira.client.api.security;

import be.haexnet.jira.client.api.security.model.Authorization;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static be.haexnet.jira.client.api.security.AuthorizationBuilder.authorizeWith;
import static org.fest.assertions.Assertions.assertThat;

public class AuthorizationBuilderTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void canGetCredentials() throws Exception {
        final String username = RandomStringUtils.randomAlphabetic(9);
        final String password = RandomStringUtils.randomAlphanumeric(14);

        final Authorization credentials = authorizeWith().username(username).password(password).getCredentials();
        assertThat(credentials).isNotNull();
        assertThat(credentials.getUsername()).isEqualTo(username);
        assertThat(credentials.getPassword()).isEqualTo(password);
    }

    @Test
    public void canNotGetCredentialsWithoutUsername() throws Exception {
        expectedException.expect(IllegalStateException.class);
        expectedException.expectMessage("Cannot create authorization, please set the username first.");
        authorizeWith().password(RandomStringUtils.randomAlphanumeric(8)).getCredentials();
    }

    @Test
    public void canNotGetCredentialsWithoutPassword() throws Exception {
        expectedException.expect(IllegalStateException.class);
        expectedException.expectMessage("Cannot create authorization, please set the password first.");
        authorizeWith().username(RandomStringUtils.randomAlphabetic(4)).getCredentials();
    }

    @Test
    public void canNotGetCredentialsWithoutUsernameAndPassword() throws Exception {
        expectedException.expect(IllegalStateException.class);
        expectedException.expectMessage("Cannot create authorization, please set the username first.");
        authorizeWith().getCredentials();
    }
}