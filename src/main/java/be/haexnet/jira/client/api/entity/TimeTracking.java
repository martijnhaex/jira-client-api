package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TimeTracking {
    @JsonProperty
    private String originalEstimate;
    @JsonProperty
    private String remainingEstimate;
    @JsonProperty
    private String timeSpent;
    @JsonProperty(value = "originalEstimateSeconds")
    private Long originalEstimateInSeconds;
    @JsonProperty(value = "remainingEstimateSeconds")
    private Long remainingEstimateInSeconds;
    @JsonProperty(value = "timeSpentSeconds")
    private Long timeSpentInSeconds;

    public String getOriginalEstimate() {
        return originalEstimate;
    }

    public String getRemainingEstimate() {
        return remainingEstimate;
    }

    public String getTimeSpent() {
        return timeSpent;
    }

    public Long getOriginalEstimateInSeconds() {
        return originalEstimateInSeconds;
    }

    public Long getRemainingEstimateInSeconds() {
        return remainingEstimateInSeconds;
    }

    public Long getTimeSpentInSeconds() {
        return timeSpentInSeconds;
    }
}
