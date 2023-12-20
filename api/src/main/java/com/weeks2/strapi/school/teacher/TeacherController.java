package com.weeks2.strapi.school.teacher;
import com.weeks2.strapi.common.AppEndPointsSchool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(AppEndPointsSchool.TEACHER_PATH_)
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @GetMapping
    public List<Teacher.Attributes> get(@RequestHeader HttpHeaders headers) {
        return teacherService.fetch(headers);
    }

    @GetMapping("/init")
    public String init() {
        return "WORKS";
    }

    @GetMapping("/{id}")
    public List<Teacher.Attributes> get(@RequestHeader HttpHeaders headers, @PathVariable("id") int id) {
        return teacherService.findById(headers,id);
    }

    @PostMapping
    public ResponseEntity create(@RequestHeader HttpHeaders headers, @RequestBody Teacher.Attributes body) {
        teacherService.create(headers,body);
        return ResponseEntity.ok("SUCCESSFUL");
    }
}
