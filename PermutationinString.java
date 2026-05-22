public class PermutationinString {
    public boolean checkInclusion(String s1, String s2) 
    {
        // if s1 is longer than s2
        if(s1.length() > s2.length())
        {
            return false;
        }
        int s1count[] = new int[26];
        int windowcount[] = new int[26];

        //count characters in s1
        for(int i = 0 ; i < s1.length() ; i++)
        {
            s1count[s1.charAt(i) - 'a']++;
            windowcount[s2.charAt(i) - 'a']++;
        }
        int windowSize = s1.length();
        //check for permutation in s2
        for(int i = 0 ; i < s2.length() ; i++)
        {
            //add current character to window count
            windowcount[s2.charAt(i) - 'a']++;
            //remove character that goes out of window
            if(i >= windowSize)
            {
                windowcount[s2.charAt(i - windowSize) - 'a']--;
            }
            //check if counts match
            if(matches(s1count,windowcount))
            {
                return true;
            }
        }
        return false;
    }
    private boolean matches(int a[],int b[])
    {
        for(int i = 0 ; i < 26 ; i ++)
        {
            if(a[i] != b[i])
            {
                return false;
            }
        }
        return true;
    }
}
