public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {

        // Frequency array
        int[] count = new int[128];

        // Store frequency of t
        for (char ch : t.toCharArray()) {

            count[ch]++;
        }

        int left = 0;

        int right = 0;

        int required = t.length();

        int minLen = Integer.MAX_VALUE;

        int start = 0;

        while (right < s.length()) {

            char r = s.charAt(right);

            // Needed character found
            if (count[r] > 0) {

                required--;
            }

            // Decrease frequency
            count[r]--;

            right++;

            // Valid window found
            while (required == 0) {

                // Update answer
                if (right - left < minLen) {

                    minLen = right - left;

                    start = left;
                }

                char l = s.charAt(left);

                // Remove left character
                count[l]++;

                // Window invalid again
                if (count[l] > 0) {

                    required++;
                }

                left++;
            }
        }

        // No valid window
        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
    public static void main(String[] args) {
        MinimumWindowSubstring m = new MinimumWindowSubstring();
        System.out.println(m.minWindow("ADOBECODEBANC", "ABC"));
    }    
}
