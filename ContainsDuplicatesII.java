

import java.util.HashMap;

public class ContainsDuplicatesII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++)
        {
            //check if current number is already in map
            if(map.containsKey(nums[i]))
            {
                //check if the difference between current index and stored index is less than or equal to k
                if(i - map.get(nums[i]) <= k)
                {
                    return true;
                }
            }
            //update the index of current number in map
            map.put(nums[i], i);
        }   
        return false;
    }
}
