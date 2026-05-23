public class ValidPalindrome {
    public boolean isPalindrome(String s)
    {
        int left = 0 ;
        int right = s.length() - 1;
        while(left < right)
        {
            while(left<right && !Character.isLetterOrDigit(left))
            {
                left++;
            }
            while(left<right && !Character.isLetterOrDigit(right))
            {
                right--;
            }
            //check if characters are same
            if(Character.toLowerCase(left) != Character.toLowerCase(right))
            {
                return false;
            }
            left++;
            right--;    
        }
        return true;
    }
    public static void main(String[] args) {
        ValidPalindrome v = new ValidPalindrome();
        System.out.println(v.isPalindrome("A man, a plan, a canal: Panama"));   
    }
}
