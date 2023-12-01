package Schoolwork.entranceControl.validate;

import java.util.Objects;

public class CardVld extends GenericValidate{
    /**
     * 比较方法的默认的实现，判断输入信息是否存在
     *
     * @param input
     * @ return 比较结果
     */
    public CardVld(String input) {
        super(input);
        DataMatch(input);
    }
    private void DataMatch(String input){
        if(Objects.equals(input, "cd001")){
            setInput("1234");
        }
        else if(Objects.equals(input, "cd002")){
            setInput("1234");
        }
        else if(Objects.equals(input, "cd003")){
            setInput("1234");
        }
        else{
            System.out.println("门卡验证失败!");
        }
    }
}
