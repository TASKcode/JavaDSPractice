package com.guineabear.springdata.hibernateinheritance.repos;

import com.guineabear.springdata.hibernateinheritance.joinedentity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JoinedPaymentRepo extends JpaRepository<Payment, Integer> {
}
