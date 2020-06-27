package dev.mikeburgess.templates.springreact.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class MessageRepositoryTest {

    @Autowired
    private MessageRepository messageRepository;

    @Test
    void test() {
        var message = messageRepository.getOne(1);
        assertThat(message.getMessage()).isEqualTo("Hello Database!");
    }
}
