import java.util.HashMap;
import java.util.Map;

public class Task014 {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("Niru", 25);
        map.put("Petu", 30);
        map.put("Ashu", 28);
        map.put("Rishu", 35);

        // Display the HashMap
        System.out.println("HashMap contents:");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
    }
}
