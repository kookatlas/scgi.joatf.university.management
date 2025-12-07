package in.koost.scgi.joatf.university.management.repositories;

import in.koost.scgi.joatf.university.management.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepo extends JpaRepository<Course, Integer> {
    public Optional<Course> findByTitle(String courseTitle);
}
