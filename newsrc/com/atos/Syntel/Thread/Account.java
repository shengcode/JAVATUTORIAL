package com.atos.Syntel.Thread;

public class Account {
    int amount = 10000;
    synchronized void withdraw(int amount){
        System.out.println("goint to withdraw.........");
        if(this.amount <amount){
            System.out.println("Less balance; waiting for deposit ........");
            try {
                wait();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        this.amount-=amount;
        System.out.println("withdraw completed....");
    }
    synchronized void deposit(int amount){
        System.out.println("goint to deposit....");
        this.amount+=amount;
        System.out.println("deposit completed....");
        notify();
    }
    
}
