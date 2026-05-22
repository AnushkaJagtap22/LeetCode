import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int total = 0 ;
        for(int i = 0 ; i < s.length() ; i++)
        {
            int value = map.get(s.charAt(i));
            //check if next character exists and has a greater value
            if(i < s.length()-1 && value < map.get(s.charAt(i+1)))
            {
                total -= value;
            }
            else
            {
                total += value;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        RomanToInteger rti = new RomanToInteger();
        String s = "MCMXCIV";
        int result = rti.romanToInt(s);
        System.out.println("Roman numeral: " + s + " is equal to integer: " + result);
    }
}
