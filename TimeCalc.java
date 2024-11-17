public class TimeCalc {
    final static int MINUTESINHOUR = 60;
    public static void main(String[] args) {
       
            String time  = (args[0]);
            int minutesToAdd  = Integer.parseInt(args[1]);

            int i = 0;
            String hoursInput   = ""; 
            String minutesInput = "";
        
        while ( i < 5) 
            {
                char n = time.charAt(i);

                if (i < 2) { hoursInput = hoursInput + n; }
                else if (i > 2) { minutesInput = minutesInput + n; }

                i++ ;
            }

            int hoursInt = Integer.parseInt(hoursInput);
            int minutesInt = Integer.parseInt(minutesInput);
               
            int totalMinutes = 
                (hoursInt * MINUTESINHOUR) + minutesInt + minutesToAdd;

            int totalHours = totalMinutes / MINUTESINHOUR;
            int newHours = totalHours % 24;
            int newMinutes = totalMinutes - (totalHours * MINUTESINHOUR);

            String newHouString = String.valueOf(newHours);
            String newMinutesString = String.valueOf(newMinutes);

        if (newHours < 10) { newHouString = ("0" + newHouString); }

        if (newMinutes < 10 )  { newMinutesString = "0" + newMinutesString; }  

        System.out.println(newHouString + ":" + newMinutesString);    
        

    }
}
