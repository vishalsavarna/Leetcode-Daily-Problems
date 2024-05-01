//2000. Reverse Prefix of Word

class Solution {
    public String reversePrefix(String word, char ch) {
        //using the stringBuilder class
        //Optimal soln
        //there can be other many different possible ways to write this algo.

        //int n=word.length();
        int index=word.indexOf(ch);

        //The reverse() method is not available for the result of substring(), which returns a String object, not a StringBuilder. You need to convert the String to a StringBuilder before calling reverse() on it.
        
        StringBuilder rev= new StringBuilder(word.substring(0,index+1)).reverse();
        String rest= word.substring(index+1);


        return rev.toString().concat(rest);
    }
}

/*
class Solution {
    public String reversePrefix(String word, char ch) {
        //using the string class
        //not an optimal soln ig
        int n=word.length();
        int index=word.indexOf(ch);
        
        String rev="";
        for(int i=0;i<=index;i++){
            rev=word.charAt(i)+rev;
        }

        String ans = rev;
        for(int i=index+1;i<n;i++){
            ans=ans+word.charAt(i);
        }

        return ans;
    }
}
*/
