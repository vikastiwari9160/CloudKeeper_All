public class SumOfDigits {

    public static void main(String[] args){
        int num=1234;
        System.out.print(sumOfDigits(num));
    }

    public static int sumOfDigits(int num){
        int sum =0;
        while(num>0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }

}
