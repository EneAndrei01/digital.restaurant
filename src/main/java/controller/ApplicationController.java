package controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/restaurant/application")
public class ApplicationController {

    @GetMapping
    public ResponseEntity<String> appName(){
        return new ResponseEntity<String>("Web application test", HttpStatus.OK);
    }
}
