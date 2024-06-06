//846. Hand of Straights

class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        //Inspired from Lsoln
        int n=hand.length;
        if(n%groupSize!=0) return false;
        Arrays.sort(hand);

        for(int i=0;i<n;i++){
            if(hand[i]>=0){
                if(!helper(hand,i,n,groupSize)) return false;
            }
        }

        return true;

        
    }

    public boolean helper(int []hand, int i, int n, int k){ //k=groupSize
        int elem=hand[i]+1; //this elem we need to find next
        hand[i]=-1;
        i++;
        int count=1;

        while(count<k && i<n){
            if(hand[i]==elem){
                elem++;
                count++;
                hand[i]=-1;
            }
            i++;
        }

        if(count!=k) return false;
        return true;

    }
}
