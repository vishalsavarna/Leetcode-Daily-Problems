//Make The String Great

import java.util.*;
class Solution {
    public String makeGood(String s) {
        //Mine soln
        //slightly inspired from leetcode soln,
        //1) we need to use stack for this problem
        //2) we can abstrain from writing multiple conditions by just using Math.abs() method.
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            if(!stack.isEmpty() && Math.abs(s.charAt(i)-stack.peek())==32){
                stack.pop();
            }
            else stack.push(s.charAt(i));
        }

        String result = "";

        while(!stack.isEmpty()){
            char ch = stack.pop();
            result = ch + result;
        }

        return result;
    }
}