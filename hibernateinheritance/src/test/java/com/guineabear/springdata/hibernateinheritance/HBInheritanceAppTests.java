package com.guineabear.springdata.hibernateinheritance;

import com.guineabear.springdata.hibernateinheritance.singletableentity.Check;
import com.guineabear.springdata.hibernateinheritance.singletableentity.CreditCard;
import com.guineabear.springdata.hibernateinheritance.repos.AnotherPaymentRepository;
import com.guineabear.springdata.hibernateinheritance.repos.PaymentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HBInheritanceAppTests {

    @Autowired
    PaymentRepository repo;

    @Autowired
    AnotherPaymentRepository repository;

    @Test
    public void contextLoads() {

    }

    @Test
    public void createPayment() {
        CreditCard cc = new CreditCard();
        cc.setId(100);
        cc.setAmount(1572);
        cc.setCardnumber("5124469785761238");
        repo.save(cc);
    }

    @Test
    public void createCheckPayment() {
        Check ch = new Check();
        ch.setId(101);
        ch.setAmount(1572);
        ch.setChecknumber("MH3657");
        repo.save(ch);
    }

    @Test
    public void createBackupCheckPayment() {
        com.guineabear.springdata.hibernateinheritance.TableperEntity.Check ch = new com.guineabear.springdata.hibernateinheritance.TableperEntity.Check();
        ch.setId(101);
        ch.setAmount(1572);
        ch.setChecknumber("MH3657");
        repository.save(ch);
    }

    @Test
    public void createAnotherPayment() {
        com.guineabear.springdata.hibernateinheritance.TableperEntity.CreditCard cc = new com.guineabear.springdata.hibernateinheritance.TableperEntity.CreditCard();
        cc.setId(100);
        cc.setAmount(1572);
        cc.setCardnumber("5124469785761238");
        repository.save(cc);
    }
}
