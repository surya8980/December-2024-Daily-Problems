class Solution {
    public boolean isvalid(int [] nums,int start,int end){
        for(int i=start;i<end;i++){
            if(nums[i]>>1==nums[i+1]>>1)return false;
        }
        return true;
    }
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean [] arr = new boolean[queries.length];
        int i=0;
        for(int [] row: queries){
            int start = row[0];
            int end = row[1];
            if(isvalid(nums,start,end)){
                arr[i]=true;
                i++;
            } 
            else {
                arr[i]=false;
                i++;
            }
        }
        return arr;
    }
}
