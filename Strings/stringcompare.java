package Strings;
// == vs .equals()
public class stringcompare {
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1 == s2){ // compare ref
            System.out.println("Equal"); // this will print
        }
        else{
            System.out.println("Not Equal");
        }

        if(s1.equals(s2)){ // compare content
            System.out.println("Equal"); // this will print
        }
        else{
            System.out.println("Not Equal");
        }

        if(s1.equals(s3)){ // compare content
            System.out.println("Equal"); // this will print
        }
        else{
            System.out.println("Not Equal"); 
        }

        if(s1 == (s3)){ // compare ref
            System.out.println("Equal"); 
        }
        else{
            System.out.println("Not Equal"); // this will print
        }
    }
}
