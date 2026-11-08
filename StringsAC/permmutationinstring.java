package StringsAC;
import java.util.*;
public class permmutationinstring {
    public static void main(String[] args) {
        
    }
    public static boolean permutationString(String s1, String s2){
        if(s1.length() >  s2.length()){
            return false;
        }
        int[] freq1 = new int[26];
        int[] winFreq = new int[26];

        for(int i = 0; i < s1.length(); i++){
            freq1[s1.charAt(i) - 'a']++;
            winFreq[s2.charAt(i) - 'a']++;
        }

        for(int i = s1.length(); i < s2.length(); i++){
            if(Arrays.equals(freq1, winFreq)) return true;
            winFreq[s2.charAt(i)-'a']++; // add new char  from s2
            winFreq[s2.charAt(i-s1.length())-'a']--; // remove old char
        }

        return Arrays.equals(freq1, winFreq);
    }
}
