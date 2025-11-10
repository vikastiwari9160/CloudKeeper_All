public class DivisionExceptionAssignment {

    static class MathUtils{
        static int Divide(int num1, int num2){
            try{
                return num1/num2;
            }catch(Exception e){
                System.out.println("Exception Fount :" + e);
            }finally {
                System.out.println("Division Completed");
                return -1;
            }
        }
    }

    public static void main(String[] args){
        System.out.print(MathUtils.Divide(10,0));
    }

}
