class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {

            // Calculate width
            int width = right - left;

            // Find the smaller height
            int minHeight = Math.min(height[left], height[right]);

            // Calculate current area
            int area = width * minHeight;

            // Update maximum area
            maxArea = Math.max(maxArea, area);

            // Move the pointer with the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}