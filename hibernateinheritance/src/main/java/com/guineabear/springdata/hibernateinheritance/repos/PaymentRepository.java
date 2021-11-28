package com.guineabear.springdata.hibernateinheritance.repos;

import com.guineabear.springdata.hibernateinheritance.singletableentity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
