public class Sample {

    public static void main(String[] args){

        int a=20;
        int b=10;


        System.out.println("Java is working!!");
        System.out.println("sum is"+sum(a,b));
    }

    public static void sampleOutputs(int x){
        for(int i=0; i<=x; i++){
            System.out.println("printing"+i+1+"line");
        }
    }

    public static int sum(int a, int b){
        System.out.println("Inside the sum method");
        return a+b;
    }
}
