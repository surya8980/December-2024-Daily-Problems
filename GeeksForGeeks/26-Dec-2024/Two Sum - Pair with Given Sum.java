class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        for(int i:arr){
            if(!hs.contains(i))hs.add(target-i);
            else return true;
        }
        return false;
    }
}
