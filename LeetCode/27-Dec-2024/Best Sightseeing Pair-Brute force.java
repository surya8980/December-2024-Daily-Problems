class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<values.length-1;i++){
            for(int j=i+1;j<values.length;j++){
                int val = values[i] + values[j] + i - j;
                max=Math.max(val,max);
            }
        }
        return max;
    }
}
