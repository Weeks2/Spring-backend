package com.weeks2.strapi.school.timeblock;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@Data
public class TimeblockData {
    @JsonProperty("data")
    Timeblock data;

    public Timeblock getData() {
        return data;
    }

    public void setData(Timeblock data) {
        this.data = data;
    }
}
