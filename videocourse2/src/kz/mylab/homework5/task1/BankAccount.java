package kz.mylab.homework5.task1;

public class BankAccount {

    int id=0;
    String name="Unknown";
    double balance=0;

    double increaseBalance(double transAmount) {
        balance+=transAmount;
        return balance;
    }

    double decreaseBalance(double transAmount) {
        balance-=transAmount;
        return balance;
    }

    void showInfo() {
        System.out.println("id:"+id+" name:"+name+" balance:"+balance);
    }
}

class BankAccountTest {

    public static void main(String[] args) {
         BankAccount bA=new BankAccount();
         bA.id=1;
         bA.name="John";
         bA.balance=1000;
        bA.showInfo();
        bA.increaseBalance(100);
        bA.showInfo();
        bA.decreaseBalance(500);
        bA.showInfo();
    }
}