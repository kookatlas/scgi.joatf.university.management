package in.koost.scgi.joatf.university.management.serviceimpl;

import in.koost.scgi.joatf.university.management.dto.CreateDepartmentDTO;
import in.koost.scgi.joatf.university.management.entities.Department;
import in.koost.scgi.joatf.university.management.exceptionhandler.customexceptions.DuplicateRecordsException;
import in.koost.scgi.joatf.university.management.repositories.DepartmentRepo;
import in.koost.scgi.joatf.university.management.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    final private DepartmentRepo departmentRepo;

    @Override
    public String saveDepartment(CreateDepartmentDTO department) {
        departmentRepo.findByName(department.getName()).ifPresent(d->{
                throw new DuplicateRecordsException("Department already exists and Id is " + String.valueOf(d.getId()));
        });
        Department dep = new Department();
        dep.setName(department.getName());
        Department save = departmentRepo.save(dep);
        return "Department Saved Successfully: Id = " +  String.valueOf( save.getId());
    }

    @Override
    public String deleteDepartmentById(Integer departmentID) {
        return "";
    }
}
