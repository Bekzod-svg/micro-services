package com.bekzod.student;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        return ResponseEntity.ok(studentService.getStudents());
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/school/{school_id}")
    public ResponseEntity<List<Student>> getStudentsBySchool(@PathVariable Integer school_id){
        return ResponseEntity.ok(studentService.findStudentBySchool(school_id));
    }
}
