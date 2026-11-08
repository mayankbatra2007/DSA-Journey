package Strings;

public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch ='a' ; ch <= 'z'; ch++){
            sb.append(ch);
        } // tc -> O(26)
        System.out.println(sb);
    }
}
