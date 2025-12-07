package in.koost.scgi.joatf.university.management.controller;

import in.koost.scgi.joatf.university.management.dto.CoursesDTO;
import in.koost.scgi.joatf.university.management.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @PostMapping("/save")
    public ResponseEntity<String> saveCourse(@RequestBody CoursesDTO course){
        System.out.println(course.getTitle());
        return new ResponseEntity<>(courseService.saveCourse(course), HttpStatus.OK);
    }




}
