//404. Sum of Left Leaves

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        //Completely mine soln
        if(root==null) return 0;
        int arr[] = new int[1];

        helper(root,arr);
        return arr[0];

    }

    public void helper(TreeNode node, int arr[]){
        if(node==null) return;
        if(node.left!=null){
            //arr[0]+=node.left.val;
            if(node.left.left==null && node.left.right==null) arr[0]+=node.left.val;
            else helper(node.left,arr);
        }

        if(node.right!=null){
            helper(node.right,arr);
        }
    }
}
