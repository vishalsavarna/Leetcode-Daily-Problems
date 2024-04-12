//42. Trapping Rain Water

//*************************@@@@@@@@Optimal Soln@@@@@@@@@@********************************

class Solution {
    public int trap(int[] height) {
        //optimal soln - SC=O(1), TC=O(n)
        //Two Pointer Approach
        //Taken inspiration from NeetCode(logic only)
        //Mine code (taken gpt help)
        int n = height.length;
        int maxLeft = 0;
        int maxRight = 0;
        int left = 0;
        int right = n - 1;

        int area = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    area += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    area += maxRight - height[right];
                }
                right--;
            }
        }

        return area;
    }
}




//*************************@@@@@@@@Naive Soln@@@@@@@@@@********************************

// class Solution {
//     public int trap(int[] height) {
//         //Naive soln - SC=O(n), TC=O(n)
//         //Taken inspiration from NeetCode(logic only)
//         int n = height.length;
//         int maxLeft[] = new int[n];
//         int maxRight[] = new int[n];

//         int max=0;
//         for(int i=0;i<n;i++){
//             maxLeft[i]=max;
//             if(max<height[i]) max=height[i];
//         }

//         max=0;
//         for(int i=n-1;i>=0;i--){
//             maxRight[i]=max;
//             if(max<height[i]) max=height[i];
//         }

//         int area=0;
//         for(int i=0;i<n;i++){
//             int temp = Math.min(maxLeft[i],maxRight[i]) - height[i];
//             if(temp>0) area=area+temp;

//         }

//         return area;
//     }
// }
