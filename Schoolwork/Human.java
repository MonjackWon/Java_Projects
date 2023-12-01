package Schoolwork;

import java.util.Calendar;

public class Human {
    String id;
    Date Birthday;
    int age;
    String name;

    static int count=0;

    Human(String id, Date Birthday, String name) {
        this.id = id;
        this.Birthday = Birthday;
        this.age = Calendar.getInstance().get(Calendar.MONTH) >= Birthday.month ?
                (Calendar.getInstance().get(Calendar.DATE) >= Birthday.day?
                        Calendar.getInstance().get(Calendar.YEAR) - Birthday.year :
                        Calendar.getInstance().get(Calendar.YEAR) - Birthday.day - 1 ):
                Calendar.getInstance().get(Calendar.YEAR)- Birthday.year - 1;
        this.name = name;
        count++;
    }

     Human(Human x){
        name = x.name;
        age = x.age;
        Birthday = new Date (x.Birthday);
        id = x.id;
        count++;
    }

    Human(Date Birthday, String name){
        this.Birthday = Birthday;
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public Date getBirthday() {
        return this.Birthday;
    }

    int getAge() {
        return this.age;
    }

    void setId(String id) {
        this.id = id;
    }

    void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "id: " + id + " | Name: " + name  + " | Birthday:" + " year: " + Birthday.year + " month: "
                + Birthday.month + " day: " + Birthday.day + " | age: " + age;
    }

}
class Date {
    int year;
    int month;
    int day;

    Date(int year, int month, int day){
         this.year = year;
         this.month = month;
         this.day = day;
    }

    Date(Date x){
         year =x.year;
         month = x.year;
         day = x.day;
 }

}


