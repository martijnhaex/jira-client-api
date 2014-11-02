package be.haexnet.jira.client.api;

import be.haexnet.jira.client.api.security.AuthorizationBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

public abstract class Tracker<ENTITY> {

    private static final String JIRA_URL = "http://jira.haexnet.be";

    public ENTITY track() {
        return new RestTemplate()
                .exchange(
                        JIRA_URL.concat(withUrl()),
                        HttpMethod.GET,
                        new HttpEntity<>(createHeaders()),
                        tracksFor()
                )
                .getBody();
    }

    private HttpHeaders createHeaders() {
        final HttpHeaders headers = new HttpHeaders();
        if (withAuthorization().isPresent()) {
            headers.add("Authorization", withAuthorization().get().getCredentials().getAuthorizationHeader());
        }
        return headers;
    }

    protected abstract Class<ENTITY> tracksFor();

    protected abstract Optional<AuthorizationBuilder> withAuthorization();

    protected abstract String withUrl();

}
