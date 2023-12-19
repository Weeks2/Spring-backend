package com.weeks2.strapi.school.day;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DayList {
    @JsonProperty("data")
    List<Day> days;

    public List<Day> getDays() {
        return days;
    }
    public void setDays(List<Day> days) {
        this.days = days;
    }
}
