package in.koost.scgi.joatf.university.management.repositories;

import in.koost.scgi.joatf.university.management.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {
    public Optional<Department> findByName(String departmentName);
}
