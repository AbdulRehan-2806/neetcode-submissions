class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxarea = 0;
        int left = 0 , right = n-1;
        while(left<right)
        {
            maxarea = Math.max(maxarea, (right-left)*Math.min(heights[left],heights[right]));
            if(heights[left]<heights[right]) left++;
            else right--;
        }
        return maxarea;
    }
}
