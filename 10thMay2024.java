//786. K-th Smallest Prime Fraction
class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        //Inspired from Pepcoding
        //madarchod question & explanation
        int n=arr.length;
        double low=1.0*arr[0]/arr[n-1];
        double high=1;

        while(low<high){
            double mid=low+(high-low)/2;
            int count[]=helper(arr,mid);
            
            if(count[0]>k) high=mid;
            else if(count[0]<k) low=mid;
            else return new int[]{count[1],count[2]};
        }

        return null;//new int[]{0,0}; //dummy return 

    }

    public int[] helper(int arr[], double target){
        int i=0; 
        int count=0;
        int n=arr.length;
        int num=arr[0];
        int deno=arr[n-1];
        
        

        for(int j=1;j<n;j++){
            while(arr[i]<=arr[j]*target) i++;
            count+=i;

            if(i>0 && arr[i-1]*deno>arr[j]*num){
                num=arr[i-1];
                deno=arr[j];
            }
        
        }

        return new int[]{count,num,deno};
    }
}
