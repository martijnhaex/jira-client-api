package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Avatar {
    @JsonProperty(value = "16x16")
    private String url16x16;
    @JsonProperty(value = "24x24")
    private String url24x24;
    @JsonProperty(value = "32x32")
    private String url32x32;
    @JsonProperty(value = "48x48")
    private String url48x48;

    public String getUrl16x16() {
        return url16x16;
    }

    public String getUrl24x24() {
        return url24x24;
    }

    public String getUrl32x32() {
        return url32x32;
    }

    public String getUrl48x48() {
        return url48x48;
    }
}
