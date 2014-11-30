package be.haexnet.jira.client.api.security.model;

import org.apache.commons.codec.binary.Base64;

public class Authorization {
    private String username;
    private String password;

    private Authorization(final String username, final String password) {
        this.username = username;
        this.password = password;
    }

    public static Authorization of(final String username, final String password) {
        return new Authorization(username, password);

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAuthorizationHeader() {
        return "Basic " + new String(Base64.encodeBase64(new String(username + ":" + password).getBytes()));
    }
}
