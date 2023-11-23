// https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/

class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        int count = 0;
        int[] charFreq = new int[26]; // Frequency array for characters
        int left = 0;
        int right = 0;

        while (right < n) {
            charFreq[s.charAt(right) - 'a']++;
            right++;

            if (right - left > 3) {
                charFreq[s.charAt(left) - 'a']--;
                left++;
            }

            if (right - left == 3 && distinctCount(charFreq) == 3) {
                count++;
            }
        }

        return count;
    }

    private int distinctCount(int[] charFreq) {
        int count = 0;
        for (int freq : charFreq) {
            if (freq > 0) {
                count++;
            }
        }
        return count;
    }
}