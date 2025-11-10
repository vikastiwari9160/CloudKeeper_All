public class ParameterConstructor {

    public static void main(String[] args){
        Obj obj1 = new Obj(20,40);
        obj1.getNums();
    }
}

class Obj{

    int num1;
    int num2;

    Obj(int num1, int num2){
        this.num1=num1;
        this.num2=num2;
    }

    void getNums(){
        System.out.println("The Numbers are "+ num1 + "," + num2);
    }

}

