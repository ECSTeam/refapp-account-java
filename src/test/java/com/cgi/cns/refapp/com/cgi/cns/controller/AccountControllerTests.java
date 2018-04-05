package com.cgi.cns.refapp.com.cgi.cns.controller;

import com.cgi.cns.refapp.domain.Account;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AccountControllerTests
{
    @LocalServerPort
    private int port;

    private URL baseControllerUrl;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() throws Exception {
        this.baseControllerUrl = new URL("http://localhost:" + port + "/");
    }

    @Test
    public void getAccountByName_BubbaIsFound(){

        // Arrange
        String methodUrl = this.baseControllerUrl.toString() + "bubba";

        // Act
        ResponseEntity<Account> response = template.getForEntity(methodUrl, Account.class);

        // Assert
        Assert.assertNotNull(response);

        Account theAccount = response.getBody();
        Assert.assertNotNull(theAccount);

        Assert.assertEquals("bubba", theAccount.getName());

    }

    @Test
    public void getAccountByName_MaryIsNOTFound(){

        // Arrange
        String methodUrl = this.baseControllerUrl.toString() + "mary";

        // Act
        ResponseEntity<Account> response = template.getForEntity(methodUrl, Account.class);

        // Assert
        Assert.assertNotNull(response);

        Account theAccount = response.getBody();
        Assert.assertNull(theAccount);

    }

}
