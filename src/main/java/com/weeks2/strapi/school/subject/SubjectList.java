package com.weeks2.strapi.school.subject;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SubjectList {
    @JsonProperty("data")
    List<Subject> subjects;

    public List<Subject> getSubjects() {
        return subjects;
    }
    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
