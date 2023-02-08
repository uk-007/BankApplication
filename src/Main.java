import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter your name, password and initial balance");
       String name = sc.next();
       String password = sc.next();
       int balance = sc.nextInt();

       SBIAccount kunalAcc = new SBIAccount(name, balance, password);
       System.out.println("Your account has been created with account number: "+kunalAcc.getAccountNo());

       // getBalance
        System.out.println("Your current balance is: "+kunalAcc.getBalance());

        // deposit
        System.out.println(kunalAcc.depositMoney(500));
        System.out.println("New balance is: "+kunalAcc.getBalance());

        //withdraw
        System.out.println("Enter amount to be withdrawn: ");
        int amount = sc.nextInt();
        System.out.println("Enter your password");
        String enteredPassword = sc.next();

        System.out.println(kunalAcc.withdraw(amount,enteredPassword));
        System.out.println("Current balance is "+kunalAcc.getBalance());

        // ineterst
        System.out.println("Interest for 4 years on current balance "+kunalAcc.getBalance()+" is "+kunalAcc.calculateInterest(4));
    }
}