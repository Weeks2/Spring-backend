package com.weeks2.strapi.school.classroom;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ClassroomList {
    @JsonProperty("data")
    List<Classroom> classrooms;

    public List<Classroom> getClassrooms() {
        return classrooms;
    }
    public void setClassrooms(List<Classroom> classrooms) {
        this.classrooms = classrooms;
    }
}
