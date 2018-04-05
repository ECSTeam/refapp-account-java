package com.cgi.cns.refapp.service;

import com.cgi.cns.refapp.domain.Account;
import com.cgi.cns.refapp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account findByName(String accountName) {
        return accountRepository.findByName(accountName);
    }

}
