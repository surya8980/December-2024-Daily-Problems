class Solution {
    public int f(int i,int[]nums,int target,int[][]dp){
        if(i==0){
            if(target==0&&nums[0]==0) return 2;
            if(target==0||nums[0]==target) return 1;
            return 0;
        }
        if(dp[i][target]!=-1){
            return dp[i][target];
        }
        int nottake = f(i-1,nums,target,dp);
        int take =0;
        if(nums[i]<=target){
            take = f(i-1,nums,target-nums[i],dp);
        }
        return dp[i][target]=(take+nottake);
    }
    public int findTargetSumWays(int[] nums, int target) {
        int n=nums.length;
        int totSum=0;
        for(int i=0;i<n;i++){
            totSum+=nums[i];
        }
        if (totSum - target < 0)
            return 0;
        if ((totSum - target) % 2 == 1)
            return 0;
        int s2 = (totSum - target) / 2;
        int dp[][]=new int[n][s2+1];
	    for(int []row:dp){
	        Arrays.fill(row,-1);
	    }
	     return f(n-1,nums,s2,dp);
    }
}
