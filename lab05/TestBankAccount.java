import java.util.ArrayList;
import java.util.Arrays;

public class TestBankAccount {
    
    SavingsAccount s = new SavingsAccount(27, 2000);
    CurrentAccount c = new CurrentAccount(59, 3000, 200);
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(27, 2000, "Seanie Lambe");
        CurrentAccount c = new CurrentAccount(59, 3000, "Sara O Donnell", 200);
        

        ArrayList<BankAccount> x = new ArrayList<>();
        x.add(s);
        x.add(c);
        
        s.setAnnualInterestRate(10);
        c.setAnnualInterestRate(8);

        s.withdraw(200);
        c.withdraw(30);
        s.deposit(10);

        System.out.println(Arrays.toString(x.toArray()));
        
        
       

    }
}
