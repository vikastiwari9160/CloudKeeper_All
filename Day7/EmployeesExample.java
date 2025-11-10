import java.util.ArrayList;

public class EmployeesExample {

    static class Employee{
        private int empId;
        private String name;
        private int payPerHour;
        private int salary;

        Employee(int empId, String name, int payPerHour){
            this.empId=empId;
            this.name=name;
            this.payPerHour=payPerHour;
        }

        void printDetails(){
            System.out.println(this.empId+":"+this.name+":"+this.payPerHour);
        }

        void calcSalary(){

        };
    }

    static class PartTimeEmployee extends Employee{
        int workingHours;
        int workingDays;

        PartTimeEmployee(int empId, String name, int payPerHour, int workingHoursPerDay, int workingDays){

            super(empId,name,payPerHour);

            this.workingHours=workingHoursPerDay;
            this.workingDays=workingDays;


            calcSalary();

        }

        @Override
        void calcSalary(){
            super.salary=super.payPerHour*workingHours*workingDays;
        }

        @Override
        void printDetails(){
            System.out.println(super.empId+":"+super.name+":"+super.salary);
        }
    }

    static class FullTimeEmployee extends Employee{

        FullTimeEmployee(int empId, String name, int payPerHour){
            super(empId,name,payPerHour);

            calcSalary();
        }


        @Override
        void calcSalary(){
            super.salary=super.payPerHour*8*22;
        }

        @Override
        void printDetails(){
            System.out.println(super.empId+":"+super.name+":"+super.salary);
        }

    }

    public static void main(String[] args){
        Employee e1 = new FullTimeEmployee(101,"XYZ",100);
        Employee e2 = new FullTimeEmployee(102,"ABC",150);
        Employee e3 = new PartTimeEmployee(103,"CFT",160,4,22);
        Employee e4 = new PartTimeEmployee(104,"VGY",90,4,22);

        ArrayList<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);

        for(Employee e : list){
            e.printDetails();
        }
    }


}
