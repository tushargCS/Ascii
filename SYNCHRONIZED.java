import java.util.Scanner;

public class SYNCHRONIZED {
    public static void main(String[] args) {


        Account a1 = new Account(1000);
        Customer1 c1 = new Customer1(a1);
        Customer1 c2 = new Customer1(a1);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
class Account {
    private int balance ;
    public Account (int bal){
        this.balance=bal;
    }
    public void withdraw(int amt){
        balance=balance-amt;
        System.out.println("withdraw money"+ amt);
        System.out.println("your current balance"+ balance);
    }
    public boolean isSufficient(int w){
        if(balance>w){
            return (true);
        }
        else return(false);
    }
}
class Customer1 implements Runnable {
    private Account account;

    public Customer1(Account account) {
        this.account = account;
    }

    public void run() {
        Scanner obj = new Scanner(System.in);
        synchronized (account) {
            System.out.println("entre the Amount to withdraw ");
            int amt = obj.nextInt();
            if (account.isSufficient(amt)) {
                account.withdraw(amt);
            } else
                System.out.println("insufficient balance");
        }
    }
}
