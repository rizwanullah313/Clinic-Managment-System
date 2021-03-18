import static java.lang.Thread.sleep;
import java.util.Calendar;
//import java.util.Date;



public class DateAndTime {    
    
public String Date;
public String Time;

  
    public DateAndTime(String Date, String Time){
        this.Date = Date;
        this.Time = Time;
    }
     
    public void DateAndTime(){
         
         Thread clock = new Thread(){
                 public void run(){
                     for(;;){
               Calendar now = Calendar.getInstance();
           
             int month = now.get(Calendar.MONTH);
            int day = now.get(Calendar.DAY_OF_MONTH);
            int year = now.get(Calendar.YEAR);
            
           Date = ("" + (month + 1) + "/" + day + "/" + year);
          
                         System.out.print(Date);
          int second = now.get(Calendar.SECOND);
          int minute = now.get(Calendar.MINUTE);
          int hour = now.get(Calendar.HOUR);
          int am = now.get(Calendar.AM_PM);
            String Shour = String.valueOf(hour);
            String Sminute =String.valueOf(minute);
            String Ssecond = String.valueOf(second);
            String Sam = null;
            if(hour < 10){
                Shour = "0" + hour;
            }
            if(minute < 10)
            {
                Sminute = "0" + minute;
            }
              if( second< 10)
            {
                Ssecond = "0" + second;
            }
              if(am ==0){
                  Sam = "AM";
              }
              else{
                  Sam = "PM";
              }
            
             Time = ("" + Shour + ":" + Sminute + ":" + Ssecond + ":" + Sam);
                         System.out.print(Time);
          
           try{
                             sleep(1000);
                         }
                         catch(Exception e){
                             
                         }
                     }
                     
                 }
             };
            clock.start();
            
    }


}
