package Schoolwork.entranceControl.sys;
import java.util.*;

public class ControlSys {
    private Door door;//门禁系统的电子门
    private Computer computer;//门禁系统的计算机。
    private InputEquip inputEquip;//门禁系统的输入设备。
    private int ring;//门铃，1 为鸣响，0 为安静。
    private int openSign;//开门信号，由管理员按下按钮时产生。
    //提供输入设备。
    public InputEquip getInputEquip(){return this.inputEquip;}
    //设置门铃。
    public void setRing(int ring){this.ring = ring;}
    //获取门铃状态。
    public int getRingState(){return this.ring;}
    //设置开门信号。
    public void setOpenSign(int openSign){this.openSign = openSign;}
    //获取开门信号。
    public int getOpenSign(){return this.openSign;}
    public ControlSys(){
        this.door = new Door();
        this.inputEquip = new InputEquip();
        this.computer = new Computer();
        this.ring = 0;
        this.openSign = 0;
    }
    public void open(){
        try {
            this.door.open();
            System.out.println("门已开启，请赶快通过，将在五秒后关闭！");
            Thread.sleep(5000);
        }catch(InterruptedException e){
            //捕获异常。
            return;
        }
        System.out.println("门已关闭！");
        this.door.close();
    }
    public void work(){
        if(this.inputEquip.getInputInfo()!=null){
            if(this.computer.check(this.inputEquip.getInputInfo())){
                this.open();
            }
        }
    }
}


