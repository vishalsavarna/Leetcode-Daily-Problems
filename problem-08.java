//42. Trapping Rain Water

class Solution {
    public int trap(int[] height) {
        //Naive soln - SC=O(n), TC=O(n)
        //Taken inspiration from NeetCode(logic only)
        int n = height.length;
        int maxLeft[] = new int[n];
        int maxRight[] = new int[n];

        int max=0;
        for(int i=0;i<n;i++){
            maxLeft[i]=max;
            if(max<height[i]) max=height[i];
        }

        max=0;
        for(int i=n-1;i>=0;i--){
            maxRight[i]=max;
            if(max<height[i]) max=height[i];
        }

        int area=0;
        for(int i=0;i<n;i++){
            int temp = Math.min(maxLeft[i],maxRight[i]) - height[i];
            if(temp>0) area=area+temp;

        }

        return area;
    }
}
