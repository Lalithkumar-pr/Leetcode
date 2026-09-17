class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // Count characters in s1
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
        }

        // Create the first window in s2
        for (int i = 0; i < s1.length(); i++) {
            count2[s2.charAt(i) - 'a']++;
        }

        // Check the first window
        if (Arrays.equals(count1, count2)) {
            return true;
        }

        int left = 0;
        int right = s1.length();

        // Slide the window
        while (right < s2.length()) {

            // Remove the character leaving the window
            count2[s2.charAt(left) - 'a']--;

            // Add the new character entering the window
            count2[s2.charAt(right) - 'a']++;

            left++;
            right++;

            // Compare frequencies
            if (Arrays.equals(count1, count2)) {
                return true;
            }
        }

        return false;
    }
}