package io.enfuse.springconfigclient;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RefreshScope

public class ConfigController {

    @Autowired
    ExternalConfig externalConfig;

    @Autowired
    StudentRepo studentRepo;


    @GetMapping("/props")
    public ResponseEntity uploadFileToAzure(){
        return ResponseEntity.ok("property: "+externalConfig.getName());
    }

    @GetMapping("/get_students")
    public ResponseEntity <List<Student>>getAllStudents() {
        return ResponseEntity.ok(studentRepo.findAll());
    }

}
