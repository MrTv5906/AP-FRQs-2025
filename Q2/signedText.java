public class signedText{
    private String firstName;
    private String lastName;
    public signedText(String firstN, String lastN){
        this.firstName = firstN;
        this.lastName = lastN;
    }
    public String getSignature(){
        if firstName.equals(""){
            return lastName;
        }
        return firstName.substring(0,1) + "-" + lastName;
    }
    public String addSignature(parameter){
        if(parameter.indexOf(this.getSignature()) == -1){
            return parameter + getSignature();
        }
        else if(parameter.indexOf(getSignature()) == 0){
            return paramter + getSignature()
        }
        else {
            return parameter;
        }
    }
}
