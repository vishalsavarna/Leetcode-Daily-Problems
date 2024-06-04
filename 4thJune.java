//409. Longest Palindrome

class Solution {
    public int longestPalindrome(String s) {
        //Completely Mine(bcz of one imp test case failed, taken help from ChatGPT)
        int freq[] = new int[52];
        for(char x : s.toCharArray()){
            if(x>='a' && x<='z') freq[x-'a']++;
            else if(x>='A' && x<='Z') freq[x-'A'+26]++; 
            else continue;
        }

        int count=0;
        int maxOdd=0;
        int flag=1;

        for(int x : freq){
            if(x!=0 && x%2==0) count+=x;

            if(x%2!=0){
                count+=x-1;
                if(flag!=0){
                    count++;
                    flag--;
                }
            } 
        }

        count+=maxOdd;
        return count;
    }
}
