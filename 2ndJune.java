//344. Reverse String

class Solution {
    public void reverseString(char[] s) {
        //mine soln of reversing array in O(1) space
        int low=0;
        int high=s.length-1;
        while(low<high){
            char temp=s[low];
            s[low]=s[high];
            s[high]=temp;
            low++;
            high--;
        }
    }
}
