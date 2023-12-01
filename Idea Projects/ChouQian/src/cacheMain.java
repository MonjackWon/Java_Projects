
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class cacheMain {
    public static void main(String[] args) {
        String filePath = "E:\\Java Projects\\Idea Projects\\ChouQian\\src\\Text.txt";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
class Name{
    private String name;
    private int no;

    Name(String name , int no){
        this.name = name;
        this.no = no;
    }
}