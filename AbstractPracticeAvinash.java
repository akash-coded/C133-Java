import java.util.*;

abstract class BankAcc {
    int Balance = 0;

    final static String currencyType = "INR";

    abstract void ShowAccBal();

    abstract void withdrawMoney(int Debit);

    abstract void depositMoney(int Credit);

    String showCurrencyType() {
        return currencyType;
    }
}

class SBI extends BankAcc {
    void ShowAccBal() {
        System.out.println("Your current account balance in SBI is " + showCurrencyType() + " " + Balance);
    }

    void withdrawMoney(int Debit) {
        if (Debit > Balance) {
            System.out.println("You don't have enough money in your account to withdraw.");
        } else {
            Balance -= Debit;
            System.out.println("Your account has been debited with amount " + Debit);
        }
        ShowAccBal();
    }

    void depositMoney(int Credit) {
        Balance += Credit;
        System.out.println("Your account has been credited with amount " + Credit);
        ShowAccBal();
    }
}

class PNB extends BankAcc {
    int count = 0;

    void ShowAccBal() {
        System.out.println("Your current account balance in SBI is " + showCurrencyType() + " " + Balance);
    }

    void withdrawMoney(int Debit) {
        if (Debit > Balance) {
            System.out.println("You don't have enough money in your account to withdraw.");
        } else {
            Balance -= Debit;
            System.out.println("Your account has been debited with amount " + Debit);
        }
        ShowAccBal();
    }

    void depositMoney(int Credit) {
        Balance += Credit;
        System.out.println("Your account has been credited with amount " + Credit);
        ShowAccBal();
    }

}

public class AbstractPracticeAvinash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your bank name : ");
        String Bank = sc.nextLine();
        sc.close();
        if (Bank.equals("PNB")) {
            PNB pnb = new PNB();
            pnb.ShowAccBal();
            pnb.depositMoney(20000);
            pnb.withdrawMoney(15000);
        } else if (Bank.equals("SBI")) {
            SBI sbi = new SBI();
            sbi.ShowAccBal();
            sbi.depositMoney(20000);
            sbi.withdrawMoney(15000);
        } else {
            System.out.println("The services for this bank is not available.");
        }
    }
}
