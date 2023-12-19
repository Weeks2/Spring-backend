package com.weeks2.strapi.school.day;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class DayPayload {
    @JsonProperty("data")
    Day.Attributes data;
}
