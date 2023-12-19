package com.weeks2.strapi.school.timeblock;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TimeblockList {
    @JsonProperty("data")
    List<Timeblock> timeblocks;

    public List<Timeblock> getTimeblocks() {
        return timeblocks;
    }
    public void setTimeblocks(List<Timeblock> timeblocks) {
        this.timeblocks = timeblocks;
    }
}
