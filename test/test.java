package test;

import javax.xml.crypto.Data;

public class test {
    public static void main(String[] args)  {
         String s = null;
       //  if ( s != null & s.length() > 0); *
         if ( s != null && s.length() > 0);
       // if ( s != null || s.length() > 0);
       // if ( s != null | s.length() > 0);
        System.out.println("s != null & s.length()");
    }
}
class Date{
    private int year, month, day;
    Date(int year, int month, int day){
        this.year= year;
        this.month = month;
        this.day = day;
    }

    void DataException(int data) throws Exception {
        if(data <13 && data >0){
            return;
        }
        else{
            throw new Exception("data error");
        }
    }
    public void setYear(int year) throws Exception{
        DataException(year);
        this.year = year;

    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}
