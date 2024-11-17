public class TimeCalc {
    public static void main(String[] args) {
       final int minutesInHour = 60;
    
        String time  = (args[0]);
        int minutesToAdd  = Integer.parseInt(args[1]);

        int i = 0;
                String hoursInput   = ""; 
                String minutesInput = "";
        
        while ( i < 5) {
                char n = time.charAt(i);

                if (i < 2) { hoursInput = hoursInput + n; }
                else if (i > 2) { minutesInput = minutesInput + n; }

                i++ ;
            }

                int hoursInt = Integer.parseInt(hoursInput);
                int minutesInt = Integer.parseInt(minutesInput);
               
        int totalMinutes = 
                (hoursInt * minutesInHour) + minutesInt + minutesToAdd;

        int totalHours = totalMinutes / minutesInHour;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * minutesInHour);

        String newHouString = String.valueOf(newHours);
        String newMinutesString = String.valueOf(newMinutes);

        if (newHours < 12) { 
            newHouString = ("0" + newHouString); }

        if (newMinutes < 10 )  {
            newMinutesString = "0" + newMinutesString; }  

        System.out.println(newHouString + ":" + newMinutesString);    
        

    }
}
