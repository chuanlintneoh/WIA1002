public class Telephone {
    private String areaCode;
    private String number;
    private static int numberOfTelephoneObject = 0;
    public Telephone(String areaCode,String number){
        setAreaCode(areaCode);
        setNumber(number);
        numberOfTelephoneObject++;
    }
    public void setAreaCode(String areaCode){
        this.areaCode = areaCode;
    }
    public String getAreaCode(){
        return areaCode;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public String makeFullNumber(){
        return String.format("%s-%s",areaCode,number);
    }
    public static int getNumberOfTelephoneObject(){
        return numberOfTelephoneObject;
    }
}
