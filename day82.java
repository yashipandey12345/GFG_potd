class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // Split the string by dots to get the individual words
        String[] words = str.split("\\.");
        
        // Use a StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder();
        
        // Traverse the words array from the last element to the first
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            // Append a dot after each word except the last one
            if (i != 0) {
                reversed.append(".");
            }
        }
        
        // Convert the StringBuilder to a string and return
        return reversed.toString();
    }
}