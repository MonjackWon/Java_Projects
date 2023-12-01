package Schoolwork.entranceControl.sys;

import java.util.Scanner;

public class InputEquip {
    private String inputInfo;//输入设备缓存，暂时保存输入信息。
    public InputEquip(){
        this.inputInfo = null;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("身份验证：");
        inputInfo = scanner.next();
    }
    public String getInputInfo(){return this.inputInfo;}
}