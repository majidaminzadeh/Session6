package com.tosan.polymorphism;

public class PasandazDeposit extends Deposit {
    public void withdrawal(int balance){
        System.out.println("Pasandaz withdrawal");
    }
    public void print(){
        System.out.println("You called print method");
    }
}
