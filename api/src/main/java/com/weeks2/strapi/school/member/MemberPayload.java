package com.weeks2.strapi.school.member;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MemberPayload {
    @JsonProperty("data")
    Member.Attributes data;
}
