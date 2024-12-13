class Pair{
    int num;
    int index;
    Pair(int num, int index){
        this.num=num;
        this.index=index;
    }
}
class Solution {
    public long findScore(int[] nums) {
        long sum=0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((Pair a,Pair b)->{
            if(a.num!=b.num) return a.num-b.num;
            else return a.index-b.index;
        });
        //add all elements  to pq
        for(int i=0;i<nums.length;i++){
            pq.add(new Pair(nums[i],i));
        }
        int []marked = new int[nums.length];
        while(!pq.isEmpty()){
            int val = pq.peek().num;
            int ind = pq.peek().index;
            pq.poll();
            if(marked[ind]==1)continue;
            sum+=val;
            marked[ind]=1;
            if(ind+1<nums.length) marked[ind+1]=1;
            if(ind-1>=0) marked[ind-1]=1;
            
        }
        return sum;
    }
}
