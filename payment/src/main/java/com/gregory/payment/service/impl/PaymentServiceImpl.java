package com.gregory.payment.service.impl;

import com.gregory.payment.model.Payment;
import com.gregory.payment.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public void payment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: Payment receive {}", payment);
    }

}
