package io.jittakal.template.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

public class ResponseMessage implements Serializable{

    private long id;

    @Length(max = 3)
    private String content;

    public ResponseMessage() {
        // Jackson deserialization
    }

    public ResponseMessage(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }

}
