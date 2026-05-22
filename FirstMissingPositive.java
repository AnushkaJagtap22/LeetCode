public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++)
        {
            //place each number in its correct position if possible
            while(nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i]-1])
            {
                //swap
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }
        //find the first position where the number is not correct
        for(int i = 0 ; i < n ; i ++)
        {
            if(nums[i] != i +1)
            {
                return i + 1;
            }
        }
        return n + 1;
    }
    public static void main(String[] args) {
        FirstMissingPositive fmp = new FirstMissingPositive();
        int[] nums = {3,4,-1,1};
        int result = fmp.firstMissingPositive(nums);
        System.out.println("First missing positive: " + result);
    }
}
