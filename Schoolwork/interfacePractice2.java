package Schoolwork;

import java.util.Arrays;

// 实现Comparable接口
record Person(int age, String name) implements Comparable<Person> {

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class interfacePractice2 {
    public static void main(String[] args) {
        Person[] people = {
                new Person(25, "张三"),
                new Person(20, "李四"),
                new Person(30, "王五"),
                new Person(22, "赵六"),
                new Person(28, "孙七")
        };
        System.out.println("排序前的顺序：");
        for (Person person : people) {
            System.out.println(person);
        }

        // 对数组进行排序
        Arrays.sort(people);

        System.out.println("\n按年龄排序后的顺序：");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
