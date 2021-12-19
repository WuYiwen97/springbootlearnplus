package com.wuyiwen;

import com.wuyiwen.dao.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AccountServiceTest {

    @Autowired
    @Qualifier("proxyAccountService")
    private IAccountService as;

    @Test
    public  void testTransfer(){
        as.transfer("wo","ni",100);
    }
}

