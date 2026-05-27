public class ContainerWithMostWater {
    public int maxArea(int[] height)
    {
        int left = 0 ;
         int right = height.length - 1;
         int maxwater = 0;
         while(left<right)
         {
            int width = right - left;
            int minheight = Math.max(height[left],height[right]);
            int area = width * minheight;
            maxwater = Math.max(maxwater,area);
            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
         }
         return maxwater;
    }   
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater solution = new ContainerWithMostWater();
        System.out.println(solution.maxArea(height));
    }
} 