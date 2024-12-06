class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int count=0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i:banned){
            hs.add(i);
        }
        int sum=0;
        for(int i=1;i<=n;i++){
            if(!hs.contains(i)&&(sum+i<=maxSum)){
                count++;
                sum+=i;
            }
        }
        return count;
    }
}
