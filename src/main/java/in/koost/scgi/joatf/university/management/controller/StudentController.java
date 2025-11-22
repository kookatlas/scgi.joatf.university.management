package in.koost.scgi.joatf.university.management.controller;

import in.koost.scgi.joatf.university.management.dto.StudentDTO;
import in.koost.scgi.joatf.university.management.service.ManagementService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ManagementController {

    private final ManagementService managementService;

    @PostMapping("/saveStudent")
    public ResponseEntity<Integer> saveStudent(@RequestBody StudentDTO studentDTO){
        return new ResponseEntity<Integer>(managementService.saveStudent(studentDTO), HttpStatus.CREATED);
    }


}
