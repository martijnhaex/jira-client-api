package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Progress {
    @JsonProperty
    private Long progress;
    @JsonProperty
    private Long total;
    @JsonProperty
    private Double percent;

    public Long getProgress() {
        return progress;
    }

    public Long getTotal() {
        return total;
    }

    public Double getPercent() {
        return percent;
    }
}
