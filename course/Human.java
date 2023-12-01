package course;

public class Human {
    //1.属性
    //2.方法
    String name;
    String gender;
    int age;
    Human(String x, String gender, int age){
        name= x;//引用方法1
        this.gender = gender;//引用方法2
        this.age = age;

    }

    static {
        System.out.println("Static is running");
    }
    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }
    //...
    void eat(){

    }
    void drink(){

    }
    public void finalize(){
        System.out.println("is deleting .......");
    }
}
