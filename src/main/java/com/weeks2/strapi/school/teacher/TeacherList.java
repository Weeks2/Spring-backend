package com.weeks2.strapi.school.teacher;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
public class TeacherList {
    @JsonProperty("data")
    List<Teacher> teachers;

    public List<Teacher> getTeachers() {
        return teachers;
    }
    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
