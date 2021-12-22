package com.tosan.polymorphism;

public class JariDeposit extends Deposit {
    public void defray(int balance){
        System.out.println("Jari defray");
    }
    public void cheque(){
        System.out.println("You can have a cheque");
    }
}
