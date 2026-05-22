public class ArrayProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
     int n = nums.length;
     int result[]  = new int[n];
        //calculate left products
        result[0] = 1;
        for(int i = 1 ; i < n ; i ++)
            {
                result[i] = result[i-1] * nums[i-1];
            }  
        //calculate right products and final result
        int rightproduct = 1;
        for(int i = n - 1; i >= 0 ; i++)
        {
            result[i] = result[i] * rightproduct;
            rightproduct = rightproduct * nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayProductExceptSelf apes = new ArrayProductExceptSelf();
        int[] nums = {1,2,3,4};
        int[] result = apes.productExceptSelf(nums);
        System.out.print("Output: [");
        for(int i = 0 ; i < result.length ; i++)
        {
            System.out.print(result[i]);
            if(i != result.length - 1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
