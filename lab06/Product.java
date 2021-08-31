/**
   A product in a vending machine.
*/
public class Product
{  
   private String description;
   private double price;

   /**
      Constructs a Product object
      @param aDescription the description of the product
      @param aPrice the price of the product
   */
   public Product(String aDescription, double aPrice)
   {  
      description = aDescription;
      price = aPrice;
   }
	public String getDescription() {
      return description;
   }
   public double getPrice() {
      return price;
   }
   public boolean equals(Object obj){
      if (obj == null) {
         return false;
      }if (this == obj) {
         return true;
      }else{
         return false;
      }  
   }
   @Override
   public String toString() {
      return description + " @ $ " + price;
   }

}
