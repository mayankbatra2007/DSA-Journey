package Arrays;

public class linearsearch {
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10,12,14,16};

        int key = 20;

        int idx = linearSearch(nums, key);

        if(idx == -1) System.out.println("Not found");
        else{
            System.out.println("Found");
        }
    }
    public static int linearSearch(int nums[], int key){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == key){
                return i;
            }
        }
        return -1;
    }
}
