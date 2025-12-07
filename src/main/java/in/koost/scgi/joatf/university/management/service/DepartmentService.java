package in.koost.scgi.joatf.university.management.service;

import in.koost.scgi.joatf.university.management.dto.CreateDepartmentDTO;

public interface DepartmentService {
    public String saveDepartment(CreateDepartmentDTO department);
    public String deleteDepartmentById(Integer departmentID);
}
