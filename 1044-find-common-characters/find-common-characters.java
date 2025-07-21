import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<String> arr = new ArrayList<>();

        // Initialize arr with characters of the first word
        for (char c : words[0].toCharArray()) {
            arr.add(String.valueOf(c));
        }

        // Check remaining words
        for (int i = 1; i < words.length; i++) {
            ArrayList<String> check = new ArrayList<>();

            // Add characters of current word to check
            for (char c : words[i].toCharArray()) {
                check.add(String.valueOf(c));
            }

            // Create new array to store common characters (considering frequency)
            ArrayList<String> newArr = new ArrayList<>();

            for (String ch : arr) {
                if (check.contains(ch)) {
                    newArr.add(ch);
                    check.remove(ch); // remove to handle duplicate counts properly
                }
            }

            // Update arr to only have common characters
            arr = newArr;
        }

        return arr;
    }
}
