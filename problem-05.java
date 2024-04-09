//2073. Time Needed to Buy Tickets

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        //completely mine soln
        int n=tickets.length;
        int i=0;
        int count=0;

        while(tickets[k]!=0){
            if(tickets[i]>0){
                tickets[i]--;
                count++;
            }
            i++;
            i=i%n;
        }

        return count;
    }
}