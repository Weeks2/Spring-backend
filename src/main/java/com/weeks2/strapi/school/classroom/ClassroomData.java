package com.weeks2.strapi.school.classroom;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@Data
public class ClassroomData {
    @JsonProperty("data")
    Classroom data;

    public Classroom getData() {
        return data;
    }

    public void setData(Classroom data) {
        this.data = data;
    }
}