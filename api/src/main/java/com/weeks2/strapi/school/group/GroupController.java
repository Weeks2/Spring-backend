package com.weeks2.strapi.school.group;
import com.weeks2.strapi.common.AppEndPointsSchool;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping(AppEndPointsSchool.SPRING_BASE_PATH_ +"/group")
public class GroupController {
    @Autowired
    private GroupService groupService;
    @GetMapping
    public List<Group.Attributes> get(@RequestHeader HttpHeaders headers) {
        return groupService.fetch(headers);
    }

    @GetMapping("/{id}")
    public List<Group.Attributes> get(@RequestHeader HttpHeaders headers, @PathVariable("id") int id) {
        return groupService.findById(headers,id);
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestHeader HttpHeaders headers, @RequestBody Group.Attributes body) {
        groupService.create(headers,body);
        return ResponseEntity.ok("SUCCESSFUL");
    }
}
