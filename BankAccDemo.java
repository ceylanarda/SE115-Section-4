import java.util.Scanner;
public class BankAccDemo {
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        BankAccount acc1 = new BankAccount(100, 5000);
        BankAccount acc2 = new BankAccount(90, 10000);
        //See details.
        acc1.accountDetails();
        acc2.accountDetails();

        System.out.println("Would you like to change your ID? (yes/no)");
        String input = sc.nextLine();
        if(input=="yes") {
            System.out.println("Enter your new ID:");
            int newid = sc.nextInt();
        }
        boolean quit = false;

        while (!quit){
            System.out.println("MENU " + "Your ID: " + acc1.getAccountID());
            System.out.println("1 -> Deposit");
            System.out.println("2 -> Withdraw");
            System.out.println("3 -> Account Details");
            System.out.println("4 -> Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();

            switch (choice){
                case 1: //Deposit
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextInt();
                    acc1.Deposit(dep);
                    break;
                case 2: //Withdraw
                    System.out.print("Enter amount to Withdraw: ");
                    double with = sc.nextDouble();
                    acc1.Withdraw(with, sc);
                    break;
                case 3: //Details
                    acc1.accountDetails();
                    break;
                case 4: //Quit
                    System.out.println("Exiting System.");
                    quit = true;
                    break;
            }
            System.out.println("Accounts' details");
            acc1.accountDetails();
            acc2.accountDetails();
        }
    }
}
//  GITHUB USERNAME: ceylanarda!