class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        // code here
        HashSet<Integer> hs  = new HashSet<>();
        for(int i:a){
            hs.add(i);
        }
        int i=0;
        ArrayList<Integer> res = new ArrayList<>();
        while(!hs.isEmpty()&&i<b.length){
            if(hs.contains(b[i])) {
                res.add(b[i]);
                hs.remove(b[i]);
            }
            i++;
        }
        return res;
    }
}
