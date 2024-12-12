class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        Arrays.sort(gifts);
        for(int i:gifts){
            pq.add(i);
        }
        while(k>0){
            int i = pq.poll();
            pq.add((int)Math.sqrt(i));
            k--;
        }
        long sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        return sum;
    }
}
