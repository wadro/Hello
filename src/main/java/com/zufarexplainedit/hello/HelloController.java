package com.zufarexplainedit.hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {

    @GetMapping
    public ResponseEntity<String> getGreeting() {
        String message = "Hello World, Edited: 2023-Nov-30 18:44";
        return ResponseEntity.ok()
                .body(message);
    }
}
