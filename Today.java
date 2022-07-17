/** Интерфейс Today отвеает за нахождение сегодняшней даты.
 * 
 */


package Planer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface Today {
    static LocalDate date = LocalDate.now();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
    static String str = date.format(formatter);
    static String [] strings = str.split("-");
    static int year = Integer.parseInt(strings[0]);
    static int month = Integer.parseInt(strings[1]);
    static int day = Integer.parseInt(strings[2]);

    public static int getYear() {
        return year;
    }
    public static int getMonth() {
        return month;
    }
    public static int getDay() {
        return day;
    }

    public static int getYearEnd(int a){
       
        LocalDate date1= date.plusDays(a);
        String str = date1.format(formatter);
        String [] strings = str.split("-");
        int res = Integer.parseInt(strings[0]);

        return res;
        
    }

    public static int getMonthEnd(int a){
       
        LocalDate date1= date.plusDays(a);
        String str = date1.format(formatter);
        String [] strings = str.split("-");
        int res = Integer.parseInt(strings[1]);

        return res;
        
    }
    
    public static int getDayEnd(int a){
       
        LocalDate date1= date.plusDays(a);
        String str = date1.format(formatter);
        String [] strings = str.split("-");
        int res = Integer.parseInt(strings[2]);

        return res;
        
    }
}