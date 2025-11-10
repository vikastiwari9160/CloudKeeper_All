public class ConstructorOverloading {

    public static void main(String[] args){
        ConstructorOverloadingExampleClass obj1 = new ConstructorOverloadingExampleClass();
        ConstructorOverloadingExampleClass obj2 = new ConstructorOverloadingExampleClass("XYZ");

        obj1.getName();
        obj2.getName();
    }
}

class ConstructorOverloadingExampleClass{
     private String name ;

    ConstructorOverloadingExampleClass(){

    }

    ConstructorOverloadingExampleClass(String name){
        this.name = name ;
    }

    void getName(){
        if(this.name!=null) System.out.println(this.name);
    }
}
