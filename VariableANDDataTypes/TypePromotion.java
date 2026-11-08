package VariableANDDataTypes;

public class TypePromotion {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        
        System.out.println((int)(b)); // 98
        System.out.println((int)(a)); // 97
        System.out.println(b-a); // 98-97 = 1
    }
}
