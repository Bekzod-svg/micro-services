package com.bekzod.school;

import com.bekzod.school.client.StudentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {
    private final SchoolRepository schoolRepository;
    private final StudentClient client;
    public List<School> getSchools(){
        return schoolRepository.findAll();
    }
    public School addSchool(@RequestBody School school){
        return schoolRepository.save(school);
    }

    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId){
        var school = schoolRepository.findById(schoolId).orElse(
                School.builder()
                        .name("Not found")
                        .email("Not found")
                        .build()
        );
        var students = client.findStudentsBySchoolId(schoolId);
        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }

}
