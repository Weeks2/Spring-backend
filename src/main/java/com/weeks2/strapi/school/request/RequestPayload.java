package com.weeks2.strapi.school.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RequestPayload {
    @JsonProperty("data")
    Request.Attributes data;
}
