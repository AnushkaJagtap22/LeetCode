

import java.util.HashSet;

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        //Create Hashset
        HashSet<Integer> seen = new HashSet<>();

        //iterate through each element in array
        for(int num : nums)
        {
            //check if element is already in hashset
            if(seen.contains(num))
            {
                return true;
            }
            //add element to hashset
            seen.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicates cd = new ContainsDuplicates();
        int[] nums = {1,2,3,1};
        boolean result = cd.containsDuplicate(nums);
        System.out.println("Contains duplicate: " + result);
    }
}
