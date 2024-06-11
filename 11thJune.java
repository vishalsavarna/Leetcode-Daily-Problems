//1122. Relative Sort Array

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        //Better soln(Taken help from Editorial)
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    result.add(arr1[j]);
                    //Mark the element in target array as visited
                    arr1[j]=-1;
                }
            }
        }

        Arrays.sort(arr1);
        //Add the remaining elements to the result array
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=-1) result.add(arr1[i]);
        }

        int finale[] =  new int[result.size()];
        for(int i=0;i<result.size();i++){
            finale[i]=result.get(i);
        }

        return finale;

    }
}
