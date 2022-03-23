package com.example.provamail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/mail")
public class EmailController {

    @Autowired
    private EmailServiceImpl emailService;

    @PostMapping(path = "/send")
    public ResponseEntity<Void> sendEmail(){
        emailService.sendSimpleMessage("ciao@gmail.com", "prova", "funciona");
        return ResponseEntity.ok().build();
    }
}
