package com.weeks2.strapi.controller;
import com.weeks2.strapi.lesson.Lesson;
import com.weeks2.strapi.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/lesson")
public class LessonController {
    @Autowired
    private LessonService lessonService;
    @GetMapping
    public List<Lesson.Attributes> get(@RequestHeader HttpHeaders headers) {
        return lessonService.fetch(headers);
    }

    @GetMapping("/{id}")
    public List<Lesson.Attributes> get(@RequestHeader HttpHeaders headers, @PathVariable("id") int id) {
        return lessonService.findById(headers,id);
    }

    @PostMapping
    public ResponseEntity create(@RequestHeader HttpHeaders headers, @RequestBody Lesson.Attributes body) {
        lessonService.create(headers,body);
        return ResponseEntity.ok("SUCCESSFUL");
    }
}
