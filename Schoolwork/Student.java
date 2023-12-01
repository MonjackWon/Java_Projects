package Schoolwork;

public class Student extends Human  {
    String id;
    int Class;

    static int count;

    Student(Date Birthday, String name, String id, int Class) {
        super(Birthday, name);
        this.id = id;
        this.Class = Class;
        count++;
    }

    public String getId() {
        return id;
    }

    public int getClassNo() {
        return Class;
    }

    @Override
    public String toString() {
        return  " Name: " + name + " | Birthday:" + " year: " + Birthday.year + " month: " + Birthday.month + " day: "
                + Birthday.day + " | age: " + age + " | Student No.: " + id + " | Class NO.: " + Class;
    }

}
