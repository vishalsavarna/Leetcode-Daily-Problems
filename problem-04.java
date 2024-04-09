//1700. No of students unable to eat lunch. 

import java.util.*;
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        //Mine soln completely
        
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        int n=students.length;

        for(int i=0;i<n;i++){
            q.add(students[i]);
        }

        for(int i=n-1;i>=0;i--){
            st.push(sandwiches[i]);
        }

        int count=0;

        while(!st.isEmpty() && count<=n){ //count!=9 would have also worked.
            int k=q.peek();
            if(k==st.peek()){
                q.poll();
                st.pop();
                count=0;
            }
            else{
                q.poll();
                q.offer(k);
                count++;
            }
        }

        return q.size(); 
        //st.size() would have also worked, bcz the no of students and sandwiches are same.


    }
}
