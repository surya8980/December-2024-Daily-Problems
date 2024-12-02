class Solution {
    public static int minChar(String s) {
        // Write your code here
        int count =0;
        int i=0;
        int n = s.length();
        int j = n-1;
        int last = j;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else {
                count++;
                i=0;
                j=--last;
            }
        }
        return count;
    }
}
