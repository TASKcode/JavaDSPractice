package com.code.demo.playgorund.service;

import com.code.demo.playgorund.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService extends JpaRepository<User, Long> {
}
