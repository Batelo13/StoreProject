package com.curso.store.service;

import com.curso.store.domains.Payment;
import com.curso.store.repositorio.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    private final PaymentRepository repository;

    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

    public List<Payment> listPayments() {
        return repository.findAll();
    }

    public Payment createPayment(Payment payment) {
        return repository.save(payment);
    }

    public Payment updatePayment(Long id, Payment payment) {

        Payment existingPayment = repository.findById(id).orElse(null);

        if (existingPayment == null) {
            return null;
        }

        existingPayment.setCartId(payment.getCartId());
        existingPayment.setAmount(payment.getAmount());
        existingPayment.setStatus(payment.getStatus());

        return repository.save(existingPayment);
    }

    public void deletePayment(Long id) {
        repository.deleteById(id);
    }
}