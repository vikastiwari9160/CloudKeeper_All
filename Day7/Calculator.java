class CalculatorClass extends Thread {
    public static int add(int num1, int num2){
        return num1+num2;
    }

    public static int subtract(int num1, int num2){
        return num1-num2;
    }

    public static int multiply(int num1, int num2){
        return num1*num2;
    }

    public static int divide(int num1, int num2){
        return num1/num2;
    }
}

public class Calculator{
    public static void main(String[] args){
        System.out.println(CalculatorClass.add(10,20));
        System.out.println(CalculatorClass.subtract(10,20));
        System.out.println(CalculatorClass.multiply(10,20));
        System.out.println(CalculatorClass.divide(10,20));
    }

}

