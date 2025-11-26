import java.util.Scanner;

public class BankAccount {
    private int accountID;
    private double balance;
    public BankAccount(int accountID, double balance){
        this.accountID=accountID;
        this.balance=balance;
    }
    public int getAccountID(){
        return accountID;
    }

    public double getBalance() {
        return balance;
    }
    public void Deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("Deposit Succesful. New balance: " + balance);
        }
        else {
            System.out.println("Enter Positive amount please.");
        }
    }
    public void Withdraw(double amount, Scanner sc){
        if(balance>=amount){
            balance -=amount;
            System.out.println("Withdrawal Succesful. Remaining balance: " + balance);
        }
        else {
            System.out.println("Insufficient funds. Would you like to borrow? (Yes/No)");
            String response=sc.nextLine();
            if(response.equalsIgnoreCase("yes")){
                balance -=amount;
                System.out.println("Withdrawal succesful. New balance: " + balance);
            }
            else {
                System.out.println("Operation cancelled.");
            }
        }
    }
    public void accountDetails(){
        System.out.println("Your ID: " + accountID);
        System.out.println("Your balance: " + balance);
    }
}