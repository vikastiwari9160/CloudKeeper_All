public class Student {
    public static void main(String[] args){
        StudentClass s = new StudentClass("XYZ",99,99,98);
        System.out.println(s.name);
        System.out.println(s.mark1);
        System.out.println(s.mark2);
        System.out.println(s.mark3);
        System.out.println(s.sum());
        System.out.println(s.avg());
    }
}

class StudentClass{
     String name;
     int mark1;
     int mark2;
     int mark3;

    StudentClass(String name, int mark1, int mark2,int mark3){
        this.name= name;
        this.mark1= mark1;
        this.mark2= mark2;
        this.mark3 = mark3;
    }

    int sum(){
        return this.mark1+this.mark2+this.mark3;
    }

    int avg(){
        return (this.mark1+this.mark2+this.mark3)/3;
    }

}
