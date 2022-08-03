package io.enfuse.springconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RefreshScope

public class ConfigController {

    @Autowired
    ExternalConfig externalConfig;


    @GetMapping("/props")
    public ResponseEntity uploadFileToAzure(){
        return ResponseEntity.ok("property: "+externalConfig.getName());
    }
}
