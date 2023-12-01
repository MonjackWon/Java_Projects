package Schoolwork.entranceControl.test;

import Schoolwork.entranceControl.sys.ControlSys;
import Schoolwork.entranceControl.uer.Admin;

public class AdminTest {
    public static void main(String[] args){
        Admin admin = new Admin("王哲"); //管理员
        ControlSys controlSys = new ControlSys();
        System.out.println("门禁系统---管理员测试");
        System.out.println("***********************");
        while(true){
            admin.work(controlSys);
            controlSys.work();
        }
    }
}
