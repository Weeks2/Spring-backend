package com.weeks2.strapi.school.subject;
import com.weeks2.strapi.common.AppEndPointsSchool;
import com.weeks2.strapi.school.member.Member;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping(AppEndPointsSchool.SUBJECT_PATH_)
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @GetMapping
    public List<Subject.Attributes> get(@RequestHeader HttpHeaders headers) {
        return subjectService.fetch(headers);
    }

    @GetMapping("/{id}")
    public List<Subject.Attributes> get(@RequestHeader HttpHeaders headers, @PathVariable("id") int id) {
        return subjectService.findById(headers,id);
    }

    @DeleteMapping("/{id}/delete")
    public List<Subject.Attributes> delete(@RequestHeader HttpHeaders headers, @PathVariable("id") int id) {
        return subjectService.findById(headers,id);
    }

    @PutMapping("/{id}/put")
    public List<Subject.Attributes> put(@RequestHeader HttpHeaders headers, @PathVariable("id") int id){
        return subjectService.findById(headers, id);
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestHeader HttpHeaders headers, @RequestBody Subject.Attributes body) {
        subjectService.create(headers,body);
        return ResponseEntity.ok("SUCCESSFUL");
    }
}
