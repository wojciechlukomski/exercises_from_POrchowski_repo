package exercises_tester_oprogramowania;

import java.util.*;

public class CountNumbersFromArray {
    
    public static void main(String[] args) {

        Integer [] tablica = new Integer[] {1,2,3,4,1,12,3,4,5,123,12,1,1,1};
        System.out.println(counting(tablica));
    }
    
    public static Map<Integer,Integer> counting (Integer[] array){
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for (Integer number : array) {
            if (!map.containsKey(number)) {
                map.put(number, 1);
            }
            else{
                map.put(number, map.get(number)+1);
            }
        }
        return map;
    }
}
