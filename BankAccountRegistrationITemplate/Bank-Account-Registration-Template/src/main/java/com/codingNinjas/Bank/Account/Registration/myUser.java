package com.codingNinjas.Bank.Account.Registration;

import java.util.ArrayList;
import java.util.List;

/**
  This class is an implementation of a User Interface based on the selection 
  done in the console for user information.You need to complete this class 
  based on the following tasks.

   a. Adding common attributes: 
       1. String name
       2. List<Account> accountList.
   b. Override the methods of User Interface.
   c. Build the logic for all the methods based on the description mentioned in the Account Interface.

**/

public class myUser implements User{
    String name;
    List<Account> accountList;

    myUser() {
        this.accountList = new ArrayList<Account>();
    }

    @Override
    public void setUserDetails(String name) {
        this.name = name;
    }

    @Override
    public void addAccount(Account account) {
        this.accountList.add(account);
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountList;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public void setCurrentAccount(currentAccount currentAccount) {
        accountList.add(currentAccount);
    }

    public void setSavingsAccount(savingsAccount savingsAccount) {
        accountList.add(savingsAccount);
    }

    private void init() {
        System.out.println("myUser bean created!!");
    }

    private void destroy() {
        System.out.println("myUser bean destroyed!!");
    }
}
