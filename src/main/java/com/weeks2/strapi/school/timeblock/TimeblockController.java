package com.weeks2.strapi.school.timeblock;
import com.weeks2.strapi.common.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
@RequestMapping(Constants.API+"/timeblock")
public class TimeblockController {
    @Autowired
    private TimeblockService timeblockService;
    @GetMapping
    public List<Timeblock.Attributes> get(@RequestHeader HttpHeaders headers) {
        return timeblockService.fetch(headers);
    }

    @GetMapping("/{id}")
    public List<Timeblock.Attributes> get(@RequestHeader HttpHeaders headers, @PathVariable("id") int id) {
        return timeblockService.findById(headers,id);
    }

    @PostMapping
    public ResponseEntity<String> create(@RequestHeader HttpHeaders headers, @RequestBody Timeblock.Attributes body) {
        timeblockService.create(headers,body);
        return ResponseEntity.ok("SUCCESSFUL");
    }
}
