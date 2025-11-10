public class MiniBankApplicationExample {

    static class OverDraft extends Exception{
        OverDraft(String msg){
            super(msg);
        }
    }
    static class InvalidAmount extends Exception{
        InvalidAmount(String msg){
            super(msg);
        }

    }

    static class MiniBank {
        private static int accounts = 0;

        private int accountNo;
        private String holderName;
        private int balance;

        MiniBank(String name, int balance) {
            accounts++;
            this.accountNo = accounts + 100;
            this.holderName = name;
            this.balance = balance;
        }

        int getTotalAccounts(){
            return accounts;
        }


        int getBalance() {
            return this.balance;
        }

        void Deposit(int amount) {
            try {
                if (amount <= 0) {
                    throw new InvalidAmount("Amount Could not be less then or equal to Zero.");
                } else {
                    this.balance += amount;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        void Withdraw(int amount) {
            try {
                if (amount <= 0) {
                    throw new InvalidAmount("Amount Could not be less then or equal to Zero.");
                } else if (amount > this.balance) {
                    throw new OverDraft("OverDraft is not allowed!!");
                }else{
                    this.balance-=amount;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    public static void main(String[] args){
        MiniBank acc1 = new MiniBank("XYZ",500);

        System.out.println(acc1.getBalance());

        acc1.Deposit(-10);
        acc1.Deposit(0);
        acc1.Deposit(1000);

        System.out.println(acc1.getBalance());

        acc1.Withdraw(-10);
        acc1.Withdraw(0);
        acc1.Withdraw(10000);
        acc1.Withdraw(500);

        System.out.println(acc1.getBalance());

        System.out.println(MiniBank.accounts);
    }

}
