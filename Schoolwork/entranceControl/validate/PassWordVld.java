package Schoolwork.entranceControl.validate;

import java.util.Date;
import java.util.Objects;

public class PassWordVld extends GenericValidate{

    public PassWordVld(String input) {
        super(input);
        DataMatch(input);
    }

    private void DataMatch(String input){
        if(Objects.equals(input, "00001")){
            setInput("1234");
        }
        else if(Objects.equals(input, "00002")){
            setInput("1234");
        }
        else if(Objects.equals(input, "00003")){
            setInput("1234");
        }
        else{
            System.out.println("密码错误！");
        }
    }

}
