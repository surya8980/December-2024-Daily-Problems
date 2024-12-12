class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n = arr.length;
        int left=0,right=n-1,first=-1,last=-1;
	    while(left<=right){
	        int mid = left + (right-left)/2;
	        if(arr[mid]==target){
	            first=mid;
	            right=mid-1;
	        }
	        else if(arr[mid]>target)
	        right=mid-1;
	        else left=mid+1;
	    }
	    if(first==-1) return 0;
	    left=0;
	    right=n-1; //re-assigning left and right values
	    while(left<=right){
	       int  mid = left + (right-left)/2;
	        if(arr[mid]==target){
	            last=mid;
	            left=mid+1;
	        }
	        else if(arr[mid]<target)
	        left=mid+1;
	        else right=mid-1;
	    }
	    return last-first+1;
    }
}
