import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs)
        {
            //convert string to char array 
            char[] charArray = str.toCharArray();
            //sort char array
            Arrays.sort(charArray);
            //convert sorted char array back to string
            String sorted = new String(charArray);
            //check if sorted string is already a key in map
            if(!map.containsKey(sorted))
            {
                //if not create new list
                map.put(sorted, new ArrayList<>());
            }
            //add current string to the list of its sorted version
            map.get(sorted).add(str);
        }
        //return all groups
        return new ArrayList<>(map.values());
    }   
    public static void main(String[] args) {
        GroupAnagram ga = new GroupAnagram();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = ga.groupAnagrams(strs);
        System.out.println(result);
    }
}