public class SavingsAccount extends BankAccount{

    
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }
    
    
    public void withdraw(int wAmount){
        if(getBalance() > wAmount){
            setBalance(getBalance() - wAmount);
        }else{
            System.out.println("You dont have enough money to withdraw " + wAmount + " from this savings account");
        }
    }
    
    public String toString(){
        return super.toString();
    }
}
