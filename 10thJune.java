//1051. Height Checker

class Solution {
    public int heightChecker(int[] heights) {
        //Mine soln
        int n=heights.length;
        int expected[] = new int[n];
        for(int i=0;i<n;i++){
            expected[i]=heights[i];
        }
        Arrays.sort(expected);

        //comparing both expected and heights array
        int count=0;
        for(int i=0;i<n;i++){
            if(heights[i]!=expected[i]) count++;
        }
        return count;
    }
}
