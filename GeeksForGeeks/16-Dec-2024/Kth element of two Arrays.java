class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:a){
            pq.add(i);
        }
        for(int i:b){
            pq.add(i);
        }
        while(k>1){
            pq.poll();
            k--;
        }
        return pq.peek();
    }
}
