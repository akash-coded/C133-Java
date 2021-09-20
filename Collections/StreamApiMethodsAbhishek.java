package Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

class Bank {
    private String name;
    private int accountBalance;

    public Bank(String name, int accountBalance) {
        this.name = name;
        this.accountBalance = accountBalance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public int interest() {
        return (int) (this.accountBalance * 0.1 + this.accountBalance);
    }

    @Override
    public String toString() {
        return "Bank{" + "name='" + name + '\'' + ", accountBalance=" + accountBalance + '}';
    }
}

public class StreamApiMethodsAbhishek {
    public static void main(String[] args) {
        Bank bank1 = new Bank("SBI", 1000);
        Bank bank2 = new Bank("PNB", 2000);
        Bank bank3 = new Bank("SBI", 5000);
        Collection<Bank> banksList = Arrays.asList(bank1, bank2, bank3);
        List<Bank> list = banksList.stream().filter(ele -> ele.getName().equalsIgnoreCase("SBI")).map(ele -> {
            double i = (int) ele.getAccountBalance() * 0.1;
            ele.setAccountBalance((int) (i + ele.getAccountBalance()));
            return ele;
        }).collect(Collectors.toList());
        System.out.println(list.size() + " " + list);
    }
}