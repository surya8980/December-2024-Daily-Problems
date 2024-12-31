class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        HashSet<Integer> hm = new HashSet<>();
        for(int it : arr){
            hm.add(it);
        }
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(!hm.contains(arr[i]-1)){
                int count =1;
                int x = arr[i];
                while(hm.contains(x+1)){
                    x=x+1;
                    count++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
