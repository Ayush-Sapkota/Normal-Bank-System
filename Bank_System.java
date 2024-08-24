package Bank;

/**
 * Bank System Application
 * 
 * Copyright (c) 2024 Ayush Sapkota. All rights reserved.
 */

import java.util.Scanner;

class Bank_System {

    private String Holder_Name;
    private String Acc_Num;
    private double balance;

    public Bank_System(String Holder_Name, String Acc_Num, double balance) {
        this.Holder_Name = Holder_Name;
        this.Acc_Num = Acc_Num;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully Deposited " + amount + " In Your Account");
        } else {
            System.out.println("Please Make sure to enter Positive Integer ");
        }
    }

    public void check() {
        System.out.println("The Balance In The Acc " + Acc_Num + " Is " + balance + " Rs");
    }

    public void withdraw(Double Amt) {
        if (Amt <= balance) {
            balance -= Amt;
            System.out.println("Successfully Withdrawn " + Amt + " From Your Account");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void Acc_Info() {
        System.out.println("Account Holder: " + Holder_Name);
        System.out.println("Account Number: " + Acc_Num);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String holder, Acc_Num;
        double bal;
        int choice;

        System.out.println("Enter The name of Account Holder");
        holder = scanner.nextLine();
        System.out.println("Enter Acc_Num");
        Acc_Num = scanner.nextLine();
        System.out.println("Enter Initial Balance");
        bal = scanner.nextDouble();

        Bank_System obj = new Bank_System(holder, Acc_Num, bal);
        do {
            System.out.println("Enter what to do");
            System.out.println("1. Deposit Money");
            System.out.println("2. Check Balance");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Account Info");
            System.out.println("BY AYUSH SAPKOTA");
          

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Double dep;
                    System.out.println("Enter How Much You Want to Deposit in Your Account");
                    dep = scanner.nextDouble();
                    obj.deposit(dep);
                    break;
                case 2:
                    obj.check();
                    break;
                case 3:
                    Double amt;
                    System.out.println("Enter the amount to Withdraw");
                    amt = scanner.nextDouble();
                    obj.withdraw(amt);
                    break;
                case 4:
                    obj.Acc_Info();
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        scanner.close();
    }
}
