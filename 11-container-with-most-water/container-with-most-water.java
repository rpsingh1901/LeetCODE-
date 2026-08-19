class Solution {
    public int maxArea(int[] height) {
        int low = 0;
        int high = height.length - 1;
        int maxArea = 0;
        while (low < high) {
            int width = high- low;
            int min = Math.min(height[low], height[high]);
            int currentArea = width * min;
            maxArea=Math.max(maxArea,currentArea);
            if (height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }

        }
        return maxArea;

    }
}