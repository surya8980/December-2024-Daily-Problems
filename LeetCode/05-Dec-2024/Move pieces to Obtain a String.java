class Solution {
    public boolean canChange(String start, String target) {
        int i =0;
        int j=0;
        int n=start.length();
        while(j<n||i<n){
            while(i<n&&start.charAt(i)=='_')i++;
            while(j<n&&target.charAt(j)=='_')j++;
            if(i==n||j==n)return (i==n&&j==n);
            if(
                (start.charAt(i)=='L'&&i<j)||(start.charAt(i)!=target.charAt(j))||(start.charAt(i)=='R')&&i>j)
                {
                    return false;
                } 
            i++;
            j++;
        }
        return true;
    }
}
