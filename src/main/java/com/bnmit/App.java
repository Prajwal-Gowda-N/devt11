package com.bnmit;

public class App {
    int balance = 0;

    public int deposite(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        if (amount < balance) {
            balance -= amount;
        }
        return balance;
    }

    public int get_balance() {
        return balance;
    }

    public static void main(String[] args) {
        App app = new App();
        app.deposite(1000);
        app.withdraw(200);
        System.out.println(app.get_balance());
    }
}
