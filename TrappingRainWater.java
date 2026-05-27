public class TrappingRainWater {
    public int trap(int[] height) 
    {
        int left = 0 ;
        int right = height.length - 1;
        int leftmax = 0;
        int rightmax = 0;
        int trappedwater = 0;
        while(left < right)
        {
            if(height[left] < height[right])
            {
                if(height[left] >= leftmax)
                {
                    leftmax = height[left];
                }
                else
                {
                    trappedwater += leftmax - height[left];
                }
            }
            else
            {
                if(height[right] >= rightmax)
                {
                    rightmax = height[right];
                }
                else
                {
                    trappedwater += rightmax - height[right];
                }
            }
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        TrappingRainWater solution = new TrappingRainWater();
        System.out.println(solution.trap(height));
    }
}
