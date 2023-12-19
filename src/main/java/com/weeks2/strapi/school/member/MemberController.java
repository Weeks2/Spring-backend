package com.weeks2.strapi.school.member;
import com.weeks2.strapi.common.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping(Constants.API+"/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @GetMapping
    public List<Member.Attributes> get(@RequestHeader HttpHeaders headers) {
        return memberService.fetch(headers);
    }

    @GetMapping("/{id}")
    public List<Member.Attributes> get(@RequestHeader HttpHeaders headers, @PathVariable("id") int id) {
        return memberService.findById(headers,id);
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestHeader HttpHeaders headers, @RequestBody Member.Attributes body) {
        memberService.create(headers,body);
        return ResponseEntity.ok("SUCCESSFUL");
    }
}
