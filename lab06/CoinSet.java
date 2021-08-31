import java.util.ArrayList;
/**
   A set of coins.
*/
public class CoinSet
{  
   private ArrayList<Coin> set;

   /**
      Constructs a CoinSet object.
   */
   public CoinSet()
   {  
      set = new ArrayList<Coin>();
   }
  
   public void addCoin(Coin c){
      set.add(c);
   }

   public void addCoins(CoinSet other){
      for (int i = 0; i < other.otherSize(); i++) {
         set.add(other.otherGet(i));
      }
   }
   public Coin otherGet(int i){
      return set.get(i);
   }
   public int otherSize(){
      return set.size();
   }

   public double getValue(){

     double total = 0;
      for (int i = 0; i < set.size(); i++) {
         total = total + set.get(i).getValue();
      }
      return total;
   }

   public void removeAllCoins() {
      for (Coin coin : set) {
         set.remove(coin);
       }
   }
}