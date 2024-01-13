package com.schwencke.dlsexam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DlsExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(DlsExamApplication.class, args);
    }

}
