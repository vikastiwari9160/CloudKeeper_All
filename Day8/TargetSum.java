package CollectionsAssignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TargetSum {

    public static void main(String[] args){
        int target = 50;
        int[] arr = {10,20,40,30};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i],i);
        }
        for(Map.Entry<Integer,Integer> item: map.entrySet()){
            if(target-item.getKey()!=item.getKey() && map.containsKey(target-item.getKey())){
                System.out.println("Target Found on index "+item.getValue()+","+map.get(target-item.getKey()));
                break;
            }
        }
    }
}
