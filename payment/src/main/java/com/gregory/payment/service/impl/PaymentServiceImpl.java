package com.gregory.payment.service.impl;

import com.gregory.payment.model.Payment;
import com.gregory.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Log4j2
@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;

    @Override
    @SneakyThrows
    public void payment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: Payment receive {}", payment);
        Thread.sleep(1000);

        log.info("Sending payment...");
        kafkaTemplate.send("payment-topic", payment);
    }

}
