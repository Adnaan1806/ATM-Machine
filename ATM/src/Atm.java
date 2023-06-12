import java.util.HashMap;
import java.util.Map;

public class Atm {
    private double balance;
    private double deposit;
    private double withdraw;

    public void Atm(){

    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getBalance(){
        return balance;
    }

    public double getDeposit() {
        return deposit;
    }

    public double getWithdraw() {
        return withdraw;
    }
}

class ATMOperation extends Atm{
    Map<Double,String> minist = new HashMap<>();

     public void viewBalance(){
         System.out.println("Total Balance: " + getBalance());
     }

     public void withdrawAmount(double wAmount){

        if (getBalance() == 0 || getBalance() < wAmount){
            System.out.println("Insufficient Balance, Cannot Withdraw! ");
        }
        else {
            minist.put(wAmount," Amount Withdrawn!");
            System.out.println("Collect your Amount!");
            setBalance(getBalance() - wAmount);
            viewBalance();
        }
     }
     public void depositAmount(double dAmount){
         minist.put(dAmount," Amount Deposited!");
         System.out.println("$"+ dAmount + " Deposited To Your Account Successfully!");
         setBalance(getBalance() + dAmount);
         viewBalance();
     }

     public void viewTransactionHistory(){
         for (Map.Entry<Double,String> m:minist.entrySet()){
             System.out.println(m.getKey()+""+m.getValue());
         }
     }
}
