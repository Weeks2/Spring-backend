package com.weeks2.strapi.school.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GroupPayload {
    @JsonProperty("data")
    Group.Attributes data;
}
