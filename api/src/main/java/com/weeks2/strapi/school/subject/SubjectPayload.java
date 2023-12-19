package com.weeks2.strapi.school.subject;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SubjectPayload {
    @JsonProperty("data")
    Subject.Attributes data;
}
