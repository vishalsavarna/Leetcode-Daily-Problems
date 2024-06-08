//523. Continuous Subarray Sum

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        //Taken help from Editorial
        //Optimal
        int prefixMod=0;
        HashMap<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,-1);
        for(int i=0;i<nums.length;i++){
            prefixMod=(prefixMod+nums[i])%k;
            if(hmap.containsKey(prefixMod)){
                if(i-hmap.get(prefixMod)>1) return true;
            }
            else hmap.put(prefixMod,i);
        }

        return false;
    }
}
