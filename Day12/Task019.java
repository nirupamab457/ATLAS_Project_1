import java.util.HashMap;

public class Task019 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put(null, "First Null");
        map.put("101", "Niru");
        map.put("102", "Mom");

        System.out.println("After first null key insertion: " + map);

        // Adding another null key with a different value
        map.put(null, "Second Null");

        System.out.println("After second null key insertion (overwrite): " + map);
    }
}
