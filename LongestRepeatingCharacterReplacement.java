public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) 
    {
        int count[] = new int[26];
        int max = 0;
        int left = 0 ;
        for(int right = 0 ; right < s.length() ; right++)
        {
            //add current character
            count[s.charAt(right) - 'A']++;
            //track highest frequency character
            max = Math.max(max, count[s.charAt(right) - 'A']);

            //current window size
            int windowsize = right - left +1;

            // if too many characters to replace, shrink the window
            if(windowsize - max > k)
            {
                //remove left character
                count[s.charAt(left) - 'A']--;
                //shrink the window
                left++;
            }
            //update max length
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement l = new LongestRepeatingCharacterReplacement();
        System.out.println(l.characterReplacement("AABABBA", 1));
    }
}
