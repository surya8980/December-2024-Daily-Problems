class Solution {
    public int maxChunksToSorted(int[] arr) {
        //find the farthest minimum to right side of each element
        //so from the current position to that minimum element is considered as a chunk
        int chunk=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(arr[i],max);
            if(max==i)chunk++;
        }
        return chunk;
    }
}
