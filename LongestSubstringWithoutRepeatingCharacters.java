import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s)
    {
        HashSet<Character> set = new HashSet<>();
        int left = 0 ;
        int max = 0 ;

        for(int right = 0 ; right < s.length() ; right++)
        {
            // check duplicate character
            while(set.contains(s.charAt(right)))
            {
                //remove left character
                set.remove(s.charAt(left));
                left++;
            }
            //add current character
            set.add(s.charAt(right));

            //update max length
            max = Math.max(max , right - left +1);
        }
        return max;
    }
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(l.lengthOfLongestSubstring("abcabcbb"));
    }
}
