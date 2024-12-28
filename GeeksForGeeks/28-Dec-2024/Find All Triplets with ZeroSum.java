class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        List<List<Integer>> al = new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer> ls = new ArrayList<>();
                        ls.add(i);
                        ls.add(j);
                        ls.add(k);
                        al.add(ls);
                    }
                }
            }
        }
        return al;
    }
}
