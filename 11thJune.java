//1122. Relative Sort Array

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        //Mine BF soln(Iguess)

        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<arr2.length;i++){
            hmap.put(arr2[i],i);
        }

        ArrayList<Integer> appeared = new ArrayList<>();
        ArrayList<Integer> unappeared = new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            if(hmap.containsKey(arr1[i])) appeared.add(arr1[i]);
            else unappeared.add(arr1[i]);
        }

        //sorting the unappeared elements in ascending order
        Collections.sort(unappeared);

        int app[] = new int[appeared.size()];
        for(int i=0;i<appeared.size();i++){
            app[i]=appeared.get(i);
        }

        //selection sort modified for appeared array sorting using hashmap
        for(int i=0;i<app.length-1;i++){
            int min=i;
            for(int j=i+1;j<app.length;j++){
                if(hmap.get(app[j])<hmap.get(app[min])) min=j;
            }
            //swap
            int temp=app[min];
            app[min]=app[i];
            app[i]=temp;
        }

        
        int result[] = new int[arr1.length];
        int k=0;
        for(int i=0;i<arr1.length;i++){
            if(i<app.length) result[i]=app[i];
            else{
                result[i]=unappeared.get(k);
                k++;
            } 
        }

        return result;


    }
}
