import java.util.LinkedHashSet;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        String str = "java is easy java is powerful";
        String[] words = str.split(" ");

        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (String word : words) {
            set.add(word);
        }

        for (String word : set) {
            System.out.print(word + " ");
        }
    }
}
