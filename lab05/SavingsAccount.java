public class SavingsAccount extends BankAccount{

    
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }

    public SavingsAccount(int id, double balance, String name) {
        super(id, balance, name);
    }
    
    
    public void withdraw(int wAmount){
        if(getBalance() > wAmount){
            setBalance(getBalance() - wAmount);
            double balance = getBalance();
            Transaction saw = new Transaction('w', wAmount, balance, "withdrawing " + wAmount + " from savings account");
            transactions.add(saw);
        }else{
            System.out.println("You dont have enough money to withdraw " + wAmount + " from this savings account");
        }
    }
    
    public String toString(){
        return super.toString();
    }
}
