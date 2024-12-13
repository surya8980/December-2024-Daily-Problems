class Solution {
    public int findMin(int[] arr) {
        // complete the function here
        int n = arr.length, st = 0, en = n - 1;
        
        while (st < en) {
            if (arr[st] < arr[en])        
                return arr[st];
               
            int mid = st + (en - st) / 2;
            
            if (arr[en] < arr[mid]) {
                st = mid + 1;
            } else {
                en = mid;
            }
        }
        
        return arr[st];
    }
}
