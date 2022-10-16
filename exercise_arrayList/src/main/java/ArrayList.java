import java.util.*;
public class ArrayList {
    public static void main(String[] args) {
        List<String> sampleList = new java.util.ArrayList<>();
        sampleList.add("Marcin");
        sampleList.add("Marian");
        sampleList.add("Kasia");
        sampleList.add("Marianka");
        
        for (String item : sampleList) {
            System.out.println(item);
        }
        for (int index = 0; index < sampleList.size(); index++) {
//            System.out.println(sampleList.get(index));
        }
        
        Set<String> sampleSet = new HashSet<>();
        sampleSet.add("Kuba");
        sampleSet.add("Maniu");
        sampleSet.add("Zuza");
        sampleSet.add("Antek");
        sampleSet.add("Dorota");
        sampleSet.add("Zuza");
        
        for (String item2 : sampleSet) {
            System.out.println(item2);
        }
        Map<String, String> sampleMap = new HashMap<>();
        sampleMap.put("Wojtek", "Zuza");
        sampleMap.put("Zbyszek", "Maria");
        
    
        System.out.println("Iterowanie po kluczach i wartosciach");
        for(Map.Entry<String, String> entry : sampleMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
            
            
            List lista = new java.util.ArrayList();
        }
    }
}
