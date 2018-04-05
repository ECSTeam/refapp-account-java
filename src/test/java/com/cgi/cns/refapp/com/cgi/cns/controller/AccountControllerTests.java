package com.cgi.cns.refapp.com.cgi.cns.controller;

import com.cgi.cns.refapp.controller.AccountController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(AccountController.class)
public class AccountControllerTests
{
    private AccountController accountController = new AccountController();
    @Test
    public void AccountNameTest(){
        Assert.assertSame("Account name does not match","Test Account Name", accountController.AccountName());
    }
}
