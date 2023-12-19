package com.weeks2.strapi.school.member;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@Data
public class MemberData {
    @JsonProperty("data")
    Member data;

    public Member getData() {
        return data;
    }

    public void setData(Member data) {
        this.data = data;
    }
}
