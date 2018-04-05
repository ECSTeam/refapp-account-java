package com.cgi.cns.refapp.repository;

import com.cgi.cns.refapp.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;

@Repository
public class AccountRepositoryMemoryImpl implements AccountRepository {

    private static ArrayList<Account> accounts = new ArrayList<>();

    static {
        accounts.add(new Account("bubba"));
        accounts.add(new Account("harold"));
        accounts.add(new Account("sulman"));
        accounts.add(new Account("robb"));
    }

    @Override
    public Account findByName(String name) {

        Account localAccounts[] = new Account[accounts.size()];
        localAccounts = accounts.toArray(localAccounts);

        return Arrays
                .stream(localAccounts)
                .filter(x -> x.getName().equals(name))
                .findFirst()
                .orElse(null);

    }

}
