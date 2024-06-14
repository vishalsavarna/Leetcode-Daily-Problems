//945. Minimum Increment to Make Array Unique

class Solution {
    public int minIncrementForUnique(int[] nums) {
        //Mine soln
        //Better soln
        //without using while loop (directly incrementing)
        Arrays.sort(nums);
        int count=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]<=nums[i-1]){
                int inc=nums[i-1]-nums[i]+1;
                nums[i]=nums[i]+inc;
                count=count+inc;
            }
        }

        return count;
        
    }
}
