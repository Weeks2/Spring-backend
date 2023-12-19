package com.weeks2.strapi.school.classroom;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ClassroomPayload {
    @JsonProperty("data")
    Classroom.Attributes data;
}
