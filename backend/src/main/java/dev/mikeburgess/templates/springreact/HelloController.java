package dev.mikeburgess.templates.springreact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.mikeburgess.templates.springreact.repository.MessageRepository;

@RestController
public class HelloController {

    @Autowired
    private MessageRepository messageRepository;

    @GetMapping("/api/hello")
    public String getHello() {
        return messageRepository.getOne(1).getMessage();
    }
}
