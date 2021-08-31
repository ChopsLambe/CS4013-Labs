import java.time.LocalDateTime;
import java.util.ArrayList;



public class BankAccount {
    private int id;
    private double balance;
    private double annualInterestRate;
    private LocalDateTime dateCreated;
    private String name;
    ArrayList<Transaction> transactions = new ArrayList<>();


    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = LocalDateTime.now();
    }

    public BankAccount(int id, double balance, String name) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = LocalDateTime.now();
        this.name = name;
    }

	public void setId(int id) {
        this.id = id;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public LocalDateTime getdateCreated() {
        return this.dateCreated;
    }

    public double getMonthlyInterestRate(){
        double monthly = annualInterestRate / 12;
        return monthly;
    }

    public void withdraw(int wAmount){
        this.balance = balance - wAmount;
        Transaction baw = new Transaction('w', wAmount, balance, "withdrawing " + wAmount + " from bank account");
        transactions.add(baw);
    }
   
    public void deposit(double dAmount){
        this.balance = balance + dAmount;
        Transaction bad = new Transaction('d', dAmount, balance, "depositing " + dAmount + " into bank account");
        transactions.add(bad);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", balance='" + getBalance() + "'" +
            ", annualInterestRate='" + getAnnualInterestRate() + "'" +
            ", dateCreated='" + getdateCreated() + "'" +
            ", name='" + getName() + "'" +
            "}" + transactions.toString();
    }
    
    

}
