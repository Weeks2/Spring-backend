package com.weeks2.strapi.school.member;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Member {
    @JsonProperty("id")
    private int id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Attributes attributes;
    @Data
    public static class Attributes{
        @JsonInclude(JsonInclude.Include.NON_NULL)
        Integer id;
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private String name;
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private String email;
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private String account;
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private String password;
        @JsonInclude(JsonInclude.Include.NON_NULL)
        private String rol;
    }
}
