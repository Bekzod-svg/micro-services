package com.bekzod.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    public Student addStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

    public List<Student> findStudentBySchool(Integer schoolId){
        return studentRepository.findAllBySchoolId(schoolId);
    }
}
