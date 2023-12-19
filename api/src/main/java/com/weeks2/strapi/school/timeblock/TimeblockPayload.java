package com.weeks2.strapi.school.timeblock;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TimeblockPayload {
    @JsonProperty("data")
    Timeblock.Attributes data;
}
