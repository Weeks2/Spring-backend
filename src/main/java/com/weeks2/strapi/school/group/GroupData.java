package com.weeks2.strapi.school.group;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@Data
public class GroupData {
    @JsonProperty("data")
    Group data;

    public Group getData() {
        return data;
    }

    public void setData(Group data) {
        this.data = data;
    }
}
