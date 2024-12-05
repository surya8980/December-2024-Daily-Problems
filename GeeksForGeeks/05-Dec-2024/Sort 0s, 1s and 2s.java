class Solution{
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i:arr){
            if(i==1)count1++;
            else if(i==0)count0++;
            else count2++;
        }
        int i=0;
        while(count0>0){
            arr[i]=0;
            count0--;
            i++;
        }
        while(count1>0){
            arr[i]=1;
            count1--;
            i++;
        }
        while(count2>0){
            arr[i]=2;
            count2--;
            i++;
        } 
    }
}
