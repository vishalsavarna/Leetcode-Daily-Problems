//Flood Fill Algo

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        //soln understood from lead coding by Fraz.
        int m=image.length;
        int n=image[0].length;
        int oldColor=image[sr][sc];
        int newColor=color;

        if(oldColor==newColor) return image;

        helper(sr, sc, image, oldColor, newColor, m, n);

        return image;
    }

    public void helper(int i, int j, int image[][], int oldColor, int newColor, int m, int n){
        //if newcolor == oldcolor then we might go into infinite loop->Runtime Error(Stack overflow)
        //we have covered that case above, by simply returning the image when both are same.
        if(i<0 || j<0 || i==m || j==n || image[i][j]!=oldColor) return ;

        image[i][j]=newColor; 

        helper(i+1,j,image,oldColor,newColor,m,n); //down
        helper(i-1,j,image,oldColor,newColor,m,n); //up
        helper(i,j+1,image,oldColor,newColor,m,n); //right
        helper(i,j-1,image,oldColor,newColor,m,n); //left
    }
}