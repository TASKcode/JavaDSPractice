package com.code.demo.playgorund.dao;

import com.code.demo.playgorund.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements CommandLineRunner {

    @Autowired
    private UserService daoService;


    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {
        daoService.
    }
}
