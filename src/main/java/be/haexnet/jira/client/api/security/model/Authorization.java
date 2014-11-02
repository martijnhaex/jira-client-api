package be.haexnet.jira.client.api.security.model;

import com.sun.org.apache.xml.internal.security.utils.Base64;

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
        return "Basic " + new String(Base64.encode(new String(username + ":" + password).getBytes()));
    }
}
