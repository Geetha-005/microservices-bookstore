package com.example.payement_service.controller;

 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.payement_service.model.Payment;



@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private com.example.payement_service.service.PaymentService paymentService;

    @PostMapping
    public Payment makePayment(@RequestBody Payment payment) {
        return paymentService.processPayment(payment);
    }
}
