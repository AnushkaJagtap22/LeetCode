import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<>();
        //add all numbers to set
        for(int num : nums)
        {
            set.add(num);
        }
        int longest = 0;
        //iterate through each number in array
        for(int num : set)
        {
            //start of sequence
            if(!set.contains(num-1))
            {
                int currentNum = num;
                int currentStreak = 1;
                //check for next numbers in sequence
                while(set.contains(currentNum + 1))
                {
                    currentNum++;
                    currentStreak++;
                }
                longest = Math.max(longest, currentStreak);
            }
        }
        return longest;
    }
}