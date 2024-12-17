class Solution {
    public static boolean canweplace(int [] stalls, int dist,int cows){
        int last= stalls[0];
        int cowscount=1;
        for(int i=1;i<stalls.length;i++ ){
            if(stalls[i]-last>=dist){
                cowscount++;
                last=stalls[i];
            }
            if(cowscount>=cows)return true;
        }
        return false;
    }
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        int n = stalls.length;
        Arrays.sort(stalls);
        int limit = stalls[n - 1] - stalls[0];
        for (int i = 1; i <= limit; i++) {
            if (canweplace(stalls, i, k) == false) {
                return (i - 1);
            }
        }
        return limit;
    }
}
