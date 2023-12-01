package Schoolwork.entranceControl.sys;
import Schoolwork.entranceControl.validate.*;
public class Computer {
    public boolean check(String inputInfo){
        String temp = inputInfo.substring(0, 2);
        boolean tem = false;
        String input = inputInfo.substring(2);
        //截取字符串信息。

        switch (temp) {
            //密码验证
            case "pa" -> {
                PassWordVld pa = new PassWordVld(input);
                 tem = pa.check();
                //System.out.println("密码验证正确！");
            }
            //胸卡验证
            case "ca" ->{
                CardVld ca = new CardVld(input);
                tem =  ca.check();
                //System.out.println("胸卡验证正确！");

            }
            //指纹验证
            case "fi" -> {
                FingerMarkVld fi = new FingerMarkVld(input);
                tem = fi.check();
                //System.out.println("指纹验证正确！");
            }
            default -> {
                GenericValidate ge = new GenericValidate(input);
                //System.out.println("验证错误，请重新输入！");
                tem = ge.check();
            }
        }
        return tem ;
    }
}
