package com.weeks2.strapi.school.teacher;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TeacherPayload {
    @JsonProperty("data")
    Teacher.Attributes data;
}
