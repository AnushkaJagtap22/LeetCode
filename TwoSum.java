

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        //iterate through the array
        for(int i = 0 ; i < nums.length ; i++)
        {
            //calculate complement of current number
            int complement = target - nums[i];
        // check if complement is already in map
        if(map.containsKey(complement))
        {
            // if found return indices of complement and current number
            return new int[] { map.get(complement),i};
        }
        //otherwise add current number and its index to map
        map.put(nums[i],i);
        }
    //return empty array
    return new int[] {};
    }
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = ts.twoSum(nums, target);
        if(result.length == 2)
        {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
        else
        {
            System.out.println("No two sum solution found.");
        }
    }
}
