package demo.day04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
public class Calendar {
    private int year;
    private int month;
    private int day;
    public Calendar() {
    }
    public Calendar(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Calendar(String strDate) throws Exception {
        this.year = strDate.indexOf(0, 3);
        this.month = strDate.indexOf(5, 6);
        this.day = strDate.indexOf(8, 9);
    }
    public int dayOfYear(String strDate) throws Exception {
        String pattern = "yyyy-MM-dd";
        Date date = new SimpleDateFormat(pattern).parse(strDate);
        java.util.Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        return cal.get(java.util.Calendar.DAY_OF_YEAR);
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

}