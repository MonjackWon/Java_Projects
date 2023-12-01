package Schoolwork;

public class test {

    public static void main(String[] args){
        Human h1 = new Human("510000", new Date(1980,9,9), "h1");
        Student s1 = new Student( new Date(2001,9,3),  "s1","2019414055", 1);
        Student s2 = new Student( new Date(2001,5,11), "s2", "2019414015", 1);

        Human newOne ;
        newOne = new Human(h1);


        System.out.println("Total of Humans:" + Human.count);
        System.out.println("Total of Students:" + Student.count);

//        System.out.println(h1.count);
//        System.out.println(s1.count);

        System.out.println();

        System.out.println(h1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(newOne);

        //h1 = s1

    }
}
