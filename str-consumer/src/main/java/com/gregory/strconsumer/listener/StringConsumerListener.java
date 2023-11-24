package com.gregory.strconsumer.listener;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StringConsumerListener {

    @KafkaListener(groupId = "group-1", topics = "first-topic", containerFactory = "containerFactory")
    public void listener(String message) {
        log.info("Receive message {}", message);
    }
}
