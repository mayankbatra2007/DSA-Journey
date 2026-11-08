package Strings;

public class charatmethod {
    public static void main(String[] args) {
        // charAt(idx)
        String name = "mayank";
        System.out.println(name.charAt(1)); // a

        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
}
