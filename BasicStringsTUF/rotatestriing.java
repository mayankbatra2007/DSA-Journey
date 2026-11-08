package BasicStringsTUF;

public class rotatestriing {
    public static void main(String[] args) {
        
    }
    public boolean rotateString(String s, String goal) {
        //your code goes here
        if(s.length() != goal.length()){
            return false;
        }
        return (s+s).contains(goal);
    }
}
// tc -> O(N) -> contains()
// sc -> O(N) -> s = s
