package Arrays;

public class trappingrainwater {
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        int h = trappingRainWater(height);
        System.out.println(h);
    }
    public static int trappingRainWater(int height[]){
        // cal left max boundary
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1; i < height.length; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // cal right max boundary
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        // loop
        for(int i = 0; i < height.length; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
        // water level = min(leftmaxB, rightmaxB);
        // trapped water = waterlevel - height[i]
    }
}
