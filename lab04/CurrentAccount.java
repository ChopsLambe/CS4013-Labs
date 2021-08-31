public class CurrentAccount extends BankAccount{

    private double overdraftLimit;

    public CurrentAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(int wAmount){
        if(getBalance() + overdraftLimit > wAmount){
            setBalance(getBalance() - wAmount);
        }else{
            System.out.println("You dont have enough money to withdraw " + wAmount + " from this current account");
        }
    }

    public String toString(){
        return super.toString();
    }
}
