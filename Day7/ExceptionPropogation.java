public class ExceptionPropogation {
    class MathUtils{
        static int Divide(int num,int divisor){
            try{
                return Dividehelper1(num,divisor);
            }catch(ArithmeticException e){
                System.out.println("Arithmatic exception found !!"+e);
            }
            return -1;
        }

        static int Dividehelper1(int num,int divisor){
            try{
                return Dividehelper2(num,divisor);
            }finally {
            }
        }

        static int Dividehelper2(int num,int divisor){
            try{
                return num/divisor;
            }finally {
            }
        }
    }

    public static void main(String[] args){
        MathUtils.Divide(7,0);
    }


}
