package com.cgi.cns.refapp.repository;

import com.cgi.cns.refapp.domain.Account;

public interface AccountRepository {

    Account findByName(String name);

}
