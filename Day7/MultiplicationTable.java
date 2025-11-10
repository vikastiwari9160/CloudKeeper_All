public class MultiplicationTable {

    public static void main(String[] args){
        int num=19;
        generateTable(num);
    }

    public static void generateTable(int num){
        for(int i=1; i<=10; i++) {
            System.out.println(num + "*" + i + "=" + num * i);
        }
    }

}
