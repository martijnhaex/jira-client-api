package be.haexnet.jira.client.api.entity;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Attachment {
    @JsonProperty(value = "filename")
    private String name;
    @JsonProperty(value = "author")
    private User owner;
    @JsonProperty
    private DateTime created;
    @JsonProperty
    private Long size;
    @JsonProperty
    private String mimeType;
    @JsonProperty(value = "content")
    private String urlContent;

    public String getName() {
        return name;
    }

    public User getOwner() {
        return owner;
    }

    public DateTime getCreated() {
        return created;
    }

    public Long getSize() {
        return size;
    }

    public String getMimeType() {
        return mimeType;
    }

    public String getUrlContent() {
        return urlContent;
    }
}
