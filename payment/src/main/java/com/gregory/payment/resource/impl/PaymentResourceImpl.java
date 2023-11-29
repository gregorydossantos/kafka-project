package com.gregory.payment.resource.impl;

import com.gregory.payment.model.Payment;
import com.gregory.payment.resource.PaymentResource;
import com.gregory.payment.service.impl.PaymentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
@RequiredArgsConstructor
public class PaymentResourceImpl implements PaymentResource {

    final PaymentServiceImpl service;

    @Override
    public ResponseEntity<Payment> payment(Payment request) {
        service.payment(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
