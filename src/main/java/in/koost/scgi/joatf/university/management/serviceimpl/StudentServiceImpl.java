package in.koost.scgi.joatf.university.management.serviceimpl;


import in.koost.scgi.joatf.university.management.dto.StudentDTO;
import in.koost.scgi.joatf.university.management.entities.Course;
import in.koost.scgi.joatf.university.management.entities.Department;
import in.koost.scgi.joatf.university.management.entities.Student;
import in.koost.scgi.joatf.university.management.exceptionhandler.customexceptions.CourseNotFoundException;
import in.koost.scgi.joatf.university.management.exceptionhandler.customexceptions.DepartmentNotFoundException;
import in.koost.scgi.joatf.university.management.repositories.CourseRepo;
import in.koost.scgi.joatf.university.management.repositories.DepartmentRepo;
import in.koost.scgi.joatf.university.management.repositories.StudentRepo;
import in.koost.scgi.joatf.university.management.service.ManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ManagementServiceImpl implements ManagementService {


    private final DepartmentRepo depoRepo;

    private final CourseRepo courseRepo;

    private final StudentRepo studentRepo;

    @Override
    public Integer saveStudent(StudentDTO studentDto) {
        Department department = depoRepo.findByName(studentDto.getDepartment().getName())
                .orElseThrow(() -> new DepartmentNotFoundException("Department Not Found"));
        Set<Course> courses = studentDto.getCourses().stream()
                .map(c -> courseRepo.findByTitle(c.getTitle())
                        .orElseThrow(() -> new CourseNotFoundException("Course not found " + c.getTitle())))
                .collect(Collectors.toSet());

        Student student = new Student();
        student.setName(studentDto.getName());
        student.setEmail(student.getEmail());
        student.setDepartment(department);
        student.setCourses(courses);
        Student saved = studentRepo.save(student);
        return saved.getId();
    }
}
