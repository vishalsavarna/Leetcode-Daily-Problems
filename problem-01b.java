//Word Search

class Solution {
    public boolean exist(char[][] board, String word) {
        //taken help from again Fraz
        int m = board.length;
        int n = board[0].length;

        //this method is called bruteforce, bcz we are going to each cell.
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    if(helper(i,j,m,n,board,word,0)) return true;
                }
            }
        }

        return false; //dummy return

    }
    
    public boolean helper(int i, int j, int m, int n, char[][] board, String word, int k){
        //k denoting the which character of the word I am pointing to
        if(k==word.length()) return true;

        if(i<0 || j<0 || i==m || j==n || board[i][j]!=word.charAt(k)) return false;

        char ch = board[i][j];
        board[i][j]='#';

        boolean option1 = helper(i+1, j, m, n, board, word, k+1);
        boolean option2 = helper(i-1, j, m, n, board, word, k+1);
        boolean option3 = helper(i, j+1, m, n, board, word, k+1);
        boolean option4 = helper(i, j-1, m, n, board, word, k+1);

        board[i][j]=ch;

        return option1 || option2 || option3 || option4;
    }
}