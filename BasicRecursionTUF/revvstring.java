package BasicRecursionTUF;

import java.util.ArrayList;

public class revvstring {
    public static void main(String[] args) {
        
    }
    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        //your code goes here
        int st = 0;
        int e = s.size()-1;
        ArrayList<Character> r= rev(s, st, e);
        return r;
    }
    public ArrayList<Character> rev(ArrayList<Character> s, int st , int e){
        if(st >= e) return s;

        char ch = s.get(st);
        s.set(st, s.get(e));
        s.set(e, ch);

        return rev(s, st+1, e-1);
    }
}
