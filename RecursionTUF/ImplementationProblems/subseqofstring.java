package RecursionTUF.ImplementationProblems;
import java.util.*;
public class subseqofstring {
    public static void main(String[] args) {
        
    }
    public static List<String> powerSet(String s){
        List<String> ans = new ArrayList<>();
        StringBuilder out = new StringBuilder();
        int i = 0;

        getAllSubSeq(s, i, out, ans);
        Collections.sort(ans);
        return ans;
    }
    public static void getAllSubSeq(String s, int i, StringBuilder out, List<String> ans){
        // bc
        if(i >= s.length()){ // subseq ready h
            String subseq = out.toString();
            ans.add(subseq);
            return;
        }
        // solve 1 case -> Inc / Exc pattern
        // inc
        char ch = s.charAt(i);
        // inc
        out.append(ch);
        getAllSubSeq(s, i+1, out, ans);
        // exc
        out.deleteCharAt(out.length()-1);
        getAllSubSeq(s, i+1, out, ans);
    }
}
