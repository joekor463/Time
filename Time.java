public class Time {
    public static void main (String args[]){
    int hours  = 0;
    int minutes = 0;

    //getDurationString(5,2);
    public static boolean getDurationString(int minutes, int seconds){
        String i = "invalid value";
          if (minutes < 0)  return i;
          if (seconds < 0) return i;
          if (seconds > 59) return i;
          if (minutes > 60) hours = minutes / 60;
          System.out.println(hours +'h'+ minutes +'m'+ seconds +'s');
         }
    public static boolean getDurationString(int seconds){
            String i = "invalid value";
            if (seconds < 0) return i;
            if (seconds > 59) minutes = seconds/60;
            System.out.println(hours+'h'+minutes+'m'+seconds+'s');
         }
        boolean g = getDurationString(5, 2);
    }
}
