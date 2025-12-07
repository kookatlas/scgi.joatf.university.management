package in.koost.scgi.joatf.university.management.repositories;

import in.koost.scgi.joatf.university.management.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepo extends JpaRepository<Student, Integer> {
    public Optional<Student> findByName(String studentName);
}
