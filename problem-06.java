//950. Reveal Cards In Increasing Order

import java.util.*;

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        //Mine code
        //taken little help from Leetcodesolution(LS)
        Queue<Integer> q = new LinkedList<>();
        int n=deck.length;
        int res[] = new int[n];
        Arrays.sort(deck);

        for(int i=0;i<n;i++) q.offer(i);
        //System.out.println(q);

        int i=0;
    
        while(!q.isEmpty()){
            res[q.poll()] = deck[i++]; 
            if(!q.isEmpty()) q.offer(q.poll()); 
            //can't use .poll() twice bcz it might be the case that q is empty.
            //so, we we have to check if q is empty.
        }

        return res;


    }
}
