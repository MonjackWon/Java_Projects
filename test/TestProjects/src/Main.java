import java.io.*;

public class Main {
    private static final String path1 = "ioFiles/test.txt";
    private static final String[] list ={"apple", "banana", "peach", "orange"};
    public static void main(String[] args)
    {
        try{
            File file = new File(path1);
            if(file.createNewFile()){
                System.out.println("文件创建成功");
            }
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for(String s: list){
                bufferedWriter.write(s + ",");
            }

            bufferedWriter.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        //System.out.println("Hello world!");
    }
}