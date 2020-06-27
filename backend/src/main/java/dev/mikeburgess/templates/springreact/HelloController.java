package dev.mikeburgess.templates.springreact;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String getHello() {
        return "Hello World!";
    }
}
