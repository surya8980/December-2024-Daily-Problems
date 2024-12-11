class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n=a.length;
        int m = b.length;
        int arr []= new int[m+n];
        for(int i=0;i<n;i++){
            arr[i]=a[i];
        }
        for(int i=0;i<m;i++){
            arr[i+n]=b[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            a[i]=arr[i];
        }
        for(int i=0;i<m;i++){
            b[i]=arr[i+n];
        }
    }
}
