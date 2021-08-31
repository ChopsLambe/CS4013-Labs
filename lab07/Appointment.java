import java.util.StringTokenizer;

/**
   An appointment.
*/
public class Appointment
{ 
   private String description;
   private AppointmentDate day;
   private AppointmentTime from;
   private AppointmentTime to;

  public Appointment(String s){
     StringTokenizer tokenizer = new StringTokenizer(s);
     int descriptionCount = tokenizer.countTokens() - 3;
     description = " ";
     for (int i = 1; i <= descriptionCount; i++) {
        description += tokenizer.nextToken();
        if (i < descriptionCount) {
           description += " ";
        }
     }
      day = new AppointmentDate(tokenizer.nextToken());
      from = new AppointmentTime(tokenizer.nextToken());
      to = new AppointmentTime(tokenizer.nextToken());
  }
  public boolean equals(Object other){
     if (other == null) return false;
        Appointment b = (Appointment) other;
        
        return description.equals(b.description) &&
        day.equals(b.day) && from.equals(b.from) && to.equals(b.to);
     }
  
  public boolean fallsOn(AppointmentDate d){
     return day.equals(d);
  }
  public String format(){
     return description + " " + day + " " + from + " " + to;
  }
   
}
