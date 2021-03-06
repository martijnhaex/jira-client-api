package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorkLogs {
    @JsonProperty(value = "total")
    private Long workLogCount;
    @JsonProperty(value = "worklogs")
    private List<WorkLog> workLogs;

    public Long getWorkLogCount() {
        return workLogCount;
    }

    public List<WorkLog> getWorkLogs() {
        return workLogs;
    }
}
