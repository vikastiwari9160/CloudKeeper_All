public class BankAssignment {

    public static void main(String[] args){
        BankAccount acc1 = new BankAccount(101,"XYZ",0);
        System.out.println(acc1.getAccountNumber());
        System.out.println(acc1.getHolderName());
        System.out.println(acc1.getBalance());
        acc1.Deposit(1000);
        acc1.Withdraw(50);
        System.out.println(acc1.getBalance());
    }
}

class BankAccount{
    private long accountNumber = 0;
    private String holderName ;
    private int balance;

    BankAccount(long accountNumber, String holderName, int balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    long getAccountNumber(){
        return this.accountNumber;
    }

    String getHolderName(){
        return this.holderName;
    }

    void setHoldername(String newName){
        this.holderName=newName;
    }

    int getBalance(){
        return this.balance;
    }

    void Deposit(int amount){
        this.balance+=amount;
    }

    void Withdraw(int amount){
        this.balance-=amount;
    }

}
