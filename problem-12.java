//129. Sum Root to Leaf Numbers

class Solution {
    public int sumNumbers(TreeNode root) {
        //Completely mine soln(totally my logic)
        //let's check if it's correct
        int num=0;
        int res=helper(root,num);
        return res;
    }

    public int helper(TreeNode node, int num){
        if(node==null) return 0; 
        //it will be helpful in next iteration, when either left or right is null.

        num=num*10 + node.val;

        if(node.left==null && node.right==null) return num; //base condition

        int l=helper(node.left,num);
        int r=helper(node.right,num);

        return l+r;
    }
}
