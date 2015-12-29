/*
 * Copyright © 2015 Armand Agopian
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package assignments.semester1;

import java.text.NumberFormat;

public class Account {
    private final double RATE = 0.035;
    private NumberFormat fmt = NumberFormat.getCurrencyInstance();
    private long acctNumber;
    private double balance;
    private String name;

    public Account(String owner, long account, double initial) {
        name = owner;
        acctNumber = account;
        balance = initial;
    }

    public double deposit(double amount) {
        if (amount < 0) {
            System.out.println();
            System.out.println("Error: Deposit amount is invalid.");
            System.out.println(acctNumber + " " + fmt.format(amount));
        } else {
            balance = balance + amount;
        }
        return balance;
    }

    public double withdraw(double amount, double fee) {
        amount += fee;
        if (amount < 0) {
            System.out.println();
            System.out.println("Error: Withdraw amount is invalid.");
            System.out.println("Account: " + acctNumber);
            System.out.println("Requested: " + fmt.format(amount));
        } else if (amount > balance) {
            System.out.println();
            System.out.println("Error: Insufficient funds.");
            System.out.println("Account: " + acctNumber);
            System.out.println("Requested: " + fmt.format(amount));
            System.out.println("Available: " + fmt.format(balance));
        } else {
            balance = balance - amount;
        }
        return balance;
    }

    public double addInterest() {
        balance += (balance * RATE);
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return acctNumber;
    }
}