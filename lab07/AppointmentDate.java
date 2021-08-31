import java.util.StringTokenizer;

/**
   An appointment date.
*/
public class AppointmentDate
{  
   private int year;
   private int month;
   private int day;

   /*
   Add additional code here
   */

   public AppointmentDate(String d) {
      StringTokenizer tokenizer = new StringTokenizer(d);
      year = Integer.parseInt(tokenizer.nextToken("/"));
      month = Integer.parseInt(tokenizer.nextToken("/"));
      day = Integer.parseInt(tokenizer.nextToken("/"));
   }
   public boolean equals(Object other){
      if (other == null) return false;
      AppointmentDate b = (AppointmentDate) other;
      return year == b.year && month == b.month && day == b.day;
   }
   public String toString(){
      return year + "/" + month + "/" + day;
   }
}
   
