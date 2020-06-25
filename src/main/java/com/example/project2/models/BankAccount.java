package com.example.project2.models;

import javax.persistence.Entity;

@Entity
public class BankAccount extends BillingDetails {
    private static final long serialVersionUID = 1L;
    //@Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    //private Long idBankAccount;
    private String account;
    private String bankName;
    private String swift;

    protected BankAccount(){};

    public BankAccount(String account, String bankName, String swift) {
        this.account = account;
        this.bankName = bankName;
        this.swift = swift;
    }

    public String getAccount() {

        return account;
    }

    public void setAccount(String account) {

        this.account = account;
    }

    public String getBankName() {

        return bankName;
    }

    public void setBankName(String bankName) {

        this.bankName = bankName;
    }

    public String getSwift() {

        return swift;
    }

    public void setSwift(String swift) {

        this.swift = swift;
    }
}
