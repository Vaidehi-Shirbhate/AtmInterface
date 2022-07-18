import java.util.Scanner;
public class Main {
    public static void main(String args[] )
    {
        int balance = 10000, withdraw, deposit , transfer;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Transfer");
            System.out.println("Choose 4 for Quit");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = s.nextInt();
                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                    break;

                case 2:
                    System.out.print("Enter money to be deposited:");
                    deposit = s.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");

                    break;

                case 3:
                    System.out.println("Enter money to be transfer: ");
                    transfer = s.nextInt();
                    balance = balance - transfer;
                    System.out.println("Your Money has been transferd successfully");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}
