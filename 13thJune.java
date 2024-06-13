//2037. Minimum Number of Moves to Seat Everyone

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        //LalluProb
        //But why this soln is working, go one level deeper by changing testcases by yourself
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves[] = new int[seats.length];

        //
        for(int i=0;i<seats.length;i++){
            moves[i]=Math.abs(seats[i]-students[i]);
        }

        int count=0;
        for(int i=0;i<seats.length;i++){
            count+=moves[i];
        }

        return count;
    }
}
