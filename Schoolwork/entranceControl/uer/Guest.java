package Schoolwork.entranceControl.uer;
import java.util.Scanner;
import Schoolwork.entranceControl.sys.ControlSys;
public class Guest{
    private String name;
    public Guest(){
        name = null;
    }
    public Guest(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  boolean pressRing(ControlSys controlSys){
        Scanner scanner = new Scanner(System.in);
        System.out.println("访客" + this.getName() + "按下门铃？[Y/N]");
        String button = scanner.nextLine();
        if(button.equals("Y")){
            controlSys.setRing(1);
            System.out.println("访客" + this.getName()+"按下门铃");
            return true;
        }
        else{
            return false;
        }
    }
}
