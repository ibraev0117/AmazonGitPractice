package com.digital_nomads.javaFall2021.application;

import static com.digital_nomads.javaFall2021.application.Bank.transferFunds;
public class BankerDemo {
    public static void main(String[] args) throws Exception {

        DemirBank nursultanDemirBankAccount = new DemirBank(118000000000l,123456789);
        DemirBank urmatDemirBankAccount = new DemirBank(118111122122l,987654321);

        System.out.println(nursultanDemirBankAccount.getBalance());
        nursultanDemirBankAccount.deposit(5000);
        System.out.println("After deposit " + nursultanDemirBankAccount.getBalance());

        transferFunds(nursultanDemirBankAccount,urmatDemirBankAccount,2000);
        System.out.println("Urmat deposit " + urmatDemirBankAccount.getBalance());
        System.out.println("After transfer" + nursultanDemirBankAccount.getBalance());

        transferFunds(urmatDemirBankAccount,nursultanDemirBankAccount,100000);
        System.out.println(nursultanDemirBankAccount.getBalance());

    }
}
