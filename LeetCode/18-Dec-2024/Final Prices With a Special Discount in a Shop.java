class Solution {
    public int[] finalPrices(int[] prices) {
        int [] pre = new int[prices.length];
        int n = prices.length;
        int i=0;
        while(i<n-1){
        for(int j=i+1;j<n;j++){
            if(prices[j]<=prices[i]) {
                pre[i]=prices[j];
                break;
            }
        }
        i++;
        }
        pre[n-1]=0;
        int [] res = new int[n];
        for(int m=0;m<n;m++){
            res[m]= prices[m]-pre[m];
        }
        return res;
    }
}
