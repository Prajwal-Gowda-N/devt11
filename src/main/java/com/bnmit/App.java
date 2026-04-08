package com.bnmit;

/**
 * Hello world!
 */
public class App {
    int balance =0;
     public int deposite(int amount) {
    	 balance += amount;
    	 return balance;
     }
     
     public int withdraw(int amount) {
    	 if(amount<balance) {
    		 balance -= amount;
    		 return balance;
    	 }
    	 return balance;
     }
     public int get_balance() {
    	 return balance;
     }
}
