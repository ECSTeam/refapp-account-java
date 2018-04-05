package com.cgi.cns.refapp.domain;

public class Account {

    private String name;

    public Account() {}

    public Account(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

}
