package com.weeks2.strapi.school.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@Data
public class RequestData {
    @JsonProperty("data")
    Request data;

    public Request getData() {
        return data;
    }

    public void setData(Request data) {
        this.data = data;
    }
}
