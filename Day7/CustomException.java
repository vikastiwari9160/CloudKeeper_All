public class CustomException {

    static class EmailException extends Exception{
        EmailException(String msg){
            super(msg);
        }
    }

    public static boolean Check(String email){
        try{
            for(char x : email.toCharArray()){
                if(x=='@'){
                    return true;
                }
            }
            throw new EmailException("Invalid Email!!");
        }catch (EmailException e){
            System.out.println("Exception found!!"+ e);
        }
        return false;
    }


    public static void main(String[] args){
        String email="";
        System.out.println(Check(email));
    }
}
