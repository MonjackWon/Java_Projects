package Schoolwork.entranceControl.uer;

import Schoolwork.entranceControl.sys.ControlSys;

import java.util.Scanner;

public class Admin extends Employee{
    public Admin(){
        super();
    }
    public Admin(String name){
        super(name);
    }
    public void work(ControlSys controlSys){
        Scanner scanner = new Scanner(System.in);
        System.out.println("管理员"+this.getName()+"按下开门按钮?[Y/N]");
        String button = scanner.next();
        if(button.equals("Y")){
           System.out.println("管理员" + this.getName() + "同意开门！");
           controlSys.open();
        }
        else{
            System.out.println("管理员"+this.getName()+"拒绝开门！");
        }
    }
}
