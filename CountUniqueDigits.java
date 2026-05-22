public class CountUniqueDigits {
    public static int countNumbersWithUniqueDigits(int n) 
    {
        //base class
        if(n == 0)
        {
            return 1;
        }
        // unique digits count
        int unique = 10 ;
        // available digits for first position
        int available = 9;
        // result count
        for(int i  = 2 ; i <= n && available > 0 ; i++)
        {
            unique *= available;
            available--;
        }
        return unique;
    }
    public static void main(String[] args) {
        int n = 2;
        int count = countNumbersWithUniqueDigits(n);
        System.out.println("Count of numbers with unique digits for n = " + n + " is: " + count);
    }
}
