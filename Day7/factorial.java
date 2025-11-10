public class factorial {

    public static int factorialCalculator(int num){
        int sum=0;
        for(int i=num; num>0; num--){
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args){
        System.out.println(factorialCalculator(5));
    }

}
