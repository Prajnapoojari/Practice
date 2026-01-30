import java.util.HashSet;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";

        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0;
        int maxLength = 0;

        while (right < s.length()) {
            char current = s.charAt(right);

            if (!set.contains(current)) {
                set.add(current);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        System.out.println("Length of longest substring: " + maxLength);
    }
}
