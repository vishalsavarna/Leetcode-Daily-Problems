//1002. Find Common Characters

class Solution {
    public List<String> commonChars(String[] words) {
        //Taken idea from Lsolution, but code is completely mine, and shortest also.
        ArrayList<String> list = new ArrayList<>();
        int freq[] = new int[26];

        //reference frequency array
        for(int i=0;i<words[0].length();i++){
            freq[words[0].charAt(i)-'a']++;
        }

        //updating the ref freq array, by going through each temp freq array.
        //basically, we are taking the intersection of all freq arrays.
        for(int i=0;i<words.length;i++){
            int tempFreq[] = new int[26];
            for(int j=0;j<words[i].length();j++){
                tempFreq[words[i].charAt(j)-'a']++;
            }

            for(int k=0;k<26;k++){
                //Taking intersection of temp freq and ref(original) freq
                freq[k]=Math.min(freq[k],tempFreq[k]);
            }
        }

        //adding non zero characters to the list 
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                char ch = (char)('a'+i); //VeryImp step
                String temp = ""+ch;
                while(freq[i]!=0){
                    list.add(temp);
                    freq[i]--;
                } 
            }
        }

        return list;


    }
}
