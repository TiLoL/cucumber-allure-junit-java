package service;

import objects.Account;

public class TransferService {

    public void transfer(Account from, Account to, double amount) {
       from.withdraw(amount);
       to.deposit(amount);
    }
}
