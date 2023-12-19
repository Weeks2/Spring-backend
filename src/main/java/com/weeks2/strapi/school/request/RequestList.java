package com.weeks2.strapi.school.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class RequestList {
    @JsonProperty("data")
    List<Request> requests;

    public List<Request> getRequests() {
        return requests;
    }
    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }
}
