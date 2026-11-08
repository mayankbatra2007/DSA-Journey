package StringsTUF;

public class maxnestingdepthparentheses {
    public static void main(String[] args) {
        
    }
    public int maxDepth(String s){
        int count = 0;
        int maxCount = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                count++;
                maxCount = Math.max(count, maxCount);
            }
            else if(ch == ')'){
                count--;
            }
        }
        return maxCount;
    }
}
