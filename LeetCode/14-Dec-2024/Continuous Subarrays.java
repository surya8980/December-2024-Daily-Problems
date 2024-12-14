class Solution {
    public long continuousSubarrays(int[] nums) {
        //use a hashmap and store the frequencies and to track the minimum and maximum
        TreeMap<Integer,Integer> hm = new TreeMap<>();
        int n = nums.length;
        long count=0;
        int right=0;
        int left=0;
        while(right<n){
            hm.put(nums[right],hm.getOrDefault(nums[right],0)+1);
            //if window violates remove the left and count the subarrays
            while(Math.abs(hm.lastEntry().getKey()-hm.firstEntry().getKey())>2){
                hm.put(nums[left],hm.get(nums[left])-1);
                if(hm.get(nums[left])==0) hm.remove(nums[left]);
                left++;
            }
            count+= right-left+1;
            right++;
        }
        return count;
    }
}
