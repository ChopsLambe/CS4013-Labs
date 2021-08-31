public class CurrentAccount extends BankAccount{

    private double overdraftLimit;

    public CurrentAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public CurrentAccount(int id, double balance, String name, double overdraftLimit) {
        super(id, balance, name);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(int wAmount){
        if(getBalance() + overdraftLimit > wAmount){
            setBalance(getBalance() - wAmount);
            double balance = getBalance();
            Transaction caw = new Transaction('w', wAmount, balance, "withdrawing " + wAmount + " from current account");
            transactions.add(caw);
        }else{
            System.out.println("You dont have enough money to withdraw " + wAmount + " from this current account");
        }
    }

    public String toString(){
        return super.toString();
    }
}
