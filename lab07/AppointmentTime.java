import java.util.StringTokenizer;

/**
   An appointment time.
*/
public class AppointmentTime
{ 
   private int hours;
   private int minutes;

   public AppointmentTime(String t){
      StringTokenizer tokenizer = new StringTokenizer(t);
      hours = Integer.parseInt(tokenizer.nextToken(":"));
      minutes = Integer.parseInt(tokenizer.nextToken(":"));
   }
   public boolean equals(Object other){
      if (other == null) return false;
      AppointmentTime b = (AppointmentTime) other;
      return hours == b.hours && minutes == b.minutes;
   }
   public String toString(){
      String r = hours + ":";
      if (minutes < 10) r = r + "0";
      r = r + minutes;
      return r;
   }
}