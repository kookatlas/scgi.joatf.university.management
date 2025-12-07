package in.koost.scgi.joatf.university.management.dto;

import in.koost.scgi.joatf.university.management.entities.Course;
import in.koost.scgi.joatf.university.management.entities.Department;
import lombok.Data;

import java.util.Set;

@Data
public class StudentDTO {

    private String name;
    private String email;
    private Department department;
    private Set<Course> courses;

}
