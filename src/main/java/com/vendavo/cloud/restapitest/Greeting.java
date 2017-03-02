package com.vendavo.cloud.restapitest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.hateoas.ResourceSupport;

public class Greeting extends ResourceSupport {

    private final String content;
    private final String content2;

    @JsonCreator
    public Greeting(@JsonProperty(value = "content", required = true) String content, @JsonProperty("content2") String content2) {
        this.content = content;
        this.content2 = content2;
    }

    public String getContent2() {
        return content2;
    }

    public String getContent() {
        return content;
    }
}