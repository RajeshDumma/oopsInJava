public class Bank{
    private  String accountHolderName;
    private  String accountNumber;
    private  double balance;

    public Bank(String accountHolderName, String accountNumber, double balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount <= 0) {
            System.out.println("Invalid deposit amount");
            return;
        }
         else {
            balance += amount;
            System.out.println("Deposited " + amount);
        }
    }
    public void withdraw(double amount){
        if(amount <= 0) {
            System.out.println("Invalid withdraw amount");
            return;
        }else if(amount > balance) {
            System.out.println("Insufficient amount");
            return;
        } else{
            balance -= amount;
                    System.out.println("Withdrawn " + amount);
        }
    }
    public void checkBalance(){
        System.out.println("Balance is " + balance);
    }
    public static void main(String[] args) {
        Bank bank = new Bank("Rajesh", "12345", 1000);
        bank.deposit(3000);
        bank.withdraw(2000);
        bank.checkBalance();
        System.out.println("--------------------");
        Bank bank2 = new Bank("Srinu", "12345", 10);
        bank2.deposit(0);
        bank2.withdraw(80);
        bank2.checkBalance();
        System.out.println("--------------------");
        Bank bank3 = new Bank("Ameer", "12345", 100);
        bank3.deposit(3000);
        bank3.withdraw(0);
        bank3.checkBalance();
    }
}