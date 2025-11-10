package CollectionsAssignment;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {

    public static void main(String[] args){
        String str= "ababc";
        System.out.println(FindFirstNonRepeating(str));
    }

    public static Character FindFirstNonRepeating(String str){
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(char x : str.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Character,Integer> x: map.entrySet()){
            if(x.getValue()==1) return x.getKey();
        }
        return null;
    }

}
