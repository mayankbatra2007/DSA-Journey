package Arrays;

public class passbyrefarray {
    public static void main(String[] args) {
        int marks[] = {1,2,3};

        update(marks); // pass by ref

        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
    }
    public static void update(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i] += 1;
        }
    }
}
