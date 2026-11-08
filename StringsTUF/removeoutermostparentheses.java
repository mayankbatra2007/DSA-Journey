package StringsTUF;

public class removeoutermostparentheses {
    public static void main(String[] args) {
        
    }
    public String removeOuterParentheses(String s){
        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(count != 0){
                    sb.append(ch);
                }
                count++;
            }
            else{ // ')'
                count--;
                if(count != 0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
// tc -> O(N)
// sc -> O(N)
