package dev.mikeburgess.templates.springreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.mikeburgess.templates.springreact.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
