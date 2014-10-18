package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Comments {
    @JsonProperty
    private Long total;
    @JsonProperty
    private List<Comment> comments;

    public Long getTotal() {
        return total;
    }

    public List<Comment> getComments() {
        return comments;
    }
}
