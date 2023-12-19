package com.weeks2.strapi.school.member;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MemberList {
    @JsonProperty("data")
    List<Member> members;

    public List<Member> getMembers() {
        return members;
    }
    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
