public class LongestAndShortestWord {
    public static void main(String[] args) {
        String str = "java is very powerful language";
        String[] words = str.split(" ");

        String longest = words[0];
        String shortest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }

        System.out.println("Longest word: " + longest);
        System.out.println("Shortest word: " + shortest);
    }
}
