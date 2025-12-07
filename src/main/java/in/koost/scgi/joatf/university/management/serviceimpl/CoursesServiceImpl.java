package in.koost.scgi.joatf.university.management.serviceimpl;

import in.koost.scgi.joatf.university.management.dto.CoursesDTO;
import in.koost.scgi.joatf.university.management.entities.Course;
import in.koost.scgi.joatf.university.management.exceptionhandler.customexceptions.DuplicateRecordsException;
import in.koost.scgi.joatf.university.management.repositories.CourseRepo;
import in.koost.scgi.joatf.university.management.service.CourseService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CoursesServiceImpl implements CourseService {

    private final CourseRepo courseRepo;


    @Override
    public String saveCourse(CoursesDTO courses) {
        courseRepo.findByTitle(courses.getTitle()).ifPresent(
                c->{
                    throw new DuplicateRecordsException( c.getTitle() + " Course is already exists Id is: " + String.valueOf(c.getId()));
                }
        );
        Course course = new Course();
        course.setTitle(courses.getTitle());
        Course saved = courseRepo.save(course);
        return "Course saved successfully: Id = " + saved.getId();
    }
}
