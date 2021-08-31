import java.util.ArrayList;

/**
   An appointment calendar.
*/
public class AppointmentCalendar
{  
   private ArrayList<Appointment> appointments;

   public AppointmentCalendar(){
      appointments = new ArrayList<Appointment>();
   }

   public void add(Appointment a){
      appointments.add(a);
   }
   public void cancel(Appointment a){
      for (int i = 0; i < appointments.size(); i++) {
         Appointment appt = appointments.get(i);
         if (appt.equals(a)) {
            appointments.remove(i);
            return;
         }
      }
   }
   public ArrayList<Appointment> getAppointmentsForDay(AppointmentDate d){
      ArrayList<Appointment> appointmentsOnDay = new ArrayList<Appointment>();
      for (int i = 0; i < appointments.size(); i++) {
         if (appointments.get(i).fallsOn(d) == true){
            appointmentsOnDay.add(appointments.get(i));
         }
      }
      return appointmentsOnDay;
   }
}
