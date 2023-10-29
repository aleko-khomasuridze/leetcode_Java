
public class Solution {
    /**
     * Finds the longest common prefix among an array of strings.
     * 
     * @param strs - An array of input strings.
     * @return - The longest common prefix.
     */
    public String longestCommonPrefix(String[] strs) {
        // Check if the input array is null or empty, and return an empty string if true.
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Initialize the prefix as an empty string.
        String pref = "";

        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                // Check if we've reached the end of any string or if the characters at the
                // current position are not equal.
                if (i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return pref; // Return the prefix found so far.
                }
            }
            // Append the character at the current position to the prefix.
            pref += strs[0].charAt(i);
        }

        // Return the final common prefix found.
        return pref;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Cases
        System.out.println(solution.longestCommonPrefix(new String[]{"flower", "flour", "flow"})); // Should output "flo"
        System.out.println(solution.longestCommonPrefix(new String[]{"dog", "car", "racecar"})); // Should output ""
        System.out.println(solution.longestCommonPrefix(new String[]{"apple", "ape", "april"})); // Should output "ap"
        System.out.println(solution.longestCommonPrefix(new String[]{})); // Should output ""
        System.out.println(solution.longestCommonPrefix(null)); // Should output ""
    }
}
