//75. Sort Colors

class Solution {
    public void sortColors(int[] nums) {
        //Revision(Optimal soln)
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
        }

        
    }

    public void swap(int []arr, int x, int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

}
