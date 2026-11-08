package Strings;

public class lowertouppercase {
    public static void main(String[] args) {
        String s1 = "hi, i am mayank";
        String r = toUppercase(s1);
        System.out.println(r);
    }
    public static String toUppercase(String s){
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(s.charAt(0));
        sb.append(ch);

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == ' ' && i < s.length()-1){
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
