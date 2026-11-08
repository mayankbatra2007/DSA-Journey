package Strings;

public class stringcompression {
    public static void main(String[] args) {
        System.out.println(compress("aaabbcccdddd"));
    }
    public static String compress(String str){
        String news = "";

        for(int i = 0; i < str.length(); i++){
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            news += str.charAt(i);
            if(count > 1){
                news += count.toString();
            }
        }
        return news;
    }  // tc -> O(N)
}
