package com.example.payement_service.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.payement_service.model.Payment;


public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
