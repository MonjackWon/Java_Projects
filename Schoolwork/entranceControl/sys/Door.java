package Schoolwork.entranceControl.sys;

import java.util.*;
/**
 *门禁系统的电子门类
 * */
public final class Door {
    public final static String OPEN = "门已开启";
    public final static String CLOSE = "门已开启";
    private String doorState = CLOSE;//表示电子门当前状态。
    public Door(){
        //构造函数。
        this.setState(CLOSE);
    }
    /*开启电子门*/
    public void open(){
        this.setState(OPEN);
    }
    /*关闭电子门*/
    public void close(){
        this.setState(CLOSE);
    }
    private void setState(String state){this.doorState = state;}
    /*获取电子门状态*/
    public Boolean getState(){
        return doorState.equals(OPEN);
    }
}

