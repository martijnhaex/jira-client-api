package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Votes {
    @JsonProperty(value = "votes")
    private Long voteCount;
    @JsonProperty
    private boolean hasVoted;

    public Long getVoteCount() {
        return voteCount;
    }

    public boolean isHasVoted() {
        return hasVoted;
    }
}
