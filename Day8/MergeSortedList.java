package CollectionsAssignment;

import java.sql.Array;
import java.util.ArrayList;

public class MergeSortedList {

    public static ArrayList<Integer> merge(ArrayList<Integer> list1,ArrayList<Integer> list2){
        ArrayList<Integer> result = new ArrayList<>();
        int ind1=0; int ind2=0;
        while(ind1<list1.size() && ind2<list2.size()){
            if(list1.get(ind1)<=list2.get(ind2)){
                result.add(list1.get(ind1));
                ind1++;
            }else{
                result.add(list2.get(ind2));
                ind2++;
            }
        }while(ind1<list1.size()){
            result.add(list1.get(ind1));
            ind1++;
        }while(ind2<list2.size()){
            result.add(list2.get(ind2));
            ind2++;
        }
        return result;
    }


    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(60);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(15);
        list2.add(40);

        System.out.println(merge(list1,list2).toString());

    }
}
