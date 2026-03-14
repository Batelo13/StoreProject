package com.curso.store.repositorio;

import com.curso.store.domains.Payment;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PaymentRepository {

    private final List<Payment> payments = new ArrayList<>();
    private Long nextId = 1L;

    public List<Payment> list() {
        return payments;
    }

    public Payment save(Payment payment) {
        payment.setId(nextId);
        nextId++;
        payments.add(payment);
        return payment;
    }

    public Payment update(Long id, Payment updatedPayment) {
        for (Payment payment : payments) {
            if (payment.getId().equals(id)) {
                payment.setCartId(updatedPayment.getCartId());
                payment.setAmount(updatedPayment.getAmount());
                payment.setStatus(updatedPayment.getStatus());
                return payment;
            }
        }
        return null;
    }

    public void delete(Long id) {
        payments.removeIf(payment -> payment.getId().equals(id));
    }
}
