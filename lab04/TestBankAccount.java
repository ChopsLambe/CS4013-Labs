import java.util.ArrayList;
import java.util.Arrays;

public class TestBankAccount {
    
    SavingsAccount s = new SavingsAccount(27, 2000);
    CurrentAccount c = new CurrentAccount(59, 3000, 200);
    public static void main(String[] args) {
        BankAccount b = new BankAccount(75, 5000);
        SavingsAccount s = new SavingsAccount(27, 2000);
        CurrentAccount c = new CurrentAccount(59, 3000, 200);

        ArrayList<BankAccount> x = new ArrayList<>();
        x.add(b);
        x.add(s);
        x.add(c);
        
        b.setAnnualInterestRate(5);
        s.setAnnualInterestRate(10);
        c.setAnnualInterestRate(8);
        b.deposit(70);
        s.withdraw(2000);
        c.withdraw(3199);

        System.out.println(Arrays.toString(x.toArray()));
       

    }
}
