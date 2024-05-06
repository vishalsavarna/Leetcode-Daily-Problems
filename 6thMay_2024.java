//2487. Remove Nodes From Linked List

class Solution {
    public ListNode removeNodes(ListNode head) {
        //Completely mine soln
        //Not sure if it's optimal
        Stack<Integer> st = new Stack<>();
        st.push(head.val);
        ListNode temp=head;
        temp=temp.next;
        
        while(temp!=null){
            if(!st.isEmpty() && temp.val>st.peek()){
                while(!(st.isEmpty() || temp.val<=st.peek())){
                    st.pop();
                }
            }
            else{
                st.push(temp.val);
                temp=temp.next;
            } 
        }

        ListNode alpha = null;
        ListNode current = null;

        while(!st.isEmpty()){
            //System.out.println(st.pop());
            current = new ListNode(st.pop());
            current.next=alpha;
            alpha = current;
        }

        return current;
    }
}
