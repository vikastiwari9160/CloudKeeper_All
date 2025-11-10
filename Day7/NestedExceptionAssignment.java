public class NestedExceptionAssignment {
    static class MathUtils{
        static int DivideNumOfArray(int[] arr,int ind, int divisor) {
            try {
                try {
                    return arr[ind] / divisor;
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic Exception Found in inner block!!" + e);
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array Index Out of Bound Exception Found!!"+e);
            }
            return -1;
        }
    }

    public static void main(String[] args){
        int[] arr = {1,2,3};
        System.out.println(MathUtils.DivideNumOfArray(arr,7,0));
    }

}


