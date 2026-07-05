import java.util.*;

public class Longest_Substring_without_Repeating_Character {
    public static void main(String[] args) {
        // input s = "abcabcbb"
        // output =3
        String str = "abcabcbb";
        Set<Character>set = new LinkedHashSet<>();
        int left =0;
        int max =0;
        for(int right=0;right<str.length();right++){
            char ch = str.charAt(right);
            if(set.contains(ch)){
                // System.out.println(set);
                set.remove(str.charAt(left));
                left++;
            }
            set.add(ch);
            max = Math.max(max,right-left+1);
        }
        System.out.println(max);
    }
    
}

//output
//3 
