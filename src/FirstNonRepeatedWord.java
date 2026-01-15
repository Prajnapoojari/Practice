import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedWord {
    public static void main(String[] args) {
        String str = "java is easy java is powerful";
        String[] words = str.split(" ");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated word: " + entry.getKey());
                break;
            }
        }
    }
}
