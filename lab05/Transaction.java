import java.time.LocalDateTime;

public class Transaction {
    private LocalDateTime dateCreated;
    private double amount;
    private double balance;
    private String description;
    private char type;


    public Transaction(char type, double amount, double balance, String description) {
        /*setType(type);
        setAmount(amount);
        setBalance(balance);
        setDescription(description);*/
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.dateCreated = LocalDateTime.now();
    }



    public LocalDateTime getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public char getType() {
        return this.type;
    }

    public void setType(char type) {
        if (type == 'w') {
            this.type = type;
        }else if (type == 'd') {
            this.type = type;
        }else {
            System.out.println("this type is invalid, please use w for withdraw or d for deposit");
        }
    }
   

    @Override
    public String toString() {
        return "{" +
            " type='" + getType() + "'" +
            ", dateCreated='" + getDateCreated() + "'" +
            ", amount='" + getAmount() + "'" +
            ", balance='" + getBalance() + "'" +
            ", description='" + getDescription() + "'" +
            "}";
    }


}
