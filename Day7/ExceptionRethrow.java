public class ExceptionRethrow {
    class MathUtils{

        static int Divide(int num,int divisor){
            try{
                return Dividehelper1(num,divisor);
            }catch(ArithmeticException e){
                System.out.println("Arithmatic exception found in main block !!"+e);
            }
            return -1;
        }

        static int  Dividehelper1(int num,int divisor) throws ArithmeticException{
            try{
                return Dividehelper2(num,divisor);
            }catch(ArithmeticException e){
                System.out.println("Arithmatic exception found in helper 1 !!"+e);
                throw e;
            } finally {
            }
        }

        static int Dividehelper2(int num,int divisor)throws ArithmeticException{
            try{
                return num/divisor;
            }catch(ArithmeticException e){
                System.out.println("Arithmatic exception found in helper 2 !!"+e);
                throw e;
            }finally {
            }
        }
    }

    public static void main(String[] args){
        MathUtils.Divide(7,0);
    }
}
