package Operators.PS;
// What will be the output of the following programs :
public class q2 {
    public static void main(String[] args) {
        int x = 200, y = 50, z = 100;
        if(x > y && y > z){
            System.out.println("Hello");
        }
        if(z > y && z < x){
            System.out.println("Java"); // only this
        }
        if((y+200) < x && (y+150) < z){
            System.out.println("hello java");
        }
    }
}
