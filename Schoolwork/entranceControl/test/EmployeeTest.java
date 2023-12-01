package Schoolwork.entranceControl.test;

import Schoolwork.entranceControl.sys.ControlSys;
import Schoolwork.entranceControl.uer.Employee;

public class EmployeeTest {
    public static void main(String[] args){
        Employee employee = new Employee("雇员 a");
        ControlSys controlSys = new ControlSys();
        System.out.println("门禁系统——雇员测试");
        System.out.println("***********************");

        while(true){
            employee.input(controlSys);
            controlSys.work();
        }
    }
}
