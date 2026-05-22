public class Anagram {
    public boolean isAnagram(String s, String t) {
        //length must match
        if(s.length() != t.length())
        {
            return false;
        }
        int count[] = new int[26];
        //count characters
        for(int i = 0 ; i < s.length() ; i++)
        {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        //check all counts become 0 
        for(int num : count)
        {
            if(num!=0)
            {
                return false;
            }
        }
        return true;
    }
}
