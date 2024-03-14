package com.bekzod.school;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService schoolService;

    @GetMapping
    public ResponseEntity<List<School>> getSchools(){
        return ResponseEntity.ok(schoolService.getSchools());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public School addSchool(@RequestBody School school){
        return schoolService.addSchool(school);
    }

    @GetMapping("/with-students/{school_id}")
    public ResponseEntity<FullSchoolResponse> getSchools(@PathVariable Integer school_id){
        return ResponseEntity.ok(schoolService.findSchoolsWithStudents(school_id));
    }

}
