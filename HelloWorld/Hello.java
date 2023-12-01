public class Hello
{
    public static void main(String[] args){
        if (args.length==0)
            System.out.println("Hello!");
        else
            for (String arg : args) System.out.println(arg);
    }
}
