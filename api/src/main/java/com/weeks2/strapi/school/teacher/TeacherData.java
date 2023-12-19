package com.weeks2.strapi.school.teacher;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@Data
public class TeacherData {
    @JsonProperty("data")
    Teacher data;

    public Teacher getData() {
        return data;
    }

    public void setData(Teacher data) {
        this.data = data;
    }
}
