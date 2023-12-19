package com.weeks2.strapi.school.group;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GroupList {
    @JsonProperty("data")
    List<Group> groups;

    public List<Group> getGroups() {
        return groups;
    }
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
