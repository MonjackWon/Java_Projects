package Schoolwork.entranceControl.validate;

public class GenericValidate {
    private String inner = null;
    private String input = null;

    public void setInner(String inner){this.inner = inner;}
    public void setInput(String input){this.input = input;}
    public String getInner(){return inner;}
    public String getInput(){return input;}


    /**
     * 比较方法的默认的实现，判断输入信息是否存在
     * @ return 比较结果
     */
    public GenericValidate(String input){
        this.input = input;
        inner = "1234";
    }
    public boolean check(){
        for (int i=0; i<this.getInner().length(); i++){
            if(this.getInput()!=null&&this.getInput().equals(this.getInner())){
                return true;
            }
        }
        return false;
    }

}
