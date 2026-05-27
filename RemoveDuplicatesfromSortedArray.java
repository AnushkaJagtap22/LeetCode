public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) 
    {
        int i = 0 ; 
        int j = 1 ;
        int n = nums.length;
        while(j < n)
        {
            if(nums[i] == nums[j])
            {
                j++;
            }
            else
            {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }    
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        RemoveDuplicatesfromSortedArray solution = new RemoveDuplicatesfromSortedArray();
        System.out.println(solution.removeDuplicates(nums));
    }
}
