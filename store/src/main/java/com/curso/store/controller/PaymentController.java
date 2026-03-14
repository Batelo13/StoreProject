package com.curso.store.controller;

import com.curso.store.domains.Payment;
import com.curso.store.dto.PaymentDTO;
import com.curso.store.mapper.PaymentMapper;
import com.curso.store.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService service;

    public PaymentController(PaymentService service) {
        this.service = service;
    }

    @GetMapping
    public List<Payment> list() {
        return service.listPayments();
    }

    @PostMapping
    public Payment create(@RequestBody PaymentDTO dto) {
        Payment payment = PaymentMapper.toEntity(dto);
        return service.createPayment(payment);
    }

    @PutMapping("/{id}")
    public Payment update(@PathVariable Long id, @RequestBody PaymentDTO dto) {
        Payment payment = PaymentMapper.toEntity(dto);
        return service.updatePayment(id, payment);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deletePayment(id);
    }
}
