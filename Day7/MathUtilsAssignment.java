public class MathUtilsAssignment {

    public static void main(String[] args){
        int num1=0;
        int num2=10;
        System.out.println(MathUtils.max(num1,num2));
        System.out.println(MathUtils.min(num1,num2));
        System.out.println(MathUtils.avg(num1,num2));
    }
}

class MathUtils{
    static int max(int num1, int num2){
        return num1>num2?num1:num2;
    }

    static int min(int num1, int num2){
        return num1>num2?num2:num1;
    }

    static int avg(int num1, int num2){
        return (num1+num2)/2;
    }
}
