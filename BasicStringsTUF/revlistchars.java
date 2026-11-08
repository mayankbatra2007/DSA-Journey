package BasicStringsTUF;

import java.util.List;

public class revlistchars {
    public static void main(String[] args) {
        
    }
    public void reverseListChars(List<Character> s) {
        int st = 0, e = s.size()-1;
        while(st < e){
            Character t = s.get(st);
            s.set(st, s.get(e));
            s.set(e, t);
            st++;
            e--;
        }
    }
}
