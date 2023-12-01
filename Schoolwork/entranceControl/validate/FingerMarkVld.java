package Schoolwork.entranceControl.validate;

import java.util.Objects;

public class FingerMarkVld extends GenericValidate {

    private String inner;

    /**
     * 比较方法的默认的实现，判断输入信息是否存在
     *
     * @param input
     * @ return 比较结果
     */
    public FingerMarkVld(String input) {
        super(input);
        DataMatch(input);
    }

    private void DataMatch(String input){
        if(Objects.equals(input, "finger001")){
            setInput("1234");
        }
        else if(Objects.equals(input, "finger002")){
            setInput("1234");
        }
        else if(Objects.equals(input, "finger003")){
            setInput("1234");
        }
        else{
            System.out.println("指纹验证失败!");
        }
    }
}

