import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
  
public class Task021 {
    public static void main(String[] args) {         
        HashMap<String, Integer> Hm1 = new HashMap<String, Integer>();
        Map<String, Integer> syncMap = Collections.synchronizedMap(Hm1);
   }
} 
