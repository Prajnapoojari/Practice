import java.util.HashMap;
import java.util.Map;

public class SecondMostRepeatedWord {
    public static void main(String[] args) {
        String str = "java is easy java is powerful java is";
        String[] words = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        String first = "";
        String second = "";
        int firstMax = 0;
        int secondMax = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int count = entry.getValue();

            if (count > firstMax) {
                secondMax = firstMax;
                second = first;

                firstMax = count;
                first = entry.getKey();
            } else if (count > secondMax && count != firstMax) {
                secondMax = count;
                second = entry.getKey();
            }
        }

        System.out.println("Second most repeated word: " + second);
    }
}

