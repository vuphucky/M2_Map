import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("smith", 30);
        hashMap.put("anderson", 31);
        hashMap.put("lewis", 29);
        hashMap.put("cook", 29);
        System.out.println("display entries in hashMap");
        System.out.println(hashMap + "\n");

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("smith",30);
        linkedHashMap.put("aderson",31);
        linkedHashMap.put("lewis", 29);
        linkedHashMap.put("cook", 29);
        System.out.println("\nThe age for " + "lewis is " + linkedHashMap.get("lewis"));
        System.out.println("\nThe age for " + "cook is " + linkedHashMap.get("cook"));
        System.out.println("\nThe age for " + "smith is " + linkedHashMap.get("smith"));
    }
}
