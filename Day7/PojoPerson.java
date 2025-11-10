import java.util.ArrayList;

public class PojoPerson{

    static class Person {
        private int id;
        private String name;
        private String email;

        Person(int id, String name, String email){
            this.id = id ;
            this.email= email;
            this.name=name;
        }

        int getId(){
            return this.id;
        }

        void setId(int id){
            this.id =id;
        }

        String getName(){
            return this.name;
        }

        void setName(String name){
            this.name=name;
        }

        String getEmail(){
            return this.email;
        }

        void setEmail(String email){
            this.email= email;
        }
    }

    public static void main(String[] args){
        Person p1 = new Person(101,"XYZ","XYZ@gmail.com");
        Person p2 = new Person(101,"ABC","ABC@gmail.com");
        Person p3 = new Person(101,"VGY","VGY@gmail.com");

        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        for(Person p : list){
            System.out.println(p.id+","+p.name+","+p.email);
        }
    }


}

