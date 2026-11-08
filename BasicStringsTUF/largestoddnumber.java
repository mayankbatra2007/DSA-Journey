package BasicStringsTUF;

public class largestoddnumber {
    public static void main(String[] args) {
        
    }
    public String largestOddNumber(String s){
        for(int i = s.length()-1; i >= 0; i--){
            if((s.charAt(i)-'0') % 2 != 0){
                String ans =  s.substring(0, i+1);
                return ans.replaceFirst("^0+", "");
            }
        }
        return "";
    }
}
