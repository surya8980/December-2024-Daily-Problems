class Solution {
    int search(int[] arr, int key) {
        // Complete this function
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==key){
        //         return i;
        //     }
        // }
        // return -1;
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        int target=key;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else {
                // right sorted
                if (arr[mid] <= arr[high]) {
                    if (arr[mid] <= target && target <= arr[high]) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                } else if (arr[low] <= arr[mid]) {
                    if (arr[low] <= target && target <= arr[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
        return ans;
    }
}
