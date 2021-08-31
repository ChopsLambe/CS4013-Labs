import java.util.ArrayList;

/**
   A vending machine.
*/
public class VendingMachine
{  
   private ArrayList<Product> products;
   public CoinSet coins;
   public CoinSet currentCoins;

   /**
      Constructs a VendingMachine object.
   */
   public VendingMachine()
   { 
      products = new ArrayList<Product>();
      coins = new CoinSet();
      currentCoins = new CoinSet();
   }

   public Object[] getProductTypes() {
      return products.toArray();
   }
   public void addCoin(Coin c){
   currentCoins.addCoin(c);
   }
   public void addProduct(Product p, int Quantity) {
      for (int i = 0; i < Quantity; i++) {
         products.add(p);
      }
   }
   public void buyProduct(Product p) {
      for (int i = 0; i < products.size(); i++) {
         Product prod = products.get(i);
         if (prod.equals(p)) {
            double payment = currentCoins.getValue();
            if (p.getPrice() <= payment){
               products.remove(i);
               coins.addCoins(currentCoins);
               currentCoins.removeAllCoins();
               return;
            }else{
               throw new VendingException("insufficient funds");
            }
         }
      }
      throw new VendingException("no such product");
   }
   public String removeMoney(){
      double amountRemoved = coins.getValue();
      coins.removeAllCoins();
      return amountRemoved + " has been removed from the machine";
     
   }
}