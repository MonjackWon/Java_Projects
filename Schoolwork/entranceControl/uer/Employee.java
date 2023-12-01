package Schoolwork.entranceControl.uer;

import Schoolwork.entranceControl.sys.ControlSys;
import Schoolwork.entranceControl.sys.InputEquip;

public class Employee extends Guest{
    private String password;
    public Employee(){
        super();
        password = null;
    }
    public Employee(String name){
        super(name);
    }

    public void input(ControlSys controlSys){
        controlSys.getInputEquip().input();
    }

}
