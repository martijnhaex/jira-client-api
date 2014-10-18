package be.haexnet.jira.client.api;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

public abstract class Tracker<ENTITY> {

    private static final String JIRA_URL = "https://jira.spring.io";

    public ENTITY track() {
        return new RestTemplate()
                .exchange(
                        JIRA_URL.concat(getRestUrl()),
                        HttpMethod.GET,
                        new HttpEntity<String>(new HttpHeaders()),
                        tracksFor()
                )
                .getBody();
    }

    public abstract String getRestUrl();

    public abstract Class<ENTITY> tracksFor();
}
