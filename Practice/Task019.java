import java.util.HashMap;
import java.util.Map;

public class Task019 {

    public enum Element {
        H("Hydrogen", 1, 1.008f),
        HE("Helium", 2, 4.0026f),
        LI("Lithium", 3, 6.94f);

        private static final Map<String, Element> BY_LABEL = new HashMap<>();
        private static final Map<Integer, Element> BY_ATOMIC_NUMBER = new HashMap<>();
        private static final Map<Float, Element> BY_ATOMIC_WEIGHT = new HashMap<>();

        static {
            for (Element e : values()) {
                BY_LABEL.put(e.label, e);
                BY_ATOMIC_NUMBER.put(e.atomicNumber, e);
                BY_ATOMIC_WEIGHT.put(e.atomicWeight, e);
            }
        }

        public final String label;
        public final int atomicNumber;
        public final float atomicWeight;

        private Element(String label, int atomicNumber, float atomicWeight) {
            this.label = label;
            this.atomicNumber = atomicNumber;
            this.atomicWeight = atomicWeight;
        }

        public static Element valueOfLabel(String label) {
            return BY_LABEL.get(label);
        }

        public static Element valueOfAtomicNumber(int number) {
            return BY_ATOMIC_NUMBER.get(number);
        }

        public static Element valueOfAtomicWeight(float weight) {
            return BY_ATOMIC_WEIGHT.get(weight);
        }
    }

    public static void main(String[] args) {
        System.out.println("Element Details for all elemnents:");
        for (Element e : Element.values()) {
            System.out.println("Symbol: " + e.name() + ", Name: " + e.label +
                    ", Atomic Number: " + e.atomicNumber +
                    ", Atomic Weight: " + e.atomicWeight);
        }
   
}
 
}