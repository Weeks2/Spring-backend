package com.weeks2.strapi.school.subject;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@Data
public class SubjectData {
    @JsonProperty("data")
    Subject data;

    public Subject getData() {
        return data;
    }

    public void setData(Subject data) {
        this.data = data;
    }
}
