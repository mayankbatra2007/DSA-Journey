package Strings;

public class substrings {
    public static void main(String[] args) {
        String s = "helloworld";
        String s_r = subStr(s, 3, 5);
        System.out.println(s_r);

        System.out.println(s.substring(3, 5));
    }
    public static String subStr(String s, int si, int ei){
        String subs = "";
        for(int i = si; i < ei;  i++){
            subs += s.charAt(i);
        }
        return subs;
    }
}
