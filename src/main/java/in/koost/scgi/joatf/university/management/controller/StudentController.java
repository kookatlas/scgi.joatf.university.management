package in.koost.scgi.joatf.university.management.controller;

import in.koost.scgi.joatf.university.management.dto.StudentDTO;
import in.koost.scgi.joatf.university.management.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService managementService;

    @PostMapping("/saveStudent")
    public ResponseEntity<Integer> saveStudent(@RequestBody StudentDTO studentDTO){
        return new ResponseEntity<Integer>(managementService.saveStudent(studentDTO), HttpStatus.CREATED);
    }

    @PatchMapping("{id}/email")
    public ResponseEntity<String> updateStudentEmail(@PathVariable int id, @RequestBody Map<String, String> payload){
        String email = payload.get("email");
        return new ResponseEntity<>(managementService.updateStudentEmail(id, email),HttpStatus.OK);
    }


}
