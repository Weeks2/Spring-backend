package com.weeks2.strapi.school.day;
import com.weeks2.strapi.common.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping(Constants.API+"/day")
public class DayController {
    @Autowired
    private DayService dayService;
    @GetMapping
    public List<Day.Attributes> get(@RequestHeader HttpHeaders headers) {
        return dayService.fetch(headers);
    }

    @GetMapping("/{id}")
    public List<Day.Attributes> get(@RequestHeader HttpHeaders headers, @PathVariable("id") int id) {
        return dayService.findById(headers,id);
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestHeader HttpHeaders headers, @RequestBody Day.Attributes body) {
        dayService.create(headers,body);
        return ResponseEntity.ok("SUCCESSFUL");
    }
}
