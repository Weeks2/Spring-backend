package com.weeks2.strapi.school.day;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
@Data
public class DayData {
    @JsonProperty("data")
    Day data;

    public Day getData() {
        return data;
    }

    public void setData(Day data) {
        this.data = data;
    }
}

