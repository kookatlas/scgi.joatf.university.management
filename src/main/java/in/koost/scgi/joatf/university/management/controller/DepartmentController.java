package in.koost.scgi.joatf.university.management.controller;

import in.koost.scgi.joatf.university.management.dto.CreateDepartmentDTO;
import in.koost.scgi.joatf.university.management.service.DepartmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("department")
@RequiredArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;

    @PostMapping("/save")
    public ResponseEntity<String> saveDepartment(@RequestBody CreateDepartmentDTO department){
        return new ResponseEntity<>(departmentService.saveDepartment(department), HttpStatus.OK);
    }




}
