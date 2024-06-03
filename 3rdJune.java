//2486. Append Characters to String to Make Subsequence

class Solution {
    public int appendCharacters(String s, String t) {
        //mine soln
        int n=s.length();
        int m=t.length();
        int right=0;

        for(int i=0;i<n;i++){
            //putting (right<m) at leftmost is must, otherwise "IndexOutOfBoundException"
            if((right<m)&&(t.charAt(right)==s.charAt(i)))  right++;
        }

        return m-right;



    }
}
