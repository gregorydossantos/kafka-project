package com.gregory.strconsumer.listener;

import com.gregory.strconsumer.listener.custom.StringConsumerCustom;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StringConsumerListener {

    @SneakyThrows
    @StringConsumerCustom(groupIds = "1")
    public void create(String message) {
        log.info("CREATED ::: Receive message {}", message);
        throw new IllegalArgumentException("EXCEPTION!!!");
    }

    @StringConsumerCustom(groupIds = "2")
    public void info(String message) {
        log.info("INFORMATION ::: Message {}", message);
    }

}
