package Recursion;

public class removeduplicatesinstring {
    public static void main(String[] args) {
        
    }
    public static void RemoveDuplicates(String s, int idx, StringBuilder newStr, boolean map[]){
        // base case
        if(idx == s.length()) System.out.println(newStr);

        // Processing
        char currChar = s.charAt(idx);
        // Rec
        if(map[currChar-'a'] == true){
            // duplicate
            RemoveDuplicates(s, idx+1, newStr, map);
        }
        else{
            // no duplicate of currChar
            map[currChar-'a'] = true;
            RemoveDuplicates(s, idx+1, newStr.append(currChar), map);
        }
    }
}
