package com.rplbo.guided;

public abstract class Wallet {
    private double totalUang;
    public abstract void insertMoney(Currency c);
    public abstract void expenseMoney(Currency c);
    public abstract void printMoney();

    public double getTotalUang() {

    }

    public void setTotalUang(double totalUang) {

    }
}
