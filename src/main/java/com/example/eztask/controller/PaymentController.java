package com.example.eztask.controller;

import com.example.eztask.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/payment")
public class PaymentController {

    private final PaymentService paymentService;







}
