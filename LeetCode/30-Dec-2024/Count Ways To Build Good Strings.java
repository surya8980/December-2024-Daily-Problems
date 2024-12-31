class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int mod=1000000007;
        int dp[]=new int[100005];
        dp[zero]++;
        dp[one]++;
        for(int i=Math.min(zero,one);i<=high;i++){
		// count how many strings are possible of length i, by appending zero and one.
            if(i-zero>=0){
                dp[i]=(dp[i]+dp[i-zero])%mod;
            }
            if(i-one>=0){
                dp[i]=(dp[i]+dp[i-one])%mod;
            }
        }
        long res=0;
        for(int i=low;i<=high;i++){
            res=(res+dp[i])%mod;
        }
        return (int)res;
    }
}
