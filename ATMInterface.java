import java.util.ArrayList;
import java.util.Scanner;

public class ATMInterface 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String n = sc.nextLine();
        System.out.println("Enter your Username:");
        String u = sc.nextLine();
        System.out.println("Enter your Pin:");
        String p = sc.nextLine(); 
        System.out.println("Enter your Account Number:");
        String nu = sc.nextLine(); 
        System.out.println("Registration Completed");

        int min = 0;
        int max = 3;

        while(min < max)
        {
            System.out.println("Enter your Username:");
            String u1 = sc.nextLine();
            System.out.println("Enter your Pin:");
            String p1 = sc.nextLine();

            if(u.equals(u1) && p.equals(p1))
            {
                System.out.println("Login Completed");
                int balance = 10000;
                ArrayList<String> transactionhistory = new ArrayList<>();
                while (true)
                {
                    System.out.println("Please Choose Service:");
                    System.out.println("1. Withdraw");
                    System.out.println("2. Deposit");
                    System.out.println("3. Transfer");
                    System.out.println("4. Transaction History");
                    System.out.println("5. Quit");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice)
                    {
                        case 1:
                        System.out.println("Enter the Ammount of withdraw:");
                        int withdrawamount = sc.nextInt();
                        if( withdrawamount > 0 && withdrawamount <= balance)
                        {
                            balance -= withdrawamount;
                            transactionhistory.add("Withdraw:"+withdrawamount);
                            System.out.println("Withdraw Successful. You'r account balance is "+balance);
                        }
                        else
                        {
                            System.out.println("Insufficient Balance");
                        }
                        break;

                        case 2:
                        System.out.println("Enter the Ammount of deposit:");
                        int depositammount = sc.nextInt();
                        if(depositammount > 0)
                        {
                            balance += depositammount;
                            transactionhistory.add("Deposit:"+depositammount);
                            System.out.println("Deposit Succeddful. You'r account balance is "+balance);
                        }
                        else
                        {
                            System.out.println("Invalid ammount.");
                        }
                        break;

                        case 3:
                        System.out.println("Enter the the account number to tranfer to:");
                        String accountnumber = sc.nextLine();
                        System.out.println("Enter the ammount to transfer");
                        int transferammount = sc.nextInt();
                        if(transferammount > 0 && balance >= transferammount)
                        {
                            balance -= transferammount;
                            transactionhistory.add("Transfer to" +accountnumber+ ":" +transferammount);
                            System.out.println("Transfer completed. You'r account balance is "+balance);
                        }
                        else
                        {
                            System.out.println("Insufficient balance for tranfer");
                        }
                        break;

                        case 4:
                        System.out.println("Transaction History:");
                        for (String transaction : transactionhistory)
                        {
                            System.out.println(transaction);
                        }
                        break;

                        case 5:
                        System.out.println("Thank you for using ATM. Goodbyee!");
                        System.exit(0);
                        break;

                        default:
                        System.out.println("Invalid Choice");
                        break;
                    }
                }
            }
            else
            {
            min++;
            System.out.println("Sorry, Username and Password Dose't match");
            System.out.println("Try Again!");
            System.out.println("Attempts left:"+ (max-min));
            }
        }
        if(min <= max)
        {
            System.out.println("Maximum login attempts reached. Exiting program.");
            System.exit(0);
        }
    }
}