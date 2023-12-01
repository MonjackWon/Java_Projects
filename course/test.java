package course;

public class test {
    public static void main(String[] arg){
        Human x = new Human("张三", "男", 20);
        x.age = 12;
        Human y = new Human("李四", "男", 10);

        x=y;

        System.gc();


        for(int i=1;i< Integer.MAX_VALUE; i++){
            //..
        }
    }
}
