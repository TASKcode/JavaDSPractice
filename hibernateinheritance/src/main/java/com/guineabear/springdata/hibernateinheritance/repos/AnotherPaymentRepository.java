package com.guineabear.springdata.hibernateinheritance.repos;

import com.guineabear.springdata.hibernateinheritance.TableperEntity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnotherPaymentRepository extends JpaRepository<Payment, Integer> {
}
