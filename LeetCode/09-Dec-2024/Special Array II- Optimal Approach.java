class Solution {
    private boolean isfound(int start,int end,ArrayList<Integer> al){
        int left = 0;
        int right = al.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int ind = al.get(mid);
            if (ind < start) {
                left = mid + 1;
            } else if (ind > end) {
                right = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean [] arr = new boolean[queries.length];
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 == nums[i - 1] % 2) {
                al.add(i);
            }
        }
        int i=0;
        for(int [] row: queries){
            int start = row[0];
            int end = row[1];
            if(isfound(start+1,end,al)){
                arr[i]=false;
                i++;
            } 
            else {
                arr[i]=true;
                i++;
            }
        }
        return arr;
    }
}
