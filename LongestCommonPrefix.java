public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs)
    {
        if(strs == null || strs.length == 0)
        {
            return "";
        }
        // Initialize the prefix to the first string in the array
        String prefix = strs[0];
        // Iterate through the remaining strings in the array
        for(int i = 1 ; i < strs.length ; i++)
        {
            //update the prefix by comparing it with the current string
            while(!strs[i].startsWith(prefix))
            {
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                {
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        LongestCommonPrefix solution = new LongestCommonPrefix();
        System.out.println(solution.longestCommonPrefix(strs));
    }
}
