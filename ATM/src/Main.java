import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     ATMOperation atm = new ATMOperation();

        Scanner scanner = new Scanner(System.in);
        System.out.println("------------ WELCOME TO ATM ------------");
        System.out.println("Enter Pin Number: ");
        int pinNo = scanner.nextInt();

        if (pinNo == 222) {
            while (true) {
                System.out.println("Select 1 for View Available Balance");
                System.out.println("Select 2 for Withdraw Amount");
                System.out.println("Select 3 for Deposit Amount");
                System.out.println("Select 4 for View Transaction History");
                System.out.println("Select 5 for Exit");

                System.out.println("Please Select an Option: ");
                int option = scanner.nextInt();

                if (option == 1){
                   atm.viewBalance();
                }
                else if (option == 2) {
                    System.out.println("Enter Amount To Be Withdrawn: ");
                    double withdraw = scanner.nextDouble();
                    atm.withdrawAmount(withdraw);
                }
                else if (option == 3) {
                    System.out.println("Enter Amount To Be Deposited: ");
                    double deposit = scanner.nextDouble();
                    atm.depositAmount(deposit);
                }
                else if (option == 4) {
                    System.out.println("----------------------------");
                    atm.viewTransactionHistory();
                    System.out.println("----------------------------");
                }
                else if (option == 5) {
                    System.out.println("Please Collect your Card!");
                    System.out.println("Thank You For Using ATM!");
                    System.exit(0);
                }
                else {
                    System.out.println("Please Select An Option from Above 0 - 5, and Try Again! ");
                }
            }
        }
        else{
            System.out.println("Incorrect Pin! Please try again");
        }
    }
}