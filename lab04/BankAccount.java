import java.time.LocalDate;


public class BankAccount {
    private int id;
    private double balance;
    private double annualInterestRate;
    private LocalDate dateCreated;


    public BankAccount(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = LocalDate.now();
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

    public LocalDate getdateCreated() {
        return this.dateCreated;
    }

    public double getMonthlyInterestRate(){
        double monthly = annualInterestRate / 12;
        return monthly;
    }

    public void withdraw(int wAmount){
        this.balance = balance - wAmount;
    }
   
    public void deposit(double dAmount){
        this.balance = balance + dAmount;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", balance='" + getBalance() + "'" +
            ", annualInterestRate='" + getAnnualInterestRate() + "'" +
            ", dateCreated='" + getdateCreated() + "'" +
            "}";
    }
    
    

}
